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
package com.adobe.sign.utils;

import java.util.Date;
import java.util.List;

import com.adobe.sign.api.RemindersApi;
import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.model.agreements.NextParticipantInfo;
import com.adobe.sign.model.agreements.NextParticipantSetInfo;
import com.adobe.sign.model.reminders.ReminderCreationInfo;
import com.adobe.sign.model.reminders.ReminderCreationResult;

public class ReminderUtils {

  private final static RemindersApi remindersApi = new RemindersApi();

  /**
   * Sends a reminder for an agreement.
   * @param agreementId Id of the agreement.
   * @return ReminderCreationResult
   */
  private static ReminderCreationResult createReminder (String agreementId) throws Exception {
    try {
      ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
      reminderCreationInfo.setAgreementId(agreementId);
      ReminderCreationResult reminderCreationResult = remindersApi.createReminder(Constants.ACCESS_TOKEN,
                                                                                  reminderCreationInfo,
                                                                                  Constants.X_API_USER);
      return reminderCreationResult;
    }
    catch (Exception e) {
      System.err.println(Errors.SEND_REMINDER);
      throw new Exception(e);
    }
  }
  /**
   * Sends reminders to active participants of an agreement if any of them is taking too long to sign.
   *
   * @param agreementId id of the agreement.
   * @throws Exception
   */
  public static void sendRemindersForAgreement(String agreementId) throws Exception {
    //Get the current system date.
    Date now = new Date();

    //Get list of NextParticipantSet
    AgreementInfo agreementInfo = AgreementUtils.getAgreementInfo(agreementId);
    List<NextParticipantSetInfo> nextParticipantSetInfoList = agreementInfo.getNextParticipantSetInfos();
    if (nextParticipantSetInfoList == null)
      return ;

    // For each next/active participant, check if her waiting time exceeds the limit and if so send a reminder.
    for (NextParticipantSetInfo nextParticipantSetInfo : nextParticipantSetInfoList) {
     if (hasWaitingTimeExceededLimit(nextParticipantSetInfo, now)) {
       // Time limit exceeded. Send a reminder to all active participants of the agreement.
       ReminderCreationResult reminderCreationResult = createReminder(agreementId);

       //Display agreement name and result of the operation.
       System.out.println("Sent a reminder to the next participant in line to sign the agreement '" + agreementInfo.getName()
                          + "'. Result: " + reminderCreationResult.getResult() + ".");
       // All relevant participants have been sent a reminder; no need to check remaining participants.
     }
    }
  }
  /**
   * Checks whether an agreement participant has taken too long to sign the agreement.
   *
   * @param nextParticipantSetInfo information about the next participant.
   * @param now Current time.
   * @return True if the participant is taking too long.
   */
  private static boolean hasWaitingTimeExceededLimit(NextParticipantSetInfo nextParticipantSetInfo,
                                                     Date now) {
    //Get the first participant from the next participant set.
    NextParticipantInfo nextParticipant = nextParticipantSetInfo.getNextParticipantSetMemberInfos().get(0);

    //Check how long this participant has been next in line but idle.
    Date waitingSince = nextParticipant.getWaitingSince();

    //Check if waiting time exceeds given limit
    boolean timeExceeded = ((now.getTime() - waitingSince.getTime()) >= Constants.WAITING_TIME_LIMIT);
    return timeExceeded;
  }

}
