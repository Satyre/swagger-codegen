# CommentsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**likeComment**](CommentsService.md#likeComment) | **POST** comments/{id}/likes | Like a comment
[**unlikeComment**](CommentsService.md#unlikeComment) | **DELETE** comments/{id}/likes | Unlike a comment


<a name="likeComment"></a>
# **likeComment**
> likeComment(id)

Like a comment

Add a Like on a comment

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = CommentsService()
val id : String = id_example // String | Comment id
try {
    apiInstance.likeComment(id)
} catch (e: ClientException) {
    println("4xx response calling CommentsService#likeComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsService#likeComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Comment id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlikeComment"></a>
# **unlikeComment**
> unlikeComment(id)

Unlike a comment

Delete a Like from a comment

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = CommentsService()
val id : String = id_example // String | Comment id
try {
    apiInstance.unlikeComment(id)
} catch (e: ClientException) {
    println("4xx response calling CommentsService#unlikeComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsService#unlikeComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Comment id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

