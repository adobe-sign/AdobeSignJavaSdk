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
 * ShareCreationInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:34.872+11:00")
public class ShareCreationInfo {
  @SerializedName("message")
  private String message = null;

  @SerializedName("email")
  private String email = null;

  public ShareCreationInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Optional message to the sharee
   * @return message
  **/
  @ApiModelProperty(value = "Optional message to the sharee")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ShareCreationInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the member with whom the agreement will be shared
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the member with whom the agreement will be shared")
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
    ShareCreationInfo shareCreationInfo = (ShareCreationInfo) o;
    return Objects.equals(this.message, shareCreationInfo.message) &&
        Objects.equals(this.email, shareCreationInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareCreationInfo {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

