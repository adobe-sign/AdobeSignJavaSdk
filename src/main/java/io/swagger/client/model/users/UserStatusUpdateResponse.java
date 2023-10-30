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
import java.io.IOException;

/**
 * UserStatusUpdateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:51.296+11:00")
public class UserStatusUpdateResponse {
  /**
   * The result of the attempt to activate or deactivate the user
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    ALREADY_ACTIVE("ALREADY_ACTIVE"),
    
    ALREADY_INACTIVE("ALREADY_INACTIVE"),
    
    OK("OK"),
    
    RESET_PASSWORD_WORKFLOW_INITIATED("RESET_PASSWORD_WORKFLOW_INITIATED"),
    
    SET_PASSWORD_WORKFLOW_INITIATED("SET_PASSWORD_WORKFLOW_INITIATED");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  /**
   * A status value showing the result of this operation
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    CREATED("CREATED"),
    
    PENDING("PENDING"),
    
    UNVERIFIED("UNVERIFIED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("message")
  private String message = null;

  public UserStatusUpdateResponse code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * The result of the attempt to activate or deactivate the user
   * @return code
  **/
  @ApiModelProperty(value = "The result of the attempt to activate or deactivate the user")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public UserStatusUpdateResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * A status value showing the result of this operation
   * @return state
  **/
  @ApiModelProperty(value = "A status value showing the result of this operation")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public UserStatusUpdateResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * String result message if there was no error
   * @return message
  **/
  @ApiModelProperty(value = "String result message if there was no error")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStatusUpdateResponse userStatusUpdateResponse = (UserStatusUpdateResponse) o;
    return Objects.equals(this.code, userStatusUpdateResponse.code) &&
        Objects.equals(this.state, userStatusUpdateResponse.state) &&
        Objects.equals(this.message, userStatusUpdateResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, state, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatusUpdateResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

