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
package com.adobe.sign.api.OAuth.desktopApp;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import com.adobe.sign.utils.ApiUtils;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import com.adobe.sign.utils.OAuthUtils;

public class AuthorizationApplication extends Application {
  private Scene scene = null;
  private static String redirectUri = null;
  private static String authorizationUrl = null;

  private final String CODE = "code";
  private final String API_ACCESS_POINT = "api_access_point";
  private final String WEB_ACCESS_POINT = "web_access_point";
  private final String REGEX = "(.*)" + redirectUri + "(.*)?" + CODE + "=(.*)+$";
  private final String TITLE = "OAuth 2.0 Authorization";

  @Override
  public void start(final Stage stage) {

    // Adding a new webView node.
    WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();

    // Add a borderPane object and add the browser position to be in the center.
    BorderPane borderPane = new BorderPane();

    // Load the authorization url for the user authorization.
    webEngine.load(authorizationUrl);
    borderPane.setCenter(browser);

    // Add a listener which will trigger when the url changes.
    webEngine.locationProperty().addListener(new ChangeListener<String>() {
      @Override
      public void changed(ObservableValue<? extends String> prop, final String before, final String after) {

        if(after.matches(REGEX)) {
          try {

            // Split the url in key-value pair format.
            String query = new URL(after).getQuery();
            String[] pairs = query.split("&");

            // Set the redirectUrl parameters. These will be used later in other APIs.
            AuthorizationRedirectUrl.setAuthorizationCode(OAuthUtils.getValueByKey(pairs, CODE));
            AuthorizationRedirectUrl.setApiAccessPoint(OAuthUtils.getValueByKey(pairs, API_ACCESS_POINT));
            AuthorizationRedirectUrl.setWebAccessPoint(OAuthUtils.getValueByKey(pairs, WEB_ACCESS_POINT));
          } catch (MalformedURLException | UnsupportedEncodingException e) {
            ApiUtils.getLogger().info("Invalid URL found on redirect during OAuth.");
          }

          // Retrieved the redirected url parameters, close the application window.
          stage.hide();
        }
      }
    });

    // Set the title of application to "OAuth 2.0 Authorization".
    stage.setTitle(TITLE);

    // Create scene and set it's property to be inherited by borderPane node.
    scene = new Scene(borderPane);

    // Add scene node to stage.
    stage.setScene(scene);

    // Trigger the application window.
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }

  public static String getAuthorizationUrl() {
    return authorizationUrl;
  }

  /**
   * Set the authorization url. This url will be used to retrieve the authorization code.
   *
   * @param authorizationUrl The authorization url retrieved by getAuthorizationUrl(authorizationInfo) API.
   */
  public static void setAuthorizationUrl(String authorizationUrl) {
    AuthorizationApplication.authorizationUrl = authorizationUrl;
  }

  public static String getRedirectUri() {
    return redirectUri;
  }

  /**
   * The url where the end user will be redirected after successful completion of authorization.
   */
  public static void setRedirectUri(String redirectUri) {
    AuthorizationApplication.redirectUri = redirectUri;
  }
}