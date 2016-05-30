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

import com.adobe.sign.model.groups.GroupInfo;
import com.adobe.sign.model.groups.GroupsInfo;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.GroupUtils;

/**
 * This sample client demonstrates how to get all the groups in an account.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class GetGroupsInAccount {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetGroupsInAccount client = new GetGroupsInAccount();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.GET_GROUPS_IN_ACCOUNT);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception{
    //Make API call to get list of all the groups in the account.
    GroupsInfo groupsInfo = GroupUtils.getGroups();

    //Display group ID and name of each group.
    List<GroupInfo> groupInfos = groupsInfo.getGroupInfoList();
    for(GroupInfo groupInfo : groupInfos) {
      System.out.println("Group ID : " + groupInfo.getGroupId());
      System.out.println("Group Name : " + groupInfo.getGroupName());
    }
  }
}



