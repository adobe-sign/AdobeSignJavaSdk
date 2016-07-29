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
package com.adobe.sign.utils;

import com.adobe.sign.api.BaseUrisApi;
import com.adobe.sign.model.baseUris.BaseUriInfo;

public class BaseUriUtils {

  private final static BaseUrisApi baseUrisApi = new BaseUrisApi();

  /**
   * Set the base uri in the SDK Context
   *
   * @throws Exception
   */
  public static void setBaseUri() throws ApiException {
    try {
      BaseUriInfo baseUriInfo = baseUrisApi.getBaseUris(ApiUtils.getHeaderParams());
      Context.setBaseUri(baseUriInfo.getApiAccessPoint());
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.SET_BASE_URI, e);
    }
  }
}
