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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:04.202+05:30")
public class WidgetCompletionInfo   {
  
  private Boolean deframe = null;
  private Integer delay = null;
  private String url = null;

  
  /**
   * If deframe is false, the success page will be shown inside the widget frame. If deframe is true, the success page will be shown in the full browser window. Note that if this widget is loaded through javascript returned from this end point, browser security restrictions do not permit automatic redirection in the full browser window, so if deframe is true the user will instead just see a link to the success page. We recommend this scenario be avoided - in other words, setting deframe to false is recommended for this case.
   **/
  @ApiModelProperty(value = "If deframe is false, the success page will be shown inside the widget frame. If deframe is true, the success page will be shown in the full browser window. Note that if this widget is loaded through javascript returned from this end point, browser security restrictions do not permit automatic redirection in the full browser window, so if deframe is true the user will instead just see a link to the success page. We recommend this scenario be avoided - in other words, setting deframe to false is recommended for this case.")
  @JsonProperty("deframe")
  public Boolean getDeframe() {
    return deframe;
  }
  public void setDeframe(Boolean deframe) {
    this.deframe = deframe;
  }

  
  /**
   * The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page. Note that this parameter has no effect for widgets loaded with javascript when deframe is true.
   **/
  @ApiModelProperty(value = "The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page. Note that this parameter has no effect for widgets loaded with javascript when deframe is true.")
  @JsonProperty("delay")
  public Integer getDelay() {
    return delay;
  }
  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  
  /**
   * A publicly accessible url to which the user will be sent after successfully completing the widget. If the URL you provide includes information that allows you to identify the specific transaction, such as your own unique identifier, you can use the browser request to this URL as a callback to notify you that this transaction is completed. In addition, Adobe Sign will append a documentKey parameter to the URL which will contain the Adobe Sign DocumentKey for this signed widget, but only if the sender is the same as the API key user. Your application can use this value to get the form data for this widget.
   **/
  @ApiModelProperty(required = true, value = "A publicly accessible url to which the user will be sent after successfully completing the widget. If the URL you provide includes information that allows you to identify the specific transaction, such as your own unique identifier, you can use the browser request to this URL as a callback to notify you that this transaction is completed. In addition, Adobe Sign will append a documentKey parameter to the URL which will contain the Adobe Sign DocumentKey for this signed widget, but only if the sender is the same as the API key user. Your application can use this value to get the form data for this widget.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetCompletionInfo {\n");
    
    sb.append("    deframe: ").append(StringUtil.toIndentedString(deframe)).append("\n");
    sb.append("    delay: ").append(StringUtil.toIndentedString(delay)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
