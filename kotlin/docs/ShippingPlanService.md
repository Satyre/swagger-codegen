# ShippingPlanService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShippingEligibility**](ShippingPlanService.md#getShippingEligibility) | **GET** shipping-plan/eligibility | Shipping Eligibility


<a name="getShippingEligibility"></a>
# **getShippingEligibility**
> ShippingPlanResponse getShippingEligibility(country)

Shipping Eligibility

Returns a Shipping Eligibility for a country

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ShippingPlanService()
val country : String = country_example // String | ISO Country Code
try {
    val result : ShippingPlanResponse = apiInstance.getShippingEligibility(country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingPlanService#getShippingEligibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingPlanService#getShippingEligibility")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| ISO Country Code |

### Return type

[**ShippingPlanResponse**](ShippingPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

