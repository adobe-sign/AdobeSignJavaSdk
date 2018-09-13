
# MegaSignChildAgreement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayDate** | [**Date**](Date.md) | The display date for the agreement. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**id** | **String** | The unique identifier of the agreement.If provided in POST, it will simply be ignored |  [optional]
**esign** | **Boolean** | True if this is an e-sign document |  [optional]
**name** | **String** | Name of the Agreement |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | This is a server generated attribute which provides the detailed status of an agreement with respect to the apiCaller |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
WAITING_FOR_MY_SIGNATURE | &quot;WAITING_FOR_MY_SIGNATURE&quot;
WAITING_FOR_MY_APPROVAL | &quot;WAITING_FOR_MY_APPROVAL&quot;
WAITING_FOR_MY_DELEGATION | &quot;WAITING_FOR_MY_DELEGATION&quot;
WAITING_FOR_MY_ACKNOWLEDGEMENT | &quot;WAITING_FOR_MY_ACKNOWLEDGEMENT&quot;
WAITING_FOR_MY_ACCEPTANCE | &quot;WAITING_FOR_MY_ACCEPTANCE&quot;
WAITING_FOR_MY_FORM_FILLING | &quot;WAITING_FOR_MY_FORM_FILLING&quot;
OUT_FOR_SIGNATURE | &quot;OUT_FOR_SIGNATURE&quot;
OUT_FOR_APPROVAL | &quot;OUT_FOR_APPROVAL&quot;
OUT_FOR_DELIVERY | &quot;OUT_FOR_DELIVERY&quot;
OUT_FOR_ACCEPTANCE | &quot;OUT_FOR_ACCEPTANCE&quot;
OUT_FOR_FORM_FILLING | &quot;OUT_FOR_FORM_FILLING&quot;
SIGNED | &quot;SIGNED&quot;
APPROVED | &quot;APPROVED&quot;
FORM_FILLED | &quot;FORM_FILLED&quot;
DELIVERED | &quot;DELIVERED&quot;
ACCEPTED | &quot;ACCEPTED&quot;
ARCHIVED | &quot;ARCHIVED&quot;
CANCELLED | &quot;CANCELLED&quot;
EXPIRED | &quot;EXPIRED&quot;
WAITING_FOR_AUTHORING | &quot;WAITING_FOR_AUTHORING&quot;
WAITING_FOR_PREFILL | &quot;WAITING_FOR_PREFILL&quot;
DRAFT | &quot;DRAFT&quot;
DOCUMENTS_NOT_YET_PROCESSED | &quot;DOCUMENTS_NOT_YET_PROCESSED&quot;
WAITING_FOR_MY_VERIFICATION | &quot;WAITING_FOR_MY_VERIFICATION&quot;
WAITING_FOR_VERIFICATION | &quot;WAITING_FOR_VERIFICATION&quot;



