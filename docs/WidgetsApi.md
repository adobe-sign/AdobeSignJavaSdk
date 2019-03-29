# WidgetsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createShareOnWidget**](WidgetsApi.md#createShareOnWidget) | **POST** /widgets/{widgetId}/members/share | Share a widget with someone.
[**createWidget**](WidgetsApi.md#createWidget) | **POST** /widgets | Creates a widget and and returns the widgetId in the response to the client.
[**getAllWidgetMembers**](WidgetsApi.md#getAllWidgetMembers) | **GET** /widgets/{widgetId}/members | Retrieves detailed member info along with IDs for different types of participants.
[**getEvents**](WidgetsApi.md#getEvents) | **GET** /widgets/{widgetId}/events | Retrieves the events information for a widget.
[**getParticipantSet**](WidgetsApi.md#getParticipantSet) | **GET** /widgets/{widgetId}/members/participantSets/{participantSetId} | Retrieves the participant set of a widget identified by widgetId in the path.
[**getWidgetAgreements**](WidgetsApi.md#getWidgetAgreements) | **GET** /widgets/{widgetId}/agreements | Retrieves agreements for the widget.
[**getWidgetAllDocumentsImageUrls**](WidgetsApi.md#getWidgetAllDocumentsImageUrls) | **GET** /widgets/{widgetId}/documents/imageUrls | Retrieves image urls of all visible pages of a document associated with a widget.
[**getWidgetAuditTrail**](WidgetsApi.md#getWidgetAuditTrail) | **GET** /widgets/{widgetId}/auditTrail | Retrieves the audit trail of a widget identified by widgetId.
[**getWidgetCombinedDocument**](WidgetsApi.md#getWidgetCombinedDocument) | **GET** /widgets/{widgetId}/combinedDocument | Retrieves a single combined PDF document for the documents associated with a widget.
[**getWidgetDocumentInfo**](WidgetsApi.md#getWidgetDocumentInfo) | **GET** /widgets/{widgetId}/documents/{documentId} | Retrieves the file stream of a document of a widget.
[**getWidgetDocuments**](WidgetsApi.md#getWidgetDocuments) | **GET** /widgets/{widgetId}/documents | Retrieves the IDs of the documents associated with widget.
[**getWidgetFormData**](WidgetsApi.md#getWidgetFormData) | **GET** /widgets/{widgetId}/formData | Retrieves data entered by the user into interactive form fields at the time they signed the widget
[**getWidgetInfo**](WidgetsApi.md#getWidgetInfo) | **GET** /widgets/{widgetId} | Retrieves the details of a widget.
[**getWidgetNoteForApiUser**](WidgetsApi.md#getWidgetNoteForApiUser) | **GET** /widgets/{widgetId}/me/note | Retrieves the latest note of a widget for the API user.
[**getWidgetSecurityOptionsForParticipation**](WidgetsApi.md#getWidgetSecurityOptionsForParticipation) | **GET** /widgets/{widgetId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Retrieves the security options for a particular participant.
[**getWidgetView**](WidgetsApi.md#getWidgetView) | **POST** /widgets/{widgetId}/views | Retrieves the requested views for a widget.
[**getWidgets**](WidgetsApi.md#getWidgets) | **GET** /widgets | Retrieves widgets for a user.
[**updateWidget**](WidgetsApi.md#updateWidget) | **PUT** /widgets/{widgetId} | Updates a widget.
[**updateWidgetNoteForApiUser**](WidgetsApi.md#updateWidgetNoteForApiUser) | **PUT** /widgets/{widgetId}/me/note | Updates the latest note of a widget for the API user.
[**updateWidgetSecurityOptionsForParticipation**](WidgetsApi.md#updateWidgetSecurityOptionsForParticipation) | **PUT** /widgets/{widgetId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Updates the security options for a particular participant.
[**updateWidgetState**](WidgetsApi.md#updateWidgetState) | **PUT** /widgets/{widgetId}/state | Updates the state of a widget identified by widgetId in the path.
[**updateWidgetVisibility**](WidgetsApi.md#updateWidgetVisibility) | **PUT** /widgets/{widgetId}/me/visibility | Updates the visibility of widget.


<a name="createShareOnWidget"></a>
# **createShareOnWidget**
> ShareCreationResponseList createShareOnWidget(authorization, widgetId, shareCreationInfoList, xApiUser, xOnBehalfOfUser)

Share a widget with someone.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
ShareCreationInfoList shareCreationInfoList = new ShareCreationInfoList(); // ShareCreationInfoList | List of agreement share creation information objects.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    ShareCreationResponseList result = apiInstance.createShareOnWidget(authorization, widgetId, shareCreationInfoList, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#createShareOnWidget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **shareCreationInfoList** | [**ShareCreationInfoList**](ShareCreationInfoList.md)| List of agreement share creation information objects. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**ShareCreationResponseList**](ShareCreationResponseList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWidget"></a>
# **createWidget**
> WidgetCreationResponse createWidget(authorization, widgetInfo, xApiUser, xOnBehalfOfUser)

Creates a widget and and returns the widgetId in the response to the client.

This is a primary endpoint which is used to create a new widget. You can create a widget in one of the 3 mentioned states: a) &lt;b&gt;DRAFT&lt;/b&gt; - to incrementally build the widget, b) &lt;b&gt;AUTHORING&lt;/b&gt; - to add/edit form fields in the widget, c) &lt;b&gt;ACTIVE&lt;/b&gt; - to immediately host the widget. You can use the PUT /widgets/{widgetId}/state endpoint to transition a widget between the above mentioned states. An allowed transition would follow the any of the following sequences: DRAFT-&gt;AUTHORING-&gt;ACTIVE, ACTIVE&lt;-&gt;INACTIVE, DRAFT-&gt;CANCELLED.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
WidgetCreationInfoV6 widgetInfo = new WidgetCreationInfoV6(); // WidgetCreationInfoV6 | Information about the widget that you want to create.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    WidgetCreationResponse result = apiInstance.createWidget(authorization, widgetInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#createWidget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetInfo** | [**WidgetCreationInfoV6**](WidgetCreationInfoV6.md)| Information about the widget that you want to create. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**WidgetCreationResponse**](WidgetCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllWidgetMembers"></a>
# **getAllWidgetMembers**
> WidgetMembersInfo getAllWidgetMembers(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves detailed member info along with IDs for different types of participants.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    WidgetMembersInfo result = apiInstance.getAllWidgetMembers(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getAllWidgetMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**WidgetMembersInfo**](WidgetMembersInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> WidgetEventList getEvents(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the events information for a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    WidgetEventList result = apiInstance.getEvents(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**WidgetEventList**](WidgetEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParticipantSet"></a>
# **getParticipantSet**
> DetailedWidgetParticipantSetInfo getParticipantSet(authorization, widgetId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the participant set of a widget identified by widgetId in the path.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    DetailedWidgetParticipantSetInfo result = apiInstance.getParticipantSet(authorization, widgetId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getParticipantSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **participantSetId** | **String**| The participant set identifier |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**DetailedWidgetParticipantSetInfo**](DetailedWidgetParticipantSetInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetAgreements"></a>
# **getWidgetAgreements**
> WidgetAgreements getWidgetAgreements(authorization, widgetId, xApiUser, xOnBehalfOfUser, showHiddenAgreements, cursor, pageSize)

Retrieves agreements for the widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
Boolean showHiddenAgreements = true; // Boolean | A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false.
String cursor = "cursor_example"; // String | Used to navigate through the pages. If not provided, returns the first page.
Integer pageSize = 56; // Integer | Number of intended items in the response page. If not provided, it is decided by the application settings.
try {
    WidgetAgreements result = apiInstance.getWidgetAgreements(authorization, widgetId, xApiUser, xOnBehalfOfUser, showHiddenAgreements, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetAgreements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **showHiddenAgreements** | **Boolean**| A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false. | [optional]
 **cursor** | **String**| Used to navigate through the pages. If not provided, returns the first page. | [optional]
 **pageSize** | **Integer**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional]

### Return type

[**WidgetAgreements**](WidgetAgreements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetAllDocumentsImageUrls"></a>
# **getWidgetAllDocumentsImageUrls**
> WidgetDocumentsImageUrlsInfo getWidgetAllDocumentsImageUrls(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, imageSizes, showImageAvailabilityOnly)

Retrieves image urls of all visible pages of a document associated with a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String imageSizes = "imageSizes_example"; // String | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}. 
Boolean showImageAvailabilityOnly = true; // Boolean | When set to true, returns only image availability. Else, returns both image urls and its availability.
try {
    WidgetDocumentsImageUrlsInfo result = apiInstance.getWidgetAllDocumentsImageUrls(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, imageSizes, showImageAvailabilityOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetAllDocumentsImageUrls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **imageSizes** | **String**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional]
 **showImageAvailabilityOnly** | **Boolean**| When set to true, returns only image availability. Else, returns both image urls and its availability. | [optional]

### Return type

[**WidgetDocumentsImageUrlsInfo**](WidgetDocumentsImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetAuditTrail"></a>
# **getWidgetAuditTrail**
> byte[] getWidgetAuditTrail(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the audit trail of a widget identified by widgetId.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getWidgetAuditTrail(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetAuditTrail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
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

<a name="getWidgetCombinedDocument"></a>
# **getWidgetCombinedDocument**
> byte[] getWidgetCombinedDocument(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachAuditReport)

Retrieves a single combined PDF document for the documents associated with a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String versionId = "versionId_example"; // String | The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used.
String participantId = "participantId_example"; // String | The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used.
Boolean attachAuditReport = true; // Boolean | When set to YES, attach an audit report to the signed Widget PDF. Default value is false
try {
    byte[] result = apiInstance.getWidgetCombinedDocument(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachAuditReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetCombinedDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **versionId** | **String**| The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used. | [optional]
 **participantId** | **String**| The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional]
 **attachAuditReport** | **Boolean**| When set to YES, attach an audit report to the signed Widget PDF. Default value is false | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

<a name="getWidgetDocumentInfo"></a>
# **getWidgetDocumentInfo**
> byte[] getWidgetDocumentInfo(authorization, widgetId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the file stream of a document of a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String documentId = "documentId_example"; // String | The document identifier, as retrieved from the API which fetches the documents of a specified widget
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getWidgetDocumentInfo(authorization, widgetId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetDocumentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **documentId** | **String**| The document identifier, as retrieved from the API which fetches the documents of a specified widget |
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

<a name="getWidgetDocuments"></a>
# **getWidgetDocuments**
> WidgetDocuments getWidgetDocuments(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId)

Retrieves the IDs of the documents associated with widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String versionId = "versionId_example"; // String | The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used.
String participantId = "participantId_example"; // String | The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used.
try {
    WidgetDocuments result = apiInstance.getWidgetDocuments(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **versionId** | **String**| The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used. | [optional]
 **participantId** | **String**| The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional]

### Return type

[**WidgetDocuments**](WidgetDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetFormData"></a>
# **getWidgetFormData**
> byte[] getWidgetFormData(authorization, widgetId, xApiUser, xOnBehalfOfUser)

Retrieves data entered by the user into interactive form fields at the time they signed the widget

CSV file stream containing form data information

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    byte[] result = apiInstance.getWidgetFormData(authorization, widgetId, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetFormData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="getWidgetInfo"></a>
# **getWidgetInfo**
> WidgetCreationInfoV6 getWidgetInfo(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the details of a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    WidgetCreationInfoV6 result = apiInstance.getWidgetInfo(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**WidgetCreationInfoV6**](WidgetCreationInfoV6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetNoteForApiUser"></a>
# **getWidgetNoteForApiUser**
> Note getWidgetNoteForApiUser(authorization, widgetId, xApiUser, xOnBehalfOfUser)

Retrieves the latest note of a widget for the API user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    Note result = apiInstance.getWidgetNoteForApiUser(authorization, widgetId, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetNoteForApiUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**Note**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetSecurityOptionsForParticipation"></a>
# **getWidgetSecurityOptionsForParticipation**
> ParticipantSecurityOption getWidgetSecurityOptionsForParticipation(authorization, widgetId, participantSetId, participantId, ifNoneMatch, xApiUser)

Retrieves the security options for a particular participant.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String participantId = "participantId_example"; // String | The participant identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
try {
    ParticipantSecurityOption result = apiInstance.getWidgetSecurityOptionsForParticipation(authorization, widgetId, participantSetId, participantId, ifNoneMatch, xApiUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetSecurityOptionsForParticipation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **participantSetId** | **String**| The participant set identifier |
 **participantId** | **String**| The participant identifier |
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]

### Return type

[**ParticipantSecurityOption**](ParticipantSecurityOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetView"></a>
# **getWidgetView**
> WidgetViews getWidgetView(authorization, widgetId, widgetViewInfo, xApiUser, xOnBehalfOfUser)

Retrieves the requested views for a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a> - widget read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
WidgetViewInfo widgetViewInfo = new WidgetViewInfo(); // WidgetViewInfo | Name of the required view and its desired configuration.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    WidgetViews result = apiInstance.getWidgetView(authorization, widgetId, widgetViewInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt; - widget read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **widgetViewInfo** | [**WidgetViewInfo**](WidgetViewInfo.md)| Name of the required view and its desired configuration. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**WidgetViews**](WidgetViews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgets"></a>
# **getWidgets**
> UserWidgets getWidgets(authorization, xApiUser, xOnBehalfOfUser, showHiddenWidgets, cursor, pageSize)

Retrieves widgets for a user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
Boolean showHiddenWidgets = true; // Boolean | A query parameter to fetch all the hidden widgets along with the visible widgets. Default value is false.
String cursor = "cursor_example"; // String | Used to navigate through the pages. If not provided, returns the first page.
Integer pageSize = 56; // Integer | Number of intended items in the response page. If not provided, it is decided by the application settings.
try {
    UserWidgets result = apiInstance.getWidgets(authorization, xApiUser, xOnBehalfOfUser, showHiddenWidgets, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **showHiddenWidgets** | **Boolean**| A query parameter to fetch all the hidden widgets along with the visible widgets. Default value is false. | [optional]
 **cursor** | **String**| Used to navigate through the pages. If not provided, returns the first page. | [optional]
 **pageSize** | **Integer**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional]

### Return type

[**UserWidgets**](UserWidgets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWidget"></a>
# **updateWidget**
> updateWidget(authorization, ifMatch, widgetId, widgetInfo, xApiUser, xOnBehalfOfUser)

Updates a widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
WidgetInfo widgetInfo = new WidgetInfo(); // WidgetInfo | Widget update information object.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateWidget(authorization, ifMatch, widgetId, widgetInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#updateWidget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **widgetInfo** | [**WidgetInfo**](WidgetInfo.md)| Widget update information object. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWidgetNoteForApiUser"></a>
# **updateWidgetNoteForApiUser**
> updateWidgetNoteForApiUser(authorization, widgetId, note, xApiUser, xOnBehalfOfUser)

Updates the latest note of a widget for the API user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
Note note = new Note(); // Note | The note to be associated with the widget.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateWidgetNoteForApiUser(authorization, widgetId, note, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#updateWidgetNoteForApiUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **note** | [**Note**](Note.md)| The note to be associated with the widget. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWidgetSecurityOptionsForParticipation"></a>
# **updateWidgetSecurityOptionsForParticipation**
> updateWidgetSecurityOptionsForParticipation(authorization, ifMatch, widgetId, participantSetId, participantId, participantSecurityOption, xApiUser)

Updates the security options for a particular participant.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String participantId = "participantId_example"; // String | The participant identifier
ParticipantSecurityOption participantSecurityOption = new ParticipantSecurityOption(); // ParticipantSecurityOption | Security options that apply to the participant
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
try {
    apiInstance.updateWidgetSecurityOptionsForParticipation(authorization, ifMatch, widgetId, participantSetId, participantId, participantSecurityOption, xApiUser);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#updateWidgetSecurityOptionsForParticipation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **participantSetId** | **String**| The participant set identifier |
 **participantId** | **String**| The participant identifier |
 **participantSecurityOption** | [**ParticipantSecurityOption**](ParticipantSecurityOption.md)| Security options that apply to the participant |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWidgetState"></a>
# **updateWidgetState**
> updateWidgetState(authorization, ifMatch, widgetId, widgetStateInfo, xApiUser, xOnBehalfOfUser)

Updates the state of a widget identified by widgetId in the path.

This endpoint can be used by creator of the widget to transition between the states of widget. An allowed transition would follow any of the following sequence :  DRAFT-&gt;AUTHORING-&gt;ACTIVE, ACTIVE&lt;-&gt;INACTIVE, DRAFT-&gt;CANCELLED.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
WidgetStateInfo widgetStateInfo = new WidgetStateInfo(); // WidgetStateInfo | 
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateWidgetState(authorization, ifMatch, widgetId, widgetStateInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#updateWidgetState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **widgetStateInfo** | [**WidgetStateInfo**](WidgetStateInfo.md)|  |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

<a name="updateWidgetVisibility"></a>
# **updateWidgetVisibility**
> updateWidgetVisibility(authorization, widgetId, visibilityInfo, xApiUser, xOnBehalfOfUser)

Updates the visibility of widget.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WidgetsApi;


WidgetsApi apiInstance = new WidgetsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String widgetId = "widgetId_example"; // String | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
VisibilityInfo visibilityInfo = new VisibilityInfo(); // VisibilityInfo | Information to update visibility of widget
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateWidgetVisibility(authorization, widgetId, visibilityInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#updateWidgetVisibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **widgetId** | **String**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. |
 **visibilityInfo** | [**VisibilityInfo**](VisibilityInfo.md)| Information to update visibility of widget |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

