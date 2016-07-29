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
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateResponse;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.MegaSignUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Put MegaSigns APIs.
 */
public class PutMegaSignsApiTest {

  private static MegaSignsApi megaSignsApi = null;
  private static String megaSignId = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    megaSignId = MegaSignUtils.createMegaSign(ApiUtils.getMegaSignName());
    megaSignsApi = MegaSignUtils.getMegaSignsApi();
    
  }
  /**
   * Test for cancelling all the child agreements of the specified megaSign agreement through the updateMegaSignStatus endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
    updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getNullAccessTokenHeaderParams(),
                                        megaSignId,
                                        updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                        megaSignId,
                                        updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }

  }

  /**
   * Test for cancelling all the child agreements of the specified megaSign agreement through the updateMegaSignStatus endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
    updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getEmptyXApiUserHeaderParams(),
                                        megaSignId,
                                        updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for cancelling all the child agreements of the specified megaSign agreement through the updateMegaSignStatus endpoint. Negative scenarios covered:
   * INVALID_MEGASIGN_ID: empty and null megaSignId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidMegaSignId() throws ApiException {
    MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
    updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(),
                                        TestData.EMPTY_PARAM,
                                        updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(),
                                        TestData.NULL_PARAM,
                                        updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for cancelling all the child agreements of the specified megaSign agreement through the updateMegaSignStatus endpoint. Negative scenarios covered:
   * INVALID_MEGASIGN_STATUS: invalid updateInfo status.
   * MISSING_REQUIRED_PARAM: null updateInfo object.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidMegaSignStatus() throws ApiException {
    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(),
                                        megaSignId,
                                        null);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
    updateInfo.setValue(null);

    try {
      megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(),
                                        megaSignId,
                                        updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_MEGASIGN_STATUS.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for cancelling all the child agreements of the specified megaSign agreement through the updateMegaSignStatus endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  public void testUpdateStatus() throws ApiException {
    MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
    updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      MegaSignStatusUpdateResponse megaSignStatusUpdateResponse = megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(),
                                                                                                    megaSignId,
                                                                                                    updateInfo);
      assertNotNull(megaSignStatusUpdateResponse);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
