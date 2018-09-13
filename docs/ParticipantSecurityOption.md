
# ParticipantSecurityOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationMethod** | [**AuthenticationMethodEnum**](#AuthenticationMethodEnum) | The authentication method for the participants to have access to view and sign the document |  [optional]
**password** | **String** | The password required for the participant to view and sign the document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. The password will not be returned in GET call. In case of PUT call, password associated with Agreement resource will remain unchanged if no password is specified but authentication method is provided as PASSWORD |  [optional]
**phoneInfo** | [**PhoneInfo**](PhoneInfo.md) | The phoneInfo required for the participant to view and sign the document |  [optional]


<a name="AuthenticationMethodEnum"></a>
## Enum: AuthenticationMethodEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
PASSWORD | &quot;PASSWORD&quot;
PHONE | &quot;PHONE&quot;
KBA | &quot;KBA&quot;
WEB_IDENTITY | &quot;WEB_IDENTITY&quot;
ADOBE_SIGN | &quot;ADOBE_SIGN&quot;



