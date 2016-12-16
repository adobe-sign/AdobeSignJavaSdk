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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class WidgetStatusUpdateResponse   {
  

public enum CodeEnum {
  OK("OK"),
  ALREADY_DISABLED("ALREADY_DISABLED"),
  ALREADY_ENABLED("ALREADY_ENABLED");

  private String value;

  CodeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private CodeEnum code = null;
  private String message = null;

  
  /**
   * The result of the attempt to disable or enable the widget
   **/
  @ApiModelProperty(required = true, value = "The result of the attempt to disable or enable the widget")
  @JsonProperty("code")
  /**
   * @return CodeEnum
   **/
  public CodeEnum getCode() {
    return code;
  }
  /**
   * The result of the attempt to disable or enable the widget
   * @param code
   **/
  public void setCode(CodeEnum code) {
    this.code = code;
  }

  
  /**
   * String result message if there was no error
   **/
  @ApiModelProperty(value = "String result message if there was no error")
  @JsonProperty("message")
  /**
   * @return String
   **/
  public String getMessage() {
    return message;
  }
  /**
   * String result message if there was no error
   * @param message
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetStatusUpdateResponse {\n");
    
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
