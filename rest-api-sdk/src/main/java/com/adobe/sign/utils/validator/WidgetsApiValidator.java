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

import com.adobe.sign.model.widgets.CounterSignerInfo;
import com.adobe.sign.model.widgets.CounterSignerSetInfo;
import com.adobe.sign.model.widgets.WidgetCreationInfo;
import com.adobe.sign.model.widgets.WidgetCreationRequest;
import com.adobe.sign.model.widgets.WidgetFileInfo;
import com.adobe.sign.model.widgets.WidgetPersonalizationInfo;
import com.adobe.sign.model.widgets.WidgetStatusUpdateInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.StringUtil;

/**
 * Validator class for WidgetsApi. The main purpose of this class is to check the validity of the parameters passed to the widgets API
 * and throw ApiException with required error messages if the validation fails.
 */
public class WidgetsApiValidator {

  /**
   * Validator for getWidgets API that retrieves widgets for the user.
   *
   * @throws ApiException
   */
  public static void getWidgetsValidator() throws ApiException {
  }

  /**
   * Validator for createWidget API that Creates a widget and returns the Javascript snippet and URL
   * to access the widget and widgetID in response to the client.
   *
   * @param widgetCreationRequest Information about the widget that is to be created.
   * @throws ApiException
   */
  public static void createWidgetValidator(WidgetCreationRequest widgetCreationRequest) throws ApiException {


    ApiValidatorHelper.validateParameter(widgetCreationRequest);

    WidgetCreationInfo widgetCreationInfo = widgetCreationRequest.getWidgetCreationInfo();
    ApiValidatorHelper.validateParameter(widgetCreationInfo);

    List<WidgetFileInfo> fileInfos = widgetCreationInfo.getFileInfos();
    validateFileInfo(fileInfos);

    ApiValidatorHelper.validateParameter(widgetCreationInfo.getName());

    if (widgetCreationInfo.getSignatureFlow() != null)
      ApiValidatorHelper.validateParameter(widgetCreationInfo.getSignatureFlow(),
                                           SdkErrorCodes.INVALID_SIGNATURE_FLOW);

    List<CounterSignerSetInfo> counterSignerSetInfo = widgetCreationInfo.getCounterSignerSetInfos();
    if (counterSignerSetInfo != null)
      validateCounterSignerSetInfo(counterSignerSetInfo);
  }

  /**
   * Validator for getWidgetInfo API that retrieves the detailed information of a widget.
   *
   * @param widgetId The Id of the widget whose status is to be retrieved.
   * @throws ApiException
   */
  public static void getWidgetInfoValidator(String widgetId) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
  }

  /**
   * Validator for getWidgetAgreements API that retrieves the agreements of a widget.
   *
   * @param widgetId The Id of the widget whose agreements are to be retrieved.
   * @throws ApiException
   */
  public static void getWidgetAgreementsValidator(String widgetId) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
  }

  /**
   * Validator for getWidgetAuditTrail API that retrieves the audit trail of the widget identified by widgetId.
   *
   * @param widgetId The Id of the widget whose audit trail is to be retrieved.
   * @throws ApiException
   */
  public static void getWidgetAuditTrailValidator(String widgetId) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
  }

  /**
   * Validator for getWidgetCombinedDocument API that gets a single combined PDF document for the documents associated with a widget.
   *
   * @param widgetId         The Id of widget whose combined document stream is requested.
   * @param versionId        The version identifier of widget as provided by getWidgetInfo API. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve documents.
   * @param auditReport      When set to YES, attach an audit report to the signed Widget PDF. Default value is false
   * @throws ApiException
   */
  public static void getWidgetCombinedDocumentValidator(String widgetId,
                                                        String versionId,
                                                        String participantEmail,
                                                        Boolean auditReport) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for getWidgetDocuments API that retrieves the IDs of all the main and supporting documents of a widget identified by widgetId.
   *
   * @param widgetId         The Id of widget whose documents are requested.
   * @param versionId        The version identifier of agreement as provided by getWidgetInfo API. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve documents.
   * @throws ApiException
   */
  public static void getWidgetDocumentsValidator(String widgetId,
                                                 String versionId,
                                                 String participantEmail) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for getWidgetDocumentInfo API that retrieves the file stream of the given document of a widget identified by widgetId.
   *
   * @param widgetId   The Id of widget which contains the document whose file stream is requested.
   * @param documentId The Id of the document whose file stream is requested.
   * @throws ApiException
   */
  public static void getWidgetDocumentInfoValidator(String widgetId,
                                                    String documentId) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
    ApiValidatorHelper.validateId(documentId,
                                  SdkErrorCodes.INVALID_DOCUMENT_ID);
  }

  /**
   * Validator for getWidgetFormData API that retrieves data entered by the user into interactive form fields at the time they signed the widget.
   *
   * @param widgetId The Id of widget whose form data is to be retrieved.
   * @throws ApiException
   */
  public static void getWidgetFormDataValidator(String widgetId) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
  }

  /**
   * Validator for updateWidgetPersonalize API that personalize the widget to a signable document for a specific known user.
   *
   * @param widgetId                  The Id of widget that has to be personalized.
   * @param widgetPersonalizationInfo Widget personalization information object.
   * @throws ApiException
   */
  public static void updateWidgetPersonalizeValidator(String widgetId,
                                                      WidgetPersonalizationInfo widgetPersonalizationInfo) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
    ApiValidatorHelper.validateParameter(widgetPersonalizationInfo);
    ApiValidatorHelper.validateEmailParamater(widgetPersonalizationInfo.getEmail());
  }

  /**
   * Validator for updateWidgetStatus API that enables or disables a widget.
   *
   * @param widgetId               The Id of widget that has to be updated.
   * @param widgetStatusUpdateInfo Widget status update information object.
   * @throws ApiException
   */
  public static void updateWidgetStatusValidator(String widgetId,
                                                 WidgetStatusUpdateInfo widgetStatusUpdateInfo) throws ApiException {
    ApiValidatorHelper.validateId(widgetId,
                                  SdkErrorCodes.INVALID_WIDGET_ID);
    ApiValidatorHelper.validateParameter(widgetStatusUpdateInfo);
    ApiValidatorHelper.validateParameter(widgetStatusUpdateInfo.getValue(),
                                         SdkErrorCodes.MUST_PROVIDE_VALID_WIDGET_STATUS);

    //validate the message and redirectUrl combination.
    String message = widgetStatusUpdateInfo.getMessage();
    String redirectUrl = widgetStatusUpdateInfo.getRedirectUrl();

    if (!StringUtil.isEmpty(message) && !StringUtil.isEmpty(redirectUrl))
      throw new ApiException(SdkErrorCodes.TOO_MANY_ACTIONS_SPECIFIED);

    if (StringUtil.isEmpty(message) && StringUtil.isEmpty(redirectUrl))
      throw new ApiException(SdkErrorCodes.NO_ACTION_SPECIFIED);

    if (!StringUtil.isEmpty(redirectUrl))
      ApiValidatorHelper.validateUrlParameter(redirectUrl,
                                              SdkErrorCodes.INVALID_URL);
  }

  /**
   * Helper method that takes a list of FileInfo objects and validates them.
   */
  private static void validateFileInfo(List<WidgetFileInfo> fileInfos) throws ApiException {
    if (fileInfos == null)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

    for (WidgetFileInfo fileInfo : fileInfos) {
      // Validating the FileInfo object.
      if (fileInfo == null)
        throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

      String url = fileInfo.getDocumentURL() == null ? null : fileInfo.getDocumentURL().getUrl();
      ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(),
                                          fileInfo.getLibraryDocumentId(),
                                          fileInfo.getLibraryDocumentName(),
                                          fileInfo.getTransientDocumentId(),
                                          url);
    }
  }

  /**
   * Helper method to validate recipient set.
   */
  private static void validateCounterSignerSetInfo(List<CounterSignerSetInfo> counterSignerSetInfos) throws ApiException {
    for (CounterSignerSetInfo counterSignerSetInfo : counterSignerSetInfos) {

      ApiValidatorHelper.validateParameter(counterSignerSetInfo.getCounterSignerSetMemberInfos());
      List<CounterSignerInfo> counterSignerInfos = counterSignerSetInfo.getCounterSignerSetMemberInfos();
      int numberOfRecipients = counterSignerInfos.size();

      for (CounterSignerInfo counterSignerInfo : counterSignerInfos)
        ApiValidatorHelper.validateRecipientSetInfos(counterSignerInfo.getEmail(), null, numberOfRecipients);

      ApiValidatorHelper.validateParameter(counterSignerSetInfo.getCounterSignerSetRole());
    }
  }

}
