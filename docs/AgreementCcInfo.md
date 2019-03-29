
# AgreementCcInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Email of the CC participant of the agreement |  [optional]
**label** | **String** | Label of the CC list as returned in workflow description |  [optional]
**visiblePages** | **List&lt;String&gt;** | When you enable limited document visibility (documentVisibilityEnabled), you can specify which file (fileInfo) should be made visible to which specific participant set.&lt;br&gt;Specify one or more label values of a fileInfos element.&lt;br&gt;Each signer participant sets must contain at least one required signature field in at least one visible file included in this API call; if not a page with a signature field is automatically appended for any missing participant sets. If there is a possibility that one or more participant sets do not have a required signature field in the files included in the API call, all signer participant sets should include a special index value of &#39;0&#39; to make this automatically appended signature page visible to the signer. Not doing so may result in an error. For all other roles, you may omit this value to exclude this page. |  [optional]



