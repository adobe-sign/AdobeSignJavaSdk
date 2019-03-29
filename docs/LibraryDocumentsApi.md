# LibraryDocumentsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLibraryDocument**](LibraryDocumentsApi.md#createLibraryDocument) | **POST** /libraryDocuments | Creates a template that is placed in the library of the user for reuse.
[**createLibraryDocumentView**](LibraryDocumentsApi.md#createLibraryDocumentView) | **POST** /libraryDocuments/{libraryDocumentId}/views | Retrieves the latest state view url of a library document.
[**getCombinedDocument**](LibraryDocumentsApi.md#getCombinedDocument) | **GET** /libraryDocuments/{libraryDocumentId}/combinedDocument | Retrieves the combined document associated with a library document.
[**getDocuments**](LibraryDocumentsApi.md#getDocuments) | **GET** /libraryDocuments/{libraryDocumentId}/documents | Retrieves the IDs of the documents associated with library document.
[**getEvents**](LibraryDocumentsApi.md#getEvents) | **GET** /libraryDocuments/{libraryDocumentId}/events | Retrieves the events information for a library document.
[**getFormData**](LibraryDocumentsApi.md#getFormData) | **GET** /libraryDocuments/{libraryDocumentId}/formData | Retrieves data entered into the interactive form fields of the library document.
[**getLibraryDocument**](LibraryDocumentsApi.md#getLibraryDocument) | **GET** /libraryDocuments/{libraryDocumentId}/documents/{documentId} | Retrieves the file stream of a document of library document.
[**getLibraryDocumentAuditTrail**](LibraryDocumentsApi.md#getLibraryDocumentAuditTrail) | **GET** /libraryDocuments/{libraryDocumentId}/auditTrail | Retrieves the audit trail associated with a library document.
[**getLibraryDocumentImageUrls**](LibraryDocumentsApi.md#getLibraryDocumentImageUrls) | **GET** /libraryDocuments/{libraryDocumentId}/documents/{documentId}/imageUrls | Retrieves image urls of all visible pages of a document associated with a library document.
[**getLibraryDocumentInfo**](LibraryDocumentsApi.md#getLibraryDocumentInfo) | **GET** /libraryDocuments/{libraryDocumentId} | Retrieves the details of a library document.
[**getLibraryDocumentNoteForApiUser**](LibraryDocumentsApi.md#getLibraryDocumentNoteForApiUser) | **GET** /libraryDocuments/{libraryDocumentId}/me/note | Retrieves the latest note of a library document for the API user.
[**getLibraryDocuments**](LibraryDocumentsApi.md#getLibraryDocuments) | **GET** /libraryDocuments | Retrieves library documents for a user.
[**updateLibraryDocument**](LibraryDocumentsApi.md#updateLibraryDocument) | **PUT** /libraryDocuments/{libraryDocumentId} | Updates the library document.
[**updateLibraryDocumentNoteForApiUser**](LibraryDocumentsApi.md#updateLibraryDocumentNoteForApiUser) | **PUT** /libraryDocuments/{libraryDocumentId}/me/note | Updates the latest note of a library document for the API user.
[**updateLibraryDocumentState**](LibraryDocumentsApi.md#updateLibraryDocumentState) | **PUT** /libraryDocuments/{libraryDocumentId}/state | Updates the library document&#39;s state.
[**updateLibraryDocumentVisibility**](LibraryDocumentsApi.md#updateLibraryDocumentVisibility) | **PUT** /libraryDocuments/{libraryDocumentId}/me/visibility | Updates the visibility of library document.


<a name="createLibraryDocument"></a>
# **createLibraryDocument**
> LibraryDocumentCreationResponse createLibraryDocument(authorization, libraryDocumentInfo, xApiUser, xOnBehalfOfUser)

Creates a template that is placed in the library of the user for reuse.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
LibraryDocumentCreationInfoV6 libraryDocumentInfo = new LibraryDocumentCreationInfoV6(); // LibraryDocumentCreationInfoV6 | Information about the library document that you want to create.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    LibraryDocumentCreationResponse result = apiInstance.createLibraryDocument(authorization, libraryDocumentInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#createLibraryDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentInfo** | [**LibraryDocumentCreationInfoV6**](LibraryDocumentCreationInfoV6.md)| Information about the library document that you want to create. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**LibraryDocumentCreationResponse**](LibraryDocumentCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLibraryDocumentView"></a>
# **createLibraryDocumentView**
> LibraryDocumentViewResponse createLibraryDocumentView(authorization, libraryDocumentId, libraryViewInfo, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the latest state view url of a library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a> - library document read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
LibraryViewInfo libraryViewInfo = new LibraryViewInfo(); // LibraryViewInfo | Name of the required view and its desired configuration.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    LibraryDocumentViewResponse result = apiInstance.createLibraryDocumentView(authorization, libraryDocumentId, libraryViewInfo, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#createLibraryDocumentView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt; - library document read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **libraryViewInfo** | [**LibraryViewInfo**](LibraryViewInfo.md)| Name of the required view and its desired configuration. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**LibraryDocumentViewResponse**](LibraryDocumentViewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCombinedDocument"></a>
# **getCombinedDocument**
> byte[] getCombinedDocument(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, attachAuditReport)

Retrieves the combined document associated with a library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
Boolean attachAuditReport = true; // Boolean | When set to YES attach an audit report to the library document PDF. Default value will be false.
try {
    byte[] result = apiInstance.getCombinedDocument(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, attachAuditReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getCombinedDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **attachAuditReport** | **Boolean**| When set to YES attach an audit report to the library document PDF. Default value will be false. | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

<a name="getDocuments"></a>
# **getDocuments**
> Documents getDocuments(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId)

Retrieves the IDs of the documents associated with library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String versionId = "versionId_example"; // String | The version identifier of library_document as provided by the API which retrieves information of a specific library document. If not provided then latest version will be used.
try {
    Documents result = apiInstance.getDocuments(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **versionId** | **String**| The version identifier of library_document as provided by the API which retrieves information of a specific library document. If not provided then latest version will be used. | [optional]

### Return type

[**Documents**](Documents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> LibraryDocumentEventList getEvents(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the events information for a library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    LibraryDocumentEventList result = apiInstance.getEvents(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**LibraryDocumentEventList**](LibraryDocumentEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormData"></a>
# **getFormData**
> byte[] getFormData(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves data entered into the interactive form fields of the library document.

This API can only be called by the creator of the library document

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getFormData(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getFormData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getLibraryDocument"></a>
# **getLibraryDocument**
> byte[] getLibraryDocument(authorization, libraryDocumentId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the file stream of a document of library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String documentId = "documentId_example"; // String | The document identifier, as retrieved from the API which fetches the documents of a specified library document
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getLibraryDocument(authorization, libraryDocumentId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getLibraryDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **documentId** | **String**| The document identifier, as retrieved from the API which fetches the documents of a specified library document |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

<a name="getLibraryDocumentAuditTrail"></a>
# **getLibraryDocumentAuditTrail**
> byte[] getLibraryDocumentAuditTrail(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the audit trail associated with a library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getLibraryDocumentAuditTrail(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getLibraryDocumentAuditTrail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

<a name="getLibraryDocumentImageUrls"></a>
# **getLibraryDocumentImageUrls**
> DocumentImageUrlsInfo getLibraryDocumentImageUrls(authorization, libraryDocumentId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, imageSizes, startPage, endPage)

Retrieves image urls of all visible pages of a document associated with a library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String documentId = "documentId_example"; // String | The document identifier, as retrieved from the API which fetches the documents of a specified library document
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String imageSizes = "imageSizes_example"; // String | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}. 
Integer startPage = 56; // Integer | Start of page number range for which imageUrls are requested. Starting page number should be greater than 0.
Integer endPage = 56; // Integer | End of page number range for which imageUrls are requested.
try {
    DocumentImageUrlsInfo result = apiInstance.getLibraryDocumentImageUrls(authorization, libraryDocumentId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, imageSizes, startPage, endPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getLibraryDocumentImageUrls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **documentId** | **String**| The document identifier, as retrieved from the API which fetches the documents of a specified library document |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **imageSizes** | **String**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional]
 **startPage** | **Integer**| Start of page number range for which imageUrls are requested. Starting page number should be greater than 0. | [optional]
 **endPage** | **Integer**| End of page number range for which imageUrls are requested. | [optional]

### Return type

[**DocumentImageUrlsInfo**](DocumentImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLibraryDocumentInfo"></a>
# **getLibraryDocumentInfo**
> LibraryDocumentCreationInfoV6 getLibraryDocumentInfo(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the details of a library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    LibraryDocumentCreationInfoV6 result = apiInstance.getLibraryDocumentInfo(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getLibraryDocumentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**LibraryDocumentCreationInfoV6**](LibraryDocumentCreationInfoV6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLibraryDocumentNoteForApiUser"></a>
# **getLibraryDocumentNoteForApiUser**
> Note getLibraryDocumentNoteForApiUser(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser)

Retrieves the latest note of a library document for the API user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    Note result = apiInstance.getLibraryDocumentNoteForApiUser(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getLibraryDocumentNoteForApiUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**Note**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLibraryDocuments"></a>
# **getLibraryDocuments**
> LibraryDocuments getLibraryDocuments(authorization, xApiUser, xOnBehalfOfUser, showHiddenLibraryDocuments, cursor, pageSize)

Retrieves library documents for a user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
Boolean showHiddenLibraryDocuments = true; // Boolean | A query parameter to fetch all the hidden library documents along with the visible library documents. Default value is false.
String cursor = "cursor_example"; // String | Used to navigate through the pages. If not provided, returns the first page.
Integer pageSize = 56; // Integer | Number of intended items in the response page. If not provided, it is decided by the application settings.
try {
    LibraryDocuments result = apiInstance.getLibraryDocuments(authorization, xApiUser, xOnBehalfOfUser, showHiddenLibraryDocuments, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#getLibraryDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **showHiddenLibraryDocuments** | **Boolean**| A query parameter to fetch all the hidden library documents along with the visible library documents. Default value is false. | [optional]
 **cursor** | **String**| Used to navigate through the pages. If not provided, returns the first page. | [optional]
 **pageSize** | **Integer**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional]

### Return type

[**LibraryDocuments**](LibraryDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLibraryDocument"></a>
# **updateLibraryDocument**
> updateLibraryDocument(authorization, ifMatch, libraryDocumentId, libraryDocumentInfo, xApiUser, xOnBehalfOfUser)

Updates the library document.

Currently status, name, sharingMode and templateTypes of the library document can only be updated.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
LibraryDocumentInfo libraryDocumentInfo = new LibraryDocumentInfo(); // LibraryDocumentInfo | Information about the library document that you want to create.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateLibraryDocument(authorization, ifMatch, libraryDocumentId, libraryDocumentInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#updateLibraryDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **libraryDocumentInfo** | [**LibraryDocumentInfo**](LibraryDocumentInfo.md)| Information about the library document that you want to create. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

<a name="updateLibraryDocumentNoteForApiUser"></a>
# **updateLibraryDocumentNoteForApiUser**
> updateLibraryDocumentNoteForApiUser(authorization, libraryDocumentId, note, xApiUser, xOnBehalfOfUser)

Updates the latest note of a library document for the API user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
Note note = new Note(); // Note | The note to be associated with the library document.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateLibraryDocumentNoteForApiUser(authorization, libraryDocumentId, note, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#updateLibraryDocumentNoteForApiUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **note** | [**Note**](Note.md)| The note to be associated with the library document. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLibraryDocumentState"></a>
# **updateLibraryDocumentState**
> updateLibraryDocumentState(authorization, ifMatch, libraryDocumentId, libraryDocumentStateInfo, xApiUser, xOnBehalfOfUser)

Updates the library document&#39;s state.

Currently state can be changed from AUTHORING to ACTIVE.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
LibraryDocumentStateInfo libraryDocumentStateInfo = new LibraryDocumentStateInfo(); // LibraryDocumentStateInfo | Information about the state of library document to which you want to update
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateLibraryDocumentState(authorization, ifMatch, libraryDocumentId, libraryDocumentStateInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#updateLibraryDocumentState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **libraryDocumentStateInfo** | [**LibraryDocumentStateInfo**](LibraryDocumentStateInfo.md)| Information about the state of library document to which you want to update |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

<a name="updateLibraryDocumentVisibility"></a>
# **updateLibraryDocumentVisibility**
> updateLibraryDocumentVisibility(authorization, libraryDocumentId, visibilityInfo, xApiUser, xOnBehalfOfUser)

Updates the visibility of library document.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.LibraryDocumentsApi;


LibraryDocumentsApi apiInstance = new LibraryDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String libraryDocumentId = "libraryDocumentId_example"; // String | The document identifier, as retrieved from the API to fetch library documents.
VisibilityInfo visibilityInfo = new VisibilityInfo(); // VisibilityInfo | Information to update visibility of agreement
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateLibraryDocumentVisibility(authorization, libraryDocumentId, visibilityInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryDocumentsApi#updateLibraryDocumentVisibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **libraryDocumentId** | **String**| The document identifier, as retrieved from the API to fetch library documents. |
 **visibilityInfo** | [**VisibilityInfo**](VisibilityInfo.md)| Information to update visibility of agreement |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

