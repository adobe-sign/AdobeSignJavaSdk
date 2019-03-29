
# MegaSignStateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**megaSignCancellationInfo** | [**AgreementCancellationInfo**](AgreementCancellationInfo.md) | Cancellation information for the agreement. Mandatory while cancelling a megaSign |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state to which the megaSign is to be updated. The only valid state for this variable is currently, CANCELLED |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
CANCELLED | &quot;CANCELLED&quot;



