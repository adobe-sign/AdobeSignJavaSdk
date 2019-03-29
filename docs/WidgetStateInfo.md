
# WidgetStateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) | State of the Widget |  [optional]
**widgetInActiveInfo** | [**WidgetInActiveInfo**](WidgetInActiveInfo.md) | The custom message which will be displayed to the user or the URL to which user will be redirected when the widget is accessed in a disabled state. This can only be specified in PUT request |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
AUTHORING | &quot;AUTHORING&quot;
CANCELLED | &quot;CANCELLED&quot;



