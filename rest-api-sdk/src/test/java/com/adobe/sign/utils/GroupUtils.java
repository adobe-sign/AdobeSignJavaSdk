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

import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.GroupsApi;
import com.adobe.sign.model.groups.GroupCreationInfo;
import com.adobe.sign.model.groups.GroupCreationResponse;
import com.adobe.sign.model.groups.GroupInfo;
import com.adobe.sign.model.groups.GroupsInfo;

public class GroupUtils {
  
  private static GroupsApi groupsApi = new GroupsApi();
  private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();

  public static String getResourceId(String groupName) throws ApiException {
    String groupId = null;
    
    if (groupName==null){
      return groupId;
    }

    GroupsInfo groupsInfos = groupsApi.getGroups(headers);

    List<GroupInfo> groupInfoList = groupsInfos.getGroupInfoList();

    for(GroupInfo groupInfo : groupInfoList) {
      if(groupInfo.getGroupName().equalsIgnoreCase(groupName)) {
        groupId = groupInfo.getGroupId();
        break;
      }
    }

    if(groupId == null) {
        groupId = createGroup(groupName,
                              headers);

    }

    return groupId;
  }


  //Helper method to create a Group
  public static String createGroup(String groupName,
                                   MultivaluedMap headers) throws ApiException {

    GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
    groupCreationInfo.setGroupName(groupName);
    GroupCreationResponse groupCreationResponse = null;


    groupCreationResponse= groupsApi.createGroup(headers,
                                                 groupCreationInfo);
    return groupCreationResponse.getGroupId();
  }

  public static String createGroup(String groupName) throws ApiException {
    return createGroup(groupName,
                       headers);
  }
  public static GroupsApi getGroupsApi() {
    return groupsApi;
  }

  public static String isExistingGroup(String staticGroupName) throws ApiException {

    GroupsInfo groupsInfos = groupsApi.getGroups(headers);

    List<GroupInfo> groupInfoList = groupsInfos.getGroupInfoList();

    for(GroupInfo groupInfo : groupInfoList) {
      if(groupInfo.getGroupName().equalsIgnoreCase(staticGroupName)) {
        return groupInfo.getGroupId();
      }
    }
    return null;
  }
}
