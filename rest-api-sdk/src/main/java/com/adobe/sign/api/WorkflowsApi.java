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
import com.adobe.sign.utils.validator.WorkflowsApiValidator;

import com.adobe.sign.model.workflows.UserWorkflows;
import com.adobe.sign.model.workflows.WorkflowDescription;
import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
import com.adobe.sign.model.workflows.AgreementCreationResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:02.764+05:30")
public class WorkflowsApi {
  private ApiClient apiClient;

  public WorkflowsApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Retrieves workflows for a user.
   * 
   * @param accessToken An OAuth Access Token with scopes:workflow_read
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @param includeDraftWorkflows Include draft workflows
   * @param groupId The group identifier for which the workflows will be fetched
   * @return UserWorkflows
   */
  public UserWorkflows getWorkflows (String accessToken,
                                                        String xApiUser,
                                                        Boolean includeDraftWorkflows,
                                                        String groupId) throws ApiException {
    //Validate Request
    WorkflowsApiValidator.getWorkflowsValidator(accessToken, xApiUser, includeDraftWorkflows, groupId);

    //Create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    if (accessToken != null)
    headerParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (xApiUser != null)
    headerParams.put("x-api-user", apiClient.parameterToString(xApiUser));
    
    List<Pair> queryParams = new ArrayList<Pair>();
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeDraftWorkflows", includeDraftWorkflows));
    
    queryParams.addAll(apiClient.parameterToPairs("", "groupId", groupId));
    
    Map<String, Object> formParams = new HashMap<String, Object>();
    
    final String[] accepts = {
      "application/json"
    };
    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<UserWorkflows>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Retrieves the details of a workflow.
   * 
   * @param accessToken An OAuth Access Token with scopes:workflow_read
   * @param workflowId The workflow identifier, as retrieved from the API to fetch workflows.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return WorkflowDescription
   */
  public WorkflowDescription getWorkflowInfo (String accessToken,
                                                        String workflowId,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WorkflowsApiValidator.getWorkflowInfoValidator(accessToken, workflowId, xApiUser);

    //Create path and map variables
    String path = "/workflows/{workflowId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workflowId" + "\\}", apiClient.escapeString(workflowId.toString()));

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
    
    TypeRef returnType = new TypeRef<WorkflowDescription>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
  /**
   * Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
   * 
   * @param accessToken An OAuth Access Token with scopes:workflow_read - To read the workflow resource which will be used for agreement creationagreement_send - If authoringRequested parameter is set to falseagreement_write - If authoringRequested parameter is set to trueuser_login - Required additionally if the autoLoginUser parameter is set to true
   * @param workflowId The workflow identifier, as retrieved from the API to fetch workflows.
   * @param customWorkflowAgreementCreationRequest Information about the agreement that you want to send and authoring options that you want to apply at the time of sending. NOTE: optional specified with the input parameters is a general guideline on normal request sent to this endpoint. You need to check the actual workflow definition to determine whether a parameter is required or optional.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return AgreementCreationResponse
   */
  public AgreementCreationResponse createWorkflowAgreement (String accessToken,
                                                        String workflowId,
                                                        CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    WorkflowsApiValidator.createWorkflowAgreementValidator(accessToken, workflowId, customWorkflowAgreementCreationRequest, xApiUser);

    //Create path and map variables
    String path = "/workflows/{workflowId}/agreements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workflowId" + "\\}", apiClient.escapeString(workflowId.toString()));

    Object postBody = customWorkflowAgreementCreationRequest;
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
    
    TypeRef returnType = new TypeRef<AgreementCreationResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
