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

public class ApiUtils {

  public static Properties getProperties(String configPath) {
    Properties prop = new Properties();
    try {
      InputStream input = new FileInputStream(configPath);
      // load the properties file
      prop.load(input);
    }
    catch (IOException ex) {
      System.err.println(Errors.GET_PROPERTIES);
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

  private static Date getDate(int offset){
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, offset);
    return cal.getTime();
  }

  public static int getMilliSecsPerDay() {
    int millisecsPerDay = 24 * 60 * 60 * 10000;
    return millisecsPerDay;
  }
}
