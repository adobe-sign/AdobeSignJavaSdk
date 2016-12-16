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
package com.adobe.sign.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
import com.adobe.sign.model.oAuth.AccessTokenRefreshResponse;
import com.adobe.sign.model.oAuth.AccessTokenRequest;
import com.adobe.sign.model.oAuth.AccessTokenResponse;
import com.adobe.sign.model.oAuth.AuthorizationRequest;
import com.adobe.sign.model.oAuth.Token;
import com.adobe.sign.utils.ApiClient;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.OAuthUtils;
import com.adobe.sign.utils.Pair;
import com.adobe.sign.utils.TypeRef;
import com.adobe.sign.utils.validator.OAuthApiValidator;

public class OAuthApi {
  private ApiClient apiClient;

  public OAuthApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  /**
   * Retrieves the authorization url that will be used to get the authorization code.
   *
   * @param authorizationRequest
   * @return String - The authorization url where the user will be directed to authorize the application.
   * @throws ApiException
   */
  public String getAuthorizationUrl(AuthorizationRequest authorizationRequest) throws ApiException {
    String baseUri = apiClient.getEnvHostName().replace("api","secure");
    String subPath = "public/oauth";

    //Validate Request
    OAuthApiValidator.getAuthorizationUrlValidator(authorizationRequest);

    String baseUrl = baseUri + subPath;
    return OAuthUtils.appendTo(baseUrl, authorizationRequest.getClientId(), authorizationRequest.getRedirectUri(), OAuthUtils.spaceDelimitedSet(authorizationRequest.getScopes()), authorizationRequest.getState(), authorizationRequest.getResponseType());
  }

  /**
   * Retrieves the access token with the required scopes using the authorization code granted during the authorization.
   *
   * @param accessTokenRequest
   * @return AccessTokenResponse
   * @throws ApiException
   */
  public AccessTokenResponse getAccessToken(AccessTokenRequest accessTokenRequest) throws ApiException {

    //Validate Request
    OAuthApiValidator.getAccessTokenValidator(accessTokenRequest);

    //Create path and map variables
    String path = "oauth/token";

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();

    acceptsList.add("application/json");

    contentTypesList.add("application/x-www-form-urlencoded");

    List<Pair> queryParams = new ArrayList<Pair>();

    Map<String, Object> formParams = new HashMap<String, Object>();
    formParams.put("code", accessTokenRequest.getCode());
    formParams.put("client_id", accessTokenRequest.getClientId());
    formParams.put("client_secret", accessTokenRequest.getClientSecret());
    formParams.put("redirect_uri", accessTokenRequest.getRedirectUri());
    formParams.put("grant_type", accessTokenRequest.getGrantType());


    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    TypeRef returnType = new TypeRef<AccessTokenResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, false);
  }

  /**
   * Refreshes the access token.
   *
   * @param accessTokenRefreshRequest
   * @return RefreshedAccessTokenResponse
   * @throws ApiException
   */
  public AccessTokenRefreshResponse refreshAccessToken(AccessTokenRefreshRequest accessTokenRefreshRequest) throws ApiException {

    //Validate Request
    OAuthApiValidator.refreshAccessTokenValidator(accessTokenRefreshRequest);
    //Create path and map variables
    String path = "oauth/refresh";

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();

    acceptsList.add("application/json");

    contentTypesList.add("application/x-www-form-urlencoded");

    List<Pair> queryParams = new ArrayList<Pair>();

    Map<String, Object> formParams = new HashMap<String, Object>();
    formParams.put("refresh_token", accessTokenRefreshRequest.getRefreshToken());
    formParams.put("client_id", accessTokenRefreshRequest.getClientId());
    formParams.put("client_secret",accessTokenRefreshRequest.getClientSecret());
    formParams.put("grant_type", accessTokenRefreshRequest.getGrantType());

    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    TypeRef returnType = new TypeRef<AccessTokenRefreshResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, false);
  }

  /**
   * Revokes the token.
   *
   * @param token Can be an access token or refresh token.
   * @throws ApiException
   */
  public void revokeToken(Token token) throws ApiException {

    //Validate Request
    OAuthApiValidator.revokeTokenValidator(token);

    //Create path and map variables
    String path = "oauth/revoke";

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();

    acceptsList.add("application/json");

    contentTypesList.add("application/x-www-form-urlencoded");

    List<Pair> queryParams = new ArrayList<Pair>();

    Map<String, Object> formParams = new HashMap<String, Object>();
    formParams.put("token", token.getToken());

    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    TypeRef returnType = null;
    apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, false);
  }
}