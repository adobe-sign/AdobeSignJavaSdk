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
import com.adobe.sign.model.search.DocumentEventForUser;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:55.943+05:30")
public class AgreementAssetEventGetResponse   {
  
  private List<DocumentEventForUser> events = new ArrayList<DocumentEventForUser>();
  private String nextPageCursor = null;

  
  /**
   * An ordered list of the events in the audit trail of this document
   **/
  @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
  @JsonProperty("events")
  public List<DocumentEventForUser> getEvents() {
    return events;
  }
  public void setEvents(List<DocumentEventForUser> events) {
    this.events = events;
  }

  
  /**
   * The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page
   **/
  @ApiModelProperty(required = true, value = "The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page")
  @JsonProperty("nextPageCursor")
  public String getNextPageCursor() {
    return nextPageCursor;
  }
  public void setNextPageCursor(String nextPageCursor) {
    this.nextPageCursor = nextPageCursor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAssetEventGetResponse {\n");
    
    sb.append("    events: ").append(StringUtil.toIndentedString(events)).append("\n");
    sb.append("    nextPageCursor: ").append(StringUtil.toIndentedString(nextPageCursor)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
