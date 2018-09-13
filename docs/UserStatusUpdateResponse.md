
# UserStatusUpdateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | The result of the attempt to activate or deactivate the user |  [optional]
**message** | **String** | String result message if there was no error |  [optional]
**state** | [**StateEnum**](#StateEnum) | A status value showing the result of this operation |  [optional]


<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
ALREADY_ACTIVE | &quot;ALREADY_ACTIVE&quot;
ALREADY_INACTIVE | &quot;ALREADY_INACTIVE&quot;
OK | &quot;OK&quot;
RESET_PASSWORD_WORKFLOW_INITIATED | &quot;RESET_PASSWORD_WORKFLOW_INITIATED&quot;
SET_PASSWORD_WORKFLOW_INITIATED | &quot;SET_PASSWORD_WORKFLOW_INITIATED&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
CREATED | &quot;CREATED&quot;
PENDING | &quot;PENDING&quot;
UNVERIFIED | &quot;UNVERIFIED&quot;



