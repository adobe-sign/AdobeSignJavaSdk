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
import com.adobe.sign.model.agreements.DocumentImageUrl;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class DocumentImageUrls   {
  
  private List<DocumentImageUrl> documentsImageUrls = null;
  private List<DocumentImageUrl> supportingDocumentsImageUrls = null;

  
  /**
   * A list of documents image URLs.
   **/
  @ApiModelProperty(required = true, value = "A list of documents image URLs.")
  @JsonProperty("documentsImageUrls")
  /**
   * @return List&lt;DocumentImageUrl&gt;
   **/
  public List<DocumentImageUrl> getDocumentsImageUrls() {
    return documentsImageUrls;
  }
  /**
   * A list of documents image URLs.
   * @param documentsImageUrls
   **/
  public void setDocumentsImageUrls(List<DocumentImageUrl> documentsImageUrls) {
    this.documentsImageUrls = documentsImageUrls;
  }

  
  /**
   * A list of supporting document image URLs.
   **/
  @ApiModelProperty(value = "A list of supporting document image URLs.")
  @JsonProperty("supportingDocumentsImageUrls")
  /**
   * @return List&lt;DocumentImageUrl&gt;
   **/
  public List<DocumentImageUrl> getSupportingDocumentsImageUrls() {
    return supportingDocumentsImageUrls;
  }
  /**
   * A list of supporting document image URLs.
   * @param supportingDocumentsImageUrls
   **/
  public void setSupportingDocumentsImageUrls(List<DocumentImageUrl> supportingDocumentsImageUrls) {
    this.supportingDocumentsImageUrls = supportingDocumentsImageUrls;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentImageUrls {\n");
    
    sb.append("    documentsImageUrls: ").append(StringUtil.toIndentedString(documentsImageUrls)).append("\n");
    sb.append("    supportingDocumentsImageUrls: ").append(StringUtil.toIndentedString(supportingDocumentsImageUrls)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
