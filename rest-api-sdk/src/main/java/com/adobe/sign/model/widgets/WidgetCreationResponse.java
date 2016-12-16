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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class WidgetCreationResponse   {
  
  private String javascript = null;
  private String nextPageEmbeddedCode = null;
  private String nextPageUrl = null;
  private String url = null;
  private String widgetId = null;

  
  /**
   * Javascript snippet suitable for an embedded page taking a user to a URL
   **/
  @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page taking a user to a URL")
  @JsonProperty("javascript")
  /**
   * @return String
   **/
  public String getJavascript() {
    return javascript;
  }
  /**
   * Javascript snippet suitable for an embedded page taking a user to a URL
   * @param javascript
   **/
  public void setJavascript(String javascript) {
    this.javascript = javascript;
  }

  
  /**
   * Javascript snippet suitable for an embedded page of the redirected URL that can be used by widget creators
   **/
  @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page of the redirected URL that can be used by widget creators")
  @JsonProperty("nextPageEmbeddedCode")
  /**
   * @return String
   **/
  public String getNextPageEmbeddedCode() {
    return nextPageEmbeddedCode;
  }
  /**
   * Javascript snippet suitable for an embedded page of the redirected URL that can be used by widget creators
   * @param nextPageEmbeddedCode
   **/
  public void setNextPageEmbeddedCode(String nextPageEmbeddedCode) {
    this.nextPageEmbeddedCode = nextPageEmbeddedCode;
  }

  
  /**
   * Redirect URL once the widget is created
   **/
  @ApiModelProperty(required = true, value = "Redirect URL once the widget is created")
  @JsonProperty("nextPageUrl")
  /**
   * @return String
   **/
  public String getNextPageUrl() {
    return nextPageUrl;
  }
  /**
   * Redirect URL once the widget is created
   * @param nextPageUrl
   **/
  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  
  /**
   * Standalone URL to direct end users to
   **/
  @ApiModelProperty(required = true, value = "Standalone URL to direct end users to")
  @JsonProperty("url")
  /**
   * @return String
   **/
  public String getUrl() {
    return url;
  }
  /**
   * Standalone URL to direct end users to
   * @param url
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The unique identifier of widget which can be used to retrieve the data entered by the signers.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of widget which can be used to retrieve the data entered by the signers.")
  @JsonProperty("widgetId")
  /**
   * @return String
   **/
  public String getWidgetId() {
    return widgetId;
  }
  /**
   * The unique identifier of widget which can be used to retrieve the data entered by the signers.
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
    sb.append("class WidgetCreationResponse {\n");
    
    sb.append("    javascript: ").append(StringUtil.toIndentedString(javascript)).append("\n");
    sb.append("    nextPageEmbeddedCode: ").append(StringUtil.toIndentedString(nextPageEmbeddedCode)).append("\n");
    sb.append("    nextPageUrl: ").append(StringUtil.toIndentedString(nextPageUrl)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    widgetId: ").append(StringUtil.toIndentedString(widgetId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
