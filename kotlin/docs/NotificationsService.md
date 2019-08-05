# NotificationsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNotifications**](NotificationsService.md#listNotifications) | **GET** notifications | Returns a list of notifications
[**updateNotification**](NotificationsService.md#updateNotification) | **PATCH** notifications/{id} | Mark notification Id as viewed or read (default read)
[**updateNotifications**](NotificationsService.md#updateNotifications) | **PATCH** notifications | Notifications Ids to mark as viewed


<a name="listNotifications"></a>
# **listNotifications**
> NotificationListResponse listNotifications(limit, offset)

Returns a list of notifications

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NotificationsService()
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : NotificationListResponse = apiInstance.listNotifications(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsService#listNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsService#listNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**NotificationListResponse**](NotificationListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNotification"></a>
# **updateNotification**
> EmptyResponse updateNotification(id, payload)

Mark notification Id as viewed or read (default read)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NotificationsService()
val id : String = id_example // String | Notification Id to mark as viewed or read
val payload : NotificationUpdateRequest =  // NotificationUpdateRequest | 
try {
    val result : EmptyResponse = apiInstance.updateNotification(id, payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsService#updateNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsService#updateNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Notification Id to mark as viewed or read |
 **payload** | [**NotificationUpdateRequest**](NotificationUpdateRequest.md)|  | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNotifications"></a>
# **updateNotifications**
> EmptyResponse updateNotifications(payload)

Notifications Ids to mark as viewed

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = NotificationsService()
val payload : ViewedNotificationIds =  // ViewedNotificationIds | 
try {
    val result : EmptyResponse = apiInstance.updateNotifications(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsService#updateNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsService#updateNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ViewedNotificationIds**](ViewedNotificationIds.md)|  |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

