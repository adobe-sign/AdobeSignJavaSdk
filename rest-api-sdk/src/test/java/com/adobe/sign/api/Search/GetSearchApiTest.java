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

import com.adobe.sign.api.SearchApi;
import com.adobe.sign.model.search.AgreementAssetEventGetResponse;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.SearchUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get Search API.
 */
public class GetSearchApiTest {

  private SearchApi searchApi = null;
  
  private String searchId = null;
  
  private String pageCursor = null;

  @Before
  public void setup() throws ApiException {
    searchApi = SearchUtils.getSearchApi();
    searchId = SearchUtils.getResourceId();
    pageCursor = SearchUtils.getPageCursor();
  }
  
  /**
   * Test for fetching the result for the page which is described inside the Page Cursor Info through the
   * createAssetEvent endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      searchApi.getAssetEvent(TestData.NULL_PARAM,
                              searchId,
                              pageCursor,
                              TestData.X_API_HEADER,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      searchApi.getAssetEvent(TestData.EMPTY_PARAM,
                              searchId,
                              pageCursor,
                              TestData.X_API_HEADER,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the result for the page which is described inside the Page Cursor Info through the
   * createAssetEvent endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      searchApi.getAssetEvent(TestData.ACCESS_TOKEN,
                              searchId,
                              pageCursor,
                              TestData.EMPTY_PARAM,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the result for the page which is described inside the Page Cursor Info through the
   * createAssetEvent endpoint. Negative scenarios covered:
   * INVALID_SEARCH_ID: null and empty searchId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidSearchId() throws ApiException {
    try {
      searchApi.getAssetEvent(TestData.ACCESS_TOKEN,
                              TestData.NULL_PARAM,
                              pageCursor,
                              TestData.X_API_HEADER,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_SEARCH_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      searchApi.getAssetEvent(TestData.ACCESS_TOKEN,
                              TestData.EMPTY_PARAM,
                              pageCursor,
                              TestData.X_API_HEADER,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_SEARCH_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the result for the page which is described inside the Page Cursor Info through the
   * createAssetEvent endpoint. Negative scenarios covered:
   * INVALID_PAGE_CURSOR: null and empty pageCursor.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidPageCursor() throws ApiException {
    try {
      searchApi.getAssetEvent(TestData.ACCESS_TOKEN,
                              searchId,
                              TestData.NULL_PARAM,
                              TestData.X_API_HEADER,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PAGE_CURSOR.getApiCode().equals(e.getApiCode()));
    }

    try {
      searchApi.getAssetEvent(TestData.ACCESS_TOKEN,
                              searchId,
                              TestData.EMPTY_PARAM,
                              TestData.X_API_HEADER,
                              TestData.PAGE_SIZE);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PAGE_CURSOR.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching the result for the page which is described inside the Page Cursor Info through the createAssetEvent endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetAssetEvent() throws ApiException {
    try {
      AgreementAssetEventGetResponse response = searchApi.getAssetEvent(TestData.ACCESS_TOKEN,
                                                                        searchId,
                                                                        pageCursor,
                                                                        TestData.X_API_HEADER,
                                                                        TestData.PAGE_SIZE);
      assertNotNull(response);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
