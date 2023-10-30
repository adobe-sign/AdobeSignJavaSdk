
# DetailedParticipantInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdDate** | [**Date**](Date.md) | The date when the participant was added. This will be returned as part of GET call but is ignored if passed as part of PUT call. |  [optional]
**hidden** | **Boolean** | True if the agreement is hidden for the user that is calling the API. Only returned if self is true. Ignored (not required) if modifying a participant (PUT). |  [optional]
**name** | **String** | The name of the participant, if available. This cannot be changed as part of the PUT call. |  [optional]
**self** | **Boolean** | True if this participant is the same user that is calling the API. Returned as part of Get. Ignored (not required) if modifying a participant set (PUT). |  [optional]
**company** | **String** | The company of the participant, if available. This cannot be changed as part of the PUT call. |  [optional]
**id** | **String** | The unique identifier of the participant. This will be returned as part of Get call but is not mandatory to be passed as part of PUT call for agreements/{id}/members/participantSets/{id}. |  [optional]
**userId** | **String** | The user ID of the participant. This will be returned as part of GET call but is ignored if passed as part of PUT call. |  [optional]
**email** | **String** | Email of the participant. In case of modifying a participant set (PUT) this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow (legacy agreements) that were created using fax as input |  [optional]
**securityOption** | [**ParticipantSecurityOption**](ParticipantSecurityOption.md) | Security options that apply to the participant. |  [optional]



