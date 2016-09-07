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

import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
import com.adobe.sign.model.megaSigns.MegaSignInfo;
import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;
import com.adobe.sign.utils.MegaSignUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.TransientDocumentUtils;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;


/**
 * This sample client demonstrates how to send a new megaSign parent agreement.
 *
 * <p>
 * Following workflow has been implemented here :
 * <li> Create a transient document and get transient document id.</li>
 * <li> Get megaSign info and create a new megaSign parent agreement using the transient document.</li>
 * <li> Send the megaSign parent agreement.</li>
 * <li> Display the megaSign parent agreement details.</li>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class SendMegaSignUsingTransientDocument {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(SendMegaSignUsingTransientDocument.class.getName());
    try {
      SendMegaSignUsingTransientDocument client = new SendMegaSignUsingTransientDocument();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.SEND_MEGASIGN_USING_TRANSIENT_DOCUMENT, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException {
    //Create transient document.
    TransientDocumentResponse transientDocumentResponse = TransientDocumentUtils.createTransientDocument(Constants.REQUEST_PATH,
                                                                                                         Constants.INPUT_FILE_NAME);

    //Get the id of the transient document.
    String transientDocumentId = transientDocumentResponse.getTransientDocumentId();

    //List containing email ids of recipients
    List<String> recipientSetEmailList = new ArrayList<String>();
    recipientSetEmailList.add(Constants.USER_EMAIL);

    //Create a megaSign parent agreement
    MegaSignCreationResponse megaSignCreationResponse = MegaSignUtils.createMegaSign(transientDocumentId,
                                                                                     recipientSetEmailList,
                                                                                     MegaSignUtils.DocumentIdentifierType.TRANSIENT_DOCUMENT_ID);

    //Get the megaSign parent agreement info using megaSign id from from the response above
    MegaSignInfo megaSignInfo = MegaSignUtils.getMegaSignInfo(megaSignCreationResponse.getMegaSignId());

    //Display megaSign parent agreement details
    ApiUtils.getLogger().info("Name = " + megaSignInfo.getName());
    ApiUtils.getLogger().info("MegaSign ID = " + megaSignInfo.getMegaSignId());
    ApiUtils.getLogger().info("MegaSign Status = " + megaSignInfo.getStatus());
  }
}

