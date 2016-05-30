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
import com.adobe.sign.model.groups.GroupDetailsInfo;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.GroupUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get Group Info API.
 */
public class GetGroupInfoApiTest {
  
  private String groupId = null;
  private GroupsApi groupsApi = null;

  @Before
  public void setup() throws ApiException {
    groupId = GroupUtils.getResourceId(TestData.GROUP_NAME);
    groupsApi = GroupUtils.getGroupsApi();
  }

  /**
   * Test for getting details of a group. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token. 
   * INVALID_ACCESS_TOKEN: empty access token.
   * 
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {

    try {
      groupsApi.getGroupDetails(TestData.NULL_PARAM,
                                groupId,
                                TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      groupsApi.getGroupDetails(TestData.EMPTY_PARAM,
                                groupId,
                                TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for getting details of a group. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   * 
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiHeader() throws ApiException {

    try {
      groupsApi.getGroupDetails(TestData.ACCESS_TOKEN,
                                groupId,
                                TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for getting details of a group. Case covered is successful execution
   * of the API call.
   * 
   * @throws ApiException
   */
  @Test
  public void testGetGroupDetails() throws ApiException {

    try {
      GroupDetailsInfo groupDetailsInfo = groupsApi.getGroupDetails(TestData.ACCESS_TOKEN, 
                                                                    groupId, 
                                                                    TestData.X_API_HEADER);
      assertNotNull(groupDetailsInfo);
      assertNotNull(groupDetailsInfo.getGroupId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

  /**
   * Test for getting details of a group. Negative scenarios covered:
   * INVALID_GROUP_ID: empty group id. MISSING_REQUIRED_PARAM: null group id.
   * 
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidGroupId() throws ApiException {

    try {
      groupsApi.getGroupDetails(TestData.ACCESS_TOKEN,
                                TestData.EMPTY_PARAM,
                                TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      groupsApi.getGroupDetails(TestData.ACCESS_TOKEN,
                                TestData.NULL_PARAM,
                                TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }
  }
}
