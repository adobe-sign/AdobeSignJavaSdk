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

import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.model.agreements.AgreementCreationResponse;
import com.adobe.sign.model.agreements.AgreementInfo;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.LibraryDocumentUtils;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to send a new agreement.
 *
 * <p>
 * Following workflow has been implemented here :
 * <li> Get the id of the first library document of the user</li>
 * <li> Get agreement info and create an agreement using the library document.</li>
 * <li> Send the agreement.</li>
 * <li> Display agreement details.</li>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class SendAgreementUsingLibraryDocument {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(SendAgreementUsingLibraryDocument.class.getName());
    try {
      SendAgreementUsingLibraryDocument client = new SendAgreementUsingLibraryDocument();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.SEND_AGREEMENT_USING_LIBRARY_DOCUMENT, e);
      throw e;
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException {
    //Get the id of the first library document of the user.
    String libraryDocumentId = LibraryDocumentUtils.getFirstLibraryDocumentId();

    if(libraryDocumentId == null) {
      ApiUtils.logError(Errors.NO_LIBRARY_DOCUMENTS);
    }
    else {
      //List containing email ids of recipients
      List<String> recipientSetEmailList = new ArrayList<String>();
      recipientSetEmailList.add(ApiUtils.getUserEmail(Constants.USER_EMAIL_PREFIX,Constants.USER_EMAIL_DOMAIN));

      //Create agreement using the first library document of the user
      AgreementCreationResponse agreementCreationResponse = AgreementUtils.createAgreement(recipientSetEmailList,
                                                                                           libraryDocumentId,
                                                                                           AgreementUtils.DocumentIdentifierType.LIBRARY_DOCUMENT_ID,
                                                                                           ApiUtils.getAgreementName(Constants.AGREEMENT_NAME));

      //Get agreement info using the agreement id
      AgreementInfo agreementInfo = AgreementUtils.getAgreementInfo(agreementCreationResponse.getAgreementId());

      //Display agreement details
      ApiUtils.getLogger().info("Agreement ID = " + agreementInfo.getAgreementId());
      ApiUtils.getLogger().info("Agreement Name = " + agreementInfo.getName());
      ApiUtils.getLogger().info("Agreement Status = " + agreementInfo.getStatus());
    }
  }
}

