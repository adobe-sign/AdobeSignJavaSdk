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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:02.764+05:30")
public class FormFieldLocation   {
  
  private Double height = null;
  private Double left = null;
  private Integer pageNumber = null;
  private Double top = null;
  private Double width = null;

  
  /**
   * Height of the form field in pixels
   **/
  @ApiModelProperty(required = true, value = "Height of the form field in pixels")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  
  /**
   * No. of pixels from left of the page for form field placement
   **/
  @ApiModelProperty(required = true, value = "No. of pixels from left of the page for form field placement")
  @JsonProperty("left")
  public Double getLeft() {
    return left;
  }
  public void setLeft(Double left) {
    this.left = left;
  }

  
  /**
   * Number of the page where form field has to be placed, starting from 1.
   **/
  @ApiModelProperty(required = true, value = "Number of the page where form field has to be placed, starting from 1.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * No. of pixels from bottom of the page for form field placement
   **/
  @ApiModelProperty(required = true, value = "No. of pixels from bottom of the page for form field placement")
  @JsonProperty("top")
  public Double getTop() {
    return top;
  }
  public void setTop(Double top) {
    this.top = top;
  }

  
  /**
   * Width of the form field in pixels
   **/
  @ApiModelProperty(required = true, value = "Width of the form field in pixels")
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
    sb.append("class FormFieldLocation {\n");
    
    sb.append("    height: ").append(StringUtil.toIndentedString(height)).append("\n");
    sb.append("    left: ").append(StringUtil.toIndentedString(left)).append("\n");
    sb.append("    pageNumber: ").append(StringUtil.toIndentedString(pageNumber)).append("\n");
    sb.append("    top: ").append(StringUtil.toIndentedString(top)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
