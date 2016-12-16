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
import java.util.Date;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:33.254+05:30")
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

  private List<CapabilityFlagsEnum> capabilityFlags = null;
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

  private List<RolesEnum> roles = null;
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
  /**
   * @return String
   **/
  public String getAccount() {
    return account;
  }
  /**
   * Nickname of the account to which the user belongs
   * @param account
   **/
  public void setAccount(String account) {
    this.account = account;
  }

  
  /**
   * Type of account to which the user belongs (null if no account)
   **/
  @ApiModelProperty(value = "Type of account to which the user belongs (null if no account)")
  @JsonProperty("accountType")
  /**
   * @return AccountTypeEnum
   **/
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  /**
   * Type of account to which the user belongs (null if no account)
   * @param accountType
   **/
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  
  /**
   * A set of capabilities applicable to the user
   **/
  @ApiModelProperty(value = "A set of capabilities applicable to the user")
  @JsonProperty("capabilityFlags")
  /**
   * @return List&lt;CapabilityFlagsEnum&gt;
   **/
  public List<CapabilityFlagsEnum> getCapabilityFlags() {
    return capabilityFlags;
  }
  /**
   * A set of capabilities applicable to the user
   * @param capabilityFlags
   **/
  public void setCapabilityFlags(List<CapabilityFlagsEnum> capabilityFlags) {
    this.capabilityFlags = capabilityFlags;
  }

  
  /**
   * Name of the channel to which the user belongs
   **/
  @ApiModelProperty(value = "Name of the channel to which the user belongs")
  @JsonProperty("channel")
  /**
   * @return String
   **/
  public String getChannel() {
    return channel;
  }
  /**
   * Name of the channel to which the user belongs
   * @param channel
   **/
  public void setChannel(String channel) {
    this.channel = channel;
  }

  
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
   * The first name of the user
   **/
  @ApiModelProperty(value = "The first name of the user")
  @JsonProperty("firstName")
  /**
   * @return String
   **/
  public String getFirstName() {
    return firstName;
  }
  /**
   * The first name of the user
   * @param firstName
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Name of the group to which the user belongs
   **/
  @ApiModelProperty(value = "Name of the group to which the user belongs")
  @JsonProperty("group")
  /**
   * @return String
   **/
  public String getGroup() {
    return group;
  }
  /**
   * Name of the group to which the user belongs
   * @param group
   **/
  public void setGroup(String group) {
    this.group = group;
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
   * The initials of the user
   **/
  @ApiModelProperty(value = "The initials of the user")
  @JsonProperty("initials")
  /**
   * @return String
   **/
  public String getInitials() {
    return initials;
  }
  /**
   * The initials of the user
   * @param initials
   **/
  public void setInitials(String initials) {
    this.initials = initials;
  }

  
  /**
   * The last name of the user
   **/
  @ApiModelProperty(value = "The last name of the user")
  @JsonProperty("lastName")
  /**
   * @return String
   **/
  public String getLastName() {
    return lastName;
  }
  /**
   * The last name of the user
   * @param lastName
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The UI locale of the user
   **/
  @ApiModelProperty(value = "The UI locale of the user")
  @JsonProperty("locale")
  /**
   * @return String
   **/
  public String getLocale() {
    return locale;
  }
  /**
   * The UI locale of the user
   * @param locale
   **/
  public void setLocale(String locale) {
    this.locale = locale;
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
   * The date of password expiration
   **/
  @ApiModelProperty(value = "The date of password expiration")
  @JsonProperty("passwordExpiration")
  /**
   * @return Date
   **/
  public Date getPasswordExpiration() {
    return passwordExpiration;
  }
  /**
   * The date of password expiration
   * @param passwordExpiration
   **/
  public void setPasswordExpiration(Date passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
  }

  
  /**
   * The phone number of the user
   **/
  @ApiModelProperty(value = "The phone number of the user")
  @JsonProperty("phone")
  /**
   * @return String
   **/
  public String getPhone() {
    return phone;
  }
  /**
   * The phone number of the user
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
   * The job title of the user
   **/
  @ApiModelProperty(value = "The job title of the user")
  @JsonProperty("title")
  /**
   * @return String
   **/
  public String getTitle() {
    return title;
  }
  /**
   * The job title of the user
   * @param title
   **/
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Status of the user
   **/
  @ApiModelProperty(required = true, value = "Status of the user")
  @JsonProperty("userStatus")
  /**
   * @return UserStatusEnum
   **/
  public UserStatusEnum getUserStatus() {
    return userStatus;
  }
  /**
   * Status of the user
   * @param userStatus
   **/
  public void setUserStatus(UserStatusEnum userStatus) {
    this.userStatus = userStatus;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
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
