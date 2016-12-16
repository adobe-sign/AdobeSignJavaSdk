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
import com.adobe.sign.utils.validator.MegaSignsApiValidator;

import com.adobe.sign.model.megaSigns.MegaSigns;
import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
import com.adobe.sign.model.megaSigns.MegaSignInfo;
import com.adobe.sign.model.megaSigns.MegaSignChildAgreements;
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateResponse;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.898+05:30")
    public class MegaSignsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public MegaSignsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Get all the MegaSign parent agreements of a user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param query The query string used for the search. Multiple search terms can be provided, separated by spaces. Some of the search terms include document name, participant name or company, and form data
    * @return MegaSigns
    */
    public MegaSigns getMegaSigns (MultivaluedMap headers,
                                        String query) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    MegaSignsApiValidator.getMegaSignsValidator(query);

    //Create path and map variables
    String path = "/megaSigns".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<MegaSigns>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Send an agreement out for signature to multiple recipients. Each recipient will receive and sign their own copy of the agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_send 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param megaSignCreationRequest Information about the MegaSign that you want to send.
    * @return MegaSignCreationResponse
    */
    public MegaSignCreationResponse createMegaSign (MultivaluedMap headers,
                                        MegaSignCreationRequest megaSignCreationRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    MegaSignsApiValidator.createMegaSignValidator(megaSignCreationRequest);

    //Create path and map variables
    String path = "/megaSigns".replaceAll("\\{format\\}","json");

    Object postBody = megaSignCreationRequest;
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
    
    TypeRef returnType = new TypeRef<MegaSignCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Get detailed information of the specified MegaSign parent agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
    * @return MegaSignInfo
    */
    public MegaSignInfo getMegaSignInfo (MultivaluedMap headers,
                                        String megaSignId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    MegaSignsApiValidator.getMegaSignInfoValidator(megaSignId);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

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
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<MegaSignInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Get all the child agreements of the specified MegaSign parent agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
    * @return MegaSignChildAgreements
    */
    public MegaSignChildAgreements getMegaSignChildAgreements (MultivaluedMap headers,
                                        String megaSignId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    MegaSignsApiValidator.getMegaSignChildAgreementsValidator(megaSignId);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}/agreements".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

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
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<MegaSignChildAgreements>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves data entered by recipients into interactive form fields at the time they signed the child agreements of the specified MegaSign agreement
    * CSV file stream containing form data information
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    <br>accept(key) Specify media types which are acceptable for the response. Currently only text/csv is supported. 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
    * @return byte[]
    */
    public byte[] getMegaSignFormData (MultivaluedMap headers,
                                        String megaSignId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    MegaSignsApiValidator.getMegaSignFormDataValidator(megaSignId);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}/formData".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("text/csv");
    
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
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, 
    postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
    
    }
    
    /**
    * Cancel all the child agreements of the specified MegaSign agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: agreement_write 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
    * @param megaSignStatusUpdateInfo MegaSign status update information object.
    * @return MegaSignStatusUpdateResponse
    */
    public MegaSignStatusUpdateResponse updateMegaSignStatus (MultivaluedMap headers,
                                        String megaSignId,
                                        MegaSignStatusUpdateInfo megaSignStatusUpdateInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    MegaSignsApiValidator.updateMegaSignStatusValidator(megaSignId,megaSignStatusUpdateInfo);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

    Object postBody = megaSignStatusUpdateInfo;
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
    
    TypeRef returnType = new TypeRef<MegaSignStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
