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
import com.adobe.sign.model.agreements.RecipientSecurityOption;
import java.util.*;
import com.adobe.sign.model.agreements.RecipientInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:02.594+05:30")
public class RecipientSetInfo   {
  
  private String privateMessage = null;
  private List<RecipientInfo> recipientSetMemberInfos = new ArrayList<RecipientInfo>();

public enum RecipientSetRoleEnum {
  SIGNER("SIGNER"),
  APPROVER("APPROVER"),
  DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
  DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER");

  private String value;

  RecipientSetRoleEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private RecipientSetRoleEnum recipientSetRole = null;
  private List<RecipientSecurityOption> securityOptions = new ArrayList<RecipientSecurityOption>();
  private Integer signingOrder = null;

  
  /**
   * Private message for the recipients in the set
   **/
  @ApiModelProperty(value = "Private message for the recipients in the set")
  @JsonProperty("privateMessage")
  public String getPrivateMessage() {
    return privateMessage;
  }
  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  
  /**
   * Information about the members of the recipient set
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
  @JsonProperty("recipientSetMemberInfos")
  public List<RecipientInfo> getRecipientSetMemberInfos() {
    return recipientSetMemberInfos;
  }
  public void setRecipientSetMemberInfos(List<RecipientInfo> recipientSetMemberInfos) {
    this.recipientSetMemberInfos = recipientSetMemberInfos;
  }

  
  /**
   * Specify the role of recipient set
   **/
  @ApiModelProperty(required = true, value = "Specify the role of recipient set")
  @JsonProperty("recipientSetRole")
  public RecipientSetRoleEnum getRecipientSetRole() {
    return recipientSetRole;
  }
  public void setRecipientSetRole(RecipientSetRoleEnum recipientSetRole) {
    this.recipientSetRole = recipientSetRole;
  }

  
  /**
   * Security options that apply to the recipient
   **/
  @ApiModelProperty(value = "Security options that apply to the recipient")
  @JsonProperty("securityOptions")
  public List<RecipientSecurityOption> getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(List<RecipientSecurityOption> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Index indicating sequential signing group (specify for hybrid routing)
   **/
  @ApiModelProperty(value = "Index indicating sequential signing group (specify for hybrid routing)")
  @JsonProperty("signingOrder")
  public Integer getSigningOrder() {
    return signingOrder;
  }
  public void setSigningOrder(Integer signingOrder) {
    this.signingOrder = signingOrder;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSetInfo {\n");
    
    sb.append("    privateMessage: ").append(StringUtil.toIndentedString(privateMessage)).append("\n");
    sb.append("    recipientSetMemberInfos: ").append(StringUtil.toIndentedString(recipientSetMemberInfos)).append("\n");
    sb.append("    recipientSetRole: ").append(StringUtil.toIndentedString(recipientSetRole)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    signingOrder: ").append(StringUtil.toIndentedString(signingOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
