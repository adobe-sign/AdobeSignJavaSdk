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
import com.adobe.sign.model.agreements.RecipientInfo;
import com.adobe.sign.model.agreements.RecipientSecurityOption;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class RecipientSetInfo   {
  
  private String privateMessage = null;
  private List<RecipientInfo> recipientSetMemberInfos = null;
  private String recipientSetName = null;

public enum RecipientSetRoleEnum {
  SIGNER("SIGNER"),
  APPROVER("APPROVER"),
  CERTIFIED_RECIPIENT("CERTIFIED_RECIPIENT"),
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
  private List<RecipientSecurityOption> securityOptions = null;
  private Integer signingOrder = null;

  
  /**
   * Private message for the recipients in the set
   **/
  @ApiModelProperty(value = "Private message for the recipients in the set")
  @JsonProperty("privateMessage")
  /**
   * @return String
   **/
  public String getPrivateMessage() {
    return privateMessage;
  }
  /**
   * Private message for the recipients in the set
   * @param privateMessage
   **/
  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  
  /**
   * Information about the members of the recipient set
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
  @JsonProperty("recipientSetMemberInfos")
  /**
   * @return List&lt;RecipientInfo&gt;
   **/
  public List<RecipientInfo> getRecipientSetMemberInfos() {
    return recipientSetMemberInfos;
  }
  /**
   * Information about the members of the recipient set
   * @param recipientSetMemberInfos
   **/
  public void setRecipientSetMemberInfos(List<RecipientInfo> recipientSetMemberInfos) {
    this.recipientSetMemberInfos = recipientSetMemberInfos;
  }

  
  /**
   * Specify the name of Recipient set. Maximum no of characters in recipient set name is restricted to 255.
   **/
  @ApiModelProperty(value = "Specify the name of Recipient set. Maximum no of characters in recipient set name is restricted to 255.")
  @JsonProperty("recipientSetName")
  /**
   * @return String
   **/
  public String getRecipientSetName() {
    return recipientSetName;
  }
  /**
   * Specify the name of Recipient set. Maximum no of characters in recipient set name is restricted to 255.
   * @param recipientSetName
   **/
  public void setRecipientSetName(String recipientSetName) {
    this.recipientSetName = recipientSetName;
  }

  
  /**
   * Specify the role of recipient set
   **/
  @ApiModelProperty(required = true, value = "Specify the role of recipient set")
  @JsonProperty("recipientSetRole")
  /**
   * @return RecipientSetRoleEnum
   **/
  public RecipientSetRoleEnum getRecipientSetRole() {
    return recipientSetRole;
  }
  /**
   * Specify the role of recipient set
   * @param recipientSetRole
   **/
  public void setRecipientSetRole(RecipientSetRoleEnum recipientSetRole) {
    this.recipientSetRole = recipientSetRole;
  }

  
  /**
   * Security options that apply to the recipient
   **/
  @ApiModelProperty(value = "Security options that apply to the recipient")
  @JsonProperty("securityOptions")
  /**
   * @return List&lt;RecipientSecurityOption&gt;
   **/
  public List<RecipientSecurityOption> getSecurityOptions() {
    return securityOptions;
  }
  /**
   * Security options that apply to the recipient
   * @param securityOptions
   **/
  public void setSecurityOptions(List<RecipientSecurityOption> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Index indicating sequential signing group (specify for hybrid routing)
   **/
  @ApiModelProperty(value = "Index indicating sequential signing group (specify for hybrid routing)")
  @JsonProperty("signingOrder")
  /**
   * @return Integer
   **/
  public Integer getSigningOrder() {
    return signingOrder;
  }
  /**
   * Index indicating sequential signing group (specify for hybrid routing)
   * @param signingOrder
   **/
  public void setSigningOrder(Integer signingOrder) {
    this.signingOrder = signingOrder;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSetInfo {\n");
    
    sb.append("    privateMessage: ").append(StringUtil.toIndentedString(privateMessage)).append("\n");
    sb.append("    recipientSetMemberInfos: ").append(StringUtil.toIndentedString(recipientSetMemberInfos)).append("\n");
    sb.append("    recipientSetName: ").append(StringUtil.toIndentedString(recipientSetName)).append("\n");
    sb.append("    recipientSetRole: ").append(StringUtil.toIndentedString(recipientSetRole)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    signingOrder: ").append(StringUtil.toIndentedString(signingOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
