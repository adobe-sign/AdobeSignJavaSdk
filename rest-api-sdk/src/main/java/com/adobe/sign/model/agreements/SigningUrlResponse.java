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
import com.adobe.sign.model.agreements.SigningUrlSetInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class SigningUrlResponse   {
  
  private List<SigningUrlSetInfo> signingUrlSetInfos = null;

  
  /**
   * An array of urls for signer sets involved in this agreement.
   **/
  @ApiModelProperty(required = true, value = "An array of urls for signer sets involved in this agreement.")
  @JsonProperty("signingUrlSetInfos")
  /**
   * @return List&lt;SigningUrlSetInfo&gt;
   **/
  public List<SigningUrlSetInfo> getSigningUrlSetInfos() {
    return signingUrlSetInfos;
  }
  /**
   * An array of urls for signer sets involved in this agreement.
   * @param signingUrlSetInfos
   **/
  public void setSigningUrlSetInfos(List<SigningUrlSetInfo> signingUrlSetInfos) {
    this.signingUrlSetInfos = signingUrlSetInfos;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningUrlResponse {\n");
    
    sb.append("    signingUrlSetInfos: ").append(StringUtil.toIndentedString(signingUrlSetInfos)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
