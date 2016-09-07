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
import com.adobe.sign.model.groups.GroupModificationInfo;
import com.adobe.sign.model.groups.GroupModificationResponse;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.GroupUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Put Groups API.
 */
public class PutGroupApiTest {

  private static String groupId = null;
  private static GroupsApi groupsApi = null;



  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    groupId = GroupUtils.createGroup(ApiUtils.getGroupName());
    groupsApi = GroupUtils.getGroupsApi();
  }

  /**
   * Test for modifying a group. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token. INVALID_ACCESS_TOKEN: empty
   * access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    GroupModificationInfo groupModificationInfo = new GroupModificationInfo();

    try {
      groupsApi.modifyGroup(ApiUtils.getNullAccessTokenHeaderParams(),
                            groupId,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      groupsApi.modifyGroup(ApiUtils.getEmptyAccessTokenHeaderParams(),
                            groupId,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for modifying a group. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiHeader() throws ApiException {
    GroupModificationInfo groupModificationInfo = new GroupModificationInfo();

    try {
      groupsApi.modifyGroup(ApiUtils.getEmptyXApiUserHeaderParams(),
                            groupId,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for modifying a group. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null group name.
   * INVALID_GROUP_NAME: empty group  sname.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidGroupName() throws ApiException {
    GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
    groupModificationInfo.setGroupName(TestData.NULL_PARAM);

    try {
      groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(),
                            groupId,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
    }

    groupModificationInfo.setGroupName(TestData.EMPTY_PARAM);

    try {
      groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(),
                            groupId,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for modifying a group. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null group id.
   * INVALID_GROUP_ID: empty group id.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidGroupId() throws ApiException {
    GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
    groupModificationInfo.setGroupName(TestData.MODIFIED_GROUP_NAME);

    try {
      groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(),
                            TestData.NULL_PARAM,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(),
                            TestData.EMPTY_PARAM,
                            groupModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for modifying a group. Case covered is successful execution of the
   * api call.
   *
   * @throws ApiException
   */
  @Test
  public void testModifyGroup() throws ApiException {
    GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
    groupModificationInfo.setGroupName(ApiUtils.getGroupName());

    try {
      GroupModificationResponse groupModificationResponse = groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(),
                                                                                  groupId,
                                                                                  groupModificationInfo);
      assertNotNull(groupModificationResponse);
      assertNotNull(groupModificationResponse.getGroupName());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
