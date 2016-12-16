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

import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.model.agreements.UserAgreement;
import com.adobe.sign.model.agreements.UserAgreements;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.FileUtils;

/**
 * This sample client demonstrates how to archive all signed agreements of an account. It retrieves all agreements of the current user,
 * checks which agreements are signed, and then save them to the output location specified below.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the appropriate values.
 * </p>
 */

public class ArchiveAllSignedAgreements {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(ArchiveAllSignedAgreements.class.getName());
    try {
      ArchiveAllSignedAgreements client = new ArchiveAllSignedAgreements();
      client.run();
    } catch (ApiException e) {
      ApiUtils.logException(Errors.ARCHIVE_AGREEMENT, e);
      throw e;
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException {
    // Set the number of agreements which is to be archived.
    int agreementCountLimit = Constants.AGREEMENT_COUNT_LIMIT;

    //Make API call to get all the agreements of a user.
    UserAgreements userAgreements = AgreementUtils.getAllAgreements();

    //Get list of agreements
    List<UserAgreement> userAgreementList = userAgreements.getUserAgreementList();
    for(UserAgreement userAgreement : userAgreementList) {
      
      if(agreementCountLimit == 0)
        break;
      //Check if the agreement is signed
      if (userAgreement.getStatus().equals(UserAgreement.StatusEnum.SIGNED) && (userAgreement.getEsign().equals(Boolean.TRUE))) {

        //Display name of the agreement associated with the specified agreement ID.
        AgreementInfo agreementInfo = AgreementUtils.getAgreementInfo(userAgreement.getAgreementId());
        String agreementName = agreementInfo.getName();

        ApiUtils.getLogger().info("Agreement name: " + agreementName);

        //Make API call to get combined documents of this agreement.
        byte auditStream[] = AgreementUtils.getAgreementCombinedDocument(userAgreement.getAgreementId());

        //Generate a running file name for storing locally.
        String fileName = agreementName + "_" + System.currentTimeMillis() + ".pdf";

        //Save audit stream to file
        if (auditStream != null) {
          FileUtils.saveToFile(auditStream,
                               Constants.OUTPUT_PATH + Constants.ARCHIVE ,
                               fileName);
        }
        agreementCountLimit--;
      }
    }
  }
}