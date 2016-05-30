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

import com.adobe.sign.api.ViewsApi;
import com.adobe.sign.model.views.AgreementAssetListRequest;
import com.adobe.sign.model.views.AgreementAssetRequest;
import com.adobe.sign.model.views.TargetViewRequest;
import com.adobe.sign.model.views.ViewUrl;

public class ViewUtils {

  private final static ViewsApi viewsApi = new ViewsApi();

  /**
   * Returns the URL for manage page.
   * This endpoint will return the URL for manage page. If an agreement asset id is given then that agreement asset will be shown selected
   * in the resulted manage page url.
   * The agreement asset refers to any asset through which an agreement can be created for instance library document,widget and agreement itself.
   * If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
   * @return ViewUrl containing URL for manage page.
   */
  public static ViewUrl getAgreementAssetListUrl (String agreementAssetId) throws Exception {
    try {
      AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();
      agreementAssetListRequest.setAgreementAssetId(agreementAssetId);
      ViewUrl viewUrl = viewsApi.createAgreementAssetListUrl(Constants.ACCESS_TOKEN,
                                                          Constants.X_API_USER,
                                                          agreementAssetListRequest);
      return viewUrl;
    }
    catch (Exception e) {
      System.err.println(Errors.URL_FOR_MANAGE_PAGE);
      throw new Exception(e);
    }
  }

  /**
   * Returns the URL which shows the view page of given agreement asset.
   * This endpoint will return the URL of view agreement page for an agreement asset. The agreement asset refers to any asset through which an
   * agreement can be created for instance library document,widget and agreement itself.
   * If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
   * @return ViewUrl containing URL which shows the view page of given agreement asset
   */
  public static ViewUrl getAgreementAssetUrl (String agreementAssetId) throws Exception {
    try {
      AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
      agreementAssetRequest.setAgreementAssetId(agreementAssetId);
      ViewUrl viewUrl = viewsApi.createAgreementAssetUrl(Constants.ACCESS_TOKEN,
                                                      agreementAssetRequest,
                                                      Constants.X_API_USER);
      return viewUrl;
    }
    catch (Exception e) {
      System.err.println(Errors.URL_FOR_VIEW_AGREEMENT_ASSET_PAGE);
      throw new Exception(e);
    }
  }

  /**
   * Returns the URL for settings page.
   * This endpoint will return the URL for Settings Page. The settings page can be of two types - user profile page(for non admin) and
   * account settings page(for admin).
   * If the user wants to generate a URL that will automatically log the user in then user_login scope is required in the given Oauth Access Token.
   * @return ViewUrl containing URL for settings page
   */
  public static ViewUrl getSettingsUrl (TargetViewRequest.TargetViewEnum targetView) throws Exception {
    try {
      TargetViewRequest targetViewRequest = new TargetViewRequest();
      targetViewRequest.setTargetView(targetView);
      ViewUrl viewUrl = viewsApi.createSettingsUrl(Constants.ACCESS_TOKEN,
                                                targetViewRequest,
                                                Constants.X_API_USER);
      return viewUrl;
    }
    catch (Exception e) {
      System.err.println(Errors.URL_FOR_SETTINGS_PAGE);
      throw new Exception(e);
    }
  }
}
