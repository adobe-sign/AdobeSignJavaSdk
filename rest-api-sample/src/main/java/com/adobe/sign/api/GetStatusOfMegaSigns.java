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
  public static void main(String args[]) {
    try {
      GetStatusOfMegaSigns client = new GetStatusOfMegaSigns();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.GET_MEGASIGN_STATUS);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception{
    //Make API call to get all the megaSign parent agreements of a user.
    MegaSigns megaSigns = MegaSignUtils.getMegaSigns();

    //Display details of each megaSign parent agreement
    List<MegaSign> megaSignList = megaSigns.getMegaSignList();
    for(MegaSign megaSign : megaSignList) {
      System.out.println("Name = " + megaSign.getName());
      System.out.println("MegaSign ID = " + megaSign.getMegaSignId());
      System.out.println("MegaSign Status = " + megaSign.getStatus());
    }
  }
}