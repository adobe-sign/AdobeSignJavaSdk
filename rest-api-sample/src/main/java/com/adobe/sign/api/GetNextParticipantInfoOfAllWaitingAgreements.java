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

/**
 * This sample client demonstrates how to get the next participants' information from all the agreements that are out for signature.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class GetNextParticipantInfoOfAllWaitingAgreements {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(GetNextParticipantInfoOfAllWaitingAgreements.class.getName());
    try {
      GetNextParticipantInfoOfAllWaitingAgreements client = new GetNextParticipantInfoOfAllWaitingAgreements();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_NEXT_PARTICIPANT_SET_INFO, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException {
    // Set the number of agreements for which next participant is to be retrieved.
    int agreementCountLimit = Constants.AGREEMENT_COUNT_LIMIT;
    //Make API call to get all the agreements of a user.
    UserAgreements userAgreements = AgreementUtils.getAllAgreements();

    //Get list of all the agreements of a user.
    List<UserAgreement> userAgreementList = userAgreements.getUserAgreementList();

    //Check status of each agreement.
    for (UserAgreement userAgreement : userAgreementList) {
      
      if(agreementCountLimit == 0)
        break;

      //Show next participant info if the agreement is out for signature.
      if(userAgreement.getStatus().equals(UserAgreement.StatusEnum.OUT_FOR_SIGNATURE)) {

        //Display agreement name and id.
        ApiUtils.getLogger().info("Agreement Name = " + userAgreement.getName());
        ApiUtils.getLogger().info("Agreement Id = " + userAgreement.getAgreementId());

        //Get id of the agreement.
        String agreementId = userAgreement.getAgreementId();

        //Display details about next participant set.
        AgreementUtils.printNextParticipantSetInfo(agreementId);
        
        agreementCountLimit--;
      }
    }
  }
}