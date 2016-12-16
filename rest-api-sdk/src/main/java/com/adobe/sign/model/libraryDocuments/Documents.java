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
import java.util.*;
import com.adobe.sign.model.libraryDocuments.OriginalDocument;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.195+05:30")
public class Documents   {
  
  private List<OriginalDocument> documents = null;

  
  /**
   * A list of objects representing the documents
   **/
  @ApiModelProperty(required = true, value = "A list of objects representing the documents")
  @JsonProperty("documents")
  /**
   * @return List&lt;OriginalDocument&gt;
   **/
  public List<OriginalDocument> getDocuments() {
    return documents;
  }
  /**
   * A list of objects representing the documents
   * @param documents
   **/
  public void setDocuments(List<OriginalDocument> documents) {
    this.documents = documents;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documents {\n");
    
    sb.append("    documents: ").append(StringUtil.toIndentedString(documents)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
