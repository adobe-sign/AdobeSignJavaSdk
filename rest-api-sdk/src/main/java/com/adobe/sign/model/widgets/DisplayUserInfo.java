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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class DisplayUserInfo   {
  
  private String company = null;
  private String email = null;
  private String fullName = null;

  
  /**
   * Displays the name of the company of the user, if available
   **/
  @ApiModelProperty(value = "Displays the name of the company of the user, if available")
  @JsonProperty("company")
  /**
   * @return String
   **/
  public String getCompany() {
    return company;
  }
  /**
   * Displays the name of the company of the user, if available
   * @param company
   **/
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * Displays the email of the user
   **/
  @ApiModelProperty(required = true, value = "Displays the email of the user")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * Displays the email of the user
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Displays the full name of the user, if available.
   **/
  @ApiModelProperty(value = "Displays the full name of the user, if available.")
  @JsonProperty("fullName")
  /**
   * @return String
   **/
  public String getFullName() {
    return fullName;
  }
  /**
   * Displays the full name of the user, if available.
   * @param fullName
   **/
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayUserInfo {\n");
    
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(StringUtil.toIndentedString(fullName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
