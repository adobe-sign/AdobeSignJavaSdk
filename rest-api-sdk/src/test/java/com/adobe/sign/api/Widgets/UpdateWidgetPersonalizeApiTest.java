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

package com.adobe.sign.api.Widgets;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.WidgetsApi;
import com.adobe.sign.model.widgets.WidgetPersonalizationInfo;
import com.adobe.sign.model.widgets.WidgetPersonalizeResponse;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.WidgetUtils;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Update Widgets Personalize endpoint.
 */
public class UpdateWidgetPersonalizeApiTest {

  private static WidgetsApi widgetsApi = null;
  private static String widgetId = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    widgetId = WidgetUtils.createWidget(ApiUtils.getWidgetName());
    widgetsApi = WidgetUtils.getWidgetsApi();
  }

  /**
   * Test for personalizing the widget to a signable document for a specific known user through the getWidgetPersonalizeResponse endpoint.
   * Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
    widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);

    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                                               widgetId,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                                               widgetId,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for personalizing the widget to a signable document for a specific known user through the updateWidgetPersonalize endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
    widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                                               widgetId,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for personalizing the widget to a signable document for a specific known user through the updateWidgetPersonalize endpoint. Negative scenarios covered:
   * INVALID_WIDGET_ID: empty and null widgetId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWidgetId() throws ApiException {
    WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
    widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(),
                                                                                               TestData.EMPTY_PARAM,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(),
                                                                                               TestData.NULL_PARAM,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for personalizing the widget to a signable document for a specific known user through the updateWidgetPersonalize endpoint. Negative scenarios covered:
   * INVALID_EMAIL : null and invalid e-mail
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWidgetPersonalizationInfo() throws ApiException {
    WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
    widgetPersonalizationInfo.setEmail(TestData.NULL_PARAM);
    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(),
                                                                                               widgetId,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }

    widgetPersonalizationInfo.setEmail(TestData.INVALID_EMAIL);
    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(),
                                                                                               widgetId,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for personalizing the widget to a signable document for a specific known user through the updateWidgetPersonalize endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testUpdateWidgetPersonalize() throws ApiException {
    WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
    widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
    try {
      WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(),
                                                                                               widgetId,
                                                                                               widgetPersonalizationInfo);
      assertNotNull(widgetPersonalizeResponse);
      assertNotNull(widgetPersonalizeResponse.getWidgetId());
      assertNotNull(widgetPersonalizeResponse.getJavascript());
      assertNotNull(widgetPersonalizeResponse.getUrl());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}