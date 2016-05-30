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
import com.adobe.sign.utils.validator.MegaSignsApiValidator;

import com.adobe.sign.model.megaSigns.MegaSigns;
import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
import com.adobe.sign.model.megaSigns.MegaSignInfo;
import com.adobe.sign.model.megaSigns.MegaSignChildAgreements;
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:59.623+05:30")
public class MegaSignsApi {
  private ApiClient apiClient;

  public MegaSignsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Get all the MegaSign parent agreements of a user.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param query The query string used for the search. Multiple search terms can be provided, separated by spaces. Some of the search terms include document name, participant name or company, and form data
   * @return MegaSigns
   */
  public MegaSigns getMegaSigns (String accessToken,
                                                        String xApiUser,
                                                        String query) throws ApiException {
    //Validate Request
    MegaSignsApiValidator.getMegaSignsValidator(accessToken, xApiUser, query);

    //Create path and map variables
    String path = "/megaSigns".replaceAll("\\{format\\}","json");

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<MegaSigns>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Send an agreement out for signature to multiple recipients. Each recipient will receive and sign their own copy of the agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_send
   * @param megaSignCreationRequest Information about the MegaSign that you want to send.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return MegaSignCreationResponse
   */
  public MegaSignCreationResponse createMegaSign (String accessToken,
                                                        MegaSignCreationRequest megaSignCreationRequest,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    MegaSignsApiValidator.createMegaSignValidator(accessToken, megaSignCreationRequest, xApiUser);

    //Create path and map variables
    String path = "/megaSigns".replaceAll("\\{format\\}","json");

    Object postBody = megaSignCreationRequest;
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
    
    TypeRef returnType = new TypeRef<MegaSignCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Get detailed information of the specified MegaSign parent agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return MegaSignInfo
   */
  public MegaSignInfo getMegaSignInfo (String accessToken,
                                                        String megaSignId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    MegaSignsApiValidator.getMegaSignInfoValidator(accessToken, megaSignId, xApiUser);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

    Object postBody = null;
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
    
    TypeRef returnType = new TypeRef<MegaSignInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Get all the child agreements of the specified MegaSign parent agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return MegaSignChildAgreements
   */
  public MegaSignChildAgreements getMegaSignChildAgreements (String accessToken,
                                                        String megaSignId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    MegaSignsApiValidator.getMegaSignChildAgreementsValidator(accessToken, megaSignId, xApiUser);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}/agreements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

    Object postBody = null;
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
    
    TypeRef returnType = new TypeRef<MegaSignChildAgreements>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves data entered by recipients into interactive form fields at the time they signed the child agreements of the specified MegaSign agreement
   * CSV file stream containing form data information
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param accept Specify media types which are acceptable for the response. Currently only text/csv is supported.
   * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getMegaSignFormData (String accessToken,
                                                        String accept,
                                                        String megaSignId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    MegaSignsApiValidator.getMegaSignFormDataValidator(accessToken, accept, megaSignId, xApiUser);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}/formData".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (accept != null)
    headerParams.put("accept", apiClient.parameterToString(accept));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "text/csv"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Cancel all the child agreements of the specified MegaSign agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_write
   * @param megaSignId The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
   * @param megaSignStatusUpdateInfo MegaSign status update information object.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return MegaSignStatusUpdateResponse
   */
  public MegaSignStatusUpdateResponse updateMegaSignStatus (String accessToken,
                                                        String megaSignId,
                                                        MegaSignStatusUpdateInfo megaSignStatusUpdateInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    MegaSignsApiValidator.updateMegaSignStatusValidator(accessToken, megaSignId, megaSignStatusUpdateInfo, xApiUser);

    //Create path and map variables
    String path = "/megaSigns/{megaSignId}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "megaSignId" + "\\}", apiClient.escapeString(megaSignId.toString()));

    Object postBody = megaSignStatusUpdateInfo;
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
    
    TypeRef returnType = new TypeRef<MegaSignStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
