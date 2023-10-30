
# DetailedUserInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastName** | **String** | The last name of the user |  [optional]
**initials** | **String** | The initials of the user |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of account to which the user belongs (null if no account). If provided in POST or PUT it will be ignored. |  [optional]
**locale** | **String** | The UI locale of the user |  [optional]
**title** | **String** | The job title of the user |  [optional]
**accountId** | **String** | The account id of the user |  [optional]
**firstName** | **String** | The first name of the user |  [optional]
**isAccountAdmin** | **Boolean** | True if the user is account admin |  [optional]
**createdDate** | [**Date**](Date.md) | The date the user was created. If provided in POST or PUT it will be ignored |  [optional]
**phone** | **String** | The phone number of the user |  [optional]
**primaryGroupId** | **String** | Primary group in which the new user should be added. Default is the default group for the account the user is being added to. This will be ignored as part of PUT calls |  [optional]
**company** | **String** | The name of company of the user |  [optional]
**id** | **String** | A unique identifier of the user resource for REST APIs as issued by Sign. |  [optional]
**email** | **String** | The email address of the user |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the user. If provided in POST it will be ignored. |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
FREE | &quot;FREE&quot;
PRO | &quot;PRO&quot;
TEAM | &quot;TEAM&quot;
TEAM_TRIAL | &quot;TEAM_TRIAL&quot;
ENTERPRISE | &quot;ENTERPRISE&quot;
ENTERPRISE_TRIAL | &quot;ENTERPRISE_TRIAL&quot;
GLOBAL | &quot;GLOBAL&quot;
GLOBAL_TRIAL | &quot;GLOBAL_TRIAL&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
CREATED | &quot;CREATED&quot;
UNVERIFIED | &quot;UNVERIFIED&quot;



