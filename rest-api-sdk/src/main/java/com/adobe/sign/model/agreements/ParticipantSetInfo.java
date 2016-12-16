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
import java.util.*;
import com.adobe.sign.model.agreements.ParticipantInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class ParticipantSetInfo   {
  
  private String participantSetId = null;
  private List<ParticipantInfo> participantSetMemberInfos = null;
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
  /**
   * @return String
   **/
  public String getParticipantSetId() {
    return participantSetId;
  }
  /**
   * The unique identifier of the participant set
   * @param participantSetId
   **/
  public void setParticipantSetId(String participantSetId) {
    this.participantSetId = participantSetId;
  }

  
  /**
   * Information about the members of the recipient set
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
  @JsonProperty("participantSetMemberInfos")
  /**
   * @return List&lt;ParticipantInfo&gt;
   **/
  public List<ParticipantInfo> getParticipantSetMemberInfos() {
    return participantSetMemberInfos;
  }
  /**
   * Information about the members of the recipient set
   * @param participantSetMemberInfos
   **/
  public void setParticipantSetMemberInfos(List<ParticipantInfo> participantSetMemberInfos) {
    this.participantSetMemberInfos = participantSetMemberInfos;
  }

  
  /**
   * The name of the participant set. Returned only, if the API caller is the sender of agreement
   **/
  @ApiModelProperty(value = "The name of the participant set. Returned only, if the API caller is the sender of agreement")
  @JsonProperty("participantSetName")
  /**
   * @return String
   **/
  public String getParticipantSetName() {
    return participantSetName;
  }
  /**
   * The name of the participant set. Returned only, if the API caller is the sender of agreement
   * @param participantSetName
   **/
  public void setParticipantSetName(String participantSetName) {
    this.participantSetName = participantSetName;
  }

  
  /**
   * Private message for the participants in the set
   **/
  @ApiModelProperty(value = "Private message for the participants in the set")
  @JsonProperty("privateMessage")
  /**
   * @return String
   **/
  public String getPrivateMessage() {
    return privateMessage;
  }
  /**
   * Private message for the participants in the set
   * @param privateMessage
   **/
  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  
  /**
   * The current roles of the participant set. A participant set can have one or more roles
   **/
  @ApiModelProperty(required = true, value = "The current roles of the participant set. A participant set can have one or more roles")
  @JsonProperty("roles")
  /**
   * @return List&lt;RolesEnum&gt;
   **/
  public List<RolesEnum> getRoles() {
    return roles;
  }
  /**
   * The current roles of the participant set. A participant set can have one or more roles
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
   * Index indicating sequential signing group (specified for hybrid routing)
   **/
  @ApiModelProperty(value = "Index indicating sequential signing group (specified for hybrid routing)")
  @JsonProperty("signingOrder")
  /**
   * @return Integer
   **/
  public Integer getSigningOrder() {
    return signingOrder;
  }
  /**
   * Index indicating sequential signing group (specified for hybrid routing)
   * @param signingOrder
   **/
  public void setSigningOrder(Integer signingOrder) {
    this.signingOrder = signingOrder;
  }

  
  /**
   * The status of the participant set with respect to the widget
   **/
  @ApiModelProperty(required = true, value = "The status of the participant set with respect to the widget")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * The status of the participant set with respect to the widget
   * @param status
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
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
