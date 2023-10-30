# MessageTemplatesApi

All URIs are relative to *https://secure.au1.echosign.com/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessageTemplates**](MessageTemplatesApi.md#getMessageTemplates) | **GET** /messageTemplates | Retrieves a list of message templates applicable to the current user.


<a name="getMessageTemplates"></a>
# **getMessageTemplates**
> MessageTemplates getMessageTemplates(authorization, locale, xApiUser, xOnBehalfOfUser, groupId, cursor, pageSize)

Retrieves a list of message templates applicable to the current user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.MessageTemplatesApi;


MessageTemplatesApi apiInstance = new MessageTemplatesApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String locale = "locale_example"; // String | Message template locale
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String groupId = "groupId_example"; // String | The group identifier, as returned by the group creation API or retrieved from the API to fetch groups.
String cursor = "cursor_example"; // String | Used to navigate through the pages. If not provided, returns the first page.
Integer pageSize = 56; // Integer | Number of intended items in the response page. If not provided, it is decided by the application settings.
try {
    MessageTemplates result = apiInstance.getMessageTemplates(authorization, locale, xApiUser, xOnBehalfOfUser, groupId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplatesApi#getMessageTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **locale** | **String**| Message template locale |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **groupId** | **String**| The group identifier, as returned by the group creation API or retrieved from the API to fetch groups. | [optional]
 **cursor** | **String**| Used to navigate through the pages. If not provided, returns the first page. | [optional]
 **pageSize** | **Integer**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional]

### Return type

[**MessageTemplates**](MessageTemplates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

