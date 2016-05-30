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

import com.adobe.sign.model.groups.GroupCreationInfo;
import com.adobe.sign.model.groups.GroupModificationInfo;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for GroupsApi endpoints. The main purpose of this class is to check the validity of the parameters passed to the groups api endpoints
 * and throw ApiException with required error messages if the validation fails.
 * 
 * @author agoyal
 * 
 */
public class GroupsApiValidator
{

  /**
   * Validator for getGroups Api that fetches list of all the groups in the account.
   *
   * @param accessToken An OAuth Access Token.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getGroupsValidator(String accessToken, 
                                        String xApiUser) throws ApiException {
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
  } 

  /**
   * Validator for createGroup Api that creates a group in the account.
   *
   * @param accessToken An OAuth Access Token.
   * @param groupCreationInfo The object that has all the details/ required parameters for creating a group.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void createGroupValidator(String accessToken, 
                                          GroupCreationInfo groupCreationInfo, 
                                          String xApiUser) throws ApiException {
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    ApiValidatorHelper.validateParameter(groupCreationInfo);

    ApiValidatorHelper.validateParameter(groupCreationInfo.getGroupName(), 
                                         SdkErrorCodes.INVALID_GROUP_NAME);
  }

  /**
   * Validator for getGroupDetails Api that fetches the details of the given group.
   *
   * @param accessToken An OAuth Access Token.
   * @param groupId The Id of the Group whose details are to be fetched.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
   public static void getGroupDetailsValidator(String accessToken, 
                                               String groupId, 
                                               String xApiUser) throws ApiException {
     validateCommonGroupParameters(accessToken, xApiUser, groupId);
   }

  /**
   * Validator for modifyGroup Api that modifies the given group.
   *
   * @param accessToken An OAuth Access Token.
   * @param groupId The Id of the Group to be modified.
   * @param groupModificationInfo The object that has all the details/ required parameters for modifying the group.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
   public static void modifyGroupValidator(String accessToken, 
                                           String groupId,
                                           GroupModificationInfo groupModificationInfo, 
                                           String xApiUser) throws ApiException {
     validateCommonGroupParameters(accessToken, xApiUser, groupId);
     
     ApiValidatorHelper.validateParameter(groupModificationInfo);
     ApiValidatorHelper.validateParameter(groupModificationInfo.getGroupName(), 
                                          SdkErrorCodes.INVALID_GROUP_NAME);
   }

  /**
   * Validator for deleteGroup Api that deletes the given group.
   *
   * @param accessToken An OAuth Access Token.
   * @param groupId The Id of the Group to be deleted.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
   public static void deleteGroupValidator(String accessToken, 
                                           String groupId, 
                                           String xApiUser) throws ApiException {
     validateCommonGroupParameters(accessToken, xApiUser, groupId);
   }

  /**
   * Validator for getUsersInGroup Api that fetches all the users in the given group.
   *
   * @param accessToken An OAuth Access Token .
   * @param groupId The Id of the Group from which the users are to be fetched.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
   public static void getUsersInGroupValidator(String accessToken, 
                                               String groupId, 
                                               String xApiUser) throws ApiException {
     validateCommonGroupParameters(accessToken, xApiUser, groupId);
   }
    
   /**
    * Common method that validated the accessToken, xApiUser and groupId
    */
   private static void validateCommonGroupParameters(String accessToken, 
                                                String xApiUser, 
                                                String groupId) throws ApiException {
     ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
     ApiValidatorHelper.validateId(groupId, 
                                   SdkErrorCodes.INVALID_GROUP_ID);
   }

}
