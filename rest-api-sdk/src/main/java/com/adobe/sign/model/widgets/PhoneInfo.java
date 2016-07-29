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
public class PhoneInfo   {
  
  private String countryCode = null;
  private String phone = null;

  
  /**
   * The phoneInfo country code required for the counter signer to view and sign the widget if authentication type is PHONE
   **/
  @ApiModelProperty(value = "The phoneInfo country code required for the counter signer to view and sign the widget if authentication type is PHONE")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * The phoneInfo country code required for the counter signer to view and sign the widget if authentication type is PHONE
   **/
  @ApiModelProperty(required = true, value = "The phoneInfo country code required for the counter signer to view and sign the widget if authentication type is PHONE")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneInfo {\n");
    
    sb.append("    countryCode: ").append(StringUtil.toIndentedString(countryCode)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
