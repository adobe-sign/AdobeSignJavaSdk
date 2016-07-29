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
import com.adobe.sign.model.widgets.WidgetDocuments;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.WidgetUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Get Widget Documents API.
 */
public class GetWidgetDocumentsApiTest {

  private static WidgetsApi widgetsApi = null;
  private static String widgetId = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    widgetId = WidgetUtils.getResourceId(TestData.WIDGET_NAME);
    widgetsApi = WidgetUtils.getWidgetsApi();
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of the widget through the getWidgetDocuments endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getNullAccessTokenHeaderParams(),
                                    widgetId,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                    widgetId,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of the widget through the getWidgetDocuments endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getEmptyXApiUserHeaderParams(),
                                    widgetId,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of the widget through the getWidgetDocuments endpoint. Negative scenarios covered:
   * INVALID_WIDGET_ID: empty and null widgetId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWidgetId() throws ApiException {
    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(),
                                    TestData.EMPTY_PARAM,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(),
                                    TestData.NULL_PARAM,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of the widget through the getWidgetDocuments endpoint.
   * INVALID_VERSION_ID: empty versionId.
   *
   * @throws Exception
   */
  @Test
  public void testInvalidVersionId() throws Exception {

    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(),
                                    widgetId,
                                    TestData.EMPTY_PARAM,
                                    TestData.PARTICIPANT_EMAIL);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of the widget through the getWidgetDocuments endpoint.
   * INVALID_PARTICIPANT: empty participantId.
   *
   * @throws Exception
   */
  @Test
  public void testInvalidParticipantEmail() throws Exception {

    try {
      widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(),
                                    widgetId,
                                    TestData.VERSION_ID,
                                    TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of the widget through the getWidgetDocuments endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testWidgetDocuments() throws ApiException {
    try {
      WidgetDocuments widgetDocuments = widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(),
                                                                      widgetId,
                                                                      TestData.VERSION_ID,
                                                                      TestData.PARTICIPANT_EMAIL);
      assertNotNull(widgetDocuments);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
