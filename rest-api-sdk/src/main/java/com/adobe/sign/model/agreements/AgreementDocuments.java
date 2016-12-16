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
import com.adobe.sign.model.agreements.Document;
import java.util.*;
import com.adobe.sign.model.agreements.SupportingDocument;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class AgreementDocuments   {
  
  private List<Document> documents = null;
  private List<SupportingDocument> supportingDocuments = null;

  
  /**
   * A list of objects representing the documents
   **/
  @ApiModelProperty(required = true, value = "A list of objects representing the documents")
  @JsonProperty("documents")
  /**
   * @return List&lt;Document&gt;
   **/
  public List<Document> getDocuments() {
    return documents;
  }
  /**
   * A list of objects representing the documents
   * @param documents
   **/
  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  
  /**
   * A list of supporting documents. This is returned only if there are any supporting document in the agreement
   **/
  @ApiModelProperty(value = "A list of supporting documents. This is returned only if there are any supporting document in the agreement")
  @JsonProperty("supportingDocuments")
  /**
   * @return List&lt;SupportingDocument&gt;
   **/
  public List<SupportingDocument> getSupportingDocuments() {
    return supportingDocuments;
  }
  /**
   * A list of supporting documents. This is returned only if there are any supporting document in the agreement
   * @param supportingDocuments
   **/
  public void setSupportingDocuments(List<SupportingDocument> supportingDocuments) {
    this.supportingDocuments = supportingDocuments;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementDocuments {\n");
    
    sb.append("    documents: ").append(StringUtil.toIndentedString(documents)).append("\n");
    sb.append("    supportingDocuments: ").append(StringUtil.toIndentedString(supportingDocuments)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
