
# FileInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | [**Document**](Document.md) | A document that is associated with the widget. This field cannot be provided in POST call. In case of GET call, this is the only field returned in the response |  [optional]
**label** | **String** | The unique label value of a file info element. In case of custom workflow this will map a file to corresponding file element in workflow definition. This must be specified in case of custom workflow agreement creation request  |  [optional]
**libraryDocumentId** | **String** | ID for an existing Library document that will be added to the agreement |  [optional]
**transientDocumentId** | **String** | ID for a transient document that will be added to the agreement |  [optional]
**urlFileInfo** | [**URLFileInfo**](URLFileInfo.md) | URL for an external document to add to the agreement |  [optional]



