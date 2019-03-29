
# DetailedParticipantSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of the participant set. This cannot be changed as part of the PUT call. |  [optional]
**memberInfos** | [**List&lt;DetailedParticipantInfo&gt;**](DetailedParticipantInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set |  [optional]
**name** | **String** | Name of ParticipantSet (it can be empty, but needs not to be unique in a single agreement). Maximum no of characters in participant set name is restricted to 255. This cannot be changed as part of the PUT call. |  [optional]
**order** | **Integer** | Index indicating sequential signing group (specified for hybrid routing). This cannot be changed as part of the PUT call. |  [optional]
**privateMessage** | **String** | Participant set&#39;s private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call. |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Role assumed by all participants in the set (signer, approver etc.). This cannot be changed as part of the PUT call. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The agreement status with respect to the participant set. This cannot be changed as part of the PUT call. |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
SIGNER | &quot;SIGNER&quot;
SENDER | &quot;SENDER&quot;
APPROVER | &quot;APPROVER&quot;
ACCEPTOR | &quot;ACCEPTOR&quot;
CERTIFIED_RECIPIENT | &quot;CERTIFIED_RECIPIENT&quot;
FORM_FILLER | &quot;FORM_FILLER&quot;
DELEGATE_TO_SIGNER | &quot;DELEGATE_TO_SIGNER&quot;
DELEGATE_TO_APPROVER | &quot;DELEGATE_TO_APPROVER&quot;
DELEGATE_TO_ACCEPTOR | &quot;DELEGATE_TO_ACCEPTOR&quot;
DELEGATE_TO_CERTIFIED_RECIPIENT | &quot;DELEGATE_TO_CERTIFIED_RECIPIENT&quot;
DELEGATE_TO_FORM_FILLER | &quot;DELEGATE_TO_FORM_FILLER&quot;
SHARE | &quot;SHARE&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;
EXPIRED | &quot;EXPIRED&quot;
NOT_YET_VISIBLE | &quot;NOT_YET_VISIBLE&quot;
WAITING_FOR_OTHERS | &quot;WAITING_FOR_OTHERS&quot;
WAITING_FOR_MY_APPROVAL | &quot;WAITING_FOR_MY_APPROVAL&quot;
WAITING_FOR_AUTHORING | &quot;WAITING_FOR_AUTHORING&quot;
WAITING_FOR_MY_ACKNOWLEDGEMENT | &quot;WAITING_FOR_MY_ACKNOWLEDGEMENT&quot;
WAITING_FOR_MY_ACCEPTANCE | &quot;WAITING_FOR_MY_ACCEPTANCE&quot;
WAITING_FOR_MY_FORM_FILLING | &quot;WAITING_FOR_MY_FORM_FILLING&quot;
WAITING_FOR_MY_DELEGATION | &quot;WAITING_FOR_MY_DELEGATION&quot;
WAITING_FOR_MY_SIGNATURE | &quot;WAITING_FOR_MY_SIGNATURE&quot;
WAITING_FOR_MY_VERIFICATION | &quot;WAITING_FOR_MY_VERIFICATION&quot;
WAITING_FOR_PREFILL | &quot;WAITING_FOR_PREFILL&quot;



