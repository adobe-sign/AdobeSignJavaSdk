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

package com.adobe.sign.model.workflows;

import com.adobe.sign.utils.StringUtil;
import java.util.*;
import com.adobe.sign.model.workflows.RecipientInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:02.764+05:30")
public class RecipientsInfo   {
  
  private String name = null;
  private List<RecipientInfo> recipients = new ArrayList<RecipientInfo>();

  
  /**
   * Name of the recipient list as returned in workflow description
   **/
  @ApiModelProperty(required = true, value = "Name of the recipient list as returned in workflow description")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required
   **/
  @ApiModelProperty(required = true, value = "A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required")
  @JsonProperty("recipients")
  public List<RecipientInfo> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<RecipientInfo> recipients) {
    this.recipients = recipients;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientsInfo {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    recipients: ").append(StringUtil.toIndentedString(recipients)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
