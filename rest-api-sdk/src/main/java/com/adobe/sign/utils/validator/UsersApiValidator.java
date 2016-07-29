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

import com.adobe.sign.model.users.UserCreationInfo;
import com.adobe.sign.model.users.UserModificationInfo;
import com.adobe.sign.model.users.UserStatusUpdateInfo;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for UsersApi endpoints. The main purpose of this class is to check the validity of the parameters passed to the user api endpoints
 * and throw ApiException with required error messages if the validation fails.
 *
 */
public class UsersApiValidator {

  /**
   * Validator for getUsers Api that fetches list of all users in the account of the user invoking this api.
   *
   * @param xUserEmail The email address of the user whose details are being requested.
   * @throws ApiException
   */
  public static void getUsersValidator(String xUserEmail) throws ApiException {
  }

  /**
   * Validator for createUsers Api that creates a new user in the account of the user invoking this api.
   *
   * @param userCreationInfo The object that has all the details/ required parameters for creating a new user.
   * @throws ApiException
   */
  public static void createUserValidator(UserCreationInfo userCreationInfo) throws ApiException {

    // Null and empty check for required params.
    ApiValidatorHelper.validateParameter(userCreationInfo);

    ArrayList parameterList = new ArrayList();
    parameterList.add(userCreationInfo.getFirstName());
    parameterList.add(userCreationInfo.getLastName());
    ApiValidatorHelper.validateRequiredParameters(parameterList);

    ApiValidatorHelper.validateParameter(userCreationInfo.getEmail(),
                                         SdkErrorCodes.MUST_PROVIDE_EMAIL);
    ApiValidatorHelper.validateEmailParamater(userCreationInfo.getEmail());
  }

  /**
   * Validator for getUserInfo Api that fetches the information of a user whose userId is provided.
   *
   * @param userId The userId of the user whose details are to be fetched.
   * @throws ApiException
   */
  public static void getUserDetailValidator(String userId) throws ApiException {
    ApiValidatorHelper.validateId(userId,
                                  SdkErrorCodes.INVALID_USER_ID);
  }

  /**
   * Validator for modifyUser Api that modifies the information of a user whose userId is provided.
   *
   * @param userId               The userId of the user whose details are to be modified.
   * @param userModificationInfo The object that has all the details/ required parameters for modifying the user's details.
   * @throws ApiException
   */
  public static void modifyUserValidator(String userId,
                                         UserModificationInfo userModificationInfo) throws ApiException {
    ApiValidatorHelper.validateId(userId,
                                  SdkErrorCodes.INVALID_USER_ID);
    ApiValidatorHelper.validateParameter(userModificationInfo);

    ArrayList parameterList = new ArrayList();
    parameterList.add(userModificationInfo.getFirstName());
    parameterList.add(userModificationInfo.getLastName());
    parameterList.add(userModificationInfo.getEmail());
    parameterList.add(userModificationInfo.getGroupId());
    ApiValidatorHelper.validateRequiredParameters(parameterList);

    ApiValidatorHelper.validateId(userModificationInfo.getGroupId(),
                                  SdkErrorCodes.INVALID_GROUP_ID);

    ApiValidatorHelper.validateEmailParamater(userModificationInfo.getEmail());

    ApiValidatorHelper.validateParameter(userModificationInfo.getRoles());
  }

  /**
   * Validator for modifyUserStatus Api that modifies the status of the user whose userId is provided.
   *
   * @param userId               The userId of the user whose details are to be modified.
   * @param userStatusUpdateInfo The object containing the User's status.
   * @throws ApiException
   */
  public static void modifyUserStatusValidator(String userId,
                                               UserStatusUpdateInfo userStatusUpdateInfo) throws ApiException {
    ApiValidatorHelper.validateId(userId,
                                  SdkErrorCodes.INVALID_USER_ID);

    ApiValidatorHelper.validateParameter(userStatusUpdateInfo);

    ApiValidatorHelper.validateParameter(userStatusUpdateInfo.getUserStatus(),
                                         SdkErrorCodes.MUST_PROVIDE_VALID_USER_STATUS);
  }

}
