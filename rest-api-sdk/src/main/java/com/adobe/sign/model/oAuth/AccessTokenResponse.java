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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class AccessTokenResponse   {

  private String accessToken = null;
  private String refreshToken = null;
  private int expiresIn = -1;
  private String tokenType = null;

  /**
   * An OAuth Access Token.
   */
  @ApiModelProperty(required = true, value = "An OAuth Access Token")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Refresh Token, which can be used to get a fresh Access Token.
   */
  @ApiModelProperty(required = true, value = "Refresh Token, which can be used to get a fresh Access Token")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * The lifetime in seconds of the Access Token.
   */
  @ApiModelProperty(required = true, value = "The lifetime in seconds of the Access Token")
  @JsonProperty("expires_in")
  public int getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * The value will always be "Bearer".
   */
  @ApiModelProperty(required = true, value = "The value will always be \"Bearer\"")
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenResponse {\n");

    sb.append("    accessToken: ").append(StringUtil.toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(StringUtil.toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(StringUtil.toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(StringUtil.toIndentedString(tokenType)).append("\n");

    sb.append("}");


    return sb.toString();
  }
}
