/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.api.OAuth.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adobe.sign.api.OAuthApi;
import com.adobe.sign.model.oAuth.AccessTokenRequest;
import com.adobe.sign.model.oAuth.AccessTokenResponse;
import com.adobe.sign.model.oAuth.AuthorizationRequest;
import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
import com.adobe.sign.model.oAuth.AccessTokenRefreshResponse;
import com.adobe.sign.model.oAuth.Scope;
import com.adobe.sign.model.oAuth.Token;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.GroupUtils;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class OAuthHandler {

  private static final String CODE_KEY = "code";
  private static final String OAUTH_HTML = "oauth.html";
  private static final String CLIENT_ID_KEY = "client_id";
  private static final String REDIRECT_URI_KEY = "redirect_uri";
  private static final String SCOPE_KEY = "scope";
  private static final String CLIENT_SECRET_KEY = "client_secret";
  private static final String PATH_SEPARATOR ="/";
  private static final String QUERY_SEPARATOR = "?";
  private static final String GROUP_CREATED_MESSAGE = "Group ID = ";
  private static final String GROUP_NOT_CREATED_MESSAGE = "Group not created.";
  private static final int BUFFER_ARRAY_SIZE = 0x10000;
  private static final String CONTENT_TYPE_KEY = "Content-Type";
  private static final String CONTENT_TYPE_TEXT_HTML = "text/html";
  private static final String LOCATION_KEY = "Location";
  private static final String FILE_ENCODING_KEY = "file.encoding";
  private static final String SPLIT_KEY_AND = "[&]";
  private static final String SPLIT_KEY_EQUAL = "[=]";
  private static final String SPLIT_KEY_COLON = "[:]";
  private static final String SPLIT_KEY_SPACE = "[ ]";
  private static final String EMPTY_STRING = "";
  private static final String EQUAL_KEY = " = ";
  private static String clientId = "";
  private static String clientSecret = "";
  private static String redirectUri = "";

  /**
   * Handler for /root requests.
   */
  public static class RootHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
      he.getResponseHeaders().set(CONTENT_TYPE_KEY, CONTENT_TYPE_TEXT_HTML);
      he.sendResponseHeaders(200, 0);
      File file = new File(Constants.SERVER_PATH + OAUTH_HTML);
      if (file.exists()) {
        OutputStream os = he.getResponseBody();
        FileInputStream fs = new FileInputStream(file);
        final byte[] buffer = new byte[BUFFER_ARRAY_SIZE];
        int count = 0;
        while ((count = fs.read(buffer)) >= 0) {
          os.write(buffer, 0, count);
        }
        String query = he.getRequestURI().getQuery();
        fs.close();
        os.close();
        if (query != null) {
          HttpServer httpServer = he.getHttpContext().getServer();
          httpServer.stop(0);
        }
      }
    }
  }

  /**
   * Handler for /oAuth requests.
   */
  public static class AuthorizationHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
      he.getResponseHeaders().set(CONTENT_TYPE_KEY, CONTENT_TYPE_TEXT_HTML);
      String query = he.getRequestURI().getQuery();
      Map<String, Object> parameters = new HashMap<String, Object>();
      parseQuery(query,parameters);
      try {
        String redirect = getAuthorizationUrl(parameters);
        clientId = parameters.get(CLIENT_ID_KEY).toString();
        clientSecret = parameters.get(CLIENT_SECRET_KEY).toString();
        redirectUri = parameters.get(REDIRECT_URI_KEY).toString();
        he.getResponseHeaders().set(LOCATION_KEY, redirect);
        he.sendResponseHeaders(301, -1);
      }
      catch (ApiException e){
        ApiUtils.logError(Errors.OAUTH_HANDLER);
      }
    }
  }

  /**,
   * Handler for /redirect requests.
   */
  public static class RedirectUriHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
      // parse request
      he.getResponseHeaders().set(CONTENT_TYPE_KEY,CONTENT_TYPE_TEXT_HTML);
      Map<String, Object> parameters = new HashMap<String, Object>();
      URI requestedUri = he.getRequestURI();
      String query = requestedUri.getRawQuery();
      parseQuery(query, parameters);
      // send response
      String response = EMPTY_STRING;
      String code = null;
      for (String key : parameters.keySet()) {
        response += key + EQUAL_KEY + parameters.get(key) + "\n";
        if(key.equalsIgnoreCase(CODE_KEY.toString()))
          code = parameters.get(key).toString();
      }
      String redirect = EMPTY_STRING;
      try {
        redirect = createGroupWithAuthCode(code);
      }
      catch (ApiException e) {
        ApiUtils.logError(Errors.REDIRECT_HANDLER);
      }

      he.getResponseHeaders().set(LOCATION_KEY, redirect);
      he.sendResponseHeaders(301, -1);
      OutputStream os = he.getResponseBody();
      os.write(response.getBytes());
      os.close();

    }

  }

  /**
   * Parse query and return a map of parameters
   * @param query containing parameters
   * @param parameters Map of key value pairs of parameters
   */
  @SuppressWarnings("unchecked")
  private static void parseQuery(String query, Map<String, Object> parameters) throws UnsupportedEncodingException {

    if (query != null) {
      String pairs[] = query.split(SPLIT_KEY_AND);

      for (String pair : pairs) {
        String param[] = pair.split(SPLIT_KEY_EQUAL);

        String key = null;
        String value = null;
        if (param.length > 0) {
          key = URLDecoder.decode(param[0], System.getProperty(FILE_ENCODING_KEY));
        }

        if (param.length > 1) {
          value = URLDecoder.decode(param[1], System.getProperty(FILE_ENCODING_KEY));
        }

        if (parameters.containsKey(key)) {
          Object obj = parameters.get(key);
          if (obj instanceof List<?>) {
            List<String> values = (List<String>) obj;
            values.add(value);
          } else if (obj instanceof String) {
            List<String> values = new ArrayList<String>();
            values.add((String) obj);
            values.add(value);
            parameters.put(key, values);
          }
        } else {
          parameters.put(key, value);
        }
      }
    }
  }

  /**
   * Returns Authorization Url
   * @param parameters Map containing parameters
   * @throws Exception
   */
  private static String getAuthorizationUrl( Map<String, Object> parameters) throws ApiException {
    OAuthApi oAuthApi = new OAuthApi();
    String clientId = null;
    String redirectUri = null;
    ArrayList<Scope> scopes = new ArrayList<>();
    String state = null;
    String clientSecret = null;;

    for (String key : parameters.keySet()) {
      if(key.equalsIgnoreCase(CLIENT_ID_KEY))
        clientId = parameters.get(key).toString();
      if(key.equalsIgnoreCase(REDIRECT_URI_KEY))
        redirectUri = parameters.get(key).toString();
      if(key.equalsIgnoreCase(SCOPE_KEY)){
        String values = parameters.get(key).toString();
        String[] scopesArray = values.split(SPLIT_KEY_SPACE);
        for(String scope : scopesArray) {
          String pairs[] = scope.split(SPLIT_KEY_COLON);
          String scopeTarget = pairs[0];
          String scopeModifier = pairs[1];
          scopes.add(new Scope(scopeTarget, scopeModifier));
        }
      }
      if(key.equalsIgnoreCase(CLIENT_SECRET_KEY))
        clientSecret = parameters.get(key).toString();
    }
    AuthorizationRequest authorizationInfo = new AuthorizationRequest(clientId,
                                                                redirectUri,
                                                                scopes,
                                                                state,
                                                                Constants.RESPONSE_TYPE);
    String authorizationUrl = oAuthApi.getAuthorizationUrl(authorizationInfo);
    return authorizationUrl;
  }

  /**
   * Create sample group and returns response.
   * @param code auth code required for generating access token
   * returns groupId
   * @throws Exception
   */
  private static String createGroupWithAuthCode(String code) throws ApiException{
    OAuthApi oAuthApi = new OAuthApi();
    String groupId = null;
    //Fetch the access token.
    AccessTokenRequest accessTokenInfo = new AccessTokenRequest(clientId,
                                                          clientSecret,
                                                          redirectUri,
                                                          code,
                                                          Constants.ACCESS_TOKEN_GRANT_TYPE);

    //Access Token should be stored in the encrypted format
    AccessTokenResponse accessTokenResponse = oAuthApi.getAccessToken(accessTokenInfo);

    //Refresh the accessToken
    AccessTokenRefreshRequest refreshedAccessTokenInfo = new AccessTokenRefreshRequest(clientId,
                                                                                     clientSecret,
                                                                                     accessTokenResponse.getRefreshToken(),
                                                                                     Constants.REFRESH_TOKEN_GRANT_TYPE);

    //Refreshed Access Token should be stored in the encrypted format
    AccessTokenRefreshResponse refreshedAccessTokenResponse = oAuthApi.refreshAccessToken(refreshedAccessTokenInfo);

    //Make API call to create a group with access token from the server.
    groupId = GroupUtils.createGroupWithOAuthWorkflow(Constants.GROUP_NAME,
                                                      refreshedAccessTokenResponse.getAccessToken());

    Token token = new Token(refreshedAccessTokenResponse.getAccessToken());
    //Revoke the token
    oAuthApi.revokeToken(token);

    String response = EMPTY_STRING;
    if(groupId != null)
      response = PATH_SEPARATOR + QUERY_SEPARATOR + GROUP_CREATED_MESSAGE + groupId;
    else
      response = GROUP_NOT_CREATED_MESSAGE;
    return response;
  }
}
