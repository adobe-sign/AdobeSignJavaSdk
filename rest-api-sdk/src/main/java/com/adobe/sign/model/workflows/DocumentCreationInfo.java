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
import com.adobe.sign.model.workflows.CcsInfo;
import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
import com.adobe.sign.model.workflows.FileInfo;
import java.util.*;
import com.adobe.sign.model.workflows.MergefieldInfo;
import com.adobe.sign.model.workflows.PostSignOptions;
import com.adobe.sign.model.workflows.RecipientsInfo;
import com.adobe.sign.model.workflows.SecurityOption;
import com.adobe.sign.model.workflows.VaultingInfo;
import com.adobe.sign.model.workflows.WorkflowBasedFormField;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:35.173+05:30")
public class DocumentCreationInfo   {
  
  private String callbackInfo = null;
  private List<CcsInfo> ccs = null;
  private Integer daysUntilSigningDeadline = null;
  private List<CustomWorkflowFileInfo> fileInfos = null;
  private List<FileInfo> formFieldLayerTemplates = null;
  private List<WorkflowBasedFormField> formFields = null;
  private String locale = null;
  private List<MergefieldInfo> mergeFieldInfo = null;
  private String message = null;
  private String name = null;
  private PostSignOptions postSignOptions = null;
  private List<RecipientsInfo> recipientsListInfo = null;

public enum ReminderFrequencyEnum {
  DAILY_UNTIL_SIGNED("DAILY_UNTIL_SIGNED"),
  WEEKLY_UNTIL_SIGNED("WEEKLY_UNTIL_SIGNED");

  private String value;

  ReminderFrequencyEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ReminderFrequencyEnum reminderFrequency = null;
  private SecurityOption securityOptions = null;
  private VaultingInfo vaultingInfo = null;

  
  /**
   * A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.
   **/
  @ApiModelProperty(value = "A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.")
  @JsonProperty("callbackInfo")
  /**
   * @return String
   **/
  public String getCallbackInfo() {
    return callbackInfo;
  }
  /**
   * A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.
   * @param callbackInfo
   **/
  public void setCallbackInfo(String callbackInfo) {
    this.callbackInfo = callbackInfo;
  }

  
  /**
   * A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file
   **/
  @ApiModelProperty(value = "A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file")
  @JsonProperty("ccs")
  /**
   * @return List&lt;CcsInfo&gt;
   **/
  public List<CcsInfo> getCcs() {
    return ccs;
  }
  /**
   * A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file
   * @param ccs
   **/
  public void setCcs(List<CcsInfo> ccs) {
    this.ccs = ccs;
  }

  
  /**
   * The number of days that remain before the document expires. You cannot sign the document after it expires
   **/
  @ApiModelProperty(value = "The number of days that remain before the document expires. You cannot sign the document after it expires")
  @JsonProperty("daysUntilSigningDeadline")
  /**
   * @return Integer
   **/
  public Integer getDaysUntilSigningDeadline() {
    return daysUntilSigningDeadline;
  }
  /**
   * The number of days that remain before the document expires. You cannot sign the document after it expires
   * @param daysUntilSigningDeadline
   **/
  public void setDaysUntilSigningDeadline(Integer daysUntilSigningDeadline) {
    this.daysUntilSigningDeadline = daysUntilSigningDeadline;
  }

  
  /**
   * A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("fileInfos")
  /**
   * @return List&lt;CustomWorkflowFileInfo&gt;
   **/
  public List<CustomWorkflowFileInfo> getFileInfos() {
    return fileInfos;
  }
  /**
   * A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified
   * @param fileInfos
   **/
  public void setFileInfos(List<CustomWorkflowFileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  
  /**
   * Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(value = "Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("formFieldLayerTemplates")
  /**
   * @return List&lt;FileInfo&gt;
   **/
  public List<FileInfo> getFormFieldLayerTemplates() {
    return formFieldLayerTemplates;
  }
  /**
   * Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified
   * @param formFieldLayerTemplates
   **/
  public void setFormFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
    this.formFieldLayerTemplates = formFieldLayerTemplates;
  }

  
  /**
   * Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported
   **/
  @ApiModelProperty(value = "Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported")
  @JsonProperty("formFields")
  /**
   * @return List&lt;WorkflowBasedFormField&gt;
   **/
  public List<WorkflowBasedFormField> getFormFields() {
    return formFields;
  }
  /**
   * Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported
   * @param formFields
   **/
  public void setFormFields(List<WorkflowBasedFormField> formFields) {
    this.formFields = formFields;
  }

  
  /**
   * The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender
   **/
  @ApiModelProperty(value = "The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
  @JsonProperty("locale")
  /**
   * @return String
   **/
  public String getLocale() {
    return locale;
  }
  /**
   * The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender
   * @param locale
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported
   **/
  @ApiModelProperty(value = "Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
  @JsonProperty("mergeFieldInfo")
  /**
   * @return List&lt;MergefieldInfo&gt;
   **/
  public List<MergefieldInfo> getMergeFieldInfo() {
    return mergeFieldInfo;
  }
  /**
   * Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported
   * @param mergeFieldInfo
   **/
  public void setMergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
    this.mergeFieldInfo = mergeFieldInfo;
  }

  
  /**
   * An optional message to the recipients, describing what is being sent or why their signature is required
   **/
  @ApiModelProperty(value = "An optional message to the recipients, describing what is being sent or why their signature is required")
  @JsonProperty("message")
  /**
   * @return String
   **/
  public String getMessage() {
    return message;
  }
  /**
   * An optional message to the recipients, describing what is being sent or why their signature is required
   * @param message
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * The name of the agreement that will be used to identify it, in emails and on the website
   **/
  @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The name of the agreement that will be used to identify it, in emails and on the website
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * URL and associated properties for the success page the user will be taken to after completing the signing process
   **/
  @ApiModelProperty(value = "URL and associated properties for the success page the user will be taken to after completing the signing process")
  @JsonProperty("postSignOptions")
  /**
   * @return PostSignOptions
   **/
  public PostSignOptions getPostSignOptions() {
    return postSignOptions;
  }
  /**
   * URL and associated properties for the success page the user will be taken to after completing the signing process
   * @param postSignOptions
   **/
  public void setPostSignOptions(PostSignOptions postSignOptions) {
    this.postSignOptions = postSignOptions;
  }

  
  /**
   * A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required
   **/
  @ApiModelProperty(required = true, value = "A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required")
  @JsonProperty("recipientsListInfo")
  /**
   * @return List&lt;RecipientsInfo&gt;
   **/
  public List<RecipientsInfo> getRecipientsListInfo() {
    return recipientsListInfo;
  }
  /**
   * A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required
   * @param recipientsListInfo
   **/
  public void setRecipientsListInfo(List<RecipientsInfo> recipientsListInfo) {
    this.recipientsListInfo = recipientsListInfo;
  }

  
  /**
   * Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED
   **/
  @ApiModelProperty(value = "Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED")
  @JsonProperty("reminderFrequency")
  /**
   * @return ReminderFrequencyEnum
   **/
  public ReminderFrequencyEnum getReminderFrequency() {
    return reminderFrequency;
  }
  /**
   * Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED
   * @param reminderFrequency
   **/
  public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  
  /**
   * Sets optional secondary security parameters for your document
   **/
  @ApiModelProperty(value = "Sets optional secondary security parameters for your document")
  @JsonProperty("securityOptions")
  /**
   * @return SecurityOption
   **/
  public SecurityOption getSecurityOptions() {
    return securityOptions;
  }
  /**
   * Sets optional secondary security parameters for your document
   * @param securityOptions
   **/
  public void setSecurityOptions(SecurityOption securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider
   **/
  @ApiModelProperty(value = "Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
  @JsonProperty("vaultingInfo")
  /**
   * @return VaultingInfo
   **/
  public VaultingInfo getVaultingInfo() {
    return vaultingInfo;
  }
  /**
   * Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider
   * @param vaultingInfo
   **/
  public void setVaultingInfo(VaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreationInfo {\n");
    
    sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(callbackInfo)).append("\n");
    sb.append("    ccs: ").append(StringUtil.toIndentedString(ccs)).append("\n");
    sb.append("    daysUntilSigningDeadline: ").append(StringUtil.toIndentedString(daysUntilSigningDeadline)).append("\n");
    sb.append("    fileInfos: ").append(StringUtil.toIndentedString(fileInfos)).append("\n");
    sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(formFieldLayerTemplates)).append("\n");
    sb.append("    formFields: ").append(StringUtil.toIndentedString(formFields)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(mergeFieldInfo)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    postSignOptions: ").append(StringUtil.toIndentedString(postSignOptions)).append("\n");
    sb.append("    recipientsListInfo: ").append(StringUtil.toIndentedString(recipientsListInfo)).append("\n");
    sb.append("    reminderFrequency: ").append(StringUtil.toIndentedString(reminderFrequency)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(vaultingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
