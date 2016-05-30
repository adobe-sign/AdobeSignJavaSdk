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

import com.adobe.sign.api.WorkflowsApi;
import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
import com.adobe.sign.model.workflows.DocumentCreationInfo;
import com.adobe.sign.model.workflows.PostSignOptions;
import com.adobe.sign.model.workflows.RecipientInfo;
import com.adobe.sign.model.workflows.RecipientsInfo;

public class WorkFlowUtils extends ApiUtils{
  private static WorkflowsApi workflowsApi = new WorkflowsApi();

  public static String getResourceId() throws ApiException {
    return TestData.WORKFLOW_ID;
  }

  public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String documentName) throws ApiException {

    return  getCustomWorkflowAgreementCreationRequest(TestData.POST_EMAIL,
                                                      TestData.NULL_PARAM,
                                                      TestData.NULL_PARAM,
                                                      TestData.TRANSIENT_DOCUMENT_NAME,
                                                      getTransientDocumentId(),
                                                      documentName,
                                                      null);
  }

  public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String documentName,
                                                                                                 PostSignOptions options) throws ApiException {
    return getCustomWorkflowAgreementCreationRequest (TestData.POST_EMAIL,
                                                      TestData.NULL_PARAM,
                                                      TestData.NULL_PARAM,
                                                      TestData.TRANSIENT_DOCUMENT_NAME,
                                                      getTransientDocumentId(),
                                                      documentName,
                                                      options);
  }

  public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(CustomWorkflowFileInfo fileInfo,
                                                                                                 String documentName) {
    return getCustomWorkflowAgreementCreationRequest (TestData.POST_EMAIL,
                                                      TestData.NULL_PARAM,
                                                      fileInfo.getWorkflowLibraryDocumentId(),
                                                      fileInfo.getName(),
                                                      fileInfo.getTransientDocumentId(),
                                                      documentName,
                                                      null);
  }

  public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String documentName,
                                                                                                 String recipientEmail,
                                                                                                 String recipientFax) throws ApiException {
    return getCustomWorkflowAgreementCreationRequest (recipientEmail,
                                                      recipientFax,
                                                      TestData.NULL_PARAM,
                                                      TestData.TRANSIENT_DOCUMENT_NAME,
                                                      getTransientDocumentId(),
                                                      documentName,
                                                      null);
  }

  public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String recipientEmail,
                                                                                                 String recipientFax,
                                                                                                 String fileInfoLibraryDocumentId,
                                                                                                 String fileInfoName,
                                                                                                 String fileInfoTransientDocumentId,
                                                                                                 String documentName,
                                                                                                 PostSignOptions options) {

    CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest = new CustomWorkflowAgreementCreationRequest();
    DocumentCreationInfo documentCreationInfo = new DocumentCreationInfo();

    RecipientInfo recipientInfo = new RecipientInfo();
    recipientInfo.setEmail(recipientEmail);
    recipientInfo.setFax(recipientFax);

    List<RecipientInfo> recipientInfoList = new ArrayList<RecipientInfo>();
    recipientInfoList.add(recipientInfo);

    RecipientsInfo recipientsInfo = new RecipientsInfo();
    recipientsInfo.setRecipients(recipientInfoList);
    recipientsInfo.setName(TestData.WORKFLOW_RECIPIENT_INFO_NAME);

    ArrayList<RecipientsInfo> recipientsInfoList = new ArrayList<>();
    recipientsInfoList.add(recipientsInfo);

    CustomWorkflowFileInfo fileInfo = new CustomWorkflowFileInfo();
    fileInfo.setWorkflowLibraryDocumentId(fileInfoLibraryDocumentId);
    fileInfo.setName(fileInfoName);
    fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);

    ArrayList<CustomWorkflowFileInfo> fileInfoList = new ArrayList<>();
    fileInfoList.add(fileInfo);

    documentCreationInfo.setName(documentName);
    documentCreationInfo.setRecipientsListInfo(recipientsInfoList);

    documentCreationInfo.setFileInfos(fileInfoList);
    documentCreationInfo.setPostSignOptions(options);

    customWorkflowAgreementCreationRequest.setDocumentCreationInfo(documentCreationInfo);

    return customWorkflowAgreementCreationRequest;
  }

  public static WorkflowsApi getWorkflowsApi() {
    return workflowsApi;
  }

  private static String getTransientDocumentId() throws ApiException {
    return TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
  }

}
