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

import java.util.ArrayList;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class AuthorizationRequest {

  private String clientId = null;
  private String redirectUri = null;
  private ArrayList<Scope> scopes = new ArrayList<Scope>();;
  private String state = null;
  private String responseType = null;

  public AuthorizationRequest(String clientId, String redirectUri, ArrayList<Scope> scopes, String state, String responseType) {
    this.clientId = clientId;
    this.redirectUri = redirectUri;
    this.scopes = scopes;
    this.state = state;
    this.responseType = responseType;
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
   * Value used by the client to maintain state between the request and callback.
   *
   */
  @ApiModelProperty(required = false, value = "Value used by the client to maintain state between the request and callback.")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * List of permissions required by the application on behalf of the user to access the resources.
   *
   */
  @ApiModelProperty(required = true, value = "List of permissions required by the application on behalf of the user to access the resources.\n")
  @JsonProperty("scope")
  public ArrayList<Scope> getScopes() {
    return scopes;
  }
  public void setScopes(ArrayList<Scope> scopes) {
    this.scopes = scopes;
  }

  /**
   * Value must always be "code".
   */
  @ApiModelProperty(required = true, value = "Value must always be \"code\".")
  @JsonProperty("response_type")
  public String getResponseType() {
    return responseType;
  }
  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationRequest {\n");

    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    redirectUri: ").append(StringUtil.toIndentedString(redirectUri)).append("\n");
    sb.append("    scopes: ").append(StringUtil.toIndentedString(scopes)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    response_type: ").append(StringUtil.toIndentedString(responseType)).append("\n");

    sb.append("}");


    return sb.toString();
  }
}
