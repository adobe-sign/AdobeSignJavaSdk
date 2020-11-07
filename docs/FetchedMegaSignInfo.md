
# FetchedMegaSignInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstReminderDelay** | **Integer** | Integer which specifies the delay in hours before sending the first reminder.&lt;br&gt;This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.&lt;br&gt;If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.&lt;br&gt;i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Cannot be updated in a PUT |  [optional]
**groupId** | **String** | The unique identifier of the group to which the megasign agreement will belong to when it is created. If it is not provided during agreement creation the primary group of the creator will be used |  [optional]
**childAgreementsInfo** | [**ChildAgreementsInfo**](ChildAgreementsInfo.md) | Info corresponding to each child agreement of the megaSign  |  [optional]
**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) | Specifies the type of signature you would like to request - written or e-signature. The possible values are &lt;br&gt; ESIGN : Agreement needs to be signed electronically &lt;br&gt;, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system |  [optional]
**externalId** | [**ExternalId**](ExternalId.md) | An arbitrary value from your system, which can be specified at sending time and then later returned or queried |  [optional]
**locale** | **String** | The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender |  [optional]
**message** | **String** | An optional message to the participants, describing what is being sent or why their signature is required |  [optional]
**vaultingInfo** | [**VaultingInfo**](VaultingInfo.md) | Vaulting properties that allows Adobe Sign to securely store documents with a vault provider |  [optional]
**securityOption** | [**MegaSignSecurityOption**](MegaSignSecurityOption.md) | Optional security parameters for the megasign |  [optional]
**postSignOption** | [**PostSignOption**](PostSignOption.md) | URL and associated properties for the success page the user will be taken to after completing the signing process |  [optional]
**reminderFrequency** | [**ReminderFrequencyEnum**](#ReminderFrequencyEnum) | Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used |  [optional]
**ccs** | [**List&lt;MegaSignCcInfo&gt;**](MegaSignCcInfo.md) | A list of one or more CCs that will be copied in the megasign transaction. The CCs will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file  |  [optional]
**createdDate** | [**Date**](Date.md) | Date when megasign was created. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**isDocumentRetentionApplied** | **Boolean** | Is document retention applied for this resource.  If provided in POST or PUT, it will simply be ignored. |  [optional]
**expirationTime** | [**Date**](Date.md) | Time after which Agreement expires and needs to be signed before it. Format should be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time. Should not be provided in offline agreement creation. |  [optional]
**lastEventDate** | [**Date**](Date.md) | The date of the last event that occurred for this megasign.  Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**senderEmail** | **String** | Email of agreement sender. Only provided in GET. Can not be provided in POST/PUT request. If provided in POST/PUT, it will be ignored |  [optional]
**name** | **String** | The name of the agreement that will be used to identify it, in emails, website and other places |  [optional]
**numChildren** | **Integer** | The total number of MegaSign children associated with the MegaSign parent. If provided in POST, it will be ignored. If modified in PUT, it will throw error MODIFYING_IMMUTABLE_FIELDS |  [optional]
**fileInfos** | [**List&lt;FileInfo&gt;**](FileInfo.md) | A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified |  [optional]
**id** | **String** | The unique identifier of megasign  |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the Megasign |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Megasign |  [optional]


<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum
Name | Value
---- | -----
ESIGN | &quot;ESIGN&quot;
WRITTEN | &quot;WRITTEN&quot;


<a name="ReminderFrequencyEnum"></a>
## Enum: ReminderFrequencyEnum
Name | Value
---- | -----
DAILY_UNTIL_SIGNED | &quot;DAILY_UNTIL_SIGNED&quot;
WEEKDAILY_UNTIL_SIGNED | &quot;WEEKDAILY_UNTIL_SIGNED&quot;
EVERY_OTHER_DAY_UNTIL_SIGNED | &quot;EVERY_OTHER_DAY_UNTIL_SIGNED&quot;
EVERY_THIRD_DAY_UNTIL_SIGNED | &quot;EVERY_THIRD_DAY_UNTIL_SIGNED&quot;
EVERY_FIFTH_DAY_UNTIL_SIGNED | &quot;EVERY_FIFTH_DAY_UNTIL_SIGNED&quot;
WEEKLY_UNTIL_SIGNED | &quot;WEEKLY_UNTIL_SIGNED&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PROCESS | &quot;IN_PROCESS&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
IN_PROCESS | &quot;IN_PROCESS&quot;
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;
EXPIRED | &quot;EXPIRED&quot;
PREFILL | &quot;PREFILL&quot;



