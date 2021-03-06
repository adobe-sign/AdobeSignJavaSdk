/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


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
import java.util.Date;

/**
 * OfflineDeviceInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class OfflineDeviceInfo {
  @SerializedName("applicationDescription")
  private String applicationDescription = null;

  @SerializedName("deviceDescription")
  private String deviceDescription = null;

  @SerializedName("deviceTime")
  private Date deviceTime = null;

  public OfflineDeviceInfo applicationDescription(String applicationDescription) {
    this.applicationDescription = applicationDescription;
    return this;
  }

   /**
   * Application Description
   * @return applicationDescription
  **/
  @ApiModelProperty(value = "Application Description")
  public String getApplicationDescription() {
    return applicationDescription;
  }

  public void setApplicationDescription(String applicationDescription) {
    this.applicationDescription = applicationDescription;
  }

  public OfflineDeviceInfo deviceDescription(String deviceDescription) {
    this.deviceDescription = deviceDescription;
    return this;
  }

   /**
   * Device Description
   * @return deviceDescription
  **/
  @ApiModelProperty(value = "Device Description")
  public String getDeviceDescription() {
    return deviceDescription;
  }

  public void setDeviceDescription(String deviceDescription) {
    this.deviceDescription = deviceDescription;
  }

  public OfflineDeviceInfo deviceTime(Date deviceTime) {
    this.deviceTime = deviceTime;
    return this;
  }

   /**
   * The device local time. The device time provided should not be before 30 days of current date.Format should be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return deviceTime
  **/
  @ApiModelProperty(value = "The device local time. The device time provided should not be before 30 days of current date.Format should be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getDeviceTime() {
    return deviceTime;
  }

  public void setDeviceTime(Date deviceTime) {
    this.deviceTime = deviceTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineDeviceInfo offlineDeviceInfo = (OfflineDeviceInfo) o;
    return Objects.equals(this.applicationDescription, offlineDeviceInfo.applicationDescription) &&
        Objects.equals(this.deviceDescription, offlineDeviceInfo.deviceDescription) &&
        Objects.equals(this.deviceTime, offlineDeviceInfo.deviceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationDescription, deviceDescription, deviceTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineDeviceInfo {\n");
    
    sb.append("    applicationDescription: ").append(toIndentedString(applicationDescription)).append("\n");
    sb.append("    deviceDescription: ").append(toIndentedString(deviceDescription)).append("\n");
    sb.append("    deviceTime: ").append(toIndentedString(deviceTime)).append("\n");
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

