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

package com.adobe.sign.model.users;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:54.575+05:30")
public class UserStatusUpdateResponse   {
  

public enum CodeEnum {
  ALREADY_ACTIVE("ALREADY_ACTIVE"),
  ALREADY_INACTIVE("ALREADY_INACTIVE"),
  OK("OK"),
  RESET_PASSWORD_WORKFLOW_INITIATED("RESET_PASSWORD_WORKFLOW_INITIATED"),
  SET_PASSWORD_WORKFLOW_INITIATED("SET_PASSWORD_WORKFLOW_INITIATED");

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

public enum UserStatusEnum {
  ACTIVE("ACTIVE"),
  INACTIVE("INACTIVE"),
  CREATED("CREATED"),
  PENDING("PENDING"),
  UNVERIFIED("UNVERIFIED");

  private String value;

  UserStatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private UserStatusEnum userStatus = null;

  
  /**
   * The result of the attempt to activate or deactivate the user
   **/
  @ApiModelProperty(required = true, value = "The result of the attempt to activate or deactivate the user")
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }

  
  /**
   * String result message if there was no error
   **/
  @ApiModelProperty(value = "String result message if there was no error")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * A status value showing the result of this operation
   **/
  @ApiModelProperty(required = true, value = "A status value showing the result of this operation")
  @JsonProperty("userStatus")
  public UserStatusEnum getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(UserStatusEnum userStatus) {
    this.userStatus = userStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatusUpdateResponse {\n");
    
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    userStatus: ").append(StringUtil.toIndentedString(userStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
