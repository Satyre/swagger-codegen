# AlertsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlert**](AlertsService.md#createAlert) | **POST** alerts | Create an alert
[**deleteAlert**](AlertsService.md#deleteAlert) | **DELETE** alerts/{id} | Delete an alert
[**getAlert**](AlertsService.md#getAlert) | **GET** alerts/{id} | Retrieve an alert
[**getProductsAverageMatching**](AlertsService.md#getProductsAverageMatching) | **GET** alerts/average-matching-products | Average number of new products
[**listAlerts**](AlertsService.md#listAlerts) | **GET** alerts | List alerts


<a name="createAlert"></a>
# **createAlert**
> AlertResponse createAlert(payload)

Create an alert

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = AlertsService()
val payload : AlertSettings =  // AlertSettings | Alert settings
try {
    val result : AlertResponse = apiInstance.createAlert(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AlertsService#createAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AlertsService#createAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AlertSettings**](AlertSettings.md)| Alert settings | [optional]

### Return type

[**AlertResponse**](AlertResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlert"></a>
# **deleteAlert**
> deleteAlert(id)

Delete an alert

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = AlertsService()
val id : String = id_example // String | Id of the alert to be deleted
try {
    apiInstance.deleteAlert(id)
} catch (e: ClientException) {
    println("4xx response calling AlertsService#deleteAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AlertsService#deleteAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the alert to be deleted |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlert"></a>
# **getAlert**
> AlertResponse getAlert(id)

Retrieve an alert

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = AlertsService()
val id : String = id_example // String | Id of the alert to be retrieved
try {
    val result : AlertResponse = apiInstance.getAlert(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AlertsService#getAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AlertsService#getAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the alert to be retrieved |

### Return type

[**AlertResponse**](AlertResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductsAverageMatching"></a>
# **getProductsAverageMatching**
> AverageProductsResponse getProductsAverageMatching(path, searchQuery, idUniverse, idBrand, idMaterials, idPattern, idColors, idCondition, idCategory, idSubcategory, idSize, stock)

Average number of new products

Returns the average number of newly available products per day/week/month that match given criteria. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = AlertsService()
val path : String = path_example // String | Path (eg. `/woman/woman-bags`)
val searchQuery : String = searchQuery_example // String | Search query (eg. `leather+boots`)
val idUniverse : String = idUniverse_example // String | Universe Id
val idBrand : Array<String> =  // Array<String> | Brand Ids
val idMaterials : Array<String> =  // Array<String> | Material Ids
val idPattern : Array<String> =  // Array<String> | Pattern Ids
val idColors : Array<String> =  // Array<String> | Color Ids
val idCondition : Array<String> =  // Array<String> | Condition Ids
val idCategory : Array<String> =  // Array<String> | Category Ids
val idSubcategory : Array<String> =  // Array<String> | Subcategory Ids
val idSize : Array<String> =  // Array<String> | Size Ids
val stock : String = stock_example // String | In stock
try {
    val result : AverageProductsResponse = apiInstance.getProductsAverageMatching(path, searchQuery, idUniverse, idBrand, idMaterials, idPattern, idColors, idCondition, idCategory, idSubcategory, idSize, stock)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AlertsService#getProductsAverageMatching")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AlertsService#getProductsAverageMatching")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path (eg. &#x60;/woman/woman-bags&#x60;) | [optional]
 **searchQuery** | **String**| Search query (eg. &#x60;leather+boots&#x60;) | [optional]
 **idUniverse** | **String**| Universe Id | [optional]
 **idBrand** | [**Array&lt;String&gt;**](String.md)| Brand Ids | [optional]
 **idMaterials** | [**Array&lt;String&gt;**](String.md)| Material Ids | [optional]
 **idPattern** | [**Array&lt;String&gt;**](String.md)| Pattern Ids | [optional]
 **idColors** | [**Array&lt;String&gt;**](String.md)| Color Ids | [optional]
 **idCondition** | [**Array&lt;String&gt;**](String.md)| Condition Ids | [optional]
 **idCategory** | [**Array&lt;String&gt;**](String.md)| Category Ids | [optional]
 **idSubcategory** | [**Array&lt;String&gt;**](String.md)| Subcategory Ids | [optional]
 **idSize** | [**Array&lt;String&gt;**](String.md)| Size Ids | [optional]
 **stock** | **String**| In stock | [optional]

### Return type

[**AverageProductsResponse**](AverageProductsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAlerts"></a>
# **listAlerts**
> AlertListResponse listAlerts(limit, offset)

List alerts

Lists alerts of current user

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = AlertsService()
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : AlertListResponse = apiInstance.listAlerts(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AlertsService#listAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AlertsService#listAlerts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**AlertListResponse**](AlertListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

