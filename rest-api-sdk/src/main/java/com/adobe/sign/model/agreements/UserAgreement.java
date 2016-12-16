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
import com.adobe.sign.model.agreements.DisplayUserSetInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class UserAgreement   {
  
  private String agreementId = null;
  private Date displayDate = null;
  private List<DisplayUserSetInfo> displayUserSetInfos = null;
  private Boolean esign = null;
  private String latestVersionId = null;
  private String name = null;

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
   * The unique identifier of the agreement
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the agreement")
  @JsonProperty("agreementId")
  /**
   * @return String
   **/
  public String getAgreementId() {
    return agreementId;
  }
  /**
   * The unique identifier of the agreement
   * @param agreementId
   **/
  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  
  /**
   * The display date for the agreement
   **/
  @ApiModelProperty(required = true, value = "The display date for the agreement")
  @JsonProperty("displayDate")
  /**
   * @return Date
   **/
  public Date getDisplayDate() {
    return displayDate;
  }
  /**
   * The display date for the agreement
   * @param displayDate
   **/
  public void setDisplayDate(Date displayDate) {
    this.displayDate = displayDate;
  }

  
  /**
   * The most relevant current user set for the agreement. It is typically the next signer if the agreement is from the current user, or the sender if received from another user
   **/
  @ApiModelProperty(required = true, value = "The most relevant current user set for the agreement. It is typically the next signer if the agreement is from the current user, or the sender if received from another user")
  @JsonProperty("displayUserSetInfos")
  /**
   * @return List&lt;DisplayUserSetInfo&gt;
   **/
  public List<DisplayUserSetInfo> getDisplayUserSetInfos() {
    return displayUserSetInfos;
  }
  /**
   * The most relevant current user set for the agreement. It is typically the next signer if the agreement is from the current user, or the sender if received from another user
   * @param displayUserSetInfos
   **/
  public void setDisplayUserSetInfos(List<DisplayUserSetInfo> displayUserSetInfos) {
    this.displayUserSetInfos = displayUserSetInfos;
  }

  
  /**
   * True if this is an e-sign document
   **/
  @ApiModelProperty(required = true, value = "True if this is an e-sign document")
  @JsonProperty("esign")
  /**
   * @return Boolean
   **/
  public Boolean getEsign() {
    return esign;
  }
  /**
   * True if this is an e-sign document
   * @param esign
   **/
  public void setEsign(Boolean esign) {
    this.esign = esign;
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
   * Name of the Agreement
   **/
  @ApiModelProperty(required = true, value = "Name of the Agreement")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * Name of the Agreement
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The current status of the document from the perspective of the user
   **/
  @ApiModelProperty(required = true, value = "The current status of the document from the perspective of the user")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * The current status of the document from the perspective of the user
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
    sb.append("class UserAgreement {\n");
    
    sb.append("    agreementId: ").append(StringUtil.toIndentedString(agreementId)).append("\n");
    sb.append("    displayDate: ").append(StringUtil.toIndentedString(displayDate)).append("\n");
    sb.append("    displayUserSetInfos: ").append(StringUtil.toIndentedString(displayUserSetInfos)).append("\n");
    sb.append("    esign: ").append(StringUtil.toIndentedString(esign)).append("\n");
    sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(latestVersionId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
