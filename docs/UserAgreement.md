
# UserAgreement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hidden** | **Boolean** | True if agreement is hidden for the user |  [optional]
**displayDate** | [**Date**](Date.md) | The display date for the agreement. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**groupId** | **String** | Unique identifier of the group |  [optional]
**esign** | **Boolean** | True if this is an e-sign document |  [optional]
**name** | **String** | Name of the Agreement |  [optional]
**displayParticipantSetInfos** | [**List&lt;DisplayParticipantSetInfo&gt;**](DisplayParticipantSetInfo.md) | The most relevant current user set for the agreement. It is typically the next signer if the agreement is from the current user, or the sender if received from another user |  [optional]
**latestVersionId** | **String** | A version ID which uniquely identifies the current version of the agreement |  [optional]
**id** | **String** | The unique identifier of the agreement.If provided in POST, it will simply be ignored |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The kind of agreement |  [optional]
**parentId** | **String** | The parent id of a megaSign child *OR* the originating id of a widget agreement instance |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | This is a server generated attribute which provides the detailed status of an agreement with respect to the apiCaller |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AGREEMENT | &quot;AGREEMENT&quot;
MEGASIGN_CHILD | &quot;MEGASIGN_CHILD&quot;
WIDGET_INSTANCE | &quot;WIDGET_INSTANCE&quot;


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



