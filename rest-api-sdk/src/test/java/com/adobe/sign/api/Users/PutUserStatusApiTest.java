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

package com.adobe.sign.api.Users;

import static org.junit.Assert.assertTrue;

import com.adobe.sign.api.UsersApi;
import com.adobe.sign.model.users.UserStatusUpdateInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.UserUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Put User Status API.
 */
public class PutUserStatusApiTest{

	private static UsersApi usersApi = null;
	private static String userId = null;
	private static String envHostName = TestData.ENV_HOST_NAME;


	@Rule
  public Retry retry = new Retry();

	/**
	 * Setting up the UsersApi BeforeClass the tests are run.
	 *
	 * @throws ApiException
	 */
	@BeforeClass
	public static void setup() throws ApiException {
		ApiUtils.configureProperty();
		userId = UserUtils.createUser(ApiUtils.getUserEmail());
		usersApi = UserUtils.getUsersApi();
	}

	/**
	 * Test to modify user status through modifyUserStatus endpoint. Negative
	 * scenarios covered: MUST_PROVIDE_VALID_USER_STATUS: provided with null
	 * userStatus enum
	 *
	 * @throws ApiException
	 */
	@Test
	public void testInvalidUserStatus() throws ApiException {
		UserStatusUpdateInfo updateInfo = new UserStatusUpdateInfo();
		updateInfo.setUserStatus(null);

		try {
			usersApi.modifyUserStatus(ApiUtils.getValidHeaderParams(),
				userId,
				updateInfo);
		}
		catch (ApiException e) {
			assertTrue(e.getMessage(),
				SdkErrorCodes.MUST_PROVIDE_VALID_USER_STATUS.getApiCode().equals(e.getApiCode()));
		}
	}
	
}
