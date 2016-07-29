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
package com.adobe.sign.model.oAuth;

import io.swagger.annotations.ApiModelProperty;

public class Scope {

  private String target = null;
  private String modifier = null;

  public Scope(String target, String modifier) {
    this.target = target;
    this.modifier = modifier;
  }

  /**
   * Combination of the action and the resource on which that action will be performed.
   */
  @ApiModelProperty(required = true, value = "Combination of the action and the resource on which that action will be performed.")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  /**
   * Access the resource of self, group, account.
   */
  @ApiModelProperty(required = true, value = "Access the resource of self, group, account.")
  public String getModifier() {
    return modifier;
  }
  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public String toString(){
    return target + ":" + modifier;
  }
}
