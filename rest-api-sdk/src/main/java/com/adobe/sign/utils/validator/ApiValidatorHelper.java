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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.StringUtil;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.UrlValidator;

/**
 * Utility class for handling the validations of the common and generic parameters used in different ApiValidator classes.
 */
public class ApiValidatorHelper {

  /**
   * Private string constants.
   */
  private static final String X_API_USER_USER_ID_FORMAT_BEGINNING = "userid:";
  private static final String X_API_USER_EMAIL_ID_FORMAT_BEGINNING = "email:";
  private static final String ACCESS_TOKEN_KEY = "Access-Token";
  private static final String X_API_USER_KEY = "x-api-user";
  private static final String FAX = "fax";
  private static final String COMMA = " , ";
  private static final String EMAIL = "email";
  /**
   * Common method for validating header parameters, which are used in all the API's.
   *
   * @param headerParams Map containing headers parameters including accessToken of the API caller and userId or email of the API caller.
   * @throws ApiException
   */
  public static void validateHeaderParams(MultivaluedMap headerParams) throws ApiException {
    Set<String> keys = headerParams.keySet();
    boolean accessToken = false;

    for (String key : keys) {
      if(key.equalsIgnoreCase(ACCESS_TOKEN_KEY)) {
        validateAccessToken(headerParams.get(key));
        accessToken = true;
      }
      else if(key.equalsIgnoreCase(X_API_USER_KEY)) {
        validateXApiUser(headerParams.get(key));
      }
    }
    if(!accessToken) {
      throw new ApiException(SdkErrorCodes.NO_ACCESS_TOKEN_HEADER);
    }
  }

  /**
   * Function to validate a list of mandatory parameters.
   *.
   * @param hashMap The parameter List from which every parameter needs to be validated.
   * @throws ApiException
   */
  public static void validateRequiredParameters(HashMap hashMap) throws ApiException {
    Set<String> keys = hashMap.keySet();
    for (String key : keys) {
      validateParameter(hashMap.get(key),key);
    }
  }

  /**
   * A generic helper function  that can accept any type of parameter and validate it.
   *
   * @param param The parameter that needs to be validated.
   * @throws ApiException
   */

  public static <T> void validateParameter(T param ,String missingField) throws ApiException {
    validateParameter(param, SdkErrorCodes.MISSING_REQUIRED_PARAM ,missingField);
  }
  /**
   * A generic helper function  that can accept any type of parameter and validate it.
   *
   * @param param        The parameter that needs to be validated.
   * @param sdkErrorCode The error message that needs to be thrown.
   * @throws ApiException
   */
  public static <T> void validateParameter(T param,
                                           SdkErrorCodes sdkErrorCode) throws ApiException {
    if (param == null)
      throw new ApiException(sdkErrorCode);

    if ((param instanceof List) && ((List)param).isEmpty())
      throw new ApiException(sdkErrorCode);

    if ((param instanceof String) && (StringUtil.isEmpty((String) param)))
      throw new ApiException(sdkErrorCode);
  }

  public static <T> void validateParameter(T param,
                                           SdkErrorCodes sdkErrorCode,String missingField) throws ApiException {
    if (param == null)
      throw new ApiException(sdkErrorCode,missingField);

    if ((param instanceof List) && ((List)param).isEmpty())
      throw new ApiException(sdkErrorCode,missingField);

    if ((param instanceof String) && (StringUtil.isEmpty((String) param)))
      throw new ApiException(sdkErrorCode,missingField);
  }

  /**
   * Helper function to validate the Id passed to it and throw the error message passed as a parameter.
   *
   * @param id           The ID parameter that needs to be validated.
   * @param sdkErrorCode The error message that needs to be thrown.
   * @throws ApiException
   */
  public static void validateId(String id,
                                SdkErrorCodes sdkErrorCode) throws ApiException {
    validateParameter(id, sdkErrorCode);
  }

  /**
   * Helper function to validate the email passed to it.
   *
   * @param email The email that needs to be validated.
   * @throws ApiException
   */
  public static void validateEmailParamater(String email) throws ApiException {
    if (!EmailValidator.getInstance().isValid(email))
      throw new ApiException(SdkErrorCodes.INVALID_EMAIL);
  }

  /**
   * Helper method that validates the versionId.
   *
   * @param versionId
   * @throws ApiException
   */
  public static void validateVersionId(String versionId) throws ApiException {
    if (versionId == null)
      return;

    if (versionId.length() == 0)
      throw new ApiException(SdkErrorCodes.INVALID_VERSION_ID);
  }

  /**
   * Helper method that validates the participantEmail.
   *
   * @param participantEmail
   * @throws ApiException
   */
  public static void validateParticipantEmail(String participantEmail) throws ApiException {
    if (participantEmail == null)
      return;

    if (!EmailValidator.getInstance().isValid(participantEmail))
      throw new ApiException(SdkErrorCodes.INVALID_PARTICIPANT);
  }


  /**
   * Helper method that takes FileInfo objects and validates them
   *
   * @param documentUrl         A url for the file.
   * @param libraryDocumentId   A libraryDocument to be used for creating the file.
   * @param libraryDocumentName The name of the document to be used for creating the file.
   * @param transientDocumentId A transient document to be used for creating the file.
   * @param url                 The url for the file in string format.
   * @throws ApiException
   */
  public static void validateFileInfo(Object documentUrl,
                                      String libraryDocumentId,
                                      String libraryDocumentName,
                                      String transientDocumentId,
                                      String url) throws ApiException {

    int count = (documentUrl != null ? 1 : 0)
            + (StringUtil.isEmpty(libraryDocumentId) ? 0 : 1)
            + (StringUtil.isEmpty(libraryDocumentName) ? 0 : 1)
            + (StringUtil.isEmpty(transientDocumentId) ? 0 : 1);

    if (count != 1)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

    if (!StringUtil.isEmpty(url))
      validateUrlParameter(url,
                           SdkErrorCodes.URL_INVALID);
  }

  /**
   * Helper method that checks the validity of post sign options
   *
   * @param redirectUrl   The redirectUrl that needs to be validated.
   * @param redirectDelay The redirectDelay that needs to be validated.
   * @throws ApiException
   */
  public static void validatePostSignOptions(String redirectUrl, Integer redirectDelay) throws ApiException {

    if (StringUtil.isEmpty(redirectUrl))
      throw new ApiException(SdkErrorCodes.EMPTY_REDIRECT_URL);

    if (redirectDelay != null && redirectDelay < 0)
      throw new ApiException(SdkErrorCodes.INVALID_REDIRECT_DELAY);

    if (!UrlValidator.getInstance().isValid(redirectUrl))
      throw new ApiException(SdkErrorCodes.INVALID_REDIRECT_URL);
  }

  /**
   * Common method that validates the versionId and participantEmail
   */
  public static void validateVersionIdAndParticipantEmail(String versionId,
                                                          String participantEmail) throws ApiException {
    validateVersionId(versionId);
    validateParticipantEmail(participantEmail);
  }

  /**
   * Helper method that checks the validity of post sign options
   *
   * @param email              The recipient email.
   * @param fax                The recipent fax.
   * @param numberOfRecipients The total number of recipients.
   * @throws ApiException
   */
  public static void validateRecipientSetInfos(String email, String fax, int numberOfRecipients) throws ApiException {
    if (StringUtil.isEmpty(fax) && StringUtil.isEmpty(email))
      throw new ApiException(SdkErrorCodes.MISSING_REQUIRED_PARAM, EMAIL + COMMA + FAX);

    if (!StringUtil.isEmpty(fax) && !StringUtil.isEmpty(email))
      throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);

    if (!StringUtil.isEmpty(fax) && numberOfRecipients > 1)
      throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);

    if (email != null)
      validateEmailParamater(email);
    if (fax != null)
      validateParameter(fax, FAX);
  }

  /**
   * Helper method that checks the validity of post sign options in workflows
   *
   * @param email              The recipient email.
   * @param fax                The recipent fax.
   * @param numberOfRecipients The total number of recipients.
   * @throws ApiException
   */

  public static void validateWorkflowRecipientSetInfos(String email, String fax, int numberOfRecipients) throws ApiException {
    if (StringUtil.isEmpty(fax) && StringUtil.isEmpty(email))
      throw new ApiException(SdkErrorCodes.MIN_ADDRESSES_NOT_MET);
    validateRecipientSetInfos(email,fax,numberOfRecipients);
  }

  /**
   * Helper function to validate the url passed to it.
   *
   * @param url          The url that needs to be validated.
   * @param sdkErrorCode The error message that needs to be thrown.
   * @throws ApiException
   */
  public static void validateUrlParameter(String url, SdkErrorCodes sdkErrorCode) throws ApiException {
   UrlValidator urlValidator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);
   if(!urlValidator.isValid(url))
     throw new ApiException(sdkErrorCode);
  }

  /**
   * Helper function to validate the dates passed to it.
   *
   * @param startDate The start date of search that needs to be validated.
   * @param endDate   The end date of search that needs to be validated.
   * @throws ApiException
   */
  public static void validateStartAndEndDatesParameter(Date startDate, Date endDate) throws ApiException {
    validateParameter(startDate,
                      SdkErrorCodes.INVALID_DATE);
    validateParameter(endDate,
                      SdkErrorCodes.INVALID_DATE);

    if (endDate.before(startDate))
      throw new ApiException(SdkErrorCodes.INVALID_DATE);
  }

  /**
   * Helper function that accepts an accessToken parameter and validates it.
   */
  public static void validateAccessToken(Object accessToken) throws ApiException {
    if (accessToken == null)
      throw new ApiException(SdkErrorCodes.NO_ACCESS_TOKEN_HEADER);
    else {
      String accessTokenValue = accessToken.toString();
      if(accessTokenValue.length() == 0)
        throw new ApiException(SdkErrorCodes.INVALID_ACCESS_TOKEN);
    }
  }

  /**
   * Helper function that accepts an xApiUser parameter and validates it.
   */
  private static void validateXApiUser(Object xApiUser) throws ApiException {
    if (xApiUser == null)
      return;
    else {
      String xApiUserValue = xApiUser.toString();
      if (xApiUserValue.length() == 0
              || !(xApiUserValue.contains(X_API_USER_EMAIL_ID_FORMAT_BEGINNING) || xApiUserValue.contains(X_API_USER_USER_ID_FORMAT_BEGINNING)))
        throw new ApiException(SdkErrorCodes.INVALID_X_API_USER_HEADER);
    }
  }
}