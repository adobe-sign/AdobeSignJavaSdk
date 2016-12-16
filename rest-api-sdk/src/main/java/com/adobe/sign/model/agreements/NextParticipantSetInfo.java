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
import java.util.*;
import com.adobe.sign.model.agreements.NextParticipantInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class NextParticipantSetInfo   {
  
  private List<NextParticipantInfo> nextParticipantSetMemberInfos = null;
  private String nextParticipantSetName = null;

  
  /**
   * Information about the members of the next participant set
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the next participant set")
  @JsonProperty("nextParticipantSetMemberInfos")
  /**
   * @return List&lt;NextParticipantInfo&gt;
   **/
  public List<NextParticipantInfo> getNextParticipantSetMemberInfos() {
    return nextParticipantSetMemberInfos;
  }
  /**
   * Information about the members of the next participant set
   * @param nextParticipantSetMemberInfos
   **/
  public void setNextParticipantSetMemberInfos(List<NextParticipantInfo> nextParticipantSetMemberInfos) {
    this.nextParticipantSetMemberInfos = nextParticipantSetMemberInfos;
  }

  
  /**
   * The name of the next participant set. Returned only, if the API caller is the sender of agreement.
   **/
  @ApiModelProperty(value = "The name of the next participant set. Returned only, if the API caller is the sender of agreement.")
  @JsonProperty("nextParticipantSetName")
  /**
   * @return String
   **/
  public String getNextParticipantSetName() {
    return nextParticipantSetName;
  }
  /**
   * The name of the next participant set. Returned only, if the API caller is the sender of agreement.
   * @param nextParticipantSetName
   **/
  public void setNextParticipantSetName(String nextParticipantSetName) {
    this.nextParticipantSetName = nextParticipantSetName;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextParticipantSetInfo {\n");
    
    sb.append("    nextParticipantSetMemberInfos: ").append(StringUtil.toIndentedString(nextParticipantSetMemberInfos)).append("\n");
    sb.append("    nextParticipantSetName: ").append(StringUtil.toIndentedString(nextParticipantSetName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
