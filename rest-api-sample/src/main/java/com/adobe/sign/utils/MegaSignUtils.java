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
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.MegaSignsApi;
import com.adobe.sign.model.megaSigns.FileInfo;
import com.adobe.sign.model.megaSigns.MegaSignCreationInfo;
import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
import com.adobe.sign.model.megaSigns.MegaSignInfo;
import com.adobe.sign.model.megaSigns.MegaSigns;
import com.adobe.sign.model.megaSigns.RecipientInfo;
import com.adobe.sign.model.megaSigns.RecipientSetInfo;

public class MegaSignUtils {

  private final static MegaSignsApi megaSignsApi = new MegaSignsApi();
  private final static MultivaluedMap headers = ApiUtils.getHeaderParams();

  //Document identifier to identify whether document is library document or transient document
  public enum DocumentIdentifierType {
    TRANSIENT_DOCUMENT_ID,
    LIBRARY_DOCUMENT_ID,
    LIBRARY_DOCUMENT_NAME;
  }

  /**
   * Get all the megaSign parent agreements of a user.
   *
   * @return all the megaSign parent agreements of the user
   */
  public static MegaSigns getMegaSigns() throws ApiException {
    try {
      MegaSigns megaSigns = megaSignsApi.getMegaSigns(headers,
                                                      Constants.QUERY);
      return megaSigns;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.GET_MEGASIGNS);
      throw e;
    }
  }

  /**
   * Returns list containing information about the recipients.
   *
   * @param userEmails List containing email ids about the recipients.
   * @return RecipientSetInfo object containing information of the recipients.
   */
  private static List<RecipientSetInfo> getRecipientSetInfo(List<String> userEmails) {

    //Create an array of recipients from list of email ids.
    List<RecipientInfo> recipientSetMemberInfos = new ArrayList<RecipientInfo>();
    for (String userEmail : userEmails){
      RecipientInfo recipientInfo = new RecipientInfo();
      recipientInfo.setEmail(userEmail);
      recipientSetMemberInfos.add(recipientInfo);
    }

    //Create recipient set
    RecipientSetInfo recipientSetInfo  = new RecipientSetInfo();
    recipientSetInfo.setRecipientSetMemberInfos(recipientSetMemberInfos);
    List<RecipientSetInfo> recipientSetInfos =  new ArrayList<RecipientSetInfo>();
    recipientSetInfos.add(recipientSetInfo);
    return recipientSetInfos;
  }

  /**
   * Get File info using document.
   *
   * @param documentId Id of the document
   * @param documentIdentifierType type of document
   * @return FileInfo object containing information about the file.
   */
  private static FileInfo getFileInfo(Object documentId,
                                     DocumentIdentifierType documentIdentifierType) {
    //Create file info object using document id and name
    FileInfo fileInfo = new FileInfo();
    if(documentIdentifierType.equals(DocumentIdentifierType.LIBRARY_DOCUMENT_ID)) {
      fileInfo.setLibraryDocumentId(documentId.toString());
    }
    else if(documentIdentifierType.equals(DocumentIdentifierType.TRANSIENT_DOCUMENT_ID)) {
      fileInfo.setTransientDocumentId(documentId.toString());
    }
    else if(documentIdentifierType.equals(DocumentIdentifierType.LIBRARY_DOCUMENT_NAME)) {
      fileInfo.setLibraryDocumentName(documentId.toString());
    }
    return fileInfo;
  }

  /**
   * Send a megaSign parent agreement out for signature to multiple recipients. Each recipient will receive and sign their own copy of the agreement.
   *
   * @param recipientSetEmailList List containing email ids about the recipients.
   * @param documentId Id of the document
   * @return MegaSignCreationResponse
   */
  public static MegaSignCreationResponse createMegaSign(String documentId,
                                                        List<String> recipientSetEmailList,
                                                        DocumentIdentifierType documentIdentifierType) throws ApiException {
    try {
      //Get recipient info
      List<RecipientSetInfo> recipientSetInfos = getRecipientSetInfo(recipientSetEmailList);

      //Get file info and create a list of file info
      FileInfo fileInfo = getFileInfo(documentId,
                                      documentIdentifierType);
      List<FileInfo> fileInfos = new ArrayList<FileInfo>();
      fileInfos.add(fileInfo);

      //Get the megaSign parent agreement creation info
      MegaSignCreationInfo megaSignCreationInfo = MegaSignUtils.getMegaSignCreationInfo(recipientSetInfos,
                                                                                        fileInfos);
      MegaSignCreationRequest megaSignCreationRequest = new MegaSignCreationRequest();
      megaSignCreationRequest.setMegaSignCreationInfo(megaSignCreationInfo);
      MegaSignCreationResponse megaSignCreationResponse = megaSignsApi.createMegaSign(headers,
                                                                                      megaSignCreationRequest);
      return megaSignCreationResponse;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.CREATE_MEGASIGN);
      throw e;
    }
  }

  /**
   * Get detailed information of the specified megaSign parent agreement.
   *
   * @param megaSignId The identifier of the megaSign parent agreement
   */
  public static MegaSignInfo getMegaSignInfo(String megaSignId) throws ApiException {
    try {
      MegaSignInfo megaSignInfo = megaSignsApi.getMegaSignInfo(headers,
                                                               megaSignId);
      return megaSignInfo;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.GET_MEGASIGN_DETAILS);
      throw e;
    }
  }

  /**
   * Get megaSign creation info for the megaSign parent agreement.
   *
   * @return
   */
  private static MegaSignCreationInfo getMegaSignCreationInfo(List<RecipientSetInfo> recipientSetInfos,
                                                             List<FileInfo> fileInfos) {
    MegaSignCreationInfo megaSignCreationInfo = new MegaSignCreationInfo();
    megaSignCreationInfo.setRecipientSetInfos(recipientSetInfos);
    megaSignCreationInfo.setFileInfos(fileInfos);
    megaSignCreationInfo.setName(ApiUtils.getMegaSignName(Constants.MEGASIGN_NAME));
    megaSignCreationInfo.setSignatureType(MegaSignCreationInfo.SignatureTypeEnum.ESIGN);

    return megaSignCreationInfo;
  }
}

