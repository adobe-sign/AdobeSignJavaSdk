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
import com.adobe.sign.model.views.AgreementAssetListRequest;
import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ViewsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Post View Agreement Asset List APIs
 */
public class PostViewAgreementAssetListApiTest {

  private ViewsApi viewsApi = null;
  
  @Before
  public void setup() {
    viewsApi = ViewsUtils.getViewsApi();
  }

  /**
   * Test for returning the URL for manage page through the getAgreementAssetListUrl endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();

    try {
      viewsApi.createAgreementAssetListUrl(TestData.NULL_PARAM,
                                           TestData.X_API_HEADER,
                                           agreementAssetListRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      viewsApi.createAgreementAssetListUrl(TestData.EMPTY_PARAM,
                                           TestData.X_API_HEADER,
                                           agreementAssetListRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL for manage page through the getAgreementAssetListUrl endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();

    try {
      viewsApi.createAgreementAssetListUrl(TestData.ACCESS_TOKEN,
                                           TestData.EMPTY_PARAM,
                                           agreementAssetListRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL for manage page through the getAgreementAssetListUrl endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateAgreementAssetListUrl() throws ApiException {
    AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();

    try {
      ViewUrl viewUrl = viewsApi.createAgreementAssetListUrl(TestData.ACCESS_TOKEN,
                                                             TestData.X_API_HEADER,
                                                             agreementAssetListRequest);
      assertNotNull(viewUrl);
      assertNotNull(viewUrl.getViewURL());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
