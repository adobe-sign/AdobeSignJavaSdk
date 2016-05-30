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
import com.adobe.sign.model.views.AgreementAssetRequest;
import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ViewsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Post View Agreement Assets APIs
 */
public class PostViewAgreementAssetsApiTest {
  
  private ViewsApi viewsApi = null;
  private String libraryDocumentId = null;

  @Before
  public void setup() throws ApiException {
    viewsApi = ViewsUtils.getViewsApi();
    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
  }
  
  /**
   * Test for returning the URL which shows the view page of given agreement asset through the getAgreementAssetUrl endpoint.
   * Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
    agreementAssetRequest.setAgreementAssetId(libraryDocumentId);

    try {
      viewsApi.createAgreementAssetUrl(TestData.NULL_PARAM,
                                       agreementAssetRequest,
                                       TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      viewsApi.createAgreementAssetUrl(TestData.EMPTY_PARAM,
                                       agreementAssetRequest,
                                       TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL which shows the view page of given agreement asset through the getAgreementAssetUrl endpoint.
   * Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
    agreementAssetRequest.setAgreementAssetId(libraryDocumentId);

    try {
      viewsApi.createAgreementAssetUrl(TestData.ACCESS_TOKEN,
                                       agreementAssetRequest,
                                       TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL which shows the view page of given agreement asset through the getAgreementAssetUrl endpoint.
   * Negative scenarios covered:
   * INVALID_AGREEMENT_ASSET_ID: null and empty agreement asset id.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementAssetId() throws ApiException {
    AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
    agreementAssetRequest.setAgreementAssetId(TestData.NULL_PARAM);

    try {
      viewsApi.createAgreementAssetUrl(TestData.ACCESS_TOKEN,
                                       agreementAssetRequest,
                                       TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID.getApiCode().equals(e.getApiCode()));
    }

    agreementAssetRequest.setAgreementAssetId(TestData.EMPTY_PARAM);

    try {
      viewsApi.createAgreementAssetUrl(TestData.ACCESS_TOKEN,
                                       agreementAssetRequest,
                                       TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for returning the URL which shows the view page of given agreement asset through the getAgreementAssetUrl endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateAgreementAssetUrl() throws ApiException {
    AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
    agreementAssetRequest.setAgreementAssetId(libraryDocumentId);

    try {
      ViewUrl viewUrl = viewsApi.createAgreementAssetUrl(TestData.ACCESS_TOKEN,
                                                         agreementAssetRequest,
                                                         TestData.X_API_HEADER);
      assertNotNull(viewUrl);
      assertNotNull(viewUrl.getViewURL());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
