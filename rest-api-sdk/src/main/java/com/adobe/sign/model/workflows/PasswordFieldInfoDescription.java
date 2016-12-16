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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.173+05:30")
public class PasswordFieldInfoDescription   {
  
  private String defaultValue = null;
  private String label = null;
  private String name = null;
  private Boolean required = null;
  private Boolean visible = null;

  
  /**
   * Default value of the password info field
   **/
  @ApiModelProperty(required = true, value = "Default value of the password info field")
  @JsonProperty("defaultValue")
  /**
   * @return String
   **/
  public String getDefaultValue() {
    return defaultValue;
  }
  /**
   * Default value of the password info field
   * @param defaultValue
   **/
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * Label of password field
   **/
  @ApiModelProperty(required = true, value = "Label of password field")
  @JsonProperty("label")
  /**
   * @return String
   **/
  public String getLabel() {
    return label;
  }
  /**
   * Label of password field
   * @param label
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Name of password field
   **/
  @ApiModelProperty(required = true, value = "Name of password field")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * Name of password field
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether this field is required or optional
   **/
  @ApiModelProperty(required = true, value = "Whether this field is required or optional")
  @JsonProperty("required")
  /**
   * @return Boolean
   **/
  public Boolean getRequired() {
    return required;
  }
  /**
   * Whether this field is required or optional
   * @param required
   **/
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   * Whether password info field is visible on agreement creation page
   **/
  @ApiModelProperty(required = true, value = "Whether password info field is visible on agreement creation page")
  @JsonProperty("visible")
  /**
   * @return Boolean
   **/
  public Boolean getVisible() {
    return visible;
  }
  /**
   * Whether password info field is visible on agreement creation page
   * @param visible
   **/
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordFieldInfoDescription {\n");
    
    sb.append("    defaultValue: ").append(StringUtil.toIndentedString(defaultValue)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    required: ").append(StringUtil.toIndentedString(required)).append("\n");
    sb.append("    visible: ").append(StringUtil.toIndentedString(visible)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
