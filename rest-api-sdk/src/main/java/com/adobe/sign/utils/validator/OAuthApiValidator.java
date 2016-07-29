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

import java.util.ArrayList;

import com.adobe.sign.model.oAuth.AccessTokenInfo;
import com.adobe.sign.model.oAuth.AuthorizationInfo;
import com.adobe.sign.model.oAuth.RefreshedAccessTokenInfo;
import com.adobe.sign.model.oAuth.Token;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for OAuthApi endpoints. The main purpose of this class is to check the validity of the parameters passed to the oauth api endpoints
 * and throw ApiException with required error messages if the validation fails.
 */
public class OAuthApiValidator {

  /**
   * Validator for getAuthorizationUrl API that forms the url for authorization workflow.
   *
   * @param authorizationInfo
   * @throws ApiException
   */
  public static void getAuthorizationUrlValidator(AuthorizationInfo authorizationInfo) throws ApiException {
    ApiValidatorHelper.validateParameter(authorizationInfo);

    ArrayList<String> parameterList = new ArrayList();
    parameterList.add(authorizationInfo.getClientId());
    parameterList.add(authorizationInfo.getRedirectUri());

    ApiValidatorHelper.validateRequiredParameters(parameterList);
    ApiValidatorHelper.validateParameter(authorizationInfo.getScopes());
    validateRedirectUri(authorizationInfo.getRedirectUri());
  }

  /**
   * Validator for getAccessToken API that retrieves accessToken for the user.
   *
   * @param accessTokenInfo
   * @throws ApiException
   */
  public static void getAccessTokenValidator(AccessTokenInfo accessTokenInfo) throws ApiException {
    ApiValidatorHelper.validateParameter(accessTokenInfo);

    ArrayList<String> parameterList = new ArrayList();
    parameterList.add(accessTokenInfo.getClientId());
    parameterList.add(accessTokenInfo.getClientSecret());
    parameterList.add(accessTokenInfo.getCode());
    parameterList.add(accessTokenInfo.getGrantType());

    ApiValidatorHelper.validateRequiredParameters(parameterList);
    validateRedirectUri(accessTokenInfo.getRedirectUri());
  }

  /**
   * Validator for refreshAccessToken API that refreshes the accessToken of the user.
   *
   * @param refreshedAccessTokenInfo
   * @throws ApiException
   */
  public static void refreshAccessTokenValidator(RefreshedAccessTokenInfo refreshedAccessTokenInfo) throws ApiException {
    ApiValidatorHelper.validateParameter(refreshedAccessTokenInfo);

    ArrayList<String> parameterList = new ArrayList();
    parameterList.add(refreshedAccessTokenInfo.getClientId());
    parameterList.add(refreshedAccessTokenInfo.getClientSecret());
    parameterList.add(refreshedAccessTokenInfo.getRefreshToken());
    parameterList.add(refreshedAccessTokenInfo.getGrantType());

    ApiValidatorHelper.validateRequiredParameters(parameterList);
  }

  /**
   * Validator for revokeToken API that revokes the access token or refresh token of the user.
   *
   * @param token The access token or refresh token which has to be revoked.
   * @throws ApiException
   */
  public static void revokeTokenValidator(Token token) throws ApiException {
    ApiValidatorHelper.validateParameter(token);

    ApiValidatorHelper.validateParameter(token.getToken(),
                                         SdkErrorCodes.MISSING_REQUIRED_PARAM);
  }

  /**
   * Validate the redirectUri.
   *
   * @param redirectUri The redirectUri to be validated.
   * @throws ApiException
   */
  private static void validateRedirectUri(String redirectUri) throws ApiException {
    ApiValidatorHelper.validateParameter(redirectUri,
                                         SdkErrorCodes.MISSING_REQUIRED_PARAM);
    ApiValidatorHelper.validateUrlParameter(redirectUri,
                                            SdkErrorCodes.INVALID_REQUEST);
  }
}
