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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:01.470+05:30")
public class UserStatusUpdateInfo   {
  
  private String comment = null;

public enum UserStatusEnum {
  ACTIVE("ACTIVE"),
  INACTIVE("INACTIVE");

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
   * An optional comment describing why you want to activate/deactivate a given user
   **/
  @ApiModelProperty(value = "An optional comment describing why you want to activate/deactivate a given user")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   * The state to which the user is to be updated. The valid states for this variable is currently, ACTIVE and INACTIVE
   **/
  @ApiModelProperty(required = true, value = "The state to which the user is to be updated. The valid states for this variable is currently, ACTIVE and INACTIVE")
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
    sb.append("class UserStatusUpdateInfo {\n");
    
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("    userStatus: ").append(StringUtil.toIndentedString(userStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
