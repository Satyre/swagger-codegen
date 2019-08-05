# NewsletterSubscribersService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscribeNewsletter**](NewsletterSubscribersService.md#subscribeNewsletter) | **POST** newsletter-subscribers | Register an email to the newsletter


<a name="subscribeNewsletter"></a>
# **subscribeNewsletter**
> NewsletterRegistrationResponse subscribeNewsletter(payload)

Register an email to the newsletter

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NewsletterSubscribersService()
val payload : NewsletterRegistration =  // NewsletterRegistration | Newsletter registration
try {
    val result : NewsletterRegistrationResponse = apiInstance.subscribeNewsletter(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscribersService#subscribeNewsletter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscribersService#subscribeNewsletter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**NewsletterRegistration**](NewsletterRegistration.md)| Newsletter registration | [optional]

### Return type

[**NewsletterRegistrationResponse**](NewsletterRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

