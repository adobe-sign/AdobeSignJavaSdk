
# WidgetAdditionalParticipationSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerParticipantSetInfo** | [**ProviderParticipantSetInfo**](ProviderParticipantSetInfo.md) | Represents all the attributes related to the unknown participant and its provider. If it is defined then the participant will be treated as an unknown participant. |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Role assumed by all participants in the set (signer, approver, etc.) Web Form First Participant will only have roles - Signer, Approver, Acceptor and Form Filler |  [optional]
**memberInfos** | [**List&lt;ParticipantSetMemberInfo&gt;**](ParticipantSetMemberInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (email, e.g.) for all the additional participants in the web form. If the email of the participant is unknown at the time of web form creation, the email should be left empty,  |  [optional]
**order** | **Integer** | Index indicating position at which signing group needs to sign. Additional participant to sign at first place is assigned a index of 1. Web Form participant should not have any order specified. Web Form participant should not have any email address and and can not have phone authentication applied. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid, |  [optional]


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



