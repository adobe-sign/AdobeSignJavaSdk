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
import com.adobe.sign.model.widgets.WidgetCreationRequest;
import com.adobe.sign.model.widgets.WidgetCreationResponse;
import com.adobe.sign.model.widgets.WidgetFileInfo;
import com.adobe.sign.model.widgets.WidgetURLFileInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.TransientDocumentsUtils;
import com.adobe.sign.utils.WidgetUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Post Widgets API.
 */
public class PostWidgetsApiTest {
  private WidgetsApi widgetsApi = null;
  private String libraryDocumentId = null;
  private String transientDocumentId = null;

  @Before
  public void setup() throws ApiException {
    widgetsApi = WidgetUtils.getWidgetsApi();

    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
  }

  /**
   * Test for creating a widget through the createWidget endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();

    try {
      widgetsApi.createWidget(TestData.NULL_PARAM,
                              widgetCreationRequest,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      widgetsApi.createWidget(TestData.EMPTY_PARAM,
                              widgetCreationRequest,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a widget through the createWidget endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null widgetCreationRequest and null widget name.
   * INVALID_FILE_INFO: FileInfo with all 4 parameters null; FileInfo with more than 1 parameter non-empty.
   * URL_INVALID: Invalid url specified in FileInfo's getDocumentUrl parameter.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWidgetCreationInfo() throws ApiException {
    try {
      widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                              null,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    WidgetCreationRequest widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.NULL_PARAM);

    try {
      widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                              widgetCreationRequest,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    WidgetFileInfo fileInfo = new WidgetFileInfo();
    widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.WIDGET_NAME,
                                                                 fileInfo);

    try {
      widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                              widgetCreationRequest,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    WidgetURLFileInfo url = new WidgetURLFileInfo();
    url.setUrl(TestData.INVALID_URL);
    fileInfo.setDocumentURL(url);

    widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.WIDGET_NAME,
                                                                 fileInfo);

    try {
      widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                              widgetCreationRequest,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setLibraryDocumentId(libraryDocumentId);
    fileInfo.setTransientDocumentId(transientDocumentId);
    fileInfo.setDocumentURL(null);

    widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.WIDGET_NAME,
                                                                 fileInfo);

    try {
      widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                              widgetCreationRequest,
                              TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a widget through the createWidget endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();

    try {
      widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                              widgetCreationRequest,
                              TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a widget through the createWidget endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateWidget() throws ApiException {
    WidgetCreationRequest widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.AGREEMENT_NAME);

    try {
      WidgetCreationResponse widgetCreationResponse = widgetsApi.createWidget(TestData.ACCESS_TOKEN,
                                                                              widgetCreationRequest,
                                                                              TestData.X_API_HEADER);
      assertNotNull(widgetCreationResponse);
      assertNotNull(widgetCreationResponse.getWidgetId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}