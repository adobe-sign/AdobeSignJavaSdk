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

package com.adobe.sign.api.BaseURIs;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.BaseUrisApi;
import com.adobe.sign.model.baseUris.BaseUriInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.BaseUrisUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Get Base Uris endpoint.
 */
public class GetBaseUrisApiTest {

  private static BaseUrisApi baseurisApi = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() {
    ApiUtils.configureProperty();
    baseurisApi = BaseUrisUtils.getBaseUrisApi();

  }

  /**
   * Test for retrieving the base uri to access other endpoint through the getBaseUris endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      BaseUriInfo baseUriInfo = baseurisApi.getBaseUris(ApiUtils.getNullAccessTokenHeaderParams());
      assertNotNull(baseUriInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      BaseUriInfo baseUriInfo = baseurisApi.getBaseUris(ApiUtils.getEmptyAccessTokenHeaderParams());
      assertNotNull(baseUriInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for getting the base uri.
   * Case covered is successful execution of the endpoint call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetBaseUri() throws ApiException {
    try {
      BaseUriInfo baseUriInfo = baseurisApi.getBaseUris(ApiUtils.getValidHeaderParams());
      assertNotNull(baseUriInfo);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}