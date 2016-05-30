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
import com.adobe.sign.utils.validator.GroupsApiValidator;

import com.adobe.sign.model.groups.GroupsInfo;
import com.adobe.sign.model.groups.GroupCreationInfo;
import com.adobe.sign.model.groups.GroupCreationResponse;
import com.adobe.sign.model.groups.GroupDetailsInfo;
import com.adobe.sign.model.groups.GroupModificationInfo;
import com.adobe.sign.model.groups.GroupModificationResponse;
import com.adobe.sign.model.groups.UsersInfo;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:53.620+05:30")
public class GroupsApi {
  private ApiClient apiClient;

  public GroupsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Gets all the groups in an account.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return GroupsInfo
   */
  public GroupsInfo getGroups (String accessToken,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    GroupsApiValidator.getGroupsValidator(accessToken, xApiUser);

    //Create path and map variables
    String path = "/groups".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<GroupsInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Creates a new group in an account.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_write
   * @param groupCreationInfo 
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return GroupCreationResponse
   */
  public GroupCreationResponse createGroup (String accessToken,
                                                        GroupCreationInfo groupCreationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    GroupsApiValidator.createGroupValidator(accessToken, groupCreationInfo, xApiUser);

    //Create path and map variables
    String path = "/groups".replaceAll("\\{format\\}","json");

    Object postBody = groupCreationInfo;
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
    
    TypeRef returnType = new TypeRef<GroupCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieve detailed information about the group.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_read
   * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return GroupDetailsInfo
   */
  public GroupDetailsInfo getGroupDetails (String accessToken,
                                                        String groupId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    GroupsApiValidator.getGroupDetailsValidator(accessToken, groupId, xApiUser);

    //Create path and map variables
    String path = "/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    TypeRef returnType = new TypeRef<GroupDetailsInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Update an existing group.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_write
   * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
   * @param groupModificationInfo 
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return GroupModificationResponse
   */
  public GroupModificationResponse modifyGroup (String accessToken,
                                                        String groupId,
                                                        GroupModificationInfo groupModificationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    GroupsApiValidator.modifyGroupValidator(accessToken, groupId, groupModificationInfo, xApiUser);

    //Create path and map variables
    String path = "/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    Object postBody = groupModificationInfo;
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
    
    TypeRef returnType = new TypeRef<GroupModificationResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Delete an existing group.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_write
   * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return void
   */
  public void deleteGroup (String accessToken,
                                                        String groupId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    GroupsApiValidator.deleteGroupValidator(accessToken, groupId, xApiUser);

    //Create path and map variables
    String path = "/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null);
    
  }
  
  /**
   * Gets all the users in a group.
   * 
   * @param accessToken An OAuth Access Token with scopes:user_read
   * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return UsersInfo
   */
  public UsersInfo getUsersInGroup (String accessToken,
                                                        String groupId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    GroupsApiValidator.getUsersInGroupValidator(accessToken, groupId, xApiUser);

    //Create path and map variables
    String path = "/groups/{groupId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    TypeRef returnType = new TypeRef<UsersInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
