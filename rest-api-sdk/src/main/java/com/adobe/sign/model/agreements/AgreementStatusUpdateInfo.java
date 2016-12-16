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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class AgreementStatusUpdateInfo   {
  
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
   * An optional comment describing to the recipient why you want to cancel the transaction
   **/
  @ApiModelProperty(value = "An optional comment describing to the recipient why you want to cancel the transaction")
  @JsonProperty("comment")
  /**
   * @return String
   **/
  public String getComment() {
    return comment;
  }
  /**
   * An optional comment describing to the recipient why you want to cancel the transaction
   * @param comment
   **/
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   * Whether or not you would like the recipient to be notified that the transaction has been cancelled. The notification is mandatory if any party has already signed this document. The default value is false
   **/
  @ApiModelProperty(value = "Whether or not you would like the recipient to be notified that the transaction has been cancelled. The notification is mandatory if any party has already signed this document. The default value is false")
  @JsonProperty("notifySigner")
  /**
   * @return Boolean
   **/
  public Boolean getNotifySigner() {
    return notifySigner;
  }
  /**
   * Whether or not you would like the recipient to be notified that the transaction has been cancelled. The notification is mandatory if any party has already signed this document. The default value is false
   * @param notifySigner
   **/
  public void setNotifySigner(Boolean notifySigner) {
    this.notifySigner = notifySigner;
  }

  
  /**
   * The state to which the agreement is to be updated. The only valid state for this variable is currently, CANCEL
   **/
  @ApiModelProperty(required = true, value = "The state to which the agreement is to be updated. The only valid state for this variable is currently, CANCEL")
  @JsonProperty("value")
  /**
   * @return ValueEnum
   **/
  public ValueEnum getValue() {
    return value;
  }
  /**
   * The state to which the agreement is to be updated. The only valid state for this variable is currently, CANCEL
   * @param value
   **/
  public void setValue(ValueEnum value) {
    this.value = value;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementStatusUpdateInfo {\n");
    
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("    notifySigner: ").append(StringUtil.toIndentedString(notifySigner)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
