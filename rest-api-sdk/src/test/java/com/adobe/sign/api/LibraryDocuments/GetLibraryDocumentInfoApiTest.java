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

import com.adobe.sign.api.LibraryDocumentsApi;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentInfo;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get Library Document Info API.
 */
public class GetLibraryDocumentInfoApiTest {
  
  private LibraryDocumentsApi libraryDocumentsApi = null;
  private String libraryDocumentId = null;

  @Before
  public void setup() throws ApiException {
    libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
  }
  
  /**
   * Test for retrieving the details of the library document through the getLibraryDocumentInfo endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      libraryDocumentsApi.getLibraryDocumentInfo(TestData.NULL_PARAM,
                                                 libraryDocumentId,
                                                 TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      libraryDocumentsApi.getLibraryDocumentInfo(TestData.EMPTY_PARAM,
                                                 libraryDocumentId,
                                                 TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the details of the library document through the getLibraryDocumentInfo endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      libraryDocumentsApi.getLibraryDocumentInfo(TestData.ACCESS_TOKEN,
                                                 libraryDocumentId,
                                                 TestData.EMPTY_PARAM);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the details of the library document through the getLibraryDocumentInfo endpoint. Negative scenarios covered:
   * INVALID_LIBRARYDOCUMENT_ID: empty and null libraryDocumentId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidLibraryDocumentId() throws ApiException {
    try {
      libraryDocumentsApi.getLibraryDocumentInfo(TestData.ACCESS_TOKEN,
                                                 TestData.EMPTY_PARAM,
                                                 TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      libraryDocumentsApi.getLibraryDocumentInfo(TestData.ACCESS_TOKEN,
                                                 TestData.NULL_PARAM,
                                                 TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the details of the library document through the getLibraryDocumentInfo endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testLibraryDocumentInfo() throws ApiException {
    try {
      LibraryDocumentInfo libraryDocumentInfo = libraryDocumentsApi.getLibraryDocumentInfo(TestData.ACCESS_TOKEN,
                                                                                           libraryDocumentId,
                                                                                           TestData.X_API_HEADER);
      assertNotNull(libraryDocumentInfo);
      assertNotNull(libraryDocumentInfo.getLibraryDocumentId());
    } 
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
