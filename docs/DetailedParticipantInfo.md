
# DetailedParticipantInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | **String** | The company of the participant, if available. This cannot be changed as part of the PUT call. |  [optional]
**email** | **String** | Email of the participant. In case of modifying a participant set (PUT) this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow (legacy agreements) that were created using fax as input |  [optional]
**fax** | **String** | Fax of the participant. New Agreements can not be created with fax option. This is only returned for legacy agreements created with fax as participants |  [optional]
**id** | **String** | The unique identifier of the participant. This will be returned as part of Get call but is not mandatory to be passed as part of PUT call for agreements/{id}/members/participantSets/{id}. |  [optional]
**name** | **String** | The name of the participant, if available. This cannot be changed as part of the PUT call. |  [optional]
**privateMessage** | **String** | The private message of the participant, if available. This cannot be changed as part of the PUT call. |  [optional]
**securityOption** | [**ParticipantSecurityOption**](ParticipantSecurityOption.md) | Security options that apply to the participant. |  [optional]
**self** | **Boolean** | True if this participant is the same user that is calling the API. Returned as part of Get. Ignored (not required) if modifying a participant set (PUT). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the participant. This cannot be changed as part of the PUT call. New participants will be ignored if added with a REPLACED status. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
REPLACED | &quot;REPLACED&quot;
ACTIVE | &quot;ACTIVE&quot;



