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

public class AuthorizationRedirectUrl {

  private static String authorizationCode = null;
  private static String apiAccessPoint = null;
  private static String webAccessPoint = null;

  public AuthorizationRedirectUrl() {
  }

  public static String getAuthorizationCode() {
    return authorizationCode;
  }

  public static void setAuthorizationCode(String authCode) {
    authorizationCode = authCode;
  }

  public static String getApiAccessPoint() {
    return apiAccessPoint;
  }

  public static void setApiAccessPoint(String apiAccessPoint) {
    AuthorizationRedirectUrl.apiAccessPoint = apiAccessPoint;
  }

  public static String getWebAccessPoint() {
    return webAccessPoint;
  }

  public static void setWebAccessPoint(String webAccessPoint) {
    AuthorizationRedirectUrl.webAccessPoint = webAccessPoint;
  }
}
