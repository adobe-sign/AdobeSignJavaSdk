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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:57.177+05:30")
public class WidgetOriginalDocument   {
  
  private String documentId = null;
  private String mimeType = null;
  private String name = null;
  private Integer numPages = null;

  
  /**
   * Id of the document
   **/
  @ApiModelProperty(required = true, value = "Id of the document")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   * Mime-type of the document
   **/
  @ApiModelProperty(required = true, value = "Mime-type of the document")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  /**
   * Name of the document
   **/
  @ApiModelProperty(required = true, value = "Name of the document")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Number of pages in the document
   **/
  @ApiModelProperty(required = true, value = "Number of pages in the document")
  @JsonProperty("numPages")
  public Integer getNumPages() {
    return numPages;
  }
  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetOriginalDocument {\n");
    
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    mimeType: ").append(StringUtil.toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    numPages: ").append(StringUtil.toIndentedString(numPages)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
