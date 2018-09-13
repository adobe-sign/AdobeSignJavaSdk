
# DetailedWidgetParticipantSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of the participant set. This cannot be changed as part of the PUT call. |  [optional]
**memberInfos** | [**List&lt;DetailedParticipantInfo&gt;**](DetailedParticipantInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set |  [optional]
**order** | **Integer** | Index indicating sequential signing group (specified for hybrid routing). This cannot be changed as part of the PUT call. |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Role assumed by all participants in the set (signer, approver etc.). This cannot be changed as part of the PUT call. |  [optional]


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



