# WebhooksApi

All URIs are relative to *https://secure.au1.echosign.com/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /webhooks | Creates a webhook.
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Deletes a webhook.
[**getWebhookInfo**](WebhooksApi.md#getWebhookInfo) | **GET** /webhooks/{webhookId} | Retrieves the details of a webhook.
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Retrieves webhooks for a user.
[**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhookId} | Updates a webhook.
[**updateWebhookState**](WebhooksApi.md#updateWebhookState) | **PUT** /webhooks/{webhookId}/state | Updates the state of a webhook identified by webhookId in the path.


<a name="createWebhook"></a>
# **createWebhook**
> WebhookCreationResponse createWebhook(authorization, webhookInfo, xApiUser, xOnBehalfOfUser)

Creates a webhook.

This is a primary endpoint which is used to create a new webhook. A webhook can only be created in ACTIVE state. Currently, webhooks are supported at four scopes - Account, Group, User and Resource. &lt;br/&gt; &lt;br/&gt; Before creating a webhook successfully at any of these scopes, Adobe Sign &lt;a href&#x3D;&#39;https://www.adobe.io/apis/documentcloud/sign/docs.html#!adobedocs/adobe-sign/master/webhooks.md#verificationofintentofthewebhookurl&#39;&gt;verifies&lt;/a&gt; that the webhook URL that is provided in the registration request really intends to receive notifications and is a valid URL. &lt;br/&gt;There is a defined mechanism for this validation where Adobe Sign makes an HTTPS GET request to the webhook URL. This request has a custom HTTP header X-AdobeSign-ClientId. The value of this header is the client ID of the application that is requesting to create the webhook. To register a webhook successfully, the webhook URL must respond to this verification request with an HTTPS 2XX response code, and also it must send back the same client ID value in one of the following two ways:&lt;ol&gt;&lt;li&gt;In a custom response header, X-AdobeSign-ClientId. This is the same header which was passed in the request, and can be echoed back in the response.&lt;/li&gt;&lt;li&gt; In the JSON response body of the response with the key of xAdobeSignClientId and its value being the same client ID that was sent in the request. &lt;/li&gt;&lt;/ol&gt;&lt;p&gt;On successful registration,  Adobe Sign sends a success response (any HTTPS 2XX code) to your client app with the unique webhook identifier and a Location header, which contains the URL of the webhook resource created in Adobe Sign.&lt;br/&gt; To learn more, please refer &lt;a href&#x3D;&#39;https://www.adobe.io/apis/documentcloud/sign/docs.html#!adobedocs/adobe-sign/master/webhooks.md&#39;&gt;Webhooks in Adobe Sign Guide&lt;/a&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_write')\" oncontextmenu=\"this.href=oauthDoc('webhook_write')\" target=\"oauthDoc\">webhook_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
WebhookInfo webhookInfo = new WebhookInfo(); // WebhookInfo | Information about the webhook that you want to create
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    WebhookCreationResponse result = apiInstance.createWebhook(authorization, webhookInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **webhookInfo** | [**WebhookInfo**](WebhookInfo.md)| Information about the webhook that you want to create |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**WebhookCreationResponse**](WebhookCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(authorization, webhookId, xApiUser, xOnBehalfOfUser, ifMatch)

Deletes a webhook.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_retention')\" oncontextmenu=\"this.href=oauthDoc('webhook_retention')\" target=\"oauthDoc\">webhook_retention</a></li></ul>in the format <b>'Bearer {accessToken}'.
String webhookId = "webhookId_example"; // String | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
try {
    apiInstance.deleteWebhook(authorization, webhookId, xApiUser, xOnBehalfOfUser, ifMatch);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_retention&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_retention&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_retention&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **webhookId** | **String**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookInfo"></a>
# **getWebhookInfo**
> WebhookInfo getWebhookInfo(authorization, webhookId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the details of a webhook.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_read')\" oncontextmenu=\"this.href=oauthDoc('webhook_read')\" target=\"oauthDoc\">webhook_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String webhookId = "webhookId_example"; // String | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    WebhookInfo result = apiInstance.getWebhookInfo(authorization, webhookId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **webhookId** | **String**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**WebhookInfo**](WebhookInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> UserWebhooks getWebhooks(authorization, xApiUser, xOnBehalfOfUser, showInActiveWebhooks, scope, resourceType, cursor, pageSize)

Retrieves webhooks for a user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_read')\" oncontextmenu=\"this.href=oauthDoc('webhook_read')\" target=\"oauthDoc\">webhook_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
Boolean showInActiveWebhooks = true; // Boolean | A query parameter to fetch all the inactive webhooks along with the active webhooks.
String scope = "scope_example"; // String | Scope of webhook. The possible values are ACCOUNT, GROUP, USER or RESOURCE
String resourceType = "resourceType_example"; // String | The type of resource on which webhook was created. The possible values are AGREEMENT, WIDGET, MEGASIGN and LIBRARY_DOCUMENT.
String cursor = "cursor_example"; // String | Used to navigate through the pages. If not provided, returns the first page.
Integer pageSize = 56; // Integer | Number of intended items in the response page. If not provided, it is decided by the application settings.
try {
    UserWebhooks result = apiInstance.getWebhooks(authorization, xApiUser, xOnBehalfOfUser, showInActiveWebhooks, scope, resourceType, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **showInActiveWebhooks** | **Boolean**| A query parameter to fetch all the inactive webhooks along with the active webhooks. | [optional]
 **scope** | **String**| Scope of webhook. The possible values are ACCOUNT, GROUP, USER or RESOURCE | [optional] [enum: ACCOUNT, GROUP, USER, RESOURCE]
 **resourceType** | **String**| The type of resource on which webhook was created. The possible values are AGREEMENT, WIDGET, MEGASIGN and LIBRARY_DOCUMENT. | [optional] [enum: AGREEMENT, WIDGET, MEGASIGN, LIBRARY_DOCUMENT]
 **cursor** | **String**| Used to navigate through the pages. If not provided, returns the first page. | [optional]
 **pageSize** | **Integer**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional]

### Return type

[**UserWebhooks**](UserWebhooks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> updateWebhook(authorization, webhookId, webhookInfo, xApiUser, xOnBehalfOfUser, ifMatch)

Updates a webhook.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_write')\" oncontextmenu=\"this.href=oauthDoc('webhook_write')\" target=\"oauthDoc\">webhook_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String webhookId = "webhookId_example"; // String | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
WebhookInfo webhookInfo = new WebhookInfo(); // WebhookInfo | Information necessary to update a webhook
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
try {
    apiInstance.updateWebhook(authorization, webhookId, webhookInfo, xApiUser, xOnBehalfOfUser, ifMatch);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **webhookId** | **String**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. |
 **webhookInfo** | [**WebhookInfo**](WebhookInfo.md)| Information necessary to update a webhook |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWebhookState"></a>
# **updateWebhookState**
> updateWebhookState(authorization, webhookId, webhookStateInfo, xApiUser, xOnBehalfOfUser, ifMatch)

Updates the state of a webhook identified by webhookId in the path.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_write')\" oncontextmenu=\"this.href=oauthDoc('webhook_write')\" target=\"oauthDoc\">webhook_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String webhookId = "webhookId_example"; // String | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
WebhookStateInfo webhookStateInfo = new WebhookStateInfo(); // WebhookStateInfo | 
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
try {
    apiInstance.updateWebhookState(authorization, webhookId, webhookStateInfo, xApiUser, xOnBehalfOfUser, ifMatch);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhookState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **webhookId** | **String**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. |
 **webhookStateInfo** | [**WebhookStateInfo**](WebhookStateInfo.md)|  |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

