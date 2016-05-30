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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class FormFieldCondition   {
  
  private String value = null;
  private Integer whenFieldLocationIndex = null;
  private String whenFieldName = null;

  
  /**
   * Value to compare the value of the whenField with, to evaluate the condition
   **/
  @ApiModelProperty(value = "Value to compare the value of the whenField with, to evaluate the condition")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * Index of the location of the whenField whose value is the basis of the condition
   **/
  @ApiModelProperty(value = "Index of the location of the whenField whose value is the basis of the condition")
  @JsonProperty("whenFieldLocationIndex")
  public Integer getWhenFieldLocationIndex() {
    return whenFieldLocationIndex;
  }
  public void setWhenFieldLocationIndex(Integer whenFieldLocationIndex) {
    this.whenFieldLocationIndex = whenFieldLocationIndex;
  }

  
  /**
   * Name of the field whose value is the basis of condition
   **/
  @ApiModelProperty(value = "Name of the field whose value is the basis of condition")
  @JsonProperty("whenFieldName")
  public String getWhenFieldName() {
    return whenFieldName;
  }
  public void setWhenFieldName(String whenFieldName) {
    this.whenFieldName = whenFieldName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldCondition {\n");
    
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    whenFieldLocationIndex: ").append(StringUtil.toIndentedString(whenFieldLocationIndex)).append("\n");
    sb.append("    whenFieldName: ").append(StringUtil.toIndentedString(whenFieldName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
