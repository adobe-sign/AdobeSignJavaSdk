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
import com.adobe.sign.model.agreements.UserAgreement;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class UserAgreements   {
  
  private List<UserAgreement> userAgreementList = new ArrayList<UserAgreement>();

  
  /**
   * An array of UserAgreement items
   **/
  @ApiModelProperty(required = true, value = "An array of UserAgreement items")
  @JsonProperty("userAgreementList")
  public List<UserAgreement> getUserAgreementList() {
    return userAgreementList;
  }
  public void setUserAgreementList(List<UserAgreement> userAgreementList) {
    this.userAgreementList = userAgreementList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgreements {\n");
    
    sb.append("    userAgreementList: ").append(StringUtil.toIndentedString(userAgreementList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
