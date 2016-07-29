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
import com.adobe.sign.model.agreements.URLFileInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:02.594+05:30")
public class FileInfo   {
  
  private URLFileInfo documentURL = null;
  private String libraryDocumentId = null;
  private String libraryDocumentName = null;
  private String transientDocumentId = null;

  
  /**
   * File at a public URL location
   **/
  @ApiModelProperty(value = "File at a public URL location")
  @JsonProperty("documentURL")
  public URLFileInfo getDocumentURL() {
    return documentURL;
  }
  public void setDocumentURL(URLFileInfo documentURL) {
    this.documentURL = documentURL;
  }

  
  /**
   * The ID for a library document that is available to the sender
   **/
  @ApiModelProperty(value = "The ID for a library document that is available to the sender")
  @JsonProperty("libraryDocumentId")
  public String getLibraryDocumentId() {
    return libraryDocumentId;
  }
  public void setLibraryDocumentId(String libraryDocumentId) {
    this.libraryDocumentId = libraryDocumentId;
  }

  
  /**
   * The name of a library document that is available to the sender
   **/
  @ApiModelProperty(value = "The name of a library document that is available to the sender")
  @JsonProperty("libraryDocumentName")
  public String getLibraryDocumentName() {
    return libraryDocumentName;
  }
  public void setLibraryDocumentName(String libraryDocumentName) {
    this.libraryDocumentName = libraryDocumentName;
  }

  
  /**
   * The documentID as returned from the API which creates a transient document
   **/
  @ApiModelProperty(value = "The documentID as returned from the API which creates a transient document")
  @JsonProperty("transientDocumentId")
  public String getTransientDocumentId() {
    return transientDocumentId;
  }
  public void setTransientDocumentId(String transientDocumentId) {
    this.transientDocumentId = transientDocumentId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfo {\n");
    
    sb.append("    documentURL: ").append(StringUtil.toIndentedString(documentURL)).append("\n");
    sb.append("    libraryDocumentId: ").append(StringUtil.toIndentedString(libraryDocumentId)).append("\n");
    sb.append("    libraryDocumentName: ").append(StringUtil.toIndentedString(libraryDocumentName)).append("\n");
    sb.append("    transientDocumentId: ").append(StringUtil.toIndentedString(transientDocumentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
