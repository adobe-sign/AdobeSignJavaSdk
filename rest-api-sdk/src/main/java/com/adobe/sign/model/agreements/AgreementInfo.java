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
import java.util.Date;
import com.adobe.sign.model.agreements.ParticipantSetInfo;
import com.adobe.sign.model.agreements.NextParticipantSetInfo;
import java.util.*;
import com.adobe.sign.model.agreements.DocumentHistoryEvent;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:02.594+05:30")
public class AgreementInfo   {
  
  private String agreementId = null;
  private List<DocumentHistoryEvent> events = new ArrayList<DocumentHistoryEvent>();
  private Date expiration = null;
  private String latestVersionId = null;
  private String locale = null;
  private String message = null;
  private Boolean modifiable = null;
  private String name = null;
  private List<NextParticipantSetInfo> nextParticipantSetInfos = new ArrayList<NextParticipantSetInfo>();
  private List<ParticipantSetInfo> participantSetInfos = new ArrayList<ParticipantSetInfo>();

public enum SecurityOptionsEnum {
  OPEN_PROTECTED("OPEN_PROTECTED"),
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

public enum StatusEnum {
  OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"),
  WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"),
  SIGNED("SIGNED"),
  APPROVED("APPROVED"),
  ABORTED("ABORTED"),
  DOCUMENT_LIBRARY("DOCUMENT_LIBRARY"),
  WIDGET("WIDGET"),
  EXPIRED("EXPIRED"),
  ARCHIVED("ARCHIVED"),
  PREFILL("PREFILL"),
  AUTHORING("AUTHORING"),
  WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"),
  WAITING_FOR_VERIFICATION("WAITING_FOR_VERIFICATION"),
  WIDGET_WAITING_FOR_VERIFICATION("WIDGET_WAITING_FOR_VERIFICATION"),
  WAITING_FOR_PAYMENT("WAITING_FOR_PAYMENT"),
  OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"),
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
  private Boolean vaultingEnabled = null;

  
  /**
   * A resource identifier that can be used to uniquely identify the agreement resource in other apis
   **/
  @ApiModelProperty(required = true, value = "A resource identifier that can be used to uniquely identify the agreement resource in other apis")
  @JsonProperty("agreementId")
  public String getAgreementId() {
    return agreementId;
  }
  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  
  /**
   * An ordered list of the events in the audit trail of this document
   **/
  @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
  @JsonProperty("events")
  public List<DocumentHistoryEvent> getEvents() {
    return events;
  }
  public void setEvents(List<DocumentHistoryEvent> events) {
    this.events = events;
  }

  
  /**
   * The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document
   **/
  @ApiModelProperty(value = "The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   * An ID which uniquely identifies the current version of the document
   **/
  @ApiModelProperty(required = true, value = "An ID which uniquely identifies the current version of the document")
  @JsonProperty("latestVersionId")
  public String getLatestVersionId() {
    return latestVersionId;
  }
  public void setLatestVersionId(String latestVersionId) {
    this.latestVersionId = latestVersionId;
  }

  
  /**
   * The locale associated with this agreement - for example, en_US or fr_FR
   **/
  @ApiModelProperty(required = true, value = "The locale associated with this agreement - for example, en_US or fr_FR")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * The message associated with the document that the sender has provided
   **/
  @ApiModelProperty(value = "The message associated with the document that the sender has provided")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Information about whether the agreement can be modified
   **/
  @ApiModelProperty(required = true, value = "Information about whether the agreement can be modified")
  @JsonProperty("modifiable")
  public Boolean getModifiable() {
    return modifiable;
  }
  public void setModifiable(Boolean modifiable) {
    this.modifiable = modifiable;
  }

  
  /**
   * The name of the document, specified by the sender
   **/
  @ApiModelProperty(required = true, value = "The name of the document, specified by the sender")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Information about who needs to act next for this document - for example, if the agreement is in status OUT_FOR_SIGNATURE or OUT_FOR_APPROVAL, this will be the next signer or approver. If the AgreementStatus is a terminal state, this array is empty
   **/
  @ApiModelProperty(required = true, value = "Information about who needs to act next for this document - for example, if the agreement is in status OUT_FOR_SIGNATURE or OUT_FOR_APPROVAL, this will be the next signer or approver. If the AgreementStatus is a terminal state, this array is empty")
  @JsonProperty("nextParticipantSetInfos")
  public List<NextParticipantSetInfo> getNextParticipantSetInfos() {
    return nextParticipantSetInfos;
  }
  public void setNextParticipantSetInfos(List<NextParticipantSetInfo> nextParticipantSetInfos) {
    this.nextParticipantSetInfos = nextParticipantSetInfos;
  }

  
  /**
   * Information about all the participant sets of this document
   **/
  @ApiModelProperty(required = true, value = "Information about all the participant sets of this document")
  @JsonProperty("participantSetInfos")
  public List<ParticipantSetInfo> getParticipantSetInfos() {
    return participantSetInfos;
  }
  public void setParticipantSetInfos(List<ParticipantSetInfo> participantSetInfos) {
    this.participantSetInfos = participantSetInfos;
  }

  
  /**
   * Security information about the document that specifies whether or not a password is required to view and sign the document
   **/
  @ApiModelProperty(value = "Security information about the document that specifies whether or not a password is required to view and sign the document")
  @JsonProperty("securityOptions")
  public List<SecurityOptionsEnum> getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * The current status of the document
   **/
  @ApiModelProperty(required = true, value = "The current status of the document")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Whether vaulting was enabled for the agreement
   **/
  @ApiModelProperty(required = true, value = "Whether vaulting was enabled for the agreement")
  @JsonProperty("vaultingEnabled")
  public Boolean getVaultingEnabled() {
    return vaultingEnabled;
  }
  public void setVaultingEnabled(Boolean vaultingEnabled) {
    this.vaultingEnabled = vaultingEnabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementInfo {\n");
    
    sb.append("    agreementId: ").append(StringUtil.toIndentedString(agreementId)).append("\n");
    sb.append("    events: ").append(StringUtil.toIndentedString(events)).append("\n");
    sb.append("    expiration: ").append(StringUtil.toIndentedString(expiration)).append("\n");
    sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(latestVersionId)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    modifiable: ").append(StringUtil.toIndentedString(modifiable)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    nextParticipantSetInfos: ").append(StringUtil.toIndentedString(nextParticipantSetInfos)).append("\n");
    sb.append("    participantSetInfos: ").append(StringUtil.toIndentedString(participantSetInfos)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    vaultingEnabled: ").append(StringUtil.toIndentedString(vaultingEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
