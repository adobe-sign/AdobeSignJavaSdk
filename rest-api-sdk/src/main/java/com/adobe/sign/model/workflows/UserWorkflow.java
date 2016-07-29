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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:09.776+05:30")
public class UserWorkflow   {
  
  private Date created = null;
  private String description = null;
  private String displayName = null;
  private String name = null;

public enum ScopeEnum {
  ACCOUNT("ACCOUNT"),
  GROUP("GROUP");

  private String value;

  ScopeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ScopeEnum scope = null;
  private String scopeId = null;

public enum StatusEnum {
  ACTIVE("ACTIVE"),
  DRAFT("DRAFT"),
  HIDDEN("HIDDEN");

  private String value;

  StatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private StatusEnum status = null;
  private String workflowId = null;

  
  /**
   * The day on which the workflow was created
   **/
  @ApiModelProperty(required = true, value = "The day on which the workflow was created")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * Description provided for this workflow at the time of its creation
   **/
  @ApiModelProperty(required = true, value = "Description provided for this workflow at the time of its creation")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The display name of the workflow.
   **/
  @ApiModelProperty(required = true, value = "The display name of the workflow.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The name of the workflow.
   **/
  @ApiModelProperty(required = true, value = "The name of the workflow.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The workflow scope (ACCOUNT or GROUP or OTHER)
   **/
  @ApiModelProperty(required = true, value = "The workflow scope (ACCOUNT or GROUP or OTHER)")
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  
  /**
   * Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.
   **/
  @ApiModelProperty(value = "Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.")
  @JsonProperty("scopeId")
  public String getScopeId() {
    return scopeId;
  }
  public void setScopeId(String scopeId) {
    this.scopeId = scopeId;
  }

  
  /**
   * The workflow status (ACTIVE or DRAFT or OTHER)
   **/
  @ApiModelProperty(required = true, value = "The workflow status (ACTIVE or DRAFT or OTHER)")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The unique identifier of a workflow
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of a workflow")
  @JsonProperty("workflowId")
  public String getWorkflowId() {
    return workflowId;
  }
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWorkflow {\n");
    
    sb.append("    created: ").append(StringUtil.toIndentedString(created)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(StringUtil.toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(StringUtil.toIndentedString(scope)).append("\n");
    sb.append("    scopeId: ").append(StringUtil.toIndentedString(scopeId)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    workflowId: ").append(StringUtil.toIndentedString(workflowId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
