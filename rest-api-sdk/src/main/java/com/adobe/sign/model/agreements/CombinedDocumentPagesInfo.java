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
import com.adobe.sign.model.agreements.DocumentPageInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class CombinedDocumentPagesInfo   {
  
  private List<DocumentPageInfo> documentPagesInfo = null;

  
  /**
   * List of basic information of all pages of the combined document of an Agreement.
   **/
  @ApiModelProperty(required = true, value = "List of basic information of all pages of the combined document of an Agreement.")
  @JsonProperty("documentPagesInfo")
  /**
   * @return List&lt;DocumentPageInfo&gt;
   **/
  public List<DocumentPageInfo> getDocumentPagesInfo() {
    return documentPagesInfo;
  }
  /**
   * List of basic information of all pages of the combined document of an Agreement.
   * @param documentPagesInfo
   **/
  public void setDocumentPagesInfo(List<DocumentPageInfo> documentPagesInfo) {
    this.documentPagesInfo = documentPagesInfo;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedDocumentPagesInfo {\n");
    
    sb.append("    documentPagesInfo: ").append(StringUtil.toIndentedString(documentPagesInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
