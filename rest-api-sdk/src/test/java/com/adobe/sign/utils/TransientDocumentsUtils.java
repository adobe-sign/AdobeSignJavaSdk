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

import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.TransientDocumentsApi;
import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;

public class TransientDocumentsUtils extends ApiUtils {

  private static TransientDocumentsApi transientDocumentsApi = new TransientDocumentsApi();
  private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();

  public static String createTransientDocumentResource(String transientDocumentName) throws ApiException {
    String transientDocumentId = null;

    TransientDocumentResponse response = transientDocumentsApi.createTransientDocument(headers,
                                                                                       TestData.SAMPLE_FILE.getAbsoluteFile(),
                                                                                       transientDocumentName,
                                                                                       TestData.VALID_MIME);
    transientDocumentId = response.getTransientDocumentId();

    return transientDocumentId;
  }

  public static TransientDocumentsApi getTransientDocumentsApi() {
    return transientDocumentsApi;
  }

}
