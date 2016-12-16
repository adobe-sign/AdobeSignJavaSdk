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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.GroupsApi;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.GroupUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Delete Group endpoint.
 */
public class DeleteGroupApiTest {

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
   * Test for deleting a group. Case covered is successful execution of the endpoint call.
   *
   * @throws ApiException
   */
  @Test
  public void testDeleteGroup() throws ApiException {
    try {
      groupsApi.deleteGroup(ApiUtils.getValidHeaderParams(),
                            groupId);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

  /**
   * Test for deleting a group. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   *
   * @throws ApiException
   */

  @Test
  public void testNullAccessToken() throws ApiException {
    try {
      groupsApi.deleteGroup(ApiUtils.getNullAccessTokenHeaderParams(),
                            groupId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for deleting a group. Negative scenarios covered:
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */

  @Test
  public void testEmptyAccessToken() throws ApiException {
    try {
      groupsApi.deleteGroup(ApiUtils.getEmptyAccessTokenHeaderParams(),
                            groupId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for deleting a group. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiHeader() throws ApiException {
    try {
      groupsApi.deleteGroup(ApiUtils.getEmptyXApiUserHeaderParams(),
                            groupId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for deleting a group. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null group id.
   *
   * @throws ApiException
   */
  @Test
  public void testNullGroupId() throws ApiException {
    try {
      groupsApi.deleteGroup(ApiUtils.getValidHeaderParams(),
                            TestData.NULL_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for deleting a group. Negative scenarios covered:
   * INVALID_GROUP_ID: empty group id.
   *
   * @throws ApiException
   */
  @Test
  public void testEmptyGroupId() throws ApiException {
    try {
      groupsApi.deleteGroup(ApiUtils.getValidHeaderParams(),
                            TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }
  }

}
