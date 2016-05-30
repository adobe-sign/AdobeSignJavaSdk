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

import java.util.List;

import com.adobe.sign.model.libraryDocuments.FileInfo;
import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo;
import com.adobe.sign.utils.ApiException;

/**
 * Validator class for LibraryDocumentsApi. The main purpose of this class is to check the validity of the parameters passed to the libraryDocuments API
 * and throw ApiException with required error messages if the validation fails.
 */
public class LibraryDocumentsApiValidator {

  /**
   * Validator for libraryDocuments API that retrieves library documents of the user.
   *
   * @param accessToken An OAuth Access Token.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getLibraryDocumentsValidator (String accessToken,
                                                   String xApiUser) throws ApiException {

    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
  }

  /**
   * Validator for createLibraryDocument API that creates a template that is placed in the user's library for reuse.
   * 
   * @param accessToken An OAuth Access Token.
   * @param libraryCreationInfo Information about the template that is to be created.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void createLibraryDocumentValidator (String accessToken, 
                                                     LibraryCreationInfo libraryCreationInfo, 
                                                     String xApiUser) throws ApiException {

    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    ApiValidatorHelper.validateParameter(libraryCreationInfo);

    LibraryDocumentCreationInfo libraryDocumentCreationInfo = libraryCreationInfo.getLibraryDocumentCreationInfo();

    validateFileInfo(libraryDocumentCreationInfo.getFileInfos());

    ApiValidatorHelper.validateParameter(libraryDocumentCreationInfo.getLibrarySharingMode());
    ApiValidatorHelper.validateParameter(libraryDocumentCreationInfo.getLibraryTemplateTypes());

    ApiValidatorHelper.validateParameter(libraryDocumentCreationInfo.getName());

  }

  /**
   * Validator for getLibraryDocumentInfo API that retrieves the details of the library document identified by libraryDocumentId.
   *
   * @param accessToken An OAuth Access Token.
   * @param libraryDocumentId The Id of the library document whose information is to be retrieved.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getLibraryDocumentInfoValidator (String accessToken,
                                                      String libraryDocumentId,
                                                      String xApiUser) throws ApiException {

    validateCommonLibraryDocumentParameters(accessToken, libraryDocumentId, xApiUser);
  }

  /**
   * Validator for deleteLibraryDocument API that deletes the library document identified by libraryDocumentId.
   *
   * @param accessToken An OAuth Access Token.
   * @param libraryDocumentId The Id of the library document which is to be deleted.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void deleteLibraryDocumentValidator (String accessToken,
                                                     String libraryDocumentId,
                                                     String xApiUser) throws ApiException {

    validateCommonLibraryDocumentParameters(accessToken, libraryDocumentId, xApiUser);
  }

  /**
   * Validator for getLibraryDocumentAuditTrail API that retrieves the audit trail of a library document identified by libraryDocumentId.
   *
   * @param accessToken An OAuth Access Token.
   * @param libraryDocumentId The Id of library Document whose audit trail is to be retrieved.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getLibraryDocumentAuditTrailValidator(String accessToken,
                                                           String libraryDocumentId,
                                                           String xApiUser) throws ApiException {

    validateCommonLibraryDocumentParameters(accessToken, libraryDocumentId, xApiUser);
  }

  /**
   * Validator for getCombinedDocument API that gets a single combined PDF document for the documents associated with the library document.
   *
   * @param accessToken An OAuth Access Token.
   * @param libraryDocumentId The Id of the library document whose combined document stream is requested.
   * @param xApiUser The userId or email of API caller.
   * @param auditReport When set to true, attach an audit report to the signed agreement PDF. Default value is false.
   * @throws ApiException
   */
  public static void getCombinedDocumentValidator (String accessToken,
                                                   String libraryDocumentId,
                                                   String xApiUser,
                                                   Boolean auditReport) throws ApiException {

    validateCommonLibraryDocumentParameters(accessToken, libraryDocumentId, xApiUser);
  }

  /**
   * Validator for getDocuments API that retrieves the IDs of all the main and supporting documents of a library document identified by libraryDocumentId.
   *
   * @param accessToken An OAuth Access Token.
   * @param libraryDocumentId The Id of library document whose documents are requested.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getDocumentsValidator (String accessToken,
                                            String libraryDocumentId,
                                            String xApiUser) throws ApiException {

    validateCommonLibraryDocumentParameters(accessToken, libraryDocumentId, xApiUser);
  }


  /**
   * Validator for getLibraryDocument API that retrieves the file stream of the specified document of a library document.
   *
   * @param accessToken An OAuth Access Token.
   * @param libraryDocumentId The Id of library document which contains the document whose file stream is requested.
   * @param documentId The Id of the document whose file stream is requested.
   * @param xApiUser The userId or email of API caller.
   * @throws ApiException
   */
  public static void getLibraryDocumentValidator (String accessToken,
                                                  String libraryDocumentId,
                                                  String documentId,
                                                  String xApiUser) throws ApiException {

    validateCommonLibraryDocumentParameters(accessToken, libraryDocumentId, xApiUser);
    ApiValidatorHelper.validateId(documentId, 
                                  SdkErrorCodes.INVALID_DOCUMENT_ID);
  }

  // Helper methods
  private static void validateCommonLibraryDocumentParameters(String accessToken,
                                                              String libraryDocumentId,
                                                              String xApiUser) throws ApiException {

    ApiValidatorHelper.validateCommonParameters(accessToken, xApiUser);
    ApiValidatorHelper.validateId(libraryDocumentId, 
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
  }
  
  /**
   * Helper method that takes a list of FileInfo objects and validates them.
   */
  private static void validateFileInfo(List<FileInfo> fileInfos) throws ApiException {
    if(fileInfos == null)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
    
    for(FileInfo fileInfo : fileInfos) {
      // Validating the FileInfo object.
      if(fileInfo == null)
        throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
      
      String url = fileInfo.getDocumentURL() == null? null: fileInfo.getDocumentURL().getUrl();
      ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(), 
                                          fileInfo.getLibraryDocumentId(), 
                                          fileInfo.getLibraryDocumentName(), 
                                          fileInfo.getTransientDocumentId(), 
                                          url);
    }
   
 }
}
