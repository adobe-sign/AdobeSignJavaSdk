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

package com.adobe.sign.api.Reminders;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.RemindersApi;
import com.adobe.sign.model.reminders.ReminderCreationInfo;
import com.adobe.sign.model.reminders.ReminderCreationResult;
import com.adobe.sign.utils.AgreementsUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.ReminderUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Create Reminder endpoint.
 */
public class CreateRemindersApiTest {
  private static RemindersApi remindersApi = null;
  private static String agreementId = null;


  @Rule
  public Retry retry = new Retry();


  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
    remindersApi = ReminderUtils.getRemindersApi();
  }

  /**
   * Test for creating a reminder through the createReminder endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
    reminderCreationInfo.setAgreementId(agreementId);
    try {
      ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                    reminderCreationInfo);
      assertNotNull(response);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                    reminderCreationInfo);
      assertNotNull(response);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a reminder through the createReminder endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
    reminderCreationInfo.setAgreementId(agreementId);
    try {
      ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                    reminderCreationInfo);
      assertNotNull(response);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a reminder through the createReminder endpoint. Negative scenarios covered:
   * MUST_PROVIDE_AGREEMENT_ID: null and empty agreementId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementId() throws ApiException {
    ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
    reminderCreationInfo.setAgreementId(TestData.NULL_PARAM);
    try {
      ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getValidHeaderParams(),
                                                                    reminderCreationInfo);
      assertNotNull(response);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MUST_PROVIDE_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    reminderCreationInfo.setAgreementId(TestData.EMPTY_PARAM);
    try {
      ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getValidHeaderParams(),
                                                                    reminderCreationInfo);
      assertNotNull(response);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MUST_PROVIDE_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a reminder through the createReminder endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateReminder() throws ApiException {
    ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
    reminderCreationInfo.setAgreementId(agreementId);
    try {
      ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getValidHeaderParams(),
                                                                    reminderCreationInfo);
      assertNotNull(response);
      assertNotNull(response.getResult());
      assertNotNull(response.getParticipantEmailsSet());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
