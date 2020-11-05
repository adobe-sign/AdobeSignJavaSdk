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


package io.swagger.client.model.users;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.users.UserView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserViewResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:51.296+11:00")
public class UserViewResponse {
  @SerializedName("userViewList")
  private List<UserView> userViewList = null;

  public UserViewResponse userViewList(List<UserView> userViewList) {
    this.userViewList = userViewList;
    return this;
  }

  public UserViewResponse addUserViewListItem(UserView userViewListItem) {
    if (this.userViewList == null) {
      this.userViewList = new ArrayList<UserView>();
    }
    this.userViewList.add(userViewListItem);
    return this;
  }

   /**
   * List of user views
   * @return userViewList
  **/
  @ApiModelProperty(value = "List of user views")
  public List<UserView> getUserViewList() {
    return userViewList;
  }

  public void setUserViewList(List<UserView> userViewList) {
    this.userViewList = userViewList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserViewResponse userViewResponse = (UserViewResponse) o;
    return Objects.equals(this.userViewList, userViewResponse.userViewList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userViewList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserViewResponse {\n");
    
    sb.append("    userViewList: ").append(toIndentedString(userViewList)).append("\n");
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

