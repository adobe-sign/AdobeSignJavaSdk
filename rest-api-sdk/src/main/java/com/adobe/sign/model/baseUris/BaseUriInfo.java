/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.model.baseUris;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:37.040+05:30")
public class BaseUriInfo   {
  
  private String apiAccessPoint = null;
  private String webAccessPoint = null;

  
  /**
   * The access point from where other APIs need to be accessed. In case other APIs are accessed from a different end point, it will be considered an invalid request.
   **/
  @ApiModelProperty(required = true, value = "The access point from where other APIs need to be accessed. In case other APIs are accessed from a different end point, it will be considered an invalid request.")
  @JsonProperty("api_access_point")
  /**
   * @return String
   **/
  public String getApiAccessPoint() {
    return apiAccessPoint;
  }
  /**
   * The access point from where other APIs need to be accessed. In case other APIs are accessed from a different end point, it will be considered an invalid request.
   * @param apiAccessPoint
   **/
  public void setApiAccessPoint(String apiAccessPoint) {
    this.apiAccessPoint = apiAccessPoint;
  }

  
  /**
   * The access point from where Adobe Sign website can be be accessed.
   **/
  @ApiModelProperty(required = true, value = "The access point from where Adobe Sign website can be be accessed.")
  @JsonProperty("web_access_point")
  /**
   * @return String
   **/
  public String getWebAccessPoint() {
    return webAccessPoint;
  }
  /**
   * The access point from where Adobe Sign website can be be accessed.
   * @param webAccessPoint
   **/
  public void setWebAccessPoint(String webAccessPoint) {
    this.webAccessPoint = webAccessPoint;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseUriInfo {\n");
    
    sb.append("    apiAccessPoint: ").append(StringUtil.toIndentedString(apiAccessPoint)).append("\n");
    sb.append("    webAccessPoint: ").append(StringUtil.toIndentedString(webAccessPoint)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
