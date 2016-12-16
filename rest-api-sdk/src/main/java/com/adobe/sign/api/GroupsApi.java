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
import com.adobe.sign.utils.validator.ApiValidatorHelper;
import com.adobe.sign.utils.validator.GroupsApiValidator;

import com.adobe.sign.model.groups.GroupsInfo;
import com.adobe.sign.model.groups.GroupCreationResponse;
import com.adobe.sign.model.groups.GroupCreationInfo;
import com.adobe.sign.model.groups.GroupDetailsInfo;
import com.adobe.sign.model.groups.GroupModificationResponse;
import com.adobe.sign.model.groups.GroupModificationInfo;
import com.adobe.sign.model.groups.UsersInfo;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:32.597+05:30")
    public class GroupsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public GroupsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Gets all the groups in an account.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @return GroupsInfo
    */
    public GroupsInfo getGroups (MultivaluedMap headers) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    GroupsApiValidator.getGroupsValidator();

    //Create path and map variables
    String path = "/groups".replaceAll("\\{format\\}","json");

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<GroupsInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Creates a new group in an account.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_write 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param groupCreationInfo 
    * @return GroupCreationResponse
    */
    public GroupCreationResponse createGroup (MultivaluedMap headers,
                                        GroupCreationInfo groupCreationInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    GroupsApiValidator.createGroupValidator(groupCreationInfo);

    //Create path and map variables
    String path = "/groups".replaceAll("\\{format\\}","json");

    Object postBody = groupCreationInfo;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<GroupCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieve detailed information about the group.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
    * @return GroupDetailsInfo
    */
    public GroupDetailsInfo getGroupDetails (MultivaluedMap headers,
                                        String groupId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    GroupsApiValidator.getGroupDetailsValidator(groupId);

    //Create path and map variables
    String path = "/groups/{groupId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<GroupDetailsInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Update an existing group.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_write 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
    * @param groupModificationInfo 
    * @return GroupModificationResponse
    */
    public GroupModificationResponse modifyGroup (MultivaluedMap headers,
                                        String groupId,
                                        GroupModificationInfo groupModificationInfo) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    GroupsApiValidator.modifyGroupValidator(groupId,groupModificationInfo);

    //Create path and map variables
    String path = "/groups/{groupId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    Object postBody = groupModificationInfo;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<GroupModificationResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Delete an existing group.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_write 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
    * @return void
    */
    public void deleteGroup (MultivaluedMap headers,
                                        String groupId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    GroupsApiValidator.deleteGroupValidator(groupId);

    //Create path and map variables
    String path = "/groups/{groupId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
    
    }
    
    /**
    * Gets all the users in a group.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with scopes: user_read 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param groupId The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
    * @return UsersInfo
    */
    public UsersInfo getUsersInGroup (MultivaluedMap headers,
                                        String groupId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    GroupsApiValidator.getUsersInGroupValidator(groupId);

    //Create path and map variables
    String path = "/groups/{groupId}/users".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    Set <String> keys = headers.keySet();

    for(String key : keys) {
    String value = apiClient.parameterToString(headers.get(key));
      if(key.equalsIgnoreCase(CONTENT_TYPE)) {
        contentTypesList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCEPT)) {
        acceptsList.add(value);
      }
      else if(key.equalsIgnoreCase(ACCESS_TOKEN)) {
        headerParams.put(ACCESS_TOKEN,value);
      }
      else if(key.equalsIgnoreCase(X_API_USER)) {
        headerParams.put(X_API_USER,value);
      }
    }

    List<Pair> queryParams = new ArrayList<Pair>();
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UsersInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
