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


package io.swagger.client.model.megaSigns;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.megaSigns.DocumentImageUrls;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentImageUrlsInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:44.788+11:00")
public class DocumentImageUrlsInfo {
  @SerializedName("documentImageUrlsList")
  private List<DocumentImageUrls> documentImageUrlsList = null;

  @SerializedName("documentId")
  private String documentId = null;

  public DocumentImageUrlsInfo documentImageUrlsList(List<DocumentImageUrls> documentImageUrlsList) {
    this.documentImageUrlsList = documentImageUrlsList;
    return this;
  }

  public DocumentImageUrlsInfo addDocumentImageUrlsListItem(DocumentImageUrls documentImageUrlsListItem) {
    if (this.documentImageUrlsList == null) {
      this.documentImageUrlsList = new ArrayList<DocumentImageUrls>();
    }
    this.documentImageUrlsList.add(documentImageUrlsListItem);
    return this;
  }

   /**
   * A list of documents image URLs.
   * @return documentImageUrlsList
  **/
  @ApiModelProperty(value = "A list of documents image URLs.")
  public List<DocumentImageUrls> getDocumentImageUrlsList() {
    return documentImageUrlsList;
  }

  public void setDocumentImageUrlsList(List<DocumentImageUrls> documentImageUrlsList) {
    this.documentImageUrlsList = documentImageUrlsList;
  }

  public DocumentImageUrlsInfo documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Id of the document
   * @return documentId
  **/
  @ApiModelProperty(value = "Id of the document")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentImageUrlsInfo documentImageUrlsInfo = (DocumentImageUrlsInfo) o;
    return Objects.equals(this.documentImageUrlsList, documentImageUrlsInfo.documentImageUrlsList) &&
        Objects.equals(this.documentId, documentImageUrlsInfo.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentImageUrlsList, documentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentImageUrlsInfo {\n");
    
    sb.append("    documentImageUrlsList: ").append(toIndentedString(documentImageUrlsList)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

