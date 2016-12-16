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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * This file contains basic utility functions which will be used by the ApiTest classes and the utility classes.
 */

public class ApiUtils {

  private static final String HTTP_STATUS_CODE = "\"httpCode\": ";
  private static final String CODE = "\"apiCode\": ";
  private static final String MESSAGE = "\"message\": ";
  private static final String SEPARATOR = ", ";
  private static final String BUILD_SEPERATOR = "build";
  private final static String ACCESS_TOKEN_KEY= "Access-Token";
  private final static String X_API_USER_KEY = "x-api-user";
  private static String ENV_HOST_NAME = TestData.ENV_HOST_NAME;

  public static Properties getProperties(String configPath) {
    Properties prop = new Properties();
    try {
      InputStream input = new FileInputStream(configPath);
      //load the properties file
      prop.load(input);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    return prop;
  }

  /**
   * Retrieve the error message shown at client end. This consists of http status code, apiCode, and the message in the exception.
   *
   * @param e The exception thrown by the API.
   * @return
   */
  public static String getMessage(ApiException e) {

    if (e == null)
      return "";

    String message = e.getMessage() == null ? "" : e.getMessage();
    String apiCode = e.getApiCode() == null ? "" : e.getApiCode();
    int httpStatusCode = e.getHttpCode();

    String errMessage = "";

    if(httpStatusCode != 0)
      errMessage = errMessage.concat(HTTP_STATUS_CODE + Integer.toString(httpStatusCode));

    if(!StringUtil.isEmpty(apiCode)){
      if(!StringUtil.isEmpty(errMessage))
        errMessage = errMessage.concat(SEPARATOR);

      errMessage = errMessage.concat(CODE + apiCode);
    }

    if(!StringUtil.isEmpty(message)){
      if(!StringUtil.isEmpty(errMessage))
        errMessage = errMessage.concat(SEPARATOR);

      errMessage = errMessage.concat(MESSAGE + message);
    }

    return errMessage;
  }

  public static String getUserEmail() {
    return TestData.EMAIL + String.valueOf(System.currentTimeMillis()) + TestData.EMAIL_DOMAIN;
  }

  public static String getGroupName() {
    return TestData.GROUP_NAME_PREFIX + String.valueOf(System.currentTimeMillis());
  }

  public static String getAgreementName() {
    return TestData.AGREEMENT_NAME_PREFIX + String.valueOf(System.currentTimeMillis());
  }

  public static String getLibraryDocumentName() {
    return TestData.LIBRARY_DOCUMENT_NAME_PREFIX + String.valueOf(System.currentTimeMillis());
  }

  public static String getWidgetName() {
    return TestData.WIDGET_NAME_PREFIX + String.valueOf(System.currentTimeMillis());
  }

  public static String getMegaSignName() {
    return TestData.MEGASIGN_NAME_PREFIX + String.valueOf(System.currentTimeMillis());
  }

  public static Date getDate(int offset){
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, -offset);
    return cal.getTime();
  }

  public static String getSdkAbsolutePath() {
    String path = ApiUtils.class.getClassLoader().getResource(".").getPath();
    return path.substring(0, path.indexOf(BUILD_SEPERATOR));
  }

  public static MultivaluedMap getValidHeaderParams() {
    MultivaluedMap headers = new MultivaluedMapImpl();

    //Add headers
    headers.put(ACCESS_TOKEN_KEY, TestData.ACCESS_TOKEN);
    headers.put(X_API_USER_KEY, TestData.X_API_HEADER);
    return headers;
  }

  public static MultivaluedMap getNullAccessTokenHeaderParams() {
    MultivaluedMap headers = new MultivaluedMapImpl();

    //Add headers
    headers.put(ACCESS_TOKEN_KEY, TestData.NULL_PARAM);
    headers.put(X_API_USER_KEY, TestData.X_API_HEADER);
    return headers;
  }

  public static MultivaluedMap getEmptyAccessTokenHeaderParams() {
    MultivaluedMap headers = new MultivaluedMapImpl();

    //Add headers
    headers.put(ACCESS_TOKEN_KEY, TestData.EMPTY_PARAM);
    headers.put(X_API_USER_KEY, TestData.X_API_HEADER);
    return headers;
  }

  public static MultivaluedMap getEmptyXApiUserHeaderParams() {
    MultivaluedMap headers = new MultivaluedMapImpl();

    //Add headers
    headers.put(ACCESS_TOKEN_KEY, TestData.ACCESS_TOKEN);
    headers.put(X_API_USER_KEY, TestData.EMPTY_PARAM);
    return headers;
  }
  public static void configureProperty(){
    configureEnvHostName();
  }
  public static void configureEnvHostName() {
    if(ENV_HOST_NAME != null && ENV_HOST_NAME.length()>0){
      Context.setEnvHostName(ENV_HOST_NAME);
    }
  }
  public static File getFile(String filePath) {
    File file = new File(filePath);
    return file;
  }

}


