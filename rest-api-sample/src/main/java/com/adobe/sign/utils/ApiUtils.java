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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ApiUtils {
  private static Logger log = null;
  private final static String ACCESS_TOKEN_KEY= "Access-Token";
  private final static String X_API_USER_KEY = "x-api-user";
  private static final String BUILD_SEPERATOR = "build";
  private static final String ENV_HOST_NAME = Constants.ENV_HOST_NAME;
  public static Properties getProperties(String configPath) {
    Properties prop = new Properties();
    try {
      InputStream input = new FileInputStream(configPath);
      // load the properties file
      prop.load(input);
    }
    catch (IOException ex) {
      log.error(Errors.GET_PROPERTIES, ex);
    }
    return prop;
  }

  public static String getGroupName(String name) {
    return name + String.valueOf(System.currentTimeMillis());
  }

  public static String getAgreementName(String name) {
    return name + String.valueOf(System.currentTimeMillis());
  }

  public static String getMegaSignName(String name) {
    return name + String.valueOf(System.currentTimeMillis());
  }

  public static String getWidgetName(String name) {
    return name + String.valueOf(System.currentTimeMillis());
  }

  public static Date getStartDate()
  {
    return getDate(-Constants.DAYS_BEFORE_CURRENT_DATE);
  }

  public static Date getEndDate()
  {
    return getDate(0);
  }

  public static Logger getLogger()
  {
    return log;
  }

  private static Date getDate(int offset){
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, offset);
    return cal.getTime();
  }

  public static int getMilliSecsPerDay() {
    int millisecsPerDay = 24 * 60 * 60 * 10000;
    return millisecsPerDay;
  }

  public static String getSampleAbsolutePath() {
    String path = ApiUtils.class.getClassLoader().getResource(".").getPath();
    return path.substring(0, path.indexOf(BUILD_SEPERATOR));
  }

  public static MultivaluedMap getHeaderParams() {
    MultivaluedMap headers = new MultivaluedMapImpl();
    //Add headers
    headers.put(ACCESS_TOKEN_KEY, Constants.ACCESS_TOKEN);
    headers.put(X_API_USER_KEY, Constants.X_API_USER);

    return headers;
  }
  public static void configureProperty(String className){
    configureLogProperty(className);
    configureEnvHostName();
  }
  public static void logException(String error,Exception e) throws ApiException {
    log.error(error, e);
    System.err.println(error);
    throw new ApiException(error);
  }
  public static void logError(String error) {
    log.error(error);
    System.err.println(error);
  }

  public static void configureLogProperty(String className) {
    log = LogManager.getLogger(className);
    Properties properties=getProperties(Constants.LOG_CONFIG_PATH);
    properties.setProperty(Constants.LOG_KEY,getSampleAbsolutePath()+Constants.LOG);
    PropertyConfigurator.configure(properties);
  }

  public static void configureEnvHostName() {
    if(ENV_HOST_NAME != null && ENV_HOST_NAME.length()>0){
      Context.setEnvHostName(ENV_HOST_NAME);
    }
  }

  public static String getUserEmail(String emailPrefix, String emailDomain) {
    return emailPrefix + String.valueOf(System.currentTimeMillis()) + emailDomain;
  }
}
