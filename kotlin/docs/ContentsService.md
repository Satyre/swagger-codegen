# ContentsService

All URIs are relative to *https://apiv2.vestiairecollective.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](ContentsService.md#getCategories) | **GET** contents/categories | Homepage categories
[**getCustomerCare**](ContentsService.md#getCustomerCare) | **GET** contents/customer-care | Get customer care Info
[**getDeeplink**](ContentsService.md#getDeeplink) | **GET** contents/deeplink/{url} | Get deeplink for an url
[**getEditorialCrush**](ContentsService.md#getEditorialCrush) | **GET** contents/editorial-crush | Editorial crush
[**getEditorialList**](ContentsService.md#getEditorialList) | **GET** contents/editorial-list | Get editorial post list
[**getMainMerchandizing**](ContentsService.md#getMainMerchandizing) | **GET** contents/main-merchandizing | Main merchandizing
[**getOfflineWelcomeVoucher**](ContentsService.md#getOfflineWelcomeVoucher) | **GET** contents/welcome-voucher | Retrieve the welcome voucher
[**getPageIdContent**](ContentsService.md#getPageIdContent) | **GET** contents/cms/pages/{pageId} | Get content for a page by its ID with the cms project
[**getPageTypeContent**](ContentsService.md#getPageTypeContent) | **GET** contents/cms/pages/type/{pageType} | Get content for a page type with the cms project
[**getPageUrlContent**](ContentsService.md#getPageUrlContent) | **GET** contents/cms/pages/url/{pageUrl} | Get content for a page type with the cms project
[**getPaymentMethods**](ContentsService.md#getPaymentMethods) | **GET** contents/payment-methods | List payment methods
[**getReinsurance**](ContentsService.md#getReinsurance) | **GET** contents/reinsurance | Get helps information on shipping cost and customer fees
[**getSingleEdito**](ContentsService.md#getSingleEdito) | **GET** contents/single-edito | Single edito
[**listCatalogPages**](ContentsService.md#listCatalogPages) | **GET** contents/catalog-pages | List catalog pages
[**listPromotionalBanners**](ContentsService.md#listPromotionalBanners) | **GET** contents/promotional-banners | Get promotional banners
[**listTypeSize**](ContentsService.md#listTypeSize) | **GET** contents/type-size | List type size


<a name="getCategories"></a>
# **getCategories**
> ContentsCategoriesResponse getCategories()

Homepage categories

Returns a list of categories for the homepage

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : ContentsCategoriesResponse = apiInstance.getCategories()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getCategories")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentsCategoriesResponse**](ContentsCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomerCare"></a>
# **getCustomerCare**
> ContentsCustomerCareResponse getCustomerCare()

Get customer care Info

Retrieve customer care info 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : ContentsCustomerCareResponse = apiInstance.getCustomerCare()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getCustomerCare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getCustomerCare")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentsCustomerCareResponse**](ContentsCustomerCareResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeeplink"></a>
# **getDeeplink**
> ContentDeeplinkResponse getDeeplink(url)

Get deeplink for an url

get deeplink related for an url

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val url : String = url_example // String | url to translate to deeplink
try {
    val result : ContentDeeplinkResponse = apiInstance.getDeeplink(url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getDeeplink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getDeeplink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| url to translate to deeplink |

### Return type

[**ContentDeeplinkResponse**](ContentDeeplinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEditorialCrush"></a>
# **getEditorialCrush**
> ContentsEditorialCrushResponse getEditorialCrush()

Editorial crush

Returns editorial-crush block for homepage

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : ContentsEditorialCrushResponse = apiInstance.getEditorialCrush()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getEditorialCrush")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getEditorialCrush")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentsEditorialCrushResponse**](ContentsEditorialCrushResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEditorialList"></a>
# **getEditorialList**
> ContentEditorialListResponse getEditorialList(limit)

Get editorial post list

Retrieve the last editorial posts

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val limit : String = limit_example // String | Post number limit
try {
    val result : ContentEditorialListResponse = apiInstance.getEditorialList(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getEditorialList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getEditorialList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| Post number limit |

### Return type

[**ContentEditorialListResponse**](ContentEditorialListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMainMerchandizing"></a>
# **getMainMerchandizing**
> ContentsMainMerchandizingResponse getMainMerchandizing()

Main merchandizing

Returns main-merchandizing block for homepage

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : ContentsMainMerchandizingResponse = apiInstance.getMainMerchandizing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getMainMerchandizing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getMainMerchandizing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentsMainMerchandizingResponse**](ContentsMainMerchandizingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOfflineWelcomeVoucher"></a>
# **getOfflineWelcomeVoucher**
> WelcomeVoucherResponse getOfflineWelcomeVoucher()

Retrieve the welcome voucher

Returns the welcome voucher if signed-in user is eligible to the welcome program. The welcome voucher is related to the site and is only allowed for first purchasing customers. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : WelcomeVoucherResponse = apiInstance.getOfflineWelcomeVoucher()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getOfflineWelcomeVoucher")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getOfflineWelcomeVoucher")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WelcomeVoucherResponse**](WelcomeVoucherResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageIdContent"></a>
# **getPageIdContent**
> ContentPageTypeResponse getPageIdContent(pageId, xDeviceBrand, xDeviceType, xSupportType, xLangCode, xCountry, version)

Get content for a page by its ID with the cms project

Get content for a page by its ID with the cms project 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val pageId : String = pageId_example // String | url of a page ( not of type home ) to retrieve in cms
val xDeviceBrand : String = xDeviceBrand_example // String | brand of the device being used ( ios || android || other )
val xDeviceType : String = xDeviceType_example // String | type of the device ( smartphone || desktop || tablet )
val xSupportType : String = xSupportType_example // String | suppport being used ( app || web )
val xLangCode : String = xLangCode_example // String | lang being used ( fr_fr || en_en || de_de ... )
val xCountry : String = xCountry_example // String | country selected ( FR || EN || UK ... )
val version : String = version_example // String | 
try {
    val result : ContentPageTypeResponse = apiInstance.getPageIdContent(pageId, xDeviceBrand, xDeviceType, xSupportType, xLangCode, xCountry, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getPageIdContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getPageIdContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| url of a page ( not of type home ) to retrieve in cms |
 **xDeviceBrand** | **String**| brand of the device being used ( ios || android || other ) |
 **xDeviceType** | **String**| type of the device ( smartphone || desktop || tablet ) |
 **xSupportType** | **String**| suppport being used ( app || web ) |
 **xLangCode** | **String**| lang being used ( fr_fr || en_en || de_de ... ) |
 **xCountry** | **String**| country selected ( FR || EN || UK ... ) |
 **version** | **String**|  | [optional]

### Return type

[**ContentPageTypeResponse**](ContentPageTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageTypeContent"></a>
# **getPageTypeContent**
> ContentPageTypeResponse getPageTypeContent(pageType, xDeviceBrand, xDeviceType, xSupportType, xLangCode, xCountry, version)

Get content for a page type with the cms project

Get content for a page type with the cms project 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val pageType : String = pageType_example // String | page type to retrieve
val xDeviceBrand : String = xDeviceBrand_example // String | brand of the device being used ( ios || android || other )
val xDeviceType : String = xDeviceType_example // String | type of the device ( smartphone || desktop || tablet )
val xSupportType : String = xSupportType_example // String | suppport being used ( app || web )
val xLangCode : String = xLangCode_example // String | lang being used ( fr_fr || en_en || de_de ... )
val xCountry : String = xCountry_example // String | country selected ( FR || EN || UK ... )
val version : String = version_example // String | 
try {
    val result : ContentPageTypeResponse = apiInstance.getPageTypeContent(pageType, xDeviceBrand, xDeviceType, xSupportType, xLangCode, xCountry, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getPageTypeContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getPageTypeContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageType** | **String**| page type to retrieve |
 **xDeviceBrand** | **String**| brand of the device being used ( ios || android || other ) |
 **xDeviceType** | **String**| type of the device ( smartphone || desktop || tablet ) |
 **xSupportType** | **String**| suppport being used ( app || web ) |
 **xLangCode** | **String**| lang being used ( fr_fr || en_en || de_de ... ) |
 **xCountry** | **String**| country selected ( FR || EN || UK ... ) |
 **version** | **String**|  | [optional]

### Return type

[**ContentPageTypeResponse**](ContentPageTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageUrlContent"></a>
# **getPageUrlContent**
> ContentPageTypeResponse getPageUrlContent(pageUrl, xDeviceBrand, xDeviceType, xSupportType, xLangCode, xCountry, version)

Get content for a page type with the cms project

Get content for a page type with the cms project 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val pageUrl : String = pageUrl_example // String | url of a page ( not of type home ) to retrieve in cms
val xDeviceBrand : String = xDeviceBrand_example // String | brand of the device being used ( ios || android || other )
val xDeviceType : String = xDeviceType_example // String | type of the device ( smartphone || desktop || tablet )
val xSupportType : String = xSupportType_example // String | suppport being used ( app || web )
val xLangCode : String = xLangCode_example // String | lang being used ( fr_fr || en_en || de_de ... )
val xCountry : String = xCountry_example // String | country selected ( FR || EN || UK ... )
val version : String = version_example // String | 
try {
    val result : ContentPageTypeResponse = apiInstance.getPageUrlContent(pageUrl, xDeviceBrand, xDeviceType, xSupportType, xLangCode, xCountry, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getPageUrlContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getPageUrlContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageUrl** | **String**| url of a page ( not of type home ) to retrieve in cms |
 **xDeviceBrand** | **String**| brand of the device being used ( ios || android || other ) |
 **xDeviceType** | **String**| type of the device ( smartphone || desktop || tablet ) |
 **xSupportType** | **String**| suppport being used ( app || web ) |
 **xLangCode** | **String**| lang being used ( fr_fr || en_en || de_de ... ) |
 **xCountry** | **String**| country selected ( FR || EN || UK ... ) |
 **version** | **String**|  | [optional]

### Return type

[**ContentPageTypeResponse**](ContentPageTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentMethods"></a>
# **getPaymentMethods**
> PaymentMethodListResponse getPaymentMethods(limit, offset)

List payment methods

Returns list of accepted payment methods for the currently selected site, currency and country. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val limit : Int = 56 // Int | This is the maximum number of objects that may be returned.
val offset : Int = 56 // Int | This offsets the start of each page by the number specified.
try {
    val result : PaymentMethodListResponse = apiInstance.getPaymentMethods(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| This is the maximum number of objects that may be returned. | [optional] [default to 10]
 **offset** | **Int**| This offsets the start of each page by the number specified. | [optional] [default to 0]

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReinsurance"></a>
# **getReinsurance**
> ReinsuranceMoreInformationResponse getReinsurance()

Get helps information on shipping cost and customer fees

Retrieve shipping cost info and customer fees 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : ReinsuranceMoreInformationResponse = apiInstance.getReinsurance()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getReinsurance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getReinsurance")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReinsuranceMoreInformationResponse**](ReinsuranceMoreInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSingleEdito"></a>
# **getSingleEdito**
> ContentsSingleEditoResponse getSingleEdito()

Single edito

Returns single-edito block for homepage

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : ContentsSingleEditoResponse = apiInstance.getSingleEdito()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#getSingleEdito")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#getSingleEdito")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentsSingleEditoResponse**](ContentsSingleEditoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCatalogPages"></a>
# **listCatalogPages**
> ContentsCatalogPageResponse listCatalogPages(path)

List catalog pages

Returns a list of catalog pages for given path. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val path : String = path_example // String | Page path
try {
    val result : ContentsCatalogPageResponse = apiInstance.listCatalogPages(path)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#listCatalogPages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#listCatalogPages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Page path |

### Return type

[**ContentsCatalogPageResponse**](ContentsCatalogPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPromotionalBanners"></a>
# **listPromotionalBanners**
> PromotionalBannerResponse listPromotionalBanners()

Get promotional banners

Returns the active promotional banners for current site and locale. 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
try {
    val result : PromotionalBannerResponse = apiInstance.listPromotionalBanners()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#listPromotionalBanners")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#listPromotionalBanners")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PromotionalBannerResponse**](PromotionalBannerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTypeSize"></a>
# **listTypeSize**
> ContentsTypeSize listTypeSize(idSubcategory)

List type size

Returns list type size by sub category 

### Example
```kotlin
// Import classes:
//import fr.vestiairecollective.network.redesign.infrastructure.*
//import fr.vestiairecollective.network.redesign.model.*

val apiInstance = ContentsService()
val idSubcategory : String = idSubcategory_example // String | Type Size Path
try {
    val result : ContentsTypeSize = apiInstance.listTypeSize(idSubcategory)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentsService#listTypeSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentsService#listTypeSize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idSubcategory** | **String**| Type Size Path |

### Return type

[**ContentsTypeSize**](ContentsTypeSize.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

