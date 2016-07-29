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

package com.adobe.sign.api.Agreements;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.AgreementsApi;
import com.adobe.sign.model.agreements.AgreementCreationInfo;
import com.adobe.sign.model.agreements.AgreementCreationResponse;
import com.adobe.sign.model.agreements.FileInfo;
import com.adobe.sign.model.agreements.PostSignOptions;
import com.adobe.sign.model.agreements.RecipientSetInfo;
import com.adobe.sign.model.agreements.URLFileInfo;
import com.adobe.sign.utils.AgreementsUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.Retry;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.TransientDocumentsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Junit test cases for Post Agreements API.
 */
public class PostAgreementsApiTest {
  private static AgreementsApi agreementsApi = null;
  private static String libraryDocumentId = null;
  private static String transientDocumentId = null;
  
  @Rule
  public Retry retry = new Retry();

  @BeforeClass
  public static void setup() throws ApiException {
    agreementsApi = AgreementsUtils.getAgreementsApi();

    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
  }

  /**
   * Test for creating an agreement and sending it out for signature through the createAgreement endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AgreementCreationInfo creationInfo = new AgreementCreationInfo();

    try {
      agreementsApi.createAgreement(ApiUtils.getNullAccessTokenHeaderParams(),
                                    creationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      agreementsApi.createAgreement(ApiUtils.getEmptyAccessTokenHeaderParams(),
                                    creationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }
  /**
   * Test for creating an agreement and sending it out for signature through the createAgreement endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AgreementCreationInfo creationInfo = new AgreementCreationInfo();

    try {
      agreementsApi.createAgreement(ApiUtils.getEmptyXApiUserHeaderParams(),
                                    creationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an agreement and sending it out for signature through the createAgreement endpoint. Negative scenarios covered:
   * INVALID_FILE_INFO: FileInfo with all 4 parameters null; FileInfo with more than 1 parameter non-empty.
   * URL_INVALID: Invalid url specified in FileInfo's getDocumentUrl parameter.
   * MISSING_REQUIRED_PARAM: Name null in documentCreationInfo; RecipientSetRole set to null; Both email and fax empty in recipientInfo;
   *                         Signature type set to null.
   * EMPTY_REDIRECT_URL: Redirect url set to empty in PostSignOptions, if specified.
   * INVALID_REDIRECT_URL: Invalid url specified in PostSignOption.
   * INVALID_REDIRECT_DELAY: Negative redirect delay set in PostSignOptions.
   * INVALID_EMAIL: Wrong email set in recipientInfo.
   * INVALID_ARGUMENTS: Both email and fax specified in RecipientInfo.
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementCreationInfo() throws ApiException {
    PostSignOptions options = new PostSignOptions();
    FileInfo fileInfo = new FileInfo();

    AgreementCreationInfo agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(),
                                                                           fileInfo);

    // FileInfo with all 4 parameters null.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    URLFileInfo url = new URLFileInfo();
    url.setUrl(TestData.INVALID_URL);
    fileInfo.setDocumentURL(url);

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(),
                                                     fileInfo);

    // Invalid url specified in FileInfo's getDocumentUrl parameter.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setLibraryDocumentId(libraryDocumentId);
    fileInfo.setTransientDocumentId(transientDocumentId);
    fileInfo.setDocumentURL(null);

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(),
                                                     fileInfo);

    // FileInfo with more than 1 parameter non-empty.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setTransientDocumentId(TestData.NULL_PARAM);

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.NULL_PARAM,
                                                     fileInfo);

    // Name null in documentCreationInfo
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    options.setRedirectUrl(TestData.EMPTY_PARAM);
    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(),
        options);

    // Redirect url set to empty in PostSignOptions, if specified.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.EMPTY_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
    }

    options.setRedirectUrl(TestData.INVALID_URL);
    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(),
                                                     options);

    // Invalid url specified in PostSignOption.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
    }

    options.setRedirectUrl(TestData.REDIRECT_URL);
    options.setRedirectDelay(TestData.INVALID_REDIRECT_DELAY);
    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(),
        options);

    // Negative redirect delay set in PostSignOptions.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_REDIRECT_DELAY.getApiCode().equals(e.getApiCode()));
    }

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.POST_EMAIL,
                                                     TestData.NULL_PARAM,
                                                     null,
                                                     ApiUtils.getAgreementName());

    // RecipientSetRole set to null.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.NULL_PARAM,
        TestData.NULL_PARAM,
        RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
        ApiUtils.getAgreementName());

    // Both email and fax null in recipientInfo.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.INVALID_EMAIL,
                                                     TestData.NULL_PARAM,
                                                     RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
                                                     ApiUtils.getAgreementName());

    // Wrong email set in recipientInfo.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.POST_EMAIL,
        TestData.POST_FAX,
        RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
        ApiUtils.getAgreementName());

    // Both email and fax specified in recipientInfo
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ARGUMENTS.getApiCode().equals(e.getApiCode()));
    }

    agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(null, ApiUtils.getAgreementName());

    // Signature type set to null.
    try {
      agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                    agreementCreationInfo);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an agreement and sending it out for signature through the createAgreement endpoint.
   */
  @Test
  public void testCreateAgreement() throws ApiException {
    AgreementCreationInfo agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName());

    try {
      AgreementCreationResponse agreementCreationResponse = agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(),
                                                                                          agreementCreationInfo);
      assertNotNull(agreementCreationResponse);
      assertNotNull(agreementCreationResponse.getAgreementId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }

}
