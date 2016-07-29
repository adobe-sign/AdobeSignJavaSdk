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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:09.776+05:30")
public class WorkflowLibraryDocument   {
  
  private String label = null;
  private String workflowLibDoc = null;

  
  /**
   * A display text for this form for workflow users
   **/
  @ApiModelProperty(required = true, value = "A display text for this form for workflow users")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request
   **/
  @ApiModelProperty(required = true, value = "An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request")
  @JsonProperty("workflowLibDoc")
  public String getWorkflowLibDoc() {
    return workflowLibDoc;
  }
  public void setWorkflowLibDoc(String workflowLibDoc) {
    this.workflowLibDoc = workflowLibDoc;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowLibraryDocument {\n");
    
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    workflowLibDoc: ").append(StringUtil.toIndentedString(workflowLibDoc)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
