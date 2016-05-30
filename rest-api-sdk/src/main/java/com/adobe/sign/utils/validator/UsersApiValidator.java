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
 * @author schatter
 * 
 */
public class UsersApiValidator {
  
  /**
   * Validator for getUsers Api that fetches list of all users in the account of the user invoking this api.
   * 
   * @param accessToken An OAuth Access Token.
   * @param xApiUser The userId or email of API caller.
   * @param xUserEmail The email address of the user whose details are being requested.
   * @throws ApiException
   */
  public static void getUsersValidator(String accessToken, 
                                       String xApiUser, 
                                       String xUserEmail) throws ApiException {
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
  }
  
  /**
   * Validator for createUsers Api that creates a new user in the account of the user invoking this api.
   * 
   * @param accessToken An OAuth Access Token.
   * @param userCreationInfo The object that has all the details/ required parameters for creating a new user.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void createUserValidator(String accessToken, 
                                         UserCreationInfo userCreationInfo, 
                                         String xApiUser) throws ApiException {  
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    
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
   * @param accessToken An OAuth Access Token.
   * @param userId The userId of the user whose details are to be fetched.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getUserDetailValidator(String accessToken, 
                                            String userId, 
                                            String xApiUser) throws ApiException {
    validateCommonUserParameters(accessToken, xApiUser, userId);    
  }
  
  /**
   * Validator for modifyUser Api that modifies the information of a user whose userId is provided.
   * 
   * @param accessToken An OAuth Access Token.
   * @param userId The userId of the user whose details are to be modified.
   * @param userModificationInfo The object that has all the details/ required parameters for modifying the user's details.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void modifyUserValidator(String accessToken, 
                                         String userId, 
                                         UserModificationInfo userModificationInfo, 
                                         String xApiUser) throws ApiException {
    validateCommonUserParameters(accessToken, xApiUser, userId);
    ApiValidatorHelper.validateParameter(userModificationInfo);
    
    ArrayList parameterList = new ArrayList();
    parameterList.add(userModificationInfo.getFirstName());
    parameterList.add(userModificationInfo.getLastName()); 
    parameterList.add(userModificationInfo.getEmail()); 
    ApiValidatorHelper.validateRequiredParameters(parameterList);

    ApiValidatorHelper.validateId(userModificationInfo.getGroupId(), 
                                  SdkErrorCodes.INVALID_GROUP_ID);
    
    ApiValidatorHelper.validateEmailParamater(userModificationInfo.getEmail());

    ApiValidatorHelper.validateParameter(userModificationInfo.getRoles());  
  }
  
  /**
   * 
   * Validator for modifyUserStatus Api that modifies the status of the user whose userId is provided.
   * 
   * @param accessToken An OAuth Access Token.
   * @param userId The userId of the user whose details are to be modified.
   * @param userStatusUpdateInfo The object containing the User's status.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void modifyUserStatusValidator(String accessToken, 
                                               String userId, 
                                               UserStatusUpdateInfo userStatusUpdateInfo, 
                                               String xApiUser) throws ApiException {
    validateCommonUserParameters(accessToken, xApiUser, userId);
    
    ApiValidatorHelper.validateParameter(userStatusUpdateInfo);
    
    ApiValidatorHelper.validateParameter(userStatusUpdateInfo.getUserStatus(), 
                                      SdkErrorCodes.MUST_PROVIDE_VALID_USER_STATUS); 
  } 
  
 
  /**
   * Common method that validated the accessToken, xApiUser and userId
   */
  private static void validateCommonUserParameters(String accessToken, 
                                                   String xApiUser, 
                                                   String userId) throws ApiException {
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    ApiValidatorHelper.validateId(userId, 
                                  SdkErrorCodes.INVALID_USER_ID);
  }
  
}
