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
package com.adobe.sign.utils.validator;

import java.io.File;

import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.StringUtil;

/**
 * Validator class for TransientDocumentsApi. The main purpose of this class is to check the validity of the parameters passed to 
 * the transientDocuments API and throw ApiException with required error messages if the validation fails.
 */
public class TransientDocumentsApiValidator {
  
  /**
   * Validator for createTransientDocument API that Uploads a document and obtains the document's ID.
   * 
   * @param accessToken An OAuth Access Token.
   * @param file The uploaded file.
   * @param xApiUser The userId or email of API caller.
   * @param fileName Name of the uploaded file.
   * @param mimeType The mime type of the document being uploaded.
   * @throws ApiException
   */
  public static void createTransientDocumentValidator (String accessToken, 
                                                       File file, 
                                                       String xApiUser, 
                                                       String fileName, 
                                                       String mimeType) throws ApiException {
    
    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);    
    ApiValidatorHelper.validateParameter(fileName, 
                                         SdkErrorCodes.NO_FILE_NAME);
    
    ApiValidatorHelper.validateParameter(file, 
                                      SdkErrorCodes.NO_FILE_CONTENT);
    
    int extensionPos = file.getName().lastIndexOf(".");
   
    if(extensionPos < 0 && StringUtil.isEmpty(mimeType))
      throw new ApiException(SdkErrorCodes.NO_MEDIA_TYPE);
  }

}
