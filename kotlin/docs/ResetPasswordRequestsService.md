# ResetPasswordRequestsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestPasswordReset**](ResetPasswordRequestsService.md#requestPasswordReset) | **POST** reset-password-requests | Send an e-mail to the user if the email exist


<a name="requestPasswordReset"></a>
# **requestPasswordReset**
> ResetPasswordRequestResponse requestPasswordReset(payload)

Send an e-mail to the user if the email exist

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ResetPasswordRequestsService()
val payload : ResetPasswordRequest =  // ResetPasswordRequest | User's email
try {
    val result : ResetPasswordRequestResponse = apiInstance.requestPasswordReset(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResetPasswordRequestsService#requestPasswordReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResetPasswordRequestsService#requestPasswordReset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ResetPasswordRequest**](ResetPasswordRequest.md)| User&#39;s email | [optional]

### Return type

[**ResetPasswordRequestResponse**](ResetPasswordRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

