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
import com.adobe.sign.model.workflows.CCsListInfoDescription;
import java.util.Date;
import com.adobe.sign.model.workflows.ExpirationFieldInfoDescription;
import com.adobe.sign.model.workflows.FileInfosDescription;
import java.util.*;
import com.adobe.sign.model.workflows.LocaleFieldInfoDescription;
import com.adobe.sign.model.workflows.MergeFieldInfoDescription;
import com.adobe.sign.model.workflows.PasswordFieldInfoDescription;
import com.adobe.sign.model.workflows.RecipientsListInfoDescription;
import com.adobe.sign.model.workflows.WorkflowDefaultParams;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.173+05:30")
public class WorkflowDescription   {
  
  private WorkflowDefaultParams agreementNameInfo = null;
  private WorkflowDefaultParams authoringInfo = null;
  private List<CCsListInfoDescription> ccsListInfo = null;
  private Date created = null;
  private String description = null;
  private String displayName = null;
  private ExpirationFieldInfoDescription expirationInfo = null;
  private List<FileInfosDescription> fileInfos = null;
  private LocaleFieldInfoDescription localeInfo = null;
  private List<MergeFieldInfoDescription> mergeFieldsInfo = null;
  private WorkflowDefaultParams messageInfo = null;
  private Date modified = null;
  private String name = null;
  private PasswordFieldInfoDescription passwordInfo = null;
  private List<RecipientsListInfoDescription> recipientsListInfo = null;

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

  
  /**
   * Information about name field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about name field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("agreementNameInfo")
  /**
   * @return WorkflowDefaultParams
   **/
  public WorkflowDefaultParams getAgreementNameInfo() {
    return agreementNameInfo;
  }
  /**
   * Information about name field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param agreementNameInfo
   **/
  public void setAgreementNameInfo(WorkflowDefaultParams agreementNameInfo) {
    this.agreementNameInfo = agreementNameInfo;
  }

  
  /**
   * Information about authoringRequested field in SendDocumentInteractiveOptions input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about authoringRequested field in SendDocumentInteractiveOptions input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("authoringInfo")
  /**
   * @return WorkflowDefaultParams
   **/
  public WorkflowDefaultParams getAuthoringInfo() {
    return authoringInfo;
  }
  /**
   * Information about authoringRequested field in SendDocumentInteractiveOptions input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param authoringInfo
   **/
  public void setAuthoringInfo(WorkflowDefaultParams authoringInfo) {
    this.authoringInfo = authoringInfo;
  }

  
  /**
   * Information about CCList input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about CCList input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("ccsListInfo")
  /**
   * @return List&lt;CCsListInfoDescription&gt;
   **/
  public List<CCsListInfoDescription> getCcsListInfo() {
    return ccsListInfo;
  }
  /**
   * Information about CCList input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param ccsListInfo
   **/
  public void setCcsListInfo(List<CCsListInfoDescription> ccsListInfo) {
    this.ccsListInfo = ccsListInfo;
  }

  
  /**
   * The day on which the workflow was created
   **/
  @ApiModelProperty(required = true, value = "The day on which the workflow was created")
  @JsonProperty("created")
  /**
   * @return Date
   **/
  public Date getCreated() {
    return created;
  }
  /**
   * The day on which the workflow was created
   * @param created
   **/
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * Description provided for this workflow at the time of its creation
   **/
  @ApiModelProperty(required = true, value = "Description provided for this workflow at the time of its creation")
  @JsonProperty("description")
  /**
   * @return String
   **/
  public String getDescription() {
    return description;
  }
  /**
   * Description provided for this workflow at the time of its creation
   * @param description
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The display name of the workflow.
   **/
  @ApiModelProperty(required = true, value = "The display name of the workflow.")
  @JsonProperty("displayName")
  /**
   * @return String
   **/
  public String getDisplayName() {
    return displayName;
  }
  /**
   * The display name of the workflow.
   * @param displayName
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * Information about daysUntilSigningDeadline field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about daysUntilSigningDeadline field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("expirationInfo")
  /**
   * @return ExpirationFieldInfoDescription
   **/
  public ExpirationFieldInfoDescription getExpirationInfo() {
    return expirationInfo;
  }
  /**
   * Information about daysUntilSigningDeadline field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param expirationInfo
   **/
  public void setExpirationInfo(ExpirationFieldInfoDescription expirationInfo) {
    this.expirationInfo = expirationInfo;
  }

  
  /**
   * Information about FileInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about FileInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("fileInfos")
  /**
   * @return List&lt;FileInfosDescription&gt;
   **/
  public List<FileInfosDescription> getFileInfos() {
    return fileInfos;
  }
  /**
   * Information about FileInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param fileInfos
   **/
  public void setFileInfos(List<FileInfosDescription> fileInfos) {
    this.fileInfos = fileInfos;
  }

  
  /**
   * Information about locale field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about locale field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("localeInfo")
  /**
   * @return LocaleFieldInfoDescription
   **/
  public LocaleFieldInfoDescription getLocaleInfo() {
    return localeInfo;
  }
  /**
   * Information about locale field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param localeInfo
   **/
  public void setLocaleInfo(LocaleFieldInfoDescription localeInfo) {
    this.localeInfo = localeInfo;
  }

  
  /**
   * Information about customFieldInfos in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about customFieldInfos in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("mergeFieldsInfo")
  /**
   * @return List&lt;MergeFieldInfoDescription&gt;
   **/
  public List<MergeFieldInfoDescription> getMergeFieldsInfo() {
    return mergeFieldsInfo;
  }
  /**
   * Information about customFieldInfos in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param mergeFieldsInfo
   **/
  public void setMergeFieldsInfo(List<MergeFieldInfoDescription> mergeFieldsInfo) {
    this.mergeFieldsInfo = mergeFieldsInfo;
  }

  
  /**
   * Information about message field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about message field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("messageInfo")
  /**
   * @return WorkflowDefaultParams
   **/
  public WorkflowDefaultParams getMessageInfo() {
    return messageInfo;
  }
  /**
   * Information about message field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param messageInfo
   **/
  public void setMessageInfo(WorkflowDefaultParams messageInfo) {
    this.messageInfo = messageInfo;
  }

  
  /**
   * The day on which the workflow was last modified
   **/
  @ApiModelProperty(required = true, value = "The day on which the workflow was last modified")
  @JsonProperty("modified")
  /**
   * @return Date
   **/
  public Date getModified() {
    return modified;
  }
  /**
   * The day on which the workflow was last modified
   * @param modified
   **/
  public void setModified(Date modified) {
    this.modified = modified;
  }

  
  /**
   * The name of the workflow.
   **/
  @ApiModelProperty(required = true, value = "The name of the workflow.")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The name of the workflow.
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Information about openPassword field in SecurityOptions input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about openPassword field in SecurityOptions input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("passwordInfo")
  /**
   * @return PasswordFieldInfoDescription
   **/
  public PasswordFieldInfoDescription getPasswordInfo() {
    return passwordInfo;
  }
  /**
   * Information about openPassword field in SecurityOptions input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param passwordInfo
   **/
  public void setPasswordInfo(PasswordFieldInfoDescription passwordInfo) {
    this.passwordInfo = passwordInfo;
  }

  
  /**
   * Information about RecepientsInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   **/
  @ApiModelProperty(required = true, value = "Information about RecepientsInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
  @JsonProperty("recipientsListInfo")
  /**
   * @return List&lt;RecipientsListInfoDescription&gt;
   **/
  public List<RecipientsListInfoDescription> getRecipientsListInfo() {
    return recipientsListInfo;
  }
  /**
   * Information about RecepientsInfo input field in the agreement creation request when using the API to create an agreement in a workflow
   * @param recipientsListInfo
   **/
  public void setRecipientsListInfo(List<RecipientsListInfoDescription> recipientsListInfo) {
    this.recipientsListInfo = recipientsListInfo;
  }

  
  /**
   * The workflow scope (ACCOUNT or GROUP or OTHER)
   **/
  @ApiModelProperty(required = true, value = "The workflow scope (ACCOUNT or GROUP or OTHER)")
  @JsonProperty("scope")
  /**
   * @return ScopeEnum
   **/
  public ScopeEnum getScope() {
    return scope;
  }
  /**
   * The workflow scope (ACCOUNT or GROUP or OTHER)
   * @param scope
   **/
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  
  /**
   * Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.
   **/
  @ApiModelProperty(value = "Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.")
  @JsonProperty("scopeId")
  /**
   * @return String
   **/
  public String getScopeId() {
    return scopeId;
  }
  /**
   * Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.
   * @param scopeId
   **/
  public void setScopeId(String scopeId) {
    this.scopeId = scopeId;
  }

  
  /**
   * The workflow status (ACTIVE or DRAFT or OTHER)
   **/
  @ApiModelProperty(required = true, value = "The workflow status (ACTIVE or DRAFT or OTHER)")
  @JsonProperty("status")
  /**
   * @return StatusEnum
   **/
  public StatusEnum getStatus() {
    return status;
  }
  /**
   * The workflow status (ACTIVE or DRAFT or OTHER)
   * @param status
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDescription {\n");
    
    sb.append("    agreementNameInfo: ").append(StringUtil.toIndentedString(agreementNameInfo)).append("\n");
    sb.append("    authoringInfo: ").append(StringUtil.toIndentedString(authoringInfo)).append("\n");
    sb.append("    ccsListInfo: ").append(StringUtil.toIndentedString(ccsListInfo)).append("\n");
    sb.append("    created: ").append(StringUtil.toIndentedString(created)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(StringUtil.toIndentedString(displayName)).append("\n");
    sb.append("    expirationInfo: ").append(StringUtil.toIndentedString(expirationInfo)).append("\n");
    sb.append("    fileInfos: ").append(StringUtil.toIndentedString(fileInfos)).append("\n");
    sb.append("    localeInfo: ").append(StringUtil.toIndentedString(localeInfo)).append("\n");
    sb.append("    mergeFieldsInfo: ").append(StringUtil.toIndentedString(mergeFieldsInfo)).append("\n");
    sb.append("    messageInfo: ").append(StringUtil.toIndentedString(messageInfo)).append("\n");
    sb.append("    modified: ").append(StringUtil.toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    passwordInfo: ").append(StringUtil.toIndentedString(passwordInfo)).append("\n");
    sb.append("    recipientsListInfo: ").append(StringUtil.toIndentedString(recipientsListInfo)).append("\n");
    sb.append("    scope: ").append(StringUtil.toIndentedString(scope)).append("\n");
    sb.append("    scopeId: ").append(StringUtil.toIndentedString(scopeId)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
