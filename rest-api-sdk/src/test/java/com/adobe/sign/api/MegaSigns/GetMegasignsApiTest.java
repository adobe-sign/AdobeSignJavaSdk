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

package com.adobe.sign.api.MegaSigns;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.MegaSignsApi;
import com.adobe.sign.model.megaSigns.MegaSigns;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.MegaSignUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Get MegaSigns endpoint.
 */
public class GetMegasignsApiTest {

  private static MegaSignsApi megaSignsApi = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    megaSignsApi = MegaSignUtils.getMegaSignsApi();
  }

  /**
   * Test for fetching all megaSign parent agreement through the getMegaSigns endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      MegaSigns megaSigns = megaSignsApi.getMegaSigns(ApiUtils.getNullAccessTokenHeaderParams(),
                                                      TestData.MEGASIGN_QUERY);
      assertNotNull(megaSigns);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      MegaSigns megaSigns = megaSignsApi.getMegaSigns(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                      TestData.MEGASIGN_QUERY);
      assertNotNull(megaSigns);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching all megaSign parent agreement through the getMegaSigns endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      MegaSigns megaSigns = megaSignsApi.getMegaSigns(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                      TestData.MEGASIGN_QUERY);
      assertNotNull(megaSigns);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching all megaSign parent agreement through the getMegaSigns endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testMegaSigns() throws ApiException {
    try {
      MegaSigns megaSigns = megaSignsApi.getMegaSigns(ApiUtils.getValidHeaderParams(),
                                                      TestData.MEGASIGN_QUERY);
      assertNotNull(megaSigns);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
