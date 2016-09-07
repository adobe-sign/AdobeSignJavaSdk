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

public class AccessTokenRequest {

  private String clientId = null;
  private String clientSecret = null;
  private String redirectUri = null;
  private String code = null;
  private String grantType = null;

  public AccessTokenRequest(String clientId, String clientSecret, String redirectUri, String code, String grantType) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.redirectUri = redirectUri;
    this.code = code;
    this.grantType = grantType;
  }

  /**
   * Value must always be "authorization_code".
   *
   */
  @ApiModelProperty(required = true, value = "Value must always be \"authorization_code\".")
  @JsonProperty("grant_type")
  public String getGrantType() {
    return grantType;
  }
  public void setGrantType(String grantType) {
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
   * The url where the end user will be redirected after successful completion of authorization.
   * This value must belong to the set of values specified on the OAuth Configuration page.
   *
   */
  @ApiModelProperty(required = true, value = "The url where the end user will be redirected after successful completion of authorization." + "\n" +
                                              "This value must belong to the set of values specified on the OAuth Configuration page.")
  @JsonProperty("redirect_uri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   * The authorization code retrieved by successful authorization workflow.
   * This credential represents the resource owner's authorization.
   *
   */
  @ApiModelProperty(required = true, value = "The authorization code retrieved by successful authorization workflow." + "\n" +
                                              "This credential represents the resource owner's authorization.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenRequest {\n");

    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(StringUtil.toIndentedString(clientSecret)).append("\n");
    sb.append("    redirectUri: ").append(StringUtil.toIndentedString(redirectUri)).append("\n");
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(StringUtil.toIndentedString(grantType)).append("\n");

    sb.append("}");

    return sb.toString();
  }

}
