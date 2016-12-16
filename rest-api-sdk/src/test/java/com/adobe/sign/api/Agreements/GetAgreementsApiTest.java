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
import com.adobe.sign.model.agreements.UserAgreements;
import com.adobe.sign.utils.AgreementsUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Get Agreements endpoint.
 */
public class GetAgreementsApiTest {
  private static AgreementsApi agreementsApi = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    agreementsApi = AgreementsUtils.getAgreementsApi();
  }

  /**
   * Test for fetching all user agreements through the getAgreements endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {

    try {
      UserAgreements userAgreements = agreementsApi.getAgreements(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                  TestData.AGREEMENT_QUERY,
                                                                  TestData.AGREEMENT_EXTERNAL_ID,
                                                                  TestData.AGREEMENT_EXTERNAL_GROUP,
                                                                  TestData.AGREEMENT_EXTERNAL_NAMESPACE);
      assertNotNull(userAgreements);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      UserAgreements userAgreements = agreementsApi.getAgreements(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                  TestData.AGREEMENT_QUERY,
                                                                  TestData.AGREEMENT_EXTERNAL_ID,
                                                                  TestData.AGREEMENT_EXTERNAL_GROUP,
                                                                  TestData.AGREEMENT_EXTERNAL_NAMESPACE);
      assertNotNull(userAgreements);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }

  }

  /**
   * Test for fetching all user agreements through the getAgreements endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {

    try {
      UserAgreements userAgreements = agreementsApi.getAgreements(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                  TestData.AGREEMENT_QUERY,
                                                                  TestData.AGREEMENT_EXTERNAL_ID,
                                                                  TestData.AGREEMENT_EXTERNAL_GROUP,
                                                                  TestData.AGREEMENT_EXTERNAL_NAMESPACE);
      assertNotNull(userAgreements);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching all user agreements through the getAgreements endpoint. Negative scenarios covered:
   * EMPTY_EXTERNAL_ID_PARAMETER: when externalId is empty but at least one of externalGroup or externalNamespace is non-empty.
   *
   * @throws ApiException
   */
  @Test
  public void testEmptyExternalId() throws ApiException {

    try {
      UserAgreements userAgreements = agreementsApi.getAgreements(ApiUtils.getValidHeaderParams(),
                                                                  TestData.AGREEMENT_QUERY,
                                                                  TestData.EMPTY_PARAM,
                                                                  TestData.GROUP_NAME,
                                                                  TestData.AGREEMENT_EXTERNAL_NAMESPACE);
      assertNotNull(userAgreements);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.EMPTY_EXTERNALID_PARAMETER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for fetching all user agreements through the getAgreements endpoint.
   */
  @Test
  public void testAgreements() throws ApiException {

    try {
      UserAgreements userAgreements = agreementsApi.getAgreements(ApiUtils.getValidHeaderParams(),
                                                                  TestData.AGREEMENT_QUERY,
                                                                  TestData.AGREEMENT_EXTERNAL_ID,
                                                                  TestData.AGREEMENT_EXTERNAL_GROUP,
                                                                  TestData.AGREEMENT_EXTERNAL_NAMESPACE);
      assertNotNull(userAgreements);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
