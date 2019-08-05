# AccountsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountsService.md#getAccount) | **GET** accounts/{id} | Retrieve a single user


<a name="getAccount"></a>
# **getAccount**
> UserResponse getAccount(id)

Retrieve a single user

Returns public info about a single user

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = AccountsService()
val id : String = id_example // String | ID of the user
try {
    val result : UserResponse = apiInstance.getAccount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsService#getAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsService#getAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

