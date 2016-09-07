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
import java.util.Date;
import java.util.Properties;

public class TestData {

  private static final String CONFIG_PATH = ApiUtils.getSdkAbsolutePath() + "src/test/java/com/adobe/sign/resources/config.properties";
  private static Properties properties = ApiUtils.getProperties(CONFIG_PATH);

  private static final String FALSE = "false";
  private static final String MINUS_ONE = "-1";
  private static final String ACCESS_TOKEN_KEY= "accessToken";
  private static final String NULL_PARAM_KEY= "nullParam";
  private static final String EMPTY_PARAM_KEY= "emptyParam";
  private static final String X_API_HEADER_KEY= "xApiHeader";
  private static final String X_USER_EMAIL_KEY= "xUserEmail";
  private static final String GROUP_NAME_SUFFIX_KEY = "groupNameSuffix";
  private static final String GROUP_NAME_KEY = "groupName";
  private static final String MODIFIED_GROUP_NAME_KEY= "modifiedGroupName";
  private static final String FIRST_NAME_KEY= "firstName";
  private static final String LAST_NAME_KEY= "LastName";
  private static final String EMAIL_PREFIX_KEY = "emailPrefix";
  private static final String EMAIL_DOMAIN_KEY = "emailDomain";
  private static final String USER_EMAIL_KEY = "userEmail";
  private static final String MODIFIED_FIRST_NAME_KEY = "modifiedFirstName";
  private static final String INVALID_KEY = "invalidEmail";
  private static final String START_PAGE_KEY= "startPage";
  private static final String END_PAGE_KEY= "endPage";
  private static final String IMAGE_SIZE_KEY= "imageSize";
  private static final String VERSION_ID_KEY= "versionId";
  private static final String POST_EMAIL_KEY= "postEmail";
  private static final String POST_FAX_KEY= "postFax";
  private static final String REDIRECT_URL_KEY= "redirectURL";
  private static final String PARTICPANT_EMAIL_KEY= "participantEmail";
  private static final String AGREEMENT_NAME_PREFIX_KEY = "agreementNamePrefix";
  private static final String AGREEMENT_NAME_KEY = "agreementName";
  private static final String AGREEMENT_QUERY_KEY= "agreementQuery";
  private static final String AGREEMENT_EXTERNAL_ID_KEY= "agreementExternalId";
  private static final String AGREEMENT_EXTERNAL_GROUP_KEY= "agreementExternalGroup";
  private static final String AGREEMENT_EXTERNAL_NAMESPACE_KEY= "agreementExternalNamespace";
  private static final String AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT_KEY= "agreementSupportingDocumentContentFormat";
  private static final String INVALID_URL_KEY = "invalidUrl";
  private static final String INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO_KEY= "includeSupportingDocumentsPagesInfo";
  private static final String INCLUDE_SUPPORTING_DOCUMENTS_IMAGE_URLS_KEY= "includeSupportingDocumentsImageURLs";
  private static final String ATTACH_SUPPORTING_DOCUMENTS_KEY= "attachSupportingDocuments";
  private static final String AUDIT_REPORT_KEY= "auditReport";
  private static final String SHOW_IMAGE_AVAILIBILITY_KEY= "showImageAvailability";
  private static final String PRIVATE_MESSAGE_KEY = "privateMessage";
  private static final String INVALID_REDIRECT_DELAY_KEY= "invalidRedirectDelay";
  private static final String LIBRARY_DOCUMENT_NAME_KEY = "libraryDocumentName";
  private static final String LIBRARY_DOCUMENT_NAME_PREFIX_KEY = "libraryDocumentNamePrefix";
  private static final String TRANSIENT_DOCUMENT_NAME_KEY = "transientDocumentName";
  private static final String SAMPLE_FILE_KEY= "sampleFile";
  private static final String NO_EXTENSION_FILE_KEY= "noExtensionFile";
  private static final String VALID_MIME_KEY= "validMime";
  private static final String EMPTY_MIME_KEY= "emptyMime";
  private static final String WIDGET_NAME_KEY = "widgetName";
  private static final String WIDGET_NAME_PREFIX_KEY = "widgetNamePrefix";
  private static final String WIDGET_UPDATE_MESSAGE_KEY= "widgetUpdateMessage";
  private static final String MEGASIGN_NAME_KEY = "megaSignName";
  private static final String MEGASIGN_NAME_PREFIX_KEY = "megaSignNamePrefix";
  private static final String MEGASIGN_QUERY_KEY= "megaSignQuery";
  private static final String ACCEPT_KEY= "accept";
  private static final String GROUP_ID_KEY= "groupId";
  private static final String WORKFLOW_ID_KEY= "workflowId";
  private static final String INCLUDE_DRAFT_WORKFLOWS_KEY= "includeDraftWorkflows";
  private static final String WORKFLOW_RECIPIENT_INFO_NAME_KEY= "workflowRecipientName";
  private static final String daysBeforeCurrentDate= "daysBeforeCurrentDate";
  private static final String pageSize= "pageSize";

  private static final String REDIRECT_URI_KEY = "redirectUri";
  private static final String STATE_KEY = "state";
  private static final String CLIENT_ID_KEY = "clientId";
  private static final String CLIENT_SECRET_KEY = "clientSecret";
  private static final String ACCESS_TOKEN_GRANT_TYPE_KEY = "accessTokenGrantType";
  private static final String REFRESH_TOKEN_GRANT_TYPE_KEY = "refreshTokenGrantType";
  private static final String RESPONSE_TYPE_KEY = "responseType";
  private static final String RETRY_COUNT_KEY = "retryCount";
  private static final String ENV_HOST_NAME_KEY = "envHostName";

  // Common Parameters
  public static final String ACCESS_TOKEN = properties.getProperty(ACCESS_TOKEN_KEY).equals("null") ? null : properties.getProperty(ACCESS_TOKEN_KEY);

  public static final String NULL_PARAM = properties.getProperty(NULL_PARAM_KEY).equals("null") ? null : properties.getProperty(NULL_PARAM_KEY);
  public static final String EMPTY_PARAM = properties.getProperty(EMPTY_PARAM_KEY).equals("null") ? null : properties.getProperty(EMPTY_PARAM_KEY);

  public static final String X_API_HEADER = properties.getProperty(X_API_HEADER_KEY).equals("null") ? null : properties.getProperty(X_API_HEADER_KEY);
  public static final String X_USER_EMAIL = properties.getProperty(X_USER_EMAIL_KEY).equals("null") ? null : properties.getProperty(X_USER_EMAIL_KEY);
  public static final String ENV_HOST_NAME = properties.getProperty(ENV_HOST_NAME_KEY).equals("null") ? null : properties.getProperty(ENV_HOST_NAME_KEY);
  // Test Parameters
  public static final String RETRY_COUNT = properties.getProperty(RETRY_COUNT_KEY).equals("null") ? null : properties.getProperty(RETRY_COUNT_KEY);
  
  // Group creation details
  public static final String GROUP_NAME_PREFIX = properties.getProperty(GROUP_NAME_SUFFIX_KEY).equals("null") ? null : properties.getProperty(GROUP_NAME_SUFFIX_KEY);
  public static final String GROUP_NAME = properties.getProperty(GROUP_NAME_KEY).equals("null") ? null : properties.getProperty(GROUP_NAME_KEY);

  public static final String MODIFIED_GROUP_NAME = properties.getProperty(MODIFIED_GROUP_NAME_KEY).equals("null") ? null : properties.getProperty(MODIFIED_GROUP_NAME_KEY);

  // User creation details
  public static final String FIRST_NAME = properties.getProperty(FIRST_NAME_KEY).equals("null") ? null : properties.getProperty(FIRST_NAME_KEY);
  public static final String LAST_NAME = properties.getProperty(LAST_NAME_KEY).equals("null") ? null : properties.getProperty(LAST_NAME_KEY);
  public static final String EMAIL = properties.getProperty(EMAIL_PREFIX_KEY).equals("null") ? null : properties.getProperty(EMAIL_PREFIX_KEY);
  public static final String EMAIL_DOMAIN = properties.getProperty(EMAIL_DOMAIN_KEY).equals("null") ? null : properties.getProperty(EMAIL_DOMAIN_KEY);
  public static final String USER_EMAIL = properties.getProperty(USER_EMAIL_KEY).equals("null") ? null : properties.getProperty(USER_EMAIL_KEY);
  public static final String MODIFIED_FIRST_NAME = properties.getProperty(MODIFIED_FIRST_NAME_KEY).equals("null") ? null : properties.getProperty(MODIFIED_FIRST_NAME_KEY);
  public static final String INVALID_EMAIL = properties.getProperty(INVALID_KEY).equals("null") ? null : properties.getProperty(INVALID_KEY);


  // Agreement Parameters
  public static final int START_PAGE = Integer.parseInt( properties.getProperty(START_PAGE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(START_PAGE_KEY));
  public static final int END_PAGE = Integer.parseInt( properties.getProperty(END_PAGE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(END_PAGE_KEY));

  public static String IMAGE_SIZE = properties.getProperty(IMAGE_SIZE_KEY).equals("null") ? null : properties.getProperty(IMAGE_SIZE_KEY);
  public static final String VERSION_ID = properties.getProperty(VERSION_ID_KEY).equals("null") ? null : properties.getProperty(VERSION_ID_KEY);

  public static final String POST_EMAIL = properties.getProperty(POST_EMAIL_KEY).equals("null") ? null : properties.getProperty(POST_EMAIL_KEY);
  public static final String POST_FAX = properties.getProperty(POST_FAX_KEY).equals("null") ? null : properties.getProperty(POST_FAX_KEY);
  public static final String REDIRECT_URL = properties.getProperty(REDIRECT_URL_KEY).equals("null") ? null : properties.getProperty(REDIRECT_URL_KEY);
  public static final String PARTICIPANT_EMAIL =  properties.getProperty(PARTICPANT_EMAIL_KEY).equals("null") ? null : properties.getProperty(PARTICPANT_EMAIL_KEY);
  public static final String AGREEMENT_NAME_PREFIX =  properties.getProperty(AGREEMENT_NAME_PREFIX_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_NAME_PREFIX_KEY);
  public static final String AGREEMENT_NAME = properties.getProperty(AGREEMENT_NAME_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_NAME_KEY);
  public static final String AGREEMENT_QUERY = properties.getProperty(AGREEMENT_QUERY_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_QUERY_KEY);
  public static final String AGREEMENT_EXTERNAL_ID = properties.getProperty(AGREEMENT_EXTERNAL_ID_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_EXTERNAL_ID_KEY);
  public static final String AGREEMENT_EXTERNAL_GROUP = properties.getProperty(AGREEMENT_EXTERNAL_GROUP_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_EXTERNAL_GROUP_KEY);
  public static final String AGREEMENT_EXTERNAL_NAMESPACE = properties.getProperty(AGREEMENT_EXTERNAL_NAMESPACE_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_EXTERNAL_NAMESPACE_KEY);
  public static final String AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT = properties.getProperty(AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT_KEY);
  public static final String INVALID_URL = properties.getProperty(INVALID_URL_KEY).equals("null") ? null : properties.getProperty(INVALID_URL_KEY);

  public static final boolean INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO = Boolean.parseBoolean( properties.getProperty(INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO_KEY).equals("null") ? FALSE : properties.getProperty(INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO_KEY));
  public static final boolean INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS = Boolean.parseBoolean( properties.getProperty(INCLUDE_SUPPORTING_DOCUMENTS_IMAGE_URLS_KEY).equals("null") ? FALSE : properties.getProperty(INCLUDE_SUPPORTING_DOCUMENTS_IMAGE_URLS_KEY));
  public static final boolean ATTACH_SUPPORTING_DOCUMENTS = Boolean.parseBoolean( properties.getProperty(ATTACH_SUPPORTING_DOCUMENTS_KEY).equals("null") ? FALSE : properties.getProperty(ATTACH_SUPPORTING_DOCUMENTS_KEY));
  public static final boolean AUDIT_REPORT = Boolean.parseBoolean( properties.getProperty(AUDIT_REPORT_KEY).equals("null") ? FALSE : properties.getProperty(AUDIT_REPORT_KEY));
  public static final boolean SHOW_IMAGE_AVAILIBILITY =Boolean.parseBoolean( properties.getProperty(SHOW_IMAGE_AVAILIBILITY_KEY).equals("null") ? FALSE : properties.getProperty(SHOW_IMAGE_AVAILIBILITY_KEY));

  public static final String PRIVATE_MESSAGE = properties.getProperty(PRIVATE_MESSAGE_KEY).equals("null") ? null : properties.getProperty(PRIVATE_MESSAGE_KEY);
  public static final int INVALID_REDIRECT_DELAY =Integer.parseInt( properties.getProperty(INVALID_REDIRECT_DELAY_KEY).equals("null") ? MINUS_ONE : properties.getProperty(INVALID_REDIRECT_DELAY_KEY));

      // Library document Parameters
  public static final String LIBRARY_DOCUMENT_NAME = properties.getProperty(LIBRARY_DOCUMENT_NAME_KEY).equals("null") ? null : properties.getProperty(LIBRARY_DOCUMENT_NAME_KEY);
  public static final String LIBRARY_DOCUMENT_NAME_PREFIX = properties.getProperty(LIBRARY_DOCUMENT_NAME_PREFIX_KEY).equals("null") ? null : properties.getProperty(LIBRARY_DOCUMENT_NAME_PREFIX_KEY);

  // Transient Document Parameters
  public static final String TRANSIENT_DOCUMENT_NAME = properties.getProperty(TRANSIENT_DOCUMENT_NAME_KEY).equals("null") ? null : properties.getProperty(TRANSIENT_DOCUMENT_NAME_KEY);
  public static final File SAMPLE_FILE = new File(properties.getProperty(SAMPLE_FILE_KEY).equals("null") ? null : ApiUtils.getSdkAbsolutePath() + properties.getProperty(SAMPLE_FILE_KEY));
  public static final File NO_EXTENSION_FILE = new File(properties.getProperty(NO_EXTENSION_FILE_KEY).equals("null") ? null : properties.getProperty(NO_EXTENSION_FILE_KEY));
  public static final String VALID_MIME =properties.getProperty(VALID_MIME_KEY).equals("null") ? null : properties.getProperty(VALID_MIME_KEY);
  public static final String EMPTY_MIME =properties.getProperty(EMPTY_MIME_KEY).equals("null") ? null : properties.getProperty(EMPTY_MIME_KEY);

  // Widget parameters
  public static final String WIDGET_NAME = properties.getProperty(WIDGET_NAME_KEY).equals("null") ? null : properties.getProperty(WIDGET_NAME_KEY);
  public static final String WIDGET_NAME_PREFIX = properties.getProperty(WIDGET_NAME_PREFIX_KEY).equals("null") ? null : properties.getProperty(WIDGET_NAME_PREFIX_KEY);
  public static final String WIDGET_UPDATE_MESSAGE = properties.getProperty(WIDGET_UPDATE_MESSAGE_KEY).equals("null") ? null : properties.getProperty(WIDGET_UPDATE_MESSAGE_KEY);
  // MegaSign parameters
  public static final String MEGASIGN_NAME = properties.getProperty(MEGASIGN_NAME_KEY).equals("null") ? null : properties.getProperty(MEGASIGN_NAME_KEY);
  public static final String MEGASIGN_NAME_PREFIX = properties.getProperty(MEGASIGN_NAME_PREFIX_KEY).equals("null") ? null : properties.getProperty(MEGASIGN_NAME_PREFIX_KEY);
  public static final String MEGASIGN_QUERY =properties.getProperty(MEGASIGN_QUERY_KEY).equals("null") ? null : properties.getProperty(MEGASIGN_QUERY_KEY);
  public static final String ACCEPT =properties.getProperty(ACCEPT_KEY).equals("null") ? null : properties.getProperty(ACCEPT_KEY);

  // Reminders parameters

//Search parameters
 public static final int DAYS_BEFORE_CURRENT_DATE = Integer.parseInt(properties.getProperty(daysBeforeCurrentDate).equals("null") ? MINUS_ONE : properties.getProperty(daysBeforeCurrentDate));
 public static final Date STATIC_START_DATE = ApiUtils.getDate(-DAYS_BEFORE_CURRENT_DATE);
 public static final Date STATIC_END_DATE = ApiUtils.getDate(0);

 public static final int PAGE_SIZE = Integer.parseInt(properties.getProperty(pageSize).equals("null") ? MINUS_ONE : properties.getProperty(pageSize));

 // Workflows parameters
 public static final boolean INCLUDE_DRAFT_WORKFLOWS = Boolean.parseBoolean(properties.getProperty(INCLUDE_DRAFT_WORKFLOWS_KEY).equals("null") ? FALSE : properties.getProperty(INCLUDE_DRAFT_WORKFLOWS_KEY));
 public static final String GROUP_ID = properties.getProperty(GROUP_ID_KEY).equals("null") ? null : properties.getProperty(GROUP_ID_KEY);
 public static final String WORKFLOW_ID = properties.getProperty(WORKFLOW_ID_KEY).equals("null") ? null : properties.getProperty(WORKFLOW_ID_KEY);
 public static final String WORKFLOW_RECIPIENT_INFO_NAME = properties.getProperty(WORKFLOW_RECIPIENT_INFO_NAME_KEY).equals("null") ? null : properties.getProperty(WORKFLOW_RECIPIENT_INFO_NAME_KEY);

  //OAuth workflow parameters
  public static final String REDIRECT_URI = properties.getProperty(REDIRECT_URI_KEY).equals("null") ? null : properties.getProperty(REDIRECT_URI_KEY);
  public static final String STATE = properties.getProperty(STATE_KEY).equals("null") ? null : properties.getProperty(STATE_KEY);
  public static final String CLIENT_ID = properties.getProperty(CLIENT_ID_KEY).equals("null") ? null : properties.getProperty(CLIENT_ID_KEY);
  public static final String CLIENT_SECRET = properties.getProperty(CLIENT_SECRET_KEY).equals("null") ? null : properties.getProperty(CLIENT_SECRET_KEY);
  public static final String ACCESS_TOKEN_GRANT_TYPE = properties.getProperty(ACCESS_TOKEN_GRANT_TYPE_KEY).equals("null") ? null : properties.getProperty(ACCESS_TOKEN_GRANT_TYPE_KEY);
  public static final String REFRESH_TOKEN_GRANT_TYPE = properties.getProperty(REFRESH_TOKEN_GRANT_TYPE_KEY).equals("null") ? null : properties.getProperty(REFRESH_TOKEN_GRANT_TYPE_KEY);
  public static final String RESPONSE_TYPE = properties.getProperty(RESPONSE_TYPE_KEY).equals("null") ? null : properties.getProperty(RESPONSE_TYPE_KEY);

}
