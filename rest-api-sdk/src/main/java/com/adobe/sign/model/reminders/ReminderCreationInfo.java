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

package com.adobe.sign.model.reminders;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:03.983+05:30")
public class ReminderCreationInfo   {
  
  private String agreementId = null;
  private String comment = null;

  
  /**
   * The agreement identifier
   **/
  @ApiModelProperty(required = true, value = "The agreement identifier")
  @JsonProperty("agreementId")
  public String getAgreementId() {
    return agreementId;
  }
  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  
  /**
   * An optional message sent to the recipients, describing what is being sent and why their signatures are required.
   **/
  @ApiModelProperty(value = "An optional message sent to the recipients, describing what is being sent and why their signatures are required.")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReminderCreationInfo {\n");
    
    sb.append("    agreementId: ").append(StringUtil.toIndentedString(agreementId)).append("\n");
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
