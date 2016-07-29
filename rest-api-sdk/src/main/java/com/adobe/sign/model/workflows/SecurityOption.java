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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:09.776+05:30")
public class SecurityOption   {
  
  private String externalPassword = null;
  private String internalPassword = null;
  private String openPassword = null;
  private Boolean protectOpen = null;

  
  /**
   * The secondary password that will be used to protect signing the document for external signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers
   **/
  @ApiModelProperty(value = "The secondary password that will be used to protect signing the document for external signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers")
  @JsonProperty("externalPassword")
  public String getExternalPassword() {
    return externalPassword;
  }
  public void setExternalPassword(String externalPassword) {
    this.externalPassword = externalPassword;
  }

  
  /**
   * The secondary password that will be used to protect signing the document for internal signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers
   **/
  @ApiModelProperty(value = "The secondary password that will be used to protect signing the document for internal signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers")
  @JsonProperty("internalPassword")
  public String getInternalPassword() {
    return internalPassword;
  }
  public void setInternalPassword(String internalPassword) {
    this.internalPassword = internalPassword;
  }

  
  /**
   * The secondary password that will be used to secure the PDF document. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is used only if protectOpen field is set to true
   **/
  @ApiModelProperty(value = "The secondary password that will be used to secure the PDF document. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is used only if protectOpen field is set to true")
  @JsonProperty("openPassword")
  public String getOpenPassword() {
    return openPassword;
  }
  public void setOpenPassword(String openPassword) {
    this.openPassword = openPassword;
  }

  
  /**
   * If set to true, the document is always be encrypted with this password every time it is sent by email. Recipients need to provide the password to be able to view the PDF files
   **/
  @ApiModelProperty(value = "If set to true, the document is always be encrypted with this password every time it is sent by email. Recipients need to provide the password to be able to view the PDF files")
  @JsonProperty("protectOpen")
  public Boolean getProtectOpen() {
    return protectOpen;
  }
  public void setProtectOpen(Boolean protectOpen) {
    this.protectOpen = protectOpen;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityOption {\n");
    
    sb.append("    externalPassword: ").append(StringUtil.toIndentedString(externalPassword)).append("\n");
    sb.append("    internalPassword: ").append(StringUtil.toIndentedString(internalPassword)).append("\n");
    sb.append("    openPassword: ").append(StringUtil.toIndentedString(openPassword)).append("\n");
    sb.append("    protectOpen: ").append(StringUtil.toIndentedString(protectOpen)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
