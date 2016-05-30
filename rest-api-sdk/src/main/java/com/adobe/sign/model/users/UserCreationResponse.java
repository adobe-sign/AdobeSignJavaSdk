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
public class UserCreationResponse   {
  
  private String userId = null;

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
   * The unique identifier for user in REST APIs. This identifier will not be compatible with any existing SOAP APIs and is different from user key that SOAP APIs provide and consume. userid being provided here and userkey that SOAP uses are different and the two can not be interchanged with each other
   **/
  @ApiModelProperty(value = "The unique identifier for user in REST APIs. This identifier will not be compatible with any existing SOAP APIs and is different from user key that SOAP APIs provide and consume. userid being provided here and userkey that SOAP uses are different and the two can not be interchanged with each other")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Status of the user
   **/
  @ApiModelProperty(required = true, value = "Status of the user")
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
    sb.append("class UserCreationResponse {\n");
    
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    userStatus: ").append(StringUtil.toIndentedString(userStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
