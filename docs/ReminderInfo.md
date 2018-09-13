
# ReminderInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstReminderDelay** | **Integer** | Integer which specifies the delay in hours before sending the first reminder.&lt;br&gt;This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.&lt;br&gt;If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.&lt;br&gt;i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency at which reminder will be sent until the agreement is signed.&lt;br&gt;If frequency is not provided, the reminder will be sent once (if the agreement is available at the specified time) with the delay based on the firstReminderDelay field and will never repeat again. If the agreement is not available at that time, reminder will not be sent |  [optional]
**lastSentDate** | [**Date**](Date.md) | The date when the reminder was last sent. Only provided in GET. Cannot be provided in POST request. If provided in POST, it will be ignored. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**nextSentDate** | [**Date**](Date.md) | The date when the reminder is scheduled to be sent next. Only provided in GET. Cannot be provided in POST request. If provided in POST, it will be ignored. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**note** | **String** | An optional message sent to the recipients, describing why their signatures are required |  [optional]
**recipientParticipantIds** | **List&lt;String&gt;** | A list of one or more participant IDs to create the reminder on. The reminder will be sent to all the participants specified by the list of participant IDs. |  [optional]
**reminderId** | **String** | An identifier of the reminder resource created on the server. Only provided in GET. Cannot be provided in POST request. If provided in POST, it will be ignored |  [optional]
**startReminderCounterFrom** | [**StartReminderCounterFromEnum**](#StartReminderCounterFromEnum) | Reminder can be sent based on when the agreement becomes available or when the reminder is created&lt;br&gt;&lt;b&gt;AGREEMENT_AVAILABILITY :&lt;/b&gt;&lt;br&gt;If the agreement is not available to the participantSet at the time of reminder creation, the reminder will be sent for the first time, only when the agreement becomes available to the participantSet taking the firstReminderDelay into account. Subsequent reminders will be sent based on the frequency specified.&lt;br&gt;If the agreement is already available to the participantSet at the time of reminder creation, the first reminder will be sent after the delay specified by firstReminderDelay from the reminder creation time.&lt;br&gt;&lt;br&gt;&lt;b&gt;REMINDER_CREATION :&lt;/b&gt;&lt;br&gt;The first reminder will be sent after the delay specified by firstReminderDelay from the reminder creation time only if the agreement is available at that time. Subsequent reminders will be triggered based on the frequency specified and will be sent only if the agreement is available at that time.&lt;br&gt;For agreements in authoring state, creating reminder with startReminderCounterFrom as REMINDER_CREATION is not allowed.&lt;br&gt;Note : If firstReminderDelay, frequency and startReminderCounterFrom fields are not specified, reminder will be sent right now if the agreement is available. If agreement is not available, an error will be thrown. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the reminder |  [optional]


<a name="FrequencyEnum"></a>
## Enum: FrequencyEnum
Name | Value
---- | -----
DAILY_UNTIL_SIGNED | &quot;DAILY_UNTIL_SIGNED&quot;
WEEKLY_UNTIL_SIGNED | &quot;WEEKLY_UNTIL_SIGNED&quot;
ONCE | &quot;ONCE&quot;


<a name="StartReminderCounterFromEnum"></a>
## Enum: StartReminderCounterFromEnum
Name | Value
---- | -----
AGREEMENT_AVAILABILITY | &quot;AGREEMENT_AVAILABILITY&quot;
REMINDER_CREATION | &quot;REMINDER_CREATION&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;



