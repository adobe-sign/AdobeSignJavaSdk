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

package com.adobe.sign.api;

import java.util.List;

import com.adobe.sign.model.agreements.UserAgreement;
import com.adobe.sign.model.agreements.UserAgreements;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ReminderUtils;

/**
 * This sample client demonstrates how to send reminders to active participants (those who are next in line in the signing process) of
 * various agreements. It retrieves all agreements of the current user, checks which agreements are out for signature, and if any of
 * them has a participant that has not signed for longer than a specified amount of time. If the time limit has been crossed, all active
 * participants of that agreement are sent a reminder email.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class SendReminderOnPendingAgreements {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(SendReminderOnPendingAgreements.class.getName());
    try {
      SendReminderOnPendingAgreements client = new SendReminderOnPendingAgreements();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.SEND_REMINDER_PENDING_AGREEMENT, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{   
    // Set the number of agreements for which reminders are to be sent.
    int agreementCountLimit = Constants.AGREEMENT_COUNT_LIMIT;
    
    //Make API call to get all the agreements of a user.   
    UserAgreements userAgreements = AgreementUtils.getAllAgreements();

    //Get list of all the agreements.
    List<UserAgreement> userAgreementList = userAgreements.getUserAgreementList();

    //Check status of all the agreements.
    for(UserAgreement userAgreement : userAgreementList) {
      if(agreementCountLimit == 0)
        break;
      if (userAgreement.getStatus().equals(UserAgreement.StatusEnum.OUT_FOR_SIGNATURE)) {

        //Send reminder for all the agreements which are out for signature.
        ReminderUtils.sendRemindersForAgreement(userAgreement.getAgreementId());
        agreementCountLimit--;
      }
    }
  }
}

