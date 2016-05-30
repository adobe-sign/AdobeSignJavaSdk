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
import com.adobe.sign.model.widgets.WidgetCreationInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:57.177+05:30")
public class WidgetCreationRequest   {
  
  private WidgetCreationInfo widgetCreationInfo = null;

  
  /**
   * Information about the widget that you want to create.
   **/
  @ApiModelProperty(required = true, value = "Information about the widget that you want to create.")
  @JsonProperty("widgetCreationInfo")
  public WidgetCreationInfo getWidgetCreationInfo() {
    return widgetCreationInfo;
  }
  public void setWidgetCreationInfo(WidgetCreationInfo widgetCreationInfo) {
    this.widgetCreationInfo = widgetCreationInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetCreationRequest {\n");
    
    sb.append("    widgetCreationInfo: ").append(StringUtil.toIndentedString(widgetCreationInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
