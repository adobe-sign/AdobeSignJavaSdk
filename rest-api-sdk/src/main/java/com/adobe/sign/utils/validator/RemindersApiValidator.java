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
package com.adobe.sign.utils.validator;

import com.adobe.sign.model.reminders.ReminderCreationInfo;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for RemindersApi. The main purpose of this class is to check the validity of the parameters passed to the Reminders API
 * and throw ApiException with required error messages if the validation fails.
 */
public class RemindersApiValidator {

  private static final String REMINDER_CREATION_INFO = "reminderCreationInfo";
  /**
   * Validator for createReminder API that sends a reminder for an agreement.
   *
   * @param reminderCreationInfo Information about reminder that needs to be created.
   * @throws ApiException
   */
  public static void createReminderValidator(ReminderCreationInfo reminderCreationInfo) throws ApiException {
    ApiValidatorHelper.validateParameter(reminderCreationInfo, REMINDER_CREATION_INFO);

    ApiValidatorHelper.validateParameter(reminderCreationInfo.getAgreementId(),
                                         SdkErrorCodes.MUST_PROVIDE_AGREEMENT_ID);
  }
}
