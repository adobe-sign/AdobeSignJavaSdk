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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:57.177+05:30")
public class CounterSignerSetInfo   {
  
  private List<CounterSignerInfo> counterSignerSetMemberInfos = new ArrayList<CounterSignerInfo>();

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
  public List<CounterSignerInfo> getCounterSignerSetMemberInfos() {
    return counterSignerSetMemberInfos;
  }
  public void setCounterSignerSetMemberInfos(List<CounterSignerInfo> counterSignerSetMemberInfos) {
    this.counterSignerSetMemberInfos = counterSignerSetMemberInfos;
  }

  
  /**
   * Specify the role of counter signer set
   **/
  @ApiModelProperty(required = true, value = "Specify the role of counter signer set")
  @JsonProperty("counterSignerSetRole")
  public CounterSignerSetRoleEnum getCounterSignerSetRole() {
    return counterSignerSetRole;
  }
  public void setCounterSignerSetRole(CounterSignerSetRoleEnum counterSignerSetRole) {
    this.counterSignerSetRole = counterSignerSetRole;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterSignerSetInfo {\n");
    
    sb.append("    counterSignerSetMemberInfos: ").append(StringUtil.toIndentedString(counterSignerSetMemberInfos)).append("\n");
    sb.append("    counterSignerSetRole: ").append(StringUtil.toIndentedString(counterSignerSetRole)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
