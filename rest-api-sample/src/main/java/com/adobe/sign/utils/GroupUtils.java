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

import com.adobe.sign.api.GroupsApi;
import com.adobe.sign.model.groups.GroupCreationInfo;
import com.adobe.sign.model.groups.GroupCreationResponse;
import com.adobe.sign.model.groups.GroupsInfo;

public class GroupUtils {

  private final static GroupsApi groupsApi = new GroupsApi();
  private final static MultivaluedMap headers = ApiUtils.getHeaderParams();
  private final static String ACCESS_TOKEN_KEY= "Access-Token";

  /**
   * Create sample group and returns group Id
   *
   * @param groupName String containing name of the group.
   * @return String containing id of the group created.
   * @throws Exception
   */
  public static String createGroup(String groupName) throws ApiException {
    try {
      GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
      groupCreationInfo.setGroupName(groupName);

      GroupCreationResponse groupCreationResponse = groupsApi.createGroup(headers,
                                                                          groupCreationInfo);
      return groupCreationResponse.getGroupId();
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.CREATE_GROUP);
      throw e;
    }
  }

  /**
   * Create sample group and returns group Id
   *
   * @param groupName String containing name of the group.
   * @param accessToken access token obtained by OAuth 2.0 workflow.
   * @return String containing id of the group created.
   * @throws Exception
   */
  public static String createGroupWithOAuthWorkflow(String groupName, String accessToken) throws ApiException {
    try {
      GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
      groupCreationInfo.setGroupName(groupName);

      headers.put(ACCESS_TOKEN_KEY, accessToken);
      GroupCreationResponse groupCreationResponse = groupsApi.createGroup(headers,
                                                                          groupCreationInfo);
      return groupCreationResponse.getGroupId();
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.CREATE_GROUP_OAUTH);
      throw e;
    }
  }

  /**
   * Gets all the groups in an account.
   *
   * @return GroupsInfo
   */
  public static GroupsInfo getGroups() throws ApiException {
    try {
      GroupsInfo groupsInfo = groupsApi.getGroups(headers);
      return groupsInfo;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.GET_GROUPS);
      throw e;
    }
  }
}