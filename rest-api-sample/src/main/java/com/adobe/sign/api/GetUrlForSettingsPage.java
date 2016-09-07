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

import com.adobe.sign.model.views.TargetViewRequest;
import com.adobe.sign.model.views.ViewUrl;
import com.adobe.sign.utils.ViewUtils;
import com.adobe.sign.utils.Errors;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.ApiException;

/**
 * This sample client demonstrates how to get URL for Settings page. The URL can be generated for two type of settings page.
 * One is the URL for user profile page which can be generated for any kind of user, and the other is the URL for
 * account settings page which can be generated for account administrators only.
 *
 * <p>
 * <b>IMPORTANT</b>: Before running this sample, check that you have modified the 'Constants.java' file with the
 * appropriate values.
 * </p>
 */

public class GetUrlForSettingsPage {

  /**
   * Entry point for this sample client program.
   */
  public static void main(String args[]) throws ApiException {
    ApiUtils.configureProperty(GetUrlForSettingsPage.class.getName());
    try {
      GetUrlForSettingsPage client = new GetUrlForSettingsPage();
      client.run();
    }
    catch (ApiException e) {
      ApiUtils.logException(Errors.GET_URL_FOR_SETTINGS_PAGE, e);
    }
  }

  /**
   * Main work function. See the class comment for details.
   */
  private void run() throws ApiException {
    // Make API call to get URL for settings page.
    ViewUrl viewUrl = ViewUtils.getSettingsUrl(TargetViewRequest.TargetViewEnum.USER_PROFILE);

    // Display URL for settings page.
    ApiUtils.getLogger().info("URL for settings page = " + viewUrl.getViewURL());
  }
}

