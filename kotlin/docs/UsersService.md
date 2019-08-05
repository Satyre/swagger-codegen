# UsersService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductToWishlist**](UsersService.md#addProductToWishlist) | **POST** users/me/wishlist | Add product to wishlist
[**follow**](UsersService.md#follow) | **POST** users/{id}/followers | Follow a user
[**getCounters**](UsersService.md#getCounters) | **GET** users/me/counters | Get notification, wishlist ... count for header display
[**getFollowers**](UsersService.md#getFollowers) | **GET** users/{id}/followers | List followers of a user
[**getLikes**](UsersService.md#getLikes) | **GET** users/me/likes | Liked items
[**getMemberFollows**](UsersService.md#getMemberFollows) | **GET** users/{id}/member-follows | Members follow
[**getOwnCounters**](UsersService.md#getOwnCounters) | **GET** users/me/products/count | Get user&#39;s own counters
[**getOwnProductsCurationInformation**](UsersService.md#getOwnProductsCurationInformation) | **GET** users/me/products/curation/information | Get users products waiting more information
[**getOwnProductsCurationNegotiation**](UsersService.md#getOwnProductsCurationNegotiation) | **GET** users/me/products/curation/negotiation | Get users products with open mmao
[**getOwnProductsCurationPicture**](UsersService.md#getOwnProductsCurationPicture) | **GET** users/me/products/curation/picture | Get users products waiting new photos
[**getOwnProductsCurationRefused**](UsersService.md#getOwnProductsCurationRefused) | **GET** users/me/products/curation-refused | Get users products refused by vestiaire
[**getOwnProductsCurationValidation**](UsersService.md#getOwnProductsCurationValidation) | **GET** users/me/products/curation/validation | Get users products waiting validation from vestiaire
[**getOwnProductsExpired**](UsersService.md#getOwnProductsExpired) | **GET** users/me/products/expired | Get users products expired
[**getOwnProductsOnSale**](UsersService.md#getOwnProductsOnSale) | **GET** users/me/products/on-sale | Get users products on sale
[**getOwnProductsPictureCutoff**](UsersService.md#getOwnProductsPictureCutoff) | **GET** users/me/products/picture-cutoff | Get users products with picture in treatment
[**getOwnProductsPriceDrop**](UsersService.md#getOwnProductsPriceDrop) | **GET** users/me/products/price-drop | Get users products on price drop
[**getOwnProductsPriceOfferReceived**](UsersService.md#getOwnProductsPriceOfferReceived) | **GET** users/me/products/price-offer-received | Get users products with price offer received
[**getOwnProductsSaleRemoved**](UsersService.md#getOwnProductsSaleRemoved) | **GET** users/me/products/sale-removed | Get users products removed
[**getOwnProductsSold**](UsersService.md#getOwnProductsSold) | **GET** users/me/products/sold | Get users products solded
[**getOwnProductsUnreceived**](UsersService.md#getOwnProductsUnreceived) | **GET** users/me/products/unreceived | Get users products unreceived by vestiaire
[**getPriceDrop**](UsersService.md#getPriceDrop) | **GET** users/me/price-drop-alerts | Price drop follow
[**getUser**](UsersService.md#getUser) | **GET** users/{id} | Retrieve a single user
[**getUserSettings**](UsersService.md#getUserSettings) | **GET** users/me/settings | Returns settings
[**getViewedProducts**](UsersService.md#getViewedProducts) | **GET** users/{id}/viewed-products | List recently viewed products
[**getWallet**](UsersService.md#getWallet) | **GET** users/me/wallet | Retrieve current user&#39;s wallet
[**getWelcomeVoucher**](UsersService.md#getWelcomeVoucher) | **GET** users/me/welcome-voucher | Retrieve the welcome voucher
[**getWishesProduct**](UsersService.md#getWishesProduct) | **GET** users/me/wishes | user wishes product
[**getWishlist**](UsersService.md#getWishlist) | **GET** users/{id}/wishlist | Returns user&#39;s wishlist
[**listLikeProduct**](UsersService.md#listLikeProduct) | **GET** users/{id}/liked-products | Returns user&#39;s liked product list
[**registerUser**](UsersService.md#registerUser) | **POST** users | Register a new user
[**removeProductFromWishlist**](UsersService.md#removeProductFromWishlist) | **DELETE** users/me/wishlist/{idProduct} | Remove product from wishlist
[**unfollow**](UsersService.md#unfollow) | **DELETE** users/{id}/followers/me | Unfollow a user
[**updateUserSettings**](UsersService.md#updateUserSettings) | **PATCH** users/me/settings | Update settings


<a name="addProductToWishlist"></a>
# **addProductToWishlist**
> EmptyResponse addProductToWishlist(payload)

Add product to wishlist

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val payload : WishlistAddRequest =  // WishlistAddRequest | Product ID to add to wishlist
try {
    val result : EmptyResponse = apiInstance.addProductToWishlist(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#addProductToWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#addProductToWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WishlistAddRequest**](WishlistAddRequest.md)| Product ID to add to wishlist | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="follow"></a>
# **follow**
> EmptyResponse follow(id)

Follow a user

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | The Id of the user to follow
try {
    val result : EmptyResponse = apiInstance.follow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#follow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#follow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Id of the user to follow |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCounters"></a>
# **getCounters**
> CounterResponse getCounters()

Get notification, wishlist ... count for header display

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : CounterResponse = apiInstance.getCounters()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getCounters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getCounters")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CounterResponse**](CounterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFollowers"></a>
# **getFollowers**
> UserSocialResponse getFollowers(id)

List followers of a user

Returns a list of users who are following the specified user.  You can list user who are following the authenticated user using the &#x60;me&#x60; special key. &#x60;&#x60;&#x60; GET /users/me/followers/ &#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | The Id of the user for whom to return results.
try {
    val result : UserSocialResponse = apiInstance.getFollowers(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Id of the user for whom to return results. |

### Return type

[**UserSocialResponse**](UserSocialResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLikes"></a>
# **getLikes**
> LikedItemsResponse getLikes()

Liked items

Returns the liked items as an array for type id 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : LikedItemsResponse = apiInstance.getLikes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getLikes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getLikes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LikedItemsResponse**](LikedItemsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMemberFollows"></a>
# **getMemberFollows**
> UserFollowResponse getMemberFollows(id)

Members follow

Returns products ids of members follows 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | ID of the user
try {
    val result : UserFollowResponse = apiInstance.getMemberFollows(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getMemberFollows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getMemberFollows")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user |

### Return type

[**UserFollowResponse**](UserFollowResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnCounters"></a>
# **getOwnCounters**
> OwnCounterResponse getOwnCounters()

Get user&#39;s own counters

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : OwnCounterResponse = apiInstance.getOwnCounters()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnCounters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnCounters")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OwnCounterResponse**](OwnCounterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsCurationInformation"></a>
# **getOwnProductsCurationInformation**
> ProductListResponse1 getOwnProductsCurationInformation()

Get users products waiting more information

returns users products waiting for more informations 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsCurationInformation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsCurationInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsCurationInformation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsCurationNegotiation"></a>
# **getOwnProductsCurationNegotiation**
> ProductListResponse1 getOwnProductsCurationNegotiation()

Get users products with open mmao

priceDrop: return users products with open negotiation 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsCurationNegotiation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsCurationNegotiation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsCurationNegotiation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsCurationPicture"></a>
# **getOwnProductsCurationPicture**
> ProductListResponse1 getOwnProductsCurationPicture()

Get users products waiting new photos

returns users products waiting for new photos 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsCurationPicture()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsCurationPicture")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsCurationPicture")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsCurationRefused"></a>
# **getOwnProductsCurationRefused**
> ProductListResponse1 getOwnProductsCurationRefused()

Get users products refused by vestiaire

returns users products refused by vestiaire 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsCurationRefused()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsCurationRefused")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsCurationRefused")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsCurationValidation"></a>
# **getOwnProductsCurationValidation**
> ProductListResponse1 getOwnProductsCurationValidation()

Get users products waiting validation from vestiaire

returns users products waiting validation from vestiaire 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsCurationValidation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsCurationValidation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsCurationValidation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsExpired"></a>
# **getOwnProductsExpired**
> ProductListResponse1 getOwnProductsExpired()

Get users products expired

returns users products expired 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsExpired()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsExpired")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsExpired")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsOnSale"></a>
# **getOwnProductsOnSale**
> ProductListResponse1 getOwnProductsOnSale()

Get users products on sale

returns users products on sale 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsOnSale()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsOnSale")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsOnSale")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsPictureCutoff"></a>
# **getOwnProductsPictureCutoff**
> ProductListResponse1 getOwnProductsPictureCutoff()

Get users products with picture in treatment

returns users with picture in treatment 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsPictureCutoff()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsPictureCutoff")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsPictureCutoff")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsPriceDrop"></a>
# **getOwnProductsPriceDrop**
> ProductListResponse1 getOwnProductsPriceDrop()

Get users products on price drop

returns users products on price drop 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsPriceDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsPriceDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsPriceDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsPriceOfferReceived"></a>
# **getOwnProductsPriceOfferReceived**
> ProductListResponse1 getOwnProductsPriceOfferReceived()

Get users products with price offer received

returns users products which have been received offer price 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsPriceOfferReceived()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsPriceOfferReceived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsPriceOfferReceived")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsSaleRemoved"></a>
# **getOwnProductsSaleRemoved**
> ProductListResponse1 getOwnProductsSaleRemoved()

Get users products removed

returns users products removed by himself 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsSaleRemoved()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsSaleRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsSaleRemoved")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsSold"></a>
# **getOwnProductsSold**
> ProductListResponse1 getOwnProductsSold()

Get users products solded

returns solded users products 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsSold()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsSold")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsSold")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOwnProductsUnreceived"></a>
# **getOwnProductsUnreceived**
> ProductListResponse1 getOwnProductsUnreceived()

Get users products unreceived by vestiaire

returns users products unreceived by vestiaire 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : ProductListResponse1 = apiInstance.getOwnProductsUnreceived()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getOwnProductsUnreceived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getOwnProductsUnreceived")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductListResponse1**](ProductListResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPriceDrop"></a>
# **getPriceDrop**
> PriceDropResponse getPriceDrop()

Price drop follow

Returns products ids of price drop followed 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : PriceDropResponse = apiInstance.getPriceDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getPriceDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getPriceDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PriceDropResponse**](PriceDropResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse1 getUser(id)

Retrieve a single user

Returns public info about a single user

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | ID of the user
try {
    val result : UserResponse1 = apiInstance.getUser(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user |

### Return type

[**UserResponse1**](UserResponse1.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSettings"></a>
# **getUserSettings**
> I18nResponse getUserSettings()

Returns settings

Returns settings for the authenticating user.

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : I18nResponse = apiInstance.getUserSettings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getUserSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getUserSettings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**I18nResponse**](I18nResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getViewedProducts"></a>
# **getViewedProducts**
> ProductListResponse getViewedProducts(id, limit, offset)

List recently viewed products

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | ID of the user
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : ProductListResponse = apiInstance.getViewedProducts(id, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getViewedProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getViewedProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user |
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallet"></a>
# **getWallet**
> WalletResponse getWallet()

Retrieve current user&#39;s wallet

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : WalletResponse = apiInstance.getWallet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getWallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getWallet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWelcomeVoucher"></a>
# **getWelcomeVoucher**
> WelcomeVoucherResponse getWelcomeVoucher()

Retrieve the welcome voucher

Returns the welcome voucher if signed-in user is eligible to the welcome program. The welcome voucher is related to the site and is only allowed for first purchasing customers. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : WelcomeVoucherResponse = apiInstance.getWelcomeVoucher()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getWelcomeVoucher")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getWelcomeVoucher")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WelcomeVoucherResponse**](WelcomeVoucherResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWishesProduct"></a>
# **getWishesProduct**
> WishesResponse getWishesProduct()

user wishes product

Returns products ids of user wishlist 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
try {
    val result : WishesResponse = apiInstance.getWishesProduct()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getWishesProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getWishesProduct")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WishesResponse**](WishesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWishlist"></a>
# **getWishlist**
> ProductListResponse getWishlist(id, order, limit, offset)

Returns user&#39;s wishlist

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | ID of the user
val order : String = order_example // String | Result order
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : ProductListResponse = apiInstance.getWishlist(id, order, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#getWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#getWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user |
 **order** | **String**| Result order | [optional] [default to date] [enum: date, dateDesc, price, priceDesc, view]
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listLikeProduct"></a>
# **listLikeProduct**
> ProductListResponse listLikeProduct(id, limit, offset)

Returns user&#39;s liked product list

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | ID of the user
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : ProductListResponse = apiInstance.listLikeProduct(id, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#listLikeProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#listLikeProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user |
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerUser"></a>
# **registerUser**
> SessionResponse registerUser(payload)

Register a new user

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val payload : UserCreate =  // UserCreate | Registration form data
try {
    val result : SessionResponse = apiInstance.registerUser(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#registerUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#registerUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**UserCreate**](UserCreate.md)| Registration form data | [optional]

### Return type

[**SessionResponse**](SessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeProductFromWishlist"></a>
# **removeProductFromWishlist**
> removeProductFromWishlist(idProduct)

Remove product from wishlist

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val idProduct : String = idProduct_example // String | Product ID to remove from wishlist
try {
    apiInstance.removeProductFromWishlist(idProduct)
} catch (e: ClientException) {
    println("4xx response calling UsersService#removeProductFromWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#removeProductFromWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idProduct** | **String**| Product ID to remove from wishlist |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unfollow"></a>
# **unfollow**
> unfollow(id)

Unfollow a user

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val id : String = id_example // String | The Id of the user to unfollow
try {
    apiInstance.unfollow(id)
} catch (e: ClientException) {
    println("4xx response calling UsersService#unfollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#unfollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Id of the user to unfollow |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserSettings"></a>
# **updateUserSettings**
> I18nResponse updateUserSettings(payload)

Update settings

Updates the authenticated user&#39;s settings.

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = UsersService()
val payload : I18n =  // I18n | User's settings
try {
    val result : I18nResponse = apiInstance.updateUserSettings(payload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersService#updateUserSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersService#updateUserSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**I18n**](I18n.md)| User&#39;s settings | [optional]

### Return type

[**I18nResponse**](I18nResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

