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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class SupportingDocument   {
  
  private String displayLabel = null;
  private String fieldName = null;
  private String mimeType = null;
  private Integer numPages = null;
  private String supportingDocumentId = null;

  
  /**
   * Display name of the document
   **/
  @ApiModelProperty(required = true, value = "Display name of the document")
  @JsonProperty("displayLabel")
  /**
   * @return String
   **/
  public String getDisplayLabel() {
    return displayLabel;
  }
  /**
   * Display name of the document
   * @param displayLabel
   **/
  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  
  /**
   * The name of the supporting document field
   **/
  @ApiModelProperty(required = true, value = "The name of the supporting document field")
  @JsonProperty("fieldName")
  /**
   * @return String
   **/
  public String getFieldName() {
    return fieldName;
  }
  /**
   * The name of the supporting document field
   * @param fieldName
   **/
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  
  /**
   * Mime-type of the document
   **/
  @ApiModelProperty(required = true, value = "Mime-type of the document")
  @JsonProperty("mimeType")
  /**
   * @return String
   **/
  public String getMimeType() {
    return mimeType;
  }
  /**
   * Mime-type of the document
   * @param mimeType
   **/
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  /**
   * Number of pages in the document
   **/
  @ApiModelProperty(required = true, value = "Number of pages in the document")
  @JsonProperty("numPages")
  /**
   * @return Integer
   **/
  public Integer getNumPages() {
    return numPages;
  }
  /**
   * Number of pages in the document
   * @param numPages
   **/
  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }

  
  /**
   * Id representing the document
   **/
  @ApiModelProperty(required = true, value = "Id representing the document")
  @JsonProperty("supportingDocumentId")
  /**
   * @return String
   **/
  public String getSupportingDocumentId() {
    return supportingDocumentId;
  }
  /**
   * Id representing the document
   * @param supportingDocumentId
   **/
  public void setSupportingDocumentId(String supportingDocumentId) {
    this.supportingDocumentId = supportingDocumentId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingDocument {\n");
    
    sb.append("    displayLabel: ").append(StringUtil.toIndentedString(displayLabel)).append("\n");
    sb.append("    fieldName: ").append(StringUtil.toIndentedString(fieldName)).append("\n");
    sb.append("    mimeType: ").append(StringUtil.toIndentedString(mimeType)).append("\n");
    sb.append("    numPages: ").append(StringUtil.toIndentedString(numPages)).append("\n");
    sb.append("    supportingDocumentId: ").append(StringUtil.toIndentedString(supportingDocumentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
