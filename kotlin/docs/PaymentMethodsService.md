# PaymentMethodsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentMethod**](PaymentMethodsService.md#getPaymentMethod) | **GET** payment-methods/{id} | return a specific payment method
[**listPaymentMethods**](PaymentMethodsService.md#listPaymentMethods) | **GET** payment-methods | List payment methods


<a name="getPaymentMethod"></a>
# **getPaymentMethod**
> PaymentMethodResponse getPaymentMethod(id)

return a specific payment method

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = PaymentMethodsService()
val id : String = id_example // String | The id of a paymentMethod
try {
    val result : PaymentMethodResponse = apiInstance.getPaymentMethod(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsService#getPaymentMethod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsService#getPaymentMethod")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of a paymentMethod |

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPaymentMethods"></a>
# **listPaymentMethods**
> PaymentMethodListResponse listPaymentMethods(limit, offset)

List payment methods

Returns all allowed payment method for UserMe

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = PaymentMethodsService()
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : PaymentMethodListResponse = apiInstance.listPaymentMethods(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsService#listPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsService#listPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

