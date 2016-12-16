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

package com.adobe.sign.api.Search;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import com.adobe.sign.api.SearchApi;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventRequest;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.SearchUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Create Search endpoint.
 */
public class CreateSearchApiTest {

  private static SearchApi searchApi = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() {
    ApiUtils.configureProperty();
    searchApi = SearchUtils.getSearchApi();
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(ApiUtils.getDate(TestData.DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE),
                                                                                                      ApiUtils.getDate(TestData.DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE));
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(ApiUtils.getDate(TestData.DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE),
                                                                                                      ApiUtils.getDate(TestData.DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE));
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null AgreementAssetEventRequest.
   * INVALID_DATE: null startDate; null endDate; endDate earlier than startDate.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementAssetEventRequest() throws ApiException {
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(),
                                                                                                   null);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(null,
                                                                                                      ApiUtils.getDate(TestData.DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE));
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
    }

    agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(ApiUtils.getDate(TestData.DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE),
                                                                           null);
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
    }

    Date startDate = ApiUtils.getDate(TestData.DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE);
    Date endDate = ApiUtils.getDate(TestData.DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE);

    agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(startDate,
                                                                           endDate);
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateAssetEvent() throws ApiException {
    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(ApiUtils.getDate(TestData.DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE),
                                                                                                      ApiUtils.getDate(TestData.DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE));
    try {
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(),
                                                                                                   agreementAssetEventRequest);
      assertNotNull(agreementAssetEventPostResponse);
      assertNotNull(agreementAssetEventPostResponse.getSearchId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
