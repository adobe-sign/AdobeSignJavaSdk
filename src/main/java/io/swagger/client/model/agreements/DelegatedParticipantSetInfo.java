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
import io.swagger.client.model.agreements.DelegatedParticipantInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DelegatedParticipantSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:34.872+11:00")
public class DelegatedParticipantSetInfo {
  @SerializedName("privateMessage")
  private String privateMessage = null;

  @SerializedName("memberInfos")
  private List<DelegatedParticipantInfo> memberInfos = null;

  public DelegatedParticipantSetInfo privateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
    return this;
  }

   /**
   * Participant set&#39;s private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call.
   * @return privateMessage
  **/
  @ApiModelProperty(value = "Participant set's private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call.")
  public String getPrivateMessage() {
    return privateMessage;
  }

  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  public DelegatedParticipantSetInfo memberInfos(List<DelegatedParticipantInfo> memberInfos) {
    this.memberInfos = memberInfos;
    return this;
  }

  public DelegatedParticipantSetInfo addMemberInfosItem(DelegatedParticipantInfo memberInfosItem) {
    if (this.memberInfos == null) {
      this.memberInfos = new ArrayList<DelegatedParticipantInfo>();
    }
    this.memberInfos.add(memberInfosItem);
    return this;
  }

   /**
   * Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set
   * @return memberInfos
  **/
  @ApiModelProperty(value = "Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set")
  public List<DelegatedParticipantInfo> getMemberInfos() {
    return memberInfos;
  }

  public void setMemberInfos(List<DelegatedParticipantInfo> memberInfos) {
    this.memberInfos = memberInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegatedParticipantSetInfo delegatedParticipantSetInfo = (DelegatedParticipantSetInfo) o;
    return Objects.equals(this.privateMessage, delegatedParticipantSetInfo.privateMessage) &&
        Objects.equals(this.memberInfos, delegatedParticipantSetInfo.memberInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateMessage, memberInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegatedParticipantSetInfo {\n");
    
    sb.append("    privateMessage: ").append(toIndentedString(privateMessage)).append("\n");
    sb.append("    memberInfos: ").append(toIndentedString(memberInfos)).append("\n");
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

