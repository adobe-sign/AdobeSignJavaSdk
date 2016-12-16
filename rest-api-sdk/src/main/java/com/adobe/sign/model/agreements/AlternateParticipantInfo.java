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
public class AlternateParticipantInfo   {
  
  private String countryCode = null;
  private String email = null;
  private String phone = null;
  private String privateMessage = null;

  
  /**
   * The country code for the alternate participant
   **/
  @ApiModelProperty(value = "The country code for the alternate participant")
  @JsonProperty("countryCode")
  /**
   * @return String
   **/
  public String getCountryCode() {
    return countryCode;
  }
  /**
   * The country code for the alternate participant
   * @param countryCode
   **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * The email of the alternate participant. This is required if fax is not provided. Both fax and email can not be provided
   **/
  @ApiModelProperty(required = true, value = "The email of the alternate participant. This is required if fax is not provided. Both fax and email can not be provided")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * The email of the alternate participant. This is required if fax is not provided. Both fax and email can not be provided
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The phone number for the alternate participant
   **/
  @ApiModelProperty(value = "The phone number for the alternate participant")
  @JsonProperty("phone")
  /**
   * @return String
   **/
  public String getPhone() {
    return phone;
  }
  /**
   * The phone number for the alternate participant
   * @param phone
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * The private message for the alternate participant
   **/
  @ApiModelProperty(required = true, value = "The private message for the alternate participant")
  @JsonProperty("privateMessage")
  /**
   * @return String
   **/
  public String getPrivateMessage() {
    return privateMessage;
  }
  /**
   * The private message for the alternate participant
   * @param privateMessage
   **/
  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternateParticipantInfo {\n");
    
    sb.append("    countryCode: ").append(StringUtil.toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("    privateMessage: ").append(StringUtil.toIndentedString(privateMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
