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
import java.util.*;
import com.adobe.sign.model.agreements.SigningUrl;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class SigningUrlSetInfo   {
  
  private List<SigningUrl> signingUrls = null;
  private String signingUrlSetName = null;

  
  /**
   * An array of urls for current signer set.
   **/
  @ApiModelProperty(required = true, value = "An array of urls for current signer set.")
  @JsonProperty("signingUrls")
  /**
   * @return List&lt;SigningUrl&gt;
   **/
  public List<SigningUrl> getSigningUrls() {
    return signingUrls;
  }
  /**
   * An array of urls for current signer set.
   * @param signingUrls
   **/
  public void setSigningUrls(List<SigningUrl> signingUrls) {
    this.signingUrls = signingUrls;
  }

  
  /**
   * The name of the current signer set. Returned only, if the API caller is the sender of agreement
   **/
  @ApiModelProperty(value = "The name of the current signer set. Returned only, if the API caller is the sender of agreement")
  @JsonProperty("signingUrlSetName")
  /**
   * @return String
   **/
  public String getSigningUrlSetName() {
    return signingUrlSetName;
  }
  /**
   * The name of the current signer set. Returned only, if the API caller is the sender of agreement
   * @param signingUrlSetName
   **/
  public void setSigningUrlSetName(String signingUrlSetName) {
    this.signingUrlSetName = signingUrlSetName;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningUrlSetInfo {\n");
    
    sb.append("    signingUrls: ").append(StringUtil.toIndentedString(signingUrls)).append("\n");
    sb.append("    signingUrlSetName: ").append(StringUtil.toIndentedString(signingUrlSetName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
