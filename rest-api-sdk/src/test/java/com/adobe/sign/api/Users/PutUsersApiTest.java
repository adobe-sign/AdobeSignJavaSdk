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

import java.util.Arrays;

import com.adobe.sign.api.UsersApi;
import com.adobe.sign.model.users.UserDetailsInfo;
import com.adobe.sign.model.users.UserModificationInfo;
import com.adobe.sign.model.users.UserModificationInfo.RolesEnum;
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
 * Junit test cases for Put Users API.
 */
public class PutUsersApiTest {

	private static UsersApi usersApi = null;
	private static String userId = null;


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
	 * Test to modify user details through modifyUser endpoint. Negative
	 * scenarios covered: NO_ACCESS_TOKEN_HEADER: null access token.
	 * INVALID_ACCESS_TOKEN: empty access token.
	 *
	 * @throws ApiException
	 */
	@Test
	public void testNullAndEmptyAccessToken() throws ApiException {
		UserModificationInfo userModificationInfo = new UserModificationInfo();

    try {
      usersApi.modifyUser(ApiUtils.getNullAccessTokenHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      usersApi.modifyUser(ApiUtils.getEmptyAccessTokenHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test to modify user details through modifyUser endpoint. Negative
   * scenarios covered: INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    UserModificationInfo userModificationInfo = new UserModificationInfo();

    try {
      usersApi.modifyUser(ApiUtils.getEmptyXApiUserHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test to modify user details through modifyUser endpoint. Negative
   * scenarios covered: MISSING_REQUIRED_PARAM: null userId. INVALID_USER_ID:
   * empty userId.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidUserId() throws ApiException {
    UserDetailsInfo userDetailsInfo = usersApi.getUserDetail(ApiUtils.getValidHeaderParams(),
                                                             userId);

    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(TestData.NULL_PARAM,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    userDetailsInfo.getLastName(),
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          TestData.NULL_PARAM,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_USER_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(TestData.EMPTY_PARAM,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    userDetailsInfo.getLastName(),
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          TestData.EMPTY_PARAM,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_USER_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test to modify user details through modifyUser endpoint. Negative
   * scenarios covered: MISSING_REQUIRED_PARAM: null and empty first name,
   * null last name, email, groupId and roles in the userModificationInfo
   * object.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidParams() throws ApiException {
    UserDetailsInfo userDetailsInfo = usersApi.getUserDetail(ApiUtils.getValidHeaderParams(),
                                                             userId);
                                                             
    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    TestData.NULL_PARAM,
                                                                                    userDetailsInfo.getLastName(),
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    TestData.EMPTY_PARAM,
                                                                                    userDetailsInfo.getLastName(),
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    TestData.NULL_PARAM,
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    TestData.EMPTY_PARAM,
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    userDetailsInfo.getLastName(),
                                                                                    TestData.NULL_PARAM,
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    userDetailsInfo.getLastName(),
                                                                                    TestData.EMPTY_PARAM,
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
              SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    userDetailsInfo.getLastName(),
                                                                                    TestData.INVALID_EMAIL,
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    Arrays.asList(RolesEnum.NORMAL_USER));
      usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                          userId,
                          userModificationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
              SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }


    try {
          UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                        userDetailsInfo.getFirstName(),
                                                                                        userDetailsInfo.getLastName(),
                                                                                        userDetailsInfo.getEmail(),
                                                                                        TestData.NULL_PARAM,
                                                                                        Arrays.asList(RolesEnum.NORMAL_USER));
          usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                              userId,
                              userModificationInfo);
      }
      catch (ApiException e) {
          assertTrue(e.getMessage(),
                     SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
      }

      try {
          UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                        userDetailsInfo.getFirstName(),
                                                                                        userDetailsInfo.getLastName(),
                                                                                        userDetailsInfo.getEmail(),
                                                                                        TestData.EMPTY_PARAM,
                                                                                        Arrays.asList(RolesEnum.NORMAL_USER));
          usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                              userId,
                              userModificationInfo);
      }
      catch (ApiException e) {
          assertTrue(e.getMessage(),
                     SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
      }
    try {
          UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId,
                                                                                    userDetailsInfo.getFirstName(),
                                                                                    userDetailsInfo.getLastName(),
                                                                                    userDetailsInfo.getEmail(),
                                                                                    userDetailsInfo.getGroupId(),
                                                                                    null);
          usersApi.modifyUser(ApiUtils.getValidHeaderParams(),
                            userId,
                            userModificationInfo);
    }
    catch (ApiException e) {
          assertTrue(e.getMessage(),
                     SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
    
  }
}

