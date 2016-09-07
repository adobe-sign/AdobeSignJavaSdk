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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.UsersApi;
import com.adobe.sign.model.users.UsersInfo;
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
 * Junit test cases for Get Users API.
 */
public class GetUsersApiTest {
  
  private static UsersApi usersApi = null;
  
  @Rule
  public Retry retry = new Retry();
	private static String envHostName = TestData.ENV_HOST_NAME;

	/**
	 * Setting up the UsersApi BeforeClass the tests are run.
	 * 
	 * @throws ApiException
	 */
	@BeforeClass
	public static void setup() throws ApiException {
		ApiUtils.configureProperty();
		usersApi = UserUtils.getUsersApi();
	}
	
	/**
	 * Test to retrieve all users of an account through getUsers endpoint.Negative scenarios:
	 * NO_ACCESS_TOKEN_HEADER: null access token.
	 * INVALID_ACCESS_TOKEN: empty access token.
	 * 
	 * @throws ApiException
	 */
	@Test
	public void testNullAndEmptyAccessToken() throws ApiException {

		try {
          usersApi.getUsers(ApiUtils.getNullAccessTokenHeaderParams(),
                            TestData.X_USER_EMAIL);
		} 
		catch (ApiException e) {
		  assertTrue(e.getMessage(),
                     SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
		}

		try {
          usersApi.getUsers(ApiUtils.getEmptyAccessTokenHeaderParams(),
                            TestData.X_USER_EMAIL);
		} 
		catch (ApiException e) {
		  assertTrue(e.getMessage(),
                     SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
		}
	}
	/**
	 * Test to retrieve all users of an account through getUsers endpoint.
	 * Negative scenarios: INVALID_X_API_USER_HEADER: empty xApiUser.
	 * 
	 * @throws ApiException
	 */
	@Test
	public void testInvalidXApiUser() throws ApiException {

		try {
          usersApi.getUsers(ApiUtils.getEmptyXApiUserHeaderParams(),
                            TestData.X_USER_EMAIL);
		} 
		catch (ApiException e) {
		  assertTrue(e.getMessage(),
                     SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
		}
	}
	/**
	 * Test to retrieve all users of an account through getUsers endpoint.
	 * 
	 * @throws ApiException
	 */
	@Test
	public void testGetUsers() throws ApiException {

		try {
          UsersInfo userInfos = usersApi.getUsers(ApiUtils.getValidHeaderParams(),
                                                  TestData.X_USER_EMAIL);
          assertNotNull(userInfos);
		} 
		catch (ApiException e) {
			fail(ApiUtils.getMessage(e));
		}
	}

}
