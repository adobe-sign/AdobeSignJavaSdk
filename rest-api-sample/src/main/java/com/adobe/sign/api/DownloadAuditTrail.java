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

import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.FileUtils;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to to download audit trail of the specified agreement.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the appropriate values.
 * </p>
 */

public class DownloadAuditTrail {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureLogProperty(DownloadAuditTrail.class.getName());
    try {
      DownloadAuditTrail client = new DownloadAuditTrail();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.DOWNLOAD_AUDIT_TRAIL, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    //Get agreement ID
    String agreementId = AgreementUtils.getAgreementId(Constants.AGREEMENT_NAME);

    //Display name of the agreement associated with the specified agreement ID.
    AgreementInfo agreementInfo = AgreementUtils.getAgreementInfo(agreementId);
    String agreementName = agreementInfo.getName();
    ApiUtils.getLogger().info("Agreement name: " + agreementName);

    //Make API call to get audit trail of this agreement.
    byte[] auditStream = AgreementUtils.getAuditTrail(agreementId);

    //Generate a running file name for storing locally.
    String fileName = agreementName + "_" + System.currentTimeMillis() + ".pdf";

    //Save audit stream to file
    if (auditStream != null) {
      FileUtils.saveToFile(auditStream,
                           Constants.OUTPUT_PATH + Constants.AUDIT_TRAIL,
                           fileName);
    }
  }
}
