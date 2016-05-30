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
import com.adobe.sign.model.agreements.DocumentImageUrl;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class DocumentImageUrls   {
  
  private List<DocumentImageUrl> documentsImageUrls = new ArrayList<DocumentImageUrl>();
  private List<DocumentImageUrl> supportingDocumentsImageUrls = new ArrayList<DocumentImageUrl>();

  
  /**
   * A list of documents image URLs.
   **/
  @ApiModelProperty(required = true, value = "A list of documents image URLs.")
  @JsonProperty("documentsImageUrls")
  public List<DocumentImageUrl> getDocumentsImageUrls() {
    return documentsImageUrls;
  }
  public void setDocumentsImageUrls(List<DocumentImageUrl> documentsImageUrls) {
    this.documentsImageUrls = documentsImageUrls;
  }

  
  /**
   * A list of supporting document image URLs.
   **/
  @ApiModelProperty(value = "A list of supporting document image URLs.")
  @JsonProperty("supportingDocumentsImageUrls")
  public List<DocumentImageUrl> getSupportingDocumentsImageUrls() {
    return supportingDocumentsImageUrls;
  }
  public void setSupportingDocumentsImageUrls(List<DocumentImageUrl> supportingDocumentsImageUrls) {
    this.supportingDocumentsImageUrls = supportingDocumentsImageUrls;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentImageUrls {\n");
    
    sb.append("    documentsImageUrls: ").append(StringUtil.toIndentedString(documentsImageUrls)).append("\n");
    sb.append("    supportingDocumentsImageUrls: ").append(StringUtil.toIndentedString(supportingDocumentsImageUrls)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
