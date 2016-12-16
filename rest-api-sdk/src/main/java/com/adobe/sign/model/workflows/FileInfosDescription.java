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
import java.util.*;
import com.adobe.sign.model.workflows.WorkflowLibraryDocument;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.173+05:30")
public class FileInfosDescription   {
  
  private String label = null;
  private String name = null;
  private Boolean required = null;
  private List<WorkflowLibraryDocument> workflowLibraryDocumentSelectorList = null;

  
  /**
   * Display label of this field for the external users
   **/
  @ApiModelProperty(required = true, value = "Display label of this field for the external users")
  @JsonProperty("label")
  /**
   * @return String
   **/
  public String getLabel() {
    return label;
  }
  /**
   * Display label of this field for the external users
   * @param label
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Name of the fileInfo element
   **/
  @ApiModelProperty(required = true, value = "Name of the fileInfo element")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * Name of the fileInfo element
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether this field is required or optional
   **/
  @ApiModelProperty(required = true, value = "Whether this field is required or optional")
  @JsonProperty("required")
  /**
   * @return Boolean
   **/
  public Boolean getRequired() {
    return required;
  }
  /**
   * Whether this field is required or optional
   * @param required
   **/
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   * A list of workflow library documents out of which one workflow library document can be selected with this fileInfo object
   **/
  @ApiModelProperty(required = true, value = "A list of workflow library documents out of which one workflow library document can be selected with this fileInfo object")
  @JsonProperty("workflowLibraryDocumentSelectorList")
  /**
   * @return List&lt;WorkflowLibraryDocument&gt;
   **/
  public List<WorkflowLibraryDocument> getWorkflowLibraryDocumentSelectorList() {
    return workflowLibraryDocumentSelectorList;
  }
  /**
   * A list of workflow library documents out of which one workflow library document can be selected with this fileInfo object
   * @param workflowLibraryDocumentSelectorList
   **/
  public void setWorkflowLibraryDocumentSelectorList(List<WorkflowLibraryDocument> workflowLibraryDocumentSelectorList) {
    this.workflowLibraryDocumentSelectorList = workflowLibraryDocumentSelectorList;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
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
