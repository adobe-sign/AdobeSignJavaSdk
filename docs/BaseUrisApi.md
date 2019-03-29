# BaseUrisApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBaseUris**](BaseUrisApi.md#getBaseUris) | **GET** /baseUris | Gets the base uri to access other APIs. In case other APIs are accessed from a different end point, it will be considered an invalid request.


<a name="getBaseUris"></a>
# **getBaseUris**
> BaseUriInfo getBaseUris(authorization)

Gets the base uri to access other APIs. In case other APIs are accessed from a different end point, it will be considered an invalid request.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.BaseUrisApi;


BaseUrisApi apiInstance = new BaseUrisApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with any of the valid scopes<ul></ul>in the format <b>'Bearer {accessToken}'.
try {
    BaseUriInfo result = apiInstance.getBaseUris(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaseUrisApi#getBaseUris");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with any of the valid scopes&lt;ul&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |

### Return type

[**BaseUriInfo**](BaseUriInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

