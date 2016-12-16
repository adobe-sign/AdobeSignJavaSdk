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

import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

import com.adobe.sign.api.LibraryDocumentsApi;
import com.adobe.sign.model.libraryDocuments.DocumentLibraryItem;
import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;


public class LibraryDocumentUtils {

  private final static LibraryDocumentsApi libraryDocumentsApi = new LibraryDocumentsApi();
  private final static MultivaluedMap headers = ApiUtils.getHeaderParams();

  /**
   * Retrieves library documents for a user.
   *
   * @return DocumentLibraryItems
   */
  public static DocumentLibraryItems getLibraryDocuments() throws ApiException {
    try {
      DocumentLibraryItems documentLibraryItems = libraryDocumentsApi.getLibraryDocuments(headers);
      return documentLibraryItems;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.GET_LIBRARY_DOCUMENTS);
      throw e;
    }
  }

  /**
   * Returns library document id.
   *
   * @return String containing id of first library document(shared or personal).
   */
  public static String getFirstLibraryDocumentId() throws ApiException{
    try {
      DocumentLibraryItems documentLibraryItems = getLibraryDocuments();
      List<DocumentLibraryItem> documentLibraryItemList = documentLibraryItems.getLibraryDocumentList();
      for(DocumentLibraryItem documentLibraryItem : documentLibraryItemList) {
        if(documentLibraryItem.getScope().equals(DocumentLibraryItem.ScopeEnum.SHARED) || documentLibraryItem.getScope().equals(DocumentLibraryItem.ScopeEnum.PERSONAL)) {
          return documentLibraryItem.getLibraryDocumentId();
        }
      }
      return null;
    }
    catch (ApiException e) {
      ApiUtils.logError(Errors.GET_FIRST_LIBRARY_DOCUMENT);
      throw e;
    }
  }
}
