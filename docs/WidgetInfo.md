
# WidgetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalParticipantSetsInfo** | [**List&lt;WidgetAdditionalParticipationSetInfo&gt;**](WidgetAdditionalParticipationSetInfo.md) | List of all the participants in the web form except web form signer |  [optional]
**creatorEmail** | **String** | Email of web form creator. Only returned in GET response. Cannot be provided in POST/PUT request. If provided in POST, it will simply be ignored |  [optional]
**groupId** | **String** | The ID of the group to which the widget belongs to. If not provided during creation, primary group of the creator will be used |  [optional]
**locale** | **String** | The locale associated with this web form - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the web form creator |  [optional]
**vaultingInfo** | [**VaultingInfo**](VaultingInfo.md) | Vaulting properties that allows Adobe Sign to securely store documents with a vault provider |  [optional]
**securityOption** | [**SecurityOption**](SecurityOption.md) | Secondary security parameters for the web form |  [optional]
**widgetParticipantSetInfo** | [**WidgetParticipantSetInfo**](WidgetParticipantSetInfo.md) | Represents web form participant for whom email should not be provided |  [optional]
**widgetInActiveInfo** | [**WidgetInActiveInfo**](WidgetInActiveInfo.md) | The custom message which will be displayed to the user or the URL to which user will be redirected when the web form is accessed in a disabled state. This can only be specified in PUT request |  [optional]
**ccs** | [**List&lt;WidgetCcInfo&gt;**](WidgetCcInfo.md) | A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email when the final agreement created through web form is signed. The email addresses will also receive a copy of the document, attached as a PDF file |  [optional]
**createdDate** | [**Date**](Date.md) | Date when web form was created. If provided in POST, it will simply be ignored. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**isDocumentRetentionApplied** | **Boolean** | Is document retention applied for this resource.  If provided in POST or PUT, it will simply be ignored. |  [optional]
**lastEventDate** | [**Date**](Date.md) | The date of the last event that occurred for this web form.  Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**name** | **String** | The name of the web form that will be used to identify it, in emails, website and other places |  [optional]
**completionInfo** | [**WidgetRedirectionInfo**](WidgetRedirectionInfo.md) | URL and associated properties for the success page the web form signer will be taken to after performing desired action on the web form |  [optional]
**authFailureInfo** | [**WidgetRedirectionInfo**](WidgetRedirectionInfo.md) | URL and associated properties for the error page the web form signer will be taken after failing to authenticate |  [optional]
**fileInfos** | [**List&lt;FileInfo&gt;**](FileInfo.md) | A list of one or more files (or references to files) that will be used to create the web form. If more than one file is provided, they will be combined before the web form is created. Library documents are not permitted. Note: Only one of the four parameters in every FileInfo object must be specified |  [optional]
**id** | **String** | A resource identifier that can be used to uniquely identify the web form in other apis. If provided in POST, it will simply be ignored |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state in which the web form should land. For example in order to create a web form in DRAFT state, field should be DRAFT. The state field will never get returned in GET /widgets/{ID} and will be ignored if provided in PUT /widgets/{ID} call. The eventual status of the web form can be obtained from GET /widgets/ID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Web Form. If provided in POST, it will simply be ignored |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
ACTIVE | &quot;ACTIVE&quot;
AUTHORING | &quot;AUTHORING&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
AUTHORING | &quot;AUTHORING&quot;
ACTIVE | &quot;ACTIVE&quot;
DOCUMENTS_NOT_YET_PROCESSED | &quot;DOCUMENTS_NOT_YET_PROCESSED&quot;
DISABLED | &quot;DISABLED&quot;
DISCARDED | &quot;DISCARDED&quot;



