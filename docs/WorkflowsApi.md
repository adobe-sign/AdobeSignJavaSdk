# WorkflowsApi

All URIs are relative to *https://secure.au1.echosign.com/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkflowInfo**](WorkflowsApi.md#getWorkflowInfo) | **GET** /workflows/{workflowId} | Retrieves the details of a workflow.
[**getWorkflows**](WorkflowsApi.md#getWorkflows) | **GET** /workflows | Retrieves workflows for a user.


<a name="getWorkflowInfo"></a>
# **getWorkflowInfo**
> WorkflowDescription getWorkflowInfo(authorization, workflowId, xApiUser, xOnBehalfOfUser, groupId)

Retrieves the details of a workflow.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WorkflowsApi;


WorkflowsApi apiInstance = new WorkflowsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('workflow_read')\" oncontextmenu=\"this.href=oauthDoc('workflow_read')\" target=\"oauthDoc\">workflow_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String workflowId = "workflowId_example"; // String | The workflow identifier, as retrieved from the API to fetch workflows.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String groupId = "groupId_example"; // String | The group identifier, as returned by the group creation API or retrieved from the API to fetch groups.
try {
    WorkflowDescription result = apiInstance.getWorkflowInfo(authorization, workflowId, xApiUser, xOnBehalfOfUser, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowsApi#getWorkflowInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;workflow_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **workflowId** | **String**| The workflow identifier, as retrieved from the API to fetch workflows. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **groupId** | **String**| The group identifier, as returned by the group creation API or retrieved from the API to fetch groups. | [optional]

### Return type

[**WorkflowDescription**](WorkflowDescription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflows"></a>
# **getWorkflows**
> UserWorkflows getWorkflows(authorization, xApiUser, xOnBehalfOfUser, groupId, includeDraftWorkflows, includeInactiveWorkflows)

Retrieves workflows for a user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.WorkflowsApi;


WorkflowsApi apiInstance = new WorkflowsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('workflow_read')\" oncontextmenu=\"this.href=oauthDoc('workflow_read')\" target=\"oauthDoc\">workflow_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String groupId = "groupId_example"; // String | The group identifier for which the workflows will be fetched
Boolean includeDraftWorkflows = true; // Boolean | Include draft workflows
Boolean includeInactiveWorkflows = true; // Boolean | Include inactive workflows
try {
    UserWorkflows result = apiInstance.getWorkflows(authorization, xApiUser, xOnBehalfOfUser, groupId, includeDraftWorkflows, includeInactiveWorkflows);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowsApi#getWorkflows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;workflow_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **groupId** | **String**| The group identifier for which the workflows will be fetched | [optional]
 **includeDraftWorkflows** | **Boolean**| Include draft workflows | [optional]
 **includeInactiveWorkflows** | **Boolean**| Include inactive workflows | [optional]

### Return type

[**UserWorkflows**](UserWorkflows.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

