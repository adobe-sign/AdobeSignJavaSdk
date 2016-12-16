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

package com.adobe.sign.model.views;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:34.537+05:30")
public class AgreementAssetRequest   {
  
  private String agreementAssetId = null;
  private Boolean autoLogin = null;
  private Boolean noChrome = null;

  
  /**
   * The ID of the agreement asset.
   **/
  @ApiModelProperty(required = true, value = "The ID of the agreement asset.")
  @JsonProperty("agreementAssetId")
  /**
   * @return String
   **/
  public String getAgreementAssetId() {
    return agreementAssetId;
  }
  /**
   * The ID of the agreement asset.
   * @param agreementAssetId
   **/
  public void setAgreementAssetId(String agreementAssetId) {
    this.agreementAssetId = agreementAssetId;
  }

  
  /**
   * Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false
   **/
  @ApiModelProperty(value = "Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false")
  @JsonProperty("autoLogin")
  /**
   * @return Boolean
   **/
  public Boolean getAutoLogin() {
    return autoLogin;
  }
  /**
   * Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false
   * @param autoLogin
   **/
  public void setAutoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
  }

  
  /**
   * No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false
   **/
  @ApiModelProperty(value = "No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false")
  @JsonProperty("noChrome")
  /**
   * @return Boolean
   **/
  public Boolean getNoChrome() {
    return noChrome;
  }
  /**
   * No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false
   * @param noChrome
   **/
  public void setNoChrome(Boolean noChrome) {
    this.noChrome = noChrome;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAssetRequest {\n");
    
    sb.append("    agreementAssetId: ").append(StringUtil.toIndentedString(agreementAssetId)).append("\n");
    sb.append("    autoLogin: ").append(StringUtil.toIndentedString(autoLogin)).append("\n");
    sb.append("    noChrome: ").append(StringUtil.toIndentedString(noChrome)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
