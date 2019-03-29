# TransientDocumentsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransientDocument**](TransientDocumentsApi.md#createTransientDocument) | **POST** /transientDocuments | Uploads a document and obtains the document&#39;s ID.


<a name="createTransientDocument"></a>
# **createTransientDocument**
> TransientDocumentResponse createTransientDocument(authorization, file, xApiUser, xOnBehalfOfUser, fileName, mimeType)

Uploads a document and obtains the document&#39;s ID.

The document uploaded through this call is referred to as transient since it is available only for 7 days after the upload. The returned transient document ID can be used in the API calls where the uploaded file needs to be referred. The transient document request is a multipart request consisting of three parts - filename, mime type and the file stream. You can only upload one file at a time in this request.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.TransientDocumentsApi;


TransientDocumentsApi apiInstance = new TransientDocumentsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with any of the following scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_sign')\" oncontextmenu=\"this.href=oauthDoc('agreement_sign')\" target=\"oauthDoc\">agreement_sign</a></li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
File file = new File("/path/to/file.txt"); // File | The file part of the multipart request for document upload. You can upload only one file at a time.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String fileName = "fileName_example"; // String | A name for the document being uploaded. Maximum number of characters in the name is restricted to 255.
String mimeType = "mimeType_example"; // String | The mime type of the document being uploaded. If not specified here then mime type is picked up from the file object. If mime type is not present there either then mime type is inferred from file name extension.
try {
    TransientDocumentResponse result = apiInstance.createTransientDocument(authorization, file, xApiUser, xOnBehalfOfUser, fileName, mimeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransientDocumentsApi#createTransientDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with any of the following scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_sign&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_sign&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_sign&lt;/a&gt;&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **file** | **File**| The file part of the multipart request for document upload. You can upload only one file at a time. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **fileName** | **String**| A name for the document being uploaded. Maximum number of characters in the name is restricted to 255. | [optional]
 **mimeType** | **String**| The mime type of the document being uploaded. If not specified here then mime type is picked up from the file object. If mime type is not present there either then mime type is inferred from file name extension. | [optional]

### Return type

[**TransientDocumentResponse**](TransientDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

