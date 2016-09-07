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

package com.adobe.sign.api.MegaSigns;

import static com.adobe.sign.utils.MegaSignUtils.getMegaSignCreationRequest;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.MegaSignsApi;
import com.adobe.sign.model.megaSigns.FileInfo;
import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
import com.adobe.sign.model.megaSigns.PostSignOptions;
import com.adobe.sign.model.megaSigns.URLFileInfo;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.MegaSignUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.TransientDocumentsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Post MegaSign APIs.
 */
public class PostMegaSignApiTest {
  
  private static MegaSignsApi megaSignsApi = null;
  private static String libraryDocumentId = null;
  private static String transientDocumentId = null;

  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    ApiUtils.configureProperty();
    megaSignsApi = MegaSignUtils.getMegaSignsApi();

    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
  }

  /**
   * Test for creating a megasign agreement through the createMegaSign endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    MegaSignCreationRequest megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getNullAccessTokenHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      megaSignsApi.createMegaSign(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a megasign agreement through the createMegaSign endpoint. Negative scenarios covered:
   * INVALID_FILE_INFO: FileInfo with all 4 parameters null; FileInfo with more than 1 parameter non-empty.
   * URL_INVALID: Invalid url specified in FileInfo's getDocumentUrl parameter.
   * MISSING_REQUIRED_PARAM: Null MegaSignCreationRequest; name null in MegaSignCreationRequest
   * EMPTY_REDIRECT_URL: Redirect url set to empty in PostSignOptions, if specified.
   * INVALID_REDIRECT_URL: Invalid url specified in PostSignOption.
   * INVALID_REDIRECT_DELAY: Negative redirect delay set in PostSignOptions.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidMegaSignCreationInfo() throws ApiException {
    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  null);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    MegaSignCreationRequest megaSignCreationRequest = getMegaSignCreationRequest(TestData.NULL_PARAM);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    FileInfo fileInfo = new FileInfo();
    megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME, fileInfo);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    URLFileInfo url = new URLFileInfo();
    url.setUrl(TestData.INVALID_URL);
    fileInfo.setDocumentURL(url);

    megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME, fileInfo);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setLibraryDocumentId(libraryDocumentId);
    fileInfo.setTransientDocumentId(transientDocumentId);
    fileInfo.setDocumentURL(null);

    megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME, fileInfo);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    PostSignOptions options = new PostSignOptions();
    options.setRedirectUrl(TestData.EMPTY_PARAM);

    megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME, options);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.EMPTY_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
    }

    options.setRedirectUrl(TestData.INVALID_URL);
    megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME, options);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
    }

    options.setRedirectUrl(TestData.REDIRECT_URL);
    options.setRedirectDelay(TestData.INVALID_REDIRECT_DELAY);

    megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME, options);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_REDIRECT_DELAY.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a megasign agreement through the createMegaSign endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    MegaSignCreationRequest megaSignCreationRequest = getMegaSignCreationRequest(TestData.MEGASIGN_NAME);

    try {
      megaSignsApi.createMegaSign(ApiUtils.getEmptyXApiUserHeaderParams(),
                                  megaSignCreationRequest);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a megasign agreement through the createMegaSign endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateMegaSign() throws ApiException {
    MegaSignCreationRequest megaSignCreationRequest = getMegaSignCreationRequest(ApiUtils.getMegaSignName());

    try {
      MegaSignCreationResponse megaSignCreationResponse = megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(),
                                                                                      megaSignCreationRequest);
      assertNotNull(megaSignCreationResponse);
      assertNotNull(megaSignCreationResponse.getMegaSignId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
