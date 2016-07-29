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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:04.202+05:30")
public class WidgetStatusUpdateInfo   {
  
  private String message = null;
  private String redirectUrl = null;

public enum ValueEnum {
  DISABLE("DISABLE"),
  ENABLE("ENABLE");

  private String value;

  ValueEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ValueEnum value = null;

  
  /**
   * Display this custom message to the user when the widget is accessed. Note that this can contain wiki markup to include clickable links in the message. This is required if redirectUrl is not provided. Both message and redirectUrl can not be specified.
   **/
  @ApiModelProperty(required = true, value = "Display this custom message to the user when the widget is accessed. Note that this can contain wiki markup to include clickable links in the message. This is required if redirectUrl is not provided. Both message and redirectUrl can not be specified.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Redirect the user to this URL when the widget is accessed. This is required if message is not provided. Both message and redirectUrl can not be specified.
   **/
  @ApiModelProperty(required = true, value = "Redirect the user to this URL when the widget is accessed. This is required if message is not provided. Both message and redirectUrl can not be specified.")
  @JsonProperty("redirectUrl")
  public String getRedirectUrl() {
    return redirectUrl;
  }
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  
  /**
   * The status to which the widget is to be updated. The possible values for this variable are ENABLE and DISABLE
   **/
  @ApiModelProperty(required = true, value = "The status to which the widget is to be updated. The possible values for this variable are ENABLE and DISABLE")
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }
  public void setValue(ValueEnum value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetStatusUpdateInfo {\n");
    
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    redirectUrl: ").append(StringUtil.toIndentedString(redirectUrl)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
