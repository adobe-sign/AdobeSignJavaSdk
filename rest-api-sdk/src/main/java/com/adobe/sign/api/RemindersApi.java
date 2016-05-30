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
import com.adobe.sign.utils.validator.RemindersApiValidator;

import com.adobe.sign.model.reminders.ReminderCreationResult;
import com.adobe.sign.model.reminders.ReminderCreationInfo;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:25:03.983+05:30")
public class RemindersApi {
  private ApiClient apiClient;

  public RemindersApi() {
    this.apiClient = Context.getDefaultApiClient();
  }

  
  /**
   * Sends a reminder for an agreement.
   * Sends a reminder for an agreement.
   * @param accessToken An OAuth Access Token with scopes:agreement_write
   * @param reminderCreationInfo The agreement identifier.
   * @param xApiUser The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token.
   * @return ReminderCreationResult
   */
  public ReminderCreationResult createReminder (String accessToken,
                                                        ReminderCreationInfo reminderCreationInfo,
                                                        String xApiUser) throws ApiException {
    //Validate Request
    RemindersApiValidator.createReminderValidator(accessToken, reminderCreationInfo, xApiUser);

    //Create path and map variables
    String path = "/reminders".replaceAll("\\{format\\}","json");

    Object postBody = reminderCreationInfo;
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
    
    TypeRef returnType = new TypeRef<ReminderCreationResult>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType);
    
  }
  
}
