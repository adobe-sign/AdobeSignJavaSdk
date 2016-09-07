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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:49.202+05:30")
public class AgreementStatusUpdateResponse   {
  
  private String result = null;

  
  /**
   * A status value showing the result of this operation
   **/
  @ApiModelProperty(required = true, value = "A status value showing the result of this operation")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementStatusUpdateResponse {\n");
    
    sb.append("    result: ").append(StringUtil.toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
