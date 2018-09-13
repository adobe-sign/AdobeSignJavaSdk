
# AgreementEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actingUserEmail** | **String** | Email address of the user that created the event |  [optional]
**actingUserIpAddress** | **String** | The IP address of the user that created the event |  [optional]
**actingUserName** | **String** | The name of the acting user |  [optional]
**comment** | **String** | The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant |  [optional]
**date** | [**Date**](Date.md) | The date of the audit event. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**description** | **String** | A description of the audit event |  [optional]
**deviceLocation** | [**DeviceLocation**](DeviceLocation.md) | Location of the device that generated the event (This value may be null due to limited privileges) |  [optional]
**devicePhoneNumber** | **String** | Phone number from the device used when the participation is completed on a mobile phone |  [optional]
**digitalSignatureInfo** | [**DigitalSignatureInfo**](DigitalSignatureInfo.md) | This is present for ESIGNED events when the participation is signed digitally |  [optional]
**initiatingUserEmail** | **String** | Email address of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect |  [optional]
**initiatingUserName** | **String** | Full name of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect |  [optional]
**participantEmail** | **String** | Email address of the user that is the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to |  [optional]
**participantId** | **String** | The unique identifier of the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to |  [optional]
**participantRole** | [**ParticipantRoleEnum**](#ParticipantRoleEnum) | Role assumed by all participants in the participant set the participant belongs to (signer, approver etc.). |  [optional]
**synchronizationId** | **String** | A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of agreement event |  [optional]
**vaultEventId** | **String** | The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null) |  [optional]
**vaultProviderName** | **String** | Name of the vault provider for the vault event (if vaulted, otherwise null) |  [optional]
**versionId** | **String** | An ID which uniquely identifies the version of the document associated with this audit event |  [optional]


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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCESS_CODE_GENERATED | &quot;ACCESS_CODE_GENERATED&quot;
ACCESS_CODE_CONSUMED | &quot;ACCESS_CODE_CONSUMED&quot;
AUTO_CANCELLED_CONVERSION_PROBLEM | &quot;AUTO_CANCELLED_CONVERSION_PROBLEM&quot;
ACTION_AUTO_DELEGATED | &quot;ACTION_AUTO_DELEGATED&quot;
ACTION_COMPLETED | &quot;ACTION_COMPLETED&quot;
ACTION_COMPLETED_HOSTED | &quot;ACTION_COMPLETED_HOSTED&quot;
ACTION_COMPLETED_OFFLINE | &quot;ACTION_COMPLETED_OFFLINE&quot;
ACTION_COMPLETED_OFFLINE_HOSTED | &quot;ACTION_COMPLETED_OFFLINE_HOSTED&quot;
ACTION_COMPLETED_WIDGET_VERIFIED | &quot;ACTION_COMPLETED_WIDGET_VERIFIED&quot;
ACTION_COMPLETED_WIDGET_VERIFIED_API_TOKEN | &quot;ACTION_COMPLETED_WIDGET_VERIFIED_API_TOKEN&quot;
ACTION_COMPLETED_WIDGET_VERIFICATION_WAIVED | &quot;ACTION_COMPLETED_WIDGET_VERIFICATION_WAIVED&quot;
ACTION_DELEGATED | &quot;ACTION_DELEGATED&quot;
ACTION_REPLACED_SIGNER | &quot;ACTION_REPLACED_SIGNER&quot;
ACTION_REQUESTED | &quot;ACTION_REQUESTED&quot;
CREATED | &quot;CREATED&quot;
CREATED_FROM_WIDGET | &quot;CREATED_FROM_WIDGET&quot;
CREATED_OFFLINE | &quot;CREATED_OFFLINE&quot;
CREATED_VIA_UPLOAD | &quot;CREATED_VIA_UPLOAD&quot;
CREATED_VIA_ACROBAT | &quot;CREATED_VIA_ACROBAT&quot;
CREATED_VIA_READER | &quot;CREATED_VIA_READER&quot;
ACTIVATED | &quot;ACTIVATED&quot;
DIGITAL_SIGN_UIDAI_SIGNER_CONSENT | &quot;DIGITAL_SIGN_UIDAI_SIGNER_CONSENT&quot;
DIGSIGNED | &quot;DIGSIGNED&quot;
DEACTIVATED | &quot;DEACTIVATED&quot;
DOCUMENTS_DELETED | &quot;DOCUMENTS_DELETED&quot;
DOWNLOADED | &quot;DOWNLOADED&quot;
EMAIL_BOUNCED | &quot;EMAIL_BOUNCED&quot;
EMAIL_VIEWED | &quot;EMAIL_VIEWED&quot;
EXPIRED | &quot;EXPIRED&quot;
EXPIRED_AUTOMATICALLY | &quot;EXPIRED_AUTOMATICALLY&quot;
FAXED_BY_SENDER | &quot;FAXED_BY_SENDER&quot;
FAXIN_RECEIVED | &quot;FAXIN_RECEIVED&quot;
KBA_AUTHENTICATED | &quot;KBA_AUTHENTICATED&quot;
MODIFIED | &quot;MODIFIED&quot;
OFFLINE_SYNC | &quot;OFFLINE_SYNC&quot;
OTHER | &quot;OTHER&quot;
PAID | &quot;PAID&quot;
PRESIGNED | &quot;PRESIGNED&quot;
RECALLED | &quot;RECALLED&quot;
RECALLED_MAX_SIGNING_KBA_ATTEMPTS | &quot;RECALLED_MAX_SIGNING_KBA_ATTEMPTS&quot;
RECALLED_MAX_SIGNING_PASSWORD_ATTEMPTS | &quot;RECALLED_MAX_SIGNING_PASSWORD_ATTEMPTS&quot;
RECALLED_MAX_SIGNING_PHONE_ATTEMPTS | &quot;RECALLED_MAX_SIGNING_PHONE_ATTEMPTS&quot;
REJECTED | &quot;REJECTED&quot;
SENDER_CREATED_NEW_REVISION | &quot;SENDER_CREATED_NEW_REVISION&quot;
SHARED | &quot;SHARED&quot;
SIGNED | &quot;SIGNED&quot;
SIGNING_URL_REQUESTED | &quot;SIGNING_URL_REQUESTED&quot;
UPLOADED_BY_SENDER | &quot;UPLOADED_BY_SENDER&quot;
USER_ACK_AGREEMENT_MODIFIED | &quot;USER_ACK_AGREEMENT_MODIFIED&quot;
VAULTED | &quot;VAULTED&quot;
WEB_IDENTITY_AUTHENTICATED | &quot;WEB_IDENTITY_AUTHENTICATED&quot;
WEB_IDENTITY_SPECIFIED | &quot;WEB_IDENTITY_SPECIFIED&quot;
WRITTEN_DOWNLOAD | &quot;WRITTEN_DOWNLOAD&quot;
WRITTEN_SIGNED | &quot;WRITTEN_SIGNED&quot;



