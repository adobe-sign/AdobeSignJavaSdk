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
import com.adobe.sign.model.agreements.VaultingInfo;
import com.adobe.sign.model.agreements.RequestFormField;
import com.adobe.sign.model.agreements.FileInfo;
import com.adobe.sign.model.agreements.MergefieldInfo;
import com.adobe.sign.model.agreements.PostSignOptions;
import com.adobe.sign.model.agreements.ExternalId;
import com.adobe.sign.model.agreements.RecipientSetInfo;
import com.adobe.sign.model.agreements.SecurityOption;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:49.202+05:30")
public class DocumentCreationInfo   {
  
  private String callbackInfo = null;
  private List<String> ccs = new ArrayList<String>();
  private Integer daysUntilSigningDeadline = null;
  private ExternalId externalId = null;
  private List<FileInfo> fileInfos = new ArrayList<FileInfo>();
  private List<FileInfo> formFieldLayerTemplates = new ArrayList<FileInfo>();
  private List<RequestFormField> formFields = new ArrayList<RequestFormField>();
  private String locale = null;
  private List<MergefieldInfo> mergeFieldInfo = new ArrayList<MergefieldInfo>();
  private String message = null;
  private String name = null;
  private PostSignOptions postSignOptions = null;
  private List<RecipientSetInfo> recipientSetInfos = new ArrayList<RecipientSetInfo>();

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

public enum SignatureFlowEnum {
  SENDER_SIGNATURE_NOT_REQUIRED("SENDER_SIGNATURE_NOT_REQUIRED"),
  SENDER_SIGNS_LAST("SENDER_SIGNS_LAST"),
  SENDER_SIGNS_FIRST("SENDER_SIGNS_FIRST"),
  SEQUENTIAL("SEQUENTIAL"),
  PARALLEL("PARALLEL"),
  SENDER_SIGNS_ONLY("SENDER_SIGNS_ONLY");

  private String value;

  SignatureFlowEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private SignatureFlowEnum signatureFlow = null;

public enum SignatureTypeEnum {
  ESIGN("ESIGN"),
  WRITTEN("WRITTEN");

  private String value;

  SignatureTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private SignatureTypeEnum signatureType = null;
  private VaultingInfo vaultingInfo = null;

  
  /**
   * A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.
   **/
  @ApiModelProperty(value = "A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.")
  @JsonProperty("callbackInfo")
  public String getCallbackInfo() {
    return callbackInfo;
  }
  public void setCallbackInfo(String callbackInfo) {
    this.callbackInfo = callbackInfo;
  }

  
  /**
   * A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file
   **/
  @ApiModelProperty(value = "A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file")
  @JsonProperty("ccs")
  public List<String> getCcs() {
    return ccs;
  }
  public void setCcs(List<String> ccs) {
    this.ccs = ccs;
  }

  
  /**
   * The number of days that remain before the document expires. You cannot sign the document after it expires
   **/
  @ApiModelProperty(value = "The number of days that remain before the document expires. You cannot sign the document after it expires")
  @JsonProperty("daysUntilSigningDeadline")
  public Integer getDaysUntilSigningDeadline() {
    return daysUntilSigningDeadline;
  }
  public void setDaysUntilSigningDeadline(Integer daysUntilSigningDeadline) {
    this.daysUntilSigningDeadline = daysUntilSigningDeadline;
  }

  
  /**
   * A unique identifier for your transaction from an external system. You can use the ExternalID to search for your transaction through API
   **/
  @ApiModelProperty(value = "A unique identifier for your transaction from an external system. You can use the ExternalID to search for your transaction through API")
  @JsonProperty("externalId")
  public ExternalId getExternalId() {
    return externalId;
  }
  public void setExternalId(ExternalId externalId) {
    this.externalId = externalId;
  }

  
  /**
   * A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("fileInfos")
  public List<FileInfo> getFileInfos() {
    return fileInfos;
  }
  public void setFileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  
  /**
   * Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(value = "Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("formFieldLayerTemplates")
  public List<FileInfo> getFormFieldLayerTemplates() {
    return formFieldLayerTemplates;
  }
  public void setFormFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
    this.formFieldLayerTemplates = formFieldLayerTemplates;
  }

  
  /**
   * Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported
   **/
  @ApiModelProperty(value = "Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported")
  @JsonProperty("formFields")
  public List<RequestFormField> getFormFields() {
    return formFields;
  }
  public void setFormFields(List<RequestFormField> formFields) {
    this.formFields = formFields;
  }

  
  /**
   * The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender
   **/
  @ApiModelProperty(value = "The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported
   **/
  @ApiModelProperty(value = "Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
  @JsonProperty("mergeFieldInfo")
  public List<MergefieldInfo> getMergeFieldInfo() {
    return mergeFieldInfo;
  }
  public void setMergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
    this.mergeFieldInfo = mergeFieldInfo;
  }

  
  /**
   * An optional message to the recipients, describing what is being sent or why their signature is required
   **/
  @ApiModelProperty(value = "An optional message to the recipients, describing what is being sent or why their signature is required")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * The name of the agreement that will be used to identify it, in emails and on the website
   **/
  @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * URL and associated properties for the success page the user will be taken to after completing the signing process
   **/
  @ApiModelProperty(value = "URL and associated properties for the success page the user will be taken to after completing the signing process")
  @JsonProperty("postSignOptions")
  public PostSignOptions getPostSignOptions() {
    return postSignOptions;
  }
  public void setPostSignOptions(PostSignOptions postSignOptions) {
    this.postSignOptions = postSignOptions;
  }

  
  /**
   * A list of one or more recipient sets. A recipient set may have one or more recipients. If any member of the recipient set signs, the agreement is considered signed by the recipient set. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required. Note: If signatureFlow is set to SENDER_SIGNS_ONLY, this parameter is optional
   **/
  @ApiModelProperty(required = true, value = "A list of one or more recipient sets. A recipient set may have one or more recipients. If any member of the recipient set signs, the agreement is considered signed by the recipient set. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required. Note: If signatureFlow is set to SENDER_SIGNS_ONLY, this parameter is optional")
  @JsonProperty("recipientSetInfos")
  public List<RecipientSetInfo> getRecipientSetInfos() {
    return recipientSetInfos;
  }
  public void setRecipientSetInfos(List<RecipientSetInfo> recipientSetInfos) {
    this.recipientSetInfos = recipientSetInfos;
  }

  
  /**
   * Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED
   **/
  @ApiModelProperty(value = "Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED")
  @JsonProperty("reminderFrequency")
  public ReminderFrequencyEnum getReminderFrequency() {
    return reminderFrequency;
  }
  public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  
  /**
   * Sets optional secondary security parameters for your document
   **/
  @ApiModelProperty(value = "Sets optional secondary security parameters for your document")
  @JsonProperty("securityOptions")
  public SecurityOption getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(SecurityOption securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Selects the workflow you would like to use - whether the sender needs to sign only, before the recipient, after the recipient, or not at all. The possible values for this variable are SENDER_SIGNATURE_NOT_REQUIRED, SENDER_SIGNS_LAST, SENDER_SIGNS_FIRST, SEQUENTIAL, PARALLEL or SENDER_SIGNS_ONLY. Note: leave unspecified for hybrid routing
   **/
  @ApiModelProperty(value = "Selects the workflow you would like to use - whether the sender needs to sign only, before the recipient, after the recipient, or not at all. The possible values for this variable are SENDER_SIGNATURE_NOT_REQUIRED, SENDER_SIGNS_LAST, SENDER_SIGNS_FIRST, SEQUENTIAL, PARALLEL or SENDER_SIGNS_ONLY. Note: leave unspecified for hybrid routing")
  @JsonProperty("signatureFlow")
  public SignatureFlowEnum getSignatureFlow() {
    return signatureFlow;
  }
  public void setSignatureFlow(SignatureFlowEnum signatureFlow) {
    this.signatureFlow = signatureFlow;
  }

  
  /**
   * Specifies the type of signature you would like to request - written or e-signature. The possible values are ESIGN or WRITTEN
   **/
  @ApiModelProperty(required = true, value = "Specifies the type of signature you would like to request - written or e-signature. The possible values are ESIGN or WRITTEN")
  @JsonProperty("signatureType")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }
  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  
  /**
   * Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider
   **/
  @ApiModelProperty(value = "Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
  @JsonProperty("vaultingInfo")
  public VaultingInfo getVaultingInfo() {
    return vaultingInfo;
  }
  public void setVaultingInfo(VaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreationInfo {\n");
    
    sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(callbackInfo)).append("\n");
    sb.append("    ccs: ").append(StringUtil.toIndentedString(ccs)).append("\n");
    sb.append("    daysUntilSigningDeadline: ").append(StringUtil.toIndentedString(daysUntilSigningDeadline)).append("\n");
    sb.append("    externalId: ").append(StringUtil.toIndentedString(externalId)).append("\n");
    sb.append("    fileInfos: ").append(StringUtil.toIndentedString(fileInfos)).append("\n");
    sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(formFieldLayerTemplates)).append("\n");
    sb.append("    formFields: ").append(StringUtil.toIndentedString(formFields)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(mergeFieldInfo)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    postSignOptions: ").append(StringUtil.toIndentedString(postSignOptions)).append("\n");
    sb.append("    recipientSetInfos: ").append(StringUtil.toIndentedString(recipientSetInfos)).append("\n");
    sb.append("    reminderFrequency: ").append(StringUtil.toIndentedString(reminderFrequency)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    signatureFlow: ").append(StringUtil.toIndentedString(signatureFlow)).append("\n");
    sb.append("    signatureType: ").append(StringUtil.toIndentedString(signatureType)).append("\n");
    sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(vaultingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
