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

package com.adobe.sign.api;

import java.util.List;

import com.adobe.sign.model.users.UserInfo;
import com.adobe.sign.model.users.UsersInfo;
import com.adobe.sign.utils.UserUtils;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to get all the users in an account.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class GetUsersInAccount {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(GetUsersInAccount.class.getName());
    try {
      GetUsersInAccount client = new GetUsersInAccount();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_USERS_IN_ACCOUNT, e);
      throw e;
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    //Make API call to get list of users in the account.
    UsersInfo usersInfo = UserUtils.getUsers();

    //Display details of each user.
    List<UserInfo> userInfos = usersInfo.getUserInfoList();
    for(UserInfo userInfo : userInfos) {
      ApiUtils.getLogger().info("User ID : " + userInfo.getUserId());
      ApiUtils.getLogger().info("User Name : " + userInfo.getFullNameOrEmail());
      ApiUtils.getLogger().info("Email ID of User : " + userInfo.getEmail());
    }
  }
}


