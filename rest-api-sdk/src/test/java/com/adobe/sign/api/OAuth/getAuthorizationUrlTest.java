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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import com.adobe.sign.api.OAuthApi;
import com.adobe.sign.model.oAuth.AuthorizationInfo;
import com.adobe.sign.model.oAuth.Scope;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.OAuthUtil;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit test cases for Get getAuthorizationUrlTest API.
 */
public class getAuthorizationUrlTest {

  private static OAuthApi oAuthApi = null;
  private static ArrayList<Scope> scopes = new ArrayList<>();

  @BeforeClass
  public static void setup() {
    oAuthApi = OAuthUtil.getoAuthApi();
    scopes.add(new Scope("user_write", "account"));
  }

  /**
   * Test for fetching the authorizationUrl through the getAuthorizationUrl endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: ClientId null in authorizationInfo.
   * @throws ApiException
   */
  @Test
  public void testInvalidClientId() throws ApiException {

    //ClientId Null in authorizationInfo
    AuthorizationInfo authorizationInfo = new AuthorizationInfo(TestData.NULL_PARAM,
                                                                TestData.REDIRECT_URI,
                                                                scopes,
                                                                TestData.STATE,
                                                                TestData.RESPONSE_TYPE);
    try {
      oAuthApi.getAuthorizationUrl(authorizationInfo);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }


  /**
   * Test for fetching the authorizationUrl through the getAuthorizationUrl endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: redirectUri null in authorizationInfo.
   * INVALID_REQUEST : Invalid redirectUri specified in authorizationInfo.
   * @throws ApiException
   */
  @Test
  public void testInvalidRedirectUri() throws ApiException {

    //redirectUri null in authorizationInfo
    AuthorizationInfo authorizationInfo = new AuthorizationInfo(TestData.CLIENT_ID,
                                                                TestData.NULL_PARAM,
                                                                scopes,
                                                                TestData.STATE,
                                                                TestData.RESPONSE_TYPE);
    try {
      oAuthApi.getAuthorizationUrl(authorizationInfo);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    //Invalid redirectUri in authorizationInfo
    authorizationInfo.setRedirectUri(TestData.INVALID_URL);
    try {
      oAuthApi.getAuthorizationUrl(authorizationInfo);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.INVALID_REQUEST.getApiCode().equals(e.getApiCode()));
    }
  }


  /**
   * Test for fetching the authorizationUrl through the getAuthorizationUrl endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: scopes null in authorizationInfo.
   * @throws ApiException
   */
  @Test
  public void testInvalidScopes() throws ApiException {

    //scopes Null in authorizationInfo
    AuthorizationInfo authorizationInfo = new AuthorizationInfo(TestData.CLIENT_ID,
                                                                TestData.REDIRECT_URI,
                                                                null,
                                                                TestData.STATE,
                                                                TestData.RESPONSE_TYPE);
    try {
      oAuthApi.getAuthorizationUrl(authorizationInfo);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the authorizationUrl through the getAuthorizationUrl endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: responseType null in authorizationInfo.
   * @throws ApiException
   */
  @Test
  public void testInvalidResponseType() throws ApiException {

    //responseType Null in authorizationInfo
    AuthorizationInfo authorizationInfo = new AuthorizationInfo(TestData.CLIENT_ID,
                                                                TestData.REDIRECT_URI,
                                                                scopes,
                                                                TestData.STATE,
                                                                TestData.NULL_PARAM);
    try {
      oAuthApi.getAuthorizationUrl(authorizationInfo);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
        SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the authorizationUrl through the getAuthorizationUrl endpoint.
   * Case covered: authorizationUrl fetched successfully.
   *
   * @throws ApiException
   */
  @Test
  public void testGetAuthorizationUrl() throws ApiException {

    AuthorizationInfo authorizationInfo = new AuthorizationInfo(TestData.CLIENT_ID,
                                                                TestData.REDIRECT_URI,
                                                                scopes,
                                                                TestData.STATE,
                                                                TestData.RESPONSE_TYPE);
    try {
      String authorizationUrl = oAuthApi.getAuthorizationUrl(authorizationInfo);
      assertNotNull(authorizationUrl);
    }
    catch (ApiException e){
      fail(ApiUtils.getMessage(e));
    }
  }
}
