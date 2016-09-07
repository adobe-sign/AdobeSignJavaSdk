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

public class Errors {
  public final static String CREATE_USER = "Failure in creating the user";
  public final static String GET_USERS = "Failure in fetching the users";
  public final static String CREATE_NEW_USER_IN_ACCOUNT = "Failure in creating new user in account";
  public final static String GET_USERS_IN_ACCOUNT = "Failure in fetching users in the account";

  public final static String CREATE_GROUP = "Failure in creating the group";
  public final static String CREATE_GROUP_OAUTH = "Failure in creating the group with OAuth workflow.";
  public final static String GET_GROUPS = "Failure in fetching the groups";
  public final static String CREATE_NEW_GROUP_IN_ACCOUNT = "Failure in creating new group in account";
  public final static String CREATE_NEW_GROUP_IN_ACCOUNT_OAUTH = "Failure in creating new group in account with OAuth workflow.";
  public final static String GET_GROUPS_IN_ACCOUNT = "Failure in fetching groups in the account";

  public final static String CREATE_AGREEMENT = "Failure in creating the agreement";
  public final static String GET_AGREEMENTS = "Failure in fetching the agreements";
  public final static String GET_AGREEMENTS_DOCUMENTS = "Failure in fetching documents of the agreement";
  public final static String GET_AGREEMENT_ID = "Failure in fetching agreement id";
  public final static String GET_AGREEMENT_DETAILS = "Failure in fetching the agreement details";
  public final static String GET_AGREEMENT_STATUS = "Failure in fetching status of the agreement";
  public final static String GET_COMBINED_DOCUMENT = "Failure in fetching agreement as a file stream";
  public final static String SEND_AGREEMENT_USING_LIBRARY_DOCUMENT = "Failure in sending agreement using library document";
  public final static String SEND_AGREEMENT_USING_TRANSIENT_DOCUMENT = "Failure in sending agreement using transient document";
  public final static String GET_SIGNING_URL="Failure in fetching signing url";

  public final static String CREATE_MEGASIGN = "Failure in creating the megaSign parent agreement";
  public final static String GET_MEGASIGNS = "Failure in fetching the megaSign parent agreements";
  public final static String GET_MEGASIGN_DETAILS = "Failure in fetching the megaSign parent agreement details";
  public final static String GET_MEGASIGN_STATUS = "Failure in fetching status of the megaSign parent agreement";
  public final static String SEND_MEGASIGN_USING_LIBRARY_DOCUMENT = "Failure in sending megaSign parent agreement using library document";
  public final static String SEND_MEGASIGN_USING_TRANSIENT_DOCUMENT = "Failure in sending megaSign parent agreement using transient document";

  public final static String CREATE_ALTERNATE_PARTICIPANT = "Failure in creating alternate participant";
  public final static String CREATE_ALTERNATE_PARTICIPANT_FOR_AGREEMENT  = "Failure in creating alternate participant for the agreement";

  public final static String NO_LIBRARY_DOCUMENTS = "No library documents found";
  public final static String GET_LIBRARY_DOCUMENTS = "Failure in fetching the library documents";
  public final static String GET_FIRST_LIBRARY_DOCUMENT = "Failure in fetching the first library document of user";
  public final static String GET_PERSONAL_LIBRARY_DOCUMENTS = "Failure in fetching the personal library documents of a user";
  public final static String CREATE_TRANSIENT_DOCUMENT = "Failure in creating transient document";
  public final static String GET_URL_FOR_MANAGE_PAGE = "Failure in fetching URL for manage page";
  public final static String GET_URL_FOR_SETTINGS_PAGE = "Failure in fetching URL for settings page";
  public final static String GET_URL_FOR_VIEW_AGREEMENT_ASSET_PAGE = "Failure in fetching URL for view agreement asset page";
  public final static String URL_FOR_MANAGE_PAGE= "Failure in generating URL for manage page";
  public final static String URL_FOR_SETTINGS_PAGE= "Failure in generating URL for settings page";
  public final static String URL_FOR_VIEW_AGREEMENT_ASSET_PAGE= "Failure in generating URL for view page of given agreement asset";
  public final static String NO_PARTICIPANT_SET = "Failure in fetching next participant for the given agreement";
  public final static String GET_NEXT_PARTICIPANT_SET_INFO = "Failure in fetching next participant set information";
  public final static String SEND_REMINDER = "Failure in sending the reminder";
  public final static String SEND_REMINDER_PENDING_AGREEMENT = "Failure in sending the reminder on the pending agreement";
  public final static String SAVE_DOCUMENTS = "Failure in saving the contents of the documents" ;
  public final static String GET_FILE_STREAM = "Failure in fetching file stream of the document";
  public final static String GET_AUDIT_TRAIL = "Error while fetching the audit trail";
  public final static String DOWNLOAD_AUDIT_TRAIL = "Error while downloading the audit trail of the agreement";
  public final static String FILE_NOT_SAVED = "File not saved";
  public final static String FILE_NOT_CLOSED = "File not closed ";
  public final static String DOWNLOAD_DOCUMENT = "Failure in downloading documents of agreement";
  public final static String ARCHIVE_AGREEMENT = "Failure in archiving agreements";
  public final static String GET_WIDGET_FORM_DATA = "Failure in getting widget form data";
  public final static String RETRIEVE_FORM_DATA_WIDGET = "Failure in retrieving the form data of widget";
  public final static String NO_WIDGET_FOUND = "No widget found";
  public final static String NO_EVENT_IN_GIVEN_RANGE = "No agreement asset events found in the given range";
  public final static String CREATE_SEARCH_FOR_AGREEMENT_ASSET_EVENT_FOR_USER = "Failure in creating the new search for agreement asset event for user";
  public final static String GET_SEARCH_AGREEMENT_ASSET_EVENT_FOR_USER = "Failure in fetching details of agreement events for the user using Page Cursor.";
  public final static String SEARCH_AGREEMENT_ASSET_EVENT_FOR_USER = "Failure in fetching details of agreement events for the user.";
  public final static String GET_WIDGETS = "Failure in fetching widgets for the user";
  public final static String GET_FIRST_WIDGET = "Failure in fetching the id of first widget of user";
  public final static String CREATE_WIDGET = "Failure in creating a new widget for the user.";
  public final static String CREATE_WIDGET_WITH_COUNTER_SIGNERS = "Failure in creating a new widget for the user with counter signers.";

  public final static String GET_PROPERTIES = "Failure in fetching properties";
  public final static String CHECK_AGREEMENT_EXIST = "Failure in fetching the agreement with given agreement name";

  public final static String SET_BASE_URI = "Error in setting the base uri";
  public final static String GENERATE_AUTH_CODE_FROM_SERVER = "Generate auth code from local auth code server";
  public final static String START_HTTPS_SERVER = "Failure in starting the HTTPS server";
  public final static String OAUTH_HANDLER = "Failure in authorizing for Oauth code";
  public final static String REDIRECT_HANDLER = "Failure in redirecting to redirect URI";
  public final static String SEND_TO_GROUP = "Failure in sending agreement to the specified group";
}

