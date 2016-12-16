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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.WidgetsApi;
import com.adobe.sign.model.widgets.WidgetStatusUpdateInfo;
import com.adobe.sign.model.widgets.WidgetStatusUpdateResponse;
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
 * Junit test cases for Update Widget Status endpoint.
 */
public class UpdateWidgetStatusApiTest {
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
   * Test for updating the status of a widget through the getWidgetPersonalizeResponse endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
    widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
    widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for updating the status of a widget through the updateWidgetStatus endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
    widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
    widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for updating the status of a widget through the updateWidgetStatus endpoint. Negative scenarios covered:
   * INVALID_WIDGET_ID: empty and null widgetId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWidgetId() throws ApiException {
    WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
    widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
    widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            TestData.EMPTY_PARAM,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            TestData.NULL_PARAM,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for updating the status of a widget through the updateWidgetStatus endpoint. Negative scenarios covered:
   * NO_ACTION_SPECIFIED : null values specified in widgetStatusUpdateInfo's message and redirectUrl parameter.
   * INVALID_URL : Invalid url specified in widgetStatusUpdateInfo's redirectUrl parameter.
   * TOO_MANY_ACTIONS_SPECIFIED : Specify both message and redirectUrl parameter in widgetStatusUpdateInfo's.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidStatusUpdateInfo() throws ApiException {
    WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
    widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACTION_SPECIFIED.getApiCode().equals(e.getApiCode()));
    }

    widgetStatusUpdateInfo.setRedirectUrl(TestData.INVALID_URL);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_URL.getApiCode().equals(e.getApiCode()));
    }

    widgetStatusUpdateInfo.setRedirectUrl(TestData.REDIRECT_URL);
    widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.TOO_MANY_ACTIONS_SPECIFIED.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for updating the status of a widget through the updateWidgetStatus endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testUpdateWidgetStatus() throws ApiException {
    WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
    widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
    widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);

    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);
      assertNotNull(widgetStatusUpdateResponse.getCode());
      assertEquals(widgetStatusUpdateResponse.getCode(),
                   WidgetStatusUpdateResponse.CodeEnum.OK);
    }
    catch (ApiException e) {
      fail(e.getMessage());
    }

    // Enabling the widget
    widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.ENABLE);
    try {
      WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(),
                                                                                            widgetId,
                                                                                            widgetStatusUpdateInfo);
      assertNotNull(widgetStatusUpdateResponse);
      assertEquals(widgetStatusUpdateResponse.getCode(),
                   WidgetStatusUpdateResponse.CodeEnum.OK);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }


}