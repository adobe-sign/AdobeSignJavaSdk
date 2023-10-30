
# LibraryDocumentCreationInfoV6

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creatorEmail** | **String** | Email address of the library document creator. It will be ignored in POST/PUT requests |  [optional]
**sharingMode** | [**SharingModeEnum**](#SharingModeEnum) | Specifies who should have access to this library document. GLOBAL sharing is a restricted operation. |  [optional]
**groupId** | **String** | The unique identifier of the group to which the library template belongs to. If not provided during creation, primary group of the creator will be used |  [optional]
**creatorName** | **String** | Name of the library document creator.  It will be ignored in POST/PUT requests |  [optional]
**createdDate** | [**Date**](Date.md) | Date when library document was created. It will be ignored in POST/PUT requests. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**isDocumentRetentionApplied** | **Boolean** | Is document retention applied for this resource.  If provided in POST or PUT, it will simply be ignored. |  [optional]
**templateTypes** | [**List&lt;TemplateTypesEnum&gt;**](#List&lt;TemplateTypesEnum&gt;) | A list of one or more library template types |  [optional]
**lastEventDate** | [**Date**](Date.md) | The date of the last event that occurred for this library document |  [optional]
**modifiedDate** | [**Date**](Date.md) | Date when library document was last modified. It will be ignored in POST/PUT requests. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**name** | **String** | The name of the library template that will be used to identify it, in emails and on the website |  [optional]
**fileInfos** | [**List&lt;FileInfo&gt;**](FileInfo.md) | A list of one or more files (or references to files) that will be used to create the template. If more than one file is provided, they will be combined into one PDF. Note: Only a single parameter in every FileInfo object must be specified |  [optional]
**id** | **String** | The unique identifier that is used to refer to the library template. It will be ignored in POST requests |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the library document. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the library document |  [optional]


<a name="SharingModeEnum"></a>
## Enum: SharingModeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
GROUP | &quot;GROUP&quot;
ACCOUNT | &quot;ACCOUNT&quot;
GLOBAL | &quot;GLOBAL&quot;


<a name="List<TemplateTypesEnum>"></a>
## Enum: List&lt;TemplateTypesEnum&gt;
Name | Value
---- | -----
DOCUMENT | &quot;DOCUMENT&quot;
FORM_FIELD_LAYER | &quot;FORM_FIELD_LAYER&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
ACTIVE | &quot;ACTIVE&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
ACTIVE | &quot;ACTIVE&quot;
REMOVED | &quot;REMOVED&quot;



