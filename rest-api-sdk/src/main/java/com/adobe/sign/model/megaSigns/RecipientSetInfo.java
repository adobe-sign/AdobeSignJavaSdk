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
import java.util.*;
import com.adobe.sign.model.megaSigns.RecipientInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.898+05:30")
public class RecipientSetInfo   {
  
  private List<RecipientInfo> recipientSetMemberInfos = null;

  
  /**
   * Information about the members of the recipient set
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
  @JsonProperty("recipientSetMemberInfos")
  /**
   * @return List&lt;RecipientInfo&gt;
   **/
  public List<RecipientInfo> getRecipientSetMemberInfos() {
    return recipientSetMemberInfos;
  }
  /**
   * Information about the members of the recipient set
   * @param recipientSetMemberInfos
   **/
  public void setRecipientSetMemberInfos(List<RecipientInfo> recipientSetMemberInfos) {
    this.recipientSetMemberInfos = recipientSetMemberInfos;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSetInfo {\n");
    
    sb.append("    recipientSetMemberInfos: ").append(StringUtil.toIndentedString(recipientSetMemberInfos)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
