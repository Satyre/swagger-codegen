# SessionsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSession**](SessionsService.md#createSession) | **POST** sessions | Log-in (create a new session)
[**deleteSession**](SessionsService.md#deleteSession) | **DELETE** sessions/{sessionId} | Delete an user session (log-out)


<a name="createSession"></a>
# **createSession**
> SessionResponse createSession(payload)

Log-in (create a new session)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = SessionsService()
val payload : Credentials =  // Credentials | 
try {
    val result : SessionResponse = apiInstance.createSession(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionsService#createSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionsService#createSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Credentials**](Credentials.md)|  | [optional]

### Return type

[**SessionResponse**](SessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSession"></a>
# **deleteSession**
> deleteSession(sessionId)

Delete an user session (log-out)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = SessionsService()
val sessionId : String = sessionId_example // String | Session id
try {
    apiInstance.deleteSession(sessionId)
} catch (e: ClientException) {
    println("4xx response calling SessionsService#deleteSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionsService#deleteSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Session id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

