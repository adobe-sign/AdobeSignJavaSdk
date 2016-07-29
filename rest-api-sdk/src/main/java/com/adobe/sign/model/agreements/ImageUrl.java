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
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T18:56:02.594+05:30")
public class ImageUrl   {
  
  private Boolean imagesAvailable = null;

public enum ImageSizeEnum {
  FIXED_WIDTH_50PX("FIXED_WIDTH_50px"),
  FIXED_WIDTH_250PX("FIXED_WIDTH_250px"),
  FIXED_WIDTH_675PX("FIXED_WIDTH_675px"),
  ZOOM_50_PERCENT("ZOOM_50_PERCENT"),
  ZOOM_75_PERCENT("ZOOM_75_PERCENT"),
  ZOOM_100_PERCENT("ZOOM_100_PERCENT"),
  ZOOM_125_PERCENT("ZOOM_125_PERCENT"),
  ZOOM_150_PERCENT("ZOOM_150_PERCENT"),
  ZOOM_200_PERCENT("ZOOM_200_PERCENT");

  private String value;

  ImageSizeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ImageSizeEnum imageSize = null;
  private List<String> urls = new ArrayList<String>();

  
  /**
   * true if images for the associated image size is available, else false.
   **/
  @ApiModelProperty(value = "true if images for the associated image size is available, else false.")
  @JsonProperty("imagesAvailable")
  public Boolean getImagesAvailable() {
    return imagesAvailable;
  }
  public void setImagesAvailable(Boolean imagesAvailable) {
    this.imagesAvailable = imagesAvailable;
  }

  
  /**
   * ImageSize corresponding to the imageUrl returned
   **/
  @ApiModelProperty(value = "ImageSize corresponding to the imageUrl returned")
  @JsonProperty("imageSize")
  public ImageSizeEnum getImageSize() {
    return imageSize;
  }
  public void setImageSize(ImageSizeEnum imageSize) {
    this.imageSize = imageSize;
  }

  
  /**
   * An ordered list of image urls (one per page).
   **/
  @ApiModelProperty(required = true, value = "An ordered list of image urls (one per page).")
  @JsonProperty("urls")
  public List<String> getUrls() {
    return urls;
  }
  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageUrl {\n");
    
    sb.append("    imagesAvailable: ").append(StringUtil.toIndentedString(imagesAvailable)).append("\n");
    sb.append("    imageSize: ").append(StringUtil.toIndentedString(imageSize)).append("\n");
    sb.append("    urls: ").append(StringUtil.toIndentedString(urls)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
