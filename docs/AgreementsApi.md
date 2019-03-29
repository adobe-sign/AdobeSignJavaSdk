# AgreementsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTemplateFieldsToAgreement**](AgreementsApi.md#addTemplateFieldsToAgreement) | **POST** /agreements/{agreementId}/formFields | Adds template fields to an agreement
[**createAgreement**](AgreementsApi.md#createAgreement) | **POST** /agreements | Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
[**createAgreementView**](AgreementsApi.md#createAgreementView) | **POST** /agreements/{agreementId}/views | Retrieves the latest state view url of agreement.
[**createDelegatedParticipantSets**](AgreementsApi.md#createDelegatedParticipantSets) | **POST** /agreements/{agreementId}/members/participantSets/{participantSetId}/delegatedParticipantSets | Creates a participantSet to which the agreement is forwarded for taking appropriate action.
[**createReminderOnParticipant**](AgreementsApi.md#createReminderOnParticipant) | **POST** /agreements/{agreementId}/reminders | Creates a reminder on the specified participants of an agreement identified by agreementId in the path.
[**createShareOnAgreement**](AgreementsApi.md#createShareOnAgreement) | **POST** /agreements/{agreementId}/members/share | Share an agreement with someone.
[**deleteDocuments**](AgreementsApi.md#deleteDocuments) | **DELETE** /agreements/{agreementId}/documents | Deletes all the documents of an agreement.
[**getAgreementInfo**](AgreementsApi.md#getAgreementInfo) | **GET** /agreements/{agreementId} | Retrieves the current status of an agreement.
[**getAgreementNoteForApiUser**](AgreementsApi.md#getAgreementNoteForApiUser) | **GET** /agreements/{agreementId}/me/note | Retrieves the latest note associated with an agreement.
[**getAgreementReminder**](AgreementsApi.md#getAgreementReminder) | **GET** /agreements/{agreementId}/reminders/{reminderId} | Retrieves a specific reminder associated with an agreement
[**getAgreementReminders**](AgreementsApi.md#getAgreementReminders) | **GET** /agreements/{agreementId}/reminders | Retrieves the reminders of an agreement, identified by agreementId in the path.
[**getAgreementSecurityOptionsForParticipation**](AgreementsApi.md#getAgreementSecurityOptionsForParticipation) | **GET** /agreements/{agreementId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Retrieves the security options for a particular participant.
[**getAgreements**](AgreementsApi.md#getAgreements) | **GET** /agreements | Retrieves agreements for the user.
[**getAllDocuments**](AgreementsApi.md#getAllDocuments) | **GET** /agreements/{agreementId}/documents | Retrieves the IDs of the documents of an agreement identified by agreementId.
[**getAllDocumentsImageUrls**](AgreementsApi.md#getAllDocumentsImageUrls) | **GET** /agreements/{agreementId}/documents/imageUrls | Retrieves image urls of all visible pages of all the documents associated with an agreement.
[**getAllMembers**](AgreementsApi.md#getAllMembers) | **GET** /agreements/{agreementId}/members | Retrieves information of members of the agreement.
[**getAuditTrail**](AgreementsApi.md#getAuditTrail) | **GET** /agreements/{agreementId}/auditTrail | Retrieves the audit trail of an agreement identified by agreementId.
[**getCombinedDocument**](AgreementsApi.md#getCombinedDocument) | **GET** /agreements/{agreementId}/combinedDocument | Retrieves a single combined PDF document for the documents associated with an agreement.
[**getCombinedDocumentPagesInfo**](AgreementsApi.md#getCombinedDocumentPagesInfo) | **GET** /agreements/{agreementId}/combinedDocument/pagesInfo | Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
[**getCombinedDocumentUrl**](AgreementsApi.md#getCombinedDocumentUrl) | **GET** /agreements/{agreementId}/combinedDocument/url | Retrieves url of all visible pages of all the documents associated with an agreement.
[**getDocument**](AgreementsApi.md#getDocument) | **GET** /agreements/{agreementId}/documents/{documentId} | Retrieves the file stream of a document of an agreement.
[**getDocumentImageUrls**](AgreementsApi.md#getDocumentImageUrls) | **GET** /agreements/{agreementId}/documents/{documentId}/imageUrls | Retrieves image urls of all visible pages of a document associated with an agreement.
[**getEvents**](AgreementsApi.md#getEvents) | **GET** /agreements/{agreementId}/events | Retrieves the events information for an agreement.
[**getFormData**](AgreementsApi.md#getFormData) | **GET** /agreements/{agreementId}/formData | Retrieves data entered into the interactive form fields of the agreement.
[**getFormFields**](AgreementsApi.md#getFormFields) | **GET** /agreements/{agreementId}/formFields | Retrieves details of form fields of an agreement.
[**getMergeInfo**](AgreementsApi.md#getMergeInfo) | **GET** /agreements/{agreementId}/formFields/mergeInfo | Retrieves the merge info stored with an agreement.
[**getParticipantSet**](AgreementsApi.md#getParticipantSet) | **GET** /agreements/{agreementId}/members/participantSets/{participantSetId} | Retrieves the participant set of an agreement identified by agreementId in the path.
[**getSigningUrl**](AgreementsApi.md#getSigningUrl) | **GET** /agreements/{agreementId}/signingUrls | Retrieves the URL for the e-sign page for the current signer(s) of an agreement.
[**rejectAgreementForParticipation**](AgreementsApi.md#rejectAgreementForParticipation) | **PUT** /agreements/{agreementId}/members/participantSets/{participantSetId}/participants/{participantId}/reject | Rejects the agreement for a participant.
[**updateAgreement**](AgreementsApi.md#updateAgreement) | **PUT** /agreements/{agreementId} | Updates the agreement in draft state, or update the expirationTime on an existing agreement that is already out for signature.
[**updateAgreementMergeInfo**](AgreementsApi.md#updateAgreementMergeInfo) | **PUT** /agreements/{agreementId}/formFields/mergeInfo | Set the merge info for an agreement.
[**updateAgreementNoteForApiUser**](AgreementsApi.md#updateAgreementNoteForApiUser) | **PUT** /agreements/{agreementId}/me/note | Updates the latest note associated with an agreement.
[**updateAgreementReminder**](AgreementsApi.md#updateAgreementReminder) | **PUT** /agreements/{agreementId}/reminders/{reminderId} | Updates an existing reminder for an agreement
[**updateAgreementSecurityOptionsForParticipation**](AgreementsApi.md#updateAgreementSecurityOptionsForParticipation) | **PUT** /agreements/{agreementId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Updates the security options for a particular participant.
[**updateAgreementState**](AgreementsApi.md#updateAgreementState) | **PUT** /agreements/{agreementId}/state | Updates the state of an agreement identified by agreementId in the path.
[**updateAgreementVisibility**](AgreementsApi.md#updateAgreementVisibility) | **PUT** /agreements/{agreementId}/me/visibility | Updates the visibility of an agreement.
[**updateFormFields**](AgreementsApi.md#updateFormFields) | **PUT** /agreements/{agreementId}/formFields | Updates form fields of an agreement.  This will replace all fields in AUTHORING mode agreements, and will replace all fields except for text tag generated fields in DRAFT mode agreements.
[**updateParticipantSet**](AgreementsApi.md#updateParticipantSet) | **PUT** /agreements/{agreementId}/members/participantSets/{participantSetId} | Updates the participant set of an agreement identified by agreementId in the path.


<a name="addTemplateFieldsToAgreement"></a>
# **addTemplateFieldsToAgreement**
> AgreementFormFields addTemplateFieldsToAgreement(authorization, ifMatch, agreementId, formFieldPostInfo, xApiUser, xOnBehalfOfUser)

Adds template fields to an agreement

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
FormFieldPostInfo formFieldPostInfo = new FormFieldPostInfo(); // FormFieldPostInfo | List of form fields to add or replace
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    AgreementFormFields result = apiInstance.addTemplateFieldsToAgreement(authorization, ifMatch, agreementId, formFieldPostInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#addTemplateFieldsToAgreement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **formFieldPostInfo** | [**FormFieldPostInfo**](FormFieldPostInfo.md)| List of form fields to add or replace |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**AgreementFormFields**](AgreementFormFields.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAgreement"></a>
# **createAgreement**
> AgreementCreationResponse createAgreement(authorization, agreementInfo, xApiUser, xOnBehalfOfUser)

Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.

This is a primary endpoint which is used to create a new agreement. An agreement can be created using transientDocument, libraryDocument or a URL. You can create an agreement in one of the 3 mentioned states: a) &lt;b&gt;DRAFT&lt;/b&gt; - to incrementally build the agreement before sending out, b) &lt;b&gt;AUTHORING&lt;/b&gt; - to add/edit form fields in the agreement, c) &lt;b&gt;IN_PROCESS&lt;/b&gt; - to immediately send the agreement. You can use the PUT /agreements/{agreementId}/state endpoint to transition an agreement between the above mentioned states. An allowed transition would follow the following sequence: DRAFT -&gt; AUTHORING -&gt; IN_PROCESS -&gt; CANCELLED.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
AgreementCreationInfo agreementInfo = new AgreementCreationInfo(); // AgreementCreationInfo | Information about the agreement that you want to create.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    AgreementCreationResponse result = apiInstance.createAgreement(authorization, agreementInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#createAgreement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementInfo** | [**AgreementCreationInfo**](AgreementCreationInfo.md)| Information about the agreement that you want to create. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**AgreementCreationResponse**](AgreementCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAgreementView"></a>
# **createAgreementView**
> AgreementViews createAgreementView(authorization, agreementId, agreementViewInfo, xApiUser, xOnBehalfOfUser)

Retrieves the latest state view url of agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a> - agreement read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
AgreementViewInfo agreementViewInfo = new AgreementViewInfo(); // AgreementViewInfo | Name of the required view and its desired configuration.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    AgreementViews result = apiInstance.createAgreementView(authorization, agreementId, agreementViewInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#createAgreementView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt; - agreement read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **agreementViewInfo** | [**AgreementViewInfo**](AgreementViewInfo.md)| Name of the required view and its desired configuration. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**AgreementViews**](AgreementViews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDelegatedParticipantSets"></a>
# **createDelegatedParticipantSets**
> DelegationResponse createDelegatedParticipantSets(authorization, agreementId, participantSetId, delegatedParticipantSetInfo, xApiUser)

Creates a participantSet to which the agreement is forwarded for taking appropriate action.

Participants marked as delegator can call this API endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
DelegatedParticipantSetInfo delegatedParticipantSetInfo = new DelegatedParticipantSetInfo(); // DelegatedParticipantSetInfo | Information about the delegate participant Set
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
try {
    DelegationResponse result = apiInstance.createDelegatedParticipantSets(authorization, agreementId, participantSetId, delegatedParticipantSetInfo, xApiUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#createDelegatedParticipantSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **participantSetId** | **String**| The participant set identifier |
 **delegatedParticipantSetInfo** | [**DelegatedParticipantSetInfo**](DelegatedParticipantSetInfo.md)| Information about the delegate participant Set |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]

### Return type

[**DelegationResponse**](DelegationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createReminderOnParticipant"></a>
# **createReminderOnParticipant**
> ReminderCreationResult createReminderOnParticipant(authorization, agreementId, reminderInfo, xApiUser, xOnBehalfOfUser)

Creates a reminder on the specified participants of an agreement identified by agreementId in the path.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
ReminderInfo reminderInfo = new ReminderInfo(); // ReminderInfo | The information about a reminder associated with a recipient of an agreement.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    ReminderCreationResult result = apiInstance.createReminderOnParticipant(authorization, agreementId, reminderInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#createReminderOnParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **reminderInfo** | [**ReminderInfo**](ReminderInfo.md)| The information about a reminder associated with a recipient of an agreement. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**ReminderCreationResult**](ReminderCreationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createShareOnAgreement"></a>
# **createShareOnAgreement**
> ShareCreationResponseList createShareOnAgreement(authorization, agreementId, shareCreationInfoList, xApiUser, xOnBehalfOfUser)

Share an agreement with someone.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
ShareCreationInfoList shareCreationInfoList = new ShareCreationInfoList(); // ShareCreationInfoList | List of agreement share creation information objects.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    ShareCreationResponseList result = apiInstance.createShareOnAgreement(authorization, agreementId, shareCreationInfoList, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#createShareOnAgreement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
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

<a name="deleteDocuments"></a>
# **deleteDocuments**
> deleteDocuments(authorization, ifMatch, agreementId, xApiUser, xOnBehalfOfUser)

Deletes all the documents of an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_retention')\" oncontextmenu=\"this.href=oauthDoc('agreement_retention')\" target=\"oauthDoc\">agreement_retention</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.deleteDocuments(authorization, ifMatch, agreementId, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#deleteDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_retention&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_retention&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_retention&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAgreementInfo"></a>
# **getAgreementInfo**
> AgreementInfo getAgreementInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the current status of an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    AgreementInfo result = apiInstance.getAgreementInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAgreementInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**AgreementInfo**](AgreementInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAgreementNoteForApiUser"></a>
# **getAgreementNoteForApiUser**
> Note getAgreementNoteForApiUser(authorization, agreementId, xApiUser, xOnBehalfOfUser)

Retrieves the latest note associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    Note result = apiInstance.getAgreementNoteForApiUser(authorization, agreementId, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAgreementNoteForApiUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**Note**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAgreementReminder"></a>
# **getAgreementReminder**
> ReminderInfo getAgreementReminder(authorization, agreementId, reminderId, xApiUser, xOnBehalfOfUser)

Retrieves a specific reminder associated with an agreement

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String reminderId = "reminderId_example"; // String | The reminder identifier
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    ReminderInfo result = apiInstance.getAgreementReminder(authorization, agreementId, reminderId, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAgreementReminder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **reminderId** | **String**| The reminder identifier |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**ReminderInfo**](ReminderInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAgreementReminders"></a>
# **getAgreementReminders**
> RemindersResponse getAgreementReminders(authorization, agreementId, xApiUser, xOnBehalfOfUser, status)

Retrieves the reminders of an agreement, identified by agreementId in the path.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String status = "status_example"; // String | A comma-separated list of reminder statuses of the reminders which should be returned in the response. Currently supported values are ACTIVE, CANCELLED, COMPLETE
try {
    RemindersResponse result = apiInstance.getAgreementReminders(authorization, agreementId, xApiUser, xOnBehalfOfUser, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAgreementReminders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **status** | **String**| A comma-separated list of reminder statuses of the reminders which should be returned in the response. Currently supported values are ACTIVE, CANCELLED, COMPLETE | [optional]

### Return type

[**RemindersResponse**](RemindersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAgreementSecurityOptionsForParticipation"></a>
# **getAgreementSecurityOptionsForParticipation**
> ParticipantSecurityOption getAgreementSecurityOptionsForParticipation(authorization, agreementId, participantSetId, participantId, ifNoneMatch, xApiUser)

Retrieves the security options for a particular participant.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String participantId = "participantId_example"; // String | The participant identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
try {
    ParticipantSecurityOption result = apiInstance.getAgreementSecurityOptionsForParticipation(authorization, agreementId, participantSetId, participantId, ifNoneMatch, xApiUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAgreementSecurityOptionsForParticipation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
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

<a name="getAgreements"></a>
# **getAgreements**
> UserAgreements getAgreements(authorization, xApiUser, xOnBehalfOfUser, externalId, showHiddenAgreements, cursor, pageSize)

Retrieves agreements for the user.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String externalId = "externalId_example"; // String | Case-sensitive ExternalID for which you would like to retrieve agreement information. ExternalId is passed in the call to the agreement creation API.
Boolean showHiddenAgreements = true; // Boolean | A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false.
String cursor = "cursor_example"; // String | Used to navigate through the pages. If not provided, returns the first page.
Integer pageSize = 56; // Integer | Number of intended items in the response page. If not provided, it is decided by the application settings.
try {
    UserAgreements result = apiInstance.getAgreements(authorization, xApiUser, xOnBehalfOfUser, externalId, showHiddenAgreements, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAgreements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **externalId** | **String**| Case-sensitive ExternalID for which you would like to retrieve agreement information. ExternalId is passed in the call to the agreement creation API. | [optional]
 **showHiddenAgreements** | **Boolean**| A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false. | [optional]
 **cursor** | **String**| Used to navigate through the pages. If not provided, returns the first page. | [optional]
 **pageSize** | **Integer**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional]

### Return type

[**UserAgreements**](UserAgreements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDocuments"></a>
# **getAllDocuments**
> AgreementDocuments getAllDocuments(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, supportingDocumentContentFormat)

Retrieves the IDs of the documents of an agreement identified by agreementId.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String versionId = "versionId_example"; // String | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
String participantId = "participantId_example"; // String | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used.
String supportingDocumentContentFormat = "supportingDocumentContentFormat_example"; // String | Content format of the supported documents. It can have two possible values ORIGINAL or CONVERTED_PDF. Default value is CONVERTED_PDF.
try {
    AgreementDocuments result = apiInstance.getAllDocuments(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, supportingDocumentContentFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAllDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **versionId** | **String**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional]
 **participantId** | **String**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional]
 **supportingDocumentContentFormat** | **String**| Content format of the supported documents. It can have two possible values ORIGINAL or CONVERTED_PDF. Default value is CONVERTED_PDF. | [optional] [enum: ORIGINAL, CONVERTED_PDF]

### Return type

[**AgreementDocuments**](AgreementDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllDocumentsImageUrls"></a>
# **getAllDocumentsImageUrls**
> DocumentsImageUrlsInfo getAllDocumentsImageUrls(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, imageSizes, includeSupportingDocumentsImageUrls, showImageAvailabilityOnly)

Retrieves image urls of all visible pages of all the documents associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String versionId = "versionId_example"; // String | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
String participantId = "participantId_example"; // String | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used.
String imageSizes = "imageSizes_example"; // String | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}. 
Boolean includeSupportingDocumentsImageUrls = true; // Boolean | When set to true, returns image urls of supporting documents as well. Else, returns image urls of only the original documents.
Boolean showImageAvailabilityOnly = true; // Boolean | When set to true, returns only image availability. Else, returns both image urls and its availability.
try {
    DocumentsImageUrlsInfo result = apiInstance.getAllDocumentsImageUrls(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, imageSizes, includeSupportingDocumentsImageUrls, showImageAvailabilityOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAllDocumentsImageUrls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **versionId** | **String**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional]
 **participantId** | **String**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional]
 **imageSizes** | **String**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional]
 **includeSupportingDocumentsImageUrls** | **Boolean**| When set to true, returns image urls of supporting documents as well. Else, returns image urls of only the original documents. | [optional]
 **showImageAvailabilityOnly** | **Boolean**| When set to true, returns only image availability. Else, returns both image urls and its availability. | [optional]

### Return type

[**DocumentsImageUrlsInfo**](DocumentsImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllMembers"></a>
# **getAllMembers**
> MembersInfo getAllMembers(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeNextParticipantSet)

Retrieves information of members of the agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
Boolean includeNextParticipantSet = true; // Boolean | A query parameter to fetch next active participation members. Default value is false.
try {
    MembersInfo result = apiInstance.getAllMembers(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeNextParticipantSet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAllMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **includeNextParticipantSet** | **Boolean**| A query parameter to fetch next active participation members. Default value is false. | [optional]

### Return type

[**MembersInfo**](MembersInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuditTrail"></a>
# **getAuditTrail**
> byte[] getAuditTrail(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the audit trail of an agreement identified by agreementId.

PDF file stream containing audit trail information

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getAuditTrail(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getAuditTrail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
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

<a name="getCombinedDocument"></a>
# **getCombinedDocument**
> byte[] getCombinedDocument(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachSupportingDocuments, attachAuditReport)

Retrieves a single combined PDF document for the documents associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String versionId = "versionId_example"; // String | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
String participantId = "participantId_example"; // String | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used.
Boolean attachSupportingDocuments = true; // Boolean | When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
Boolean attachAuditReport = true; // Boolean | When set to true, attach an audit report to the signed agreement PDF. Default value is false
try {
    byte[] result = apiInstance.getCombinedDocument(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachSupportingDocuments, attachAuditReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getCombinedDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **versionId** | **String**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional]
 **participantId** | **String**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional]
 **attachSupportingDocuments** | **Boolean**| When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true. | [optional]
 **attachAuditReport** | **Boolean**| When set to true, attach an audit report to the signed agreement PDF. Default value is false | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

<a name="getCombinedDocumentPagesInfo"></a>
# **getCombinedDocumentPagesInfo**
> CombinedDocumentPagesInfo getCombinedDocumentPagesInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeSupportingDocumentsPagesInfo)

Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
Boolean includeSupportingDocumentsPagesInfo = true; // Boolean | When set to true, returns info of all pages of supporting documents as well. Else, return the info of pages of only the original document.
try {
    CombinedDocumentPagesInfo result = apiInstance.getCombinedDocumentPagesInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeSupportingDocumentsPagesInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getCombinedDocumentPagesInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **includeSupportingDocumentsPagesInfo** | **Boolean**| When set to true, returns info of all pages of supporting documents as well. Else, return the info of pages of only the original document. | [optional]

### Return type

[**CombinedDocumentPagesInfo**](CombinedDocumentPagesInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCombinedDocumentUrl"></a>
# **getCombinedDocumentUrl**
> DocumentUrl getCombinedDocumentUrl(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, attachSupportingDocuments, attachAuditReport)

Retrieves url of all visible pages of all the documents associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String versionId = "versionId_example"; // String | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used.
String participantId = "participantId_example"; // String | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used.
Boolean attachSupportingDocuments = true; // Boolean | When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true.
Boolean attachAuditReport = true; // Boolean | When set to true, attach an audit report to the signed agreement PDF. Default value is false
try {
    DocumentUrl result = apiInstance.getCombinedDocumentUrl(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, attachSupportingDocuments, attachAuditReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getCombinedDocumentUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **versionId** | **String**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional]
 **participantId** | **String**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional]
 **attachSupportingDocuments** | **Boolean**| When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true. | [optional]
 **attachAuditReport** | **Boolean**| When set to true, attach an audit report to the signed agreement PDF. Default value is false | [optional]

### Return type

[**DocumentUrl**](DocumentUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> byte[] getDocument(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the file stream of a document of an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String documentId = "documentId_example"; // String | The document identifier, as retrieved from the API which fetches the documents of a specified agreement
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getDocument(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **documentId** | **String**| The document identifier, as retrieved from the API which fetches the documents of a specified agreement |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, *_/_*;encoding=base64

<a name="getDocumentImageUrls"></a>
# **getDocumentImageUrls**
> AgreementDocumentImageUrlsInfo getDocumentImageUrls(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, imageSizes, showImageAvailabilityOnly, startPage, endPage)

Retrieves image urls of all visible pages of a document associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String documentId = "documentId_example"; // String | The document identifier, as retrieved from the API which fetches the documents of a specified agreement
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String imageSizes = "imageSizes_example"; // String | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}. 
Boolean showImageAvailabilityOnly = true; // Boolean | When set to true, returns only image availability. Else, returns both image urls and its availability.
Integer startPage = 56; // Integer | Start of page number range for which imageUrls are requested. Starting page number should be greater than 0.
Integer endPage = 56; // Integer | End of page number range for which imageUrls are requested.
try {
    AgreementDocumentImageUrlsInfo result = apiInstance.getDocumentImageUrls(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, imageSizes, showImageAvailabilityOnly, startPage, endPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getDocumentImageUrls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **documentId** | **String**| The document identifier, as retrieved from the API which fetches the documents of a specified agreement |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **imageSizes** | **String**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional]
 **showImageAvailabilityOnly** | **Boolean**| When set to true, returns only image availability. Else, returns both image urls and its availability. | [optional]
 **startPage** | **Integer**| Start of page number range for which imageUrls are requested. Starting page number should be greater than 0. | [optional]
 **endPage** | **Integer**| End of page number range for which imageUrls are requested. | [optional]

### Return type

[**AgreementDocumentImageUrlsInfo**](AgreementDocumentImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> AgreementEventList getEvents(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the events information for an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    AgreementEventList result = apiInstance.getEvents(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**AgreementEventList**](AgreementEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormData"></a>
# **getFormData**
> byte[] getFormData(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves data entered into the interactive form fields of the agreement.

This API can only be called by the creator of the agreement

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    byte[] result = apiInstance.getFormData(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getFormData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
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

<a name="getFormFields"></a>
# **getFormFields**
> AgreementFormFields getFormFields(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, participantEmail)

Retrieves details of form fields of an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
String participantEmail = "participantEmail_example"; // String | The email address of the participant to be used to retrieve its associated form fields.
try {
    AgreementFormFields result = apiInstance.getFormFields(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, participantEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]
 **participantEmail** | **String**| The email address of the participant to be used to retrieve its associated form fields. | [optional]

### Return type

[**AgreementFormFields**](AgreementFormFields.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMergeInfo"></a>
# **getMergeInfo**
> FormFieldMergeInfo getMergeInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser)

Retrieves the merge info stored with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    FormFieldMergeInfo result = apiInstance.getMergeInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getMergeInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**FormFieldMergeInfo**](FormFieldMergeInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParticipantSet"></a>
# **getParticipantSet**
> DetailedParticipantSetInfo getParticipantSet(authorization, agreementId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch)

Retrieves the participant set of an agreement identified by agreementId in the path.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    DetailedParticipantSetInfo result = apiInstance.getParticipantSet(authorization, agreementId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getParticipantSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **participantSetId** | **String**| The participant set identifier |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**DetailedParticipantSetInfo**](DetailedParticipantSetInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSigningUrl"></a>
# **getSigningUrl**
> SigningUrlResponse getSigningUrl(authorization, agreementId, xApiUser, ifNoneMatch)

Retrieves the URL for the e-sign page for the current signer(s) of an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String ifNoneMatch = "ifNoneMatch_example"; // String | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed.
try {
    SigningUrlResponse result = apiInstance.getSigningUrl(authorization, agreementId, xApiUser, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#getSigningUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **ifNoneMatch** | **String**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional]

### Return type

[**SigningUrlResponse**](SigningUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rejectAgreementForParticipation"></a>
# **rejectAgreementForParticipation**
> rejectAgreementForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, agreementRejectionInfo, xApiUser)

Rejects the agreement for a participant.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String participantId = "participantId_example"; // String | The participant identifier
AgreementRejectionInfo agreementRejectionInfo = new AgreementRejectionInfo(); // AgreementRejectionInfo | Participant rejection information required for rejecting the agreement
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
try {
    apiInstance.rejectAgreementForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, agreementRejectionInfo, xApiUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#rejectAgreementForParticipation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **participantSetId** | **String**| The participant set identifier |
 **participantId** | **String**| The participant identifier |
 **agreementRejectionInfo** | [**AgreementRejectionInfo**](AgreementRejectionInfo.md)| Participant rejection information required for rejecting the agreement |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAgreement"></a>
# **updateAgreement**
> updateAgreement(authorization, ifMatch, agreementId, agreementInfo, xApiUser, xOnBehalfOfUser)

Updates the agreement in draft state, or update the expirationTime on an existing agreement that is already out for signature.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
AgreementInfo agreementInfo = new AgreementInfo(); // AgreementInfo | Information necessary to update a modifiable agreement that is presently out for signature.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateAgreement(authorization, ifMatch, agreementId, agreementInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **agreementInfo** | [**AgreementInfo**](AgreementInfo.md)| Information necessary to update a modifiable agreement that is presently out for signature. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAgreementMergeInfo"></a>
# **updateAgreementMergeInfo**
> updateAgreementMergeInfo(authorization, ifMatch, agreementId, formFieldMergeInfo, xApiUser, xOnBehalfOfUser)

Set the merge info for an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
FormFieldMergeInfo formFieldMergeInfo = new FormFieldMergeInfo(); // FormFieldMergeInfo | A mapping indicating the default values to set for form fields
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateAgreementMergeInfo(authorization, ifMatch, agreementId, formFieldMergeInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreementMergeInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **formFieldMergeInfo** | [**FormFieldMergeInfo**](FormFieldMergeInfo.md)| A mapping indicating the default values to set for form fields |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, text/csv

<a name="updateAgreementNoteForApiUser"></a>
# **updateAgreementNoteForApiUser**
> updateAgreementNoteForApiUser(authorization, agreementId, note, xApiUser, xOnBehalfOfUser)

Updates the latest note associated with an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
Note note = new Note(); // Note | The note to be associated with the agreement.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateAgreementNoteForApiUser(authorization, agreementId, note, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreementNoteForApiUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **note** | [**Note**](Note.md)| The note to be associated with the agreement. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAgreementReminder"></a>
# **updateAgreementReminder**
> updateAgreementReminder(authorization, agreementId, reminderId, reminderInfo, xApiUser, xOnBehalfOfUser)

Updates an existing reminder for an agreement

You can only update an ACTIVE reminder, and can only update the status to &#39;CANCELED&#39;, update reminderParticipantIds, or update note.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String reminderId = "reminderId_example"; // String | The reminder identifier
ReminderInfo reminderInfo = new ReminderInfo(); // ReminderInfo | The information about a reminder associated with a recipient of an agreement.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateAgreementReminder(authorization, agreementId, reminderId, reminderInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreementReminder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **reminderId** | **String**| The reminder identifier |
 **reminderInfo** | [**ReminderInfo**](ReminderInfo.md)| The information about a reminder associated with a recipient of an agreement. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAgreementSecurityOptionsForParticipation"></a>
# **updateAgreementSecurityOptionsForParticipation**
> updateAgreementSecurityOptionsForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, participantSecurityOption, xApiUser)

Updates the security options for a particular participant.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
String participantId = "participantId_example"; // String | The participant identifier
ParticipantSecurityOption participantSecurityOption = new ParticipantSecurityOption(); // ParticipantSecurityOption | Security options that apply to the participant
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
try {
    apiInstance.updateAgreementSecurityOptionsForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, participantSecurityOption, xApiUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreementSecurityOptionsForParticipation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
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

<a name="updateAgreementState"></a>
# **updateAgreementState**
> updateAgreementState(authorization, ifMatch, agreementId, agreementStateInfo, xApiUser, xOnBehalfOfUser)

Updates the state of an agreement identified by agreementId in the path.

This endpoint can be used by originator/sender of an agreement to transition between the states of agreement. An allowed transition would follow the following sequence: DRAFT -&gt; AUTHORING -&gt; IN_PROCESS -&gt; CANCELLED.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
AgreementStateInfo agreementStateInfo = new AgreementStateInfo(); // AgreementStateInfo | 
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateAgreementState(authorization, ifMatch, agreementId, agreementStateInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreementState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **agreementStateInfo** | [**AgreementStateInfo**](AgreementStateInfo.md)|  |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAgreementVisibility"></a>
# **updateAgreementVisibility**
> updateAgreementVisibility(authorization, agreementId, visibilityInfo, xApiUser, xOnBehalfOfUser)

Updates the visibility of an agreement.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
VisibilityInfo visibilityInfo = new VisibilityInfo(); // VisibilityInfo | Information to update visibility of agreement
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateAgreementVisibility(authorization, agreementId, visibilityInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateAgreementVisibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **visibilityInfo** | [**VisibilityInfo**](VisibilityInfo.md)| Information to update visibility of agreement |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFormFields"></a>
# **updateFormFields**
> AgreementFormFields updateFormFields(authorization, ifMatch, agreementId, formFieldPutInfo, xApiUser, xOnBehalfOfUser)

Updates form fields of an agreement.  This will replace all fields in AUTHORING mode agreements, and will replace all fields except for text tag generated fields in DRAFT mode agreements.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
FormFieldPutInfo formFieldPutInfo = new FormFieldPutInfo(); // FormFieldPutInfo | List of form fields to add or replace
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    AgreementFormFields result = apiInstance.updateFormFields(authorization, ifMatch, agreementId, formFieldPutInfo, xApiUser, xOnBehalfOfUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **formFieldPutInfo** | [**FormFieldPutInfo**](FormFieldPutInfo.md)| List of form fields to add or replace |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

[**AgreementFormFields**](AgreementFormFields.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParticipantSet"></a>
# **updateParticipantSet**
> updateParticipantSet(authorization, ifMatch, agreementId, participantSetId, detailedParticipantSetInfo, xApiUser, xOnBehalfOfUser)

Updates the participant set of an agreement identified by agreementId in the path.

### Example
```java
// Import classes:
//import io.swagger.client.model.ApiException;
//import io.swagger.client.api.AgreementsApi;


AgreementsApi apiInstance = new AgreementsApi();
String authorization = "authorization_example"; // String | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
String ifMatch = "ifMatch_example"; // String | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
String agreementId = "agreementId_example"; // String | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
String participantSetId = "participantSetId_example"; // String | The participant set identifier
DetailedParticipantSetInfo detailedParticipantSetInfo = new DetailedParticipantSetInfo(); // DetailedParticipantSetInfo | The new participant set info.
String xApiUser = "xApiUser_example"; // String | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token.
String xOnBehalfOfUser = "xOnBehalfOfUser_example"; // String | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account
try {
    apiInstance.updateParticipantSet(authorization, ifMatch, agreementId, participantSetId, detailedParticipantSetInfo, xApiUser, xOnBehalfOfUser);
} catch (ApiException e) {
    System.err.println("Exception when calling AgreementsApi#updateParticipantSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. |
 **ifMatch** | **String**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. |
 **agreementId** | **String**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. |
 **participantSetId** | **String**| The participant set identifier |
 **detailedParticipantSetInfo** | [**DetailedParticipantSetInfo**](DetailedParticipantSetInfo.md)| The new participant set info. |
 **xApiUser** | **String**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional]
 **xOnBehalfOfUser** | **String**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

