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

package com.adobe.sign.model.libraryDocuments;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.libraryDocuments.FileInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:05.613+05:30")
public class LibraryDocumentCreationInfo   {
  
  private List<FileInfo> fileInfos = new ArrayList<FileInfo>();

public enum LibrarySharingModeEnum {
  USER("USER"),
  GROUP("GROUP"),
  ACCOUNT("ACCOUNT");

  private String value;

  LibrarySharingModeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private LibrarySharingModeEnum librarySharingMode = null;

public enum LibraryTemplateTypesEnum {
  DOCUMENT("DOCUMENT"),
  FORM_FIELD_LAYER("FORM_FIELD_LAYER");

  private String value;

  LibraryTemplateTypesEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<LibraryTemplateTypesEnum> libraryTemplateTypes = new ArrayList<LibraryTemplateTypesEnum>();
  private String name = null;

  
  /**
   * A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("fileInfos")
  public List<FileInfo> getFileInfos() {
    return fileInfos;
  }
  public void setFileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  
  /**
   * Specifies who should have access to this library document
   **/
  @ApiModelProperty(required = true, value = "Specifies who should have access to this library document")
  @JsonProperty("librarySharingMode")
  public LibrarySharingModeEnum getLibrarySharingMode() {
    return librarySharingMode;
  }
  public void setLibrarySharingMode(LibrarySharingModeEnum librarySharingMode) {
    this.librarySharingMode = librarySharingMode;
  }

  
  /**
   * A list of one or more library template types
   **/
  @ApiModelProperty(required = true, value = "A list of one or more library template types")
  @JsonProperty("libraryTemplateTypes")
  public List<LibraryTemplateTypesEnum> getLibraryTemplateTypes() {
    return libraryTemplateTypes;
  }
  public void setLibraryTemplateTypes(List<LibraryTemplateTypesEnum> libraryTemplateTypes) {
    this.libraryTemplateTypes = libraryTemplateTypes;
  }

  
  /**
   * The name of the agreement that will be used to identify it, in emails and on the website
   **/
  @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryDocumentCreationInfo {\n");
    
    sb.append("    fileInfos: ").append(StringUtil.toIndentedString(fileInfos)).append("\n");
    sb.append("    librarySharingMode: ").append(StringUtil.toIndentedString(librarySharingMode)).append("\n");
    sb.append("    libraryTemplateTypes: ").append(StringUtil.toIndentedString(libraryTemplateTypes)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
