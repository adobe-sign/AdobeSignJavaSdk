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

package com.adobe.sign.model.groups;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:53.620+05:30")
public class UserInfo   {
  
  private String company = null;
  private String email = null;
  private String fullNameOrEmail = null;
  private String groupId = null;
  private String userId = null;

  
  /**
   * The name of the company of the user
   **/
  @ApiModelProperty(value = "The name of the company of the user")
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * The email address of the user
   **/
  @ApiModelProperty(required = true, value = "The email address of the user")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The full name of the user if available; or their email address
   **/
  @ApiModelProperty(required = true, value = "The full name of the user if available; or their email address")
  @JsonProperty("fullNameOrEmail")
  public String getFullNameOrEmail() {
    return fullNameOrEmail;
  }
  public void setFullNameOrEmail(String fullNameOrEmail) {
    this.fullNameOrEmail = fullNameOrEmail;
  }

  
  /**
   * The identifier that can be used in group management methods
   **/
  @ApiModelProperty(required = true, value = "The identifier that can be used in group management methods")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * A unique identifier of the user resource for REST APIs. This identfier can not be used in SOAP APIs
   **/
  @ApiModelProperty(required = true, value = "A unique identifier of the user resource for REST APIs. This identfier can not be used in SOAP APIs")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    fullNameOrEmail: ").append(StringUtil.toIndentedString(fullNameOrEmail)).append("\n");
    sb.append("    groupId: ").append(StringUtil.toIndentedString(groupId)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
