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
import com.adobe.sign.model.agreements.AgreementStatusUpdateResponse;
import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class AgreementsApi {
  private ApiClient apiClient;

  public AgreementsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Retrieves agreements for the user.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param query The query string used for the search. Multiple search terms can be provided, separated by spaces. Some of the search terms include document name, participant name or company, and form data
   * @param externalId ExternalID for which you would like to retrieve agreement information. ExternalId is passed in the call to the agreement creation API
   * @param externalGroup ExternalGroup for which you would like to retrieve agreement information. ExternalGroup is passed in the call to the agreement creation API. You must pass ExternalId if passing ExternalGroup parameter
   * @param externalNamespace ExternalNameSpace for which you would like to retrieve agreement information. ExternalNameSpace is passed in the call to the agreement creation API. You must pass ExternalId if passing ExternalNameSpace parameter
   * @return UserAgreements
   */
  public UserAgreements getAgreements (String accessToken,
                                                        String xApiUser,
                                                        String query,
                                                        String externalId,
                                                        String externalGroup,
                                                        String externalNamespace) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getAgreementsValidator(accessToken, xApiUser, query, externalId, externalGroup, externalNamespace);

    //Create path and map variables
    String path = "/agreements".replaceAll("\\{format\\}","json");

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    
    queryParams.addAll(apiClient.parameterToPairs("", "externalId", externalId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "externalGroup", externalGroup));
    
    queryParams.addAll(apiClient.parameterToPairs("", "externalNamespace", externalNamespace));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserAgreements>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_send - If both authoringRequested and sendThroughWeb parameter are set to falseagreement_write - If any of the authoringRequested or sendThroughWeb parameter is set to trueuser_login - Required additionally if the autoLoginUser parameter is set to true
   * @param agreementCreationInfo Information about the agreement that you want to send and authoring options that you want to apply at the time of sending.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return AgreementCreationResponse
   */
  public AgreementCreationResponse createAgreement (String accessToken,
                                                        AgreementCreationInfo agreementCreationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.createAgreementValidator(accessToken, agreementCreationInfo, xApiUser);

    //Create path and map variables
    String path = "/agreements".replaceAll("\\{format\\}","json");

    Object postBody = agreementCreationInfo;
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
    
    TypeRef returnType = new TypeRef<AgreementCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the latest status of an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return AgreementInfo
   */
  public AgreementInfo getAgreementInfo (String accessToken,
                                                        String agreementId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getAgreementInfoValidator(accessToken, agreementId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    TypeRef returnType = new TypeRef<AgreementInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Deletes an agreement. Agreement will no longer be visible in the Manage Page of the user.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_retention
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return void
   */
  public void deleteAgreement (String accessToken,
                                                        String agreementId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.deleteAgreementValidator(accessToken, agreementId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null);
    
  }
  
  /**
   * Retrieves the audit trail of an agreement identified by agreementid.
   * PDF file stream containing audit trail information
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getAuditTrail (String accessToken,
                                                        String agreementId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getAuditTrailValidator(accessToken, agreementId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/auditTrail".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
      "   */*   "
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Gets a single combined PDF document for the documents associated with an agreement.
   * A File Stream of combined PDF document
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve documents.
   * @param attachSupportingDocuments When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
   * @param auditReport When set to true, attach an audit report to the signed agreement PDF. Default value is false
   * @return byte[]
   */
  public byte[] getCombinedDocument (String accessToken,
                                                        String agreementId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail,
                                                        Boolean attachSupportingDocuments,
                                                        Boolean auditReport) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getCombinedDocumentValidator(accessToken, agreementId, xApiUser, versionId, participantEmail, attachSupportingDocuments, auditReport);

    //Create path and map variables
    String path = "/agreements/{agreementId}/combinedDocument".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "attachSupportingDocuments", attachSupportingDocuments));
    
    queryParams.addAll(apiClient.parameterToPairs("", "auditReport", auditReport));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "   */*   "
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param includeSupportingDocumentsPagesInfo When set to true, returns info of all pages of supporting documents as well. Else, return the page info of only the original document.
   * @return CombinedDocumentPagesInfo
   */
  public CombinedDocumentPagesInfo getCombinedDocumentPagesInfo (String accessToken,
                                                        String agreementId,
                                                        String xApiUser,
                                                        Boolean includeSupportingDocumentsPagesInfo) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getCombinedDocumentPagesInfoValidator(accessToken, agreementId, xApiUser, includeSupportingDocumentsPagesInfo);

    //Create path and map variables
    String path = "/agreements/{agreementId}/combinedDocument/pagesInfo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeSupportingDocumentsPagesInfo", includeSupportingDocumentsPagesInfo));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<CombinedDocumentPagesInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves url of all visible pages of all the documents associated with an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve its document url.
   * @param attachSupportingDocuments When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
   * @param auditReport When set to true, attach an audit report to the signed agreement PDF. Default value is false
   * @return DocumentUrl
   */
  public DocumentUrl getCombinedDocumentUrl (String accessToken,
                                                        String agreementId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail,
                                                        Boolean attachSupportingDocuments,
                                                        Boolean auditReport) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getCombinedDocumentUrlValidator(accessToken, agreementId, xApiUser, versionId, participantEmail, attachSupportingDocuments, auditReport);

    //Create path and map variables
    String path = "/agreements/{agreementId}/combinedDocument/url".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "attachSupportingDocuments", attachSupportingDocuments));
    
    queryParams.addAll(apiClient.parameterToPairs("", "auditReport", auditReport));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentUrl>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the IDs of all the main and supporting documents of an agreement identified by agreementid.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve documents.
   * @param supportingDocumentContentFormat Content format of the supported documents. It can have two possible values ORIGINAL or CONVERTED_PDF.
   * @return AgreementDocuments
   */
  public AgreementDocuments getAllDocuments (String accessToken,
                                                        String agreementId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail,
                                                        String supportingDocumentContentFormat) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getAllDocumentsValidator(accessToken, agreementId, xApiUser, versionId, participantEmail, supportingDocumentContentFormat);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "supportingDocumentContentFormat", supportingDocumentContentFormat));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<AgreementDocuments>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Deletes all the documents of an agreement. Agreement will be visible in the Manage Page of the user.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_retention
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return void
   */
  public void deleteDocuments (String accessToken,
                                                        String agreementId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.deleteDocumentsValidator(accessToken, agreementId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null);
    
  }
  
  /**
   * Retrieves image urls of all visible pages of all the documents associated with an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve its visible document pages&#39; image urls.
   * @param imageSizes A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.
   * @param includeSupportingDocumentsImageUrls When set to true, returns image urls of supporting documents as well. Else, return the image url of only the original document.
   * @param showImageAvailabilityOnly When set to true, returns only image availability. Else, returns both image urls and its availability.
   * @return DocumentImageUrls
   */
  public DocumentImageUrls getCombinedDocumentImageUrls (String accessToken,
                                                        String agreementId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail,
                                                        String imageSizes,
                                                        Boolean includeSupportingDocumentsImageUrls,
                                                        Boolean showImageAvailabilityOnly) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getCombinedDocumentImageUrlsValidator(accessToken, agreementId, xApiUser, versionId, participantEmail, imageSizes, includeSupportingDocumentsImageUrls, showImageAvailabilityOnly);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/imageUrls".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "imageSizes", imageSizes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeSupportingDocumentsImageUrls", includeSupportingDocumentsImageUrls));
    
    queryParams.addAll(apiClient.parameterToPairs("", "showImageAvailabilityOnly", showImageAvailabilityOnly));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentImageUrls>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the file stream of a document of an agreement.
   * Raw stream of the file
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param documentId The document identifier, as provided by the API which fetches the documents of a specified agreement
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getDocument (String accessToken,
                                                        String agreementId,
                                                        String documentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getDocumentValidator(accessToken, agreementId, documentId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
      "   */*   "
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Retrieves image urls of all visible pages of a document associated with an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param documentId The document identifier, as provided by the API which fetches the documents of a specified agreement
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve its visible document pages&#39; image urls.
   * @param imageSizes A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.
   * @param showImageAvailabilityOnly When set to true, returns only image availability. Else, returns both image urls and its availability.
   * @param startPage Start of page number range for which imageUrls are requested. Starting page number should be greater than 0.
   * @param endPage End of page number range for which imageUrls are requested.
   * @return DocumentImageUrl
   */
  public DocumentImageUrl getDocumentImageUrls (String accessToken,
                                                        String agreementId,
                                                        String documentId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail,
                                                        String imageSizes,
                                                        Boolean showImageAvailabilityOnly,
                                                        Integer startPage,
                                                        Integer endPage) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getDocumentImageUrlsValidator(accessToken, agreementId, documentId, xApiUser, versionId, participantEmail, imageSizes, showImageAvailabilityOnly, startPage, endPage);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/{documentId}/imageUrls".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "imageSizes", imageSizes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "showImageAvailabilityOnly", showImageAvailabilityOnly));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startPage", startPage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endPage", endPage));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentImageUrl>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the url of the document
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param documentId The document identifier, as provided by the API which fetches the documents of a specified agreement
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve its document url.
   * @return DocumentUrl
   */
  public DocumentUrl getDocumentUrl (String accessToken,
                                                        String agreementId,
                                                        String documentId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getDocumentUrlValidator(accessToken, agreementId, documentId, xApiUser, versionId, participantEmail);

    //Create path and map variables
    String path = "/agreements/{agreementId}/documents/{documentId}/url".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<DocumentUrl>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves data entered by the user into interactive form fields at the time they signed the agreement
   * CSV file stream containing form data information
   * @param accessToken An OAuth Access Token with scopes:agreement_read
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getFormData (String accessToken,
                                                        String agreementId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getFormDataValidator(accessToken, agreementId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/formData".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
      "text/csv"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Creates a new alternate participant
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_write
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param participantSetId The participant set identifier
   * @param participantId The participant identifier
   * @param alternateParticipantInfo Information about the alternate participant
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return AlternateParticipantResponse
   */
  public AlternateParticipantResponse createAlternateParticipant (String accessToken,
                                                        String agreementId,
                                                        String participantSetId,
                                                        String participantId,
                                                        AlternateParticipantInfo alternateParticipantInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.createAlternateParticipantValidator(accessToken, agreementId, participantSetId, participantId, alternateParticipantInfo, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/participantSets/{participantSetId}/participants/{participantId}/alternateParticipants".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()))
      .replaceAll("\\{" + "participantSetId" + "\\}", apiClient.escapeString(participantSetId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", apiClient.escapeString(participantId.toString()));

    Object postBody = alternateParticipantInfo;
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
    
    TypeRef returnType = new TypeRef<AlternateParticipantResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the URL for the e-sign page for the current signer(s) of an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_write
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return SigningUrlResponse
   */
  public SigningUrlResponse getSigningUrl (String accessToken,
                                                        String agreementId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.getSigningUrlValidator(accessToken, agreementId, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/signingUrls".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

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
    
    TypeRef returnType = new TypeRef<SigningUrlResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Cancels an agreement.
   * 
   * @param accessToken An OAuth Access Token with scopes:agreement_write
   * @param agreementId The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
   * @param agreementStatusUpdateInfo Agreement status update information object.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return AgreementStatusUpdateResponse
   */
  public AgreementStatusUpdateResponse updateStatus (String accessToken,
                                                        String agreementId,
                                                        AgreementStatusUpdateInfo agreementStatusUpdateInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    AgreementsApiValidator.updateStatusValidator(accessToken, agreementId, agreementStatusUpdateInfo, xApiUser);

    //Create path and map variables
    String path = "/agreements/{agreementId}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    Object postBody = agreementStatusUpdateInfo;
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
    
    TypeRef returnType = new TypeRef<AgreementStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
