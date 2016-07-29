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

package com.adobe.sign.api.Views;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.ViewsApi;
import com.adobe.sign.model.views.TargetViewRequest;
import com.adobe.sign.model.views.TargetViewRequest.TargetViewEnum;
import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.ViewsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Post View Settings APIs
 */
public class PostViewSettingsApiTest {

  private static ViewsApi viewsApi = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() {

    viewsApi = ViewsUtils.getViewsApi();
  }

  /**
   * Test for returning the URL for settings page through the getSettingsUrl endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    TargetViewRequest targetViewRequest = new TargetViewRequest();
    targetViewRequest.setTargetView(TargetViewEnum.USER_PROFILE);

    try {
      viewsApi.createSettingsUrl(ApiUtils.getNullAccessTokenHeaderParams(),
                                 targetViewRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      viewsApi.createSettingsUrl(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                 targetViewRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL for settings page through the getSettingsUrl endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    TargetViewRequest targetViewRequest = new TargetViewRequest();
    targetViewRequest.setTargetView(TargetViewEnum.USER_PROFILE);

    try {
      viewsApi.createSettingsUrl(ApiUtils.getEmptyXApiUserHeaderParams(),
                                 targetViewRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL for settings page through the getSettingsUrl endpoint. Negative scenarios covered:
   * INVALID_TARGET_VIEW: null target view.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidTargetView() throws ApiException {
    TargetViewRequest targetViewRequest = new TargetViewRequest();
    targetViewRequest.setTargetView(null);

    try {
      viewsApi.createSettingsUrl(ApiUtils.getValidHeaderParams(),
                                 targetViewRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_TARGET_VIEW.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL for settings page through the getSettingsUrl endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateSettingsUrl() throws ApiException {
    TargetViewRequest targetViewRequest = new TargetViewRequest();
    targetViewRequest.setTargetView(TargetViewEnum.USER_PROFILE);

    try {
      ViewUrl viewUrl = viewsApi.createSettingsUrl(ApiUtils.getValidHeaderParams(),
                                                   targetViewRequest);
      assertNotNull(viewUrl);
      assertNotNull(viewUrl.getViewURL());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
