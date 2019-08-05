# BreadcrumbsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBreadcrumb**](BreadcrumbsService.md#getBreadcrumb) | **GET** breadcrumbs | Get breadcrumb


<a name="getBreadcrumb"></a>
# **getBreadcrumb**
> BreadcrumbResponse getBreadcrumb(url)

Get breadcrumb

Return a breadcrumb: an ordered list of url+label to be displayed on the url that is queried (in french: Fil d&#39;ariane)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = BreadcrumbsService()
val url : String = url_example // String | Url which we want the breadcrumb
try {
    val result : BreadcrumbResponse = apiInstance.getBreadcrumb(url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreadcrumbsService#getBreadcrumb")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreadcrumbsService#getBreadcrumb")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| Url which we want the breadcrumb |

### Return type

[**BreadcrumbResponse**](BreadcrumbResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

