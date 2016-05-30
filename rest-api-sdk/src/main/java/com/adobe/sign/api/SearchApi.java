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
import com.adobe.sign.utils.validator.SearchApiValidator;

import com.adobe.sign.model.search.AgreementAssetEventRequest;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventGetResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:00.811+05:30")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Create a search object for agreement asset event . It will return the result for the first page and search Id to fetch results for further pages.
   * The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself. To search for Agreement Asset Events, first make a POST request to POST /search/agreementAssetEvents with relevant search parameters. Response will be the first page of results along with a search Id param and next page cursor. These can be used to fetch further page results if they are  available using the API which retrieves a list of AgreementAssetEvents using a searchId
   * @param accessToken An OAuth Access Token with scopes:agreement_readwidget_readlibrary_read
   * @param agreementAssetEventRequest Information about the Agreement Asset Events to be generated
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return AgreementAssetEventPostResponse
   */
  public AgreementAssetEventPostResponse createAssetEvent (String accessToken,
                                                        AgreementAssetEventRequest agreementAssetEventRequest,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    SearchApiValidator.createAssetEventValidator(accessToken, agreementAssetEventRequest, xApiUser);

    //Create path and map variables
    String path = "/search/agreementAssetEvents".replaceAll("\\{format\\}","json");

    Object postBody = agreementAssetEventRequest;
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
    
    TypeRef returnType = new TypeRef<AgreementAssetEventPostResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Return the result for the page which is described inside the Page Cursor Info.
   * The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself. Provide the searchId obtained from POST /search/agreementAssetEvents request and the next page cursor id from the original call to the API which creates a search object for an agreementAssetEvent or a previous call to the API which retrieves a list of agreementAssetEvents for a searchId.
   * @param accessToken An OAuth Access Token with scopes:agreement_readwidget_readlibrary_read
   * @param searchId The search object identifier, as returned by the agreementAssetEvent creation API .
   * @param pageCursor Page cursor of the page whose result will be fetched
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param pageSize Count of agreement asset events which will be returned in the response. If the pageSize is left blank, then the pageSize which is mentioned while making POST request to /search/agreementAssetEvents will be used. Maximum page size is 500.
   * @return AgreementAssetEventGetResponse
   */
  public AgreementAssetEventGetResponse getAssetEvent (String accessToken,
                                                        String searchId,
                                                        String pageCursor,
                                                        String xApiUser,
                                                        Integer pageSize) throws ApiException {
    //Validate Request
    SearchApiValidator.getAssetEventValidator(accessToken, searchId, pageCursor, xApiUser, pageSize);

    //Create path and map variables
    String path = "/search/agreementAssetEvents/{searchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "searchId" + "\\}", apiClient.escapeString(searchId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageCursor", pageCursor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<AgreementAssetEventGetResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
