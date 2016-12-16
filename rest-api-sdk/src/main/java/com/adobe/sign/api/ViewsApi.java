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

import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiClient;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Pair;
import com.adobe.sign.utils.TypeRef;
import com.adobe.sign.utils.validator.ApiValidatorHelper;
import com.adobe.sign.utils.validator.ViewsApiValidator;

import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.model.views.AgreementAssetListRequest;
import com.adobe.sign.model.views.AgreementAssetRequest;
import com.adobe.sign.model.views.TargetViewRequest;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:34.537+05:30")
    public class ViewsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public ViewsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Returns the URL for manage page.
    * This endpoint will return the URL for manage page. If an agreement asset id is given then that agreement asset will be shown selected in the resulted manage page url.The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself. If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_login - If the user wants to generate a URL that will automatically log the user in then this scope is required else any valid scope can be used 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementAssetListRequest Information about the type of url to be generated for Manage Page
    * @return ViewUrl
    */
    public ViewUrl createAgreementAssetListUrl (MultivaluedMap headers,
                                        AgreementAssetListRequest agreementAssetListRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    ViewsApiValidator.createAgreementAssetListUrlValidator(agreementAssetListRequest);

    //Create path and map variables
    String path = "/views/agreementAssetList".replaceAll("\\{format\\}","json");

    Object postBody = agreementAssetListRequest;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Returns the URL which shows the view page of given agreement asset.
    * This endpoint will return the URL of view agreement page for an agreement asset. The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself. If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read - Required when agreementAssetId refers to an agreement widget_read - Required when agreementAssetId refers to a widget library_read - Required when agreementAssetId refers to a library document user_login - In addition to one of the above scopes, this scope is required if the user wants to generate a URL that will automatically log the user in. 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementAssetRequest Information about the type of url to be generated for Agreement Asset Page
    * @return ViewUrl
    */
    public ViewUrl createAgreementAssetUrl (MultivaluedMap headers,
                                        AgreementAssetRequest agreementAssetRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    ViewsApiValidator.createAgreementAssetUrlValidator(agreementAssetRequest);

    //Create path and map variables
    String path = "/views/agreementAssets".replaceAll("\\{format\\}","json");

    Object postBody = agreementAssetRequest;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Returns the URL for settings page.
    * This endpoint will return the URL for Settings Page. The settings page can be of two types - user profile page(for non admin) and account settings page(for admin). If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_login - If the user wants to generate a URL that will automatically log the user in then this scope is required else any valid scope can be used 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param targetViewRequest Information about the type of url to be generated for various Settings page
    * @return ViewUrl
    */
    public ViewUrl createSettingsUrl (MultivaluedMap headers,
                                        TargetViewRequest targetViewRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    ViewsApiValidator.createSettingsUrlValidator(targetViewRequest);

    //Create path and map variables
    String path = "/views/settings".replaceAll("\\{format\\}","json");

    Object postBody = targetViewRequest;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
