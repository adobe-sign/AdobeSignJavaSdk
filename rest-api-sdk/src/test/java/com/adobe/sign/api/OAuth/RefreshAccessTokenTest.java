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

package com.adobe.sign.api.OAuth;

import static org.junit.Assert.assertTrue;

import com.adobe.sign.api.OAuthApi;
import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.OAuthUtil;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit test cases for Get refreshAccessToken API.
 */
public class RefreshAccessTokenTest {

  private static OAuthApi oAuthApi = null;
  private static String REFRESH_TOKEN = "refreshToken";



  @BeforeClass
  public static void setup() {
    ApiUtils.configureProperty();
    oAuthApi = OAuthUtil.getoAuthApi();
  }

  /**
   * Test for refreshing the access token through the refreshAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: ClientId null in accessTokenRefreshRequest.
   * @throws ApiException
   */
  @Test
  public void testInvalidClientId() throws ApiException {

    //ClientId Null in accessTokenRefreshRequest
    AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.NULL_PARAM,
                                                                                     TestData.CLIENT_SECRET,
                                                                                     REFRESH_TOKEN,
                                                                                     TestData.REFRESH_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for refreshing the access token through the refreshAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: ClientSecret null in accessTokenRefreshRequest.
   * @throws ApiException
   */
  @Test
  public void testInvalidClientSecret() throws ApiException {

    //ClientSecret Null in accessTokenRefreshRequest
    AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.CLIENT_ID,
                                                                                     TestData.NULL_PARAM,
                                                                                     REFRESH_TOKEN,
                                                                                     TestData.REFRESH_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for refreshing the access token through the refreshAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: grantType null in accessTokenRefreshRequest.
   * @throws ApiException
   */
  @Test
  public void testInvalidGrantType() throws ApiException {

    //grantType Null in accessTokenRefreshRequest
    AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.CLIENT_ID,
                                                                                     TestData.CLIENT_SECRET,
                                                                                     REFRESH_TOKEN,
                                                                                     TestData.NULL_PARAM);
    try {
      oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for refreshing the access token through the refreshAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: refreshToken null in accessTokenRefreshRequest.
   * @throws ApiException
   */
  @Test
  public void testInvalidRefreshToken() throws ApiException {

    //refreshToken Null in accessTokenRefreshRequest
    AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.CLIENT_ID,
                                                                                     TestData.CLIENT_SECRET,
                                                                                     TestData.NULL_PARAM,
                                                                                     TestData.REFRESH_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }
}
