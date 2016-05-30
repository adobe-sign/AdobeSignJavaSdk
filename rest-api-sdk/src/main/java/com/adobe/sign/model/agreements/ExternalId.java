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

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class ExternalId   {
  
  private String group = null;
  private String id = null;
  private String namespace = null;

  
  /**
   * An arbitrary value from your system, which can be specified at sending time and then later returned or queried
   **/
  @ApiModelProperty(value = "An arbitrary value from your system, which can be specified at sending time and then later returned or queried")
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  
  /**
   * An arbitrary value from your system, which can be specified at sending time and then later returned or queried
   **/
  @ApiModelProperty(value = "An arbitrary value from your system, which can be specified at sending time and then later returned or queried")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Only supported value for the ExternalID namespace at this time is API_OTHER
   **/
  @ApiModelProperty(value = "Only supported value for the ExternalID namespace at this time is API_OTHER")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalId {\n");
    
    sb.append("    group: ").append(StringUtil.toIndentedString(group)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(StringUtil.toIndentedString(namespace)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
