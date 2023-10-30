
# WorkflowLibraryDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateTypes** | [**List&lt;TemplateTypesEnum&gt;**](#List&lt;TemplateTypesEnum&gt;) | A list of one or more library template types |  [optional]
**sharingMode** | [**SharingModeEnum**](#SharingModeEnum) | Specifies who should have access to this library document. GLOBAL sharing is a restricted operation. |  [optional]
**modifiedDate** | [**Date**](Date.md) | The date on which the library document was last modified. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**workflowLibDoc** | **String** | An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request |  [optional]
**label** | **String** | A display text for this form for workflow users |  [optional]


<a name="List<TemplateTypesEnum>"></a>
## Enum: List&lt;TemplateTypesEnum&gt;
Name | Value
---- | -----
DOCUMENT | &quot;DOCUMENT&quot;
FORM_FIELD_LAYER | &quot;FORM_FIELD_LAYER&quot;


<a name="SharingModeEnum"></a>
## Enum: SharingModeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
GROUP | &quot;GROUP&quot;
ACCOUNT | &quot;ACCOUNT&quot;
GLOBAL | &quot;GLOBAL&quot;



