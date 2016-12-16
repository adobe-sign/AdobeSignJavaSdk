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
import com.adobe.sign.model.agreements.FormFieldCondition;
import com.adobe.sign.model.agreements.FormFieldLocation;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class RequestFormField   {
  

public enum AlignmentEnum {
  LEFT("LEFT"),
  RIGHT("RIGHT"),
  CENTER("CENTER");

  private String value;

  AlignmentEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private AlignmentEnum alignment = null;

public enum AnyOrAllEnum {
  ALL("ALL"),
  ANY("ANY");

  private String value;

  AnyOrAllEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private AnyOrAllEnum anyOrAll = null;
  private String backgroundColor = null;
  private String borderColor = null;

public enum BorderStyleEnum {
  SOLID("SOLID"),
  DASHED("DASHED"),
  BEVELED("BEVELED"),
  INSET("INSET"),
  UNDERLINE("UNDERLINE");

  private String value;

  BorderStyleEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private BorderStyleEnum borderStyle = null;
  private Float borderWidth = null;
  private String calculatedExpression = null;
  private List<FormFieldCondition> conditions = null;

public enum ContentTypeEnum {
  DATA("DATA"),
  SIGNATURE_BLOCK("SIGNATURE_BLOCK"),
  SIGNATURE("SIGNATURE"),
  SIGNER_NAME("SIGNER_NAME"),
  SIGNER_FIRST_NAME("SIGNER_FIRST_NAME"),
  SIGNER_LAST_NAME("SIGNER_LAST_NAME"),
  SIGNER_INITIALS("SIGNER_INITIALS"),
  SIGNER_EMAIL("SIGNER_EMAIL"),
  SIGNER_TITLE("SIGNER_TITLE"),
  SIGNER_COMPANY("SIGNER_COMPANY"),
  SIGNATURE_DATE("SIGNATURE_DATE"),
  AGREEMENT_NAME("AGREEMENT_NAME"),
  AGREEMENT_MESSAGE("AGREEMENT_MESSAGE"),
  TRANSACTION_ID("TRANSACTION_ID"),
  SIGNATURE_STAMP("SIGNATURE_STAMP"),
  CALC("CALC");

  private String value;

  ContentTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ContentTypeEnum contentType = null;
  private String defaultValue = null;
  private String displayFormat = null;

public enum DisplayFormatTypeEnum {
  DEFAULT("DEFAULT"),
  DATE("DATE"),
  NUMBER("NUMBER");

  private String value;

  DisplayFormatTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private DisplayFormatTypeEnum displayFormatType = null;
  private String displayLabel = null;
  private String fontColor = null;
  private String fontName = null;
  private Float fontSize = null;

public enum FormatEnum {
  CUSTOM("CUSTOM"),
  DATE("DATE"),
  DATE_CUSTOM("DATE_CUSTOM"),
  DATE_DD_MM_YY("DATE_DD_MM_YY"),
  DATE_DD_MM_YYYY("DATE_DD_MM_YYYY"),
  DATE_MM_DD_YY("DATE_MM_DD_YY"),
  DATE_MM_DD_YYYY("DATE_MM_DD_YYYY"),
  DATE_MM_YY("DATE_MM_YY"),
  EMAIL("EMAIL"),
  FORMULA("FORMULA"),
  MONEY("MONEY"),
  MONEY_UK("MONEY_UK"),
  NONE("NONE"),
  NUMBER("NUMBER"),
  PERCENT("PERCENT"),
  PHONE("PHONE"),
  PHONE_UK("PHONE_UK"),
  SOCIAL_SEC("SOCIAL_SEC"),
  SPECIAL("SPECIAL"),
  STRING("STRING"),
  STRING_ALPHA("STRING_ALPHA"),
  STRING_ALPHANUM("STRING_ALPHANUM"),
  STRING_NUM("STRING_NUM"),
  TIME("TIME"),
  XFA_PICTURE("XFA_PICTURE"),
  ZIP("ZIP"),
  ZIP4("ZIP4"),
  ZIP_UK("ZIP_UK");

  private String value;

  FormatEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private FormatEnum format = null;
  private String formatData = null;
  private Boolean hidden = null;
  private List<String> hiddenOptions = null;

public enum InputTypeEnum {
  TEXT_FIELD("TEXT_FIELD"),
  MULTILINE("MULTILINE"),
  PASSWORD("PASSWORD"),
  RADIO("RADIO"),
  CHECKBOX("CHECKBOX"),
  DROP_DOWN("DROP_DOWN"),
  LISTBOX("LISTBOX"),
  SIGNATURE("SIGNATURE"),
  PDF_SIGNATURE("PDF_SIGNATURE"),
  BUTTON("BUTTON"),
  BLOCK("BLOCK"),
  FILE_CHOOSER("FILE_CHOOSER"),
  COMB("COMB"),
  UNSUPPORTED("UNSUPPORTED");

  private String value;

  InputTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private InputTypeEnum inputType = null;
  private List<FormFieldLocation> locations = null;
  private Boolean masked = null;
  private String maskingText = null;
  private Integer maxLength = null;
  private Double maxNumberValue = null;
  private Integer minLength = null;
  private Double minNumberValue = null;
  private String name = null;

public enum RadioCheckTypeEnum {
  CIRCLE("CIRCLE"),
  CHECK("CHECK"),
  CROSS("CROSS"),
  DIAMOND("DIAMOND"),
  SQUARE("SQUARE"),
  STAR("STAR");

  private String value;

  RadioCheckTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private RadioCheckTypeEnum radioCheckType = null;
  private Boolean readOnly = null;
  private Integer recipientIndex = null;
  private String regularExpression = null;
  private Boolean required = null;

public enum ShowOrHideEnum {
  SHOW("SHOW"),
  HIDE("HIDE"),
  DISABLE("DISABLE"),
  ENABLE("ENABLE");

  private String value;

  ShowOrHideEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ShowOrHideEnum showOrHide = null;
  private String specialErrMsg = null;
  private String specialFormula = null;
  private String tooltip = null;
  private List<String> visibleOptions = null;

  
  /**
   * Alignment of the text.
   **/
  @ApiModelProperty(value = "Alignment of the text.")
  @JsonProperty("alignment")
  /**
   * @return AlignmentEnum
   **/
  public AlignmentEnum getAlignment() {
    return alignment;
  }
  /**
   * Alignment of the text.
   * @param alignment
   **/
  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  
  /**
   * It indicates if any one of the conditions or all of them have to be true.
   **/
  @ApiModelProperty(value = "It indicates if any one of the conditions or all of them have to be true.")
  @JsonProperty("anyOrAll")
  /**
   * @return AnyOrAllEnum
   **/
  public AnyOrAllEnum getAnyOrAll() {
    return anyOrAll;
  }
  /**
   * It indicates if any one of the conditions or all of them have to be true.
   * @param anyOrAll
   **/
  public void setAnyOrAll(AnyOrAllEnum anyOrAll) {
    this.anyOrAll = anyOrAll;
  }

  
  /**
   * Background color of the form field in RGB or HEX format
   **/
  @ApiModelProperty(value = "Background color of the form field in RGB or HEX format")
  @JsonProperty("backgroundColor")
  /**
   * @return String
   **/
  public String getBackgroundColor() {
    return backgroundColor;
  }
  /**
   * Background color of the form field in RGB or HEX format
   * @param backgroundColor
   **/
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  
  /**
   * Color of the border of the field in RGB or HEX format
   **/
  @ApiModelProperty(value = "Color of the border of the field in RGB or HEX format")
  @JsonProperty("borderColor")
  /**
   * @return String
   **/
  public String getBorderColor() {
    return borderColor;
  }
  /**
   * Color of the border of the field in RGB or HEX format
   * @param borderColor
   **/
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  
  /**
   * Style of the border of the field.
   **/
  @ApiModelProperty(value = "Style of the border of the field.")
  @JsonProperty("borderStyle")
  /**
   * @return BorderStyleEnum
   **/
  public BorderStyleEnum getBorderStyle() {
    return borderStyle;
  }
  /**
   * Style of the border of the field.
   * @param borderStyle
   **/
  public void setBorderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
  }

  
  /**
   * Width of the border of the field in pixels
   **/
  @ApiModelProperty(value = "Width of the border of the field in pixels")
  @JsonProperty("borderWidth")
  /**
   * @return Float
   **/
  public Float getBorderWidth() {
    return borderWidth;
  }
  /**
   * Width of the border of the field in pixels
   * @param borderWidth
   **/
  public void setBorderWidth(Float borderWidth) {
    this.borderWidth = borderWidth;
  }

  
  /**
   * Expression to calculate value of the form field
   **/
  @ApiModelProperty(value = "Expression to calculate value of the form field")
  @JsonProperty("calculatedExpression")
  /**
   * @return String
   **/
  public String getCalculatedExpression() {
    return calculatedExpression;
  }
  /**
   * Expression to calculate value of the form field
   * @param calculatedExpression
   **/
  public void setCalculatedExpression(String calculatedExpression) {
    this.calculatedExpression = calculatedExpression;
  }

  
  /**
   * Conditions to be evaluated which decides the visibility of the form field in association with showOrHide property
   **/
  @ApiModelProperty(value = "Conditions to be evaluated which decides the visibility of the form field in association with showOrHide property")
  @JsonProperty("conditions")
  /**
   * @return List&lt;FormFieldCondition&gt;
   **/
  public List<FormFieldCondition> getConditions() {
    return conditions;
  }
  /**
   * Conditions to be evaluated which decides the visibility of the form field in association with showOrHide property
   * @param conditions
   **/
  public void setConditions(List<FormFieldCondition> conditions) {
    this.conditions = conditions;
  }

  
  /**
   * Content Type of the form field.
   **/
  @ApiModelProperty(value = "Content Type of the form field.")
  @JsonProperty("contentType")
  /**
   * @return ContentTypeEnum
   **/
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  /**
   * Content Type of the form field.
   * @param contentType
   **/
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Default value of the form field
   **/
  @ApiModelProperty(value = "Default value of the form field")
  @JsonProperty("defaultValue")
  /**
   * @return String
   **/
  public String getDefaultValue() {
    return defaultValue;
  }
  /**
   * Default value of the form field
   * @param defaultValue
   **/
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * Format of the value of the field to be displayed based on the displayFormatType property.
   **/
  @ApiModelProperty(value = "Format of the value of the field to be displayed based on the displayFormatType property.")
  @JsonProperty("displayFormat")
  /**
   * @return String
   **/
  public String getDisplayFormat() {
    return displayFormat;
  }
  /**
   * Format of the value of the field to be displayed based on the displayFormatType property.
   * @param displayFormat
   **/
  public void setDisplayFormat(String displayFormat) {
    this.displayFormat = displayFormat;
  }

  
  /**
   * Format type of the text field.
   **/
  @ApiModelProperty(value = "Format type of the text field.")
  @JsonProperty("displayFormatType")
  /**
   * @return DisplayFormatTypeEnum
   **/
  public DisplayFormatTypeEnum getDisplayFormatType() {
    return displayFormatType;
  }
  /**
   * Format type of the text field.
   * @param displayFormatType
   **/
  public void setDisplayFormatType(DisplayFormatTypeEnum displayFormatType) {
    this.displayFormatType = displayFormatType;
  }

  
  /**
   * Display label attached to the field
   **/
  @ApiModelProperty(value = "Display label attached to the field")
  @JsonProperty("displayLabel")
  /**
   * @return String
   **/
  public String getDisplayLabel() {
    return displayLabel;
  }
  /**
   * Display label attached to the field
   * @param displayLabel
   **/
  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  
  /**
   * Font color of the form field in RGB or HEX format
   **/
  @ApiModelProperty(value = "Font color of the form field in RGB or HEX format")
  @JsonProperty("fontColor")
  /**
   * @return String
   **/
  public String getFontColor() {
    return fontColor;
  }
  /**
   * Font color of the form field in RGB or HEX format
   * @param fontColor
   **/
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  
  /**
   * Font name of the form field
   **/
  @ApiModelProperty(value = "Font name of the form field")
  @JsonProperty("fontName")
  /**
   * @return String
   **/
  public String getFontName() {
    return fontName;
  }
  /**
   * Font name of the form field
   * @param fontName
   **/
  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  
  /**
   * Font size of the form field in points
   **/
  @ApiModelProperty(value = "Font size of the form field in points")
  @JsonProperty("fontSize")
  /**
   * @return Float
   **/
  public Float getFontSize() {
    return fontSize;
  }
  /**
   * Font size of the form field in points
   * @param fontSize
   **/
  public void setFontSize(Float fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   * Format of the form field
   **/
  @ApiModelProperty(value = "Format of the form field")
  @JsonProperty("format")
  /**
   * @return FormatEnum
   **/
  public FormatEnum getFormat() {
    return format;
  }
  /**
   * Format of the form field
   * @param format
   **/
  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  
  /**
   * The format of data in text field
   **/
  @ApiModelProperty(value = "The format of data in text field")
  @JsonProperty("formatData")
  /**
   * @return String
   **/
  public String getFormatData() {
    return formatData;
  }
  /**
   * The format of data in text field
   * @param formatData
   **/
  public void setFormatData(String formatData) {
    this.formatData = formatData;
  }

  
  /**
   * true if the field is hidden, else false
   **/
  @ApiModelProperty(value = "true if the field is hidden, else false")
  @JsonProperty("hidden")
  /**
   * @return Boolean
   **/
  public Boolean getHidden() {
    return hidden;
  }
  /**
   * true if the field is hidden, else false
   * @param hidden
   **/
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  
  /**
   * Text values which are hidden in a drop down form field
   **/
  @ApiModelProperty(value = "Text values which are hidden in a drop down form field")
  @JsonProperty("hiddenOptions")
  /**
   * @return List&lt;String&gt;
   **/
  public List<String> getHiddenOptions() {
    return hiddenOptions;
  }
  /**
   * Text values which are hidden in a drop down form field
   * @param hiddenOptions
   **/
  public void setHiddenOptions(List<String> hiddenOptions) {
    this.hiddenOptions = hiddenOptions;
  }

  
  /**
   * Input type of the form field
   **/
  @ApiModelProperty(value = "Input type of the form field")
  @JsonProperty("inputType")
  /**
   * @return InputTypeEnum
   **/
  public InputTypeEnum getInputType() {
    return inputType;
  }
  /**
   * Input type of the form field
   * @param inputType
   **/
  public void setInputType(InputTypeEnum inputType) {
    this.inputType = inputType;
  }

  
  /**
   * All locations in a document where the form field is placed
   **/
  @ApiModelProperty(required = true, value = "All locations in a document where the form field is placed")
  @JsonProperty("locations")
  /**
   * @return List&lt;FormFieldLocation&gt;
   **/
  public List<FormFieldLocation> getLocations() {
    return locations;
  }
  /**
   * All locations in a document where the form field is placed
   * @param locations
   **/
  public void setLocations(List<FormFieldLocation> locations) {
    this.locations = locations;
  }

  
  /**
   * true if the input entered by the signer has to be masked (like password), else false
   **/
  @ApiModelProperty(value = "true if the input entered by the signer has to be masked (like password), else false")
  @JsonProperty("masked")
  /**
   * @return Boolean
   **/
  public Boolean getMasked() {
    return masked;
  }
  /**
   * true if the input entered by the signer has to be masked (like password), else false
   * @param masked
   **/
  public void setMasked(Boolean masked) {
    this.masked = masked;
  }

  
  /**
   * Text to mask the masked form field
   **/
  @ApiModelProperty(value = "Text to mask the masked form field")
  @JsonProperty("maskingText")
  /**
   * @return String
   **/
  public String getMaskingText() {
    return maskingText;
  }
  /**
   * Text to mask the masked form field
   * @param maskingText
   **/
  public void setMaskingText(String maskingText) {
    this.maskingText = maskingText;
  }

  
  /**
   * Maximum length of the input text field in terms of no. of characters
   **/
  @ApiModelProperty(value = "Maximum length of the input text field in terms of no. of characters")
  @JsonProperty("maxLength")
  /**
   * @return Integer
   **/
  public Integer getMaxLength() {
    return maxLength;
  }
  /**
   * Maximum length of the input text field in terms of no. of characters
   * @param maxLength
   **/
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  
  /**
   * Upper bound of the number that can be entered by the signer
   **/
  @ApiModelProperty(value = "Upper bound of the number that can be entered by the signer")
  @JsonProperty("maxNumberValue")
  /**
   * @return Double
   **/
  public Double getMaxNumberValue() {
    return maxNumberValue;
  }
  /**
   * Upper bound of the number that can be entered by the signer
   * @param maxNumberValue
   **/
  public void setMaxNumberValue(Double maxNumberValue) {
    this.maxNumberValue = maxNumberValue;
  }

  
  /**
   * Minimum length of the input text field in terms of no. of characters
   **/
  @ApiModelProperty(value = "Minimum length of the input text field in terms of no. of characters")
  @JsonProperty("minLength")
  /**
   * @return Integer
   **/
  public Integer getMinLength() {
    return minLength;
  }
  /**
   * Minimum length of the input text field in terms of no. of characters
   * @param minLength
   **/
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  
  /**
   * Lower bound of the number that can be entered by the signer
   **/
  @ApiModelProperty(value = "Lower bound of the number that can be entered by the signer")
  @JsonProperty("minNumberValue")
  /**
   * @return Double
   **/
  public Double getMinNumberValue() {
    return minNumberValue;
  }
  /**
   * Lower bound of the number that can be entered by the signer
   * @param minNumberValue
   **/
  public void setMinNumberValue(Double minNumberValue) {
    this.minNumberValue = minNumberValue;
  }

  
  /**
   * The name of the form field
   **/
  @ApiModelProperty(required = true, value = "The name of the form field")
  @JsonProperty("name")
  /**
   * @return String
   **/
  public String getName() {
    return name;
  }
  /**
   * The name of the form field
   * @param name
   **/
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The type of radio button (if field is radio button, identified by inputType).
   **/
  @ApiModelProperty(value = "The type of radio button (if field is radio button, identified by inputType).")
  @JsonProperty("radioCheckType")
  /**
   * @return RadioCheckTypeEnum
   **/
  public RadioCheckTypeEnum getRadioCheckType() {
    return radioCheckType;
  }
  /**
   * The type of radio button (if field is radio button, identified by inputType).
   * @param radioCheckType
   **/
  public void setRadioCheckType(RadioCheckTypeEnum radioCheckType) {
    this.radioCheckType = radioCheckType;
  }

  
  /**
   * true if it is a read-only field, else false
   **/
  @ApiModelProperty(value = "true if it is a read-only field, else false")
  @JsonProperty("readOnly")
  /**
   * @return Boolean
   **/
  public Boolean getReadOnly() {
    return readOnly;
  }
  /**
   * true if it is a read-only field, else false
   * @param readOnly
   **/
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  
  /**
   * Index of recipient, starting from 1, in recipients list passed in the request
   **/
  @ApiModelProperty(value = "Index of recipient, starting from 1, in recipients list passed in the request")
  @JsonProperty("recipientIndex")
  /**
   * @return Integer
   **/
  public Integer getRecipientIndex() {
    return recipientIndex;
  }
  /**
   * Index of recipient, starting from 1, in recipients list passed in the request
   * @param recipientIndex
   **/
  public void setRecipientIndex(Integer recipientIndex) {
    this.recipientIndex = recipientIndex;
  }

  
  /**
   * Regular expression validation of the form field
   **/
  @ApiModelProperty(value = "Regular expression validation of the form field")
  @JsonProperty("regularExpression")
  /**
   * @return String
   **/
  public String getRegularExpression() {
    return regularExpression;
  }
  /**
   * Regular expression validation of the form field
   * @param regularExpression
   **/
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }

  
  /**
   * true if it is a mandatory field to be filled by the signer, else false
   **/
  @ApiModelProperty(value = "true if it is a mandatory field to be filled by the signer, else false")
  @JsonProperty("required")
  /**
   * @return Boolean
   **/
  public Boolean getRequired() {
    return required;
  }
  /**
   * true if it is a mandatory field to be filled by the signer, else false
   * @param required
   **/
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   * Action to show/hide the form field is to be taken on the basis of evaluation of conditions.
   **/
  @ApiModelProperty(value = "Action to show/hide the form field is to be taken on the basis of evaluation of conditions.")
  @JsonProperty("showOrHide")
  /**
   * @return ShowOrHideEnum
   **/
  public ShowOrHideEnum getShowOrHide() {
    return showOrHide;
  }
  /**
   * Action to show/hide the form field is to be taken on the basis of evaluation of conditions.
   * @param showOrHide
   **/
  public void setShowOrHide(ShowOrHideEnum showOrHide) {
    this.showOrHide = showOrHide;
  }

  
  /**
   * Error message to be shown to the signer if filled value does not match the validations of the form field
   **/
  @ApiModelProperty(value = "Error message to be shown to the signer if filled value does not match the validations of the form field")
  @JsonProperty("specialErrMsg")
  /**
   * @return String
   **/
  public String getSpecialErrMsg() {
    return specialErrMsg;
  }
  /**
   * Error message to be shown to the signer if filled value does not match the validations of the form field
   * @param specialErrMsg
   **/
  public void setSpecialErrMsg(String specialErrMsg) {
    this.specialErrMsg = specialErrMsg;
  }

  
  /**
   * Formula used to calculate the value of the form field
   **/
  @ApiModelProperty(value = "Formula used to calculate the value of the form field")
  @JsonProperty("specialFormula")
  /**
   * @return String
   **/
  public String getSpecialFormula() {
    return specialFormula;
  }
  /**
   * Formula used to calculate the value of the form field
   * @param specialFormula
   **/
  public void setSpecialFormula(String specialFormula) {
    this.specialFormula = specialFormula;
  }

  
  /**
   * Text that appears while hovering over the field
   **/
  @ApiModelProperty(value = "Text that appears while hovering over the field")
  @JsonProperty("tooltip")
  /**
   * @return String
   **/
  public String getTooltip() {
    return tooltip;
  }
  /**
   * Text that appears while hovering over the field
   * @param tooltip
   **/
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  
  /**
   * Text values which are visible in a drop down form field
   **/
  @ApiModelProperty(value = "Text values which are visible in a drop down form field")
  @JsonProperty("visibleOptions")
  /**
   * @return List&lt;String&gt;
   **/
  public List<String> getVisibleOptions() {
    return visibleOptions;
  }
  /**
   * Text values which are visible in a drop down form field
   * @param visibleOptions
   **/
  public void setVisibleOptions(List<String> visibleOptions) {
    this.visibleOptions = visibleOptions;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFormField {\n");
    
    sb.append("    alignment: ").append(StringUtil.toIndentedString(alignment)).append("\n");
    sb.append("    anyOrAll: ").append(StringUtil.toIndentedString(anyOrAll)).append("\n");
    sb.append("    backgroundColor: ").append(StringUtil.toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(StringUtil.toIndentedString(borderColor)).append("\n");
    sb.append("    borderStyle: ").append(StringUtil.toIndentedString(borderStyle)).append("\n");
    sb.append("    borderWidth: ").append(StringUtil.toIndentedString(borderWidth)).append("\n");
    sb.append("    calculatedExpression: ").append(StringUtil.toIndentedString(calculatedExpression)).append("\n");
    sb.append("    conditions: ").append(StringUtil.toIndentedString(conditions)).append("\n");
    sb.append("    contentType: ").append(StringUtil.toIndentedString(contentType)).append("\n");
    sb.append("    defaultValue: ").append(StringUtil.toIndentedString(defaultValue)).append("\n");
    sb.append("    displayFormat: ").append(StringUtil.toIndentedString(displayFormat)).append("\n");
    sb.append("    displayFormatType: ").append(StringUtil.toIndentedString(displayFormatType)).append("\n");
    sb.append("    displayLabel: ").append(StringUtil.toIndentedString(displayLabel)).append("\n");
    sb.append("    fontColor: ").append(StringUtil.toIndentedString(fontColor)).append("\n");
    sb.append("    fontName: ").append(StringUtil.toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(StringUtil.toIndentedString(fontSize)).append("\n");
    sb.append("    format: ").append(StringUtil.toIndentedString(format)).append("\n");
    sb.append("    formatData: ").append(StringUtil.toIndentedString(formatData)).append("\n");
    sb.append("    hidden: ").append(StringUtil.toIndentedString(hidden)).append("\n");
    sb.append("    hiddenOptions: ").append(StringUtil.toIndentedString(hiddenOptions)).append("\n");
    sb.append("    inputType: ").append(StringUtil.toIndentedString(inputType)).append("\n");
    sb.append("    locations: ").append(StringUtil.toIndentedString(locations)).append("\n");
    sb.append("    masked: ").append(StringUtil.toIndentedString(masked)).append("\n");
    sb.append("    maskingText: ").append(StringUtil.toIndentedString(maskingText)).append("\n");
    sb.append("    maxLength: ").append(StringUtil.toIndentedString(maxLength)).append("\n");
    sb.append("    maxNumberValue: ").append(StringUtil.toIndentedString(maxNumberValue)).append("\n");
    sb.append("    minLength: ").append(StringUtil.toIndentedString(minLength)).append("\n");
    sb.append("    minNumberValue: ").append(StringUtil.toIndentedString(minNumberValue)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    radioCheckType: ").append(StringUtil.toIndentedString(radioCheckType)).append("\n");
    sb.append("    readOnly: ").append(StringUtil.toIndentedString(readOnly)).append("\n");
    sb.append("    recipientIndex: ").append(StringUtil.toIndentedString(recipientIndex)).append("\n");
    sb.append("    regularExpression: ").append(StringUtil.toIndentedString(regularExpression)).append("\n");
    sb.append("    required: ").append(StringUtil.toIndentedString(required)).append("\n");
    sb.append("    showOrHide: ").append(StringUtil.toIndentedString(showOrHide)).append("\n");
    sb.append("    specialErrMsg: ").append(StringUtil.toIndentedString(specialErrMsg)).append("\n");
    sb.append("    specialFormula: ").append(StringUtil.toIndentedString(specialFormula)).append("\n");
    sb.append("    tooltip: ").append(StringUtil.toIndentedString(tooltip)).append("\n");
    sb.append("    visibleOptions: ").append(StringUtil.toIndentedString(visibleOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
