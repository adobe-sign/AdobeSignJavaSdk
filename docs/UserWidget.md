
# UserWidget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of a widget |  [optional]
**hidden** | **Boolean** | True if agreement is hidden for the user |  [optional]
**javascript** | **String** | The embedded javascript code of the widget |  [optional]
**modifiedDate** | [**Date**](Date.md) | The date on which the widget was last modified. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**name** | **String** | The name of the widget. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The widget status (AUTHORING, ACTIVE, DRAFT, DISABLED) |  [optional]
**url** | **String** | The hosted url of the widget |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
ACTIVE | &quot;ACTIVE&quot;
DRAFT | &quot;DRAFT&quot;
DISABLED | &quot;DISABLED&quot;



