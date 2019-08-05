
# CatalogPage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**path** | [**String**](String.md) | Path | 
**language** | [**String**](String.md) | Language code | 
**template** | [**String**](String.md) | Page template | 
**alternateVersions** | [**Array&lt;ContentsLocalizedPath&gt;**](ContentsLocalizedPath.md) | Regional variations of the page. |  [optional]
**metadata** | [**ContentsPageMetadata**](ContentsPageMetadata.md) |  | 
**indexation** | [**ContentsPageIndexation**](ContentsPageIndexation.md) |  | 
**route** | [**ContentsRoute**](ContentsRoute.md) | Route details | 
**content** | [**ContentsCatalogPageContent**](ContentsCatalogPageContent.md) |  | 
**isOpenedForPagination** | **Boolean** | true if pagination is opened | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | catalog-page



