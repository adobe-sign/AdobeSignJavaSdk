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

import java.util.Date;
import java.util.Properties;

public class Constants {
  
  private static final String SAMPLE_PREFIX_PATH = ApiUtils.getSampleAbsolutePath();
  private static final String CONFIG_PATH = SAMPLE_PREFIX_PATH + "src/main/java/com/adobe/sign/resources/config.properties";
  private static Properties properties= ApiUtils.getProperties(CONFIG_PATH);
  private static final String MINUS_ONE = "-1";
  private static final String ACCESS_TOKEN_KEY= "accessToken";

  private static final String X_API_USER_KEY = "xApiUser";
  private static final String USER_FIRST_NAME_KEY = "userFirstName";
  private static final String USER_LAST_NAME_KEY = "userLastName";
  private static final String USER_EMAIL_KEY = "userEmail";
  private static final String X_USER_EMAIL_KEY = "xUserEmail";
  private static final String ALTERNATE_PARTICIPANT_EMAIL_KEY = "alternateParticipantEmail";
  private static final String GROUP_NAME_KEY = "groupName";

  private static final String AGREEMENT_NAME_KEY = "agreementName";

  private static final String ALTERNATE_PARTICIPANT_MESSAGE_KEY = "alternateParticipantMessage";
  private static final String EXTERNAL_ID_KEY = "externalID";
  private static final String EXTERNAL_GROUP_KEY = "externalGroup";
  private static final String EXTERNAL_NAMESPACE_KEY = "externalNamespace";
  private static final String QUERY_KEY = "query";
  private static final String MEGA_SIGN_NAME = "megaSignName";
  private static final String WIDGET_NAME_KEY = "widgetName";

  private static final String FILE_SEP = "/";
  private static final String INPUT_FILE_NAME_KEY = "inputFileName";
  private static final String REQUEST_PATH_KEY = "requestPath";
  private static final String OUTPUT_PATH_KEY = "outputPath";

  private static final String AGREEMENT_DOCUMENT_KEY = "agreementDocument";
  private static final String ARCHIVE_KEY = "archive";
  private static final String AUDIT_TRAIL_KEY = "auditTrail";
  private static final String FORM_DATA_KEY = "formData";

  private static final String MIME_TYPE_PDF_KEY = "mimeTypePdf";
  private static final String WAITING_DAYS_KEY = "waitingDays";
  private static final String DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE_KEY = "daysBetweenStartDateAndCurrentDate";
  private static final String DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE_KEY = "daysBetweenEndDateAndCurrentDate";

  private static final String MAX_EVENTS_SIZE_KEY = "maxEventsSize";
  private static final String FILE_OFFSET_KEY = "fileOffset";
  private static final String PAGE_SIZE_KEY = "pageSize";
  private static final String INPUT_FORM_FIELD_FILE_NAME_KEY = "inputFormFieldFileName";

  private static final String REDIRECT_URI_KEY = "redirectUri";
  private static final String STATE_KEY = "state";
  private static final String CLIENT_ID_KEY = "clientId";
  private static final String CLIENT_SECRET_KEY = "clientSecret";
  private static final String ACCESS_TOKEN_GRANT_TYPE_KEY = "accessTokenGrantType";
  private static final String REFRESH_TOKEN_GRANT_TYPE_KEY = "refreshTokenGrantType";
  private static final String RESPONSE_TYPE_KEY = "responseType";
  private static final String SERVER_PORT_KEY = "serverPort";
  private static final String KEY_STORE_FILE_KEY = "keyStoreFile";
  private static final String KEY_STORE_PASSWORD_KEY = "keyStorePassword";
  private static final String AGREEMENT_COUNT_LIMIT_KEY = "agreementCountLimit";
  private static final String ENV_HOST_NAME_KEY = "envHostName";
  private static final String USER_EMAIL_PREFIX_KEY = "userEmailPrefix";
  private static final String USER_EMAIL_DOMAIN_KEY = "userEmailDomain";
  private static final String RECIPIENT_SET_NAME_KEY = "recipientSetName";

  //Common Parameters
  public static final String ACCESS_TOKEN = properties.getProperty(ACCESS_TOKEN_KEY).equals("null") ? null : properties.getProperty(ACCESS_TOKEN_KEY);
  public static final String X_API_USER = properties.getProperty(X_API_USER_KEY).equals("null") ? null : properties.getProperty(X_API_USER_KEY);
  public static final String USER_FIRST_NAME = properties.getProperty(USER_FIRST_NAME_KEY).equals("null") ? null : properties.getProperty(USER_FIRST_NAME_KEY);
  public static final String USER_LAST_NAME = properties.getProperty(USER_LAST_NAME_KEY).equals("null") ? null : properties.getProperty(USER_LAST_NAME_KEY);
  public static final String X_USER_EMAIL = properties.getProperty(X_USER_EMAIL_KEY).equals("null") ? null : properties.getProperty(X_USER_EMAIL_KEY);
  public static final String ALTERNATE_PARTICIPANT_EMAIL = properties.getProperty(ALTERNATE_PARTICIPANT_EMAIL_KEY).equals("null") ? null : properties.getProperty(ALTERNATE_PARTICIPANT_EMAIL_KEY);
  public static final String GROUP_NAME = properties.getProperty(GROUP_NAME_KEY).equals("null") ? null : properties.getProperty(GROUP_NAME_KEY);
  public static final String AGREEMENT_NAME = properties.getProperty(AGREEMENT_NAME_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_NAME_KEY);
  public static final String MEGASIGN_NAME = properties.getProperty(MEGA_SIGN_NAME).equals("null") ? null : properties.getProperty(MEGA_SIGN_NAME);
  public static final String WIDGET_NAME = properties.getProperty(WIDGET_NAME_KEY).equals("null") ? null : properties.getProperty(WIDGET_NAME_KEY);
  public static final String ALTERNATE_PARTICIPANT_MESSAGE = properties.getProperty(ALTERNATE_PARTICIPANT_MESSAGE_KEY).equals("null") ? null : properties.getProperty(ALTERNATE_PARTICIPANT_MESSAGE_KEY);
  public static final String EXTERNAL_ID = properties.getProperty(EXTERNAL_ID_KEY).equals("null") ? null : properties.getProperty(EXTERNAL_ID_KEY);
  public static final String EXTERNAL_GROUP = properties.getProperty(EXTERNAL_GROUP_KEY).equals("null") ? null : properties.getProperty(EXTERNAL_GROUP_KEY);
  public static final String EXTERNAL_NAMESPACE = properties.getProperty(EXTERNAL_NAMESPACE_KEY).equals("null") ? null : properties.getProperty(EXTERNAL_NAMESPACE_KEY);
  public static final String QUERY = properties.getProperty(QUERY_KEY).equals("null") ? null : properties.getProperty(QUERY_KEY);
  public static final String INPUT_FILE_NAME = properties.getProperty(INPUT_FILE_NAME_KEY).equals("null") ? null : properties.getProperty(INPUT_FILE_NAME_KEY);
  public static final String REQUEST_PATH = properties.getProperty(REQUEST_PATH_KEY).equals("null") ? null : SAMPLE_PREFIX_PATH +  properties.getProperty(REQUEST_PATH_KEY) + FILE_SEP;
  public static final String OUTPUT_PATH = SAMPLE_PREFIX_PATH + (properties.getProperty(OUTPUT_PATH_KEY).equals("null") ? null : properties.getProperty(OUTPUT_PATH_KEY)) + FILE_SEP;
  public static final String AGREEMENT_DOCUMENT = properties.getProperty(AGREEMENT_DOCUMENT_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_DOCUMENT_KEY) + FILE_SEP;
  public static final String ARCHIVE = properties.getProperty(ARCHIVE_KEY).equals("null") ? null : properties.getProperty(ARCHIVE_KEY) + FILE_SEP;
  public static final String AUDIT_TRAIL = properties.getProperty(AUDIT_TRAIL_KEY).equals("null") ? null : properties.getProperty(AUDIT_TRAIL_KEY) + FILE_SEP;
  public static final String FORM_DATA = properties.getProperty(FORM_DATA_KEY).equals("null") ? null : properties.getProperty(FORM_DATA_KEY) + FILE_SEP;
  public static final String MIME_TYPE_PDF = properties.getProperty(MIME_TYPE_PDF_KEY).equals("null") ? null : properties.getProperty(MIME_TYPE_PDF_KEY);
  public static final int WAITING_DAYS = Integer.parseInt(properties.getProperty(WAITING_DAYS_KEY).equals("null") ? MINUS_ONE : properties.getProperty(WAITING_DAYS_KEY));
  public static final int DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE = Integer.parseInt(properties.getProperty(DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(DAYS_BETWEEN_START_DATE_AND_CURRENT_DATE_KEY));
  public static final int DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE = Integer.parseInt(properties.getProperty(DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(DAYS_BETWEEN_END_DATE_AND_CURRENT_DATE_KEY));
  public static final int MAX_EVENTS_SIZE = Integer.parseInt(properties.getProperty(MAX_EVENTS_SIZE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(MAX_EVENTS_SIZE_KEY));
  public static final int FILE_OFFSET = Integer.parseInt(properties.getProperty(FILE_OFFSET_KEY).equals("null") ? MINUS_ONE : properties.getProperty(FILE_OFFSET_KEY));
  public static final int PAGE_SIZE = Integer.parseInt(properties.getProperty(PAGE_SIZE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(PAGE_SIZE_KEY));
  public static final String INPUT_FORM_FIELD_FILE_NAME = properties.getProperty(INPUT_FORM_FIELD_FILE_NAME_KEY).equals("null") ? null : properties.getProperty(INPUT_FORM_FIELD_FILE_NAME_KEY);

  public static final int AGREEMENT_COUNT_LIMIT = Integer.parseInt(properties.getProperty(AGREEMENT_COUNT_LIMIT_KEY).equals("null") ? MINUS_ONE : properties.getProperty(AGREEMENT_COUNT_LIMIT_KEY));
  public static final String ENV_HOST_NAME = properties.getProperty(ENV_HOST_NAME_KEY).equals("null") ? null : properties.getProperty(ENV_HOST_NAME_KEY);

  public static final String USER_EMAIL_PREFIX = properties.getProperty(USER_EMAIL_PREFIX_KEY).equals("null") ? null : properties.getProperty(USER_EMAIL_PREFIX_KEY);
  public static final String USER_EMAIL_DOMAIN = properties.getProperty(USER_EMAIL_DOMAIN_KEY).equals("null") ? null : properties.getProperty(USER_EMAIL_DOMAIN_KEY);

  //OAuth workflow parameters
  public static final String REDIRECT_URI = properties.getProperty(REDIRECT_URI_KEY).equals("null") ? null : properties.getProperty(REDIRECT_URI_KEY);
  public static final String STATE = properties.getProperty(STATE_KEY).equals("null") ? null : properties.getProperty(STATE_KEY);
  public static final String CLIENT_ID = properties.getProperty(CLIENT_ID_KEY).equals("null") ? null : properties.getProperty(CLIENT_ID_KEY);
  public static final String CLIENT_SECRET = properties.getProperty(CLIENT_SECRET_KEY).equals("null") ? null : properties.getProperty(CLIENT_SECRET_KEY);
  public static final String ACCESS_TOKEN_GRANT_TYPE = properties.getProperty(ACCESS_TOKEN_GRANT_TYPE_KEY).equals("null") ? null : properties.getProperty(ACCESS_TOKEN_GRANT_TYPE_KEY);
  public static final String REFRESH_TOKEN_GRANT_TYPE = properties.getProperty(REFRESH_TOKEN_GRANT_TYPE_KEY).equals("null") ? null : properties.getProperty(REFRESH_TOKEN_GRANT_TYPE_KEY);
  public static final String RESPONSE_TYPE = properties.getProperty(RESPONSE_TYPE_KEY).equals("null") ? null : properties.getProperty(RESPONSE_TYPE_KEY);


  public static final String LOG_CONFIG_PATH = SAMPLE_PREFIX_PATH + "src/main/java/com/adobe/sign/resources/log4j.properties";
  private static Properties logProperties=ApiUtils.getProperties(LOG_CONFIG_PATH);
  public static final String LOG_KEY="log";
  public static final String LOG = logProperties.getProperty(LOG_KEY).equals("null") ? null : logProperties.getProperty(LOG_KEY);
  public static final String SERVER_PATH = SAMPLE_PREFIX_PATH + "src/main/java/com/adobe/sign/api/OAuth/server/";
  public static final int SERVER_PORT = Integer.parseInt(properties.getProperty(SERVER_PORT_KEY).equals("null") ? MINUS_ONE : properties.getProperty(SERVER_PORT_KEY));
  public static final String KEY_STORE_FILE = properties.getProperty(KEY_STORE_FILE_KEY).equals("null") ? null : properties.getProperty(KEY_STORE_FILE_KEY);
  public static final String KEY_STORE_PASSWORD = properties.getProperty(KEY_STORE_PASSWORD_KEY).equals("null") ? null : properties.getProperty(KEY_STORE_PASSWORD_KEY);
  public static final String RECIPIENT_SET_NAME = properties.getProperty(RECIPIENT_SET_NAME_KEY).equals("null") ? null : properties.getProperty(RECIPIENT_SET_NAME_KEY);


}