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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.906+05:30")
public class ParticipantEmailInfo   {
  
  private String participantEmail = null;

  
  /**
   * The email address of the user to whom the reminder was sent. This may either be the sender or the recipient of the document depending on the selected workflow, and on whose turn it was to sign. In the current release, the reminder is sent to that user that is currently expected to sign a given document
   **/
  @ApiModelProperty(required = true, value = "The email address of the user to whom the reminder was sent. This may either be the sender or the recipient of the document depending on the selected workflow, and on whose turn it was to sign. In the current release, the reminder is sent to that user that is currently expected to sign a given document")
  @JsonProperty("participantEmail")
  /**
   * @return String
   **/
  public String getParticipantEmail() {
    return participantEmail;
  }
  /**
   * The email address of the user to whom the reminder was sent. This may either be the sender or the recipient of the document depending on the selected workflow, and on whose turn it was to sign. In the current release, the reminder is sent to that user that is currently expected to sign a given document
   * @param participantEmail
   **/
  public void setParticipantEmail(String participantEmail) {
    this.participantEmail = participantEmail;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantEmailInfo {\n");
    
    sb.append("    participantEmail: ").append(StringUtil.toIndentedString(participantEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
