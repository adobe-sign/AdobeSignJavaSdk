
# UserWorkflow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**Date**](Date.md) | The date on which the workflow was created. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**description** | **String** | Description provided for this workflow at the time of its creation |  [optional]
**displayName** | **String** | The display name of the workflow. |  [optional]
**id** | **String** | The unique identifier of a workflow |  [optional]
**name** | **String** | The name of the workflow. |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | The workflow scope (ACCOUNT or GROUP or OTHER) |  [optional]
**scopeId** | **String** | Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId. |  [optional]
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



