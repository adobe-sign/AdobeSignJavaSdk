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
import io.swagger.client.model.widgets.ParticipantSecurityOption;
import java.io.IOException;
import java.util.Date;

/**
 * DetailedParticipantInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:55.369+11:00")
public class DetailedParticipantInfo {
  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private Boolean self = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("securityOption")
  private ParticipantSecurityOption securityOption = null;

  public DetailedParticipantInfo createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The date when the participant was added. This will be returned as part of GET call but is ignored if passed as part of PUT call.
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date when the participant was added. This will be returned as part of GET call but is ignored if passed as part of PUT call.")
  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public DetailedParticipantInfo hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * True if the agreement is hidden for the user that is calling the API. Only returned if self is true. Ignored (not required) if modifying a participant (PUT).
   * @return hidden
  **/
  @ApiModelProperty(value = "True if the agreement is hidden for the user that is calling the API. Only returned if self is true. Ignored (not required) if modifying a participant (PUT).")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public DetailedParticipantInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the participant, if available. This cannot be changed as part of the PUT call.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the participant, if available. This cannot be changed as part of the PUT call.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedParticipantInfo self(Boolean self) {
    this.self = self;
    return this;
  }

   /**
   * True if this participant is the same user that is calling the API. Returned as part of Get. Ignored (not required) if modifying a participant set (PUT).
   * @return self
  **/
  @ApiModelProperty(value = "True if this participant is the same user that is calling the API. Returned as part of Get. Ignored (not required) if modifying a participant set (PUT).")
  public Boolean isSelf() {
    return self;
  }

  public void setSelf(Boolean self) {
    this.self = self;
  }

  public DetailedParticipantInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The company of the participant, if available. This cannot be changed as part of the PUT call.
   * @return company
  **/
  @ApiModelProperty(value = "The company of the participant, if available. This cannot be changed as part of the PUT call.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public DetailedParticipantInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the participant. This will be returned as part of Get call but is not mandatory to be passed as part of PUT call for agreements/{id}/members/participantSets/{id}.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the participant. This will be returned as part of Get call but is not mandatory to be passed as part of PUT call for agreements/{id}/members/participantSets/{id}.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DetailedParticipantInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user ID of the participant. This will be returned as part of GET call but is ignored if passed as part of PUT call.
   * @return userId
  **/
  @ApiModelProperty(value = "The user ID of the participant. This will be returned as part of GET call but is ignored if passed as part of PUT call.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public DetailedParticipantInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the participant. In case of modifying a participant set (PUT) this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow (legacy agreements) that were created using fax as input
   * @return email
  **/
  @ApiModelProperty(value = "Email of the participant. In case of modifying a participant set (PUT) this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow (legacy agreements) that were created using fax as input")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DetailedParticipantInfo securityOption(ParticipantSecurityOption securityOption) {
    this.securityOption = securityOption;
    return this;
  }

   /**
   * Security options that apply to the participant.
   * @return securityOption
  **/
  @ApiModelProperty(value = "Security options that apply to the participant.")
  public ParticipantSecurityOption getSecurityOption() {
    return securityOption;
  }

  public void setSecurityOption(ParticipantSecurityOption securityOption) {
    this.securityOption = securityOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedParticipantInfo detailedParticipantInfo = (DetailedParticipantInfo) o;
    return Objects.equals(this.createdDate, detailedParticipantInfo.createdDate) &&
        Objects.equals(this.hidden, detailedParticipantInfo.hidden) &&
        Objects.equals(this.name, detailedParticipantInfo.name) &&
        Objects.equals(this.self, detailedParticipantInfo.self) &&
        Objects.equals(this.company, detailedParticipantInfo.company) &&
        Objects.equals(this.id, detailedParticipantInfo.id) &&
        Objects.equals(this.userId, detailedParticipantInfo.userId) &&
        Objects.equals(this.email, detailedParticipantInfo.email) &&
        Objects.equals(this.securityOption, detailedParticipantInfo.securityOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, hidden, name, self, company, id, userId, email, securityOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedParticipantInfo {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    securityOption: ").append(toIndentedString(securityOption)).append("\n");
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

