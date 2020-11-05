
# DetailedParticipantSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | Role assumed by all participants in the set (signer, approver etc.). |  [optional]
**name** | **String** | Name of ParticipantSet (it can be empty, but needs not to be unique in a single megaSign). Maximum no of characters in participant set name is restricted to 255. |  [optional]
**id** | **String** | The unique identifier of the participant set. |  [optional]
**privateMessage** | **String** | Participant set&#39;s private message - all participants in the set will receive the same message. |  [optional]
**memberInfos** | [**List&lt;DetailedParticipantInfo&gt;**](DetailedParticipantInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set |  [optional]
**order** | **Integer** | Index indicating sequential signing group (specified for hybrid routing). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The megaSign status with respect to the participant set. |  [optional]


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



