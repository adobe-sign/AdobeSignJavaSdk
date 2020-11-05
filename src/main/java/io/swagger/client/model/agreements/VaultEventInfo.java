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
 * VaultEventInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:34.872+11:00")
public class VaultEventInfo {
  @SerializedName("vaultEventComment")
  private String vaultEventComment = null;

  @SerializedName("vaultEventId")
  private String vaultEventId = null;

  public VaultEventInfo vaultEventComment(String vaultEventComment) {
    this.vaultEventComment = vaultEventComment;
    return this;
  }

   /**
   * The description provided by the vault provider for the vault event
   * @return vaultEventComment
  **/
  @ApiModelProperty(value = "The description provided by the vault provider for the vault event")
  public String getVaultEventComment() {
    return vaultEventComment;
  }

  public void setVaultEventComment(String vaultEventComment) {
    this.vaultEventComment = vaultEventComment;
  }

  public VaultEventInfo vaultEventId(String vaultEventId) {
    this.vaultEventId = vaultEventId;
    return this;
  }

   /**
   * The identifier assigned by the vault provider for the vault event
   * @return vaultEventId
  **/
  @ApiModelProperty(value = "The identifier assigned by the vault provider for the vault event")
  public String getVaultEventId() {
    return vaultEventId;
  }

  public void setVaultEventId(String vaultEventId) {
    this.vaultEventId = vaultEventId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaultEventInfo vaultEventInfo = (VaultEventInfo) o;
    return Objects.equals(this.vaultEventComment, vaultEventInfo.vaultEventComment) &&
        Objects.equals(this.vaultEventId, vaultEventInfo.vaultEventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaultEventComment, vaultEventId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaultEventInfo {\n");
    
    sb.append("    vaultEventComment: ").append(toIndentedString(vaultEventComment)).append("\n");
    sb.append("    vaultEventId: ").append(toIndentedString(vaultEventId)).append("\n");
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

