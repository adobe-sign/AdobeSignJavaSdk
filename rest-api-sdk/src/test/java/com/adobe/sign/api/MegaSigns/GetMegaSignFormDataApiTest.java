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

package com.adobe.sign.api.MegaSigns;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.MegaSignsApi;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.MegaSignUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Get MegaSign FormData APIs.
 */
public class GetMegaSignFormDataApiTest {

  private static MegaSignsApi megaSignsApi = null;
  private static String megaSignId = null;

  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    megaSignId = MegaSignUtils.getResourceId(TestData.MEGASIGN_NAME);
    megaSignsApi = MegaSignUtils.getMegaSignsApi();
  }

  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {

    try {
      megaSignsApi.getMegaSignFormData(ApiUtils.getNullAccessTokenHeaderParams(),
                                       megaSignId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.getMegaSignFormData(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                       megaSignId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }

  }

  /**
   * Test for fetching data entered by recipients into interactive form fields at the time they signed the child agreements of the specified megaSign through the getMegaSignFormData endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {

    try {
      megaSignsApi.getMegaSignFormData(ApiUtils.getEmptyXApiUserHeaderParams(),
                                       megaSignId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching data entered by recipients into interactive form fields at the time they signed the child agreements of the specified megaSign through the getMegaSignFormData endpoint. Negative scenarios covered:
   * INVALID_MEGASIGN_ID: empty and null megaSignId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidMegaSignId() throws ApiException {

    try {
      megaSignsApi.getMegaSignFormData(ApiUtils.getValidHeaderParams(),
                                       TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.getMegaSignFormData(ApiUtils.getValidHeaderParams(),
                                       TestData.NULL_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching data entered by recipients into interactive form fields at the time they signed the child agreements of the specified megaSign through the getMegaSignFormData endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetFormData() throws ApiException {

    try {
      byte[] megaSignFormData = megaSignsApi.getMegaSignFormData(ApiUtils.getValidHeaderParams(),
                                                                 megaSignId);
      assertNotNull(megaSignFormData);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
