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
public class UserCreationInfo   {
  
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
  private String password = null;
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
   * The name of the company of the new user
   **/
  @ApiModelProperty(value = "The name of the company of the new user")
  @JsonProperty("company")
  /**
   * @return String
   **/
  public String getCompany() {
    return company;
  }
  /**
   * The name of the company of the new user
   * @param company
   **/
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * The email address of the new user
   **/
  @ApiModelProperty(required = true, value = "The email address of the new user")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * The email address of the new user
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The first name of the new user
   **/
  @ApiModelProperty(required = true, value = "The first name of the new user")
  @JsonProperty("firstName")
  /**
   * @return String
   **/
  public String getFirstName() {
    return firstName;
  }
  /**
   * The first name of the new user
   * @param firstName
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Group in which the new user should be added. It can be obtained through a call to the API which retrieves users. Default is Group of the user making this call. The user is inferred from the access_token header.
   **/
  @ApiModelProperty(value = "Group in which the new user should be added. It can be obtained through a call to the API which retrieves users. Default is Group of the user making this call. The user is inferred from the access_token header.")
  @JsonProperty("groupId")
  /**
   * @return String
   **/
  public String getGroupId() {
    return groupId;
  }
  /**
   * Group in which the new user should be added. It can be obtained through a call to the API which retrieves users. Default is Group of the user making this call. The user is inferred from the access_token header.
   * @param groupId
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * The last name of the new user
   **/
  @ApiModelProperty(required = true, value = "The last name of the new user")
  @JsonProperty("lastName")
  /**
   * @return String
   **/
  public String getLastName() {
    return lastName;
  }
  /**
   * The last name of the new user
   * @param lastName
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN
   **/
  @ApiModelProperty(value = "Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN")
  @JsonProperty("optIn")
  /**
   * @return OptInEnum
   **/
  public OptInEnum getOptIn() {
    return optIn;
  }
  /**
   * Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN
   * @param optIn
   **/
  public void setOptIn(OptInEnum optIn) {
    this.optIn = optIn;
  }

  
  /**
   * The password of the new user
   **/
  @ApiModelProperty(value = "The password of the new user")
  @JsonProperty("password")
  /**
   * @return String
   **/
  public String getPassword() {
    return password;
  }
  /**
   * The password of the new user
   * @param password
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The phone number of the new user
   **/
  @ApiModelProperty(value = "The phone number of the new user")
  @JsonProperty("phone")
  /**
   * @return String
   **/
  public String getPhone() {
    return phone;
  }
  /**
   * The phone number of the new user
   * @param phone
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * The current roles of the user
   **/
  @ApiModelProperty(value = "The current roles of the user")
  @JsonProperty("roles")
  /**
   * @return List&lt;RolesEnum&gt;
   **/
  public List<RolesEnum> getRoles() {
    return roles;
  }
  /**
   * The current roles of the user
   * @param roles
   **/
  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  
  /**
   * The job title of the new user
   **/
  @ApiModelProperty(value = "The job title of the new user")
  @JsonProperty("title")
  /**
   * @return String
   **/
  public String getTitle() {
    return title;
  }
  /**
   * The job title of the new user
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
    sb.append("class UserCreationInfo {\n");
    
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    groupId: ").append(StringUtil.toIndentedString(groupId)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    optIn: ").append(StringUtil.toIndentedString(optIn)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
