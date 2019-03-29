
# WidgetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalParticipantSetsInfo** | [**List&lt;WidgetAdditionalParticipationSetInfo&gt;**](WidgetAdditionalParticipationSetInfo.md) | List of all the participants in the widget except widget signer |  [optional]
**authFailureInfo** | [**WidgetRedirectionInfo**](WidgetRedirectionInfo.md) | URL and associated properties for the error page the widget signer will be taken after failing to authenticate |  [optional]
**ccs** | [**List&lt;WidgetCcInfo&gt;**](WidgetCcInfo.md) | A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email when the final agreement created through widget is signed. The email addresses will also receive a copy of the document, attached as a PDF file |  [optional]
**completionInfo** | [**WidgetRedirectionInfo**](WidgetRedirectionInfo.md) | URL and associated properties for the success page the widget signer will be taken to after performing desired action on the widget |  [optional]
**createdDate** | [**Date**](Date.md) | Date when widget was created. If provided in POST, it will simply be ignored. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**creatorEmail** | **String** | Email of widget creator. Only returned in GET response. Cannot be provided in POST/PUT request. If provided in POST, it will simply be ignored |  [optional]
**fileInfos** | [**List&lt;FileInfo&gt;**](FileInfo.md) | A list of one or more files (or references to files) that will be used to create the widget. If more than one file is provided, they will be combined before the widget is created. Library documents are not permitted. Note: Only one of the four parameters in every FileInfo object must be specified |  [optional]
**id** | **String** | A resource identifier that can be used to uniquely identify the widget in other apis. If provided in POST, it will simply be ignored |  [optional]
**locale** | **String** | The locale associated with this widget - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the widget creator |  [optional]
**name** | **String** | The name of the widget that will be used to identify it, in emails, website and other places |  [optional]
**securityOption** | [**SecurityOption**](SecurityOption.md) | Secondary security parameters for the widget |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state in which the widget should land. For example in order to create a widget in DRAFT state, field should be DRAFT. The state field will never get returned in GET /widgets/{ID} and will be ignored if provided in PUT /widgets/{ID} call. The eventual status of the widget can be obtained from GET /widgets/ID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Widget. If provided in POST, it will simply be ignored |  [optional]
**vaultingInfo** | [**VaultingInfo**](VaultingInfo.md) | Vaulting properties that allows Adobe Sign to securely store documents with a vault provider |  [optional]
**widgetInActiveInfo** | [**WidgetInActiveInfo**](WidgetInActiveInfo.md) | The custom message which will be displayed to the user or the URL to which user will be redirected when the widget is accessed in a disabled state. This can only be specified in PUT request |  [optional]
**widgetParticipantSetInfo** | [**WidgetParticipantSetInfo**](WidgetParticipantSetInfo.md) | Represents widget participant for whom email should not be provided |  [optional]


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



