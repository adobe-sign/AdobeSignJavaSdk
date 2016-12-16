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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.898+05:30")
public class MegaSign   {
  
  private Date displayDate = null;
  private Boolean esign = null;
  private String megaSignId = null;
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
   * The display date for the MegaSign parent agreement
   **/
  @ApiModelProperty(required = true, value = "The display date for the MegaSign parent agreement")
  @JsonProperty("displayDate")
  /**
   * @return Date
   **/
  public Date getDisplayDate() {
    return displayDate;
  }
  /**
   * The display date for the MegaSign parent agreement
   * @param displayDate
   **/
  public void setDisplayDate(Date displayDate) {
    this.displayDate = displayDate;
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
   * Name of the MegaSign parent agreement
   **/
  @ApiModelProperty(required = true, value = "Name of the MegaSign parent agreement")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * Name of the MegaSign parent agreement
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
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
    sb.append("class MegaSign {\n");
    
    sb.append("    displayDate: ").append(StringUtil.toIndentedString(displayDate)).append("\n");
    sb.append("    esign: ").append(StringUtil.toIndentedString(esign)).append("\n");
    sb.append("    megaSignId: ").append(StringUtil.toIndentedString(megaSignId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
