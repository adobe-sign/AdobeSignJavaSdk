
# LibraryDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creatorEmail** | **String** | Email address of the library document creator. It will be ignored in POST/PUT requests |  [optional]
**id** | **String** | The unique identifier that is used to refer to the library template |  [optional]
**hidden** | **Boolean** | True if Library Document is hidden |  [optional]
**modifiedDate** | [**Date**](Date.md) | The date on which the library document was last modified. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**name** | **String** | The name of the library document |  [optional]
**sharingMode** | [**SharingModeEnum**](#SharingModeEnum) | Specifies who should have access to this library document. GLOBAL sharing mode is not applicable in POST/PUT requests |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the library document |  [optional]
**templateTypes** | [**List&lt;TemplateTypesEnum&gt;**](#List&lt;TemplateTypesEnum&gt;) | A list of one or more library template types |  [optional]


<a name="SharingModeEnum"></a>
## Enum: SharingModeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
GROUP | &quot;GROUP&quot;
ACCOUNT | &quot;ACCOUNT&quot;
GLOBAL | &quot;GLOBAL&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
ACTIVE | &quot;ACTIVE&quot;
REMOVED | &quot;REMOVED&quot;


<a name="List<TemplateTypesEnum>"></a>
## Enum: List&lt;TemplateTypesEnum&gt;
Name | Value
---- | -----
DOCUMENT | &quot;DOCUMENT&quot;
FORM_FIELD_LAYER | &quot;FORM_FIELD_LAYER&quot;



