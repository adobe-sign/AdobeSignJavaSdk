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
import com.adobe.sign.model.agreements.RecipientSecurityOption;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:02.594+05:30")
public class RecipientInfo   {
  
  private String email = null;
  private String fax = null;
  private List<RecipientSecurityOption> securityOptions = new ArrayList<RecipientSecurityOption>();

  
  /**
   * Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided
   **/
  @ApiModelProperty(required = true, value = "Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed
   **/
  @ApiModelProperty(required = true, value = "Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  
  /**
   * Security options that apply to the recipient
   **/
  @ApiModelProperty(value = "Security options that apply to the recipient")
  @JsonProperty("securityOptions")
  public List<RecipientSecurityOption> getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(List<RecipientSecurityOption> securityOptions) {
    this.securityOptions = securityOptions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientInfo {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(StringUtil.toIndentedString(fax)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
