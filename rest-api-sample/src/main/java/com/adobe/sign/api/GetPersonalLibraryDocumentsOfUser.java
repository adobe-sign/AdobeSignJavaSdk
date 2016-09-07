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

package com.adobe.sign.api;

import java.util.List;

import com.adobe.sign.model.libraryDocuments.DocumentLibraryItem;
import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
import com.adobe.sign.utils.LibraryDocumentUtils;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;


/**
 * This sample client demonstrates how to retrieve personal library documents of a user.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with appropriate access token value.
 * </p>
 */

public class GetPersonalLibraryDocumentsOfUser {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(GetPersonalLibraryDocumentsOfUser.class.getName());
    try {
      GetPersonalLibraryDocumentsOfUser client = new GetPersonalLibraryDocumentsOfUser();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_PERSONAL_LIBRARY_DOCUMENTS, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException{
    //Get the list of library documents of the specified user.
    DocumentLibraryItems documentLibraryItems = LibraryDocumentUtils.getLibraryDocuments();
    List<DocumentLibraryItem> documentLibraryItemList = documentLibraryItems.getLibraryDocumentList();

    //Display details of each library document with personal scope.
    for(DocumentLibraryItem documentLibraryItem : documentLibraryItemList) {

      //Check that the scope of the library document is personal.
      if(documentLibraryItem.getScope().equals(DocumentLibraryItem.ScopeEnum.PERSONAL)) {

        //Display name and id of the document.
        ApiUtils.getLogger().info("Name = " + documentLibraryItem.getName());
        ApiUtils.getLogger().info("Document ID = " + documentLibraryItem.getLibraryDocumentId());
      }
    }
  }
}
