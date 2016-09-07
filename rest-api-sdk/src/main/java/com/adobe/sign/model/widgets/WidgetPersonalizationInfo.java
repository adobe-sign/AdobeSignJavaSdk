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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:50.624+05:30")
public class WidgetPersonalizationInfo   {
  
  private Boolean allowManualVerification = null;
  private String comment = null;
  private String email = null;
  private Date expiration = null;
  private Boolean reusable = null;

  
  /**
   * Not used at this time
   **/
  @ApiModelProperty(value = "Not used at this time")
  @JsonProperty("allowManualVerification")
  public Boolean getAllowManualVerification() {
    return allowManualVerification;
  }
  public void setAllowManualVerification(Boolean allowManualVerification) {
    this.allowManualVerification = allowManualVerification;
  }

  
  /**
   * Comment describing how the API caller established the identity of the signer - will appear in the audit trail.
   **/
  @ApiModelProperty(value = "Comment describing how the API caller established the identity of the signer - will appear in the audit trail.")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   * The email address of the person who will be receiving this widget
   **/
  @ApiModelProperty(required = true, value = "The email address of the person who will be receiving this widget")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Expiration date for the personalization of this widget. After this date, the identity of the signer will not be assumed by Adobe Sign.
   **/
  @ApiModelProperty(value = "Expiration date for the personalization of this widget. After this date, the identity of the signer will not be assumed by Adobe Sign.")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   * Should the intended signer be allowed to sign this widget more than once
   **/
  @ApiModelProperty(value = "Should the intended signer be allowed to sign this widget more than once")
  @JsonProperty("reusable")
  public Boolean getReusable() {
    return reusable;
  }
  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetPersonalizationInfo {\n");
    
    sb.append("    allowManualVerification: ").append(StringUtil.toIndentedString(allowManualVerification)).append("\n");
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    expiration: ").append(StringUtil.toIndentedString(expiration)).append("\n");
    sb.append("    reusable: ").append(StringUtil.toIndentedString(reusable)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
