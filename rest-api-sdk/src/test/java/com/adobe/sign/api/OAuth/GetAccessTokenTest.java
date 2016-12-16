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
import com.adobe.sign.model.oAuth.AccessTokenRequest;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.OAuthUtil;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import com.adobe.sign.utils.ApiUtils;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit test cases for Get AccessToken endpoint.
 */
public class GetAccessTokenTest {

  private static OAuthApi oAuthApi = null;
  private static String CODE = "code";


  @BeforeClass
  public static void setup() {
    ApiUtils.configureProperty();
    oAuthApi = OAuthUtil.getoAuthApi();
  }

  /**
   * Test for fetching the access token through the getAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: ClientId null in accessTokenRequest.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidClientId() throws ApiException {

    //ClientId Null in AccessTokenRequest
    AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.NULL_PARAM,
                                                                   TestData.CLIENT_SECRET,
                                                                   TestData.REDIRECT_URI,
                                                                   CODE,
                                                                   TestData.ACCESS_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.getAccessToken(accessTokenRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the access token through the getAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: ClientSecret null in accessTokenRequest.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidClientSecret() throws ApiException {

    //ClientSecret Null in AccessTokenInfo
    AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID,
                                                                   TestData.NULL_PARAM,
                                                                   TestData.REDIRECT_URI,
                                                                   CODE,
                                                                   TestData.ACCESS_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.getAccessToken(accessTokenRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the access token through the getAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: grantType null in accessTokenRequest.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidGrantType() throws ApiException {

    //grantType Null in AccessTokenInfo
    AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID,
                                                                   TestData.CLIENT_SECRET,
                                                                   TestData.REDIRECT_URI,
                                                                   CODE,
                                                                   TestData.NULL_PARAM);
    try {
      oAuthApi.getAccessToken(accessTokenRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the access token through the getAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: redirectUri null in accessTokenRequest.
   * INVALID_REQUEST : Invalid redirectUri specified in accessTokenRequest.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidRedirectUri() throws ApiException {

    //redirectUri Null in AccessTokenInfo
    AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID,
                                                                   TestData.CLIENT_SECRET,
                                                                   TestData.NULL_PARAM,
                                                                   CODE,
                                                                   TestData.ACCESS_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.getAccessToken(accessTokenRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    //Invalid redirectUri in AccessTokenInfo
    accessTokenRequest.setRedirectUri(TestData.INVALID_URL);
    try {
      oAuthApi.getAccessToken(accessTokenRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_REQUEST.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the access token through the getAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: code null in accessTokenRequest.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidCode() throws ApiException {

    AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID,
                                                                   TestData.CLIENT_SECRET,
                                                                   TestData.REDIRECT_URI,
                                                                   TestData.NULL_PARAM,
                                                                   TestData.ACCESS_TOKEN_GRANT_TYPE);
    try {
      oAuthApi.getAccessToken(accessTokenRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }
}
