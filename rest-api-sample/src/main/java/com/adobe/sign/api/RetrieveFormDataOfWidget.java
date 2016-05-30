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

import com.adobe.sign.model.widgets.WidgetInfo;
import com.adobe.sign.utils.Constants;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.WidgetUtils;
import com.adobe.sign.utils.FileUtils;

/**
 * This sample client demonstrates how to download the form data of the specified widget.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the appropriate values.
 * </p>
 */

public class RetrieveFormDataOfWidget {
  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) {
    try {
      RetrieveFormDataOfWidget client = new RetrieveFormDataOfWidget();
      client.run();
    }
    catch (Exception e) {
      throw new AssertionError(Errors.RETRIEVE_FORM_DATA_WIDGET);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws Exception{
    //Get the id of the first library document of the user.
    String widgetId = WidgetUtils.getFirstWidgetId();

    if(widgetId == null) {
      System.err.println(Errors.NO_WIDGET_FOUND);
    }
    else {
      //Display name of the widget associated with the specified widget ID.
      WidgetInfo widgetInfo = WidgetUtils.getWidgetInfo(widgetId);
      String widgetName = widgetInfo.getName();
      System.out.println("Widget name: " + widgetInfo.getName());

      //Make API call to get form data of this widget.
      byte formDataStream[] = WidgetUtils.getWidgetFormData(widgetInfo.getWidgetId());

      //Generate a running file name for storing locally.
      String fileName = widgetName + "_" + System.currentTimeMillis() + ".csv";

      //Save form Data Stream to file
      if (formDataStream != null) {
        FileUtils.saveToFile(formDataStream,
                Constants.OUTPUT_PATH + Constants.FORM_DATA,
                fileName);
      }
    }
  }
}
