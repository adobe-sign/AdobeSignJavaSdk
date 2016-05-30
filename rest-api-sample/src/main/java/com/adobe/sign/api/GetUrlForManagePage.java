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

import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ViewUtils;

/**
 * This sample client demonstrates how to generate URL for manage page.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class GetUrlForManagePage {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetUrlForManagePage client = new GetUrlForManagePage();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.GET_URL_FOR_MANAGE_PAGE);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {
    //Get agreement asset ID
    String agreementAssetId = AgreementUtils.getAgreementId(Constants.AGREEMENT_NAME);

    // Make API call to get URL for manage page.
    ViewUrl viewUrl = ViewUtils.getAgreementAssetListUrl(agreementAssetId);

    // Display URL for manage page.
    System.out.println("URL for manage page = " + viewUrl.getViewURL());
  }
}
