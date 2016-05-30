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
package com.adobe.sign.utils.validator;

import javax.ws.rs.core.Response;

/**
 * This is a REST API error class which contains a list of all the errors that can be thrown because of failure in validations for multiple resource end points.
 */

public enum SdkErrorCodes {

  OK("", Response.Status.OK),
  EMPTY_REDIRECT_URL("If PostSignOptions are specified, the redirectUrl must not be empty", Response.Status.BAD_REQUEST),
  INVALID_ACCESS_TOKEN("Access token provided is invalid or has expired", Response.Status.UNAUTHORIZED),
  INVALID_ARGUMENTS("One or more arguments to the method are invalid", Response.Status.BAD_REQUEST),
  INVALID_DOCUMENT_ID("The Document ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_EMAIL("Email provided is invalid", Response.Status.BAD_REQUEST),
  INVALID_FILE_INFO("Invalid or no file info is provided", Response.Status.BAD_REQUEST),
  INVALID_LIBRARYDOCUMENT_NAME("The Library Document name specified is invalid", Response.Status.NOT_FOUND),
  INVALID_PARTICIPANT("The participant email specified is invalid", Response.Status.NOT_FOUND),
  INVALID_REDIRECT_DELAY("The redirectDelay specified in PostSignOptions must be nonnegative integer", Response.Status.BAD_REQUEST),
  INVALID_REDIRECT_URL("The redirectUrl specified in PostSignOptions is not a valid URL", Response.Status.BAD_REQUEST),
  INVALID_TRANSIENTDOCUMENT_ID("The Transient Document ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_X_API_USER_HEADER("Value provided in x-api-user header is in invalid format", Response.Status.BAD_REQUEST),
  INVALID_VERSION_ID("The Version ID specified is invalid", Response.Status.NOT_FOUND),
  MISSING_REQUIRED_PARAM("Required parameters are missing.", Response.Status.BAD_REQUEST),
  MUST_PROVIDE_EMAIL("Must provide email for user creation", Response.Status.BAD_REQUEST),
  NO_ACCESS_TOKEN_HEADER("Access token header not provided", Response.Status.UNAUTHORIZED),
  EMPTY_EXTERNALID_PARAMETER("ExternalId parameter can not be empty",Response.Status.BAD_REQUEST),
  INVALID_AGREEMENT_ID("The Agreement ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_PARTICIPANT_ID("The participant ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_PARTICIPANT_SET_ID("The participant set ID specified is invalid", Response.Status.NOT_FOUND),
  EMPTY_PRIVATE_MESSAGE("The message specified for the alternate participant addition cannot be empty", Response.Status.BAD_REQUEST),
  MUST_PROVIDE_VALID_AGREEMENT_STATUS("Must provide a valid agreement status", Response.Status.BAD_REQUEST),
  MUST_PROVIDE_VALID_USER_STATUS("Must provide a valid user status", Response.Status.BAD_REQUEST),
  RECIPIENT_SET_NOT_SUPPORTED("Recipient set with multiple recipients is not supported for a Mega Sign.", Response.Status.BAD_REQUEST),
  PRIVATE_MESSAGES_NOT_ENABLED("Sending private messages to recipients is not enabled for this user", Response.Status.FORBIDDEN),
  URL_INVALID("Provided document URL is invalid.", Response.Status.BAD_REQUEST),
  INVALID_GROUP_ID("The Group ID specified is invalid",Response.Status.NOT_FOUND),
  INVALID_GROUP_NAME("The group name provided is not valid or is already taken, group names must be a unique non-empty strings no longer than 255 characters.",Response.Status.BAD_REQUEST),
  INVALID_LIBRARYDOCUMENT_ID("The Library Document ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_MEGASIGN_ID("The Mega Sign ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_MEGASIGN_STATUS("Must provide a valid mega sign status.", Response.Status.BAD_REQUEST),
  MUST_PROVIDE_AGREEMENT_ID("Must provide an Agreement ID", Response.Status.BAD_REQUEST),
  INVALID_DATE("Date requested is invalid. Please check end date is greater than start date and range is not greater than 180 days", Response.Status.BAD_REQUEST),
  INVALID_PAGE_CURSOR("Page cursor provided is invalid", Response.Status.BAD_REQUEST),
  INVALID_SEARCH_ID("Search ID provided is invalid", Response.Status.NOT_FOUND),
  NO_FILE_NAME("Must provide file name",Response.Status.BAD_REQUEST),
  NO_FILE_CONTENT("Must provide file body",Response.Status.BAD_REQUEST),
  NO_MEDIA_TYPE("No media type specified", Response.Status.UNSUPPORTED_MEDIA_TYPE),
  INVALID_USER_ID("The User ID specified is invalid", Response.Status.NOT_FOUND),
  INVALID_RECIPIENT_EMAIL("Recipient email is missing or invalid", Response.Status.NOT_FOUND),
  INVALID_AGREEMENT_ASSET_ID("The Agreement Asset ID specified is invalid", Response.Status.BAD_REQUEST),
  INVALID_TARGET_VIEW("Invalid Target View",Response.Status.BAD_REQUEST),
  INVALID_SIGNATURE_FLOW("Only SENDER_SIGNATURE_NOT_REQUIRED and SENDER_SIGNS_LAST are permitted for widgets", Response.Status.BAD_REQUEST),
  INVALID_URL("The redirect URL is not valid", Response.Status.BAD_REQUEST),
  INVALID_WIDGET_ID("The Widget ID specified is invalid", Response.Status.NOT_FOUND),
  MUST_PROVIDE_VALID_WIDGET_STATUS("Must provide a valid widget status", Response.Status.BAD_REQUEST),
  NO_ACTION_SPECIFIED("Either a redirectUrl or a message is required", Response.Status.BAD_REQUEST),
  TOO_MANY_ACTIONS_SPECIFIED("Cannot specify both a redirectUrl and a message", Response.Status.BAD_REQUEST),
  INVALID_WORKFLOW_ID("The Workflow ID specified is invalid",Response.Status.NOT_FOUND),
  FILE_INFO_NAME_MISSING("Name is missing in FileInfo field", Response.Status.BAD_REQUEST);
 

  private String message;
  private Response.Status status;

  SdkErrorCodes(String message, Response.Status status) {
    this.message = message;
    this.status = status;
  }

  /**
   * @return the textual message associated with the error code.
   */
  public String getMessage() {
    return message;
  }

  /**
   * @return the HTTP status code
   */
  public int getHttpCode() {
    return status.getStatusCode();
  }

  /**
   * @return the Api error name
   */
  public String getApiCode() {
    return name();
  }

}
