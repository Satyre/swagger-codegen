# CampaignsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaign**](CampaignsService.md#getCampaign) | **GET** campaigns/{id} | Get a campaign by id


<a name="getCampaign"></a>
# **getCampaign**
> CampaignResponse getCampaign(id)

Get a campaign by id

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = CampaignsService()
val id : String = id_example // String | Campaign ID to query
try {
    val result : CampaignResponse = apiInstance.getCampaign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsService#getCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsService#getCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Campaign ID to query |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

