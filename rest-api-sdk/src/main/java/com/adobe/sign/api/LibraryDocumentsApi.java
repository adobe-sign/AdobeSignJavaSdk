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
import com.adobe.sign.utils.validator.LibraryDocumentsApiValidator;

import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentInfo;
import com.adobe.sign.model.libraryDocuments.Documents;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:58.451+05:30")
public class LibraryDocumentsApi {
  private ApiClient apiClient;

  public LibraryDocumentsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Retrieves library documents for a user.
   * 
   * @param accessToken An OAuth Access Token with scopes:library_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return DocumentLibraryItems
   */
  public DocumentLibraryItems getLibraryDocuments (String accessToken,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentsValidator(accessToken, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<DocumentLibraryItems>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Creates a template that is placed in the library of the user for reuse.
   * 
   * @param accessToken An OAuth Access Token with scopes:library_writeuser_login - Required additionally if the autoLoginUser parameter is set to true
   * @param libraryCreationInfo Information about the library document that you want to create and authoring options that you want to apply at the time of creation.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return LibraryDocumentCreationResponse
   */
  public LibraryDocumentCreationResponse createLibraryDocument (String accessToken,
                                                        LibraryCreationInfo libraryCreationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.createLibraryDocumentValidator(accessToken, libraryCreationInfo, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments".replaceAll("\\{format\\}","json");

    Object postBody = libraryCreationInfo;
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
    
    TypeRef returnType = new TypeRef<LibraryDocumentCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the details of a library document.
   * 
   * @param accessToken An OAuth Access Token with scopes:library_read
   * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents..
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return LibraryDocumentInfo
   */
  public LibraryDocumentInfo getLibraryDocumentInfo (String accessToken,
                                                        String libraryDocumentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentInfoValidator(accessToken, libraryDocumentId, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
    
    TypeRef returnType = new TypeRef<LibraryDocumentInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Deletes a library document. Library document will no longer be visible in the Manage Page of the user.
   * This API will delete the library document. However, the agreements created using this library document will not be impacted.
   * @param accessToken An OAuth Access Token with scopes:library_retention
   * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents..
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return void
   */
  public void deleteLibraryDocument (String accessToken,
                                                        String libraryDocumentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.deleteLibraryDocumentValidator(accessToken, libraryDocumentId, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
   * Retrieves the audit trail associated with a library document.
   * File Stream of PDF file
   * @param accessToken An OAuth Access Token with scopes:library_read
   * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents..
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getLibraryDocumentAuditTrail (String accessToken,
                                                        String libraryDocumentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentAuditTrailValidator(accessToken, libraryDocumentId, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/auditTrail".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
      "application/pdf"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Retrieves the combined document associated with a library document.
   * File Stream of PDF file
   * @param accessToken An OAuth Access Token with scopes:library_read
   * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents..
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param auditReport When set to YES attach an audit report to the library document PDF. Default value will be false.
   * @return byte[]
   */
  public byte[] getCombinedDocument (String accessToken,
                                                        String libraryDocumentId,
                                                        String xApiUser,
                                                        Boolean auditReport) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.getCombinedDocumentValidator(accessToken, libraryDocumentId, xApiUser, auditReport);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/combinedDocument".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "auditReport", auditReport));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/pdf"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    return apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType);
    
  }
  
  /**
   * Retrieves the ID of the document associated with library document.
   * 
   * @param accessToken An OAuth Access Token with scopes:library_read
   * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents..
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return Documents
   */
  public Documents getDocuments (String accessToken,
                                                        String libraryDocumentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.getDocumentsValidator(accessToken, libraryDocumentId, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
    
    TypeRef returnType = new TypeRef<Documents>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the file stream of a library document.
   * Raw stream of the file
   * @param accessToken An OAuth Access Token with scopes:library_read
   * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents..
   * @param documentId The document identifier, as retrieved from the API which fetches the documents of a specified library document
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getLibraryDocument (String accessToken,
                                                        String libraryDocumentId,
                                                        String documentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentValidator(accessToken, libraryDocumentId, documentId, xApiUser);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()))
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
  
}
