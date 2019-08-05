# ProductsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPhotoProduct**](ProductsService.md#addPhotoProduct) | **POST** products/{id}/photo | Add photo to a product
[**createNegotiation**](ProductsService.md#createNegotiation) | **POST** products/{productId}/negotiations | Start a new negotiation
[**createProductComment**](ProductsService.md#createProductComment) | **POST** products/{productId}/comments | Add a comment on a product
[**deletePriceDrop**](ProductsService.md#deletePriceDrop) | **DELETE** products/{productId}/price-drop-alerts | Product Price drop unfollow
[**getActiveNegotiation**](ProductsService.md#getActiveNegotiation) | **GET** products/{productId}/active-negotiation | Returns the active negotiation for currently signed-in buyer.
[**getProduct**](ProductsService.md#getProduct) | **GET** products/{id} | Returns a single product
[**getProductConditionDetails**](ProductsService.md#getProductConditionDetails) | **GET** products/{id}/condition-details | Get product condition levels
[**getProductReservation**](ProductsService.md#getProductReservation) | **GET** products/{id}/reservation | Check product reservation status
[**getProductShippingInformation**](ProductsService.md#getProductShippingInformation) | **GET** products/{id}/shippings | Get product shipping information
[**getShippingVoucher**](ProductsService.md#getShippingVoucher) | **GET** products/{id}/shipping-voucher | Return shipping voucher path of sold product
[**likeProduct**](ProductsService.md#likeProduct) | **POST** products/{id}/likes | Like a product
[**listAssociatedProducts**](ProductsService.md#listAssociatedProducts) | **GET** products/{id}/associated-products | List associated products
[**listProductComents**](ProductsService.md#listProductComents) | **GET** products/{productId}/comments | List a product comments
[**listSimilarProducts**](ProductsService.md#listSimilarProducts) | **GET** products/{id}/similar-products | List similar products
[**reportProduct**](ProductsService.md#reportProduct) | **POST** products/{id}/reports | Report a product
[**translateProduct**](ProductsService.md#translateProduct) | **GET** products/{productId}/translation | translate a description
[**translation**](ProductsService.md#translation) | **GET** products/{productId}/comments/{commentId}/translation | translate a comment
[**unlikeProduct**](ProductsService.md#unlikeProduct) | **DELETE** products/{id}/likes | Unlike a product


<a name="addPhotoProduct"></a>
# **addPhotoProduct**
> InlineResponse201 addPhotoProduct(id, payload)

Add photo to a product

Add a photo to an existing product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Id of the product
val payload : ArrayLessThanByteGreaterThan = B // ArrayLessThanByteGreaterThan | 
try {
    val result : InlineResponse201 = apiInstance.addPhotoProduct(id, payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#addPhotoProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#addPhotoProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the product |
 **payload** | **ArrayLessThanByteGreaterThan**|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createNegotiation"></a>
# **createNegotiation**
> NegotiationResponse createNegotiation(productId, payload)

Start a new negotiation

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val productId : String = productId_example // String | Product
val payload : NegotiationRequest =  // NegotiationRequest | 
try {
    val result : NegotiationResponse = apiInstance.createNegotiation(productId, payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#createNegotiation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#createNegotiation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product |
 **payload** | [**NegotiationRequest**](NegotiationRequest.md)|  | [optional]

### Return type

[**NegotiationResponse**](NegotiationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProductComment"></a>
# **createProductComment**
> CommentResponse createProductComment(productId, payload)

Add a comment on a product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val productId : String = productId_example // String | The id of a product
val payload : CommentForm =  // CommentForm | Comment of a product
try {
    val result : CommentResponse = apiInstance.createProductComment(productId, payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#createProductComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#createProductComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of a product |
 **payload** | [**CommentForm**](CommentForm.md)| Comment of a product | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePriceDrop"></a>
# **deletePriceDrop**
> deletePriceDrop(productId)

Product Price drop unfollow

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val productId : String = productId_example // String | Product ID
try {
    apiInstance.deletePriceDrop(productId)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#deletePriceDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#deletePriceDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product ID |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActiveNegotiation"></a>
# **getActiveNegotiation**
> NegotiationResponse getActiveNegotiation(productId, withEvents)

Returns the active negotiation for currently signed-in buyer.

Returns the active negotiation for currently signed-in buyer.

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val productId : String = productId_example // String | Product
val withEvents : Boolean = true // Boolean | If true, returns events
try {
    val result : NegotiationResponse = apiInstance.getActiveNegotiation(productId, withEvents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#getActiveNegotiation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#getActiveNegotiation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product |
 **withEvents** | **Boolean**| If true, returns events | [optional] [default to false]

### Return type

[**NegotiationResponse**](NegotiationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProduct"></a>
# **getProduct**
> ProductResponse getProduct(id, isoCountry)

Returns a single product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Id of the product to retrieve
val isoCountry : String = isoCountry_example // String | iso country for installment
try {
    val result : ProductResponse = apiInstance.getProduct(id, isoCountry)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#getProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#getProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the product to retrieve |
 **isoCountry** | **String**| iso country for installment | [optional]

### Return type

[**ProductResponse**](ProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductConditionDetails"></a>
# **getProductConditionDetails**
> ProductConditionDetailsResponse getProductConditionDetails(id)

Get product condition levels

Returns a list of condition levels for a product. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | The Id of product for which to get condition levels.
try {
    val result : ProductConditionDetailsResponse = apiInstance.getProductConditionDetails(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#getProductConditionDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#getProductConditionDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Id of product for which to get condition levels. |

### Return type

[**ProductConditionDetailsResponse**](ProductConditionDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductReservation"></a>
# **getProductReservation**
> ProductReservationResponse getProductReservation(id)

Check product reservation status

A product can be reserved either manually by a premium member or automatically following a successful negotiation. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Id of the product to be checked
try {
    val result : ProductReservationResponse = apiInstance.getProductReservation(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#getProductReservation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#getProductReservation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the product to be checked |

### Return type

[**ProductReservationResponse**](ProductReservationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductShippingInformation"></a>
# **getProductShippingInformation**
> ShippingResponse getProductShippingInformation(id, isoCountry)

Get product shipping information

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | The id of a product
val isoCountry : String = isoCountry_example // String | country iso code
try {
    val result : ShippingResponse = apiInstance.getProductShippingInformation(id, isoCountry)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#getProductShippingInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#getProductShippingInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of a product |
 **isoCountry** | **String**| country iso code |

### Return type

[**ShippingResponse**](ShippingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShippingVoucher"></a>
# **getShippingVoucher**
> ShippingVoucherResponse getShippingVoucher(id)

Return shipping voucher path of sold product

Return shipping voucher path of sold product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Product Id
try {
    val result : ShippingVoucherResponse = apiInstance.getShippingVoucher(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#getShippingVoucher")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#getShippingVoucher")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product Id |

### Return type

[**ShippingVoucherResponse**](ShippingVoucherResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="likeProduct"></a>
# **likeProduct**
> likeProduct(id)

Like a product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Product to like Id
try {
    apiInstance.likeProduct(id)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#likeProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#likeProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product to like Id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAssociatedProducts"></a>
# **listAssociatedProducts**
> ProductListResponse listAssociatedProducts(id, limit, offset)

List associated products

Returns associated products (To wear with)

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Product Id
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : ProductListResponse = apiInstance.listAssociatedProducts(id, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#listAssociatedProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#listAssociatedProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product Id |
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProductComents"></a>
# **listProductComents**
> CommentListResponse listProductComents(productId, limit, offset)

List a product comments

Returns a list of comment for a given product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val productId : String = productId_example // String | Product ID
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : CommentListResponse = apiInstance.listProductComents(productId, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#listProductComents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#listProductComents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product ID |
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**CommentListResponse**](CommentListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSimilarProducts"></a>
# **listSimilarProducts**
> ProductListResponse listSimilarProducts(id, limit, offset)

List similar products

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Product Id
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : ProductListResponse = apiInstance.listSimilarProducts(id, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#listSimilarProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#listSimilarProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product Id |
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportProduct"></a>
# **reportProduct**
> ProductReportResponse reportProduct(id, typeId, payload)

Report a product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | The id of a product to report
val typeId : String = typeId_example // String | item type for the report
val payload : ProductReport =  // ProductReport | Report message
try {
    val result : ProductReportResponse = apiInstance.reportProduct(id, typeId, payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#reportProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#reportProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of a product to report |
 **typeId** | **String**| item type for the report | [optional]
 **payload** | [**ProductReport**](ProductReport.md)| Report message | [optional]

### Return type

[**ProductReportResponse**](ProductReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="translateProduct"></a>
# **translateProduct**
> ProductTranslationResponse translateProduct(productId)

translate a description

Returns a description translation

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val productId : String = productId_example // String | Product ID
try {
    val result : ProductTranslationResponse = apiInstance.translateProduct(productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#translateProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#translateProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product ID |

### Return type

[**ProductTranslationResponse**](ProductTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="translation"></a>
# **translation**
> CommentsTranslationResponse translation(commentId, productId)

translate a comment

Returns a comment translation

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val commentId : String = commentId_example // String | Comment ID
val productId : String = productId_example // String | Product ID
try {
    val result : CommentsTranslationResponse = apiInstance.translation(commentId, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#translation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#translation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**| Comment ID |
 **productId** | **String**| Product ID |

### Return type

[**CommentsTranslationResponse**](CommentsTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlikeProduct"></a>
# **unlikeProduct**
> unlikeProduct(id)

Unlike a product

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ProductsService()
val id : String = id_example // String | Product to dislike Id
try {
    apiInstance.unlikeProduct(id)
} catch (e: ClientException) {
    println("4xx response calling ProductsService#unlikeProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsService#unlikeProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product to dislike Id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

