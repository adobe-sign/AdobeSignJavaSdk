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
import com.adobe.sign.model.agreements.SendThroughWebOptions;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:02.594+05:30")
public class InteractiveOptions   {
  
  private Boolean authoringRequested = null;
  private Boolean autoLoginUser = null;
  private String locale = null;
  private Boolean noChrome = null;
  private Boolean sendThroughWeb = null;
  private SendThroughWebOptions sendThroughWebOptions = null;

  
  /**
   * Indicates that authoring is requested prior to sending the document
   **/
  @ApiModelProperty(value = "Indicates that authoring is requested prior to sending the document")
  @JsonProperty("authoringRequested")
  public Boolean getAuthoringRequested() {
    return authoringRequested;
  }
  public void setAuthoringRequested(Boolean authoringRequested) {
    this.authoringRequested = authoringRequested;
  }

  
  /**
   * If user settings allow, automatically logs the user in
   **/
  @ApiModelProperty(value = "If user settings allow, automatically logs the user in")
  @JsonProperty("autoLoginUser")
  public Boolean getAutoLoginUser() {
    return autoLoginUser;
  }
  public void setAutoLoginUser(Boolean autoLoginUser) {
    this.autoLoginUser = autoLoginUser;
  }

  
  /**
   * The locale in which page returned by this API should be shown in - for example, en_US or fr_FR. In case locale provided by client is not available or no locale is specified, page will be shown in the default language set in the user account
   **/
  @ApiModelProperty(value = "The locale in which page returned by this API should be shown in - for example, en_US or fr_FR. In case locale provided by client is not available or no locale is specified, page will be shown in the default language set in the user account")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Turn off Chrome for the URL generated
   **/
  @ApiModelProperty(value = "Turn off Chrome for the URL generated")
  @JsonProperty("noChrome")
  public Boolean getNoChrome() {
    return noChrome;
  }
  public void setNoChrome(Boolean noChrome) {
    this.noChrome = noChrome;
  }

  
  /**
   * A url to send page will be returned from where the agreement creation needs to be completed. All the parameters provided here will be retained in the send page
   **/
  @ApiModelProperty(value = "A url to send page will be returned from where the agreement creation needs to be completed. All the parameters provided here will be retained in the send page")
  @JsonProperty("sendThroughWeb")
  public Boolean getSendThroughWeb() {
    return sendThroughWeb;
  }
  public void setSendThroughWeb(Boolean sendThroughWeb) {
    this.sendThroughWeb = sendThroughWeb;
  }

  
  /**
   * A JSON object of Type SendThroughWebOptions to customize the sendPage. This one will apply only if sendThroughWeb is set to true
   **/
  @ApiModelProperty(value = "A JSON object of Type SendThroughWebOptions to customize the sendPage. This one will apply only if sendThroughWeb is set to true")
  @JsonProperty("sendThroughWebOptions")
  public SendThroughWebOptions getSendThroughWebOptions() {
    return sendThroughWebOptions;
  }
  public void setSendThroughWebOptions(SendThroughWebOptions sendThroughWebOptions) {
    this.sendThroughWebOptions = sendThroughWebOptions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveOptions {\n");
    
    sb.append("    authoringRequested: ").append(StringUtil.toIndentedString(authoringRequested)).append("\n");
    sb.append("    autoLoginUser: ").append(StringUtil.toIndentedString(autoLoginUser)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    noChrome: ").append(StringUtil.toIndentedString(noChrome)).append("\n");
    sb.append("    sendThroughWeb: ").append(StringUtil.toIndentedString(sendThroughWeb)).append("\n");
    sb.append("    sendThroughWebOptions: ").append(StringUtil.toIndentedString(sendThroughWebOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
