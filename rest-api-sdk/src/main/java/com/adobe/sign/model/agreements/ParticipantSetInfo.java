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

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.agreements.ParticipantInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:49.202+05:30")
public class ParticipantSetInfo   {
  
  private String participantSetId = null;
  private List<ParticipantInfo> participantSetMemberInfos = new ArrayList<ParticipantInfo>();
  private String participantSetName = null;
  private String privateMessage = null;

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

  private List<RolesEnum> roles = new ArrayList<RolesEnum>();

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

  private List<SecurityOptionsEnum> securityOptions = new ArrayList<SecurityOptionsEnum>();
  private Integer signingOrder = null;

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

  
  /**
   * The unique identifier of the participant set
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the participant set")
  @JsonProperty("participantSetId")
  public String getParticipantSetId() {
    return participantSetId;
  }
  public void setParticipantSetId(String participantSetId) {
    this.participantSetId = participantSetId;
  }

  
  /**
   * Information about the members of the recipient set
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
  @JsonProperty("participantSetMemberInfos")
  public List<ParticipantInfo> getParticipantSetMemberInfos() {
    return participantSetMemberInfos;
  }
  public void setParticipantSetMemberInfos(List<ParticipantInfo> participantSetMemberInfos) {
    this.participantSetMemberInfos = participantSetMemberInfos;
  }

  
  /**
   * The name of the participant set. Returned only, if the API caller is the sender of agreement
   **/
  @ApiModelProperty(value = "The name of the participant set. Returned only, if the API caller is the sender of agreement")
  @JsonProperty("participantSetName")
  public String getParticipantSetName() {
    return participantSetName;
  }
  public void setParticipantSetName(String participantSetName) {
    this.participantSetName = participantSetName;
  }

  
  /**
   * Private message for the participants in the set
   **/
  @ApiModelProperty(value = "Private message for the participants in the set")
  @JsonProperty("privateMessage")
  public String getPrivateMessage() {
    return privateMessage;
  }
  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  
  /**
   * The current roles of the participant set. A participant set can have one or more roles
   **/
  @ApiModelProperty(required = true, value = "The current roles of the participant set. A participant set can have one or more roles")
  @JsonProperty("roles")
  public List<RolesEnum> getRoles() {
    return roles;
  }
  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  
  /**
   * Security options that apply to the participant
   **/
  @ApiModelProperty(value = "Security options that apply to the participant")
  @JsonProperty("securityOptions")
  public List<SecurityOptionsEnum> getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Index indicating sequential signing group (specified for hybrid routing)
   **/
  @ApiModelProperty(value = "Index indicating sequential signing group (specified for hybrid routing)")
  @JsonProperty("signingOrder")
  public Integer getSigningOrder() {
    return signingOrder;
  }
  public void setSigningOrder(Integer signingOrder) {
    this.signingOrder = signingOrder;
  }

  
  /**
   * The status of the participant set with respect to the widget
   **/
  @ApiModelProperty(required = true, value = "The status of the participant set with respect to the widget")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantSetInfo {\n");
    
    sb.append("    participantSetId: ").append(StringUtil.toIndentedString(participantSetId)).append("\n");
    sb.append("    participantSetMemberInfos: ").append(StringUtil.toIndentedString(participantSetMemberInfos)).append("\n");
    sb.append("    participantSetName: ").append(StringUtil.toIndentedString(participantSetName)).append("\n");
    sb.append("    privateMessage: ").append(StringUtil.toIndentedString(privateMessage)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    signingOrder: ").append(StringUtil.toIndentedString(signingOrder)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
