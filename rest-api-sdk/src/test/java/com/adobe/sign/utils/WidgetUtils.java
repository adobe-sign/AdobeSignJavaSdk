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
import com.adobe.sign.model.widgets.UserWidget;
import com.adobe.sign.model.widgets.UserWidgets;
import com.adobe.sign.model.widgets.WidgetCreationInfo;
import com.adobe.sign.model.widgets.WidgetCreationRequest;
import com.adobe.sign.model.widgets.WidgetCreationResponse;
import com.adobe.sign.model.widgets.WidgetDocuments;
import com.adobe.sign.model.widgets.WidgetFileInfo;
import com.adobe.sign.model.widgets.WidgetOriginalDocument;
import com.adobe.sign.model.widgets.WidgetURLFileInfo;

public class WidgetUtils extends ApiUtils{
  private static WidgetsApi widgetsApi = new WidgetsApi();
  private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();

  private static String documentId = null;
  private static String widgetId = null;

  public static String getResourceId(String widgetName) throws ApiException {

    if (!isExistingWidget(widgetName))
      widgetId=createWidget(widgetName);

    setDocumentId(widgetId);
    return widgetId;
  }

  // Helper methods

  public static String createWidget(String name) throws ApiException {
    WidgetCreationRequest widgetCreationRequest = getWidgetCreationRequest(name);

    WidgetCreationResponse widgetCreationResponse = widgetsApi.createWidget(headers,
                                                                            widgetCreationRequest);
    widgetId = widgetCreationResponse.getWidgetId();

    return widgetId;
  }

  public static WidgetCreationRequest getWidgetCreationRequest(String documentName) throws ApiException {
    String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
    return getWidgetCreationRequest(TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    transientDocumentId,
                                    TestData.NULL_PARAM,
                                    documentName,
                                    WidgetCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);
  }

  public static WidgetCreationRequest getWidgetCreationRequest(String documentName, WidgetFileInfo fileInfo) {
    return getWidgetCreationRequest(fileInfo.getLibraryDocumentId(),
                                    fileInfo.getLibraryDocumentName(),
                                    fileInfo.getTransientDocumentId(),
                                    fileInfo.getDocumentURL() != null ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM,
                                    documentName,
                                    WidgetCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);
  }

  public static WidgetCreationRequest getWidgetCreationRequest(String documentName, WidgetCreationInfo.SignatureFlowEnum signatureFlowEnum) throws ApiException {

    String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);

    return getWidgetCreationRequest(TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    transientDocumentId,
                                    TestData.NULL_PARAM,
                                    documentName,
                                    signatureFlowEnum);
  }

  public static WidgetCreationRequest getWidgetCreationRequest(String fileInfoLibraryDocumentId,
                                                               String fileInfoLibraryDocumentName,
                                                               String fileInfoTransientDocumentId,
                                                               String fileInfoDocumentUrl,
                                                               String documentName,
                                                               WidgetCreationInfo.SignatureFlowEnum signatureFlowEnum) {

    WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();
    WidgetCreationInfo widgetCreationInfo = new WidgetCreationInfo();

    WidgetFileInfo fileInfo = new WidgetFileInfo();

    fileInfo.setLibraryDocumentId(fileInfoLibraryDocumentId);
    fileInfo.setLibraryDocumentName(fileInfoLibraryDocumentName);
    fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);

    if(fileInfoDocumentUrl != null) {
      WidgetURLFileInfo url = new WidgetURLFileInfo();
      url.setUrl(fileInfoDocumentUrl);
      fileInfo.setDocumentURL(url);
    }

    ArrayList<WidgetFileInfo> fileInfoList = new ArrayList<>();
    fileInfoList.add(fileInfo);

    widgetCreationInfo.setName(documentName);
    widgetCreationInfo.setFileInfos(fileInfoList);
    widgetCreationInfo.setSignatureFlow(signatureFlowEnum);

    widgetCreationRequest.setWidgetCreationInfo(widgetCreationInfo);
    return widgetCreationRequest;
  }


  public static boolean isExistingWidget(String staticWidgetName) throws ApiException {
    UserWidgets userWidgets = widgetsApi.getWidgets(headers);

    for (UserWidget widget : userWidgets.getUserWidgetList()) {
      if (widget.getName().equals(staticWidgetName) && widget.getStatus().equals(UserWidget.StatusEnum.ENABLED)) {
        widgetId = widget.getWidgetId();
        return true;
      }
    }
    return false;
  }

  private static void setDocumentId(String widgetId) throws ApiException {
    WidgetDocuments documentsSubResource = null;

    documentsSubResource = widgetsApi.getWidgetDocuments (headers,
                                                          widgetId,
                                                          TestData.VERSION_ID,
                                                          TestData.PARTICIPANT_EMAIL);
    List<WidgetOriginalDocument> widgetsDocumentsList = documentsSubResource.getDocuments();
    documentId = widgetsDocumentsList.get(0).getDocumentId();
  }

  public static WidgetsApi getWidgetsApi() {
    return widgetsApi;
  }

  public static String getDocumentId() {
    return documentId;
  }

}
