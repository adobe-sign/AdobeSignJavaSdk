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
import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.model.agreements.AlternateParticipantInfo;
import com.adobe.sign.model.agreements.AlternateParticipantResponse;
import com.adobe.sign.model.agreements.ParticipantSetInfo;
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
 * Junit test cases for Post Agreements Alternate Participants API.
 */
public class PostAgreementsAlternateParticipantsApiTest {
  private static AgreementsApi agreementsApi = null;
  private static String agreementId = null;
  private static String participantSetId = null;
  private static String participantId = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    agreementsApi = AgreementsUtils.getAgreementsApi();
    agreementId = AgreementsUtils.createAgreement(ApiUtils.getAgreementName());

    AgreementInfo agreementInfo = agreementsApi.getAgreementInfo(ApiUtils.getValidHeaderParams(),
                                                                 agreementId);

    assertNotNull(agreementInfo);
    assertNotNull(agreementInfo.getParticipantSetInfos());
    ParticipantSetInfo participantInfo = agreementInfo.getParticipantSetInfos().get(0);
    participantSetId = participantInfo.getParticipantSetId();

    assertNotNull(participantInfo.getParticipantSetMemberInfos());
    participantId = participantInfo.getParticipantSetMemberInfos().get(0).getParticipantId();
  }

  /**
   * Test for creating an aternate participant set through the createAlternateParticipant endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getNullAccessTokenHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }

  }

  /**
   * Test for creating an aternate participant set through the createAlternateParticipant endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getEmptyXApiUserHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an aternate participant set through the createAlternateParticipant endpoint. Negative scenarios covered:
   * INVALID_AGREEMENT_ID: null and empty agreementId.
   * INVALID_PARTICIPANT_ID: null and empty participantId.
   * INVALID_PARTICIPANT_SET_ID: null and empty participantSetId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementId() throws ApiException {
    AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               TestData.EMPTY_PARAM,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               TestData.NULL_PARAM,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               TestData.EMPTY_PARAM,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PARTICIPANT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               TestData.NULL_PARAM,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PARTICIPANT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               TestData.EMPTY_PARAM,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PARTICIPANT_SET_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               TestData.NULL_PARAM,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_PARTICIPANT_SET_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an aternate participant set through the createAlternateParticipant endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null email.
   * INVALID_EMAIL: invalid email.
   * EMPTY_PRIVATE_MESSAGE: empty message in AlternateParticipantInfo
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAlternateParticipantInfo() throws ApiException {
    AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
    updateInfo.setEmail(null);
    updateInfo.setPrivateMessage(TestData.PRIVATE_MESSAGE);

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    updateInfo.setEmail(TestData.INVALID_EMAIL);

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }

    updateInfo.setEmail(TestData.POST_EMAIL);
    updateInfo.setPrivateMessage(TestData.EMPTY_PARAM);

    try {
      agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                               agreementId,
                                               participantSetId,
                                               participantId,
                                               updateInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.EMPTY_PRIVATE_MESSAGE.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an aternate participant set through the createAlternateParticipant endpoint.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateAlternateParticipant() throws ApiException {
    AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
    updateInfo.setEmail(ApiUtils.getUserEmail());
    updateInfo.setPrivateMessage(TestData.PRIVATE_MESSAGE);

    try {
      AlternateParticipantResponse response = agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(),
                                                                                       agreementId,
                                                                                       participantSetId,
                                                                                       participantId,
                                                                                       updateInfo);
      assertNotNull(response);
      assertNotNull(response.getParticipantId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
