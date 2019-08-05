# CatalogService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFacetLinks**](CatalogService.md#getFacetLinks) | **GET** catalog/facet-links | SEO facet links


<a name="getFacetLinks"></a>
# **getFacetLinks**
> FacetLinksResponse getFacetLinks(path)

SEO facet links

Returns a list of facet links

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = CatalogService()
val path : String = path_example // String | Page path
try {
    val result : FacetLinksResponse = apiInstance.getFacetLinks(path)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogService#getFacetLinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogService#getFacetLinks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Page path |

### Return type

[**FacetLinksResponse**](FacetLinksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

