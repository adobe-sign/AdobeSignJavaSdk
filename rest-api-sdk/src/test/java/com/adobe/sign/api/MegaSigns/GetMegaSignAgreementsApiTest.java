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
import com.adobe.sign.model.megaSigns.MegaSignChildAgreements;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.MegaSignUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get MegaSign Agreements APIs.
 */
public class GetMegaSignAgreementsApiTest {
  
  private MegaSignsApi megaSignsApi = null;
  private String megaSignId = null;

  @Before
  public void setup() throws ApiException {
    megaSignId = MegaSignUtils.getResourceId(TestData.MEGASIGN_NAME);
    megaSignsApi = MegaSignUtils.getMegaSignsApi();
  }


  /**
   * Test for retrieving the the child agreements of the specified megaSign parent agreement through the GetAgreeement endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      megaSignsApi.getMegaSignChildAgreements(TestData.NULL_PARAM,
                                              megaSignId,
                                              TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.getMegaSignChildAgreements(TestData.EMPTY_PARAM,
                                              megaSignId,
                                              TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the the child agreements of the specified megaSign parent agreement through the GetAgreeement endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      megaSignsApi.getMegaSignChildAgreements(TestData.ACCESS_TOKEN,
                                              megaSignId,
                                              TestData.EMPTY_PARAM);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the the child agreements of the specified megaSign parent agreement through the GetAgreeement endpoint. Negative scenarios covered:
   * INVALID_MEGASIGN_ID: empty and null megaSignId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidMegaSignId() throws ApiException {
    try {
      megaSignsApi.getMegaSignChildAgreements(TestData.ACCESS_TOKEN,
                                              TestData.EMPTY_PARAM,
                                              TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.getMegaSignChildAgreements(TestData.ACCESS_TOKEN,
                                              TestData.NULL_PARAM,
                                              TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the the child agreements of the specified megaSign parent agreement through the GetAgreeement endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetAgreement() throws ApiException {
    try {
      MegaSignChildAgreements megaSignChildAgreements = megaSignsApi.getMegaSignChildAgreements(TestData.ACCESS_TOKEN,
                                                                                                megaSignId,
                                                                                                TestData.X_API_HEADER);
      assertNotNull(megaSignChildAgreements);
    } 
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
