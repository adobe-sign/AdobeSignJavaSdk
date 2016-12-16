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

package com.adobe.sign.model.groups;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:32.597+05:30")
public class GroupModificationInfo   {
  
  private String groupName = null;

  
  /**
   * Name of the group
   **/
  @ApiModelProperty(required = true, value = "Name of the group")
  @JsonProperty("groupName")
  /**
   * @return String
   **/
  public String getGroupName() {
    return groupName;
  }
  /**
   * Name of the group
   * @param groupName
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupModificationInfo {\n");
    
    sb.append("    groupName: ").append(StringUtil.toIndentedString(groupName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
