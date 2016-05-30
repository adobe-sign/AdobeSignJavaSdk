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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A JSON  that contains both the id of the newly created agreement and URL / embedded code to direct the user to tne next step in the creation process.
 **/
@ApiModel(description = "A JSON  that contains both the id of the newly created agreement and URL / embedded code to direct the user to tne next step in the creation process.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class AgreementCreationResponse   {
  
  private String agreementId = null;
  private String embeddedCode = null;
  private Date expiration = null;
  private String url = null;

  
  /**
   * The unique identifier that can be used to query status and download signed documents
   **/
  @ApiModelProperty(required = true, value = "The unique identifier that can be used to query status and download signed documents")
  @JsonProperty("agreementId")
  public String getAgreementId() {
    return agreementId;
  }
  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  
  /**
   * Javascript snippet suitable for an embedded page taking a user to a URL
   **/
  @ApiModelProperty(value = "Javascript snippet suitable for an embedded page taking a user to a URL")
  @JsonProperty("embeddedCode")
  public String getEmbeddedCode() {
    return embeddedCode;
  }
  public void setEmbeddedCode(String embeddedCode) {
    this.embeddedCode = embeddedCode;
  }

  
  /**
   * Expiration date for autologin. This is based on the user setting, API_AUTO_LOGIN_LIFETIME
   **/
  @ApiModelProperty(value = "Expiration date for autologin. This is based on the user setting, API_AUTO_LOGIN_LIFETIME")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   * Standalone URL to direct end users to
   **/
  @ApiModelProperty(value = "Standalone URL to direct end users to")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementCreationResponse {\n");
    
    sb.append("    agreementId: ").append(StringUtil.toIndentedString(agreementId)).append("\n");
    sb.append("    embeddedCode: ").append(StringUtil.toIndentedString(embeddedCode)).append("\n");
    sb.append("    expiration: ").append(StringUtil.toIndentedString(expiration)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
