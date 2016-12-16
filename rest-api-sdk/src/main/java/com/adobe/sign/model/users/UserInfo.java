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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:33.254+05:30")
public class UserInfo   {
  
  private String company = null;
  private String email = null;
  private String fullNameOrEmail = null;
  private String groupId = null;
  private String userId = null;

  
  /**
   * The name of company of the user
   **/
  @ApiModelProperty(value = "The name of company of the user")
  @JsonProperty("company")
  /**
   * @return String
   **/
  public String getCompany() {
    return company;
  }
  /**
   * The name of company of the user
   * @param company
   **/
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * The email address of the user
   **/
  @ApiModelProperty(required = true, value = "The email address of the user")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * The email address of the user
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The full name of the user, if available; or their email address
   **/
  @ApiModelProperty(required = true, value = "The full name of the user, if available; or their email address")
  @JsonProperty("fullNameOrEmail")
  /**
   * @return String
   **/
  public String getFullNameOrEmail() {
    return fullNameOrEmail;
  }
  /**
   * The full name of the user, if available; or their email address
   * @param fullNameOrEmail
   **/
  public void setFullNameOrEmail(String fullNameOrEmail) {
    this.fullNameOrEmail = fullNameOrEmail;
  }

  
  /**
   * The identifier that can be used in group management methods
   **/
  @ApiModelProperty(required = true, value = "The identifier that can be used in group management methods")
  @JsonProperty("groupId")
  /**
   * @return String
   **/
  public String getGroupId() {
    return groupId;
  }
  /**
   * The identifier that can be used in group management methods
   * @param groupId
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * A unique identifier of the user resource for REST APIs. This identifier can not be used in SOAP APIs
   **/
  @ApiModelProperty(required = true, value = "A unique identifier of the user resource for REST APIs. This identifier can not be used in SOAP APIs")
  @JsonProperty("userId")
  /**
   * @return String
   **/
  public String getUserId() {
    return userId;
  }
  /**
   * A unique identifier of the user resource for REST APIs. This identifier can not be used in SOAP APIs
   * @param userId
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
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
