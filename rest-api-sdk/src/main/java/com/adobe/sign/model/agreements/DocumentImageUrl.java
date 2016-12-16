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
import com.adobe.sign.model.agreements.ImageUrl;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:29.604+05:30")
public class DocumentImageUrl   {
  
  private List<ImageUrl> imageUrls = null;

  
  /**
   * A list of objects representing all image URLs.(one per imagesize).
   **/
  @ApiModelProperty(required = true, value = "A list of objects representing all image URLs.(one per imagesize).")
  @JsonProperty("imageUrls")
  /**
   * @return List&lt;ImageUrl&gt;
   **/
  public List<ImageUrl> getImageUrls() {
    return imageUrls;
  }
  /**
   * A list of objects representing all image URLs.(one per imagesize).
   * @param imageUrls
   **/
  public void setImageUrls(List<ImageUrl> imageUrls) {
    this.imageUrls = imageUrls;
  }

  

  @Override
  /**
   * A string representation of the object.
   * @return String
   **/
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentImageUrl {\n");
    
    sb.append("    imageUrls: ").append(StringUtil.toIndentedString(imageUrls)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
