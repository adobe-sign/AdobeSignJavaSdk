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

import com.adobe.sign.model.views.AgreementAssetListRequest;
import com.adobe.sign.model.views.AgreementAssetRequest;
import com.adobe.sign.model.views.TargetViewRequest;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for ViewsApi. The main purpose of this class is to check the validity of the parameters passed to 
 * the Views API and throw ApiException with required error messages if the validation fails.
 */
public class ViewsApiValidator {
  
  /**
   * Validator for getAgreementAssetListUrl API that returns the URL for manage page.
   * 
   * @param accessToken An OAuth Access Token.
   * @param xApiUser The userId or email of API caller.
   * @param agreementAssetListRequest Information about the type of url to be generated for Manage Page body.
   * @throws ApiException
   */
  public static void createAgreementAssetListUrlValidator (String accessToken, 
                                                           String xApiUser, 
                                                           AgreementAssetListRequest agreementAssetListRequest) throws ApiException {  
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    if(agreementAssetListRequest != null && agreementAssetListRequest.getAgreementAssetId() != null)
      ApiValidatorHelper.validateId(agreementAssetListRequest.getAgreementAssetId(), 
                                    SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID); 
  }
  
  /**
   * Validator for getAgreementAssetUrl API that returns the URL which shows the view page of given agreement asset.
   * 
   * @param accessToken An OAuth Access Token.
   * @param agreementAssetRequest Information about the type of url to be generated for agreement asset page.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void createAgreementAssetUrlValidator (String accessToken, 
                                                       AgreementAssetRequest agreementAssetRequest, 
                                                       String xApiUser) throws ApiException {
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    ApiValidatorHelper.validateParameter(agreementAssetRequest);
    ApiValidatorHelper.validateId(agreementAssetRequest.getAgreementAssetId(), 
                                  SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID);
    
  }
  
  /**
   * Validator for getSettingsUrl API that returns the URL for settings page.
   * 
   * @param accessToken An OAuth Access Token.
   * @param targetViewRequest Information about the type of url to be generated for various Settings page.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void createSettingsUrlValidator (String accessToken, 
                                                 TargetViewRequest targetViewRequest, 
                                                 String xApiUser) throws ApiException {
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    ApiValidatorHelper.validateParameter(targetViewRequest);
    ApiValidatorHelper.validateParameter(targetViewRequest.getTargetView(), 
                                      SdkErrorCodes.INVALID_TARGET_VIEW);
  }

}
