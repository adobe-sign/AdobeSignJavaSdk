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
import com.adobe.sign.model.agreements.DisplayUserInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class DisplayUserSetInfo   {
  
  private List<DisplayUserInfo> displayUserSetMemberInfos = null;
  private String displayUserSetName = null;

  
  /**
   * Displays the info about user set
   **/
  @ApiModelProperty(required = true, value = "Displays the info about user set")
  @JsonProperty("displayUserSetMemberInfos")
  /**
   * @return List&lt;DisplayUserInfo&gt;
   **/
  public List<DisplayUserInfo> getDisplayUserSetMemberInfos() {
    return displayUserSetMemberInfos;
  }
  /**
   * Displays the info about user set
   * @param displayUserSetMemberInfos
   **/
  public void setDisplayUserSetMemberInfos(List<DisplayUserInfo> displayUserSetMemberInfos) {
    this.displayUserSetMemberInfos = displayUserSetMemberInfos;
  }

  
  /**
   * The name of the display user set. Returned only, if the API caller is the sender of agreement.
   **/
  @ApiModelProperty(value = "The name of the display user set. Returned only, if the API caller is the sender of agreement.")
  @JsonProperty("displayUserSetName")
  /**
   * @return String
   **/
  public String getDisplayUserSetName() {
    return displayUserSetName;
  }
  /**
   * The name of the display user set. Returned only, if the API caller is the sender of agreement.
   * @param displayUserSetName
   **/
  public void setDisplayUserSetName(String displayUserSetName) {
    this.displayUserSetName = displayUserSetName;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayUserSetInfo {\n");
    
    sb.append("    displayUserSetMemberInfos: ").append(StringUtil.toIndentedString(displayUserSetMemberInfos)).append("\n");
    sb.append("    displayUserSetName: ").append(StringUtil.toIndentedString(displayUserSetName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
