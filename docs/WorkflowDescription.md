
# WorkflowDescription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopeId** | **String** | Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId. |  [optional]
**messageInfo** | [**WorkflowDefaultParams**](WorkflowDefaultParams.md) | Information about message field in DocumentCreationInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**created** | [**Date**](Date.md) | The day on which the workflow was created |  [optional]
**displayName** | **String** | The display name of the workflow. |  [optional]
**description** | **String** | Description provided for this workflow at the time of its creation |  [optional]
**mergeFieldsInfo** | [**List&lt;MergeFieldInfoDescription&gt;**](MergeFieldInfoDescription.md) | Information about customFieldInfos in DocumentCreationInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**agreementNameInfo** | [**WorkflowDefaultParams**](WorkflowDefaultParams.md) | Information about name field in DocumentCreationInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**passwordInfo** | [**PasswordFieldInfoDescription**](PasswordFieldInfoDescription.md) | Information about openPassword field in SecurityOptions input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**authoringInfo** | [**WorkflowDefaultParams**](WorkflowDefaultParams.md) | Information about authoringRequested field in SendDocumentInteractiveOptions input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**recipientsListInfo** | [**List&lt;RecipientsListInfoDescription&gt;**](RecipientsListInfoDescription.md) | Information about RecepientsInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | The workflow scope (ACCOUNT or GROUP or OTHER) |  [optional]
**expirationInfo** | [**ExpirationFieldInfoDescription**](ExpirationFieldInfoDescription.md) | Information about daysUntilSigningDeadline field in DocumentCreationInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**name** | **String** | The name of the workflow. |  [optional]
**modified** | [**Date**](Date.md) | The day on which the workflow was last modified |  [optional]
**fileInfos** | [**List&lt;FileInfosDescription&gt;**](FileInfosDescription.md) | Information about FileInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**localeInfo** | [**LocaleFieldInfoDescription**](LocaleFieldInfoDescription.md) | Information about locale  field in DocumentCreationInfo input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**ccsListInfo** | [**List&lt;CCsListInfoDescription&gt;**](CCsListInfoDescription.md) | Information about CCList input field in the agreement creation request when using the API which creates an agreement in a workflow |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The workflow status (ACTIVE or DRAFT or INACTIVE or OTHER) |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ACCOUNT | &quot;ACCOUNT&quot;
GROUP | &quot;GROUP&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DRAFT | &quot;DRAFT&quot;
HIDDEN | &quot;HIDDEN&quot;



