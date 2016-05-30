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


/**
 * A JSON object describing the widget
 **/
@ApiModel(description = "A JSON object describing the widget")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:57.177+05:30")
public class WidgetCreationResponse   {
  
  private String javascript = null;
  private String url = null;
  private String widgetId = null;

  
  /**
   * Javascript snippet suitable for an embedded page taking a user to a URL
   **/
  @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page taking a user to a URL")
  @JsonProperty("javascript")
  public String getJavascript() {
    return javascript;
  }
  public void setJavascript(String javascript) {
    this.javascript = javascript;
  }

  
  /**
   * Standalone URL to direct end users to
   **/
  @ApiModelProperty(required = true, value = "Standalone URL to direct end users to")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The unique identifier of widget which can be used to retrieve the data entered by the signers.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of widget which can be used to retrieve the data entered by the signers.")
  @JsonProperty("widgetId")
  public String getWidgetId() {
    return widgetId;
  }
  public void setWidgetId(String widgetId) {
    this.widgetId = widgetId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetCreationResponse {\n");
    
    sb.append("    javascript: ").append(StringUtil.toIndentedString(javascript)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    widgetId: ").append(StringUtil.toIndentedString(widgetId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
