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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
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
  /**
   * @return URLFileInfo
   **/
  public URLFileInfo getDocumentURL() {
    return documentURL;
  }
  /**
   * File at a public URL location
   * @param documentURL
   **/
  public void setDocumentURL(URLFileInfo documentURL) {
    this.documentURL = documentURL;
  }

  
  /**
   * The ID for a library document that is available to the sender
   **/
  @ApiModelProperty(value = "The ID for a library document that is available to the sender")
  @JsonProperty("libraryDocumentId")
  /**
   * @return String
   **/
  public String getLibraryDocumentId() {
    return libraryDocumentId;
  }
  /**
   * The ID for a library document that is available to the sender
   * @param libraryDocumentId
   **/
  public void setLibraryDocumentId(String libraryDocumentId) {
    this.libraryDocumentId = libraryDocumentId;
  }

  
  /**
   * The name of a library document that is available to the sender
   **/
  @ApiModelProperty(value = "The name of a library document that is available to the sender")
  @JsonProperty("libraryDocumentName")
  /**
   * @return String
   **/
  public String getLibraryDocumentName() {
    return libraryDocumentName;
  }
  /**
   * The name of a library document that is available to the sender
   * @param libraryDocumentName
   **/
  public void setLibraryDocumentName(String libraryDocumentName) {
    this.libraryDocumentName = libraryDocumentName;
  }

  
  /**
   * The documentID as returned from the transient document creation API
   **/
  @ApiModelProperty(value = "The documentID as returned from the transient document creation API")
  @JsonProperty("transientDocumentId")
  /**
   * @return String
   **/
  public String getTransientDocumentId() {
    return transientDocumentId;
  }
  /**
   * The documentID as returned from the transient document creation API
   * @param transientDocumentId
   **/
  public void setTransientDocumentId(String transientDocumentId) {
    this.transientDocumentId = transientDocumentId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
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
