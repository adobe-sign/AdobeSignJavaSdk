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
package com.adobe.sign.utils;


import java.util.Date;
import java.util.List;

import com.adobe.sign.api.SearchApi;
import com.adobe.sign.model.search.AgreementAssetEventGetResponse;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventRequest;
import com.adobe.sign.model.search.DocumentEventForUser;

public class SearchUtils {

  private final static SearchApi searchApi = new SearchApi();

  /**
   * Create search for agreement asset event.
   *
   * @param startDate The start of the date range for which events will be returned.
   * @param endDate The end of the date range for which events will be returned.
   *
   * @throws Exception
   */
  public static AgreementAssetEventPostResponse createSearchForAgreementAssetEvent(Date startDate ,
                                                                                   Date endDate) throws Exception {
    try {
      //Create agreement asset event request
      AgreementAssetEventRequest agreementAssetEventRequest = new AgreementAssetEventRequest();

      //Set the start date for the range in which events are to be returned
      agreementAssetEventRequest.setStartDate(startDate);

      //Set the end date for the range in which events are to be returned
      agreementAssetEventRequest.setEndDate(endDate);

      //Get agreement asset event response
      AgreementAssetEventPostResponse agreementAssetEventPostResponse = searchApi.createAssetEvent(Constants.ACCESS_TOKEN,
                                                                                                   agreementAssetEventRequest,
                                                                                                   Constants.X_API_USER);
      return agreementAssetEventPostResponse;
    }
    catch (Exception e) {
      System.err.println(Errors.CREATE_SEARCH_FOR_AGREEMENT_ASSET_EVENT_FOR_USER);
      throw new Exception(e);
    }
  }

  /**
   * Get agreement asset events for given pageCursor.
   *
   * @param pageSize Count of agreement asset events which will be returned in the response.
   * @param pageCursor Page cursor of the page whose result will be fetched.
   * @param searchId The search object identifier, as provided by createSearchForAgreementAssetEvent.
   *
   * @throws Exception
   */
  public static AgreementAssetEventGetResponse getAgreementEventsForUser(int pageSize,
                                                                         String pageCursor,
                                                                         String searchId) throws Exception {
    try {
      // Get the next set of search results for the specified search Id.
      AgreementAssetEventGetResponse agreementAssetEventGetResponse = searchApi.getAssetEvent(Constants.ACCESS_TOKEN,
                                                                                              searchId,
                                                                                              pageCursor,
                                                                                              Constants.X_API_USER,
                                                                                              pageSize);
      return agreementAssetEventGetResponse;
    }
    catch (Exception e) {
      System.err.println(Errors.GET_SEARCH_AGREEMENT_ASSET_EVENT_FOR_USER);
      throw new Exception(e);
    }
  }

  /**
   * Prints first few initial events on the page.
   *
   * @param events List of agreementAssetEvents.
   */
  public static void printEvents(List<DocumentEventForUser> events){

    //In case there are no agreement asset events in the given range
    if(events.size() == 0)
      System.out.println(Errors.NO_EVENT_IN_GIVEN_RANGE);

    //Display first few events
    for (int index = 0; index < Math.min(Constants.MAX_EVENTS_SIZE, events.size()); index++)
      System.out.println("Agreement Asset Event: " + events.get(index));

    System.out.println();
  }
}
