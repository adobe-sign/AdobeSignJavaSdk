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
import com.adobe.sign.utils.validator.TransientDocumentsApiValidator;

import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;
import java.io.File;

    import java.util.*;
import javax.ws.rs.core.MultivaluedMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T17:48:36.483+05:30")
    public class TransientDocumentsApi {
    private ApiClient apiClient;
    private final String CONTENT_TYPE = "Content-Type";
    private final String ACCEPT = "Accept";
    private final String ACCESS_TOKEN = "Access-Token";
    private final String X_API_USER = "x-api-user";

    public TransientDocumentsApi() {
    this.apiClient = Context.getDefaultApiClient();
    }

    
    /**
    * Uploads a document and obtains the ID of the document.
    * The document uploaded through this call is referred to as transient since it is available only for 7 days after the upload. The returned transient document ID can be used to refer to the document in api calls like POST /agreements where uploaded file needs to be referred. The transient document request is a multipart request consisting of three parts - filename, mime type and the file stream. You can only upload one file at a time in this request.
    * @param headers Multivalued map containing key value pair for below parameters and custom parameters.
    <pre>
    <br>Access-Token(key) An OAuth Access Token with any of the following scopes: agreement_write agreement_send widget_write library_write 
    <br>x-api-user(key) The userId or email of API caller using the account or group token in the format userid:{userId} OR email:{email}. If it is not specified, then the caller is inferred from the token. </pre>
    
    * @param fileName A name for the document being uploaded.
    * @param file The file part of the multipart request for document upload. You can upload only one file at a time.
    * @param mimeType The mime type of the document being uploaded. If not specified here then mime type is picked up from the file object. If mime type is not present there either then mime type is inferred from file name extension.
    * @return TransientDocumentResponse
    */
    public TransientDocumentResponse createTransientDocument (MultivaluedMap headers,
                                        String fileName,
                                        File file,
                                        String mimeType) throws ApiException {

    //Validate header parameters
    ApiValidatorHelper.validateHeaderParams(headers);

    //Validate Request
    TransientDocumentsApiValidator.createTransientDocumentValidator(fileName, mimeType, file);

    //Create path and map variables
    String path = "/transientDocuments".replaceAll("\\{format\\}","json");

    Object postBody = null;
    byte[] postBinaryBody = null;

    Map<String, String> headerParams = new HashMap<String, String>();
    List<String> acceptsList = new ArrayList<String>();
    List<String> contentTypesList = new ArrayList<String>();
    
    acceptsList.add("application/json");
    
    contentTypesList.add("multipart/form-data");
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
    if (fileName != null)
    formParams.put("File-Name", fileName);
    if (mimeType != null)
    formParams.put("Mime-Type", mimeType);
    if (file != null)
    formParams.put("File", file);
    
    String[] accepts = new String[acceptsList.size()];
    accepts = acceptsList.toArray(accepts);

    String[] contentTypes = new String[contentTypesList.size()];
    contentTypes = contentTypesList.toArray(contentTypes);

    final String acceptHeader = apiClient.selectHeaderAccept(accepts);

    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    
    TypeRef returnType = new TypeRef<TransientDocumentResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
    
    }
    
  }
