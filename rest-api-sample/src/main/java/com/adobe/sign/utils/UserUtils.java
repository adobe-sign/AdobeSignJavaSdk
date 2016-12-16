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

import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.UsersApi;
import com.adobe.sign.model.users.UserCreationInfo;
import com.adobe.sign.model.users.UserCreationResponse;
import com.adobe.sign.model.users.UsersInfo;

public class UserUtils {

  private final static UsersApi usersApi = new UsersApi();
  private final static MultivaluedMap headers = ApiUtils.getHeaderParams();

  /**
   * Create a sample user in the group.
   *
   * @param userEmail Email Id of the user
   * @param firstName First Name of the user
   * @param lastName  Last Name of the user
   * @return String containing id of the newly created user.
   * @throws Exception
   */
  public static String createUser(String userEmail,
                                  String firstName,
                                  String lastName) throws ApiException {
    try {
      UserCreationInfo userCreationInfo = new UserCreationInfo();
      userCreationInfo.setEmail(userEmail);
      userCreationInfo.setFirstName(firstName);
      userCreationInfo.setLastName(lastName);

      UserCreationResponse userCreationResponse = usersApi.createUser(headers,
                                                                      userCreationInfo);
      return userCreationResponse.getUserId();
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.CREATE_USER);
      throw e;
    }
  }

  /**
   * Gets all the users in an account.
   *
   * @return UsersInfo Information about all the users in the account
   */
  public static UsersInfo getUsers() throws ApiException {
    try {
      UsersInfo usersInfo = usersApi.getUsers(headers,
                                              Constants.X_USER_EMAIL);
      return usersInfo;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.GET_USERS);
      throw e;
    }
  }
}