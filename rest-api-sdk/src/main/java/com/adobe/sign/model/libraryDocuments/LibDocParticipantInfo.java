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

package com.adobe.sign.model.libraryDocuments;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.libraryDocuments.LibDocParticipantInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.195+05:30")
public class LibDocParticipantInfo   {
  
  private List<LibDocParticipantInfo> alternateParticipants = null;
  private String company = null;
  private String email = null;
  private String name = null;

public enum RolesEnum {
  SENDER("SENDER"),
  SIGNER("SIGNER"),
  APPROVER("APPROVER"),
  DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
  DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"),
  CC("CC"),
  DELEGATE("DELEGATE"),
  SHARE("SHARE"),
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

public enum SecurityOptionsEnum {
  PASSWORD("PASSWORD"),
  WEB_IDENTITY("WEB_IDENTITY"),
  KBA("KBA"),
  PHONE("PHONE"),
  OTHER("OTHER");

  private String value;

  SecurityOptionsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<SecurityOptionsEnum> securityOptions = null;

public enum StatusEnum {
  WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"),
  WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"),
  WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"),
  OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"),
  SIGNED("SIGNED"),
  APPROVED("APPROVED"),
  RECALLED("RECALLED"),
  HIDDEN("HIDDEN"),
  NOT_YET_VISIBLE("NOT_YET_VISIBLE"),
  WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"),
  ARCHIVED("ARCHIVED"),
  UNKNOWN("UNKNOWN"),
  PARTIAL("PARTIAL"),
  FORM("FORM"),
  WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"),
  OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"),
  WIDGET("WIDGET"),
  EXPIRED("EXPIRED"),
  WAITING_FOR_MY_REVIEW("WAITING_FOR_MY_REVIEW"),
  IN_REVIEW("IN_REVIEW"),
  OTHER("OTHER");

  private String value;

  StatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private StatusEnum status = null;
  private String title = null;

  
  /**
   * All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE
   **/
  @ApiModelProperty(value = "All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE")
  @JsonProperty("alternateParticipants")
  /**
   * @return List&lt;LibDocParticipantInfo&gt;
   **/
  public List<LibDocParticipantInfo> getAlternateParticipants() {
    return alternateParticipants;
  }
  /**
   * All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE
   * @param alternateParticipants
   **/
  public void setAlternateParticipants(List<LibDocParticipantInfo> alternateParticipants) {
    this.alternateParticipants = alternateParticipants;
  }

  
  /**
   * The company of the participant, if available
   **/
  @ApiModelProperty(value = "The company of the participant, if available")
  @JsonProperty("company")
  /**
   * @return String
   **/
  public String getCompany() {
    return company;
  }
  /**
   * The company of the participant, if available
   * @param company
   **/
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * The email address of the participant
   **/
  @ApiModelProperty(required = true, value = "The email address of the participant")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * The email address of the participant
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The name of the participant, if available
   **/
  @ApiModelProperty(value = "The name of the participant, if available")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The name of the participant, if available
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The current roles of the participant. A participant can have one or more roles
   **/
  @ApiModelProperty(required = true, value = "The current roles of the participant. A participant can have one or more roles")
  @JsonProperty("roles")
  /**
   * @return List&lt;RolesEnum&gt;
   **/
  public List<RolesEnum> getRoles() {
    return roles;
  }
  /**
   * The current roles of the participant. A participant can have one or more roles
   * @param roles
   **/
  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  
  /**
   * Security options that apply to the participant
   **/
  @ApiModelProperty(value = "Security options that apply to the participant")
  @JsonProperty("securityOptions")
  /**
   * @return List&lt;SecurityOptionsEnum&gt;
   **/
  public List<SecurityOptionsEnum> getSecurityOptions() {
    return securityOptions;
  }
  /**
   * Security options that apply to the participant
   * @param securityOptions
   **/
  public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * The status of the participant with respect to the document
   **/
  @ApiModelProperty(required = true, value = "The status of the participant with respect to the document")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * The status of the participant with respect to the document
   * @param status
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The title of the participant, if available
   **/
  @ApiModelProperty(value = "The title of the participant, if available")
  @JsonProperty("title")
  /**
   * @return String
   **/
  public String getTitle() {
    return title;
  }
  /**
   * The title of the participant, if available
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
    sb.append("class LibDocParticipantInfo {\n");
    
    sb.append("    alternateParticipants: ").append(StringUtil.toIndentedString(alternateParticipants)).append("\n");
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
