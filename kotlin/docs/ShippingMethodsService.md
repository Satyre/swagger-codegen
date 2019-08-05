# ShippingMethodsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShippingMethod**](ShippingMethodsService.md#getShippingMethod) | **GET** shipping-methods/{id} | Retrieve a shipping method
[**listShippingMethods**](ShippingMethodsService.md#listShippingMethods) | **GET** shipping-methods | List shipping methods


<a name="getShippingMethod"></a>
# **getShippingMethod**
> ShippingMethodResponse getShippingMethod(id)

Retrieve a shipping method

Returns information about a specific shipping method.

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ShippingMethodsService()
val id : String = id_example // String | The Id of a shipping method
try {
    val result : ShippingMethodResponse = apiInstance.getShippingMethod(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsService#getShippingMethod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsService#getShippingMethod")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Id of a shipping method |

### Return type

[**ShippingMethodResponse**](ShippingMethodResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listShippingMethods"></a>
# **listShippingMethods**
> ShippingMethodListResponse listShippingMethods(limit, offset)

List shipping methods

Returns available shipping methods for current order.

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ShippingMethodsService()
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : ShippingMethodListResponse = apiInstance.listShippingMethods(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsService#listShippingMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsService#listShippingMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**ShippingMethodListResponse**](ShippingMethodListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

