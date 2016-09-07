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
import com.adobe.sign.utils.validator.AgreementsApiValidator;

import com.adobe.sign.model.agreements.UserAgreements;
import com.adobe.sign.model.agreements.AgreementCreationInfo;
import com.adobe.sign.model.agreements.AgreementCreationResponse;
import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.model.agreements.CombinedDocumentPagesInfo;
import com.adobe.sign.model.agreements.DocumentUrl;
import com.adobe.sign.model.agreements.AgreementDocuments;
import com.adobe.sign.model.agreements.DocumentImageUrls;
import com.adobe.sign.model.agreements.DocumentImageUrl;
import com.adobe.sign.model.agreements.AlternateParticipantResponse;
import com.adobe.sign.model.agreements.AlternateParticipantInfo;
import com.adobe.sign.model.agreements.SigningUrlResponse;
import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;
import com.adobe.sign.model.agreements.AgreementStatusUpdateResponse;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:49.202+05:30")
    public class AgreementsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public AgreementsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Retrieves agreements for the user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param query The query string used for the search. Multiple search terms can be provided, separated by spaces. Some of the search terms include document name, participant name or company, and form data
    * @param externalId ExternalID for which you would like to retrieve agreement information. ExternalId is passed in the call to the agreement creation API
    * @param externalGroup ExternalGroup for which you would like to retrieve agreement information. ExternalGroup is passed in the call to the agreement creation API. You must pass ExternalId if passing ExternalGroup parameter
    * @param externalNamespace ExternalNameSpace for which you would like to retrieve agreement information. ExternalNameSpace is passed in the call to the agreement creation API. You must pass ExternalId if passing ExternalNameSpace parameter
    * @return UserAgreements
    */
    public UserAgreements getAgreements (MultivaluedMap headers,
                                        String query,
                                        String externalId,
                                        String externalGroup,
                                        String externalNamespace) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getAgreementsValidator(query, externalId, externalGroup, externalNamespace);

    //Create path and map variables
    String path = "/agreements".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "externalId", externalId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "externalGroup", externalGroup));
    
    queryParams.addAll(apiClient.parameterToPairs("", "externalNamespace", externalNamespace));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserAgreements>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_send - If both authoringRequested and sendThroughWeb parameter are set to false agreement_write - If any of the authoringRequested or sendThroughWeb parameter is set to true user_login - Required additionally if the autoLoginUser parameter is set to true 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementCreationInfo Information about the agreement that you want to send and authoring options that you want to apply at the time of sending.
    * @return AgreementCreationResponse
    */
    public AgreementCreationResponse createAgreement (MultivaluedMap headers,
                                        AgreementCreationInfo agreementCreationInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.createAgreementValidator(agreementCreationInfo);

    //Create path and map variables
    String path = "/agreements".replaceAll("\\{format\\}","json");

    Object postBody = agreementCreationInfo;
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
    
    TypeRef returnType = new TypeRef<AgreementCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the latest status of an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @return AgreementInfo
    */
    public AgreementInfo getAgreementInfo (MultivaluedMap headers,
                                        String agreementId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getAgreementInfoValidator(agreementId);

    //Create path and map variables
    String path = "/agreements/{agreementId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    TypeRef returnType = new TypeRef<AgreementInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Deletes an agreement. Agreement will no longer be visible in the Manage Page of the user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_retention 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @return void
    */
    public void deleteAgreement (MultivaluedMap headers,
                                        String agreementId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.deleteAgreementValidator(agreementId);

    //Create path and map variables
    String path = "/agreements/{agreementId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
    
    }
    
    /**
    * Retrieves the audit trail of an agreement identified by agreementid.
    * PDF file stream containing audit trail information
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @return byte[]
    */
    public byte[] getAuditTrail (MultivaluedMap headers,
                                        String agreementId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getAuditTrailValidator(agreementId);

    //Create path and map variables
    String path = "/agreements/{agreementId}/auditTrail".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add(" */* ");
    
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
    * Gets a single combined PDF document for the documents associated with an agreement.
    * A File Stream of combined PDF document
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve documents.
    * @param attachSupportingDocuments When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
    * @param auditReport When set to true, attach an audit report to the signed agreement PDF. Default value is false
    * @return byte[]
    */
    public byte[] getCombinedDocument (MultivaluedMap headers,
                                        String agreementId,
                                        String versionId,
                                        String participantEmail,
                                        Boolean attachSupportingDocuments,
                                        Boolean auditReport) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getCombinedDocumentValidator(agreementId,versionId, participantEmail, attachSupportingDocuments, auditReport);

    //Create path and map variables
    String path = "/agreements/{agreementId}/combinedDocument".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add(" */* ");
    
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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "attachSupportingDocuments", attachSupportingDocuments));
    
    queryParams.addAll(apiClient.parameterToPairs("", "auditReport", auditReport));
    
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
    * Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param includeSupportingDocumentsPagesInfo When set to true, returns info of all pages of supporting documents as well. Else, return the info of pages of only the original document.
    * @return CombinedDocumentPagesInfo
    */
    public CombinedDocumentPagesInfo getCombinedDocumentPagesInfo (MultivaluedMap headers,
                                        String agreementId,
                                        Boolean includeSupportingDocumentsPagesInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getCombinedDocumentPagesInfoValidator(agreementId,includeSupportingDocumentsPagesInfo);

    //Create path and map variables
    String path = "/agreements/{agreementId}/combinedDocument/pagesInfo".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeSupportingDocumentsPagesInfo", includeSupportingDocumentsPagesInfo));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<CombinedDocumentPagesInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves url of all visible pages of all the documents associated with an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve its document url.
    * @param attachSupportingDocuments When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
    * @param auditReport When set to true, attach an audit report to the signed agreement PDF. Default value is false
    * @return DocumentUrl
    */
    public DocumentUrl getCombinedDocumentUrl (MultivaluedMap headers,
                                        String agreementId,
                                        String versionId,
                                        String participantEmail,
                                        Boolean attachSupportingDocuments,
                                        Boolean auditReport) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getCombinedDocumentUrlValidator(agreementId,versionId, participantEmail, attachSupportingDocuments, auditReport);

    //Create path and map variables
    String path = "/agreements/{agreementId}/combinedDocument/url".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "attachSupportingDocuments", attachSupportingDocuments));
    
    queryParams.addAll(apiClient.parameterToPairs("", "auditReport", auditReport));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentUrl>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the IDs of all the main and supporting documents of an agreement identified by agreementid.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve documents.
    * @param supportingDocumentContentFormat Content format of the supported documents. It can have two possible values ORIGINAL or CONVERTED_PDF.
    * @return AgreementDocuments
    */
    public AgreementDocuments getAllDocuments (MultivaluedMap headers,
                                        String agreementId,
                                        String versionId,
                                        String participantEmail,
                                        String supportingDocumentContentFormat) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getAllDocumentsValidator(agreementId,versionId, participantEmail, supportingDocumentContentFormat);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "supportingDocumentContentFormat", supportingDocumentContentFormat));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<AgreementDocuments>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Deletes all the documents of an agreement. Agreement will be visible in the Manage Page of the user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_retention 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @return void
    */
    public void deleteDocuments (MultivaluedMap headers,
                                        String agreementId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.deleteDocumentsValidator(agreementId);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
    
    }
    
    /**
    * Retrieves image urls of all visible pages of all the documents associated with an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve its visible document page image urls.
    * @param imageSizes A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.
    * @param includeSupportingDocumentsImageUrls When set to true, returns image urls of supporting documents as well. Else, return image urls of only the original document.
    * @param showImageAvailabilityOnly When set to true, returns only image availability. Else, returns both image urls and its availability.
    * @return DocumentImageUrls
    */
    public DocumentImageUrls getCombinedDocumentImageUrls (MultivaluedMap headers,
                                        String agreementId,
                                        String versionId,
                                        String participantEmail,
                                        String imageSizes,
                                        Boolean includeSupportingDocumentsImageUrls,
                                        Boolean showImageAvailabilityOnly) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getCombinedDocumentImageUrlsValidator(agreementId,versionId, participantEmail, imageSizes, includeSupportingDocumentsImageUrls, showImageAvailabilityOnly);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/imageUrls".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "imageSizes", imageSizes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeSupportingDocumentsImageUrls", includeSupportingDocumentsImageUrls));
    
    queryParams.addAll(apiClient.parameterToPairs("", "showImageAvailabilityOnly", showImageAvailabilityOnly));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentImageUrls>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the file stream of a document of an agreement.
    * Raw stream of the file
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param documentId The document identifier, as retrieved from the API which fetches the documents of a specified agreement
    * @return byte[]
    */
    public byte[] getDocument (MultivaluedMap headers,
                                        String agreementId,
                                        String documentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getDocumentValidator(agreementId,documentId);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/{documentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
        .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add(" */* ");
    
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
    * Retrieves image urls of all visible pages of a document associated with an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param documentId The document identifier, as retrieved from the API which fetches the documents of a specified agreement
    * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve its visible document page image urls.
    * @param imageSizes A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.
    * @param showImageAvailabilityOnly When set to true, returns only image availability. Else, returns both image urls and its availability.
    * @param startPage Start of page number range for which imageUrls are requested. Starting page number should be greater than 0.
    * @param endPage End of page number range for which imageUrls are requested.
    * @return DocumentImageUrl
    */
    public DocumentImageUrl getDocumentImageUrls (MultivaluedMap headers,
                                        String agreementId,
                                        String documentId,
                                        String versionId,
                                        String participantEmail,
                                        String imageSizes,
                                        Boolean showImageAvailabilityOnly,
                                        Integer startPage,
                                        Integer endPage) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getDocumentImageUrlsValidator(agreementId,documentId,versionId, participantEmail, imageSizes, showImageAvailabilityOnly, startPage, endPage);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/{documentId}/imageUrls".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
        .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "imageSizes", imageSizes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "showImageAvailabilityOnly", showImageAvailabilityOnly));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startPage", startPage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endPage", endPage));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentImageUrl>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the url of the document
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param documentId The document identifier, as retrieved from the API which fetches the documents of a specified agreement
    * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve its document url.
    * @return DocumentUrl
    */
    public DocumentUrl getDocumentUrl (MultivaluedMap headers,
                                        String agreementId,
                                        String documentId,
                                        String versionId,
                                        String participantEmail) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getDocumentUrlValidator(agreementId,documentId,versionId, participantEmail);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/{documentId}/url".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
        .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentUrl>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves data entered by the user into interactive form fields at the time they signed the agreement
    * CSV file stream containing form data information
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @return byte[]
    */
    public byte[] getFormData (MultivaluedMap headers,
                                        String agreementId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getFormDataValidator(agreementId);

    //Create path and map variables
    String path = "/agreements/{agreementId}/formData".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    * Creates a new alternate participant
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_write 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param participantSetId The participant set identifier
    * @param participantId The participant identifier
    * @param alternateParticipantInfo Information about the alternate participant
    * @return AlternateParticipantResponse
    */
    public AlternateParticipantResponse createAlternateParticipant (MultivaluedMap headers,
                                        String agreementId,
                                        String participantSetId,
                                        String participantId,
                                        AlternateParticipantInfo alternateParticipantInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.createAlternateParticipantValidator(agreementId,participantSetId,participantId,alternateParticipantInfo);

    //Create path and map variables
    String path = "/agreements/{agreementId}/participantSets/{participantSetId}/participants/{participantId}/alternateParticipants".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
        .replaceAll("\\{" + "participantSetId" + "\\}", apiClient.escapeString(participantSetId.toString()))
        .replaceAll("\\{" + "participantId" + "\\}", apiClient.escapeString(participantId.toString()));

    Object postBody = alternateParticipantInfo;
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
    
    TypeRef returnType = new TypeRef<AlternateParticipantResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the URL for the e-sign page for the current signer(s) of an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_write 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @return SigningUrlResponse
    */
    public SigningUrlResponse getSigningUrl (MultivaluedMap headers,
                                        String agreementId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.getSigningUrlValidator(agreementId);

    //Create path and map variables
    String path = "/agreements/{agreementId}/signingUrls".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    TypeRef returnType = new TypeRef<SigningUrlResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Cancels an agreement.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: agreement_write 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
    * @param agreementStatusUpdateInfo Agreement status update information object.
    * @return AgreementStatusUpdateResponse
    */
    public AgreementStatusUpdateResponse updateStatus (MultivaluedMap headers,
                                        String agreementId,
                                        AgreementStatusUpdateInfo agreementStatusUpdateInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    AgreementsApiValidator.updateStatusValidator(agreementId,agreementStatusUpdateInfo);

    //Create path and map variables
    String path = "/agreements/{agreementId}/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = agreementStatusUpdateInfo;
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
    
    TypeRef returnType = new TypeRef<AgreementStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
