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

import static org.junit.Assert.assertNotNull;

import java.util.List;

import com.adobe.sign.api.UsersApi;
import com.adobe.sign.model.users.UserCreationInfo;
import com.adobe.sign.model.users.UserCreationResponse;
import com.adobe.sign.model.users.UserInfo;
import com.adobe.sign.model.users.UserModificationInfo;
import com.adobe.sign.model.users.UsersInfo;

public class UserUtils {
  
  private static UsersApi usersApi = new UsersApi();

  public static String getResourceId(String email) throws ApiException {
    String userId = null;
    
    UsersInfo userInfos = usersApi.getUsers(TestData.ACCESS_TOKEN,TestData.X_API_HEADER,TestData.X_USER_EMAIL);

    List<UserInfo> userInfoList = userInfos.getUserInfoList();

    for(UserInfo userInfo : userInfoList) {
      if(userInfo.getEmail().equalsIgnoreCase(email)) {
        userId = userInfo.getUserId();
        break;
      }
    }
    
    if(userId == null) {
      userId = createUser(TestData.ACCESS_TOKEN,
                          TestData.FIRST_NAME,
                          TestData.LAST_NAME,
                          email,
                          TestData.X_API_HEADER);
    }
    return userId;
  }

  /**
   * Helper function to create a user and validate that user is actually being created.
   *
   * @throws ApiException
   */
  public static String createUser(String accessToken,
                                  String firstName,
                                  String lastName,
                                  String email,
                                  String xApiUser) throws ApiException {
    UserCreationInfo userCreationInfo = getUserCreationInfo(firstName, lastName, email);

    UserCreationResponse userCreationResponse = usersApi.createUser(accessToken, userCreationInfo, xApiUser);
    assertNotNull(userCreationResponse);
    assertNotNull(userCreationResponse.getUserId());
    return userCreationResponse.getUserId();
  }
  
  /**
   * Helper function to create a user and validate that user is actually being created.
   *
   * @throws ApiException
   */
  public static UserCreationInfo getUserCreationInfo(String firstName,
                                                     String lastName,
                                                     String email) throws ApiException {
    UserCreationInfo userCreationInfo = new UserCreationInfo();
    userCreationInfo.setFirstName(firstName);
    userCreationInfo.setLastName(lastName);
    userCreationInfo.setEmail(email);

    return userCreationInfo;
  }

  /**
   * Helper function to modify a user and validate that user is actually being modified.
   *
   * @throws ApiException
   */
  public static UserModificationInfo getUserModificationInfo(String accessToken,
                                                             String userId,
                                                             String firstName,
                                                             String lastName,
                                                             String email,
                                                             String groupId,
                                                             List<UserModificationInfo.RolesEnum> roles,
                                                             String xApiUser) throws ApiException {
    
    UserModificationInfo userModificationInfo = new UserModificationInfo();
    userModificationInfo.setFirstName(firstName);
    userModificationInfo.setLastName(lastName);
    userModificationInfo.setEmail(email);
    userModificationInfo.setGroupId(groupId);
    userModificationInfo.setRoles(roles);
    return userModificationInfo;
  }

  public static UsersApi getUsersApi() {
    return usersApi;
  }

}
