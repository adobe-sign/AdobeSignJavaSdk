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
import com.adobe.sign.model.libraryDocuments.LibDocEventDeviceLocation;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:58.451+05:30")
public class LibDocumentHistoryEvent   {
  
  private String actingUserEmail = null;
  private String actingUserIpAddress = null;
  private String comment = null;
  private Date date = null;
  private String description = null;
  private LibDocEventDeviceLocation deviceLocation = null;
  private String participantEmail = null;
  private String synchronizationId = null;

public enum TypeEnum {
  CREATED("CREATED"),
  UPLOADED_BY_SENDER("UPLOADED_BY_SENDER"),
  FAXED_BY_SENDER("FAXED_BY_SENDER"),
  AGREEMENT_MODIFIED("AGREEMENT_MODIFIED"),
  USER_ACK_AGREEMENT_MODIFIED("USER_ACK_AGREEMENT_MODIFIED"),
  PRESIGNED("PRESIGNED"),
  SIGNED("SIGNED"),
  ESIGNED("ESIGNED"),
  DIGSIGNED("DIGSIGNED"),
  APPROVED("APPROVED"),
  OFFLINE_SYNC("OFFLINE_SYNC"),
  FAXIN_RECEIVED("FAXIN_RECEIVED"),
  SIGNATURE_REQUESTED("SIGNATURE_REQUESTED"),
  APPROVAL_REQUESTED("APPROVAL_REQUESTED"),
  RECALLED("RECALLED"),
  REJECTED("REJECTED"),
  EXPIRED("EXPIRED"),
  EXPIRED_AUTOMATICALLY("EXPIRED_AUTOMATICALLY"),
  SHARED("SHARED"),
  EMAIL_VIEWED("EMAIL_VIEWED"),
  AUTO_CANCELLED_CONVERSION_PROBLEM("AUTO_CANCELLED_CONVERSION_PROBLEM"),
  SIGNER_SUGGESTED_CHANGES("SIGNER_SUGGESTED_CHANGES"),
  SENDER_CREATED_NEW_REVISION("SENDER_CREATED_NEW_REVISION"),
  PASSWORD_AUTHENTICATION_FAILED("PASSWORD_AUTHENTICATION_FAILED"),
  KBA_AUTHENTICATION_FAILED("KBA_AUTHENTICATION_FAILED"),
  KBA_AUTHENTICATED("KBA_AUTHENTICATED"),
  WEB_IDENTITY_AUTHENTICATED("WEB_IDENTITY_AUTHENTICATED"),
  WEB_IDENTITY_SPECIFIED("WEB_IDENTITY_SPECIFIED"),
  EMAIL_BOUNCED("EMAIL_BOUNCED"),
  WIDGET_ENABLED("WIDGET_ENABLED"),
  WIDGET_DISABLED("WIDGET_DISABLED"),
  DELEGATED("DELEGATED"),
  AUTO_DELEGATED("AUTO_DELEGATED"),
  REPLACED_SIGNER("REPLACED_SIGNER"),
  VAULTED("VAULTED"),
  DOCUMENTS_DELETED("DOCUMENTS_DELETED"),
  OTHER("OTHER");

  private String value;

  TypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private TypeEnum type = null;
  private String vaultEventId = null;
  private String versionId = null;

  
  /**
   * Email address of the user that initiated the event
   **/
  @ApiModelProperty(required = true, value = "Email address of the user that initiated the event")
  @JsonProperty("actingUserEmail")
  public String getActingUserEmail() {
    return actingUserEmail;
  }
  public void setActingUserEmail(String actingUserEmail) {
    this.actingUserEmail = actingUserEmail;
  }

  
  /**
   * The IP address of the user that initiated the event
   **/
  @ApiModelProperty(required = true, value = "The IP address of the user that initiated the event")
  @JsonProperty("actingUserIpAddress")
  public String getActingUserIpAddress() {
    return actingUserIpAddress;
  }
  public void setActingUserIpAddress(String actingUserIpAddress) {
    this.actingUserIpAddress = actingUserIpAddress;
  }

  
  /**
   * The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant
   **/
  @ApiModelProperty(value = "The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   * The date of the audit event
   **/
  @ApiModelProperty(required = true, value = "The date of the audit event")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   * A description of the audit event
   **/
  @ApiModelProperty(required = true, value = "A description of the audit event")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Location of the device that created the event (This value may be null due to limited privileges)
   **/
  @ApiModelProperty(value = "Location of the device that created the event (This value may be null due to limited privileges)")
  @JsonProperty("deviceLocation")
  public LibDocEventDeviceLocation getDeviceLocation() {
    return deviceLocation;
  }
  public void setDeviceLocation(LibDocEventDeviceLocation deviceLocation) {
    this.deviceLocation = deviceLocation;
  }

  
  /**
   * Email address of the user that initiated the event
   **/
  @ApiModelProperty(required = true, value = "Email address of the user that initiated the event")
  @JsonProperty("participantEmail")
  public String getParticipantEmail() {
    return participantEmail;
  }
  public void setParticipantEmail(String participantEmail) {
    this.participantEmail = participantEmail;
  }

  
  /**
   * A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null)
   **/
  @ApiModelProperty(value = "A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null)")
  @JsonProperty("synchronizationId")
  public String getSynchronizationId() {
    return synchronizationId;
  }
  public void setSynchronizationId(String synchronizationId) {
    this.synchronizationId = synchronizationId;
  }

  
  /**
   * Type of the document event
   **/
  @ApiModelProperty(required = true, value = "Type of the document event")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null)
   **/
  @ApiModelProperty(value = "The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null)")
  @JsonProperty("vaultEventId")
  public String getVaultEventId() {
    return vaultEventId;
  }
  public void setVaultEventId(String vaultEventId) {
    this.vaultEventId = vaultEventId;
  }

  
  /**
   * An ID which uniquely identifies the version of the document associated with this audit event
   **/
  @ApiModelProperty(required = true, value = "An ID which uniquely identifies the version of the document associated with this audit event")
  @JsonProperty("versionId")
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibDocumentHistoryEvent {\n");
    
    sb.append("    actingUserEmail: ").append(StringUtil.toIndentedString(actingUserEmail)).append("\n");
    sb.append("    actingUserIpAddress: ").append(StringUtil.toIndentedString(actingUserIpAddress)).append("\n");
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    deviceLocation: ").append(StringUtil.toIndentedString(deviceLocation)).append("\n");
    sb.append("    participantEmail: ").append(StringUtil.toIndentedString(participantEmail)).append("\n");
    sb.append("    synchronizationId: ").append(StringUtil.toIndentedString(synchronizationId)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    vaultEventId: ").append(StringUtil.toIndentedString(vaultEventId)).append("\n");
    sb.append("    versionId: ").append(StringUtil.toIndentedString(versionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
