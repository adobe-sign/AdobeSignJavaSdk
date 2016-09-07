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

package com.adobe.sign.model.views;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:57.045+05:30")
public class TargetViewRequest   {
  
  private Boolean autoLogin = null;
  private Boolean noChrome = null;

public enum TargetViewEnum {
  ACCOUNT_SETTINGS("ACCOUNT_SETTINGS"),
  USER_PROFILE("USER_PROFILE");

  private String value;

  TargetViewEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private TargetViewEnum targetView = null;

  
  /**
   * Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false
   **/
  @ApiModelProperty(value = "Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false")
  @JsonProperty("autoLogin")
  public Boolean getAutoLogin() {
    return autoLogin;
  }
  public void setAutoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
  }

  
  /**
   * No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false
   **/
  @ApiModelProperty(value = "No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false")
  @JsonProperty("noChrome")
  public Boolean getNoChrome() {
    return noChrome;
  }
  public void setNoChrome(Boolean noChrome) {
    this.noChrome = noChrome;
  }

  
  /**
   * Two types of views are available- ACCOUNT_SETTINGS:- For getting the URL for Account Settings for Admin only, USER_PROFILE:- For getting the URL for User Profile
   **/
  @ApiModelProperty(required = true, value = "Two types of views are available- ACCOUNT_SETTINGS:- For getting the URL for Account Settings for Admin only, USER_PROFILE:- For getting the URL for User Profile")
  @JsonProperty("targetView")
  public TargetViewEnum getTargetView() {
    return targetView;
  }
  public void setTargetView(TargetViewEnum targetView) {
    this.targetView = targetView;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetViewRequest {\n");
    
    sb.append("    autoLogin: ").append(StringUtil.toIndentedString(autoLogin)).append("\n");
    sb.append("    noChrome: ").append(StringUtil.toIndentedString(noChrome)).append("\n");
    sb.append("    targetView: ").append(StringUtil.toIndentedString(targetView)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
