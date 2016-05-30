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

import java.util.ArrayList;

import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;
import com.adobe.sign.model.widgets.WidgetCreationResponse;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.WidgetUtils;
import com.adobe.sign.utils.TransientDocumentUtils;

/**
 * This sample client demonstrates how to create a new widget.
 *
 * 1. Create a widget with a transient document and a document containing form fields which will be placed on the widget.
 * 2. Add counter signer to widget.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */
public class CreateNewWidgetWithCounterSigners {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      CreateNewWidgetWithCounterSigners client = new CreateNewWidgetWithCounterSigners();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.CREATE_WIDGET_WITH_COUNTER_SIGNERS);
    }
  }
  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception{

    // Upload a transient document and retrieve transient document ID from the response.
    TransientDocumentResponse transientDocument = TransientDocumentUtils.createTransientDocument(Constants.REQUEST_PATH,
                                                                                                 Constants.INPUT_FILE_NAME);
    String transientDocumentId = transientDocument.getTransientDocumentId();

    // Upload a transient document with form fields which will be placed in the created widget.
    TransientDocumentResponse formFieldDocument = TransientDocumentUtils.createTransientDocument(Constants.REQUEST_PATH,
                                                                                                 Constants.INPUT_FORM_FIELD_FILE_NAME);
    String formFieldDocumentId = formFieldDocument.getTransientDocumentId();

    // Add counter signer to the counterSignerMemberList
    ArrayList<String> counterSignerMemberList = new ArrayList<>();
    counterSignerMemberList.add(Constants.USER_EMAIL);

    // Make call to create the widget.
    WidgetCreationResponse widgetCreationResponse = WidgetUtils.createWidgetWithCounterSigner(transientDocumentId,
                                                                                              WidgetUtils.DocumentIdentifierType.TRANSIENT_DOCUMENT_ID,
                                                                                              formFieldDocumentId,
                                                                                              WidgetUtils.DocumentIdentifierType.TRANSIENT_DOCUMENT_ID,
                                                                                              Constants.WIDGET_NAME,
                                                                                              counterSignerMemberList);
    // Display widget ID and corresponding code of newly created widget.
    System.out.println("Newly created widget's ID: " + widgetCreationResponse.getWidgetId());
    System.out.println("The corresponding Javascript code to embed the created widget: " + widgetCreationResponse.getJavascript() + "\n" + "OR \n" + "URL to host the widget: " + widgetCreationResponse.getUrl());
  }
}
