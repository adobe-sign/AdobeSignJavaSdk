
# WidgetParticipantSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberInfos** | [**List&lt;ParticipantSetMemberInfo&gt;**](ParticipantSetMemberInfo.md) | Array of ParticipantInfo objects, containing participant - specific data (email, e.g.). All participants in the array belong to the same set. Currently we are supporting only one member in the set. Since the email of the widget signer is unknown at the time of widget creation, the email should be left empty and its optional security options should be provided.  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Role assumed by all participants in the set (signer, approver, etc.) Widget First Participant will only have roles - Signer, Approver, Acceptor and Form Filler |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
SIGNER | &quot;SIGNER&quot;
DELEGATE_TO_SIGNER | &quot;DELEGATE_TO_SIGNER&quot;
APPROVER | &quot;APPROVER&quot;
DELEGATE_TO_APPROVER | &quot;DELEGATE_TO_APPROVER&quot;
ACCEPTOR | &quot;ACCEPTOR&quot;
DELEGATE_TO_ACCEPTOR | &quot;DELEGATE_TO_ACCEPTOR&quot;
FORM_FILLER | &quot;FORM_FILLER&quot;
DELEGATE_TO_FORM_FILLER | &quot;DELEGATE_TO_FORM_FILLER&quot;
CERTIFIED_RECIPIENT | &quot;CERTIFIED_RECIPIENT&quot;
DELEGATE_TO_CERTIFIED_RECIPIENT | &quot;DELEGATE_TO_CERTIFIED_RECIPIENT&quot;



