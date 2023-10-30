
# Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numPages** | **Integer** | Number of pages in the document |  [optional]
**createdDate** | [**Date**](Date.md) | The date the document was created |  [optional]
**name** | **String** | Name of the original document uploaded. This is returned in GET but not accepted back in PUT |  [optional]
**id** | **String** | ID of the document. In case of PUT call, this is the only field that is accepted in Document structure. Name and mimeType are ignored in case of PUT call |  [optional]
**label** | **String** | Label of the document |  [optional]
**mimeType** | **String** | mimeType of the original file. This is returned in GET but not accepted back in PUT |  [optional]



