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
public class DocumentPageInfo   {
  
  private Double height = null;
  private Integer pageNumber = null;
  private Double rotation = null;
  private Double width = null;

  
  /**
   * Height of the page
   **/
  @ApiModelProperty(required = true, value = "Height of the page")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  
  /**
   * Number of the page in combined document starting from 1.
   **/
  @ApiModelProperty(required = true, value = "Number of the page in combined document starting from 1.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Rotation angle of the page in clockwise direction in degree.
   **/
  @ApiModelProperty(required = true, value = "Rotation angle of the page in clockwise direction in degree.")
  @JsonProperty("rotation")
  public Double getRotation() {
    return rotation;
  }
  public void setRotation(Double rotation) {
    this.rotation = rotation;
  }

  
  /**
   * Width of the page
   **/
  @ApiModelProperty(required = true, value = "Width of the page")
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPageInfo {\n");
    
    sb.append("    height: ").append(StringUtil.toIndentedString(height)).append("\n");
    sb.append("    pageNumber: ").append(StringUtil.toIndentedString(pageNumber)).append("\n");
    sb.append("    rotation: ").append(StringUtil.toIndentedString(rotation)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
