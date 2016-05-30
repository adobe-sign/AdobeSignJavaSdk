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

import java.io.File;

import com.adobe.sign.api.TransientDocumentsApi;
import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;

public class TransientDocumentUtils {

  private final static TransientDocumentsApi transientDocumentsApi = new TransientDocumentsApi();

  /**
   * Uploads a document and obtains the document ID.
   * The document uploaded through this call is referred to as transient since it is available only for 7 days after the upload.
   * The returned transient document ID can be used to refer to the document in api calls like create agreements where uploaded file needs to be referred.
   * The transient document request is a multipart request consisting of three parts - filename, mime type and the file stream.
   * You can only upload one file at a time in this request.
   * @param dirName name of the directory containing the file
   * @param fileName name of the file
   * @return TransientDocumentResponse
   */
  public static TransientDocumentResponse createTransientDocument (String dirName,
                                                                   String fileName) throws Exception {
    try {
      //Get a reference to the file to be uploaded to Adobe Sign.
      String pathToFile = dirName + fileName;

      //Create a file object
      File file = new File(pathToFile);

      //Make API call to create transient document.
      TransientDocumentResponse  transientDocumentResponse = transientDocumentsApi.createTransientDocument(Constants.ACCESS_TOKEN,
                                                                                                           file.getAbsoluteFile(),
                                                                                                           Constants.X_API_USER,
                                                                                                           fileName,
                                                                                                           Constants.MIME_TYPE_PDF);
      return transientDocumentResponse;
    }
    catch (Exception e) {
      System.err.println(Errors.CREATE_TRANSIENT_DOCUMENT);
      throw new Exception(e);
    }
  }
}
