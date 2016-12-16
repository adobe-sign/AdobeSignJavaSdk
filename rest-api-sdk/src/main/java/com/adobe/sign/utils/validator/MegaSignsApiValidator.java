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

import com.adobe.sign.model.megaSigns.FileInfo;
import com.adobe.sign.model.megaSigns.MegaSignCreationInfo;
import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
import com.adobe.sign.model.megaSigns.PostSignOptions;
import com.adobe.sign.model.megaSigns.RecipientInfo;
import com.adobe.sign.model.megaSigns.RecipientSetInfo;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for MegasignsApi. The main purpose of this class is to check the validity of the parameters passed to the megaSign API
 * and throw ApiException with required error messages if the validation fails.
 */
public class MegaSignsApiValidator {

  private static final String MEGA_SIGN_CREATION_REQUEST = "megaSignCreationRequest";
  private static final String MEGA_SIGN_CREATION_INFO = "megasignCreationInfo";
  private static final String NAME = "name";
  private static final String SIGNATURE_TYPE = "signatureType";
  private static final String MEGA_SIGN_STATUS_UPDATE_INFO = "megaSignStatusUpdateInfo";
  private static final String RECIPIENT_SET_MEMBER_INFOS = "recipientSetMemberInfos";

  /**
   * Validator for getMegaSigns API that retrieves all the megaSign parent agreements of the user.
   *
   * @param query The query string used for the search. Multiple search terms can be provided, separated by spaces. Some of the search terms
   *              include document name, participant name or company, and form data
   * @throws ApiException
   */
  public static void getMegaSignsValidator(String query) throws ApiException {

  }

  /**
   * Validator for createMegaSign API that sends an agreement out for signature to multiple recipients
   *
   * @param megaSignCreationRequest Information about the MegaSign agreement that you want to send.
   * @throws ApiException
   */
  public static void createMegaSignValidator(MegaSignCreationRequest megaSignCreationRequest) throws ApiException {


    ApiValidatorHelper.validateParameter(megaSignCreationRequest, MEGA_SIGN_CREATION_REQUEST);

    MegaSignCreationInfo megasignCreationInfo = megaSignCreationRequest.getMegaSignCreationInfo();
    ApiValidatorHelper.validateParameter(megasignCreationInfo, MEGA_SIGN_CREATION_INFO);

    List<FileInfo> fileInfos = megasignCreationInfo.getFileInfos();
    validateFileInfo(fileInfos);

    ApiValidatorHelper.validateParameter(megasignCreationInfo.getName(), NAME);

    validatePostSignOptions(megasignCreationInfo.getPostSignOptions());

    List<RecipientSetInfo> recipientSetInfos = megasignCreationInfo.getRecipientSetInfos();
    if (recipientSetInfos != null)
      validateRecipientSetInfos(recipientSetInfos);

    ApiValidatorHelper.validateParameter(megasignCreationInfo.getSignatureType(), SIGNATURE_TYPE);
  }

  /**
   * Validator for getMegaSignInfo API that retrieves the detailed information of the specified megaSign parent agreement.
   *
   * @param megaSignId The Id of megaSign whose information is to be retrieved.
   * @throws ApiException
   */
  public static void getMegaSignInfoValidator(String megaSignId) throws ApiException {
    ApiValidatorHelper.validateId(megaSignId,
                                  SdkErrorCodes.INVALID_MEGASIGN_ID);
  }

  /**
   * Validator for getMegaSignChildAgreements API that retrieves all the child agreements of the specified megaSign parent agreement.
   *
   * @param megaSignId The Id of megaSign whose child agreements are to be retrieved.
   * @throws ApiException
   */
  public static void getMegaSignChildAgreementsValidator(String megaSignId) throws ApiException {
    ApiValidatorHelper.validateId(megaSignId,
                                  SdkErrorCodes.INVALID_MEGASIGN_ID);
  }

  /**
   * Validator for getMegaSignFormData API that retrieves data entered by recipients into interactive form fields at the time they signed the
   * child agreements of the specified MegaSign agreement.
   *
   * @param megaSignId The agreementId of agreement whose form data is to be retrieved.
   * @throws ApiException
   */
  public static void getMegaSignFormDataValidator(String megaSignId) throws ApiException {
    ApiValidatorHelper.validateId(megaSignId,
                                  SdkErrorCodes.INVALID_MEGASIGN_ID);
  }

  /**
   * Validator for updateMegaSignStatus API that cancels all the child agreements of the specified MegaSign agreement.
   *
   * @param megaSignId               The Id of megaSign whose status is to be cancelled.
   * @param megaSignStatusUpdateInfo megaSign status update information object.
   * @throws ApiException
   */
  public static void updateMegaSignStatusValidator(String megaSignId,
                                                   MegaSignStatusUpdateInfo megaSignStatusUpdateInfo) throws ApiException {
    ApiValidatorHelper.validateId(megaSignId,
                                  SdkErrorCodes.INVALID_MEGASIGN_ID);
    ApiValidatorHelper.validateParameter(megaSignStatusUpdateInfo, MEGA_SIGN_STATUS_UPDATE_INFO);
    String updateValue = megaSignStatusUpdateInfo.getValue() == null ? "" : megaSignStatusUpdateInfo.getValue().toString();
    ApiValidatorHelper.validateParameter(updateValue,
                                         SdkErrorCodes.INVALID_MEGASIGN_STATUS);
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

      ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetMemberInfos(), RECIPIENT_SET_MEMBER_INFOS);
      List<RecipientInfo> recipientInfos = recipientSetInfo.getRecipientSetMemberInfos();
      int numberOfRecipients = recipientInfos.size();

      if (recipientSetInfo.getRecipientSetMemberInfos().size() > 1) {
        throw new ApiException(SdkErrorCodes.RECIPIENT_SET_NOT_SUPPORTED);
      }
      for (RecipientInfo recipientInfo : recipientInfos)
        ApiValidatorHelper.validateRecipientSetInfos(recipientInfo.getEmail(), recipientInfo.getFax(), numberOfRecipients);
    }
  }

  /**
   * Helper method that checks the validity of post sign options
   */
  public static void validatePostSignOptions(PostSignOptions postSignOptions) throws ApiException {
    if (postSignOptions == null)
      return;
    ApiValidatorHelper.validatePostSignOptions(postSignOptions.getRedirectUrl(), postSignOptions.getRedirectDelay());
  }

}
