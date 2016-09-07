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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:57.932+05:30")
public class RecipientsListInfoDescription   {
  
  private Boolean allowfax = null;
  private Boolean allowSender = null;

public enum AuthenticationMethodEnum {
  NONE("NONE"),
  KBA("KBA"),
  PASSWORD("PASSWORD"),
  WEB_IDENTITY("WEB_IDENTITY");

  private String value;

  AuthenticationMethodEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private AuthenticationMethodEnum authenticationMethod = null;
  private String defaultValue = null;
  private Boolean editable = null;
  private String label = null;
  private Integer maxListCount = null;
  private Integer minListCount = null;
  private String name = null;
  private Boolean visible = null;

  
  /**
   * whether fax is allowed or not
   **/
  @ApiModelProperty(required = true, value = "whether fax is allowed or not")
  @JsonProperty("allowfax")
  public Boolean getAllowfax() {
    return allowfax;
  }
  public void setAllowfax(Boolean allowfax) {
    this.allowfax = allowfax;
  }

  
  /**
   * whether sender is allowed as a recipient
   **/
  @ApiModelProperty(required = true, value = "whether sender is allowed as a recipient")
  @JsonProperty("allowSender")
  public Boolean getAllowSender() {
    return allowSender;
  }
  public void setAllowSender(Boolean allowSender) {
    this.allowSender = allowSender;
  }

  
  /**
   * authentication method for the current recipient list to have access to view and sign the document
   **/
  @ApiModelProperty(required = true, value = "authentication method for the current recipient list to have access to view and sign the document")
  @JsonProperty("authenticationMethod")
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }
  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  
  /**
   * A default email or fax number
   **/
  @ApiModelProperty(required = true, value = "A default email or fax number")
  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation
   **/
  @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  
  /**
   * A display text for the workflow user that can be used for the current recipients list
   **/
  @ApiModelProperty(required = true, value = "A display text for the workflow user that can be used for the current recipients list")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * maximum number of entries allowed in the current recipient list
   **/
  @ApiModelProperty(required = true, value = "maximum number of entries allowed in the current recipient list")
  @JsonProperty("maxListCount")
  public Integer getMaxListCount() {
    return maxListCount;
  }
  public void setMaxListCount(Integer maxListCount) {
    this.maxListCount = maxListCount;
  }

  
  /**
   * minimum number of entries allowed in the current recipient list
   **/
  @ApiModelProperty(required = true, value = "minimum number of entries allowed in the current recipient list")
  @JsonProperty("minListCount")
  public Integer getMinListCount() {
    return minListCount;
  }
  public void setMinListCount(Integer minListCount) {
    this.minListCount = minListCount;
  }

  
  /**
   * Name of the current RecipientInfo list
   **/
  @ApiModelProperty(required = true, value = "Name of the current RecipientInfo list")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether current field is visible. If visible attribute for this field is false then this field should not be shown in the agreement creation UI using this workflow to user
   **/
  @ApiModelProperty(required = true, value = "Whether current field is visible. If visible attribute for this field is false then this field should not be shown in the agreement creation UI using this workflow to user")
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientsListInfoDescription {\n");
    
    sb.append("    allowfax: ").append(StringUtil.toIndentedString(allowfax)).append("\n");
    sb.append("    allowSender: ").append(StringUtil.toIndentedString(allowSender)).append("\n");
    sb.append("    authenticationMethod: ").append(StringUtil.toIndentedString(authenticationMethod)).append("\n");
    sb.append("    defaultValue: ").append(StringUtil.toIndentedString(defaultValue)).append("\n");
    sb.append("    editable: ").append(StringUtil.toIndentedString(editable)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    maxListCount: ").append(StringUtil.toIndentedString(maxListCount)).append("\n");
    sb.append("    minListCount: ").append(StringUtil.toIndentedString(minListCount)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    visible: ").append(StringUtil.toIndentedString(visible)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
