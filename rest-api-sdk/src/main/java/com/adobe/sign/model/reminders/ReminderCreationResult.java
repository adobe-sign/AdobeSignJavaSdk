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
import java.util.*;
import com.adobe.sign.model.reminders.ParticipantEmailSetInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.906+05:30")
public class ReminderCreationResult   {
  
  private List<ParticipantEmailSetInfo> participantEmailsSet = null;
  private String result = null;

  
  /**
   * The info of the party (participant sets) that was reminded.
   **/
  @ApiModelProperty(required = true, value = "The info of the party (participant sets) that was reminded.")
  @JsonProperty("participantEmailsSet")
  /**
   * @return List&lt;ParticipantEmailSetInfo&gt;
   **/
  public List<ParticipantEmailSetInfo> getParticipantEmailsSet() {
    return participantEmailsSet;
  }
  /**
   * The info of the party (participant sets) that was reminded.
   * @param participantEmailsSet
   **/
  public void setParticipantEmailsSet(List<ParticipantEmailSetInfo> participantEmailsSet) {
    this.participantEmailsSet = participantEmailsSet;
  }

  
  /**
   * A status value indicating the result of the operation
   **/
  @ApiModelProperty(required = true, value = "A status value indicating the result of the operation")
  @JsonProperty("result")
  /**
   * @return String
   **/
  public String getResult() {
    return result;
  }
  /**
   * A status value indicating the result of the operation
   * @param result
   **/
  public void setResult(String result) {
    this.result = result;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReminderCreationResult {\n");
    
    sb.append("    participantEmailsSet: ").append(StringUtil.toIndentedString(participantEmailsSet)).append("\n");
    sb.append("    result: ").append(StringUtil.toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
