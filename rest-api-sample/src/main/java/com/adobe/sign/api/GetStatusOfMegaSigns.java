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

import com.adobe.sign.model.megaSigns.MegaSign;
import com.adobe.sign.model.megaSigns.MegaSigns;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.MegaSignUtils;


/**
 * This sample client demonstrates how to get status of all the megaSign parent agreements of a user.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class GetStatusOfMegaSigns {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureLogProperty(GetStatusOfMegaSigns.class.getName());
    try {
      GetStatusOfMegaSigns client = new GetStatusOfMegaSigns();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_MEGASIGN_STATUS, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    // Set the number of agreements for which status is to be printed.
    int agreementCountLimit = Constants.AGREEMENT_COUNT_LIMIT;
    
    //Make API call to get all the megaSign parent agreements of a user.
    MegaSigns megaSigns = MegaSignUtils.getMegaSigns();

    //Display details of each megaSign parent agreement
    List<MegaSign> megaSignList = megaSigns.getMegaSignList();
    for(MegaSign megaSign : megaSignList) {
      
      if(agreementCountLimit == 0)
        break;
      
      ApiUtils.getLogger().info("Name = " + megaSign.getName());
      ApiUtils.getLogger().info("MegaSign ID = " + megaSign.getMegaSignId());
      ApiUtils.getLogger().info("MegaSign Status = " + megaSign.getStatus());
      
      agreementCountLimit--;
    }
  }
}