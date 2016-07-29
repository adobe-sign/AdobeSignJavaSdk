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
import com.adobe.sign.model.workflows.WorkflowLibraryDocument;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:09.776+05:30")
public class FileInfosDescription   {
  
  private String label = null;
  private String name = null;
  private Boolean required = null;
  private List<WorkflowLibraryDocument> workflowLibraryDocumentSelectorList = new ArrayList<WorkflowLibraryDocument>();

  
  /**
   * Display label of this field for the external users
   **/
  @ApiModelProperty(required = true, value = "Display label of this field for the external users")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Name of the fileInfo element
   **/
  @ApiModelProperty(required = true, value = "Name of the fileInfo element")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether this field is required or optional
   **/
  @ApiModelProperty(required = true, value = "Whether this field is required or optional")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   * A list of workflow library documents out of which one workflow library document can be selected with this fileInfo object
   **/
  @ApiModelProperty(required = true, value = "A list of workflow library documents out of which one workflow library document can be selected with this fileInfo object")
  @JsonProperty("workflowLibraryDocumentSelectorList")
  public List<WorkflowLibraryDocument> getWorkflowLibraryDocumentSelectorList() {
    return workflowLibraryDocumentSelectorList;
  }
  public void setWorkflowLibraryDocumentSelectorList(List<WorkflowLibraryDocument> workflowLibraryDocumentSelectorList) {
    this.workflowLibraryDocumentSelectorList = workflowLibraryDocumentSelectorList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfosDescription {\n");
    
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    required: ").append(StringUtil.toIndentedString(required)).append("\n");
    sb.append("    workflowLibraryDocumentSelectorList: ").append(StringUtil.toIndentedString(workflowLibraryDocumentSelectorList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
