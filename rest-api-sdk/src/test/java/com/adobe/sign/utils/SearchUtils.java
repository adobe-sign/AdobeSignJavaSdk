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

import com.adobe.sign.api.SearchApi;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventRequest;

public class SearchUtils extends ApiUtils {

  private static SearchApi searchApi = new SearchApi();

  private static String searchId = null;
  
  private static String pageCursor = null;

  public static String getResourceId() throws ApiException {
    
    createSearch(TestData.STATIC_START_DATE,
                 TestData.STATIC_END_DATE);
    return searchId ;
  }

  public static String createSearch(Date startDate, Date endDate) throws ApiException {
    AgreementAssetEventRequest request = getAgreementAssetEventRequest(startDate, 
                                                                       endDate);
    AgreementAssetEventPostResponse response = searchApi.createAssetEvent(TestData.ACCESS_TOKEN, 
                                                                          request, 
                                                                          TestData.X_API_HEADER);
    searchId = response.getSearchId();
    pageCursor = response.getCurrentPageCursor();
     
    return searchId;
  }
  
  public static AgreementAssetEventRequest getAgreementAssetEventRequest(Date startDate,
                                                                         Date endDate) {
    AgreementAssetEventRequest request = new AgreementAssetEventRequest();
    request.setStartDate(startDate);
    request.setEndDate(endDate);
    
    return request;
  }

  public static SearchApi getSearchApi() {
    return searchApi;
  }
  
  public static String getPageCursor() {
    return pageCursor;
  }
}
