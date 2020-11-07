
# FormFieldHyperlink

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**linkType** | [**LinkTypeEnum**](#LinkTypeEnum) | Type of link in an agreement. |  [optional]
**documentLocation** | [**FormFieldLocation**](FormFieldLocation.md) | Location on the document pointed by the link in case of INTERNAL type link |  [optional]
**url** | **String** | URL, in case of EXTERNAL type link |  [optional]


<a name="LinkTypeEnum"></a>
## Enum: LinkTypeEnum
Name | Value
---- | -----
INTERNAL | &quot;INTERNAL&quot;
EXTERNAL | &quot;EXTERNAL&quot;
FROM_TEXT | &quot;FROM_TEXT&quot;



