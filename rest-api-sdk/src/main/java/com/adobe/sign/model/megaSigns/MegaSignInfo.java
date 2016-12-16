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

package com.adobe.sign.model.megaSigns;

import com.adobe.sign.utils.StringUtil;
import java.util.Date;
import com.adobe.sign.model.megaSigns.DocumentHistoryEvent;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.898+05:30")
public class MegaSignInfo   {
  
  private List<DocumentHistoryEvent> events = null;
  private Date expiration = null;
  private String locale = null;
  private String megaSignId = null;
  private String message = null;
  private String latestVersionId = null;
  private String name = null;

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

  private List<SecurityOptionsEnum> securityOptions = null;

public enum StatusEnum {
  WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"),
  WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"),
  WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"),
  OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"),
  OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"),
  SIGNED("SIGNED"),
  APPROVED("APPROVED"),
  RECALLED("RECALLED"),
  WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"),
  ARCHIVED("ARCHIVED"),
  FORM("FORM"),
  EXPIRED("EXPIRED"),
  WIDGET("WIDGET"),
  WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING");

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
   * An ordered list of the events in the audit trail of this document
   **/
  @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
  @JsonProperty("events")
  /**
   * @return List&lt;DocumentHistoryEvent&gt;
   **/
  public List<DocumentHistoryEvent> getEvents() {
    return events;
  }
  /**
   * An ordered list of the events in the audit trail of this document
   * @param events
   **/
  public void setEvents(List<DocumentHistoryEvent> events) {
    this.events = events;
  }

  
  /**
   * The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document
   **/
  @ApiModelProperty(value = "The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document")
  @JsonProperty("expiration")
  /**
   * @return Date
   **/
  public Date getExpiration() {
    return expiration;
  }
  /**
   * The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document
   * @param expiration
   **/
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   * The locale associated with this agreement - for example, en_US or fr_FR
   **/
  @ApiModelProperty(required = true, value = "The locale associated with this agreement - for example, en_US or fr_FR")
  @JsonProperty("locale")
  /**
   * @return String
   **/
  public String getLocale() {
    return locale;
  }
  /**
   * The locale associated with this agreement - for example, en_US or fr_FR
   * @param locale
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Unique identifier of the MegaSign parent agreement
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the MegaSign parent agreement")
  @JsonProperty("megaSignId")
  /**
   * @return String
   **/
  public String getMegaSignId() {
    return megaSignId;
  }
  /**
   * Unique identifier of the MegaSign parent agreement
   * @param megaSignId
   **/
  public void setMegaSignId(String megaSignId) {
    this.megaSignId = megaSignId;
  }

  
  /**
   * The message associated with the document that the sender has provided
   **/
  @ApiModelProperty(value = "The message associated with the document that the sender has provided")
  @JsonProperty("message")
  /**
   * @return String
   **/
  public String getMessage() {
    return message;
  }
  /**
   * The message associated with the document that the sender has provided
   * @param message
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * A version ID which uniquely identifies the current version of the agreement
   **/
  @ApiModelProperty(required = true, value = "A version ID which uniquely identifies the current version of the agreement")
  @JsonProperty("latestVersionId")
  /**
   * @return String
   **/
  public String getLatestVersionId() {
    return latestVersionId;
  }
  /**
   * A version ID which uniquely identifies the current version of the agreement
   * @param latestVersionId
   **/
  public void setLatestVersionId(String latestVersionId) {
    this.latestVersionId = latestVersionId;
  }

  
  /**
   * The name of the document, specified by the sender
   **/
  @ApiModelProperty(required = true, value = "The name of the document, specified by the sender")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The name of the document, specified by the sender
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Security information about the document that specifies whether or not a password is required to view and sign the document
   **/
  @ApiModelProperty(value = "Security information about the document that specifies whether or not a password is required to view and sign the document")
  @JsonProperty("securityOptions")
  /**
   * @return List&lt;SecurityOptionsEnum&gt;
   **/
  public List<SecurityOptionsEnum> getSecurityOptions() {
    return securityOptions;
  }
  /**
   * Security information about the document that specifies whether or not a password is required to view and sign the document
   * @param securityOptions
   **/
  public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Current status of the MegaSign parent agreement from the perspective of the user
   **/
  @ApiModelProperty(required = true, value = "Current status of the MegaSign parent agreement from the perspective of the user")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * Current status of the MegaSign parent agreement from the perspective of the user
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
    sb.append("class MegaSignInfo {\n");
    
    sb.append("    events: ").append(StringUtil.toIndentedString(events)).append("\n");
    sb.append("    expiration: ").append(StringUtil.toIndentedString(expiration)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    megaSignId: ").append(StringUtil.toIndentedString(megaSignId)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(latestVersionId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
