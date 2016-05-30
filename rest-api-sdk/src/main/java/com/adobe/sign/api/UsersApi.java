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
package com.adobe.sign.api;

import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.ApiClient;
import com.adobe.sign.utils.Context;
import com.adobe.sign.utils.Pair;
import com.adobe.sign.utils.TypeRef;
import com.adobe.sign.utils.validator.UsersApiValidator;

import com.adobe.sign.model.users.UsersInfo;
import com.adobe.sign.model.users.UserCreationResponse;
import com.adobe.sign.model.users.UserCreationInfo;
import com.adobe.sign.model.users.UserDetailsInfo;
import com.adobe.sign.model.users.UserModificationInfo;
import com.adobe.sign.model.users.UserStatusUpdateInfo;
import com.adobe.sign.model.users.UserStatusUpdateResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:54.575+05:30")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Gets all the users in an account.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param xUserEmail The email address of the user whose details are being requested
   * @return UsersInfo
   */
  public UsersInfo getUsers (String accessToken,
                                                        String xApiUser,
                                                        String xUserEmail) throws ApiException {
    //Validate Request
    UsersApiValidator.getUsersValidator(accessToken, xApiUser, xUserEmail);

    //Create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "x-user-email", xUserEmail));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UsersInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Creates a new user in the Adobe Sign system
   * 
   * @param accessToken An OAuth Access Token with scopes:user_write
   * @param userCreationInfo 
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return UserCreationResponse
   */
  public UserCreationResponse createUser (String accessToken,
                                                        UserCreationInfo userCreationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    UsersApiValidator.createUserValidator(accessToken, userCreationInfo, xApiUser);

    //Create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

    Object postBody = userCreationInfo;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieve detailed information about the user in the caller account.
   * If caller is neither an account admin nor group admin then some user information will not be returned.
   * @param accessToken An OAuth Access Token with scopes:user_read
   * @param userId The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \&quot;me\&quot; without quotes.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return UserDetailsInfo
   */
  public UserDetailsInfo getUserDetail (String accessToken,
                                                        String userId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    UsersApiValidator.getUserDetailValidator(accessToken, userId, xApiUser);

    //Create path and map variables
    String path = "/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserDetailsInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Update an existing user.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_write
   * @param userId The user identifier, as returned by the user creation API or retrieved from the API to fetch users
   * @param userModificationInfo 
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return UserDetailsInfo
   */
  public UserDetailsInfo modifyUser (String accessToken,
                                                        String userId,
                                                        UserModificationInfo userModificationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    UsersApiValidator.modifyUserValidator(accessToken, userId, userModificationInfo, xApiUser);

    //Create path and map variables
    String path = "/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    Object postBody = userModificationInfo;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserDetailsInfo>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Activate/Deactivate a given user.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_write
   * @param userId The user identifier, as returned by the user creation API or retrieved from the API to fetch users
   * @param userStatusUpdateInfo User status update information object.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return UserStatusUpdateResponse
   */
  public UserStatusUpdateResponse modifyUserStatus (String accessToken,
                                                        String userId,
                                                        UserStatusUpdateInfo userStatusUpdateInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    UsersApiValidator.modifyUserStatusValidator(accessToken, userId, userStatusUpdateInfo, xApiUser);

    //Create path and map variables
    String path = "/users/{userId}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    Object postBody = userStatusUpdateInfo;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserStatusUpdateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
