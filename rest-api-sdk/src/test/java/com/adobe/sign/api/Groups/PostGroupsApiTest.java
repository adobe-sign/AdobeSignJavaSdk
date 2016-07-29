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

package com.adobe.sign.api.Groups;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.GroupsApi;
import com.adobe.sign.model.groups.GroupCreationInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.GroupUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Post Groups API.
 */
public class PostGroupsApiTest {
  
  private static GroupsApi groupsApi = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() {

    groupsApi = GroupUtils.getGroupsApi();
  }

  /**
   * Test for creating group through the createGroup endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   * 
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
    groupCreationInfo.setGroupName(ApiUtils.getGroupName());

    try {
      groupsApi.createGroup(ApiUtils.getNullAccessTokenHeaderParams(),
                            groupCreationInfo);
    }
    catch (ApiException e){
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      groupsApi.createGroup(ApiUtils.getEmptyAccessTokenHeaderParams(),
                            groupCreationInfo);
    }
    catch (ApiException e){
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating group through the createGroup endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   * 
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiHeader() throws ApiException {
    GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
    groupCreationInfo.setGroupName(ApiUtils.getGroupName());

    try {
      groupsApi.createGroup(ApiUtils.getValidHeaderParams(),
                            groupCreationInfo);
    }
    catch (ApiException e){
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating group through the createGroup endpoint.
   * Case covered: Successful creation of group.
   * 
   * @throws ApiException
   */
  @Test
  public void testCreateGroup() throws ApiException {
    GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
    groupCreationInfo.setGroupName(ApiUtils.getGroupName());

    try {
      String groupId = groupsApi.createGroup(ApiUtils.getValidHeaderParams(),
                                             groupCreationInfo).getGroupId();
      assertNotNull(groupId);

      groupsApi.deleteGroup(ApiUtils.getValidHeaderParams(),
                            groupId);
    }
    catch (ApiException e){
      fail(ApiUtils.getMessage(e));
    }
  }

  /**
   * Test for creating group through the createGroup endpoint. Negative scenarios covered:
   * INVALID_GROUP_NAME: empty group name.
   * MISSING_REQUIRED_PARAM: null groupname.
   * 
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidGroupName() throws ApiException {
    GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
    groupCreationInfo.setGroupName(TestData.EMPTY_PARAM);

    try {
      groupsApi.createGroup(ApiUtils.getValidHeaderParams(),
                            groupCreationInfo).getGroupId();
    }
    catch (ApiException e){
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
    }

    groupCreationInfo.setGroupName(TestData.NULL_PARAM);

    try {
      groupsApi.createGroup(ApiUtils.getValidHeaderParams(),
                            groupCreationInfo);
    }
    catch (ApiException e){
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
    }
  }
}
