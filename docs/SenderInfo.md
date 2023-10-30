
# SenderInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**participantId** | **String** |  The unique identifier of the creator of the web form. |  [optional]
**createdDate** | [**Date**](Date.md) | The date when the sender was added. This will be returned as part of GET call but is ignored if passed as part of PUT call. |  [optional]
**hidden** | **Boolean** | True if the web form is hidden for the user that is calling the API. Only returned if self is true. |  [optional]
**name** | **String** | Name of the creator, if available. |  [optional]
**self** | **Boolean** | True if the creator of the web form is the same user that is calling the API. |  [optional]
**company** | **String** | Company of the creator, if available. |  [optional]
**userId** | **String** | The user ID of the sender. This will be returned as part of GET call but is ignored if passed as part of PUT call. |  [optional]
**email** | **String** | Email of the creator of the web form. |  [optional]



