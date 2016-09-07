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

import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.FileUtils;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.GroupUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to create a new group in an account.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class CreateNewGroupInAccount {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(CreateNewGroupInAccount.class.getName());
    try {
      CreateNewGroupInAccount client = new CreateNewGroupInAccount();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.CREATE_NEW_GROUP_IN_ACCOUNT, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    //Make API call to create a group
    String groupId = GroupUtils.createGroup(Constants.GROUP_NAME);

    //Display group id of the new group
    ApiUtils.getLogger().info("Group created with Group ID = " + groupId);
  }
}
