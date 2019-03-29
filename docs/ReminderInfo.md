
# ReminderInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstReminderDelay** | **Integer** | Integer which specifies the delay in hours before sending the first reminder.&lt;br&gt;This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.&lt;br&gt;If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.&lt;br&gt;i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Cannot be updated in a PUT |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency at which reminder will be sent until the agreement is completed.&lt;br&gt;If frequency is not provided, the reminder will be sent once (if the agreement is available at the specified time) with the delay based on the firstReminderDelay field and will never repeat again. If the agreement is not available at that time, reminder will not be sent. Cannot be updated in a PUT |  [optional]
**lastSentDate** | [**Date**](Date.md) | The date when the reminder was last sent. Only provided in GET. Cannot be provided in POST request. If provided in POST, it will be ignored. Cannot be updated in a PUT. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**nextSentDate** | [**Date**](Date.md) | The date when the reminder is scheduled to be sent next. When provided in POST request, frequency needs to be ONCE (or not specified), startReminderCounterFrom needs to be REMINDER_CREATION (or not specified) and firstReminderDelay needs to be 0 (or not specified). Cannot be updated in a PUT. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**note** | **String** | An optional message sent to the recipients, describing why their participation is required |  [optional]
**recipientParticipantIds** | **List&lt;String&gt;** | A list of one or more participant IDs that the reminder should be sent to. These must be recipients of the agreement and not sharees or cc&#39;s. |  [optional]
**reminderId** | **String** | An identifier of the reminder resource created on the server. If provided in POST or PUT, it will be ignored |  [optional]
**startReminderCounterFrom** | [**StartReminderCounterFromEnum**](#StartReminderCounterFromEnum) | Reminder can be sent based on when the agreement becomes available or when the reminder is created&lt;br&gt;AGREEMENT_AVAILABILITY: If the agreement is not available to the participant at the time of reminder creation, the reminder will be sent for the first time, only when the agreement becomes available to the participant taking the firstReminderDelay into account. Subsequent reminders will be sent based on the frequency specified.  If the agreement is already available to the participant at the time of reminder creation, the first reminder will be sent after the delay specified by firstReminderDelay from the reminder creation time.&lt;br&gt;REMINDER_CREATION: The first reminder will be sent after the delay specified by firstReminderDelay from the reminder creation time only if the agreement is available at that time. Subsequent reminders will be triggered based on the frequency specified and will be sent only if the agreement is available at that time.  For agreements in authoring state, creating reminder with startReminderCounterFrom as REMINDER_CREATION is not allowed.&lt;br&gt;Note : If firstReminderDelay, frequency and startReminderCounterFrom fields are not specified in POST, reminder will be sent right now if the agreement is available. If agreement is not available, an error will be thrown.  Cannot be updated in a PUT |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the reminder.  The only valid update in a PUT is from ACTIVE to CANCELED.  Must be provided as ACTIVE in a POST. |  [optional]


<a name="FrequencyEnum"></a>
## Enum: FrequencyEnum
Name | Value
---- | -----
DAILY_UNTIL_SIGNED | &quot;DAILY_UNTIL_SIGNED&quot;
WEEKDAILY_UNTIL_SIGNED | &quot;WEEKDAILY_UNTIL_SIGNED&quot;
EVERY_OTHER_DAY_UNTIL_SIGNED | &quot;EVERY_OTHER_DAY_UNTIL_SIGNED&quot;
EVERY_THIRD_DAY_UNTIL_SIGNED | &quot;EVERY_THIRD_DAY_UNTIL_SIGNED&quot;
EVERY_FIFTH_DAY_UNTIL_SIGNED | &quot;EVERY_FIFTH_DAY_UNTIL_SIGNED&quot;
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
CANCELED | &quot;CANCELED&quot;
COMPLETE | &quot;COMPLETE&quot;



