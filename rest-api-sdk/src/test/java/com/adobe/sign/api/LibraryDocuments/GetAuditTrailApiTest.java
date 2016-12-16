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

/**
 * Junit test cases for Get Audit Trail endpoint.
 */

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.LibraryDocumentsApi;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class GetAuditTrailApiTest {

  private static LibraryDocumentsApi libraryDocumentsApi = null;
  private static String libraryDocumentId = null;


  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
  }

  /**
   * Test for retrieving the audit trail of a library document through the getLibraryDocumentAuditTrail endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    try {
      byte[] auditTrail = libraryDocumentsApi.getLibraryDocumentAuditTrail(ApiUtils.getNullAccessTokenHeaderParams(),
                                                                           libraryDocumentId);
      assertNotNull(auditTrail);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      byte[] auditTrail = libraryDocumentsApi.getLibraryDocumentAuditTrail(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                                                           libraryDocumentId);
      assertNotNull(auditTrail);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the audit trail of a library document through the getLibraryDocumentAuditTrail endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    try {
      byte[] auditTrail = libraryDocumentsApi.getLibraryDocumentAuditTrail(ApiUtils.getEmptyXApiUserHeaderParams(),
                                                                           libraryDocumentId);
      assertNotNull(auditTrail);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the audit trail of a library document through the getLibraryDocumentAuditTrail endpoint. Negative scenarios covered:
   * INVALID_LIBRARYDOCUMENT_ID: empty and null libraryDocumentId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidLibraryDocumentId() throws ApiException {
    try {
      byte[] auditTrail = libraryDocumentsApi.getLibraryDocumentAuditTrail(ApiUtils.getValidHeaderParams(),
                                                                           TestData.EMPTY_PARAM);
      assertNotNull(auditTrail);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      byte[] auditTrail = libraryDocumentsApi.getLibraryDocumentAuditTrail(ApiUtils.getValidHeaderParams(),
                                                                           TestData.NULL_PARAM);
      assertNotNull(auditTrail);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for retrieving the audit trail of a library document through the getLibraryDocumentAuditTrail endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testAuditTrail() throws ApiException {
    try {
      byte[] auditTrail = libraryDocumentsApi.getLibraryDocumentAuditTrail(ApiUtils.getValidHeaderParams(),
                                                                           libraryDocumentId);
      assertNotNull(auditTrail);
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
