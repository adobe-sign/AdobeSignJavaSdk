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
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.MegaSignsApi;
import com.adobe.sign.model.megaSigns.FileInfo;
import com.adobe.sign.model.megaSigns.MegaSign;
import com.adobe.sign.model.megaSigns.MegaSignCreationInfo;
import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
import com.adobe.sign.model.megaSigns.MegaSigns;
import com.adobe.sign.model.megaSigns.PostSignOptions;
import com.adobe.sign.model.megaSigns.RecipientInfo;
import com.adobe.sign.model.megaSigns.RecipientSetInfo;
import com.adobe.sign.model.megaSigns.URLFileInfo;

public class MegaSignUtils {
  private static MegaSignsApi megaSignsApi = new MegaSignsApi();
  private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();

  private static String megaSignId = null;

  public static String getResourceId(String megaSignName) throws ApiException {
    if (!isExistingMegaSign(megaSignName))
      megaSignId = createMegaSign(megaSignName);

    return megaSignId;
  }

  public static String createMegaSign(String name) throws ApiException {
    String megaSignId = null;
    MegaSignCreationRequest megaSignCreationRequest = getMegaSignCreationRequest(name);

    MegaSignCreationResponse megaSignCreationResponse = megaSignsApi.createMegaSign(headers,
                                                                                    megaSignCreationRequest);
    megaSignId = megaSignCreationResponse.getMegaSignId();

    return megaSignId;
  }

  public static MegaSignCreationRequest getMegaSignCreationRequest(String documentName) throws ApiException {

    String libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    return getMegaSignCreationRequest(TestData.POST_EMAIL,
                                      TestData.NULL_PARAM,
                                      libraryDocumentId,
                                      TestData.NULL_PARAM,
                                      TestData.NULL_PARAM,
                                      TestData.NULL_PARAM,
                                      documentName,
                                      MegaSignCreationInfo.SignatureTypeEnum.ESIGN,
                                      null);
  }

  public static MegaSignCreationRequest getMegaSignCreationRequest(String documentName, FileInfo fileInfo) {
    return getMegaSignCreationRequest(TestData.POST_EMAIL,
                                      TestData.NULL_PARAM,
                                      fileInfo.getLibraryDocumentId(),
                                      fileInfo.getLibraryDocumentName(),
                                      fileInfo.getTransientDocumentId(),
                                      fileInfo.getDocumentURL() != null ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM,
                                      documentName,
                                      MegaSignCreationInfo.SignatureTypeEnum.ESIGN,
                                      null);

  }

  public static MegaSignCreationRequest getMegaSignCreationRequest(String documentName, PostSignOptions postSignOptions) throws ApiException {

    String libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    return getMegaSignCreationRequest(TestData.POST_EMAIL,
                                      TestData.NULL_PARAM,
                                      libraryDocumentId,
                                      TestData.NULL_PARAM,
                                      TestData.NULL_PARAM,
                                      TestData.NULL_PARAM,
                                      documentName,
                                      MegaSignCreationInfo.SignatureTypeEnum.ESIGN,
                                      postSignOptions);

  }

  public static MegaSignCreationRequest getMegaSignCreationRequest(String recipientEmail,
                                                                   String recipientFax,
                                                                   String fileInfoLibraryDocumentId,
                                                                   String fileInfoLibraryDocumentName,
                                                                   String fileInfoTransientDocumentId,
                                                                   String fileInfoDocumentUrl,
                                                                   String documentName,
                                                                   MegaSignCreationInfo.SignatureTypeEnum signatureType,
                                                                   PostSignOptions options) {

    MegaSignCreationRequest megaSignCreationRequest = new MegaSignCreationRequest();
    MegaSignCreationInfo megaSignCreationInfo = new MegaSignCreationInfo();

    RecipientInfo recipientInfo = new RecipientInfo();
    recipientInfo.setEmail(recipientEmail);
    recipientInfo.setFax(recipientFax);

    ArrayList<RecipientInfo> recipientInfoList = new ArrayList<RecipientInfo>();
    recipientInfoList.add(recipientInfo);

    RecipientSetInfo recipientSetInfo = new RecipientSetInfo();
    recipientSetInfo.setRecipientSetMemberInfos(recipientInfoList);

    ArrayList<RecipientSetInfo> recipientSetInfoList = new ArrayList<>();
    recipientSetInfoList.add(recipientSetInfo);
    megaSignCreationInfo.setRecipientSetInfos(recipientSetInfoList);

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

    megaSignCreationInfo.setName(documentName);
    megaSignCreationInfo.setFileInfos(fileInfoList);
    megaSignCreationInfo.setSignatureType(signatureType);
    megaSignCreationInfo.setPostSignOptions(options);

    megaSignCreationRequest.setMegaSignCreationInfo(megaSignCreationInfo);
    return megaSignCreationRequest;
  }

  public static boolean isExistingMegaSign(String staticMegaSignName) throws ApiException {
    MegaSigns megaSigns = megaSignsApi.getMegaSigns(headers,
                                                    TestData.MEGASIGN_QUERY);

    for (MegaSign megaSign : megaSigns.getMegaSignList()) {
      if (megaSign.getName().equals(staticMegaSignName) && megaSign.getStatus().equals(MegaSign.StatusEnum.OUT_FOR_SIGNATURE)) {
        megaSignId = megaSign.getMegaSignId();
        return true;
      }
    }
    return false;
  }

  public static MegaSignsApi getMegaSignsApi() {
    return megaSignsApi;
  }

}
