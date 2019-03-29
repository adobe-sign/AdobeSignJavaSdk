
# SendOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionEmails** | [**CompletionEmailsEnum**](#CompletionEmailsEnum) | Control notification mails for agreement completion events - COMPLETED, CANCELLED, EXPIRED and REJECTED |  [optional]
**inFlightEmails** | [**InFlightEmailsEnum**](#InFlightEmailsEnum) | Control notification mails for agreement-in-process events - DELEGATED, REPLACED |  [optional]
**initEmails** | [**InitEmailsEnum**](#InitEmailsEnum) | Control notification mails for Agreement initiation events - ACTION_REQUESTED and CREATED |  [optional]


<a name="CompletionEmailsEnum"></a>
## Enum: CompletionEmailsEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
NONE | &quot;NONE&quot;


<a name="InFlightEmailsEnum"></a>
## Enum: InFlightEmailsEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
NONE | &quot;NONE&quot;


<a name="InitEmailsEnum"></a>
## Enum: InitEmailsEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
NONE | &quot;NONE&quot;



