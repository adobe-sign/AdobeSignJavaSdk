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
import com.adobe.sign.model.widgets.WidgetSignerSecurityOption;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:57.177+05:30")
public class CounterSignerInfo   {
  
  private String email = null;
  private List<WidgetSignerSecurityOption> securityOptions = new ArrayList<WidgetSignerSecurityOption>();

  
  /**
   * Email of the recipient
   **/
  @ApiModelProperty(required = true, value = "Email of the recipient")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Security options that apply to the counter signers
   **/
  @ApiModelProperty(value = "Security options that apply to the counter signers")
  @JsonProperty("securityOptions")
  public List<WidgetSignerSecurityOption> getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(List<WidgetSignerSecurityOption> securityOptions) {
    this.securityOptions = securityOptions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterSignerInfo {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
