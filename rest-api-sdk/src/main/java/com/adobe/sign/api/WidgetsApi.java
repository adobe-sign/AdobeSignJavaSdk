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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:57.177+05:30")
public class WidgetsApi {
  private ApiClient apiClient;

  public WidgetsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Retrieves widgets for a user.
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return UserWidgets
   */
  public UserWidgets getWidgets (String accessToken,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetsValidator(accessToken, xApiUser);

    //Create path and map variables
    String path = "/widgets".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<UserWidgets>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Creates a widget and returns the Javascript snippet and URL to access the widget and widgetID in response to the client.
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_write
   * @param widgetCreationRequest Information about the widget that you want to create.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return WidgetCreationResponse
   */
  public WidgetCreationResponse createWidget (String accessToken,
                                                        WidgetCreationRequest widgetCreationRequest,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.createWidgetValidator(accessToken, widgetCreationRequest, xApiUser);

    //Create path and map variables
    String path = "/widgets".replaceAll("\\{format\\}","json");

    Object postBody = widgetCreationRequest;
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
    
    TypeRef returnType = new TypeRef<WidgetCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the details of a widget.
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return WidgetInfo
   */
  public WidgetInfo getWidgetInfo (String accessToken,
                                                        String widgetId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetInfoValidator(accessToken, widgetId, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    TypeRef returnType = new TypeRef<WidgetInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves agreements for the widget
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return WidgetAgreements
   */
  public WidgetAgreements getWidgetAgreements (String accessToken,
                                                        String widgetId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetAgreementsValidator(accessToken, widgetId, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}/agreements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    TypeRef returnType = new TypeRef<WidgetAgreements>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the audit trail of a widget identified by widgetId.
   * PDF file stream containing audit trail information
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getWidgetAuditTrail (String accessToken,
                                                        String widgetId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetAuditTrailValidator(accessToken, widgetId, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}/auditTrail".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
   * Gets a single combined PDF document for the documents associated with a widget.
   * A File Stream of combined PDF document
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve documents.
   * @param auditReport When set to YES, attach an audit report to the signed Widget PDF. Default value is false
   * @return byte[]
   */
  public byte[] getWidgetCombinedDocument (String accessToken,
                                                        String widgetId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail,
                                                        Boolean auditReport) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetCombinedDocumentValidator(accessToken, widgetId, xApiUser, versionId, participantEmail, auditReport);

    //Create path and map variables
    String path = "/widgets/{widgetId}/combinedDocument".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
   * Retrieves the IDs of the documents associated with widget.
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param versionId The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve documents.
   * @return WidgetDocuments
   */
  public WidgetDocuments getWidgetDocuments (String accessToken,
                                                        String widgetId,
                                                        String xApiUser,
                                                        String versionId,
                                                        String participantEmail) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetDocumentsValidator(accessToken, widgetId, xApiUser, versionId, participantEmail);

    //Create path and map variables
    String path = "/widgets/{widgetId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
    
    TypeRef returnType = new TypeRef<WidgetDocuments>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the file stream of a document of a widget.
   * Raw stream of the file
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param documentId The document identifier, as retrieved by the API which fetches the documents of a specified widget.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getWidgetDocumentInfo (String accessToken,
                                                        String widgetId,
                                                        String documentId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetDocumentInfoValidator(accessToken, widgetId, documentId, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()))
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
   * Retrieves data entered by the user into interactive form fields at the time they signed the widget
   * CSV file stream containing form data information
   * @param accessToken An OAuth Access Token with scopes:widget_read
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return byte[]
   */
  public byte[] getWidgetFormData (String accessToken,
                                                        String widgetId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.getWidgetFormDataValidator(accessToken, widgetId, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}/formData".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

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
   * Personalize the widget to a signable document for a specific known user
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_write
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param widgetPersonalizationInfo Widget Personalize update information object
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return WidgetPersonalizeResponse
   */
  public WidgetPersonalizeResponse updateWidgetPersonalize (String accessToken,
                                                        String widgetId,
                                                        WidgetPersonalizationInfo widgetPersonalizationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.updateWidgetPersonalizeValidator(accessToken, widgetId, widgetPersonalizationInfo, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}/personalize".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

    Object postBody = widgetPersonalizationInfo;
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
    
    TypeRef returnType = new TypeRef<WidgetPersonalizeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Enables or Disables a widget.
   * 
   * @param accessToken An OAuth Access Token with scopes:widget_write
   * @param widgetId The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
   * @param widgetStatusUpdateInfo Widget status update information object.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return WidgetStatusUpdateResponse
   */
  public WidgetStatusUpdateResponse updateWidgetStatus (String accessToken,
                                                        String widgetId,
                                                        WidgetStatusUpdateInfo widgetStatusUpdateInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WidgetsApiValidator.updateWidgetStatusValidator(accessToken, widgetId, widgetStatusUpdateInfo, xApiUser);

    //Create path and map variables
    String path = "/widgets/{widgetId}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "widgetId" + "\\}", apiClient.escapeString(widgetId.toString()));

    Object postBody = widgetStatusUpdateInfo;
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
    
    TypeRef returnType = new TypeRef<WidgetStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
