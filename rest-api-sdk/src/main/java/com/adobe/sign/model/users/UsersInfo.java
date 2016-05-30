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

package com.adobe.sign.model.users;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.users.UserInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:54.575+05:30")
public class UsersInfo   {
  
  private List<UserInfo> userInfoList = new ArrayList<UserInfo>();

  
  /**
   * The list of users in the account
   **/
  @ApiModelProperty(required = true, value = "The list of users in the account")
  @JsonProperty("userInfoList")
  public List<UserInfo> getUserInfoList() {
    return userInfoList;
  }
  public void setUserInfoList(List<UserInfo> userInfoList) {
    this.userInfoList = userInfoList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersInfo {\n");
    
    sb.append("    userInfoList: ").append(StringUtil.toIndentedString(userInfoList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
