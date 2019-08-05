# BrandsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dislikeBrand**](BrandsService.md#dislikeBrand) | **DELETE** brands/{id}/likes | Dislike a brand
[**listBrands**](BrandsService.md#listBrands) | **GET** brands | List brands


<a name="dislikeBrand"></a>
# **dislikeBrand**
> dislikeBrand(id)

Dislike a brand

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = BrandsService()
val id : String = id_example // String | Id of the brand to dislike
try {
    apiInstance.dislikeBrand(id)
} catch (e: ClientException) {
    println("4xx response calling BrandsService#dislikeBrand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandsService#dislikeBrand")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the brand to dislike |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBrands"></a>
# **listBrands**
> BrandListResponse listBrands(active)

List brands

Returns all brands

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = BrandsService()
val active : Boolean = true // Boolean | get only active brands
try {
    val result : BrandListResponse = apiInstance.listBrands(active)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandsService#listBrands")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandsService#listBrands")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **Boolean**| get only active brands | [optional] [default to false]

### Return type

[**BrandListResponse**](BrandListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

