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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:54.999+05:30")
public class UserDetailsInfo   {
  
  private String account = null;

public enum AccountTypeEnum {
  FREE("FREE"),
  PRO("PRO"),
  TEAM("TEAM"),
  TEAM_TRIAL("TEAM_TRIAL"),
  ENTERPRISE("ENTERPRISE"),
  ENTERPRISE_TRIAL("ENTERPRISE_TRIAL"),
  GLOBAL("GLOBAL"),
  GLOBAL_TRIAL("GLOBAL_TRIAL");

  private String value;

  AccountTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private AccountTypeEnum accountType = null;

public enum CapabilityFlagsEnum {
  CAN_SEND("CAN_SEND"),
  CAN_SIGN("CAN_SIGN"),
  CAN_REPLACE_SIGNER("CAN_REPLACE_SIGNER"),
  VAULT_ENABLED("VAULT_ENABLED"),
  VAULT_PER_AGREEMENT("VAULT_PER_AGREEMENT"),
  OTHER("OTHER");

  private String value;

  CapabilityFlagsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<CapabilityFlagsEnum> capabilityFlags = new ArrayList<CapabilityFlagsEnum>();
  private String channel = null;
  private String company = null;
  private String email = null;
  private String firstName = null;
  private String group = null;
  private String groupId = null;
  private String initials = null;
  private String lastName = null;
  private String locale = null;

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
  private Date passwordExpiration = null;
  private String phone = null;

public enum RolesEnum {
  API("API"),
  ACCOUNT_ADMIN("ACCOUNT_ADMIN"),
  GROUP_ADMIN("GROUP_ADMIN"),
  OTHER("OTHER");

  private String value;

  RolesEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<RolesEnum> roles = new ArrayList<RolesEnum>();
  private String title = null;

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
   * Nickname of the account to which the user belongs
   **/
  @ApiModelProperty(value = "Nickname of the account to which the user belongs")
  @JsonProperty("account")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }

  
  /**
   * Type of account to which the user belongs (null if no account)
   **/
  @ApiModelProperty(value = "Type of account to which the user belongs (null if no account)")
  @JsonProperty("accountType")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  
  /**
   * A set of capabilities applicable to the user
   **/
  @ApiModelProperty(value = "A set of capabilities applicable to the user")
  @JsonProperty("capabilityFlags")
  public List<CapabilityFlagsEnum> getCapabilityFlags() {
    return capabilityFlags;
  }
  public void setCapabilityFlags(List<CapabilityFlagsEnum> capabilityFlags) {
    this.capabilityFlags = capabilityFlags;
  }

  
  /**
   * Name of the channel to which the user belongs
   **/
  @ApiModelProperty(value = "Name of the channel to which the user belongs")
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }

  
  /**
   * The name of company of the user
   **/
  @ApiModelProperty(value = "The name of company of the user")
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
   * The first name of the user
   **/
  @ApiModelProperty(value = "The first name of the user")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Name of the group to which the user belongs
   **/
  @ApiModelProperty(value = "Name of the group to which the user belongs")
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
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
   * The initials of the user
   **/
  @ApiModelProperty(value = "The initials of the user")
  @JsonProperty("initials")
  public String getInitials() {
    return initials;
  }
  public void setInitials(String initials) {
    this.initials = initials;
  }

  
  /**
   * The last name of the user
   **/
  @ApiModelProperty(value = "The last name of the user")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The UI locale of the user
   **/
  @ApiModelProperty(value = "The UI locale of the user")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN
   **/
  @ApiModelProperty(value = "Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN")
  @JsonProperty("optIn")
  public OptInEnum getOptIn() {
    return optIn;
  }
  public void setOptIn(OptInEnum optIn) {
    this.optIn = optIn;
  }

  
  /**
   * The date of password expiration
   **/
  @ApiModelProperty(value = "The date of password expiration")
  @JsonProperty("passwordExpiration")
  public Date getPasswordExpiration() {
    return passwordExpiration;
  }
  public void setPasswordExpiration(Date passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
  }

  
  /**
   * The phone number of the user
   **/
  @ApiModelProperty(value = "The phone number of the user")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * The current roles of the user
   **/
  @ApiModelProperty(value = "The current roles of the user")
  @JsonProperty("roles")
  public List<RolesEnum> getRoles() {
    return roles;
  }
  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  
  /**
   * The job title of the user
   **/
  @ApiModelProperty(value = "The job title of the user")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
    sb.append("class UserDetailsInfo {\n");
    
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    accountType: ").append(StringUtil.toIndentedString(accountType)).append("\n");
    sb.append("    capabilityFlags: ").append(StringUtil.toIndentedString(capabilityFlags)).append("\n");
    sb.append("    channel: ").append(StringUtil.toIndentedString(channel)).append("\n");
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    group: ").append(StringUtil.toIndentedString(group)).append("\n");
    sb.append("    groupId: ").append(StringUtil.toIndentedString(groupId)).append("\n");
    sb.append("    initials: ").append(StringUtil.toIndentedString(initials)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    optIn: ").append(StringUtil.toIndentedString(optIn)).append("\n");
    sb.append("    passwordExpiration: ").append(StringUtil.toIndentedString(passwordExpiration)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    userStatus: ").append(StringUtil.toIndentedString(userStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
