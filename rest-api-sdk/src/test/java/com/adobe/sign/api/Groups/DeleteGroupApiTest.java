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

import static org.junit.Assert.fail;

import com.adobe.sign.api.GroupsApi;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.GroupUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ApiException;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Delete Group API.
 */
public class DeleteGroupApiTest {
  
  String groupId = null;
  GroupsApi groupsApi = null;

	@Before
	public void setup() throws ApiException {
		groupId = GroupUtils.getResourceId(TestData.GROUP_NAME);
		groupsApi = GroupUtils.getGroupsApi();
	}

  /**
   * Test for deleting a group. Case covered is successful execution of the API call.
   *
   * @throws ApiException
   */
  @Test
  public void testDeleteGroup() throws ApiException {
    try {
      groupsApi.deleteGroup(TestData.ACCESS_TOKEN,
                            groupId,
                            TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
