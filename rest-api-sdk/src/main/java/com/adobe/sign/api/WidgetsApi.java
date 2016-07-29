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
import com.adobe.sign.utils.validator.WidgetsApiValidator;

import com.adobe.sign.model.widgets.UserWidgets;
import com.adobe.sign.model.widgets.WidgetCreationResponse;
import com.adobe.sign.model.widgets.WidgetCreationRequest;
import com.adobe.sign.model.widgets.WidgetInfo;
import com.adobe.sign.model.widgets.WidgetAgreements;
import com.adobe.sign.model.widgets.WidgetDocuments;
import com.adobe.sign.model.widgets.WidgetPersonalizationInfo;
import com.adobe.sign.model.widgets.WidgetPersonalizeResponse;
import com.adobe.sign.model.widgets.WidgetStatusUpdateResponse;
import com.adobe.sign.model.widgets.WidgetStatusUpdateInfo;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:04.202+05:30")
    public class WidgetsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public WidgetsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Retrieves widgets for a user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @return UserWidgets
    */
    public UserWidgets getWidgets (MultivaluedMap headers) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetsValidator();

    //Create path and map variables
    String path = "/widgets".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<UserWidgets>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Creates a widget and returns the Javascript snippet and URL to access the widget and widgetID in response to the client.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_write 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetCreationRequest Information about the widget that you want to create.
    * @return WidgetCreationResponse
    */
    public WidgetCreationResponse createWidget (MultivaluedMap headers,
                                        WidgetCreationRequest widgetCreationRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.createWidgetValidator(widgetCreationRequest);

    //Create path and map variables
    String path = "/widgets".replaceAll("\\{format\\}","json");

    Object postBody = widgetCreationRequest;
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
    
    TypeRef returnType = new TypeRef<WidgetCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the details of a widget.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @return WidgetInfo
    */
    public WidgetInfo getWidgetInfo (MultivaluedMap headers,
                                        String widgetId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetInfoValidator(widgetId);

    //Create path and map variables
    String path = "/widgets/{widgetId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    TypeRef returnType = new TypeRef<WidgetInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves agreements for the widget
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @return WidgetAgreements
    */
    public WidgetAgreements getWidgetAgreements (MultivaluedMap headers,
                                        String widgetId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetAgreementsValidator(widgetId);

    //Create path and map variables
    String path = "/widgets/{widgetId}/agreements".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    TypeRef returnType = new TypeRef<WidgetAgreements>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the audit trail of a widget identified by widgetId.
    * PDF file stream containing audit trail information
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @return byte[]
    */
    public byte[] getWidgetAuditTrail (MultivaluedMap headers,
                                        String widgetId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetAuditTrailValidator(widgetId);

    //Create path and map variables
    String path = "/widgets/{widgetId}/auditTrail".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    * Gets a single combined PDF document for the documents associated with a widget.
    * A File Stream of combined PDF document
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @param versionId The version identifier of widget as provided by the API which retrieves a widget. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve documents.
    * @param auditReport When set to YES, attach an audit report to the signed Widget PDF. Default value is false
    * @return byte[]
    */
    public byte[] getWidgetCombinedDocument (MultivaluedMap headers,
                                        String widgetId,
                                        String versionId,
                                        String participantEmail,
                                        Boolean auditReport) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetCombinedDocumentValidator(widgetId,versionId, participantEmail, auditReport);

    //Create path and map variables
    String path = "/widgets/{widgetId}/combinedDocument".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "participantEmail", participantEmail));
    
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
    * Retrieves the IDs of the documents associated with widget.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @param versionId The version identifier of widget as provided by the API which retrieves a widget. If not provided then latest version will be used.
    * @param participantEmail The email address of the participant to be used to retrieve documents.
    * @return WidgetDocuments
    */
    public WidgetDocuments getWidgetDocuments (MultivaluedMap headers,
                                        String widgetId,
                                        String versionId,
                                        String participantEmail) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetDocumentsValidator(widgetId,versionId, participantEmail);

    //Create path and map variables
    String path = "/widgets/{widgetId}/documents".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    TypeRef returnType = new TypeRef<WidgetDocuments>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the file stream of a document of a widget.
    * Raw stream of the file
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @param documentId The document identifier, as provided by the API which retrieves the documents of a specified widgetwidgets/{widgetId}/documents
    * @return byte[]
    */
    public byte[] getWidgetDocumentInfo (MultivaluedMap headers,
                                        String widgetId,
                                        String documentId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetDocumentInfoValidator(widgetId,documentId);

    //Create path and map variables
    String path = "/widgets/{widgetId}/documents/{documentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()))
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
    * Retrieves data entered by the user into interactive form fields at the time they signed the widget
    * CSV file stream containing form data information
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @return byte[]
    */
    public byte[] getWidgetFormData (MultivaluedMap headers,
                                        String widgetId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.getWidgetFormDataValidator(widgetId);

    //Create path and map variables
    String path = "/widgets/{widgetId}/formData".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    * Personalize the widget to a signable document for a specific known user
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_write 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @param widgetPersonalizationInfo Widget Personalize update information object
    * @return WidgetPersonalizeResponse
    */
    public WidgetPersonalizeResponse updateWidgetPersonalize (MultivaluedMap headers,
                                        String widgetId,
                                        WidgetPersonalizationInfo widgetPersonalizationInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.updateWidgetPersonalizeValidator(widgetId,widgetPersonalizationInfo);

    //Create path and map variables
    String path = "/widgets/{widgetId}/personalize".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

    Object postBody = widgetPersonalizationInfo;
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
    
    TypeRef returnType = new TypeRef<WidgetPersonalizeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Enables or Disables a widget.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: widget_write 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param widgetId The widget identifier, as provided by the APIs to retrieve widgets or create widgets.
    * @param widgetStatusUpdateInfo Widget status update information object.
    * @return WidgetStatusUpdateResponse
    */
    public WidgetStatusUpdateResponse updateWidgetStatus (MultivaluedMap headers,
                                        String widgetId,
                                        WidgetStatusUpdateInfo widgetStatusUpdateInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WidgetsApiValidator.updateWidgetStatusValidator(widgetId,widgetStatusUpdateInfo);

    //Create path and map variables
    String path = "/widgets/{widgetId}/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

    Object postBody = widgetStatusUpdateInfo;
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
    
    TypeRef returnType = new TypeRef<WidgetStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
