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
public class FileUploadOptions   {
  
  private Boolean libraryDocument = null;
  private Boolean localFile = null;
  private Boolean webConnectors = null;

  
  /**
   * Whether library documents link should appear or not. Default value is taken as true
   **/
  @ApiModelProperty(value = "Whether library documents link should appear or not. Default value is taken as true")
  @JsonProperty("libraryDocument")
  /**
   * @return Boolean
   **/
  public Boolean getLibraryDocument() {
    return libraryDocument;
  }
  /**
   * Whether library documents link should appear or not. Default value is taken as true
   * @param libraryDocument
   **/
  public void setLibraryDocument(Boolean libraryDocument) {
    this.libraryDocument = libraryDocument;
  }

  
  /**
   * Whether local file upload button should appear or not. Default value is taken as true
   **/
  @ApiModelProperty(value = "Whether local file upload button should appear or not. Default value is taken as true")
  @JsonProperty("localFile")
  /**
   * @return Boolean
   **/
  public Boolean getLocalFile() {
    return localFile;
  }
  /**
   * Whether local file upload button should appear or not. Default value is taken as true
   * @param localFile
   **/
  public void setLocalFile(Boolean localFile) {
    this.localFile = localFile;
  }

  
  /**
   * Whether link to attach documents from web sources like Dropbox should appear or not. Default value is taken as true
   **/
  @ApiModelProperty(value = "Whether link to attach documents from web sources like Dropbox should appear or not. Default value is taken as true")
  @JsonProperty("webConnectors")
  /**
   * @return Boolean
   **/
  public Boolean getWebConnectors() {
    return webConnectors;
  }
  /**
   * Whether link to attach documents from web sources like Dropbox should appear or not. Default value is taken as true
   * @param webConnectors
   **/
  public void setWebConnectors(Boolean webConnectors) {
    this.webConnectors = webConnectors;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadOptions {\n");
    
    sb.append("    libraryDocument: ").append(StringUtil.toIndentedString(libraryDocument)).append("\n");
    sb.append("    localFile: ").append(StringUtil.toIndentedString(localFile)).append("\n");
    sb.append("    webConnectors: ").append(StringUtil.toIndentedString(webConnectors)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
