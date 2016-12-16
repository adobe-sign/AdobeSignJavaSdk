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
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.SearchApi;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventRequest;

public class SearchUtils {

  private static SearchApi searchApi = new SearchApi();
  private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();

  private static String searchId = null;
  
  private static String pageCursor = null;

  public static String getResourceId() throws ApiException {
    
    createSearch(ApiUtils.getDate(TestData.DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE),
                 ApiUtils.getDate(TestData.DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE));
    return searchId ;
  }

  public static String createSearch(Date startDate, Date endDate) throws ApiException {
    AgreementAssetEventRequest request = getAgreementAssetEventRequest(startDate, 
                                                                       endDate);
    AgreementAssetEventPostResponse response = searchApi.createAssetEvent(headers,
                                                                          request);
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
