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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:33.916+05:30")
public class AgreementAssetEventPostResponse   {
  
  private String currentPageCursor = null;
  private List<DocumentEventForUser> events = null;
  private String nextPageCursor = null;
  private String searchId = null;

  
  /**
   * The value of the page cursor corresponding to the current page
   **/
  @ApiModelProperty(required = true, value = "The value of the page cursor corresponding to the current page")
  @JsonProperty("currentPageCursor")
  /**
   * @return String
   **/
  public String getCurrentPageCursor() {
    return currentPageCursor;
  }
  /**
   * The value of the page cursor corresponding to the current page
   * @param currentPageCursor
   **/
  public void setCurrentPageCursor(String currentPageCursor) {
    this.currentPageCursor = currentPageCursor;
  }

  
  /**
   * An ordered list of the events in the audit trail of this document
   **/
  @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
  @JsonProperty("events")
  /**
   * @return List&lt;DocumentEventForUser&gt;
   **/
  public List<DocumentEventForUser> getEvents() {
    return events;
  }
  /**
   * An ordered list of the events in the audit trail of this document
   * @param events
   **/
  public void setEvents(List<DocumentEventForUser> events) {
    this.events = events;
  }

  
  /**
   * The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page
   **/
  @ApiModelProperty(required = true, value = "The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page")
  @JsonProperty("nextPageCursor")
  /**
   * @return String
   **/
  public String getNextPageCursor() {
    return nextPageCursor;
  }
  /**
   * The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page
   * @param nextPageCursor
   **/
  public void setNextPageCursor(String nextPageCursor) {
    this.nextPageCursor = nextPageCursor;
  }

  
  /**
   * The search Id corresponding to current search object. This searchId can be used in combination with pageCursors in the API to retrieve search results to fetch the result for further pages
   **/
  @ApiModelProperty(required = true, value = "The search Id corresponding to current search object. This searchId can be used in combination with pageCursors in the API to retrieve search results to fetch the result for further pages")
  @JsonProperty("searchId")
  /**
   * @return String
   **/
  public String getSearchId() {
    return searchId;
  }
  /**
   * The search Id corresponding to current search object. This searchId can be used in combination with pageCursors in the API to retrieve search results to fetch the result for further pages
   * @param searchId
   **/
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAssetEventPostResponse {\n");
    
    sb.append("    currentPageCursor: ").append(StringUtil.toIndentedString(currentPageCursor)).append("\n");
    sb.append("    events: ").append(StringUtil.toIndentedString(events)).append("\n");
    sb.append("    nextPageCursor: ").append(StringUtil.toIndentedString(nextPageCursor)).append("\n");
    sb.append("    searchId: ").append(StringUtil.toIndentedString(searchId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
