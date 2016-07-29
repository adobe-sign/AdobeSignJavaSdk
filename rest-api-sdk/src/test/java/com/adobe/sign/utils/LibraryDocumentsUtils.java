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
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.LibraryDocumentsApi;
import com.adobe.sign.model.libraryDocuments.DocumentLibraryItem;
import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
import com.adobe.sign.model.libraryDocuments.Documents;
import com.adobe.sign.model.libraryDocuments.FileInfo;
import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo.LibrarySharingModeEnum;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo.LibraryTemplateTypesEnum;
import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
import com.adobe.sign.model.libraryDocuments.OriginalDocument;
import com.adobe.sign.model.libraryDocuments.URLFileInfo;

public class LibraryDocumentsUtils {
  
  private static LibraryDocumentsApi libraryDocumentsApi = new LibraryDocumentsApi();
  private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
  
  private static String documentId = null;
  private static String libraryDocumentId = null;

  public static String getResourceId(String libraryDocumentName) throws ApiException {
    if (!isExistingLibraryDocument(libraryDocumentName))
      libraryDocumentId = createLibraryDocument(libraryDocumentName);

    setDocumentId(libraryDocumentId);
    return libraryDocumentId;
  }
 
  //Helper methods

 public static String createLibraryDocument(String name) throws ApiException {
   LibraryCreationInfo libraryCreationInfo = getLibraryCreationInfo(name);
   LibraryDocumentCreationResponse response =  libraryDocumentsApi.createLibraryDocument(headers,
                                                                                         libraryCreationInfo);
   libraryDocumentId = response.getLibraryDocumentId();
   return libraryDocumentId;
 }

 public static LibraryCreationInfo getLibraryCreationInfo(String documentName) throws ApiException {

   String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
   return getLibraryCreationInfo(Arrays.asList(LibraryTemplateTypesEnum.DOCUMENT),
                                 LibrarySharingModeEnum.USER,
                                 TestData.NULL_PARAM,
                                 TestData.NULL_PARAM,
                                 transientDocumentId,
                                 TestData.NULL_PARAM,
                                 documentName);
 }
 
 public static LibraryCreationInfo getLibraryCreationInfo(FileInfo fileInfo,
                                                          String documentName) {

   return getLibraryCreationInfo(Arrays.asList(LibraryTemplateTypesEnum.DOCUMENT),
                                 LibrarySharingModeEnum.USER,
                                 fileInfo.getLibraryDocumentId(),
                                 fileInfo.getLibraryDocumentName(),
                                 fileInfo.getTransientDocumentId(),
                                 fileInfo.getDocumentURL() != null ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM,
                                 documentName);
 }

 public static LibraryCreationInfo getLibraryCreationInfo(List<LibraryTemplateTypesEnum> templateType,
                                                          LibrarySharingModeEnum sharingMode,
                                                          String documentName) {
   return getLibraryCreationInfo(templateType,
                                 sharingMode,
                                 libraryDocumentId,
                                 TestData.NULL_PARAM,
                                 TestData.NULL_PARAM,
                                 TestData.NULL_PARAM,
                                 documentName);
 }

 public static LibraryCreationInfo getLibraryCreationInfo(List<LibraryTemplateTypesEnum> templateType,
                                                          LibrarySharingModeEnum sharingMode,
                                                          String fileInfoLibraryDocumentId,
                                                          String fileInfoLibraryDocumentName,
                                                          String fileInfoTransientDocumentId,
                                                          String fileInfoDocumentUrl,
                                                          String documentName) {

   LibraryCreationInfo libraryCreationInfo = new LibraryCreationInfo();
   LibraryDocumentCreationInfo libraryDocumentCreationInfo = new LibraryDocumentCreationInfo();

   libraryDocumentCreationInfo.setLibrarySharingMode(sharingMode);
   libraryDocumentCreationInfo.setLibraryTemplateTypes(templateType);

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

   libraryDocumentCreationInfo.setName(documentName);
   libraryDocumentCreationInfo.setFileInfos(fileInfoList);

   libraryCreationInfo.setLibraryDocumentCreationInfo(libraryDocumentCreationInfo);

   return libraryCreationInfo;
 }
 
 public static LibraryDocumentsApi getLibraryDocumentsApi() {
   return libraryDocumentsApi;
 }
 
 public static String getDocumentId() {
   return documentId;
 }
 
 private static void setDocumentId(String libraryDocumentId2) throws ApiException {

   Documents documents =  libraryDocumentsApi.getDocuments(headers,
                                                           libraryDocumentId);
   List<OriginalDocument> documentsList = documents.getDocuments();
   documentId = documentsList.get(0).getDocumentId();
 }

 public static boolean isExistingLibraryDocument(String name) throws ApiException {
   DocumentLibraryItems documentLibraryItems = libraryDocumentsApi.getLibraryDocuments(headers);
   for (DocumentLibraryItem agr : documentLibraryItems.getLibraryDocumentList()) {
     if(agr.getScope().equals(DocumentLibraryItem.ScopeEnum.PERSONAL) && agr.getName().equals(name)){
       libraryDocumentId = agr.getLibraryDocumentId();
       return true;
     }
   }
   return false;
 }

}
