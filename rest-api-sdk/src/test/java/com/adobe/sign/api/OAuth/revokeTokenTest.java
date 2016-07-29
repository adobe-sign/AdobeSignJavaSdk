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
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.OAuthUtil;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit test cases for Get revokeToken API.
 */
public class revokeTokenTest {

  private static OAuthApi oAuthApi = null;

  @BeforeClass
  public static void setup() {
    oAuthApi = OAuthUtil.getoAuthApi();
  }

  /**
   * Test for revoking token through the revokeAccessToken endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: token is null.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidToken() throws ApiException {

    //token Null.
    try {
      oAuthApi.revokeToken(null);
    } catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }
}
