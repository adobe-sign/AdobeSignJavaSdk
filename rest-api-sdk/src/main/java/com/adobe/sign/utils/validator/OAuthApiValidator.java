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

import java.util.HashMap;

import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
import com.adobe.sign.model.oAuth.AccessTokenRequest;
import com.adobe.sign.model.oAuth.AuthorizationRequest;
import com.adobe.sign.model.oAuth.Token;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for OAuthApi endpoints. The main purpose of this class is to check the validity of the parameters passed to the oauth api endpoints
 * and throw ApiException with required error messages if the validation fails.
 */
public class OAuthApiValidator {

  private static final String TOKEN = "token";
  private static final String ACCESS_TOKEN_REQUEST = "accessTokenRequest";
  private static final String AUTHORIZATION_REQUEST = "authorizationRequest";
  private static final String ACESS_TOKEN_REFRESH_REQUEST = "accessTokenRefreshRequest";
  private static final String SCOPES = "scopes";
  private static final String CLIENT_ID = "clientId";
  private static final String CLIENT_SECRET = "clientSecret";
  private static final String REFRESH_TOKEN = "refreshToken";
  private static final String GRANT_TYPE = "grantType";
  private static final String CODE = "code";
  private static final String RESPONSE_TYPE = "responseType";
  private static final String REDIRECT_URI = "redirectUri";

  /**
   * Validator for getAuthorizationUrl API that forms the url for authorization workflow.
   *
   * @param authorizationRequest
   * @throws ApiException
   */
  public static void getAuthorizationUrlValidator(AuthorizationRequest authorizationRequest) throws ApiException {
    ApiValidatorHelper.validateParameter(authorizationRequest, AUTHORIZATION_REQUEST);

    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put(CLIENT_ID, authorizationRequest.getClientId());
    hashMap.put(REDIRECT_URI, authorizationRequest.getRedirectUri());
    hashMap.put(RESPONSE_TYPE, authorizationRequest.getResponseType());

    ApiValidatorHelper.validateRequiredParameters(hashMap);
    ApiValidatorHelper.validateParameter(authorizationRequest.getScopes(), SCOPES);
    validateRedirectUri(authorizationRequest.getRedirectUri());
  }

  /**
   * Validator for getAccessToken API that retrieves accessToken for the user.
   *
   * @param accessTokenRequest
   * @throws ApiException
   */
  public static void getAccessTokenValidator(AccessTokenRequest accessTokenRequest) throws ApiException {
    ApiValidatorHelper.validateParameter(accessTokenRequest, ACCESS_TOKEN_REQUEST);

    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put(CLIENT_ID, accessTokenRequest.getClientId());
    hashMap.put(CLIENT_SECRET, accessTokenRequest.getClientSecret());
    hashMap.put(CODE, accessTokenRequest.getCode());
    hashMap.put(GRANT_TYPE, accessTokenRequest.getGrantType());

    ApiValidatorHelper.validateRequiredParameters(hashMap);
    validateRedirectUri(accessTokenRequest.getRedirectUri());
  }

  /**
   * Validator for refreshAccessToken API that refreshes the accessToken of the user.
   *
   * @param accessTokenRefreshRequest
   * @throws ApiException
   */
  public static void refreshAccessTokenValidator(AccessTokenRefreshRequest accessTokenRefreshRequest) throws ApiException {
    ApiValidatorHelper.validateParameter(accessTokenRefreshRequest, ACESS_TOKEN_REFRESH_REQUEST);

    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put(CLIENT_ID, accessTokenRefreshRequest.getClientId());
    hashMap.put(CLIENT_SECRET, accessTokenRefreshRequest.getClientSecret());
    hashMap.put(REFRESH_TOKEN, accessTokenRefreshRequest.getRefreshToken());
    hashMap.put(GRANT_TYPE, accessTokenRefreshRequest.getGrantType());

    ApiValidatorHelper.validateRequiredParameters(hashMap);
  }

  /**
   * Validator for revokeToken API that revokes the access token or refresh token of the user.
   *
   * @param token The access token or refresh token which has to be revoked.
   * @throws ApiException
   */
  public static void revokeTokenValidator(Token token) throws ApiException {
    ApiValidatorHelper.validateParameter(token, TOKEN);

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
