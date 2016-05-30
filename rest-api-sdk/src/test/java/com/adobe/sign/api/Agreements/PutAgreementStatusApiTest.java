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

package com.adobe.sign.api.Agreements;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.AgreementsApi;
import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;
import com.adobe.sign.model.agreements.AgreementStatusUpdateResponse;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.AgreementsUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Put Agreement Status API.
 */
public class PutAgreementStatusApiTest {
  private AgreementsApi agreementsApi = null;
  private String agreementId = null;

  @Before
  public void setup() throws ApiException {
    agreementsApi = AgreementsUtils.getAgreementsApi();
    agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
  }
  /**
   * Test for modifying an agreement's status through the updateStatus endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
    updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      agreementsApi.updateStatus(TestData.NULL_PARAM,
                                 agreementId,
                                 updateInfo,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.updateStatus(TestData.EMPTY_PARAM,
                                 agreementId,
                                 updateInfo,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }

  }
  /**
   * Test for modifying an agreement's status through the updateStatus endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
    updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      agreementsApi.updateStatus(TestData.ACCESS_TOKEN,
                                 agreementId,
                                 updateInfo,
                                 TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for modifying an agreement's status through the updateStatus endpoint. Negative scenarios covered:
   * INVALID_AGREEMENT_ID: null and empty agreementId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementId() throws ApiException {
    AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
    updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      agreementsApi.updateStatus(TestData.ACCESS_TOKEN,
                                 TestData.EMPTY_PARAM,
                                 updateInfo,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.updateStatus(TestData.ACCESS_TOKEN,
                                 TestData.NULL_PARAM,
                                 updateInfo,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for modifying an agreement's status through the updateStatus endpoint. Negative scenarios covered:
   * MUST_PROVIDE_VALID_AGREEMENT_STATUS: invalid updateInfo status.
   * MISSING_REQUIRED_PARAM: null updateInfo object.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementStatus() throws ApiException {

    try {
      agreementsApi.updateStatus(TestData.ACCESS_TOKEN,
                                 agreementId,
                                 null,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
    updateInfo.setValue(null);

    try {
      agreementsApi.updateStatus(TestData.ACCESS_TOKEN,
                                 agreementId,
                                 updateInfo,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MUST_PROVIDE_VALID_AGREEMENT_STATUS.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for modifying an agreement's status through the updateStatus endpoint.
   */
  public void testUpdateStatus() throws ApiException {
    AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
    updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);

    try {
      AgreementStatusUpdateResponse response = agreementsApi.updateStatus(TestData.ACCESS_TOKEN,
                                                                          agreementId,
                                                                          updateInfo,
                                                                          TestData.X_API_HEADER);
      assertNotNull(response);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }


}
