# OrdersService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductToCart**](OrdersService.md#addProductToCart) | **POST** orders/current/order-lines | Add product to user&#39;s cart
[**getCart**](OrdersService.md#getCart) | **GET** orders/current | Returns cart content
[**removeProductFromCart**](OrdersService.md#removeProductFromCart) | **DELETE** orders/current/order-lines/{id} | Remove product from user&#39;s cart
[**updateProductDelivery**](OrdersService.md#updateProductDelivery) | **POST** orders/current/order-lines/{id}/{shippingOption} | Update product delivery method from user&#39;s cart


<a name="addProductToCart"></a>
# **addProductToCart**
> OrderLineIdResponse addProductToCart(payload)

Add product to user&#39;s cart

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = OrdersService()
val payload : OrderAddProductRequest =  // OrderAddProductRequest | Product ID
try {
    val result : OrderLineIdResponse = apiInstance.addProductToCart(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersService#addProductToCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersService#addProductToCart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OrderAddProductRequest**](OrderAddProductRequest.md)| Product ID | [optional]

### Return type

[**OrderLineIdResponse**](OrderLineIdResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCart"></a>
# **getCart**
> OrderResponse getCart()

Returns cart content

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = OrdersService()
try {
    val result : OrderResponse = apiInstance.getCart()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersService#getCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersService#getCart")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeProductFromCart"></a>
# **removeProductFromCart**
> removeProductFromCart(id)

Remove product from user&#39;s cart

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = OrdersService()
val id : String = id_example // String | Order line ID
try {
    apiInstance.removeProductFromCart(id)
} catch (e: ClientException) {
    println("4xx response calling OrdersService#removeProductFromCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersService#removeProductFromCart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Order line ID |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductDelivery"></a>
# **updateProductDelivery**
> OrderPlanUpdateResponse updateProductDelivery(id, shippingOption)

Update product delivery method from user&#39;s cart

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = OrdersService()
val id : String = id_example // String | Order line ID
val shippingOption : String = shippingOption_example // String | Choosen shipping option for product
try {
    val result : OrderPlanUpdateResponse = apiInstance.updateProductDelivery(id, shippingOption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersService#updateProductDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersService#updateProductDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Order line ID |
 **shippingOption** | **String**| Choosen shipping option for product |

### Return type

[**OrderPlanUpdateResponse**](OrderPlanUpdateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

