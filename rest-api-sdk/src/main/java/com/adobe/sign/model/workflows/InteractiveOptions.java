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

package com.adobe.sign.model.workflows;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.173+05:30")
public class InteractiveOptions   {
  
  private Boolean authoringRequested = null;
  private Boolean autoLoginUser = null;
  private Boolean noChrome = null;

  
  /**
   * Indicates that authoring is requested prior to sending the document
   **/
  @ApiModelProperty(value = "Indicates that authoring is requested prior to sending the document")
  @JsonProperty("authoringRequested")
  /**
   * @return Boolean
   **/
  public Boolean getAuthoringRequested() {
    return authoringRequested;
  }
  /**
   * Indicates that authoring is requested prior to sending the document
   * @param authoringRequested
   **/
  public void setAuthoringRequested(Boolean authoringRequested) {
    this.authoringRequested = authoringRequested;
  }

  
  /**
   * If user settings allow, automatically logs the user in
   **/
  @ApiModelProperty(value = "If user settings allow, automatically logs the user in")
  @JsonProperty("autoLoginUser")
  /**
   * @return Boolean
   **/
  public Boolean getAutoLoginUser() {
    return autoLoginUser;
  }
  /**
   * If user settings allow, automatically logs the user in
   * @param autoLoginUser
   **/
  public void setAutoLoginUser(Boolean autoLoginUser) {
    this.autoLoginUser = autoLoginUser;
  }

  
  /**
   * Turn off Chrome for the URL generated
   **/
  @ApiModelProperty(value = "Turn off Chrome for the URL generated")
  @JsonProperty("noChrome")
  /**
   * @return Boolean
   **/
  public Boolean getNoChrome() {
    return noChrome;
  }
  /**
   * Turn off Chrome for the URL generated
   * @param noChrome
   **/
  public void setNoChrome(Boolean noChrome) {
    this.noChrome = noChrome;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveOptions {\n");
    
    sb.append("    authoringRequested: ").append(StringUtil.toIndentedString(authoringRequested)).append("\n");
    sb.append("    autoLoginUser: ").append(StringUtil.toIndentedString(autoLoginUser)).append("\n");
    sb.append("    noChrome: ").append(StringUtil.toIndentedString(noChrome)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
