
# WebhookInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationDisplayName** | **String** | The display name of the application through which webhook is created |  [optional]
**applicationName** | **String** | The name of the application through which webhook is created |  [optional]
**created** | [**Date**](Date.md) | Timestamp when the webhook was created. Will only be returned in GET request. Can&#39;t be modified in PUT request |  [optional]
**id** | **String** | The unique identifier of the webhook. Will only be returned in GET request. Can&#39;t be modified in PUT request |  [optional]
**lastModified** | [**Date**](Date.md) | Timestamp when the webhook was last updated. Will only be returned in GET request. Can&#39;t be modified in PUT request |  [optional]
**name** | **String** | The name of the webhook |  [optional]
**resourceId** | **String** | Id of the resource type for which you want to create webhook. Provide agreementId if webhook needs to be created for an agreement. Similarly, widgetId if webhook needs to be created for a widget, megaSignId if webhook needs to be created for a megaSign and libraryDocumentId if webhook needs to be created for a library document. Need to specify only if scope is &#39;RESOURCE&#39;. Can&#39;t be modified in PUT request |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The resource for which you want to create webhook. Need to specify only if scope is &#39;RESOURCE&#39;. Can&#39;t be modified in PUT request. The possible values are AGREEMENT, WIDGET,  MEGASIGN AND LIBRARY_DOCUMENT |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of webhook. Can&#39;t be modified in PUT request. The possible values are ACCOUNT, GROUP, USER or RESOURCE |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state in which the webhook should be created |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the webhook. Determines whether the webhook will be actually triggered. Default: ACTIVE, if ACTIVE, this webhook will receive event requests. If INACTIVE, this webhook will not receive event requests. Can&#39;t provide status in POST/PUT requests. |  [optional]
**webhookConditionalParams** | [**WebhookConditionalParams**](WebhookConditionalParams.md) | Conditions which webhook creator can specify for the payload while creating or updating a webhook |  [optional]
**webhookSubscriptionEvents** | [**List&lt;WebhookSubscriptionEventsEnum&gt;**](#List&lt;WebhookSubscriptionEventsEnum&gt;) | Determines events for which the webhook is triggered. The possible values are &lt;br&gt; AGREEMENT_CREATED : When an agreement is created &lt;br&gt;, AGREEMENT_ACTION_DELEGATED : When an agreement is delegated &lt;br&gt;, AGREEMENT_RECALLED : When an agreement is recalled &lt;br&gt;, AGREEMENT_REJECTED : When an agreement is rejected &lt;br&gt;, AGREEMENT_EXPIRED : When an agreement expires &lt;br&gt;, AGREEMENT_ACTION_COMPLETED : When an agreement action is completed &lt;br&gt;, AGREEMENT_WORKFLOW_COMPLETED : When an agreement workflow is completed &lt;br&gt;, AGREEMENT_EMAIL_VIEWED : When an agreement&#39;s email is viewed &lt;br&gt;, AGREEMENT_MODIFIED : When an agreement is modified &lt;br&gt;, AGREEMENT_SHARED : When an agreement is shared &lt;br&gt;, AGREEMENT_VAULTED : When an agreement is vaulted &lt;br&gt;, AGREEMENT_ACTION_REQUESTED : When an agreement action is requested &lt;br&gt;, AGREEMENT_ACTION_REPLACED_SIGNER : When signer is replaced for an agreement &lt;br&gt;, AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM : When an agreement is auto-cancelled due to conversion problem &lt;br&gt;, AGREEMENT_DOCUMENTS_DELETED : When an agreement documents are deleted &lt;br&gt;, AGREEMENT_EMAIL_BOUNCED : When an agreement email gets bounced &lt;br&gt;, AGREEMENT_KBA_AUTHENTICATED : When an agreement KBA is authenticated &lt;br&gt;, AGREEMENT_OFFLINE_SYNC : When an agreement is synced offline &lt;br&gt;, AGREEMENT_USER_ACK_AGREEMENT_MODIFIED : User Acknowledgement when an agreement is modified &lt;br&gt;, AGREEMENT_UPLOADED_BY_SENDER : When an agreement is uploaded by sender &lt;br&gt;, AGREEMENT_WEB_IDENTITY_AUTHENTICATED : When an agreement web identity is authenticated &lt;br&gt;, AGREEMENT_ALL : All the supported agreement events for Webhooks &lt;br&gt;, MEGASIGN_CREATED : When a megaSign is created &lt;br&gt;, MEGASIGN_RECALLED : When a megaSign is recalled &lt;br&gt;, MEGASIGN_SHARED : When a megaSign is shared &lt;br&gt;, MEGASIGN_ALL : All the supported megaSign events for Webhooks &lt;br&gt;, WIDGET_CREATED : When a widget is created &lt;br&gt;, WIDGET_MODIFIED : When a widget is modified &lt;br&gt;, WIDGET_SHARED : When a widget is shared &lt;br&gt;, WIDGET_ENABLED : When a widget is enabled &lt;br&gt;, WIDGET_DISABLED : When a widget is disabled &lt;br&gt;, WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM : When a widget is auto-cancelled due to conversion problem &lt;br&gt;, WIDGET_ALL : All the supported widget events for Webhooks &lt;br&gt;, LIBRARY_DOCUMENT_CREATED : When a library document  is created &lt;br&gt;, LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM : When a library document is auto-cancelled due to conversion problem &lt;br&gt;, LIBRARY_DOCUMENT_MODIFIED : When a library document is modified &lt;br&gt;, LIBRARY_DOCUMENT_ALL : All the supported library document  events for Webhooks |  [optional]
**webhookUrlInfo** | [**WebhookUrlInfo**](WebhookUrlInfo.md) | Info of webhook url |  [optional]


<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
AGREEMENT | &quot;AGREEMENT&quot;
WIDGET | &quot;WIDGET&quot;
MEGASIGN | &quot;MEGASIGN&quot;
LIBRARY_DOCUMENT | &quot;LIBRARY_DOCUMENT&quot;


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ACCOUNT | &quot;ACCOUNT&quot;
GROUP | &quot;GROUP&quot;
USER | &quot;USER&quot;
RESOURCE | &quot;RESOURCE&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;


<a name="List<WebhookSubscriptionEventsEnum>"></a>
## Enum: List&lt;WebhookSubscriptionEventsEnum&gt;
Name | Value
---- | -----
AGREEMENT_CREATED | &quot;AGREEMENT_CREATED&quot;
AGREEMENT_ACTION_DELEGATED | &quot;AGREEMENT_ACTION_DELEGATED&quot;
AGREEMENT_RECALLED | &quot;AGREEMENT_RECALLED&quot;
AGREEMENT_REJECTED | &quot;AGREEMENT_REJECTED&quot;
AGREEMENT_EXPIRED | &quot;AGREEMENT_EXPIRED&quot;
AGREEMENT_ACTION_COMPLETED | &quot;AGREEMENT_ACTION_COMPLETED&quot;
AGREEMENT_WORKFLOW_COMPLETED | &quot;AGREEMENT_WORKFLOW_COMPLETED&quot;
AGREEMENT_EMAIL_VIEWED | &quot;AGREEMENT_EMAIL_VIEWED&quot;
AGREEMENT_MODIFIED | &quot;AGREEMENT_MODIFIED&quot;
AGREEMENT_SHARED | &quot;AGREEMENT_SHARED&quot;
AGREEMENT_VAULTED | &quot;AGREEMENT_VAULTED&quot;
AGREEMENT_ACTION_REQUESTED | &quot;AGREEMENT_ACTION_REQUESTED&quot;
AGREEMENT_ACTION_REPLACED_SIGNER | &quot;AGREEMENT_ACTION_REPLACED_SIGNER&quot;
AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM | &quot;AGREEMENT_AUTO_CANCELLED_CONVERSION_PROBLEM&quot;
AGREEMENT_DOCUMENTS_DELETED | &quot;AGREEMENT_DOCUMENTS_DELETED&quot;
AGREEMENT_EMAIL_BOUNCED | &quot;AGREEMENT_EMAIL_BOUNCED&quot;
AGREEMENT_KBA_AUTHENTICATED | &quot;AGREEMENT_KBA_AUTHENTICATED&quot;
AGREEMENT_OFFLINE_SYNC | &quot;AGREEMENT_OFFLINE_SYNC&quot;
AGREEMENT_USER_ACK_AGREEMENT_MODIFIED | &quot;AGREEMENT_USER_ACK_AGREEMENT_MODIFIED&quot;
AGREEMENT_UPLOADED_BY_SENDER | &quot;AGREEMENT_UPLOADED_BY_SENDER&quot;
AGREEMENT_WEB_IDENTITY_AUTHENTICATED | &quot;AGREEMENT_WEB_IDENTITY_AUTHENTICATED&quot;
AGREEMENT_ALL | &quot;AGREEMENT_ALL&quot;
MEGASIGN_CREATED | &quot;MEGASIGN_CREATED&quot;
MEGASIGN_RECALLED | &quot;MEGASIGN_RECALLED&quot;
MEGASIGN_SHARED | &quot;MEGASIGN_SHARED&quot;
MEGASIGN_ALL | &quot;MEGASIGN_ALL&quot;
WIDGET_CREATED | &quot;WIDGET_CREATED&quot;
WIDGET_MODIFIED | &quot;WIDGET_MODIFIED&quot;
WIDGET_SHARED | &quot;WIDGET_SHARED&quot;
WIDGET_ENABLED | &quot;WIDGET_ENABLED&quot;
WIDGET_DISABLED | &quot;WIDGET_DISABLED&quot;
WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM | &quot;WIDGET_AUTO_CANCELLED_CONVERSION_PROBLEM&quot;
WIDGET_ALL | &quot;WIDGET_ALL&quot;
LIBRARY_DOCUMENT_CREATED | &quot;LIBRARY_DOCUMENT_CREATED&quot;
LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM | &quot;LIBRARY_DOCUMENT_AUTO_CANCELLED_CONVERSION_PROBLEM&quot;
LIBRARY_DOCUMENT_MODIFIED | &quot;LIBRARY_DOCUMENT_MODIFIED&quot;
LIBRARY_DOCUMENT_ALL | &quot;LIBRARY_DOCUMENT_ALL&quot;



