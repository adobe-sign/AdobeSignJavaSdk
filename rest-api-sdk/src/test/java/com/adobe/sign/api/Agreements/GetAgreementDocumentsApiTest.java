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
import com.adobe.sign.model.agreements.AgreementDocuments;
import com.adobe.sign.utils.AgreementsUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Get Agreement Documents API.
 */
public class GetAgreementDocumentsApiTest {
  private static AgreementsApi agreementsApi = null;
  private static String agreementId = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    agreementsApi = AgreementsUtils.getAgreementsApi();
    agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
  }
  /**
   * Test for fetching all documents through the getAllDocuments endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {

    try {
      agreementsApi.getAllDocuments(ApiUtils.getNullAccessTokenHeaderParams(),
                                    agreementId,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }


    try {
      agreementsApi.getAllDocuments(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                    agreementId,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }

  }
  /**
   * Test for fetching all documents through the getAllDocuments endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {

    try {
      agreementsApi.getAllDocuments(ApiUtils.getEmptyXApiUserHeaderParams(),
                                    agreementId,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for fetching all documents through the getAllDocuments endpoint. Negative scenarios covered:
   * INVALID_AGREEMENT_ID: null and empty agreementId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementId() throws ApiException {

    try {
      agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(),
                                    TestData.EMPTY_PARAM,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(),
                                    TestData.NULL_PARAM,
                                    TestData.VERSION_ID,
                                    TestData.PARTICIPANT_EMAIL,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for fetching all documents through the getAllDocuments endpoint. Negative scenarios covered:
   * INVALID_VERSION_ID: empty versionId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidVersionId() throws ApiException {

    try {
      agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(),
                                    agreementId,
                                    TestData.EMPTY_PARAM,
                                    TestData.PARTICIPANT_EMAIL,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for fetching all documents through the getAllDocuments endpoint. Negative scenarios covered:
   * INVALID_PARTICIPANT: empty participantId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidParticipantEmail() throws ApiException {

    try {
      agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(),
                                    agreementId,
                                    TestData.VERSION_ID,
                                    TestData.EMPTY_PARAM,
                                    TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for fetching all documents through the getAllDocuments endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testGetAllDocuments() throws ApiException {

    try {
      AgreementDocuments agreementDocuments = agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(),
                                                                            agreementId,
                                                                            TestData.VERSION_ID,
                                                                            TestData.PARTICIPANT_EMAIL,
                                                                            TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
      assertNotNull(agreementDocuments);

    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }

  }
}
