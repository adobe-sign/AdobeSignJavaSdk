
# ParticipantSetInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The unique label of a participant set.&lt;br&gt;For custom workflows, label specified in the participation set should map it to the participation step in the custom workflow. |  [optional]
**memberInfos** | [**List&lt;ParticipantSetMemberInfo&gt;**](ParticipantSetMemberInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set |  [optional]
**name** | **String** | Name of the participant set (it can be empty, but needs not to be unique in a single agreement). Maximum no of characters in participant set name is restricted to 255 |  [optional]
**order** | **Integer** | Index indicating position at which signing group needs to sign. Signing group to sign at first place is assigned a 1 index. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid. No signingOrder should be specified for SHARE role |  [optional]
**privateMessage** | **String** | Participant set&#39;s private message - all participants in the set will receive the same message |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Role assumed by all participants in the set (signer, approver etc.) |  [optional]
**visiblePages** | **List&lt;String&gt;** | When you enable limited document visibility (documentVisibilityEnabled), you can specify which file (fileInfo) should be made visible to which specific participant set.&lt;br&gt;Specify one or more label values of a fileInfos element.&lt;br&gt;Each signer participant sets must contain at least one required signature field in at least one visible file included in this API call; if not a page with a signature field is automatically appended for any missing participant sets. If there is a possibility that one or more participant sets do not have a required signature field in the files included in the API call, all signer participant sets should include a special index value of &#39;0&#39; to make this automatically appended signature page visible to the signer. Not doing so may result in an error. For all other roles, you may omit this value to exclude this page. |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
SIGNER | &quot;SIGNER&quot;
APPROVER | &quot;APPROVER&quot;
ACCEPTOR | &quot;ACCEPTOR&quot;
CERTIFIED_RECIPIENT | &quot;CERTIFIED_RECIPIENT&quot;
FORM_FILLER | &quot;FORM_FILLER&quot;
DELEGATE_TO_SIGNER | &quot;DELEGATE_TO_SIGNER&quot;
DELEGATE_TO_APPROVER | &quot;DELEGATE_TO_APPROVER&quot;
DELEGATE_TO_ACCEPTOR | &quot;DELEGATE_TO_ACCEPTOR&quot;
DELEGATE_TO_CERTIFIED_RECIPIENT | &quot;DELEGATE_TO_CERTIFIED_RECIPIENT&quot;
DELEGATE_TO_FORM_FILLER | &quot;DELEGATE_TO_FORM_FILLER&quot;
SHARE | &quot;SHARE&quot;



