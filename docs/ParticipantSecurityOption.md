
# ParticipantSecurityOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationMethod** | [**AuthenticationMethodEnum**](#AuthenticationMethodEnum) | The authentication method for the participants to have access to view and sign the document. When replacing a participant that has PASSWORD or PHONE authentication specified, you must supply a password or phone number for the new participant, and you cannot change the authentication method |  [optional]
**password** | **String** | The password required for the participant to view and sign the document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. The password will not be returned in GET call. When replacing a participant that has PASSWORD authentication specified, you must supply a password for the new participant. |  [optional]
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
GOV_ID | &quot;GOV_ID&quot;



