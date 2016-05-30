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

import java.util.ArrayList;

import com.adobe.sign.api.AgreementsApi;
import com.adobe.sign.model.agreements.AgreementCreationInfo;
import com.adobe.sign.model.agreements.AgreementCreationResponse;
import com.adobe.sign.model.agreements.AgreementDocuments;
import com.adobe.sign.model.agreements.Document;
import com.adobe.sign.model.agreements.DocumentCreationInfo;
import com.adobe.sign.model.agreements.FileInfo;
import com.adobe.sign.model.agreements.PostSignOptions;
import com.adobe.sign.model.agreements.RecipientInfo;
import com.adobe.sign.model.agreements.RecipientSetInfo;
import com.adobe.sign.model.agreements.URLFileInfo;
import com.adobe.sign.model.agreements.UserAgreement;
import com.adobe.sign.model.agreements.UserAgreements;

public class AgreementsUtils extends ApiUtils {

  private static AgreementsApi agreementsApi = new AgreementsApi();

  private static String agreementId = null;
  private static String documentId = null;
  private static String libraryDocumentId = null;

  public static String getResourceId(String agreementName)throws ApiException  {

    if(!isExistingAgreement(agreementName))
      agreementId = createAgreement(agreementName);

    setDocumentId();
    return agreementId;
  }

  // Helper methods
  
  public static String createAgreement(String name) throws ApiException {

    String agreementId = null;
    AgreementCreationInfo agreementCreationInfo = getAgreementCreationInfo(name);
    AgreementCreationResponse agreementCreationResponse = agreementsApi.createAgreement(TestData.ACCESS_TOKEN,
                                                                                        agreementCreationInfo,
                                                                                        TestData.X_API_HEADER);
    agreementId = agreementCreationResponse.getAgreementId();

    return agreementId;
  }

  public static AgreementCreationInfo getAgreementCreationInfo(String documentName) throws ApiException {

    String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
    return getAgreementCreationInfo(TestData.POST_EMAIL,
                                    TestData.NULL_PARAM,
                                    RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    transientDocumentId,
                                    TestData.NULL_PARAM,
                                    documentName,
                                    DocumentCreationInfo.SignatureTypeEnum.ESIGN,
                                    null);

  }

  public  static AgreementCreationInfo getAgreementCreationInfo(String documentName,
                                                         FileInfo fileInfo) {
    return getAgreementCreationInfo(TestData.POST_EMAIL,
                                    TestData.NULL_PARAM,
                                    RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
                                    fileInfo.getLibraryDocumentId(),
                                    fileInfo.getLibraryDocumentName(),
                                    fileInfo.getTransientDocumentId(),
                                    fileInfo.getDocumentURL() != null ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM,
                                    documentName,
                                    DocumentCreationInfo.SignatureTypeEnum.ESIGN,
                                    null);

  }

  public static AgreementCreationInfo getAgreementCreationInfo(String documentName,
                                                         PostSignOptions options) throws ApiException {
    libraryDocumentId = getLibraryDocumentId();
    return getAgreementCreationInfo(TestData.POST_EMAIL,
                                    TestData.NULL_PARAM,
                                    RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
                                    libraryDocumentId,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    documentName,
                                    DocumentCreationInfo.SignatureTypeEnum.ESIGN,
                                    options);

  }

  public static AgreementCreationInfo getAgreementCreationInfo(String recipientEmail,
                                                               String recipientFax,
                                                               RecipientSetInfo.RecipientSetRoleEnum recipientRole,
                                                               String documentName) throws ApiException {
    libraryDocumentId = getLibraryDocumentId();
    return getAgreementCreationInfo(recipientEmail,
                                    recipientFax,
                                    recipientRole,
                                    libraryDocumentId,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    documentName,
                                    DocumentCreationInfo.SignatureTypeEnum.ESIGN,
                                    null);

  }

  public static AgreementCreationInfo getAgreementCreationInfo(DocumentCreationInfo.SignatureTypeEnum signatureType, String documentName) throws ApiException {
    libraryDocumentId = getLibraryDocumentId();
    return getAgreementCreationInfo(TestData.POST_EMAIL,
                                    TestData.NULL_PARAM,
                                    RecipientSetInfo.RecipientSetRoleEnum.SIGNER,
                                    libraryDocumentId,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    TestData.NULL_PARAM,
                                    documentName,
                                    signatureType,
                                    null);
  }

  public static AgreementCreationInfo getAgreementCreationInfo(String recipientEmail,
                                                               String recipientFax,
                                                               RecipientSetInfo.RecipientSetRoleEnum recipientRole,
                                                               String fileInfoLibraryDocumentId,
                                                               String fileInfoLibraryDocumentName,
                                                               String fileInfoTransientDocumentId,
                                                               String fileInfoDocumentUrl,
                                                               String documentName,
                                                               DocumentCreationInfo.SignatureTypeEnum signatureType,
                                                               PostSignOptions options) {

    AgreementCreationInfo agreementCreationInfo = new AgreementCreationInfo();
    DocumentCreationInfo documentCreationInfo = new DocumentCreationInfo();

    RecipientInfo recipientInfo = new RecipientInfo();
    recipientInfo.setEmail(recipientEmail);
    recipientInfo.setFax(recipientFax);

    ArrayList<RecipientInfo> recipientInfoList = new ArrayList<RecipientInfo>();
    recipientInfoList.add(recipientInfo);

    RecipientSetInfo recipientSetInfo = new RecipientSetInfo();
    recipientSetInfo.setRecipientSetMemberInfos(recipientInfoList);
    recipientSetInfo.setRecipientSetRole(recipientRole);

    ArrayList<RecipientSetInfo> recipientSetInfoList = new ArrayList<>();
    recipientSetInfoList.add(recipientSetInfo);
    FileInfo fileInfo = new FileInfo();

    fileInfo.setLibraryDocumentId(fileInfoLibraryDocumentId);
    fileInfo.setLibraryDocumentName(fileInfoLibraryDocumentName);
    fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);

    if (fileInfoDocumentUrl != null) {
      URLFileInfo url = new URLFileInfo();
      url.setUrl(fileInfoDocumentUrl);
      fileInfo.setDocumentURL(url);
    }

    ArrayList<FileInfo> fileInfoList = new ArrayList<>();
    fileInfoList.add(fileInfo);

    documentCreationInfo.setName(documentName);
    documentCreationInfo.setRecipientSetInfos(recipientSetInfoList);

    documentCreationInfo.setFileInfos(fileInfoList);
    documentCreationInfo.setSignatureType(signatureType);
    documentCreationInfo.setSignatureFlow(DocumentCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);
    documentCreationInfo.setPostSignOptions(options);

    agreementCreationInfo.setDocumentCreationInfo(documentCreationInfo);

    return agreementCreationInfo;
  }

  public static AgreementsApi getAgreementsApi() {
    return agreementsApi;
  }

  public static String getDocumentId(){
    return documentId;
  }
  
  private static void setDocumentId() throws ApiException {
    AgreementDocuments agreementDocuments = agreementsApi.getAllDocuments(TestData.ACCESS_TOKEN,
                                                                          agreementId,
                                                                          TestData.X_API_HEADER,
                                                                          TestData.VERSION_ID,
                                                                          TestData.PARTICIPANT_EMAIL,
                                                                          TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);

    ArrayList<Document> documents = (ArrayList<Document>) agreementDocuments.getDocuments();
    documentId = documents.get(0).getDocumentId();
  }

  private static boolean isExistingAgreement(String agreementName) throws ApiException {

    UserAgreements userAgreements = agreementsApi.getAgreements(TestData.ACCESS_TOKEN,
                                                                TestData.X_API_HEADER,
                                                                TestData.AGREEMENT_QUERY,
                                                                TestData.AGREEMENT_EXTERNAL_ID,
                                                                TestData.AGREEMENT_EXTERNAL_GROUP,
                                                                TestData.AGREEMENT_EXTERNAL_NAMESPACE);

    for (UserAgreement agr : userAgreements.getUserAgreementList()) {
      if (agr.getStatus().equals(UserAgreement.StatusEnum.OUT_FOR_SIGNATURE) && agr.getName().equals(agreementName)) {
        agreementId = agr.getAgreementId();
        return true;
      }
    }
    return false;
  }

  private static String getLibraryDocumentId() throws ApiException {
    return LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
  }
}
