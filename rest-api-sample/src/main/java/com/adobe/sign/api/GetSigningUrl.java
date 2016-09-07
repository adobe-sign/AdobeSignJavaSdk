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

import com.adobe.sign.model.agreements.SigningUrl;
import com.adobe.sign.model.agreements.SigningUrlSetInfo;
import com.adobe.sign.utils.AgreementUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to get the signing url for an agreement of the user.
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class GetSigningUrl {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String[] args) throws ApiException {
    ApiUtils.configureProperty(GetSigningUrl.class.getName());
    try {
      GetSigningUrl client = new GetSigningUrl();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_SIGNING_URL, e);
    }
  }
    
  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    //Get agreement id.
    String agreementId = AgreementUtils.getAgreementId(Constants.AGREEMENT_NAME);

    //Make API call to get the url for a agreement with a specific agreement id.
    List<SigningUrlSetInfo> signingUrlSetInfos = AgreementUtils.getSigningUrl(agreementId);

    //Display all signing url associated with the agreement id.
    for(SigningUrlSetInfo signingUrlSetInfo : signingUrlSetInfos)
      for(SigningUrl signingUrl : signingUrlSetInfo.getSigningUrls())
        ApiUtils.getLogger().info("Signing url: " + signingUrl.getEsignUrl());
  }
}
