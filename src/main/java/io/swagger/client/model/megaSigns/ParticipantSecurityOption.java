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
import io.swagger.client.model.megaSigns.PhoneInfo;
import java.io.IOException;

/**
 * ParticipantSecurityOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:44.788+11:00")
public class ParticipantSecurityOption {
  @SerializedName("password")
  private String password = null;

  /**
   * The authentication method for the participants to have access to view and sign the document. When replacing a participant that has PASSWORD or PHONE authentication specified, you must supply a password or phone number for the new participant, and you cannot change the authentication method
   */
  @JsonAdapter(AuthenticationMethodEnum.Adapter.class)
  public enum AuthenticationMethodEnum {
    NONE("NONE"),
    
    PASSWORD("PASSWORD"),
    
    PHONE("PHONE"),
    
    KBA("KBA"),
    
    WEB_IDENTITY("WEB_IDENTITY"),
    
    ADOBE_SIGN("ADOBE_SIGN"),
    
    GOV_ID("GOV_ID");

    private String value;

    AuthenticationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationMethodEnum fromValue(String text) {
      for (AuthenticationMethodEnum b : AuthenticationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authenticationMethod")
  private AuthenticationMethodEnum authenticationMethod = null;

  @SerializedName("phoneInfo")
  private PhoneInfo phoneInfo = null;

  public ParticipantSecurityOption password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password required for the participant to view and sign the document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. The password will not be returned in GET call. When replacing a participant that has PASSWORD authentication specified, you must supply a password for the new participant.
   * @return password
  **/
  @ApiModelProperty(value = "The password required for the participant to view and sign the document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. The password will not be returned in GET call. When replacing a participant that has PASSWORD authentication specified, you must supply a password for the new participant.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ParticipantSecurityOption authenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * The authentication method for the participants to have access to view and sign the document. When replacing a participant that has PASSWORD or PHONE authentication specified, you must supply a password or phone number for the new participant, and you cannot change the authentication method
   * @return authenticationMethod
  **/
  @ApiModelProperty(value = "The authentication method for the participants to have access to view and sign the document. When replacing a participant that has PASSWORD or PHONE authentication specified, you must supply a password or phone number for the new participant, and you cannot change the authentication method")
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public ParticipantSecurityOption phoneInfo(PhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

   /**
   * The phoneInfo required for the participant to view and sign the document
   * @return phoneInfo
  **/
  @ApiModelProperty(value = "The phoneInfo required for the participant to view and sign the document")
  public PhoneInfo getPhoneInfo() {
    return phoneInfo;
  }

  public void setPhoneInfo(PhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantSecurityOption participantSecurityOption = (ParticipantSecurityOption) o;
    return Objects.equals(this.password, participantSecurityOption.password) &&
        Objects.equals(this.authenticationMethod, participantSecurityOption.authenticationMethod) &&
        Objects.equals(this.phoneInfo, participantSecurityOption.phoneInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, authenticationMethod, phoneInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantSecurityOption {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    phoneInfo: ").append(toIndentedString(phoneInfo)).append("\n");
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

