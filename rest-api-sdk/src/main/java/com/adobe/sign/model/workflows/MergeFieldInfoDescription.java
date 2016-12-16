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
public class MergeFieldInfoDescription   {
  
  private String defaultValue = null;
  private String displayName = null;
  private Boolean editable = null;
  private String fieldName = null;
  private Boolean visible = null;

  
  /**
   * default value of the field if input for this field is not provided and this field is required
   **/
  @ApiModelProperty(required = true, value = "default value of the field if input for this field is not provided and this field is required")
  @JsonProperty("defaultValue")
  /**
   * @return String
   **/
  public String getDefaultValue() {
    return defaultValue;
  }
  /**
   * default value of the field if input for this field is not provided and this field is required
   * @param defaultValue
   **/
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * The display text that can be shown for this custom field
   **/
  @ApiModelProperty(required = true, value = "The display text that can be shown for this custom field")
  @JsonProperty("displayName")
  /**
   * @return String
   **/
  public String getDisplayName() {
    return displayName;
  }
  /**
   * The display text that can be shown for this custom field
   * @param displayName
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation
   **/
  @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
  @JsonProperty("editable")
  /**
   * @return Boolean
   **/
  public Boolean getEditable() {
    return editable;
  }
  /**
   * Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation
   * @param editable
   **/
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  
  /**
   * Name of the custom field in this workflow
   **/
  @ApiModelProperty(required = true, value = "Name of the custom field in this workflow")
  @JsonProperty("fieldName")
  /**
   * @return String
   **/
  public String getFieldName() {
    return fieldName;
  }
  /**
   * Name of the custom field in this workflow
   * @param fieldName
   **/
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  
  /**
   * Whether current field should be visible on agreement creation page. If visible attribute for this field is false then this field should not be shown on the agreement creation page using this workflow
   **/
  @ApiModelProperty(required = true, value = "Whether current field should be visible on agreement creation page. If visible attribute for this field is false then this field should not be shown on the agreement creation page using this workflow")
  @JsonProperty("visible")
  /**
   * @return Boolean
   **/
  public Boolean getVisible() {
    return visible;
  }
  /**
   * Whether current field should be visible on agreement creation page. If visible attribute for this field is false then this field should not be shown on the agreement creation page using this workflow
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
    sb.append("class MergeFieldInfoDescription {\n");
    
    sb.append("    defaultValue: ").append(StringUtil.toIndentedString(defaultValue)).append("\n");
    sb.append("    displayName: ").append(StringUtil.toIndentedString(displayName)).append("\n");
    sb.append("    editable: ").append(StringUtil.toIndentedString(editable)).append("\n");
    sb.append("    fieldName: ").append(StringUtil.toIndentedString(fieldName)).append("\n");
    sb.append("    visible: ").append(StringUtil.toIndentedString(visible)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
