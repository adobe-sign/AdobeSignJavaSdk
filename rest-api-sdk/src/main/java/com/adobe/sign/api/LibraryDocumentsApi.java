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
import com.adobe.sign.utils.validator.LibraryDocumentsApiValidator;

import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentInfo;
import com.adobe.sign.model.libraryDocuments.Documents;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.195+05:30")
    public class LibraryDocumentsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public LibraryDocumentsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Retrieves library documents for a user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @return DocumentLibraryItems
    */
    public DocumentLibraryItems getLibraryDocuments (MultivaluedMap headers) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentsValidator();

    //Create path and map variables
    String path = "/libraryDocuments".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<DocumentLibraryItems>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Creates a template that is placed in the library of the user for reuse.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_write user_login - Required additionally if the autoLoginUser parameter is set to true 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryCreationInfo Information about the library document that you want to create and authoring options that you want to apply at the time of creation.
    * @return LibraryDocumentCreationResponse
    */
    public LibraryDocumentCreationResponse createLibraryDocument (MultivaluedMap headers,
                                        LibraryCreationInfo libraryCreationInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.createLibraryDocumentValidator(libraryCreationInfo);

    //Create path and map variables
    String path = "/libraryDocuments".replaceAll("\\{format\\}","json");

    Object postBody = libraryCreationInfo;
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
    
    TypeRef returnType = new TypeRef<LibraryDocumentCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the details of a library document.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents.
    * @return LibraryDocumentInfo
    */
    public LibraryDocumentInfo getLibraryDocumentInfo (MultivaluedMap headers,
                                        String libraryDocumentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentInfoValidator(libraryDocumentId);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
    
    TypeRef returnType = new TypeRef<LibraryDocumentInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Deletes a library document. Library document will no longer be visible in the Manage Page of the user.
    * This API will delete the library document. However, the agreements created using this library document will not be impacted.
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_retention 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents.
    * @return void
    */
    public void deleteLibraryDocument (MultivaluedMap headers,
                                        String libraryDocumentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.deleteLibraryDocumentValidator(libraryDocumentId);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
    * Retrieves the audit trail associated with a library document.
    * File Stream of PDF file
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents.
    * @return byte[]
    */
    public byte[] getLibraryDocumentAuditTrail (MultivaluedMap headers,
                                        String libraryDocumentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentAuditTrailValidator(libraryDocumentId);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/auditTrail".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/pdf");
    
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
    * Retrieves the combined document associated with a library document.
    * File Stream of PDF file
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents.
    * @param auditReport When set to YES attach an audit report to the library document PDF. Default value will be false.
    * @return byte[]
    */
    public byte[] getCombinedDocument (MultivaluedMap headers,
                                        String libraryDocumentId,
                                        Boolean auditReport) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.getCombinedDocumentValidator(libraryDocumentId,auditReport);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/combinedDocument".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/pdf");
    
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
    * Retrieves the ID of the document associated with library document.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents.
    * @return Documents
    */
    public Documents getDocuments (MultivaluedMap headers,
                                        String libraryDocumentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.getDocumentsValidator(libraryDocumentId);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/documents".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()));

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
    
    TypeRef returnType = new TypeRef<Documents>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the file stream of a library document.
    * Raw stream of the file
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: library_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param libraryDocumentId The document identifier, as retrieved from the API to fetch library documents.
    * @param documentId The document identifier, as retrieved from the API which fetches the documents of a specified library document
    * @return byte[]
    */
    public byte[] getLibraryDocument (MultivaluedMap headers,
                                        String libraryDocumentId,
                                        String documentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    LibraryDocumentsApiValidator.getLibraryDocumentValidator(libraryDocumentId,documentId);

    //Create path and map variables
    String path = "/libraryDocuments/{libraryDocumentId}/documents/{documentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "libraryDocumentId" + "\\}", apiClient.escapeString(libraryDocumentId.toString()))
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
    
  }
