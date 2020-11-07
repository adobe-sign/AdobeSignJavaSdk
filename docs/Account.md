
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**Date**](Date.md) | Date when the account was created. This is a server generated attributed and can not be provided in POST/PUT calls. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | The provisioned type of the account. This is a server generated attributed and can not be provided in POST/PUT calls. |  [optional]
**name** | **String** | The name which the account is known. This is a server generated attributed and can not be provided in POST/PUT calls.  |  [optional]
**modified** | [**Date**](Date.md) | The last date that the account information was updated. This is a server generated attributed and can not be provided in POST/PUT calls. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**company** | **String** | The company associated with the account. This is a server generated attributed and can not be provided in POST/PUT calls.  |  [optional]
**id** | **String** | Identifier of the account. This is a server generated attributed and can not be provided in POST/PUT calls.  |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
FREE | &quot;FREE&quot;
FREE_LEGACY | &quot;FREE_LEGACY&quot;
TEAM_TRIAL | &quot;TEAM_TRIAL&quot;
TEAM | &quot;TEAM&quot;
TEAM_LEGACY | &quot;TEAM_LEGACY&quot;
ENTERPRISE_TRIAL | &quot;ENTERPRISE_TRIAL&quot;
ENTERPRISE | &quot;ENTERPRISE&quot;
ENTERPRISE_LEGACY | &quot;ENTERPRISE_LEGACY&quot;
GLOBAL_TRIAL | &quot;GLOBAL_TRIAL&quot;
GLOBAL | &quot;GLOBAL&quot;
DEVELOPER | &quot;DEVELOPER&quot;
PRO_DOC_CLOUD | &quot;PRO_DOC_CLOUD&quot;
TEAM_DOC_CLOUD | &quot;TEAM_DOC_CLOUD&quot;
TRIAL_EXPIRED | &quot;TRIAL_EXPIRED&quot;
ANONYMOUS | &quot;ANONYMOUS&quot;
PRO_DOC_CLOUD_MULTI | &quot;PRO_DOC_CLOUD_MULTI&quot;
PRO_PLUS_DOC_CLOUD | &quot;PRO_PLUS_DOC_CLOUD&quot;
PRO_PLUS_DOC_CLOUD_MULTI | &quot;PRO_PLUS_DOC_CLOUD_MULTI&quot;



