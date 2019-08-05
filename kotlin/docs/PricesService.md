# PricesService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrice**](PricesService.md#getPrice) | **GET** prices | pvn estimated


<a name="getPrice"></a>
# **getPrice**
> PriceResponse getPrice(price, currency, idProduct, idClient)

pvn estimated

return the pvn (seller&#39;s share)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = PricesService()
val price : String = price_example // String | 
val currency : String = currency_example // String | defaults to user's currency (i18n)
val idProduct : String = idProduct_example // String | 
val idClient : String = idClient_example // String | 
try {
    val result : PriceResponse = apiInstance.getPrice(price, currency, idProduct, idClient)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesService#getPrice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesService#getPrice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price** | **String**|  |
 **currency** | **String**| defaults to user&#39;s currency (i18n) | [optional]
 **idProduct** | **String**|  | [optional]
 **idClient** | **String**|  | [optional]

### Return type

[**PriceResponse**](PriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

