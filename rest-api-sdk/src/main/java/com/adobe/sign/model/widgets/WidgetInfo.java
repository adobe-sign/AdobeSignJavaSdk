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
import java.util.*;
import com.adobe.sign.model.widgets.WidgetHistoryEvent;
import com.adobe.sign.model.widgets.WidgetParticipantSetInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class WidgetInfo   {
  
  private List<WidgetHistoryEvent> events = null;
  private String javascript = null;
  private String latestVersionId = null;
  private String locale = null;
  private String message = null;
  private String name = null;
  private List<WidgetParticipantSetInfo> participantSetInfos = null;

public enum SecurityOptionsEnum {
  OPEN_PROTECTED("OPEN_PROTECTED"),
  OTHER("OTHER");

  private String value;

  SecurityOptionsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<SecurityOptionsEnum> securityOptions = null;

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
   * An ordered list of the events in the audit trail of this widget
   **/
  @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this widget")
  @JsonProperty("events")
  /**
   * @return List&lt;WidgetHistoryEvent&gt;
   **/
  public List<WidgetHistoryEvent> getEvents() {
    return events;
  }
  /**
   * An ordered list of the events in the audit trail of this widget
   * @param events
   **/
  public void setEvents(List<WidgetHistoryEvent> events) {
    this.events = events;
  }

  
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
   * An ID which uniquely identifies the current version of the widget
   **/
  @ApiModelProperty(required = true, value = "An ID which uniquely identifies the current version of the widget")
  @JsonProperty("latestVersionId")
  /**
   * @return String
   **/
  public String getLatestVersionId() {
    return latestVersionId;
  }
  /**
   * An ID which uniquely identifies the current version of the widget
   * @param latestVersionId
   **/
  public void setLatestVersionId(String latestVersionId) {
    this.latestVersionId = latestVersionId;
  }

  
  /**
   * The locale associated with this widget - for example, en_US or fr_FR
   **/
  @ApiModelProperty(required = true, value = "The locale associated with this widget - for example, en_US or fr_FR")
  @JsonProperty("locale")
  /**
   * @return String
   **/
  public String getLocale() {
    return locale;
  }
  /**
   * The locale associated with this widget - for example, en_US or fr_FR
   * @param locale
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * The message associated with the widget that the sender has provided
   **/
  @ApiModelProperty(value = "The message associated with the widget that the sender has provided")
  @JsonProperty("message")
  /**
   * @return String
   **/
  public String getMessage() {
    return message;
  }
  /**
   * The message associated with the widget that the sender has provided
   * @param message
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * The widget name specified by the sender
   **/
  @ApiModelProperty(required = true, value = "The widget name specified by the sender")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The widget name specified by the sender
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Information about the participant sets of the widget.
   **/
  @ApiModelProperty(required = true, value = "Information about the participant sets of the widget.")
  @JsonProperty("participantSetInfos")
  /**
   * @return List&lt;WidgetParticipantSetInfo&gt;
   **/
  public List<WidgetParticipantSetInfo> getParticipantSetInfos() {
    return participantSetInfos;
  }
  /**
   * Information about the participant sets of the widget.
   * @param participantSetInfos
   **/
  public void setParticipantSetInfos(List<WidgetParticipantSetInfo> participantSetInfos) {
    this.participantSetInfos = participantSetInfos;
  }

  
  /**
   * Security information about the widget that specifies whether or not a password is required to view and sign the widget
   **/
  @ApiModelProperty(required = true, value = "Security information about the widget that specifies whether or not a password is required to view and sign the widget")
  @JsonProperty("securityOptions")
  /**
   * @return List&lt;SecurityOptionsEnum&gt;
   **/
  public List<SecurityOptionsEnum> getSecurityOptions() {
    return securityOptions;
  }
  /**
   * Security information about the widget that specifies whether or not a password is required to view and sign the widget
   * @param securityOptions
   **/
  public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * The current status of the widget
   **/
  @ApiModelProperty(required = true, value = "The current status of the widget")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * The current status of the widget
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
   * A resource identifier that can be used to uniquely identify the widget in other apis
   **/
  @ApiModelProperty(required = true, value = "A resource identifier that can be used to uniquely identify the widget in other apis")
  @JsonProperty("widgetId")
  /**
   * @return String
   **/
  public String getWidgetId() {
    return widgetId;
  }
  /**
   * A resource identifier that can be used to uniquely identify the widget in other apis
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
    sb.append("class WidgetInfo {\n");
    
    sb.append("    events: ").append(StringUtil.toIndentedString(events)).append("\n");
    sb.append("    javascript: ").append(StringUtil.toIndentedString(javascript)).append("\n");
    sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(latestVersionId)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    participantSetInfos: ").append(StringUtil.toIndentedString(participantSetInfos)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    widgetId: ").append(StringUtil.toIndentedString(widgetId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
