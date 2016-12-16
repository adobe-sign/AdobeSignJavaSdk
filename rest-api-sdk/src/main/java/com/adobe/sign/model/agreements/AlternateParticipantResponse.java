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


/**
 * A JSON that contains the id of the newly created alternate participant
 **/
@ApiModel(description = "A JSON that contains the id of the newly created alternate participant")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class AlternateParticipantResponse   {
  
  private String participantId = null;

  
  /**
   * The unique identifier of the alternate participant
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the alternate participant")
  @JsonProperty("participantId")
  /**
   * @return String
   **/
  public String getParticipantId() {
    return participantId;
  }
  /**
   * The unique identifier of the alternate participant
   * @param participantId
   **/
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternateParticipantResponse {\n");
    
    sb.append("    participantId: ").append(StringUtil.toIndentedString(participantId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
