
# UserGroupInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**SettingsInfo**](SettingsInfo.md) | List of some group membership settings. |  [optional]
**createdDate** | [**Date**](Date.md) | Date group was created |  [optional]
**isGroupAdmin** | **Boolean** | True if user is group admin. |  [optional]
**isPrimaryGroup** | **Boolean** | True if the group is the user&#39;s primary group. |  [optional]
**name** | **String** | Name of the group. This will be ignored as part of PUT call. |  [optional]
**id** | **String** | Unique identifier of the group |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the group membership |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DELETED | &quot;DELETED&quot;



