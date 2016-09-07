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
import java.util.*;
import com.adobe.sign.model.agreements.DocumentPageInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:49.202+05:30")
public class CombinedDocumentPagesInfo   {
  
  private List<DocumentPageInfo> documentPagesInfo = new ArrayList<DocumentPageInfo>();

  
  /**
   * List of basic information of all pages of the combined document of an Agreement.
   **/
  @ApiModelProperty(required = true, value = "List of basic information of all pages of the combined document of an Agreement.")
  @JsonProperty("documentPagesInfo")
  public List<DocumentPageInfo> getDocumentPagesInfo() {
    return documentPagesInfo;
  }
  public void setDocumentPagesInfo(List<DocumentPageInfo> documentPagesInfo) {
    this.documentPagesInfo = documentPagesInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedDocumentPagesInfo {\n");
    
    sb.append("    documentPagesInfo: ").append(StringUtil.toIndentedString(documentPagesInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
