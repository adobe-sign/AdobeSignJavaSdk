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
import com.adobe.sign.utils.validator.WorkflowsApiValidator;

import com.adobe.sign.model.workflows.UserWorkflows;
import com.adobe.sign.model.workflows.WorkflowDescription;
import com.adobe.sign.model.workflows.AgreementCreationResponse;
import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:57.932+05:30")
    public class WorkflowsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public WorkflowsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Retrieves workflows for a user.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: workflow_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param includeDraftWorkflows Include draft workflows
    * @param groupId The group identifier for which the workflows will be fetched
    * @return UserWorkflows
    */
    public UserWorkflows getWorkflows (MultivaluedMap headers,
                                        Boolean includeDraftWorkflows,
                                        String groupId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WorkflowsApiValidator.getWorkflowsValidator(includeDraftWorkflows, groupId);

    //Create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeDraftWorkflows", includeDraftWorkflows));
    
    queryParams.addAll(apiClient.parameterToPairs("", "groupId", groupId));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserWorkflows>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Retrieves the details of a workflow.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: workflow_read 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param workflowId The workflow identifier, as retrieved from the API to fetch workflows.
    * @return WorkflowDescription
    */
    public WorkflowDescription getWorkflowInfo (MultivaluedMap headers,
                                        String workflowId) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WorkflowsApiValidator.getWorkflowInfoValidator(workflowId);

    //Create path and map variables
    String path = "/workflows/{workflowId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "workflowId" + "\\}", apiClient.escapeString(workflowId.toString()));

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
    
    TypeRef returnType = new TypeRef<WorkflowDescription>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
    /**
    * Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
    * 
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    Access-Token(key) An OAuth Access Token with scopes: workflow_read - To read the workflow resource which will be used for agreement creation agreement_send - If authoringRequested parameter is set to false agreement_write - If authoringRequested parameter is set to true user_login - Required additionally if the autoLoginUser parameter is set to true 
    x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param workflowId The workflow identifier, as retrieved from the API to fetch workflows.
    * @param customWorkflowAgreementCreationRequest Information about the agreement that you want to send and authoring options that you want to apply at the time of sending. NOTE: optional specified with the input parameters is a general guideline on normal request sent to this endpoint. You need to check the actual workflow definition to determine whether a parameter is required or optional.
    * @return AgreementCreationResponse
    */
    public AgreementCreationResponse createWorkflowAgreement (MultivaluedMap headers,
                                        String workflowId,
                                        CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    WorkflowsApiValidator.createWorkflowAgreementValidator(workflowId,customWorkflowAgreementCreationRequest);

    //Create path and map variables
    String path = "/workflows/{workflowId}/agreements".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "workflowId" + "\\}", apiClient.escapeString(workflowId.toString()));

    Object postBody = customWorkflowAgreementCreationRequest;
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
    
    TypeRef returnType = new TypeRef<AgreementCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
