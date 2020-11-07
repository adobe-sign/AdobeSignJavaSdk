
# PersonalizedSigningViewConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | Comment describing how the API caller established the signer&#39;s identity - will appear in the audit trail |  [optional]
**expiration** | [**Date**](Date.md) | Expiration date for the personalization of this web form. After this date, the identity of the signer will not be assumed by Adobe Sign. Format should be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2022-02-25T18:46:19Z represents UTC time |  [optional]
**email** | **String** | The email address of the person who will be receiving this web form |  [optional]
**reusable** | **Boolean** | Should the intended signer be allowed to sign this web form more than once |  [optional]



