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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class NextParticipantInfo   {
  
  private String email = null;
  private String name = null;
  private Date waitingSince = null;

  
  /**
   * The email address of the next participant
   **/
  @ApiModelProperty(required = true, value = "The email address of the next participant")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The name of the next participant, if available
   **/
  @ApiModelProperty(value = "The name of the next participant, if available")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The date since which the document has been waiting for the participant to take action
   **/
  @ApiModelProperty(required = true, value = "The date since which the document has been waiting for the participant to take action")
  @JsonProperty("waitingSince")
  public Date getWaitingSince() {
    return waitingSince;
  }
  public void setWaitingSince(Date waitingSince) {
    this.waitingSince = waitingSince;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextParticipantInfo {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    waitingSince: ").append(StringUtil.toIndentedString(waitingSince)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
