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

package com.adobe.sign.model.widgets;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class WidgetVaultingInfo   {
  
  private Boolean enabled = null;

  
  /**
   * For accounts set up for document vaulting and the option to enable per agreement, this determines whether the document is to be vaulted
   **/
  @ApiModelProperty(value = "For accounts set up for document vaulting and the option to enable per agreement, this determines whether the document is to be vaulted")
  @JsonProperty("enabled")
  /**
   * @return Boolean
   **/
  public Boolean getEnabled() {
    return enabled;
  }
  /**
   * For accounts set up for document vaulting and the option to enable per agreement, this determines whether the document is to be vaulted
   * @param enabled
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetVaultingInfo {\n");
    
    sb.append("    enabled: ").append(StringUtil.toIndentedString(enabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
