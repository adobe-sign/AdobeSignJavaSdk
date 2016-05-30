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
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
  
  /**
   * Common method for validating accessToken and xApiUser, which are used in all the API's.
   *
   * @param accessToken The accessToken of the API caller.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void validateCommonParameters(String accessToken, 
                                              String xApiUser)  throws ApiException {
    validateAccessToken(accessToken);
    validateXApiUser(xApiUser);
  }

  /**
   * Function to validate a list of mandatory parameters.
   * 
   * @param paramList The parameter List from which every parameter needs to be validated.
   * @throws ApiException
   */
  public static void validateRequiredParameters(ArrayList<String> paramList) throws ApiException {
    for (String param: paramList)
      validateParameter(param);
  }
  
  /**
   * A generic helper function  that can accept any type of parameter and validate it.
   * 
   * @param param The parameter that needs to be validated.
   * @throws ApiException
   */
  public static <T> void validateParameter(T param) throws ApiException{
    validateParameter(param, SdkErrorCodes.MISSING_REQUIRED_PARAM);
  }
  
  /**
   * A generic helper function  that can accept any type of parameter and validate it.
   * 
   * @param param The parameter that needs to be validated.
   * @param sdkErrorCode The error message that needs to be thrown.
   * @throws ApiException
   */
  public static <T> void validateParameter(T param, 
                                        SdkErrorCodes sdkErrorCode) throws ApiException{
    if(param == null)
      throw new ApiException(sdkErrorCode);    
    
    if((param instanceof List) && ((new ArrayList<>(Arrays.asList(param))).isEmpty()))
      throw new ApiException(sdkErrorCode);
    
    if((param instanceof String) && (StringUtil.isEmpty((String)param)))
        throw new ApiException(sdkErrorCode);
  }

  /**
   * Helper function to validate the Id passed to it and throw the error message passed as a parameter.
   *
   * @param id The ID parameter that needs to be validated.
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
    if(!EmailValidator.getInstance().isValid(email))
      throw new ApiException(SdkErrorCodes.INVALID_EMAIL);
  }
  
  /**
   * Helper method that validates the versionId.
   *
   * @param versionId
   * @throws ApiException
   */
  public static void validateVersionId(String versionId) throws ApiException {
    if(versionId == null)
      return;

    if(versionId.length() == 0)
      throw new ApiException(SdkErrorCodes.INVALID_VERSION_ID);
  }

  /**
   * Helper method that validates the participantEmail.
   *
   * @param participantEmail
   * @throws ApiException
   */
  public static void validateParticipantEmail(String participantEmail) throws ApiException {
    if(participantEmail == null)
      return;

    if(!EmailValidator.getInstance().isValid(participantEmail))
      throw new ApiException(SdkErrorCodes.INVALID_PARTICIPANT);
  }

  
  /**
   * Helper method that takes FileInfo objects and validates them
   *
   * @param documentUrl A url for the file.
   * @param libraryDocumentId A libraryDocument to be used for creating the file.
   * @param libraryDocumentName The name of the document to be used for creating the file.
   * @param transientDocumentId A transient document to be used for creating the file.
   * @param url The url for the file in string format.
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

    if(count != 1)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

    if(!StringUtil.isEmpty(url))
      validateUrlParameter(url, 
                           SdkErrorCodes.URL_INVALID);
  }
  
  /**
   * Helper method that checks the validity of post sign options
   * 
   * @param redirectUrl The redirectUrl that needs to be validated.
   * @param redirectDelay The redirectDelay that needs to be validated.
   * @throws ApiException
   */
  public static void validatePostSignOptions(String redirectUrl, Integer redirectDelay) throws ApiException {
    
    if(StringUtil.isEmpty(redirectUrl))
      throw new ApiException(SdkErrorCodes.EMPTY_REDIRECT_URL);
    
    if(redirectDelay != null && redirectDelay < 0)
      throw new ApiException(SdkErrorCodes.INVALID_REDIRECT_DELAY);
    
    if(!UrlValidator.getInstance().isValid(redirectUrl))
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
   * @param email The recipient email.
   * @param fax The recipent fax.
   * @param numberOfRecipients The total number of recipients.
   * @throws ApiException
   */
  public static void validateRecipientSetInfos(String email, String fax, int numberOfRecipients) throws ApiException {   
    if (StringUtil.isEmpty(fax) && StringUtil.isEmpty(email))
      throw new ApiException(SdkErrorCodes.MISSING_REQUIRED_PARAM);

    if (!StringUtil.isEmpty(fax) && !StringUtil.isEmpty(email))
      throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);

    if (!StringUtil.isEmpty(fax) && numberOfRecipients > 1)
      throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);

    if (email != null)
      validateEmailParamater(email);
    if (fax != null)
      validateParameter(fax);
  }

  /**
   * Helper function to validate the url passed to it.
   * 
   * @param url The url that needs to be validated.
   * @param sdkErrorCode The error message that needs to be thrown.
   * @throws ApiException
   */
  public static void validateUrlParameter(String url, SdkErrorCodes sdkErrorCode) throws ApiException {
    if(!UrlValidator.getInstance().isValid(url))
      throw new ApiException(sdkErrorCode);
  }
 
  /**
   * Helper function to validate the dates passed to it.
   * 
   * @param startDate The start date of search that needs to be validated.
   * @param endDate The end date of search that needs to be validated.
   * @throws ApiException
   */
  public static void validateStartAndEndDatesParameter(Date startDate, Date endDate) throws ApiException {
    validateParameter(startDate, 
                   SdkErrorCodes.INVALID_DATE);
    validateParameter(endDate, 
                   SdkErrorCodes.INVALID_DATE);
    
    if(endDate.before(startDate))
      throw new ApiException(SdkErrorCodes.INVALID_DATE);
  }

    /**
   * Helper function that accepts an accessToken parameter and validates it.
   */
  public static void validateAccessToken(String accessToken) throws ApiException{
    if(accessToken == null)
      throw new ApiException(SdkErrorCodes.NO_ACCESS_TOKEN_HEADER);
    
    if(accessToken.length() == 0)
      throw new ApiException(SdkErrorCodes.INVALID_ACCESS_TOKEN);
  }

  /**
   * Helper function that accepts an xApiUser parameter and validates it.
   */
  private static void validateXApiUser(String xApiUser) throws ApiException {
    if(xApiUser == null)
      return;
    
    if(xApiUser.length() == 0 
        || !(xApiUser.contains(X_API_USER_EMAIL_ID_FORMAT_BEGINNING) || xApiUser.contains(X_API_USER_USER_ID_FORMAT_BEGINNING)))
      throw new ApiException(SdkErrorCodes.INVALID_X_API_USER_HEADER);
  }
}
