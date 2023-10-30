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
import io.swagger.client.model.megaSigns.ShareCreationResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ShareCreationResponseList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:44.788+11:00")
public class ShareCreationResponseList {
  @SerializedName("shareCreationResponseList")
  private List<ShareCreationResponse> shareCreationResponseList = null;

  public ShareCreationResponseList shareCreationResponseList(List<ShareCreationResponse> shareCreationResponseList) {
    this.shareCreationResponseList = shareCreationResponseList;
    return this;
  }

  public ShareCreationResponseList addShareCreationResponseListItem(ShareCreationResponse shareCreationResponseListItem) {
    if (this.shareCreationResponseList == null) {
      this.shareCreationResponseList = new ArrayList<ShareCreationResponse>();
    }
    this.shareCreationResponseList.add(shareCreationResponseListItem);
    return this;
  }

   /**
   * List of ShareCreationResponse
   * @return shareCreationResponseList
  **/
  @ApiModelProperty(value = "List of ShareCreationResponse")
  public List<ShareCreationResponse> getShareCreationResponseList() {
    return shareCreationResponseList;
  }

  public void setShareCreationResponseList(List<ShareCreationResponse> shareCreationResponseList) {
    this.shareCreationResponseList = shareCreationResponseList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareCreationResponseList shareCreationResponseList = (ShareCreationResponseList) o;
    return Objects.equals(this.shareCreationResponseList, shareCreationResponseList.shareCreationResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareCreationResponseList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareCreationResponseList {\n");
    
    sb.append("    shareCreationResponseList: ").append(toIndentedString(shareCreationResponseList)).append("\n");
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

