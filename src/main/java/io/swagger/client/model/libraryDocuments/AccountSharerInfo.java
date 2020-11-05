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


package io.swagger.client.model.libraryDocuments;

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
import java.util.List;

/**
 * AccountSharerInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:41.998+11:00")
public class AccountSharerInfo {
  /**
   * Gets or Sets permissions
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    VIEW("VIEW"),
    
    SEND("SEND"),
    
    MODIFY("MODIFY");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String text) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permissions")
  private List<PermissionsEnum> permissions = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("email")
  private String email = null;

  public AccountSharerInfo permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AccountSharerInfo addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<PermissionsEnum>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A list of permissions given for this account sharing.
   * @return permissions
  **/
  @ApiModelProperty(value = "A list of permissions given for this account sharing.")
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public AccountSharerInfo fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of this account sharer.
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name of this account sharer.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public AccountSharerInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * A unique identifier of the user resource for REST APIs as issued by Sign.
   * @return userId
  **/
  @ApiModelProperty(value = "A unique identifier of the user resource for REST APIs as issued by Sign.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AccountSharerInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSharerInfo accountSharerInfo = (AccountSharerInfo) o;
    return Objects.equals(this.permissions, accountSharerInfo.permissions) &&
        Objects.equals(this.fullName, accountSharerInfo.fullName) &&
        Objects.equals(this.userId, accountSharerInfo.userId) &&
        Objects.equals(this.email, accountSharerInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, fullName, userId, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharerInfo {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

