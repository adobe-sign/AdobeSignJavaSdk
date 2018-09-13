
# MegaSign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayDate** | [**Date**](Date.md) | The display date for the MegaSign parent agreement. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**id** | **String** | The unique identifier of the MegaSign parent agreement |  [optional]
**esign** | **Boolean** | True, if the signature type of the MegaSign parent agreement is ESIGN. False, if the signature type of the MegaSign parent agreement is WRITTEN |  [optional]
**name** | **String** | Name of the MegaSign parent agreement |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the MegaSign parent agreement from the perspective of the user |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
WAITING_FOR_MY_SIGNATURE | &quot;WAITING_FOR_MY_SIGNATURE&quot;
IN_PROCESS | &quot;IN_PROCESS&quot;
CANCELLED | &quot;CANCELLED&quot;
ARCHIVED | &quot;ARCHIVED&quot;
COMPLETED | &quot;COMPLETED&quot;
WAITING_FOR_AUTHORING | &quot;WAITING_FOR_AUTHORING&quot;
WAITING_FOR_PREFILL | &quot;WAITING_FOR_PREFILL&quot;



