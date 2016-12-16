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

package com.adobe.sign.model.megaSigns;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.898+05:30")
public class RecipientInfo   {
  
  private String email = null;
  private String fax = null;

  
  /**
   * Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided
   **/
  @ApiModelProperty(value = "Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided")
  @JsonProperty("email")
  /**
   * @return String
   **/
  public String getEmail() {
    return email;
  }
  /**
   * Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided
   * @param email
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed
   **/
  @ApiModelProperty(value = "Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed")
  @JsonProperty("fax")
  /**
   * @return String
   **/
  public String getFax() {
    return fax;
  }
  /**
   * Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed
   * @param fax
   **/
  public void setFax(String fax) {
    this.fax = fax;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientInfo {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(StringUtil.toIndentedString(fax)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
