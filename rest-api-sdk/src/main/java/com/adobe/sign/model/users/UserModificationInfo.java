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
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:33.254+05:30")
public class UserModificationInfo   {
  
  private String company = null;
  private String email = null;
  private String firstName = null;
  private String groupId = null;
  private String lastName = null;

public enum OptInEnum {
  YES("YES"),
  NO("NO"),
  UNKNOWN("UNKNOWN");

  private String value;

  OptInEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private OptInEnum optIn = null;
  private String phone = null;

public enum RolesEnum {
  ACCOUNT_ADMIN("ACCOUNT_ADMIN"),
  GROUP_ADMIN("GROUP_ADMIN"),
  NORMAL_USER("NORMAL_USER");

  private String value;

  RolesEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<RolesEnum> roles = null;
  private String title = null;

  
  /**
   * The new company name of the user. The server will reset to null if the value is not provided
   **/
  @ApiModelProperty(value = "The new company name of the user. The server will reset to null if the value is not provided")
  @JsonProperty("company")
  /**
   * @return String
   **/
  public String getCompany() {
    return company;
  }
  /**
   * The new company name of the user. The server will reset to null if the value is not provided
   * @param company
   **/
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * The new email address of the user
   **/
  @ApiModelProperty(required = true, value = "The new email address of the user")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * The new email address of the user
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The new first name of the user
   **/
  @ApiModelProperty(required = true, value = "The new first name of the user")
  @JsonProperty("firstName")
  /**
   * @return String
   **/
  public String getFirstName() {
    return firstName;
  }
  /**
   * The new first name of the user
   * @param firstName
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * The new group in which the user should be added. It can be obtained through a call to the API which retrieves the list of users. The server will reset to default if the value is not provided
   **/
  @ApiModelProperty(required = true, value = "The new group in which the user should be added. It can be obtained through a call to the API which retrieves the list of users. The server will reset to default if the value is not provided")
  @JsonProperty("groupId")
  /**
   * @return String
   **/
  public String getGroupId() {
    return groupId;
  }
  /**
   * The new group in which the user should be added. It can be obtained through a call to the API which retrieves the list of users. The server will reset to default if the value is not provided
   * @param groupId
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * The new last name of the user
   **/
  @ApiModelProperty(required = true, value = "The new last name of the user")
  @JsonProperty("lastName")
  /**
   * @return String
   **/
  public String getLastName() {
    return lastName;
  }
  /**
   * The new last name of the user
   * @param lastName
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Whether or not the user has opted in to receive the marketing information from Adobe Sign and its partners. The server will reset to null if the value is not provided.
   **/
  @ApiModelProperty(value = "Whether or not the user has opted in to receive the marketing information from Adobe Sign and its partners. The server will reset to null if the value is not provided.")
  @JsonProperty("optIn")
  /**
   * @return OptInEnum
   **/
  public OptInEnum getOptIn() {
    return optIn;
  }
  /**
   * Whether or not the user has opted in to receive the marketing information from Adobe Sign and its partners. The server will reset to null if the value is not provided.
   * @param optIn
   **/
  public void setOptIn(OptInEnum optIn) {
    this.optIn = optIn;
  }

  
  /**
   * The new phone number of the user. The server will reset to null if the value is not provided
   **/
  @ApiModelProperty(value = "The new phone number of the user. The server will reset to null if the value is not provided")
  @JsonProperty("phone")
  /**
   * @return String
   **/
  public String getPhone() {
    return phone;
  }
  /**
   * The new phone number of the user. The server will reset to null if the value is not provided
   * @param phone
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * The new roles of the user
   **/
  @ApiModelProperty(required = true, value = "The new roles of the user")
  @JsonProperty("roles")
  /**
   * @return List&lt;RolesEnum&gt;
   **/
  public List<RolesEnum> getRoles() {
    return roles;
  }
  /**
   * The new roles of the user
   * @param roles
   **/
  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  
  /**
   * The new job title of the user. The server will reset to null if the value is not provided
   **/
  @ApiModelProperty(value = "The new job title of the user. The server will reset to null if the value is not provided")
  @JsonProperty("title")
  /**
   * @return String
   **/
  public String getTitle() {
    return title;
  }
  /**
   * The new job title of the user. The server will reset to null if the value is not provided
   * @param title
   **/
  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModificationInfo {\n");
    
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    groupId: ").append(StringUtil.toIndentedString(groupId)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    optIn: ").append(StringUtil.toIndentedString(optIn)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
