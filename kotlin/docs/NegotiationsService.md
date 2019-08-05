# NegotiationsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNegotiationEvent**](NegotiationsService.md#addNegotiationEvent) | **POST** negotiations/{id}/events | Add an event to a negotiation
[**getNegotiation**](NegotiationsService.md#getNegotiation) | **GET** negotiations/{id} | Returns a single negotiation
[**listNegotiations**](NegotiationsService.md#listNegotiations) | **GET** negotiations | Get a list of negotiations


<a name="addNegotiationEvent"></a>
# **addNegotiationEvent**
> NegotiationResponse addNegotiationEvent(id, payload)

Add an event to a negotiation

Add an event to a negotiation (accept, reject or add offer)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NegotiationsService()
val id : String = id_example // String | Id of the negotiation
val payload : NegotiationEventRequest =  // NegotiationEventRequest | 
try {
    val result : NegotiationResponse = apiInstance.addNegotiationEvent(id, payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NegotiationsService#addNegotiationEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NegotiationsService#addNegotiationEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the negotiation |
 **payload** | [**NegotiationEventRequest**](NegotiationEventRequest.md)|  | [optional]

### Return type

[**NegotiationResponse**](NegotiationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNegotiation"></a>
# **getNegotiation**
> NegotiationResponse getNegotiation(id, withEvents)

Returns a single negotiation

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NegotiationsService()
val id : String = id_example // String | ID of the negotiation to fetch
val withEvents : String = withEvents_example // String | List all the events of the negotiation
try {
    val result : NegotiationResponse = apiInstance.getNegotiation(id, withEvents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NegotiationsService#getNegotiation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NegotiationsService#getNegotiation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the negotiation to fetch |
 **withEvents** | **String**| List all the events of the negotiation | [optional] [default to false]

### Return type

[**NegotiationResponse**](NegotiationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNegotiations"></a>
# **listNegotiations**
> NegotiationListResponse listNegotiations(role, withEvents, activityStatus, limit, offset)

Get a list of negotiations

Returns a list of negotiations for currently signed-in user.

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NegotiationsService()
val role : String = role_example // String | Filter by user role. Returns both buyer and seller initiated negotiations by default. 
val withEvents : Boolean = true // Boolean | If true, returns events
val activityStatus : String = activityStatus_example // String | active (default): returns only active negotiations (max 1 per product+buyer) activeAndRecentlyClosed: returns closed negotiations as well, but only if closed recently (less than 7 days ago) all: all activity status (active and closed, regardless of when it happened) 
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : NegotiationListResponse = apiInstance.listNegotiations(role, withEvents, activityStatus, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NegotiationsService#listNegotiations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NegotiationsService#listNegotiations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| Filter by user role. Returns both buyer and seller initiated negotiations by default.  | [optional] [default to both] [enum: buyer, seller, both]
 **withEvents** | **Boolean**| If true, returns events | [optional] [default to false]
 **activityStatus** | **String**| active (default): returns only active negotiations (max 1 per product+buyer) activeAndRecentlyClosed: returns closed negotiations as well, but only if closed recently (less than 7 days ago) all: all activity status (active and closed, regardless of when it happened)  | [optional] [default to active] [enum: active, activeAndRecentlyClosed, all]
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**NegotiationListResponse**](NegotiationListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

