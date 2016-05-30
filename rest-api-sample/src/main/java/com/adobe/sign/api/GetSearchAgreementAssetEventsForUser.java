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

import com.adobe.sign.model.search.AgreementAssetEventGetResponse;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.SearchUtils;

/**
 * This sample client demonstrates how to begin searching for agreement asset events for the user.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class GetSearchAgreementAssetEventsForUser {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      GetSearchAgreementAssetEventsForUser client = new GetSearchAgreementAssetEventsForUser();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.SEARCH_AGREEMENT_ASSET_EVENT_FOR_USER);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception{

    //Make API call to create the search for agreementAssetEvent
    AgreementAssetEventPostResponse agreementAssetEventPostResponse = SearchUtils.createSearchForAgreementAssetEvent(Constants.START_DATE,
                                                                                                                     Constants.END_DATE);
    //Display events on page referenced by currentPageCursor
    SearchUtils.printEvents(agreementAssetEventPostResponse.getEvents());

    //Make API call to get agreementAssetEvents
    if(!agreementAssetEventPostResponse.getNextPageCursor().isEmpty()) {
      AgreementAssetEventGetResponse agreementAssetEventGetResponse = SearchUtils.getAgreementEventsForUser(Constants.PAGE_SIZE,
                                                                                                            agreementAssetEventPostResponse.getNextPageCursor(),
                                                                                                            agreementAssetEventPostResponse.getSearchId());
      //Display agreement asset events
      SearchUtils.printEvents(agreementAssetEventGetResponse.getEvents());
    }
  }
}
