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
package com.adobe.sign.utils.validator;

import com.adobe.sign.model.search.AgreementAssetEventRequest;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for SearchApi. The main purpose of this class is to check the validity of the parameters passed to the search API
 * and throw ApiException with required error messages if the validation fails.
 */
public class SearchApiValidator {
  
  /**
   * Validator for createAssetEvent API that creates a search object for agreement asset event.
   * 
   * @param accessToken An OAuth Access Token.
   * @param agreementAssetEventRequest Information about the Agreement Asset Events to be generated.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void createAssetEventValidator (String accessToken, 
                                                AgreementAssetEventRequest agreementAssetEventRequest, 
                                                String xApiUser) throws ApiException {  
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    
    ApiValidatorHelper.validateParameter(agreementAssetEventRequest);
    
    ApiValidatorHelper.validateStartAndEndDatesParameter(agreementAssetEventRequest.getStartDate(), 
                                                         agreementAssetEventRequest.getEndDate());   
  }
  
  /**
   * Validator for getAssetEvent API that returns the result for the page which is described inside the Page Cursor Info.
   * 
   * @param accessToken An OAuth Access Token.
   * @param searchId The search object identifier.
   * @param pageCursor Page cursor of the page whose result will be fetched.
   * @param xApiUser The userId or email of API caller.
   * @param pageSize Count of agreement asset events which will be returned in the response
   * @throws ApiException
   */
  public static void getAssetEventValidator (String accessToken, 
                                             String searchId, 
                                             String pageCursor, 
                                             String xApiUser, 
                                             Integer pageSize) throws ApiException {   
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    
    ApiValidatorHelper.validateId(searchId, 
                                  SdkErrorCodes.INVALID_SEARCH_ID);
    
    ApiValidatorHelper.validateParameter(pageCursor, 
                                         SdkErrorCodes.INVALID_PAGE_CURSOR);
    
  }
}
