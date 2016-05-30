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

import com.adobe.sign.utils.ApiException;

/**
 * Validator class for BaseUrisApi. The main purpose of this class is to check the validity of the parameters passed to the BaseUris API
 * and throw ApiException with required error messages if the validation fails.
 */
public class BaseUrisApiValidator {

  /**
   * Validator for getBaseUris API that retrieves the base uri to access other APIs.
   *
   * @param accessToken An OAuth Access Token.
   * @throws ApiException
   */
  public static void getBaseUrisValidator(String accessToken) throws ApiException {
    ApiValidatorHelper.validateAccessToken(accessToken);
  }
}
