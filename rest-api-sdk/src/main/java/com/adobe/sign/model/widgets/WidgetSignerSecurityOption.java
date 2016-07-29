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

package com.adobe.sign.model.widgets;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.widgets.PhoneInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:04.202+05:30")
public class WidgetSignerSecurityOption   {
  

public enum AuthenticationMethodEnum {
  NONE("NONE"),
  INHERITED_FROM_DOCUMENT("INHERITED_FROM_DOCUMENT"),
  PASSWORD("PASSWORD"),
  WEB_IDENTITY("WEB_IDENTITY"),
  KBA("KBA"),
  PHONE("PHONE");

  private String value;

  AuthenticationMethodEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private AuthenticationMethodEnum authenticationMethod = null;
  private String password = null;
  private List<PhoneInfo> phoneInfos = new ArrayList<PhoneInfo>();

  
  /**
   * The authentication method for the recipients to have access to view and sign the widget. PHONE authentication is only applicable to counter signers but not to widget signer
   **/
  @ApiModelProperty(required = true, value = "The authentication method for the recipients to have access to view and sign the widget. PHONE authentication is only applicable to counter signers but not to widget signer")
  @JsonProperty("authenticationMethod")
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }
  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  
  /**
   * The password required for the recipient to view and sign the widget
   **/
  @ApiModelProperty(value = "The password required for the recipient to view and sign the widget")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The phoneInfo required for the counter signer to view and sign the widget if authentication method is PHONE. Not applicable to widget signer
   **/
  @ApiModelProperty(value = "The phoneInfo required for the counter signer to view and sign the widget if authentication method is PHONE. Not applicable to widget signer")
  @JsonProperty("phoneInfos")
  public List<PhoneInfo> getPhoneInfos() {
    return phoneInfos;
  }
  public void setPhoneInfos(List<PhoneInfo> phoneInfos) {
    this.phoneInfos = phoneInfos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetSignerSecurityOption {\n");
    
    sb.append("    authenticationMethod: ").append(StringUtil.toIndentedString(authenticationMethod)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("    phoneInfos: ").append(StringUtil.toIndentedString(phoneInfos)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
