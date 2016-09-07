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

package com.adobe.sign.api.OAuth.desktopApp;


import java.util.ArrayList;

import com.adobe.sign.api.OAuthApi;
import com.adobe.sign.model.oAuth.AccessTokenRequest;
import com.adobe.sign.model.oAuth.AccessTokenResponse;
import com.adobe.sign.model.oAuth.AuthorizationRequest;
import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
import com.adobe.sign.model.oAuth.AccessTokenRefreshResponse;
import com.adobe.sign.model.oAuth.Scope;
import com.adobe.sign.model.oAuth.Token;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.GroupUtils;

/**
 * This sample client demonstrates how to create a new group in an account by using the OAuth workflow.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class CreateGroupWithOAuthWorkFlowUsingDesktopApp {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(CreateGroupWithOAuthWorkFlowUsingDesktopApp.class.getName());
    try {
      CreateGroupWithOAuthWorkFlowUsingDesktopApp client = new CreateGroupWithOAuthWorkFlowUsingDesktopApp();
      client.run();
    }
    catch (Exception e) {
      ApiUtils.logException(Errors.CREATE_NEW_GROUP_IN_ACCOUNT_OAUTH, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception {

    final String SCOPE_TARGET = "user_write";
    final String SCOPE_MODIFIER = "account";

    OAuthApi oAuthApi = new OAuthApi();

    //Adding scopes required for creating a group in account
    ArrayList<Scope> scopes = new ArrayList<>();
    scopes.add(new Scope(SCOPE_TARGET, SCOPE_MODIFIER));

    //Fetch the authorization url.
    AuthorizationRequest authorizationInfo = new AuthorizationRequest(Constants.CLIENT_ID,
                                                                Constants.REDIRECT_URI,
                                                                scopes,
                                                                Constants.STATE,
                                                                Constants.RESPONSE_TYPE);
    String authorizationUrl = null;

    authorizationUrl = oAuthApi.getAuthorizationUrl(authorizationInfo);

    //Set the authorizationUrl and redirectUrl parameters. These parameters are used for authorization grant step.
    AuthorizationApplication.setAuthorizationUrl(authorizationUrl);
    AuthorizationApplication.setRedirectUri(authorizationInfo.getRedirectUri());

    //Launch the browser in application for authorization grant.
    String[] args = {};
    AuthorizationApplication.main(args);

    //Retrieve the code and apiAccessPoint returned.
    final String code = AuthorizationRedirectUrl.getAuthorizationCode();
    final String apiAccessPoint = AuthorizationRedirectUrl.getApiAccessPoint();

    //Set baseUri for further API calls.
    //NOTE : If you set application setting OAUTH_REDIRECT_INCLUDES_ACCESS_POINT_URLS = false, you have to call BaseUrisApi.getBaseUris(accessToken) to get apiAccessPoint.
    Context.setBaseUri(apiAccessPoint);

    //Fetch the access token.
    AccessTokenRequest accessTokenInfo = new AccessTokenRequest(Constants.CLIENT_ID,
                                                          Constants.CLIENT_SECRET,
                                                          Constants.REDIRECT_URI,
                                                          code,
                                                          Constants.ACCESS_TOKEN_GRANT_TYPE);
    AccessTokenResponse accessTokenResponse = oAuthApi.getAccessToken(accessTokenInfo);
    ApiUtils.getLogger().info(accessTokenResponse.toString());

    //Refresh the accessToken
    AccessTokenRefreshRequest refreshedAccessTokenInfo = new AccessTokenRefreshRequest(Constants.CLIENT_ID ,
                                                                                     Constants.CLIENT_SECRET,
                                                                                     accessTokenResponse.getRefreshToken(),
                                                                                     Constants.REFRESH_TOKEN_GRANT_TYPE);
    AccessTokenRefreshResponse refreshedAccessTokenResponse = oAuthApi.refreshAccessToken(refreshedAccessTokenInfo);
    ApiUtils.getLogger().info(refreshedAccessTokenResponse.toString());

    //Make API call to create a group with refreshed token. You can also use the accessToken before it's expiry time.
    String groupId = GroupUtils.createGroupWithOAuthWorkflow(Constants.GROUP_NAME,
                                                             refreshedAccessTokenResponse.getAccessToken());

    //Display group id of the new group
    ApiUtils.getLogger().info("Group created with Group ID = " + groupId);

    Token token = new Token(refreshedAccessTokenResponse.getAccessToken());
    //Revoke the token
    oAuthApi.revokeToken(token);
    ApiUtils.getLogger().info("Token revoked successfully.");
  }
}
