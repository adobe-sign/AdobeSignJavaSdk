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

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;
import java.util.*;
import com.adobe.sign.model.agreements.PhoneInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class RecipientSecurityOption   {
  

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
  private List<PhoneInfo> phoneInfos = null;

  
  /**
   * The authentication method for the recipients to have access to view and sign the document
   **/
  @ApiModelProperty(required = true, value = "The authentication method for the recipients to have access to view and sign the document")
  @JsonProperty("authenticationMethod")
  /**
   * @return AuthenticationMethodEnum
   **/
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }
  /**
   * The authentication method for the recipients to have access to view and sign the document
   * @param authenticationMethod
   **/
  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  
  /**
   * The password required for the recipient to view and sign the document
   **/
  @ApiModelProperty(value = "The password required for the recipient to view and sign the document")
  @JsonProperty("password")
  /**
   * @return String
   **/
  public String getPassword() {
    return password;
  }
  /**
   * The password required for the recipient to view and sign the document
   * @param password
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The phoneInfo required for the recipient to view and sign the document
   **/
  @ApiModelProperty(required = true, value = "The phoneInfo required for the recipient to view and sign the document")
  @JsonProperty("phoneInfos")
  /**
   * @return List&lt;PhoneInfo&gt;
   **/
  public List<PhoneInfo> getPhoneInfos() {
    return phoneInfos;
  }
  /**
   * The phoneInfo required for the recipient to view and sign the document
   * @param phoneInfos
   **/
  public void setPhoneInfos(List<PhoneInfo> phoneInfos) {
    this.phoneInfos = phoneInfos;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSecurityOption {\n");
    
    sb.append("    authenticationMethod: ").append(StringUtil.toIndentedString(authenticationMethod)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("    phoneInfos: ").append(StringUtil.toIndentedString(phoneInfos)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
