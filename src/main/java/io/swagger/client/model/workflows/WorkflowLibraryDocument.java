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


package io.swagger.client.model.workflows;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * WorkflowLibraryDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:59.041+11:00")
public class WorkflowLibraryDocument {
  /**
   * Gets or Sets templateTypes
   */
  @JsonAdapter(TemplateTypesEnum.Adapter.class)
  public enum TemplateTypesEnum {
    DOCUMENT("DOCUMENT"),
    
    FORM_FIELD_LAYER("FORM_FIELD_LAYER");

    private String value;

    TemplateTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TemplateTypesEnum fromValue(String text) {
      for (TemplateTypesEnum b : TemplateTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TemplateTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TemplateTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TemplateTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("templateTypes")
  private List<TemplateTypesEnum> templateTypes = null;

  /**
   * Specifies who should have access to this library document. GLOBAL sharing is a restricted operation.
   */
  @JsonAdapter(SharingModeEnum.Adapter.class)
  public enum SharingModeEnum {
    USER("USER"),
    
    GROUP("GROUP"),
    
    ACCOUNT("ACCOUNT"),
    
    GLOBAL("GLOBAL");

    private String value;

    SharingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SharingModeEnum fromValue(String text) {
      for (SharingModeEnum b : SharingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SharingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SharingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SharingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SharingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sharingMode")
  private SharingModeEnum sharingMode = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("workflowLibDoc")
  private String workflowLibDoc = null;

  @SerializedName("label")
  private String label = null;

  public WorkflowLibraryDocument templateTypes(List<TemplateTypesEnum> templateTypes) {
    this.templateTypes = templateTypes;
    return this;
  }

  public WorkflowLibraryDocument addTemplateTypesItem(TemplateTypesEnum templateTypesItem) {
    if (this.templateTypes == null) {
      this.templateTypes = new ArrayList<TemplateTypesEnum>();
    }
    this.templateTypes.add(templateTypesItem);
    return this;
  }

   /**
   * A list of one or more library template types
   * @return templateTypes
  **/
  @ApiModelProperty(value = "A list of one or more library template types")
  public List<TemplateTypesEnum> getTemplateTypes() {
    return templateTypes;
  }

  public void setTemplateTypes(List<TemplateTypesEnum> templateTypes) {
    this.templateTypes = templateTypes;
  }

  public WorkflowLibraryDocument sharingMode(SharingModeEnum sharingMode) {
    this.sharingMode = sharingMode;
    return this;
  }

   /**
   * Specifies who should have access to this library document. GLOBAL sharing is a restricted operation.
   * @return sharingMode
  **/
  @ApiModelProperty(value = "Specifies who should have access to this library document. GLOBAL sharing is a restricted operation.")
  public SharingModeEnum getSharingMode() {
    return sharingMode;
  }

  public void setSharingMode(SharingModeEnum sharingMode) {
    this.sharingMode = sharingMode;
  }

  public WorkflowLibraryDocument modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * The date on which the library document was last modified. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "The date on which the library document was last modified. Format would be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public WorkflowLibraryDocument workflowLibDoc(String workflowLibDoc) {
    this.workflowLibDoc = workflowLibDoc;
    return this;
  }

   /**
   * An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request
   * @return workflowLibDoc
  **/
  @ApiModelProperty(value = "An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request")
  public String getWorkflowLibDoc() {
    return workflowLibDoc;
  }

  public void setWorkflowLibDoc(String workflowLibDoc) {
    this.workflowLibDoc = workflowLibDoc;
  }

  public WorkflowLibraryDocument label(String label) {
    this.label = label;
    return this;
  }

   /**
   * A display text for this form for workflow users
   * @return label
  **/
  @ApiModelProperty(value = "A display text for this form for workflow users")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowLibraryDocument workflowLibraryDocument = (WorkflowLibraryDocument) o;
    return Objects.equals(this.templateTypes, workflowLibraryDocument.templateTypes) &&
        Objects.equals(this.sharingMode, workflowLibraryDocument.sharingMode) &&
        Objects.equals(this.modifiedDate, workflowLibraryDocument.modifiedDate) &&
        Objects.equals(this.workflowLibDoc, workflowLibraryDocument.workflowLibDoc) &&
        Objects.equals(this.label, workflowLibraryDocument.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateTypes, sharingMode, modifiedDate, workflowLibDoc, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowLibraryDocument {\n");
    
    sb.append("    templateTypes: ").append(toIndentedString(templateTypes)).append("\n");
    sb.append("    sharingMode: ").append(toIndentedString(sharingMode)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    workflowLibDoc: ").append(toIndentedString(workflowLibDoc)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

