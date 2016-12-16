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

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class PostSignOptions   {
  
  private Integer redirectDelay = null;
  private String redirectUrl = null;

  
  /**
   * The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page.
   **/
  @ApiModelProperty(value = "The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page.")
  @JsonProperty("redirectDelay")
  /**
   * @return Integer
   **/
  public Integer getRedirectDelay() {
    return redirectDelay;
  }
  /**
   * The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page.
   * @param redirectDelay
   **/
  public void setRedirectDelay(Integer redirectDelay) {
    this.redirectDelay = redirectDelay;
  }

  
  /**
   * A publicly accessible url to which the user will be sent after successfully completing the signing process.
   **/
  @ApiModelProperty(required = true, value = "A publicly accessible url to which the user will be sent after successfully completing the signing process.")
  @JsonProperty("redirectUrl")
  /**
   * @return String
   **/
  public String getRedirectUrl() {
    return redirectUrl;
  }
  /**
   * A publicly accessible url to which the user will be sent after successfully completing the signing process.
   * @param redirectUrl
   **/
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSignOptions {\n");
    
    sb.append("    redirectDelay: ").append(StringUtil.toIndentedString(redirectDelay)).append("\n");
    sb.append("    redirectUrl: ").append(StringUtil.toIndentedString(redirectUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
