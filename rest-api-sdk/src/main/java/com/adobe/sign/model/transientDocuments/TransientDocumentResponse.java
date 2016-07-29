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

package com.adobe.sign.model.transientDocuments;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:11.858+05:30")
public class TransientDocumentResponse   {
  
  private String transientDocumentId = null;

  
  /**
   * The unique identifier of the uploaded document that can be used in an agreement or a megaSign or widget creation call
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the uploaded document that can be used in an agreement or a megaSign or widget creation call")
  @JsonProperty("transientDocumentId")
  public String getTransientDocumentId() {
    return transientDocumentId;
  }
  public void setTransientDocumentId(String transientDocumentId) {
    this.transientDocumentId = transientDocumentId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransientDocumentResponse {\n");
    
    sb.append("    transientDocumentId: ").append(StringUtil.toIndentedString(transientDocumentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
