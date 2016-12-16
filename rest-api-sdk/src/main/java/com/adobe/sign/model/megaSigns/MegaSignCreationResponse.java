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

package com.adobe.sign.model.megaSigns;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A JSON that contains the id of the newly created Mega Sign
 **/
@ApiModel(description = "A JSON that contains the id of the newly created Mega Sign")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:31.898+05:30")
public class MegaSignCreationResponse   {
  
  private String megaSignId = null;

  
  /**
   * Unique identifier of the MegaSign parent agreement
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the MegaSign parent agreement")
  @JsonProperty("megaSignId")
  /**
   * @return String
   **/
  public String getMegaSignId() {
    return megaSignId;
  }
  /**
   * Unique identifier of the MegaSign parent agreement
   * @param megaSignId
   **/
  public void setMegaSignId(String megaSignId) {
    this.megaSignId = megaSignId;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSignCreationResponse {\n");
    
    sb.append("    megaSignId: ").append(StringUtil.toIndentedString(megaSignId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
