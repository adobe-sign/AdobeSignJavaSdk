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

package com.adobe.sign.api.WorkFlows;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.WorkflowsApi;
import com.adobe.sign.model.workflows.UserWorkflows;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.WorkFlowUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get WorkFlows APIs
 */
public class GetWorkFlowsApiTest {
  private WorkflowsApi workflowsApi = null;
  private String workflowId = null;

  @Before
  public void setup() throws ApiException {
    workflowId = WorkFlowUtils.getResourceId();
    workflowsApi = WorkFlowUtils.getWorkflowsApi();
  }

  /**
   * Test for retrieving workflows for a user through the getWorkflows endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      workflowsApi.getWorkflows(TestData.NULL_PARAM,
                                TestData.X_API_HEADER,
                                TestData.INCLUDE_DRAFT_WORKFLOWS,
                                TestData.GROUP_ID);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      workflowsApi.getWorkflows(TestData.EMPTY_PARAM,
                                TestData.X_API_HEADER,
                                TestData.INCLUDE_DRAFT_WORKFLOWS,
                                TestData.GROUP_ID);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving workflows for a user through the getWorkflows endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      workflowsApi.getWorkflows(TestData.ACCESS_TOKEN,
                                TestData.EMPTY_PARAM,
                                TestData.INCLUDE_DRAFT_WORKFLOWS,
                                TestData.GROUP_ID);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving workflows for a user through the getWorkflows endpoint. Negative scenarios covered:
   * INVALID_GROUP_ID: empty groupId.
   *
   * @throws ApiException
   */
  @Test
  public void testEmptyGroupId() throws ApiException {
    try {
      workflowsApi.getWorkflows(TestData.ACCESS_TOKEN,
                                TestData.X_API_HEADER,
                                TestData.INCLUDE_DRAFT_WORKFLOWS,
                                TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving workflows for a user through the getWorkflows endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetWorkflows() throws ApiException {
    try {
      UserWorkflows userWorkflows = workflowsApi.getWorkflows(TestData.ACCESS_TOKEN,
                                                              TestData.X_API_HEADER,
                                                              TestData.INCLUDE_DRAFT_WORKFLOWS,
                                                              TestData.GROUP_ID);
      assertNotNull(userWorkflows);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}

