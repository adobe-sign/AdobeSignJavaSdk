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
import com.adobe.sign.model.libraryDocuments.DocumentLibraryItem;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:51.876+05:30")
public class DocumentLibraryItems   {
  
  private List<DocumentLibraryItem> libraryDocumentList = new ArrayList<DocumentLibraryItem>();

  
  /**
   * An array of document library items
   **/
  @ApiModelProperty(required = true, value = "An array of document library items")
  @JsonProperty("libraryDocumentList")
  public List<DocumentLibraryItem> getLibraryDocumentList() {
    return libraryDocumentList;
  }
  public void setLibraryDocumentList(List<DocumentLibraryItem> libraryDocumentList) {
    this.libraryDocumentList = libraryDocumentList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentLibraryItems {\n");
    
    sb.append("    libraryDocumentList: ").append(StringUtil.toIndentedString(libraryDocumentList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
