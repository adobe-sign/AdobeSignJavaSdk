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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:59.623+05:30")
public class MegaSignStatusUpdateInfo   {
  
  private String comment = null;
  private Boolean notifySigner = null;

public enum ValueEnum {
  CANCEL("CANCEL");

  private String value;

  ValueEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ValueEnum value = null;

  
  /**
   * Comment describing to the recipient why you want to cancel the transaction
   **/
  @ApiModelProperty(value = "Comment describing to the recipient why you want to cancel the transaction")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   * Whether or not you would like the recipient to be notified that the transaction has been cancelled. The default value is false
   **/
  @ApiModelProperty(value = "Whether or not you would like the recipient to be notified that the transaction has been cancelled. The default value is false")
  @JsonProperty("notifySigner")
  public Boolean getNotifySigner() {
    return notifySigner;
  }
  public void setNotifySigner(Boolean notifySigner) {
    this.notifySigner = notifySigner;
  }

  
  /**
   * The state to which the megaSign is to be updated. The only valid state for this variable is currently, CANCEL
   **/
  @ApiModelProperty(required = true, value = "The state to which the megaSign is to be updated. The only valid state for this variable is currently, CANCEL")
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }
  public void setValue(ValueEnum value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSignStatusUpdateInfo {\n");
    
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("    notifySigner: ").append(StringUtil.toIndentedString(notifySigner)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
