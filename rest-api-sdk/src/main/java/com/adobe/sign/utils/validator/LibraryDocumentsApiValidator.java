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
   * @throws ApiException
   */
  public static void getLibraryDocumentsValidator() throws ApiException {
  }

  /**
   * Validator for createLibraryDocument API that creates a template that is placed in the user's library for reuse.
   *
   * @param libraryCreationInfo Information about the template that is to be created.
   * @throws ApiException
   */
  public static void createLibraryDocumentValidator(LibraryCreationInfo libraryCreationInfo) throws ApiException {
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
   * @param libraryDocumentId The Id of the library document whose information is to be retrieved.
   * @throws ApiException
   */
  public static void getLibraryDocumentInfoValidator(String libraryDocumentId) throws ApiException {

    ApiValidatorHelper.validateId(libraryDocumentId,
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
  }

  /**
   * Validator for deleteLibraryDocument API that deletes the library document identified by libraryDocumentId.
   *
   * @param libraryDocumentId The Id of the library document which is to be deleted.
   * @throws ApiException
   */
  public static void deleteLibraryDocumentValidator(String libraryDocumentId) throws ApiException {

    ApiValidatorHelper.validateId(libraryDocumentId,
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
  }

  /**
   * Validator for getLibraryDocumentAuditTrail API that retrieves the audit trail of a library document identified by libraryDocumentId.
   *
   * @param libraryDocumentId The Id of library Document whose audit trail is to be retrieved.
   * @throws ApiException
   */
  public static void getLibraryDocumentAuditTrailValidator(String libraryDocumentId) throws ApiException {

    ApiValidatorHelper.validateId(libraryDocumentId,
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
  }

  /**
   * Validator for getCombinedDocument API that gets a single combined PDF document for the documents associated with the library document.
   *
   * @param libraryDocumentId The Id of the library document whose combined document stream is requested.
   * @param auditReport       When set to true, attach an audit report to the signed agreement PDF. Default value is false.
   * @throws ApiException
   */
  public static void getCombinedDocumentValidator(String libraryDocumentId,
                                                  Boolean auditReport) throws ApiException {

    ApiValidatorHelper.validateId(libraryDocumentId,
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
  }

  /**
   * Validator for getDocuments API that retrieves the IDs of all the main and supporting documents of a library document identified by libraryDocumentId.
   *
   * @param libraryDocumentId The Id of library document whose documents are requested.
   * @throws ApiException
   */
  public static void getDocumentsValidator(String libraryDocumentId) throws ApiException {

    ApiValidatorHelper.validateId(libraryDocumentId,
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
  }


  /**
   * Validator for getLibraryDocument API that retrieves the file stream of the specified document of a library document.
   *
   * @param libraryDocumentId The Id of library document which contains the document whose file stream is requested.
   * @param documentId        The Id of the document whose file stream is requested.
   * @throws ApiException
   */
  public static void getLibraryDocumentValidator(String libraryDocumentId,
                                                 String documentId) throws ApiException {

    ApiValidatorHelper.validateId(libraryDocumentId,
                                  SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
    ApiValidatorHelper.validateId(documentId,
                                  SdkErrorCodes.INVALID_DOCUMENT_ID);
  }

  /**
   * Helper method that takes a list of FileInfo objects and validates them.
   */
  private static void validateFileInfo(List<FileInfo> fileInfos) throws ApiException {
    if (fileInfos == null)
      throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

    for (FileInfo fileInfo : fileInfos) {
      // Validating the FileInfo object.
      if (fileInfo == null)
        throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);

      String url = fileInfo.getDocumentURL() == null ? null : fileInfo.getDocumentURL().getUrl();
      ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(),
                                          fileInfo.getLibraryDocumentId(),
                                          fileInfo.getLibraryDocumentName(),
                                          fileInfo.getTransientDocumentId(),
                                          url);
    }

  }
}
