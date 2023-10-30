
# MegasignEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**Date**](Date.md) | The date of the audit event. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**initiatingUserName** | **String** | Full name of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect |  [optional]
**description** | **String** | A description of the audit event |  [optional]
**actingUserName** | **String** | The name of the acting user |  [optional]
**actingUserIpAddress** | **String** | The IP address of the user that created the event |  [optional]
**participantEmail** | **String** | Email address of the user that is the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of MegaSign event |  [optional]
**participantRole** | [**ParticipantRoleEnum**](#ParticipantRoleEnum) | Role assumed by all participants in the participant set the participant belongs to (signer, approver etc.). |  [optional]
**vaultEventId** | **String** | The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null) |  [optional]
**participantId** | **String** | The unique identifier of the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to |  [optional]
**versionId** | **String** | An ID which uniquely identifies the version of the document associated with this audit event |  [optional]
**actingUserEmail** | **String** | Email address of the user that created the event |  [optional]
**devicePhoneNumber** | **String** | Phone number from the device used when the participation is completed on a mobile phone |  [optional]
**initiatingUserEmail** | **String** | Email address of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect |  [optional]
**digitalSignatureInfo** | [**DigitalSignatureInfo**](DigitalSignatureInfo.md) | This is present for ESIGNED events when the participation is signed digitally |  [optional]
**vaultProviderName** | **String** | Name of the vault provider for the vault event (if vaulted, otherwise null) |  [optional]
**comment** | **String** | The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant |  [optional]
**id** | **String** | The identifier for the event. |  [optional]
**synchronizationId** | **String** | A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null) |  [optional]
**deviceLocation** | [**DeviceLocation**](DeviceLocation.md) | Location of the device that generated the event (This value may be null due to limited privileges) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AUTO_CANCELLED_CONVERSION_PROBLEM | &quot;AUTO_CANCELLED_CONVERSION_PROBLEM&quot;
CREATED | &quot;CREATED&quot;
EXPIRED | &quot;EXPIRED&quot;
EMAIL_BOUNCED | &quot;EMAIL_BOUNCED&quot;
RECALLED | &quot;RECALLED&quot;
SHARED | &quot;SHARED&quot;
READY_TO_VAULT | &quot;READY_TO_VAULT&quot;
VAULTED | &quot;VAULTED&quot;


<a name="ParticipantRoleEnum"></a>
## Enum: ParticipantRoleEnum
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
SHARE | &quot;SHARE&quot;
SENDER | &quot;SENDER&quot;



