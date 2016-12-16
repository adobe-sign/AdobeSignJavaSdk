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
import com.adobe.sign.utils.validator.SearchApiValidator;

import com.adobe.sign.model.search.AgreementAssetEventRequest;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventGetResponse;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:33.916+05:30")
    public class SearchApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public SearchApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Create a search object for agreement asset event . It will return the result for the first page and search Id to fetch results for further pages.
    * The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself. To search for Agreement Asset Events, first make a POST request to the API to create search results with relevant search parameters. Response will be the first page of results along with a search Id param and next page cursor. These can be used to fetch further page results if they are available using the API to retrieve search results
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read widget_read library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementAssetEventRequest Information about the Agreement Asset Events to be generated
    * @return AgreementAssetEventPostResponse
    */
    public AgreementAssetEventPostResponse createAssetEvent (MultivaluedMap headers,
                                        AgreementAssetEventRequest agreementAssetEventRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    SearchApiValidator.createAssetEventValidator(agreementAssetEventRequest);

    //Create path and map variables
    String path = "/search/agreementAssetEvents".replaceAll("\\{format\\}","json");

    Object postBody = agreementAssetEventRequest;
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
    
    TypeRef returnType = new TypeRef<AgreementAssetEventPostResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Return the result for the page which is described inside the Page Cursor Info.
    * The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself. Provide the searchId obtained from the API to create search results request and the next page cursor id from the original call to the API to create search results or a previous call to the API to retrieve search results.
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read widget_read library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param searchId The search object identifier, as returned by the agreementAssetEvent creation API .
    * @param pageCursor Page cursor of the page whose result will be fetched
    * @param pageSize Count of agreement asset events which will be returned in the response. If the pageSize is left blank, then the pageSize which is mentioned while making POST request to /search/agreementAssetEvents will be used. Maximum page size is 500.
    * @return AgreementAssetEventGetResponse
    */
    public AgreementAssetEventGetResponse getAssetEvent (MultivaluedMap headers,
                                        String searchId,
                                        String pageCursor,
                                        Integer pageSize) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    SearchApiValidator.getAssetEventValidator(searchId,pageCursor, pageSize);

    //Create path and map variables
    String path = "/search/agreementAssetEvents/{searchId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "searchId" + "\\}", apiClient.escapeString(searchId.toString()));

    Object postBody = null;
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
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageCursor", pageCursor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<AgreementAssetEventGetResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
