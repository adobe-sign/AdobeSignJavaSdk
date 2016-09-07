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

import com.adobe.sign.utils.UserUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to create a new user in an account.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class CreateNewUserInAccount {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(CreateNewUserInAccount.class.getName());
    try {
      CreateNewUserInAccount client = new CreateNewUserInAccount();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.CREATE_NEW_USER_IN_ACCOUNT, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    //Make API call to create a user
    String userId = UserUtils.createUser(Constants.USER_EMAIL,
                                         Constants.USER_FIRST_NAME,
                                         Constants.USER_LAST_NAME);

    //Display user id of the new user
    ApiUtils.getLogger().info("User created with User ID = " + userId);
  }
}

