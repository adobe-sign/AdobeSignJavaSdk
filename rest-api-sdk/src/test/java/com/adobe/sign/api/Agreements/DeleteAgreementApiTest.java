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

import static com.adobe.sign.utils.ApiUtils.getValidHeaderParams;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.AgreementsApi;
import com.adobe.sign.utils.AgreementsUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Delete Agreement API.
 */
public class DeleteAgreementApiTest {
  private static AgreementsApi agreementsApi = null;
  private static String agreementId = null;

  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    agreementsApi = AgreementsUtils.getAgreementsApi();
    agreementId = AgreementsUtils.createAgreement(ApiUtils.getAgreementName());
  }
  /**
   * Test for deleting an agreement through the deleteAgreement endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {

    try {
      agreementsApi.deleteAgreement(ApiUtils.getNullAccessTokenHeaderParams(),
                                    agreementId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.deleteAgreement(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                    agreementId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for deleting an agreement through the deleteAgreement endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {

    try {
      agreementsApi.deleteAgreement(ApiUtils.getEmptyXApiUserHeaderParams(),
                                    agreementId);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for deleting an agreement through the deleteAgreement endpoint. Negative scenarios covered:
   * INVALID_AGREEMENT_ID: empty and null agreementId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementId() throws ApiException {

    try {
      agreementsApi.deleteAgreement(ApiUtils.getValidHeaderParams(),
                                    TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.deleteAgreement(ApiUtils.getValidHeaderParams(),
                                    TestData.NULL_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for deleting an agreement through the deleteAgreement endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testDeleteAgreement() throws ApiException {

    try {
     agreementsApi.deleteAgreement(getValidHeaderParams(),
                                    agreementId);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
