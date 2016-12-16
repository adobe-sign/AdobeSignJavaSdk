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

package com.adobe.sign.api.LibraryDocuments;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import com.adobe.sign.api.LibraryDocumentsApi;
import com.adobe.sign.model.libraryDocuments.FileInfo;
import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
import com.adobe.sign.model.libraryDocuments.URLFileInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.TransientDocumentsUtils;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Create Library Documents endpoint.
 */
public class CreateLibraryDocumentsApiTest {

  private static LibraryDocumentsApi libraryDocumentsApi = null;
  private static String libraryDocumentId = null;
  private static String transientDocumentId = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();

    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
  }

  /**
   * Test for creating a libraryDocument through the createLibraryDocument endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    LibraryCreationInfo creationInfo = new LibraryCreationInfo();

    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                                                                  creationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                                                                  creationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a libraryDocument through the createLibraryDocument endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    LibraryCreationInfo creationInfo = new LibraryCreationInfo();

    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                                                                  creationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a libraryDocument through the createLibraryDocument endpoint. Negative scenarios covered:
   * INVALID_FILE_INFO: FileInfo with all 4 parameters null, FileInfo with more than 1 parameter non-empty.
   * URL_INVALID: Invalid url specified in FileInfo's getDocumentUrl parameter.
   * MISSING_REQUIRED_PARAM: Null document name, null SharingType, null TemplateType.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementCreationInfo() throws ApiException {
    FileInfo fileInfo = new FileInfo();

    LibraryCreationInfo libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(fileInfo,
                                                                                           ApiUtils.getLibraryDocumentName());

    // FileInfo with all 4 parameters null.
    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    URLFileInfo url = new URLFileInfo();
    url.setUrl(TestData.INVALID_URL);
    fileInfo.setDocumentURL(url);

    libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(fileInfo,
                                                                       ApiUtils.getLibraryDocumentName());

    // Invalid url specified in FileInfo's getDocumentUrl parameter.
    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setLibraryDocumentId(libraryDocumentId);
    fileInfo.setTransientDocumentId(transientDocumentId);
    fileInfo.setDocumentURL(null);

    libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(fileInfo,
                                                                       ApiUtils.getLibraryDocumentName());

    // FileInfo with more than 1 parameter non-empty.
    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }


    libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(TestData.NULL_PARAM);

    // Name null in libraryDocumentCreationInfo
    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(null,
                                                                       LibraryDocumentCreationInfo.LibrarySharingModeEnum.USER,
                                                                       ApiUtils.getLibraryDocumentName());

    // SharingType null in libraryDocumentCreationInfo
    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(Arrays.asList(LibraryDocumentCreationInfo.LibraryTemplateTypesEnum.DOCUMENT),
                                                                       null,
                                                                       ApiUtils.getLibraryDocumentName());

    // TemplateType null in libraryDocumentCreationInfo
    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);

    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

  }

  /**
   * Test for creating a libraryDocument through the createLibraryDocument endpoint.
   * <p>
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateLibraryDocument() throws ApiException {
    LibraryCreationInfo libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(ApiUtils.getLibraryDocumentName());

    try {
      LibraryDocumentCreationResponse libraryDocumentCreationResponse = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(),
                                                                                                                  libraryCreationInfo);
      assertNotNull(libraryDocumentCreationResponse);
      assertNotNull(libraryDocumentCreationResponse.getLibraryDocumentId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
