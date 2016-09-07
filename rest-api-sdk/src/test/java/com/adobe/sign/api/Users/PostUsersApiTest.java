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
import com.adobe.sign.model.users.UserCreationInfo;
import com.adobe.sign.model.users.UserCreationResponse;
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
 * Junit test cases for Post Users API.
 */
public class PostUsersApiTest {

  private static UsersApi usersApi = null;
  
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
    usersApi = UserUtils.getUsersApi();
  }

  /**
   * Test for creating user through the createUser endpoint. Negative
   * scenarios covered: NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        ApiUtils.getUserEmail());
      usersApi.createUser(ApiUtils.getNullAccessTokenHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        ApiUtils.getUserEmail());
      usersApi.createUser(ApiUtils.getEmptyAccessTokenHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating user through the createUser endpoint. Negative
   * scenarios covered: INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        ApiUtils.getUserEmail());
      usersApi.createUser(ApiUtils.getEmptyXApiUserHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating user through the createUser endpoint. Negative
   * scenarios covered: MISSING_REQUIRED_PARAM: null and empty first name and
   * last name.
   *
   * @throws ApiException
   */
  @Test
  public void testMissingParams() throws ApiException {

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.NULL_PARAM,
                                                                        TestData.LAST_NAME,
                                                                        ApiUtils.getUserEmail());
      usersApi.createUser(ApiUtils.getValidHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.NULL_PARAM,
                                                                        ApiUtils.getUserEmail());
      usersApi.createUser(ApiUtils.getValidHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.EMPTY_PARAM,
                                                                        TestData.LAST_NAME,
                                                                        ApiUtils.getUserEmail());
      usersApi.createUser(ApiUtils.getValidHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating user through the createUser endpoint. Negative
   * scenarios covered: MUST_PROVIDE_EMAIL: null and empty email.
   * INVALID_EMAIL: random string which doesnt match email pattern.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndInvalidEmail() throws ApiException {

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        TestData.NULL_PARAM);
      usersApi.createUser(ApiUtils.getValidHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.MUST_PROVIDE_EMAIL.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        TestData.EMPTY_PARAM);
      usersApi.createUser(ApiUtils.getValidHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.MUST_PROVIDE_EMAIL.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        TestData.INVALID_EMAIL);
      usersApi.createUser(ApiUtils.getValidHeaderParams(),
                          userCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating user through the createUser endpoint. Case covered is
   * successful creation of user.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateUser() throws ApiException {
    try {
      UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME,
                                                                        TestData.LAST_NAME,
                                                                        ApiUtils.getUserEmail());
      UserCreationResponse response = usersApi.createUser(ApiUtils.getValidHeaderParams(),
                                                          userCreationInfo);
      assertNotNull(response.getUserId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
