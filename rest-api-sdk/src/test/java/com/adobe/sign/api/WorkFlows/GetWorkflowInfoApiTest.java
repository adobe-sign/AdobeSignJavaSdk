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
import com.adobe.sign.model.workflows.WorkflowDescription;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.WorkFlowUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get Workflow Info APIs
 */
public class GetWorkflowInfoApiTest {
  private WorkflowsApi workflowsApi = null;
  private String workflowId = null;

  @Before
  public void setup() throws ApiException {
    workflowId = WorkFlowUtils.getResourceId();
    workflowsApi = WorkFlowUtils.getWorkflowsApi();
  }

  /**
   * Test for retrieving the details of a workflow through the getWorkflowInfo endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      workflowsApi.getWorkflowInfo(TestData.NULL_PARAM,
                                   workflowId,
                                   TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      workflowsApi.getWorkflowInfo(TestData.EMPTY_PARAM,
                                   workflowId,
                                   TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the details of a workflow through the getWorkflowInfo endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      workflowsApi.getWorkflowInfo(TestData.ACCESS_TOKEN,
                                   workflowId,
                                   TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the details of a workflow through the getWorkflowInfo endpoint. Negative scenarios covered:
   * INVALID_WORKFLOW_ID: null and empty workflowId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWorkflowId() throws ApiException {
    try {
      workflowsApi.getWorkflowInfo(TestData.ACCESS_TOKEN,
                                   TestData.NULL_PARAM,
                                   TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      workflowsApi.getWorkflowInfo(TestData.ACCESS_TOKEN,
                                   TestData.EMPTY_PARAM,
                                   TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the details of a workflow through the getWorkflowInfo endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetWorkflowInfo() throws ApiException {
    try {
      WorkflowDescription workflowDescription = workflowsApi.getWorkflowInfo(TestData.ACCESS_TOKEN,
                                                                             workflowId,
                                                                             TestData.X_API_HEADER);
      assertNotNull(workflowDescription);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
