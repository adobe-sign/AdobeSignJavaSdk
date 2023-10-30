
# DelegatedParticipantSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privateMessage** | **String** | Participant set&#39;s private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call. |  [optional]
**memberInfos** | [**List&lt;DelegatedParticipantInfo&gt;**](DelegatedParticipantInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set |  [optional]



