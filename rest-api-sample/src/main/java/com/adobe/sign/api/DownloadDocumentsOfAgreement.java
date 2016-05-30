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

import com.adobe.sign.model.agreements.AgreementDocuments;
import com.adobe.sign.model.agreements.Document;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.FileUtils;

/**
 * This sample client demonstrates how to to download documents of the specified agreement.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the appropriate values.
 * </p>
 */

public class DownloadDocumentsOfAgreement {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      DownloadDocumentsOfAgreement client = new DownloadDocumentsOfAgreement();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.DOWNLOAD_DOCUMENT);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception{
    //Get agreement ID
    String agreementId = AgreementUtils.getAgreementId(Constants.AGREEMENT_NAME);

    //Fetch list of documents associated with the specified agreement.
    AgreementDocuments agreementDocuments = AgreementUtils.getAllDocuments(agreementId);
    List<Document> agreementDocumentsList = agreementDocuments.getDocuments();

    //Save all the documents in files.
    for (Document document : agreementDocumentsList) {
      //Download all the documents of the given agreement
      byte[] docStream = AgreementUtils.downloadDocuments(agreementId,
                                                          document.getDocumentId());

      //Generate a running file name for storing locally.
      String fileName = document.getName() + "_" + System.currentTimeMillis() + ".pdf";

      //Save the documents to file.
      if (docStream != null) {
        FileUtils.saveToFile(docStream,
                             Constants.OUTPUT_PATH + Constants.AGREEMENT_DOCUMENT,
                             fileName);

      }
    }
  }
}
