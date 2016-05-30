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

package com.adobe.sign.model.search;

import com.adobe.sign.utils.StringUtil;
import java.util.Date;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:00.811+05:30")
public class AgreementAssetEventRequest   {
  
  private Date endDate = null;

public enum FilterEventsEnum {
  CREATED("CREATED"),
  UPLOADED_BY_SENDER("UPLOADED_BY_SENDER"),
  FAXED_BY_SENDER("FAXED_BY_SENDER"),
  AGREEMENT_MODIFIED("AGREEMENT_MODIFIED"),
  USER_ACK_AGREEMENT_MODIFIED("USER_ACK_AGREEMENT_MODIFIED"),
  PRESIGNED("PRESIGNED"),
  SIGNED("SIGNED"),
  ESIGNED("ESIGNED"),
  DIGSIGNED("DIGSIGNED"),
  APPROVED("APPROVED"),
  OFFLINE_SYNC("OFFLINE_SYNC"),
  FAXIN_RECEIVED("FAXIN_RECEIVED"),
  SIGNATURE_REQUESTED("SIGNATURE_REQUESTED"),
  APPROVAL_REQUESTED("APPROVAL_REQUESTED"),
  RECALLED("RECALLED"),
  REJECTED("REJECTED"),
  EXPIRED("EXPIRED"),
  EXPIRED_AUTOMATICALLY("EXPIRED_AUTOMATICALLY"),
  SHARED("SHARED"),
  EMAIL_VIEWED("EMAIL_VIEWED"),
  AUTO_CANCELLED_CONVERSION_PROBLEM("AUTO_CANCELLED_CONVERSION_PROBLEM"),
  SIGNER_SUGGESTED_CHANGES("SIGNER_SUGGESTED_CHANGES"),
  SENDER_CREATED_NEW_REVISION("SENDER_CREATED_NEW_REVISION"),
  PASSWORD_AUTHENTICATION_FAILED("PASSWORD_AUTHENTICATION_FAILED"),
  KBA_AUTHENTICATION_FAILED("KBA_AUTHENTICATION_FAILED"),
  KBA_AUTHENTICATED("KBA_AUTHENTICATED"),
  WEB_IDENTITY_AUTHENTICATED("WEB_IDENTITY_AUTHENTICATED"),
  WEB_IDENTITY_SPECIFIED("WEB_IDENTITY_SPECIFIED"),
  EMAIL_BOUNCED("EMAIL_BOUNCED"),
  WIDGET_ENABLED("WIDGET_ENABLED"),
  WIDGET_DISABLED("WIDGET_DISABLED"),
  DELEGATED("DELEGATED"),
  AUTO_DELEGATED("AUTO_DELEGATED"),
  REPLACED_SIGNER("REPLACED_SIGNER"),
  VAULTED("VAULTED"),
  DOCUMENTS_DELETED("DOCUMENTS_DELETED"),
  OTHER("OTHER");

  private String value;

  FilterEventsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<FilterEventsEnum> filterEvents = new ArrayList<FilterEventsEnum>();
  private Boolean onlyShowLatestEvent = null;
  private Integer pageSize = null;
  private Date startDate = null;

  
  /**
   * The end of the date range for which events will be returned. Date should be mentioned in YYYY-MM-DDTHH:MM:SS format
   **/
  @ApiModelProperty(required = true, value = "The end of the date range for which events will be returned. Date should be mentioned in YYYY-MM-DDTHH:MM:SS format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * If filterEvents are specified, only those event types will be returned. If filterEvents are not specified, all event types will be returned.The Agreement Event type should be given in form of array like [\"ESIGNED\",\"SIGNED\"]
   **/
  @ApiModelProperty(value = "If filterEvents are specified, only those event types will be returned. If filterEvents are not specified, all event types will be returned.The Agreement Event type should be given in form of array like [\"ESIGNED\",\"SIGNED\"]")
  @JsonProperty("filterEvents")
  public List<FilterEventsEnum> getFilterEvents() {
    return filterEvents;
  }
  public void setFilterEvents(List<FilterEventsEnum> filterEvents) {
    this.filterEvents = filterEvents;
  }

  
  /**
   * If true, only the latest event for any given agreement asset within the specified date range will be returned. If false, all events will be returned
   **/
  @ApiModelProperty(value = "If true, only the latest event for any given agreement asset within the specified date range will be returned. If false, all events will be returned")
  @JsonProperty("onlyShowLatestEvent")
  public Boolean getOnlyShowLatestEvent() {
    return onlyShowLatestEvent;
  }
  public void setOnlyShowLatestEvent(Boolean onlyShowLatestEvent) {
    this.onlyShowLatestEvent = onlyShowLatestEvent;
  }

  
  /**
   * Count of agreement asset events which will be returned in the response. Default page size for the response is 100. Maximum value of page size is 500
   **/
  @ApiModelProperty(value = "Count of agreement asset events which will be returned in the response. Default page size for the response is 100. Maximum value of page size is 500")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * The beginning of the date range for which events will be returned. Date should be mentioned in YYYY-MM-DDTHH:MM:SS format
   **/
  @ApiModelProperty(required = true, value = "The beginning of the date range for which events will be returned. Date should be mentioned in YYYY-MM-DDTHH:MM:SS format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAssetEventRequest {\n");
    
    sb.append("    endDate: ").append(StringUtil.toIndentedString(endDate)).append("\n");
    sb.append("    filterEvents: ").append(StringUtil.toIndentedString(filterEvents)).append("\n");
    sb.append("    onlyShowLatestEvent: ").append(StringUtil.toIndentedString(onlyShowLatestEvent)).append("\n");
    sb.append("    pageSize: ").append(StringUtil.toIndentedString(pageSize)).append("\n");
    sb.append("    startDate: ").append(StringUtil.toIndentedString(startDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
