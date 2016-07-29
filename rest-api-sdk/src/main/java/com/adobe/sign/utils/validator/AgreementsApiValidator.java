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

import com.adobe.sign.model.agreements.AgreementCreationInfo;
import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;
import com.adobe.sign.model.agreements.AlternateParticipantInfo;
import com.adobe.sign.model.agreements.DocumentCreationInfo;
import com.adobe.sign.model.agreements.FileInfo;
import com.adobe.sign.model.agreements.InteractiveOptions;
import com.adobe.sign.model.agreements.PostSignOptions;
import com.adobe.sign.model.agreements.RecipientInfo;
import com.adobe.sign.model.agreements.RecipientSetInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.StringUtil;

/**
 * Validator class for AgreementsApi. The main purpose of this class is to check the validity of the parameters passed to the agreements API
 * and throw ApiException with required error messages if the validation fails.
 */
public class AgreementsApiValidator {

  /**
   * Validator for getAgreements API that retrieves agreements for the user.
   *
   * @param query             The query string used for the search.
   * @param externalId        ExternalID for which you would like to retrieve agreement information.
   * @param externalGroup     ExternalGroup for which you would like to retrieve agreement information.
   * @param externalNamespace ExternalNameSpace for which you would like to retrieve agreement information.
   * @throws ApiException
   */
  public static void getAgreementsValidator(String query,
                                            String externalId,
                                            String externalGroup,
                                            String externalNamespace) throws ApiException {
    if (!StringUtil.isEmpty(externalNamespace) || !StringUtil.isEmpty(externalGroup) || !StringUtil.isEmpty(externalId))
      ApiValidatorHelper.validateId(externalId,
                                    SdkErrorCodes.EMPTY_EXTERNALID_PARAMETER);
  }

  /**
   * Validator for createAgreement API that creates an agreement, sends it out for signatures and
   * returns the agreementID in the response to the client
   *
   * @param agreementCreationInfo Information about the agreement that is to be created.
   * @throws ApiException
   */
  public static void createAgreementValidator(AgreementCreationInfo agreementCreationInfo) throws ApiException {
    ApiValidatorHelper.validateParameter(agreementCreationInfo);

    DocumentCreationInfo documentCreationInfo = agreementCreationInfo.getDocumentCreationInfo();
    ApiValidatorHelper.validateParameter(documentCreationInfo);

    List<FileInfo> fileInfos = documentCreationInfo.getFileInfos();
    validateFileInfo(fileInfos);

    ApiValidatorHelper.validateParameter(documentCreationInfo.getName());

    validatePostSignOptions(documentCreationInfo.getPostSignOptions());

    ApiValidatorHelper.validateParameter(documentCreationInfo.getRecipientSetInfos());

    List<RecipientSetInfo> recipientSetInfos = documentCreationInfo.getRecipientSetInfos();
    validateRecipientSetInfos(recipientSetInfos);

    validateInteractiveOptions(agreementCreationInfo);

    ApiValidatorHelper.validateParameter(documentCreationInfo.getSignatureType());
  }

  /**
   * Validator for getAgreementInfo API that retrieves the detailed information of an agreement.
   *
   * @param agreementId The agreementId of agreement whose status is to be retrieved.
   * @throws ApiException
   */
  public static void getAgreementInfoValidator(String agreementId) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for deleteAgreement API that deletes an agreement
   *
   * @param agreementId The agreementId of agreement which has to be deleted.
   * @throws ApiException
   */
  public static void deleteAgreementValidator(String agreementId) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for getAuditTrail API that retrieves the audit trail of an agreement identified by agreementid.
   *
   * @param agreementId The agreementId of agreement whose audit trail is to be retrieved.
   * @throws ApiException
   */
  public static void getAuditTrailValidator(String agreementId) throws ApiException {

    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for getCombinedDocument API that gets a single combined PDF document for the documents associated with an agreement.
   *
   * @param agreementId               The agreementId of agreement whose combined document stream is requested.
   * @param versionId                 The version identifier of agreement as provided by getAgreementInfo API. If not provided then latest version will be used.
   * @param participantEmail          The email address of the participant to be used to retrieve documents.
   * @param attachSupportingDocuments When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
   * @param auditReport               When set to true, attach an audit report to the signed agreement PDF. Default value is false.
   * @throws ApiException
   */
  public static void getCombinedDocumentValidator(String agreementId,
                                                  String versionId,
                                                  String participantEmail,
                                                  boolean attachSupportingDocuments,
                                                  boolean auditReport) throws ApiException {

    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for getCombinedDocumentPagesInfo API that retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
   *
   * @param agreementId                         The agreementId of agreement which contains the documents whose information is requested.
   * @param includeSupportingDocumentsPagesInfo When set to true, returns info of all pages of supporting documents as well. Else, return only original document's pages' info.
   * @throws ApiException
   */
  public static void getCombinedDocumentPagesInfoValidator(String agreementId,
                                                           boolean includeSupportingDocumentsPagesInfo) throws ApiException {

    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for getCombinedDocumentUrl API that retrieves url of all visible pages of all the documents associated with an agreement
   *
   * @param agreementId               The agreementId of agreement which contained the documents whose combined url is requested.
   * @param versionId                 The version identifier of agreement as provided by getAgreementInfo API. If not provided then latest version will be used.
   * @param participantEmail          The email address of the participant to be used to retrieve its document url.
   * @param attachSupportingDocuments When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
   * @param auditReport               When set to true, attach an audit report to the signed agreement PDF. Default value is false.
   * @throws ApiException
   */
  public static void getCombinedDocumentUrlValidator(String agreementId,
                                                     String versionId,
                                                     String participantEmail,
                                                     boolean attachSupportingDocuments,
                                                     boolean auditReport) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for getAllDocuments API that retrieves the IDs of all the main and supporting documents of an agreement identified by agreementid.
   *
   * @param agreementId                     The agreementId of agreement whose documents are requested.
   * @param versionId                       The version identifier of agreement as provided by getAgreementInfo API. If not provided then latest version will be used.
   * @param participantEmail                The email address of the participant to be used to retrieve documents.
   * @param supportingDocumentContentFormat Content format of the supported documents.
   * @throws ApiException
   */
  public static void getAllDocumentsValidator(String agreementId,
                                              String versionId,
                                              String participantEmail,
                                              String supportingDocumentContentFormat) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for deleteDocuments API that deletes all the documents of an agreement
   *
   * @param agreementId The agreementId of agreement whose documents have to be deleted.
   * @throws ApiException
   */
  public static void deleteDocumentsValidator(String agreementId) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for getCombinedDocumentImageUrls API that retrieves image urls of all visible pages of a document associated with an agreement.
   *
   * @param agreementId                         The agreementId of agreement which contains the documents whose imageUrls are requested.
   * @param versionId                           The version identifier of agreement as provided by getAgreementInfo API. If not provided then latest version will be used.
   * @param participantEmail                    The email address of the participant to be used to retrieve its visible document pages' image urls.
   * @param imageSizes                          A comma separated list of image sizes.
   * @param includeSupportingDocumentsImageUrls When set to true, returns image urls of supporting documents as well. Else, return only original document's image urls.
   * @param showImageAvailabilityOnly           When set to true, returns only image availability. Else, returns both image urls and its availability.
   * @throws ApiException
   */
  public static void getCombinedDocumentImageUrlsValidator(String agreementId,
                                                           String versionId,
                                                           String participantEmail,
                                                           String imageSizes,
                                                           boolean includeSupportingDocumentsImageUrls,
                                                           boolean showImageAvailabilityOnly) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for getDocument API that retrieves the file stream of a document of an agreement.
   *
   * @param agreementId The agreementId of agreement which contains the document whose file stream is requested.
   * @param documentId  The Id of the document whose file stream is requested.
   * @throws ApiException
   */
  public static void getDocumentValidator(String agreementId,
                                          String documentId) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateId(documentId,
                                  SdkErrorCodes.INVALID_DOCUMENT_ID);
  }

  /**
   * Validator for getDocumentImageUrls API that retrieves image urls of all visible pages of a document associated with an agreement.
   *
   * @param agreementId               The Id of agreement which contains the document whose imageUrls are requested.
   * @param documentId                The Id of document whose imageUrls are requested.
   * @param versionId                 The version identifier of agreement as provided by getAgreementInfo API. If not provided then latest version will be used.
   * @param participantEmail          The email address of the participant to be used to retrieve its visible document pages' image urls.
   * @param imageSizes                A comma separated list of image sizes.
   * @param showImageAvailabilityOnly When set to true, returns only image availability. Else, returns both image urls and its availability.
   * @param startPage                 Start of page number range for which imageUrls are requested. Starting page number should be greater than 0.
   * @param endPage                   End of page number range for which imageUrls are requested.
   * @throws ApiException
   */
  public static void getDocumentImageUrlsValidator(String agreementId,
                                                   String documentId,
                                                   String versionId,
                                                   String participantEmail,
                                                   String imageSizes,
                                                   boolean showImageAvailabilityOnly,
                                                   Integer startPage,
                                                   Integer endPage) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
    ApiValidatorHelper.validateId(documentId,
                                  SdkErrorCodes.INVALID_DOCUMENT_ID);
  }


  /**
   * Validator for getDocument API that retrieves the url of the document.
   *
   * @param agreementId      The agreementId of agreement which contained the document whose url are requested.
   * @param documentId       The Id of the document whose url is requested.
   * @param versionId        The version identifier of agreement as provided by getAgreementInfo API. If not provided then latest version will be used.
   * @param participantEmail The email address of the participant to be used to retrieve its visible document pages' image urls.
   * @throws ApiException
   */
  public static void getDocumentUrlValidator(String agreementId,
                                             String documentId,
                                             String versionId,
                                             String participantEmail) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateId(documentId,
                                  SdkErrorCodes.INVALID_DOCUMENT_ID);
    ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
  }

  /**
   * Validator for getFormData API that retrieves data entered by the user into interactive form fields at the time they signed the agreement
   *
   * @param agreementId The agreementId of agreement whose form data is to be retrieved.
   * @throws ApiException
   */
  public static void getFormDataValidator(String agreementId) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for createAlternateParticipant API that creates a new alternate participant.
   *
   * @param agreementId              The agreementId of agreement for which a participant is to be created.
   * @param participantSetId         The participant set identifier.
   * @param participantId            The participant identifier.
   * @param alternateParticipantInfo Information about the alternate participant.
   * @throws ApiException
   */
  public static void createAlternateParticipantValidator(String agreementId,
                                                         String participantSetId,
                                                         String participantId,
                                                         AlternateParticipantInfo alternateParticipantInfo) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);

    ApiValidatorHelper.validateId(participantId,
                                  SdkErrorCodes.INVALID_PARTICIPANT_ID);
    ApiValidatorHelper.validateId(participantSetId,
                                  SdkErrorCodes.INVALID_PARTICIPANT_SET_ID);

    ApiValidatorHelper.validateParameter(alternateParticipantInfo);

    ApiValidatorHelper.validateParameter(alternateParticipantInfo.getEmail());
    ApiValidatorHelper.validateEmailParamater(alternateParticipantInfo.getEmail());

    ApiValidatorHelper.validateParameter(alternateParticipantInfo.getPrivateMessage(),
                                         SdkErrorCodes.EMPTY_PRIVATE_MESSAGE);
  }

  /**
   * Validator for getSigningUrl API that retrieves the URL for the eSign page for the current signer(s) of an agreement.
   *
   * @param agreementId The agreementId of agreement whose signing Url is to be retrieved.
   * @throws ApiException
   */
  public static void getSigningUrlValidator(String agreementId) throws ApiException {
    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
  }

  /**
   * Validator for updateStatus API that cancels an agreement.
   *
   * @param agreementId               The agreementId of agreement to be cancelled.
   * @param agreementStatusUpdateInfo Agreement status update information object.
   * @throws ApiException
   */
  public static void updateStatusValidator(String agreementId,
                                           AgreementStatusUpdateInfo agreementStatusUpdateInfo) throws ApiException {

    ApiValidatorHelper.validateId(agreementId,
                                  SdkErrorCodes.INVALID_AGREEMENT_ID);
    ApiValidatorHelper.validateParameter(agreementStatusUpdateInfo);
    ApiValidatorHelper.validateParameter(agreementStatusUpdateInfo.getValue(),
                                         SdkErrorCodes.MUST_PROVIDE_VALID_AGREEMENT_STATUS);
  }

  /**
   * Helper method to validate the Interactive Options with RecipientSetSize.
   */
  private static void validateInteractiveOptions(AgreementCreationInfo agreementCreationInfo) throws ApiException {
    List<RecipientSetInfo> recipientSetInfos = agreementCreationInfo.getDocumentCreationInfo().getRecipientSetInfos();
    InteractiveOptions interactiveOptions = agreementCreationInfo.getOptions();

    if (interactiveOptions == null)
      return;

    for (RecipientSetInfo recipientSetInfo : recipientSetInfos) {

      ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetMemberInfos());
      int numberOfRecipients = recipientSetInfo.getRecipientSetMemberInfos().size();

      if ((interactiveOptions.getAuthoringRequested() || interactiveOptions.getSendThroughWeb()) && numberOfRecipients > 1)
        throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);
    }
  }

  /**
   * Helper method that takes a list of FileInfo objects and validates them.
   */
  private static void validateFileInfo(List<FileInfo> fileInfos) throws ApiException {
    if (fileInfos == null)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

    for (FileInfo fileInfo : fileInfos) {
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
  private static void validateRecipientSetInfos(List<RecipientSetInfo> recipientSetInfos) throws ApiException {

    for (RecipientSetInfo recipientSetInfo : recipientSetInfos) {

      ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetMemberInfos());
      List<RecipientInfo> recipientInfos = recipientSetInfo.getRecipientSetMemberInfos();
      int numberOfRecipients = recipientInfos.size();

      for (RecipientInfo recipientInfo : recipientInfos) {
        ApiValidatorHelper.validateRecipientSetInfos(recipientInfo.getEmail(), recipientInfo.getFax(), numberOfRecipients);
      }
      ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetRole());
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
