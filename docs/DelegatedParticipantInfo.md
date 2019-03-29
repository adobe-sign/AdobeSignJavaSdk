
# DelegatedParticipantInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Email of the participant. In case of modifying a participant set (PUT) this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow (legacy agreements) that were created using fax as input |  [optional]
**securityOption** | [**DelegatedParticipantSecurityOption**](DelegatedParticipantSecurityOption.md) | Security options that apply to the participant. |  [optional]



