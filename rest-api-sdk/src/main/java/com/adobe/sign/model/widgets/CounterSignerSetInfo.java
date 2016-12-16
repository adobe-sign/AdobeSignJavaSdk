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

package com.adobe.sign.model.widgets;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.widgets.CounterSignerInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:30.461+05:30")
public class CounterSignerSetInfo   {
  
  private List<CounterSignerInfo> counterSignerSetMemberInfos = null;

public enum CounterSignerSetRoleEnum {
  SIGNER("SIGNER"),
  APPROVER("APPROVER"),
  DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
  DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER");

  private String value;

  CounterSignerSetRoleEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private CounterSignerSetRoleEnum counterSignerSetRole = null;

  
  /**
   * Information about the members of the counter signer set, currently we support only one member
   **/
  @ApiModelProperty(required = true, value = "Information about the members of the counter signer set, currently we support only one member")
  @JsonProperty("counterSignerSetMemberInfos")
  /**
   * @return List&lt;CounterSignerInfo&gt;
   **/
  public List<CounterSignerInfo> getCounterSignerSetMemberInfos() {
    return counterSignerSetMemberInfos;
  }
  /**
   * Information about the members of the counter signer set, currently we support only one member
   * @param counterSignerSetMemberInfos
   **/
  public void setCounterSignerSetMemberInfos(List<CounterSignerInfo> counterSignerSetMemberInfos) {
    this.counterSignerSetMemberInfos = counterSignerSetMemberInfos;
  }

  
  /**
   * Specify the role of counter signer set
   **/
  @ApiModelProperty(required = true, value = "Specify the role of counter signer set")
  @JsonProperty("counterSignerSetRole")
  /**
   * @return CounterSignerSetRoleEnum
   **/
  public CounterSignerSetRoleEnum getCounterSignerSetRole() {
    return counterSignerSetRole;
  }
  /**
   * Specify the role of counter signer set
   * @param counterSignerSetRole
   **/
  public void setCounterSignerSetRole(CounterSignerSetRoleEnum counterSignerSetRole) {
    this.counterSignerSetRole = counterSignerSetRole;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterSignerSetInfo {\n");
    
    sb.append("    counterSignerSetMemberInfos: ").append(StringUtil.toIndentedString(counterSignerSetMemberInfos)).append("\n");
    sb.append("    counterSignerSetRole: ").append(StringUtil.toIndentedString(counterSignerSetRole)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
