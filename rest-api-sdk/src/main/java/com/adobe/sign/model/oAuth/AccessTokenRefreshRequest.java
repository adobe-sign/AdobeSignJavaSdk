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

package com.adobe.sign.model.oAuth;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class AccessTokenRefreshRequest {

  private String clientId = null;
  private String clientSecret = null;
  private String refreshToken = null;
  private String grantType = null;

  public AccessTokenRefreshRequest(String clientId, String clientSecret, String refreshToken, String grantType) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.refreshToken = refreshToken;
    this.grantType = grantType;
  }

  /**
   * Identifies the application configured on the OAuth Configuration page.
   */
  @ApiModelProperty(required = true, value = "Identifies the application configured on the OAuth Configuration page.")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Authenticates the application configured on the OAuth Configuration page.
   *
   */
  @ApiModelProperty(required = true, value = "Authenticates the application configured on the OAuth Configuration page.")
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  /**
   * Token which is used to refresh existing access token.
   *
   */
  @ApiModelProperty(required = true, value = "Token which is used to refresh existing access token.\n")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * Value must always be "refresh_token".
   *
   */
  @ApiModelProperty(required = true, value = "Value must always be \"refresh_token.\"")
  @JsonProperty("grant_type")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenRefreshRequest {\n");

    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(StringUtil.toIndentedString(clientSecret)).append("\n");
    sb.append("    refreshToken: ").append(StringUtil.toIndentedString(refreshToken)).append("\n");
    sb.append("    grantType: ").append(StringUtil.toIndentedString(grantType)).append("\n");

    sb.append("}");

    return sb.toString();
  }
}
