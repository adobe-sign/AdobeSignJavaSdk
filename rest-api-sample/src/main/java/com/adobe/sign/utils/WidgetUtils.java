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
package com.adobe.sign.utils;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.WidgetsApi;
import com.adobe.sign.model.widgets.CounterSignerInfo;
import com.adobe.sign.model.widgets.CounterSignerSetInfo;
import com.adobe.sign.model.widgets.UserWidget;
import com.adobe.sign.model.widgets.UserWidgets;
import com.adobe.sign.model.widgets.WidgetCreationInfo;
import com.adobe.sign.model.widgets.WidgetCreationRequest;
import com.adobe.sign.model.widgets.WidgetCreationResponse;
import com.adobe.sign.model.widgets.WidgetFileInfo;
import com.adobe.sign.model.widgets.WidgetInfo;

public class WidgetUtils {

  private final static WidgetsApi widgetsApi = new WidgetsApi();
  private final static MultivaluedMap headers = ApiUtils.getHeaderParams();

  //Document identifier to identify whether document is library document or transient document
  public enum DocumentIdentifierType {
    TRANSIENT_DOCUMENT_ID,
    LIBRARY_DOCUMENT_ID,
    LIBRARY_DOCUMENT_NAME;
  }

  /**
   * Creates a widget and adds counter signer to it.
   *
   * @param documentIdentifier The identifier of the document.
   * @param documentIdentifierType Type of the documentIdentifier.
   * @param formFieldDocumentId The identifier of the document containing form fields.
   * @param formFieldIdType The type of the form field document.
   * @param widgetName The name of the widget that will be used to identify it.
   * @param counterSignerMemberList List of the email of the counter signers for counter signer set.
   * @return widgetCreationResponse object.
   * @throws Exception
   */
  public static WidgetCreationResponse createWidgetWithCounterSigner(String documentIdentifier,
                                                                     DocumentIdentifierType documentIdentifierType,
                                                                     String formFieldDocumentId,
                                                                     DocumentIdentifierType formFieldIdType,
                                                                     String widgetName,
                                                                     ArrayList<String> counterSignerMemberList) throws ApiException {
    try {
      WidgetCreationRequest widgetCreationRequest = getWidgetCreationRequest(documentIdentifier,
                                                    documentIdentifierType,
                                                    formFieldDocumentId,
                                                    formFieldIdType,
                                                    widgetName,
                                                    counterSignerMemberList);
      WidgetCreationResponse widgetCreationResponse = widgetsApi.createWidget(headers,
                                                                              widgetCreationRequest );
      return widgetCreationResponse;
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.CREATE_WIDGET, e);
      return null;
    }
  }


  /**
   * Get widgetCreationRequest object.
   *
   * @param documentIdentifier The identifier of the document.
   * @param documentIdentifierType Type of the documentIdentifier.
   * @param formFieldDocumentId The identifier of the document containing form fields.
   * @param formFieldIdType The type of the form field document.
   * @param widgetName The name of the widget that will be used to identify it.
   * @param counterSignerMemberList List of the email of the counter signers for counter signer set.
   * @return widgetCreationRequest object.
   */
  private static WidgetCreationRequest getWidgetCreationRequest(String documentIdentifier,
                                                                DocumentIdentifierType documentIdentifierType,
                                                                String formFieldDocumentId,
                                                                DocumentIdentifierType formFieldIdType,
                                                                String widgetName,
                                                                ArrayList<String> counterSignerMemberList) {
    WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();
    WidgetCreationInfo widgetCreationInfo = getWidgetCreationInfo(documentIdentifier,
                                                                  documentIdentifierType,
                                                                  formFieldDocumentId,
                                                                  formFieldIdType,
                                                                  widgetName,
                                                                  counterSignerMemberList);

    widgetCreationRequest.setWidgetCreationInfo(widgetCreationInfo);
    return widgetCreationRequest;
  }

  /**
   * Get widgetCreationInfo object.
   *
   * @param documentIdentifier The identifier of the document.
   * @param documentIdentifierType Type of the documentIdentifier.
   * @param formFieldDocumentId The identifier of the document containing form fields.
   * @param formFieldIdType The type of the form field document.
   * @param widgetName The name of the widget that will be used to identify it.
   * @param counterSignerMemberList List of the email of the counter signers for counter signer set.
   * @return widgetCreationInfo object.
   */
  private static WidgetCreationInfo getWidgetCreationInfo(String documentIdentifier,
                                                          DocumentIdentifierType documentIdentifierType,
                                                          String formFieldDocumentId,
                                                          DocumentIdentifierType formFieldIdType,
                                                          String widgetName,
                                                          ArrayList<String> counterSignerMemberList) {
    WidgetCreationInfo widgetCreationInfo = new WidgetCreationInfo();
    ArrayList<WidgetFileInfo> fileInfos = new ArrayList<>();

    //Based on the document type retrieved from above, set the corresponding parameter.
    WidgetFileInfo fileInfo = getFileInfo(documentIdentifier, documentIdentifierType);
    if(fileInfo != null)
      fileInfos.add(fileInfo);

    //Based on the document type retrieved from above, set the formFieldIdType.

    ArrayList<WidgetFileInfo> formFieldLayerTemplates = new ArrayList<>();
    fileInfo = getFileInfo(formFieldDocumentId, formFieldIdType);
    if(fileInfo != null)
      formFieldLayerTemplates.add(fileInfo);

    widgetCreationInfo.setFormFieldLayerTemplates(formFieldLayerTemplates);
    widgetCreationInfo.setFileInfos(fileInfos);
    widgetCreationInfo.setName(widgetName);
    widgetCreationInfo.setSignatureFlow(WidgetCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);

    if(counterSignerMemberList != null){
      CounterSignerSetInfo counterSignerSetInfo = getCounterSignerSetInfo(counterSignerMemberList);
      ArrayList<CounterSignerSetInfo> counterSignerSetInfos = new ArrayList<>();
      counterSignerSetInfos.add(counterSignerSetInfo);

      widgetCreationInfo.setCounterSignerSetInfos(counterSignerSetInfos);
    }
    return widgetCreationInfo;
  }

  /**
   * Get fileInfos using document.
   *
   * @param documentId Id of document.
   * @return fileInfo object.
   */
  private static WidgetFileInfo getFileInfo(String documentId, DocumentIdentifierType documentIdentifierType) {

    //Create file info object using document id or name
    WidgetFileInfo fileInfo = new WidgetFileInfo();

    if (documentIdentifierType.equals(DocumentIdentifierType.TRANSIENT_DOCUMENT_ID)) {
      fileInfo.setTransientDocumentId(documentId);
    }
    else if(documentIdentifierType.equals(DocumentIdentifierType.LIBRARY_DOCUMENT_ID)){
      fileInfo.setLibraryDocumentId(documentId);
    }
    else if(documentIdentifierType.equals(DocumentIdentifierType.LIBRARY_DOCUMENT_NAME)){
      fileInfo.setLibraryDocumentName(documentId);
    }
    return fileInfo;
  }

  /**
   * Get counterSignerSetInfo object.
   *
   * @param counterSignerMemberList List of the email of the counter signers for counter signer set.
   * @return counterSignerSetInfo object.
   */
  private static CounterSignerSetInfo getCounterSignerSetInfo(ArrayList<String> counterSignerMemberList) {
    CounterSignerSetInfo counterSignerSetInfo = new CounterSignerSetInfo();

    ArrayList<CounterSignerInfo> counterSignerSetMemberInfos = getCounterSignerMemberInfos(counterSignerMemberList);

    counterSignerSetInfo.setCounterSignerSetMemberInfos(counterSignerSetMemberInfos);
    counterSignerSetInfo.setCounterSignerSetRole(CounterSignerSetInfo.CounterSignerSetRoleEnum.SIGNER);

    return counterSignerSetInfo;
  }

  /**
   * Get counterSignerMemberInfo object.
   *
   * @param counterSignerMemberList List of the email of the counter signers for counter signer set.
   * @return counterSignerMemberInfo object.
   */
  private static ArrayList<CounterSignerInfo> getCounterSignerMemberInfos(ArrayList<String> counterSignerMemberList) {

    ArrayList<CounterSignerInfo> counterSignerSetMemberInfos = new ArrayList<CounterSignerInfo>();

    for (String email: counterSignerMemberList) {
      CounterSignerInfo counterSignerInfo = new CounterSignerInfo();
      counterSignerInfo.setEmail(email);
      counterSignerSetMemberInfos.add(counterSignerInfo);
    }
    return counterSignerSetMemberInfos;
  }

  /**
   * Retrieves data entered by the user into interactive form fields at the time they signed the widget
   * CSV file stream containing form data information
   *
   * @param widgetId The widget identifier.
   * @return byte[]
   */
  public static byte[] getWidgetFormData(String widgetId) throws ApiException {
    try {
      byte[] widgetFormaData = widgetsApi.getWidgetFormData(headers,
                                                            widgetId);
      return widgetFormaData;
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_WIDGET_FORM_DATA, e);
      return null;
    }
  }

  /**
   * Retrieves the details of a widget.
   *
   * @param widgetId The widget identifier.
   * @return WidgetInfo
   */
  public static WidgetInfo getWidgetInfo(String widgetId) throws ApiException {
    try {
      WidgetInfo widgetInfo = widgetsApi.getWidgetInfo(headers,
                                                       widgetId);
      return widgetInfo;
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_WIDGET_FORM_DATA, e);
      return  null;
    }
  }

  /**
   * Retrieves widgets for a user.
   *
   * @return UserWidgets
   */
  public static UserWidgets getWidgets() throws ApiException {
    try {
      UserWidgets userWidgets = widgetsApi.getWidgets(headers);
      return userWidgets;
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_WIDGETS, e);
      return null;
    }
  }

  /**
   * Returns id of first widget of user which is enabled.
   *
   * @return String containing id of first widget of the user.
   */
  public static String getFirstWidgetId() throws ApiException{
    try {
      //Get the list of user widgets
      UserWidgets userWidgets = getWidgets();
      List<UserWidget> userWidgetList = userWidgets.getUserWidgetList();

      //Return the id of first widget which is enabled.
      for(UserWidget userWidget : userWidgetList) {
        if(userWidget.getStatus().equals(UserWidget.StatusEnum.ENABLED)) {
          return userWidget.getWidgetId();
        }
      }
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_FIRST_WIDGET, e);
    }
    return null;
  }
}
