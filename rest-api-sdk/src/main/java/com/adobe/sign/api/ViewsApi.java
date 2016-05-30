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
import com.adobe.sign.utils.validator.ViewsApiValidator;

import com.adobe.sign.model.views.AgreementAssetListRequest;
import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.model.views.AgreementAssetRequest;
import com.adobe.sign.model.views.TargetViewRequest;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:01.781+05:30")
public class ViewsApi {
  private ApiClient apiClient;

  public ViewsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Returns the URL for manage page.
   * This endpoint will return the URL for manage page. If an agreement asset id is given then that agreement asset will be shown selected in the resulted manage page url.The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself.                        If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
   * @param accessToken An OAuth Access Token with scopes:user_login - If the user wants to generate a URL that will automatically log the user in then this  scope is required else any valid scope can be used
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param agreementAssetListRequest Information about the type of url to be generated for Manage Page
   * @return ViewUrl
   */
  public ViewUrl createAgreementAssetListUrl (String accessToken,
                                                        String xApiUser,
                                                        AgreementAssetListRequest agreementAssetListRequest) throws ApiException {
    //Validate Request
    ViewsApiValidator.createAgreementAssetListUrlValidator(accessToken, xApiUser, agreementAssetListRequest);

    //Create path and map variables
    String path = "/views/agreementAssetList".replaceAll("\\{format\\}","json");

    Object postBody = agreementAssetListRequest;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Returns the URL which shows the view page of given agreement asset.
   * This endpoint will return the URL of view agreement page for an agreement asset. The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself.                     If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
   * @param accessToken An OAuth Access Token with scopes:agreement_read - Required when agreementAssetId refers to an agreementwidget_read - Required when agreementAssetId refers to a widgetlibrary_read - Required when agreementAssetId refers to a library documentuser_login - In addition to one of the above scopes, this scope is required if the user wants to generate a URL that will automatically log the user in.
   * @param agreementAssetRequest Information about the type of url to be generated for Agreement Asset Page
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return ViewUrl
   */
  public ViewUrl createAgreementAssetUrl (String accessToken,
                                                        AgreementAssetRequest agreementAssetRequest,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    ViewsApiValidator.createAgreementAssetUrlValidator(accessToken, agreementAssetRequest, xApiUser);

    //Create path and map variables
    String path = "/views/agreementAssets".replaceAll("\\{format\\}","json");

    Object postBody = agreementAssetRequest;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Returns the URL for settings page.
   * This endpoint will return the URL for Settings Page. The settings page can be of two types - user profile page(for non admin) and account settings page(for admin). If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
   * @param accessToken An OAuth Access Token with scopes:user_login - If the user wants to generate a URL that will automatically log the user in then this  scope is required else any valid scope can be used
   * @param targetViewRequest Information about the type of url to be generated for various Settings page
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return ViewUrl
   */
  public ViewUrl createSettingsUrl (String accessToken,
                                                        TargetViewRequest targetViewRequest,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    ViewsApiValidator.createSettingsUrlValidator(accessToken, targetViewRequest, xApiUser);

    //Create path and map variables
    String path = "/views/settings".replaceAll("\\{format\\}","json");

    Object postBody = targetViewRequest;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
