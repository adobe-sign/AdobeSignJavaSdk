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
import com.adobe.sign.model.libraryDocuments.Documents;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Get Documents API.
 */
public class GetDocumentsApiTest {
  
  private LibraryDocumentsApi libraryDocumentsApi = null;
  private String libraryDocumentId = null;

  @Before
  public void setup() throws ApiException {
    libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
  }
  
  /**
   * Test for retrieving the IDs of all the main and supporting documents of a library document through the getDocuments endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      libraryDocumentsApi.getDocuments(TestData.NULL_PARAM,
                                       libraryDocumentId,
                                       TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      libraryDocumentsApi.getDocuments(TestData.EMPTY_PARAM,
                                       libraryDocumentId,
                                       TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of a library document through the getDocuments endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      libraryDocumentsApi.getDocuments(TestData.ACCESS_TOKEN,
                                       libraryDocumentId,
                                       TestData.EMPTY_PARAM);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of a library document through the getDocuments endpoint. Negative scenarios covered:
   * INVALID_LIBRARYDOCUMENT_ID: empty and null libraryDocumentId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidLibraryDocumentId() throws ApiException {
    try {
      libraryDocumentsApi.getDocuments(TestData.ACCESS_TOKEN,
                                       TestData.EMPTY_PARAM,
                                       TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      libraryDocumentsApi.getDocuments(TestData.ACCESS_TOKEN,
                                       TestData.NULL_PARAM,
                                       TestData.X_API_HEADER);
    } 
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the IDs of all the main and supporting documents of a library document through the getDocuments endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testDocuments() throws ApiException {
    try {
      Documents documents  = libraryDocumentsApi.getDocuments(TestData.ACCESS_TOKEN,
                                                              libraryDocumentId,
                                                              TestData.X_API_HEADER);
      assertNotNull(documents);
    } 
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
