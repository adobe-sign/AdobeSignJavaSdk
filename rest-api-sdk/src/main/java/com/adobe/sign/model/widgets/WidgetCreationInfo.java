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

package com.adobe.sign.model.widgets;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.widgets.WidgetCompletionInfo;
import com.adobe.sign.model.widgets.CounterSignerSetInfo;
import com.adobe.sign.model.widgets.WidgetSignerSecurityOption;
import com.adobe.sign.model.widgets.WidgetSecurityOption;
import com.adobe.sign.model.widgets.WidgetMergefieldInfo;
import com.adobe.sign.model.widgets.WidgetFileInfo;
import com.adobe.sign.model.widgets.WidgetVaultingInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:04.202+05:30")
public class WidgetCreationInfo   {
  
  private String callbackInfo = null;
  private List<CounterSignerSetInfo> counterSignerSetInfos = new ArrayList<CounterSignerSetInfo>();
  private List<WidgetFileInfo> fileInfos = new ArrayList<WidgetFileInfo>();
  private List<WidgetFileInfo> formFieldLayerTemplates = new ArrayList<WidgetFileInfo>();
  private String locale = null;
  private List<WidgetMergefieldInfo> mergeFieldInfo = new ArrayList<WidgetMergefieldInfo>();
  private String name = null;
  private WidgetSecurityOption securityOptions = null;

public enum SignatureFlowEnum {
  SENDER_SIGNATURE_NOT_REQUIRED("SENDER_SIGNATURE_NOT_REQUIRED"),
  SENDER_SIGNS_LAST("SENDER_SIGNS_LAST");

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
  private WidgetVaultingInfo vaultingInfo = null;
  private WidgetCompletionInfo widgetAuthFailureInfo = null;
  private WidgetCompletionInfo widgetCompletionInfo = null;
  private WidgetSignerSecurityOption widgetSignerSecurityOptions = null;

  
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
   * A list of one or more counter signers provided in the form of counter signer set.
   **/
  @ApiModelProperty(value = "A list of one or more counter signers provided in the form of counter signer set.")
  @JsonProperty("counterSignerSetInfos")
  public List<CounterSignerSetInfo> getCounterSignerSetInfos() {
    return counterSignerSetInfos;
  }
  public void setCounterSignerSetInfos(List<CounterSignerSetInfo> counterSignerSetInfos) {
    this.counterSignerSetInfos = counterSignerSetInfos;
  }

  
  /**
   * A list of one or more files (or references to files) that will be used to create the widget. If more than one file is provided, they will be combined before the widget is created. Library documents are not permitted. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be used to create the widget. If more than one file is provided, they will be combined before the widget is created. Library documents are not permitted. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("fileInfos")
  public List<WidgetFileInfo> getFileInfos() {
    return fileInfos;
  }
  public void setFileInfos(List<WidgetFileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  
  /**
   * Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified
   **/
  @ApiModelProperty(value = "Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
  @JsonProperty("formFieldLayerTemplates")
  public List<WidgetFileInfo> getFormFieldLayerTemplates() {
    return formFieldLayerTemplates;
  }
  public void setFormFieldLayerTemplates(List<WidgetFileInfo> formFieldLayerTemplates) {
    this.formFieldLayerTemplates = formFieldLayerTemplates;
  }

  
  /**
   * The locale associated with this widget - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the widget creator
   **/
  @ApiModelProperty(value = "The locale associated with this widget - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the widget creator")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are curently supported
   **/
  @ApiModelProperty(value = "Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are curently supported")
  @JsonProperty("mergeFieldInfo")
  public List<WidgetMergefieldInfo> getMergeFieldInfo() {
    return mergeFieldInfo;
  }
  public void setMergeFieldInfo(List<WidgetMergefieldInfo> mergeFieldInfo) {
    this.mergeFieldInfo = mergeFieldInfo;
  }

  
  /**
   * The name of the widget that will be used to identify it, in emails and on the website
   **/
  @ApiModelProperty(required = true, value = "The name of the widget that will be used to identify it, in emails and on the website")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Sets optional secondary security parameters for your widget
   **/
  @ApiModelProperty(value = "Sets optional secondary security parameters for your widget")
  @JsonProperty("securityOptions")
  public WidgetSecurityOption getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(WidgetSecurityOption securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * Selects the workflow you would like to use - whether the sender needs to sign before the recipient, after the recipient, or not at all. The possible values for this variable are SENDER_SIGNATURE_NOT_REQUIRED or SENDER_SIGNS_LAST
   **/
  @ApiModelProperty(required = true, value = "Selects the workflow you would like to use - whether the sender needs to sign before the recipient, after the recipient, or not at all. The possible values for this variable are SENDER_SIGNATURE_NOT_REQUIRED or SENDER_SIGNS_LAST")
  @JsonProperty("signatureFlow")
  public SignatureFlowEnum getSignatureFlow() {
    return signatureFlow;
  }
  public void setSignatureFlow(SignatureFlowEnum signatureFlow) {
    this.signatureFlow = signatureFlow;
  }

  
  /**
   * Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider
   **/
  @ApiModelProperty(value = "Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
  @JsonProperty("vaultingInfo")
  public WidgetVaultingInfo getVaultingInfo() {
    return vaultingInfo;
  }
  public void setVaultingInfo(WidgetVaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
  }

  
  /**
   * URL and associated properties for the error page the user will be taken after failing to authenticate
   **/
  @ApiModelProperty(value = "URL and associated properties for the error page the user will be taken after failing to authenticate")
  @JsonProperty("widgetAuthFailureInfo")
  public WidgetCompletionInfo getWidgetAuthFailureInfo() {
    return widgetAuthFailureInfo;
  }
  public void setWidgetAuthFailureInfo(WidgetCompletionInfo widgetAuthFailureInfo) {
    this.widgetAuthFailureInfo = widgetAuthFailureInfo;
  }

  
  /**
   * URL and associated properties for the success page the user will be taken to after filling out the widget
   **/
  @ApiModelProperty(value = "URL and associated properties for the success page the user will be taken to after filling out the widget")
  @JsonProperty("widgetCompletionInfo")
  public WidgetCompletionInfo getWidgetCompletionInfo() {
    return widgetCompletionInfo;
  }
  public void setWidgetCompletionInfo(WidgetCompletionInfo widgetCompletionInfo) {
    this.widgetCompletionInfo = widgetCompletionInfo;
  }

  
  /**
   * Security options that apply to widget signers
   **/
  @ApiModelProperty(value = "Security options that apply to widget signers")
  @JsonProperty("widgetSignerSecurityOptions")
  public WidgetSignerSecurityOption getWidgetSignerSecurityOptions() {
    return widgetSignerSecurityOptions;
  }
  public void setWidgetSignerSecurityOptions(WidgetSignerSecurityOption widgetSignerSecurityOptions) {
    this.widgetSignerSecurityOptions = widgetSignerSecurityOptions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetCreationInfo {\n");
    
    sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(callbackInfo)).append("\n");
    sb.append("    counterSignerSetInfos: ").append(StringUtil.toIndentedString(counterSignerSetInfos)).append("\n");
    sb.append("    fileInfos: ").append(StringUtil.toIndentedString(fileInfos)).append("\n");
    sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(formFieldLayerTemplates)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(mergeFieldInfo)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    signatureFlow: ").append(StringUtil.toIndentedString(signatureFlow)).append("\n");
    sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(vaultingInfo)).append("\n");
    sb.append("    widgetAuthFailureInfo: ").append(StringUtil.toIndentedString(widgetAuthFailureInfo)).append("\n");
    sb.append("    widgetCompletionInfo: ").append(StringUtil.toIndentedString(widgetCompletionInfo)).append("\n");
    sb.append("    widgetSignerSecurityOptions: ").append(StringUtil.toIndentedString(widgetSignerSecurityOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
