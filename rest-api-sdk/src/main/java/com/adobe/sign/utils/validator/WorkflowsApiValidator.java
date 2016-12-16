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
package com.adobe.sign.utils.validator;

import java.util.List;

import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
import com.adobe.sign.model.workflows.DocumentCreationInfo;
import com.adobe.sign.model.workflows.PostSignOptions;
import com.adobe.sign.model.workflows.RecipientInfo;
import com.adobe.sign.model.workflows.RecipientsInfo;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for WorkflowsApi. The main purpose of this class is to check the validity of the parameters passed to
 * the Workflows API and throw ApiException with required error messages if the validation fails.
 */
public class WorkflowsApiValidator {

  private static final String CUSTOM_WORKFLOW_AGREEMENT_CREATION_REQUEST = "customWorkflowAgreementCreationRequest";
  private static final String DOCUMENT_CREATION_INFO = "documentCreationInfo";
  private static final String NAME = "name";
  private static final String RECIPIENTS = "recipients";

  /**
   * Validator for getWorkflows API that retrieves workflows for a user.
   *
   * @param includeDraftWorkflows Include draft workflows.
   * @param groupId               The group identifier for which the workflows will be fetched
   * @throws ApiException
   */
  public static void getWorkflowsValidator(Boolean includeDraftWorkflows,
                                           String groupId) throws ApiException {

    if (groupId != null)
      ApiValidatorHelper.validateId(groupId,
                                    SdkErrorCodes.INVALID_GROUP_ID);
  }

  /**
   * Validator for getWorkflowInfo API that retrieves the details of a workflow.
   *
   * @param workflowId The workflow identifier, as provided by getWorkflows API.
   * @throws ApiException
   */
  public static void getWorkflowInfoValidator(String workflowId) throws ApiException {
    ApiValidatorHelper.validateId(workflowId,
                                  SdkErrorCodes.INVALID_WORKFLOW_ID);
  }

  /**
   * Validator for createWorkflowAgreement API that creates an agreement, sends it out for signatures,
   * and returns the agreementID in the response to the client.
   *
   * @param workflowId                             The workflow identifier, as provided by getWorkflows API.
   * @param customWorkflowAgreementCreationRequest Information about the agreement that you want to
   *                                               send and authoring options that you want to apply at the time of sending.
   * @throws ApiException
   */
  public static void createWorkflowAgreementValidator(String workflowId,
                                                      CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest) throws ApiException {
    ApiValidatorHelper.validateId(workflowId,
                                  SdkErrorCodes.INVALID_WORKFLOW_ID);

    ApiValidatorHelper.validateParameter(customWorkflowAgreementCreationRequest, CUSTOM_WORKFLOW_AGREEMENT_CREATION_REQUEST);

    DocumentCreationInfo documentCreationInfo = customWorkflowAgreementCreationRequest.getDocumentCreationInfo();
    ApiValidatorHelper.validateParameter(documentCreationInfo, DOCUMENT_CREATION_INFO);
    ApiValidatorHelper.validateParameter(documentCreationInfo.getName(), NAME);

    List<CustomWorkflowFileInfo> fileInfos = documentCreationInfo.getFileInfos();
    if (fileInfos == null)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

    for (CustomWorkflowFileInfo fileInfo : fileInfos) {
      // Validating the FileInfo object.
      if (fileInfo == null)
        throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

      ApiValidatorHelper.validateParameter(fileInfo.getName(),
                                           SdkErrorCodes.FILE_INFO_NAME_MISSING);

      if (fileInfo.getTransientDocumentId() != null)
        ApiValidatorHelper.validateId(fileInfo.getTransientDocumentId(),
                                      SdkErrorCodes.INVALID_TRANSIENTDOCUMENT_ID);

      if (fileInfo.getWorkflowLibraryDocumentId() != null)
        ApiValidatorHelper.validateId(fileInfo.getWorkflowLibraryDocumentId(),
                                      SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
    }
    validatePostSignOptions(documentCreationInfo.getPostSignOptions());

    List<RecipientsInfo> recipientSetInfos = documentCreationInfo.getRecipientsListInfo();
    validateRecipientSetInfos(recipientSetInfos);

  }

  /**
   * Helper method to validate recipient set.
   */
  private static void validateRecipientSetInfos(List<RecipientsInfo> recipientSetInfos) throws ApiException {

    for (RecipientsInfo recipientSetInfo : recipientSetInfos) {
      ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipients(), RECIPIENTS);
      List<RecipientInfo> recipientInfos = recipientSetInfo.getRecipients();
      int numberOfRecipients = recipientInfos.size();

      for (RecipientInfo recipientInfo : recipientInfos)
        ApiValidatorHelper.validateWorkflowRecipientSetInfos(recipientInfo.getEmail(), recipientInfo.getFax(), numberOfRecipients);
    }
  }

  /**
   * Helper method that checks the validity of post sign options
   */
  private static void validatePostSignOptions(PostSignOptions postSignOptions) throws ApiException {
    if (postSignOptions == null)
      return;
    ApiValidatorHelper.validatePostSignOptions(postSignOptions.getRedirectUrl(), postSignOptions.getRedirectDelay());
  }
}
