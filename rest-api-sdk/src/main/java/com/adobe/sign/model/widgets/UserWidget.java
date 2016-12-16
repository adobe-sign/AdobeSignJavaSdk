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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class UserWidget   {
  
  private String javascript = null;
  private Date modifiedDate = null;
  private String name = null;

public enum StatusEnum {
  ENABLED("ENABLED"),
  DISABLED("DISABLED"),
  ABORTED("ABORTED"),
  OTHER("OTHER");

  private String value;

  StatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private StatusEnum status = null;
  private String url = null;
  private String widgetId = null;

  
  /**
   * The embedded javascript code of the widget
   **/
  @ApiModelProperty(required = true, value = "The embedded javascript code of the widget")
  @JsonProperty("javascript")
  /**
   * @return String
   **/
  public String getJavascript() {
    return javascript;
  }
  /**
   * The embedded javascript code of the widget
   * @param javascript
   **/
  public void setJavascript(String javascript) {
    this.javascript = javascript;
  }

  
  /**
   * The day on which the widget was last modified
   **/
  @ApiModelProperty(required = true, value = "The day on which the widget was last modified")
  @JsonProperty("modifiedDate")
  /**
   * @return Date
   **/
  public Date getModifiedDate() {
    return modifiedDate;
  }
  /**
   * The day on which the widget was last modified
   * @param modifiedDate
   **/
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * The name of the widget.
   **/
  @ApiModelProperty(required = true, value = "The name of the widget.")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The name of the widget.
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The widget status (enabled or disabled or aborted or other)
   **/
  @ApiModelProperty(required = true, value = "The widget status (enabled or disabled or aborted or other)")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * The widget status (enabled or disabled or aborted or other)
   * @param status
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The hosted url of the widget
   **/
  @ApiModelProperty(required = true, value = "The hosted url of the widget")
  @JsonProperty("url")
  /**
   * @return String
   **/
  public String getUrl() {
    return url;
  }
  /**
   * The hosted url of the widget
   * @param url
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The unique identifier of a widget
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of a widget")
  @JsonProperty("widgetId")
  /**
   * @return String
   **/
  public String getWidgetId() {
    return widgetId;
  }
  /**
   * The unique identifier of a widget
   * @param widgetId
   **/
  public void setWidgetId(String widgetId) {
    this.widgetId = widgetId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWidget {\n");
    
    sb.append("    javascript: ").append(StringUtil.toIndentedString(javascript)).append("\n");
    sb.append("    modifiedDate: ").append(StringUtil.toIndentedString(modifiedDate)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    widgetId: ").append(StringUtil.toIndentedString(widgetId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
