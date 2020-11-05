/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.agreements;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A predicate used to determine whether the condtion succeeds
 */
@ApiModel(description = "A predicate used to determine whether the condtion succeeds")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:34.872+11:00")
public class FormFieldConditionPredicate {
  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("value")
  private String value = null;

  /**
   * Operator to be applied on the value of the predicate field.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    EQUALS("EQUALS"),
    
    NOT_EQUALS("NOT_EQUALS"),
    
    LESS_THAN("LESS_THAN"),
    
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
    
    GREATER_THAN("GREATER_THAN"),
    
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
    
    IN("IN"),
    
    NOT_IN("NOT_IN"),
    
    CONTAINS("CONTAINS"),
    
    NOT_CONTAINS("NOT_CONTAINS");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("fieldLocationIndex")
  private Integer fieldLocationIndex = null;

  public FormFieldConditionPredicate fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the field whose value is the basis of predicate
   * @return fieldName
  **/
  @ApiModelProperty(value = "Name of the field whose value is the basis of predicate")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FormFieldConditionPredicate value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value to compare against the value of the predicate&#39;s form field, using the specified operator
   * @return value
  **/
  @ApiModelProperty(value = "Value to compare against the value of the predicate's form field, using the specified operator")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FormFieldConditionPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator to be applied on the value of the predicate field.
   * @return operator
  **/
  @ApiModelProperty(value = "Operator to be applied on the value of the predicate field.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public FormFieldConditionPredicate fieldLocationIndex(Integer fieldLocationIndex) {
    this.fieldLocationIndex = fieldLocationIndex;
    return this;
  }

   /**
   * Index of the location of the form field used in the predicate
   * @return fieldLocationIndex
  **/
  @ApiModelProperty(value = "Index of the location of the form field used in the predicate")
  public Integer getFieldLocationIndex() {
    return fieldLocationIndex;
  }

  public void setFieldLocationIndex(Integer fieldLocationIndex) {
    this.fieldLocationIndex = fieldLocationIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldConditionPredicate formFieldConditionPredicate = (FormFieldConditionPredicate) o;
    return Objects.equals(this.fieldName, formFieldConditionPredicate.fieldName) &&
        Objects.equals(this.value, formFieldConditionPredicate.value) &&
        Objects.equals(this.operator, formFieldConditionPredicate.operator) &&
        Objects.equals(this.fieldLocationIndex, formFieldConditionPredicate.fieldLocationIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, value, operator, fieldLocationIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldConditionPredicate {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    fieldLocationIndex: ").append(toIndentedString(fieldLocationIndex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

