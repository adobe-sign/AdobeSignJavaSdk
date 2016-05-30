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

package com.adobe.sign.model.workflows;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:02.764+05:30")
public class CustomWorkflowFileInfo   {
  
  private String name = null;
  private String transientDocumentId = null;
  private String workflowLibraryDocumentId = null;

  
  /**
   * Name of file info element
   **/
  @ApiModelProperty(required = true, value = "Name of file info element")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Transient document identifier obtained from the transient document creation API.
   **/
  @ApiModelProperty(required = true, value = "Transient document identifier obtained from the transient document creation API.")
  @JsonProperty("transientDocumentId")
  public String getTransientDocumentId() {
    return transientDocumentId;
  }
  public void setTransientDocumentId(String transientDocumentId) {
    this.transientDocumentId = transientDocumentId;
  }

  
  /**
   * An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request
   **/
  @ApiModelProperty(required = true, value = "An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request")
  @JsonProperty("workflowLibraryDocumentId")
  public String getWorkflowLibraryDocumentId() {
    return workflowLibraryDocumentId;
  }
  public void setWorkflowLibraryDocumentId(String workflowLibraryDocumentId) {
    this.workflowLibraryDocumentId = workflowLibraryDocumentId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWorkflowFileInfo {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    transientDocumentId: ").append(StringUtil.toIndentedString(transientDocumentId)).append("\n");
    sb.append("    workflowLibraryDocumentId: ").append(StringUtil.toIndentedString(workflowLibraryDocumentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
