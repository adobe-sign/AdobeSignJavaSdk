
# UserWidget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hidden** | **Boolean** | True if agreement is hidden for the user |  [optional]
**groupId** | **String** | Unique identifier of the group |  [optional]
**modifiedDate** | [**Date**](Date.md) | The date on which the web form was last modified. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**name** | **String** | The name of the web form. |  [optional]
**id** | **String** | The unique identifier of a web form |  [optional]
**javascript** | **String** | The embedded javascript code of the web form |  [optional]
**url** | **String** | The hosted url of the web form |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The web form status (AUTHORING, ACTIVE, DRAFT, DISABLED) |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
ACTIVE | &quot;ACTIVE&quot;
DRAFT | &quot;DRAFT&quot;
DISABLED | &quot;DISABLED&quot;



