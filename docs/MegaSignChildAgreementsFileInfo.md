
# MegaSignChildAgreementsFileInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transientDocumentId** | **String** | Transient id of the input file which contains participantSetsInfos. Currently only csv format is suppported. More details about CSV format &lt;a href&#x3D;&#39;https://www.adobe.com/go/documentcloud_megasigncsv&#39;&gt;here&lt;/a&gt;   |  [optional]
**fileType** | [**FileTypeEnum**](#FileTypeEnum) | Input type through which participantSetsInfos will be provided. Whichever input type is provided, the values should be provided in its corresponding value object. Currently we are supporting CSV file format for providing megaSIgn child recipients. |  [optional]
**childAgreementsInfoFileId** | **String** | id of the file containg information about the existing childAgreementsInfo associated with the megaSign. Will be ignored in POST and PUT calls and in the case of GET call, this is the only thing that will be returned. The content of the file can be fetched through GET /megaSigns/{megaSignId}/childAgreementsInfo/{childAgreementsInfoFileId} endpoint. |  [optional]


<a name="FileTypeEnum"></a>
## Enum: FileTypeEnum
Name | Value
---- | -----
CSV | &quot;CSV&quot;



