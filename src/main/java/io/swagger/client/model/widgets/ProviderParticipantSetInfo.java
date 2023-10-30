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


package io.swagger.client.model.widgets;

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
 * ProviderParticipantSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:55.369+11:00")
public class ProviderParticipantSetInfo {
  @SerializedName("actionRequired")
  private Boolean actionRequired = null;

  @SerializedName("actionDescription")
  private String actionDescription = null;

  public ProviderParticipantSetInfo actionRequired(Boolean actionRequired) {
    this.actionRequired = actionRequired;
    return this;
  }

   /**
   * It indicates whether it is mandatory or not for the provider participant to provide the details for the unknown participant
   * @return actionRequired
  **/
  @ApiModelProperty(value = "It indicates whether it is mandatory or not for the provider participant to provide the details for the unknown participant")
  public Boolean isActionRequired() {
    return actionRequired;
  }

  public void setActionRequired(Boolean actionRequired) {
    this.actionRequired = actionRequired;
  }

  public ProviderParticipantSetInfo actionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
    return this;
  }

   /**
   * The description for the provider participant who is responsible to provide details like name, email for the unknown participant.
   * @return actionDescription
  **/
  @ApiModelProperty(value = "The description for the provider participant who is responsible to provide details like name, email for the unknown participant.")
  public String getActionDescription() {
    return actionDescription;
  }

  public void setActionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderParticipantSetInfo providerParticipantSetInfo = (ProviderParticipantSetInfo) o;
    return Objects.equals(this.actionRequired, providerParticipantSetInfo.actionRequired) &&
        Objects.equals(this.actionDescription, providerParticipantSetInfo.actionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionRequired, actionDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderParticipantSetInfo {\n");
    
    sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
    sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
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

