# fr.vestiairecollective.network.redesign - Kotlin client library for Atlas API Reference

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://apiv2.vestiairecollective.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsService* | [**getAccount**](docs/AccountsService.md#getaccount) | **GET** accounts/{id} | Retrieve a single user
*AlertsService* | [**createAlert**](docs/AlertsService.md#createalert) | **POST** alerts | Create an alert
*AlertsService* | [**deleteAlert**](docs/AlertsService.md#deletealert) | **DELETE** alerts/{id} | Delete an alert
*AlertsService* | [**getAlert**](docs/AlertsService.md#getalert) | **GET** alerts/{id} | Retrieve an alert
*AlertsService* | [**getProductsAverageMatching**](docs/AlertsService.md#getproductsaveragematching) | **GET** alerts/average-matching-products | Average number of new products
*AlertsService* | [**listAlerts**](docs/AlertsService.md#listalerts) | **GET** alerts | List alerts
*BrandsService* | [**dislikeBrand**](docs/BrandsService.md#dislikebrand) | **DELETE** brands/{id}/likes | Dislike a brand
*BrandsService* | [**listBrands**](docs/BrandsService.md#listbrands) | **GET** brands | List brands
*BreadcrumbsService* | [**getBreadcrumb**](docs/BreadcrumbsService.md#getbreadcrumb) | **GET** breadcrumbs | Get breadcrumb
*CampaignsService* | [**getCampaign**](docs/CampaignsService.md#getcampaign) | **GET** campaigns/{id} | Get a campaign by id
*CatalogService* | [**getFacetLinks**](docs/CatalogService.md#getfacetlinks) | **GET** catalog/facet-links | SEO facet links
*CommentsService* | [**likeComment**](docs/CommentsService.md#likecomment) | **POST** comments/{id}/likes | Like a comment
*CommentsService* | [**unlikeComment**](docs/CommentsService.md#unlikecomment) | **DELETE** comments/{id}/likes | Unlike a comment
*ContentsService* | [**getCategories**](docs/ContentsService.md#getcategories) | **GET** contents/categories | Homepage categories
*ContentsService* | [**getCustomerCare**](docs/ContentsService.md#getcustomercare) | **GET** contents/customer-care | Get customer care Info
*ContentsService* | [**getDeeplink**](docs/ContentsService.md#getdeeplink) | **GET** contents/deeplink/{url} | Get deeplink for an url
*ContentsService* | [**getEditorialCrush**](docs/ContentsService.md#geteditorialcrush) | **GET** contents/editorial-crush | Editorial crush
*ContentsService* | [**getEditorialList**](docs/ContentsService.md#geteditoriallist) | **GET** contents/editorial-list | Get editorial post list
*ContentsService* | [**getMainMerchandizing**](docs/ContentsService.md#getmainmerchandizing) | **GET** contents/main-merchandizing | Main merchandizing
*ContentsService* | [**getOfflineWelcomeVoucher**](docs/ContentsService.md#getofflinewelcomevoucher) | **GET** contents/welcome-voucher | Retrieve the welcome voucher
*ContentsService* | [**getPageIdContent**](docs/ContentsService.md#getpageidcontent) | **GET** contents/cms/pages/{pageId} | Get content for a page by its ID with the cms project
*ContentsService* | [**getPageTypeContent**](docs/ContentsService.md#getpagetypecontent) | **GET** contents/cms/pages/type/{pageType} | Get content for a page type with the cms project
*ContentsService* | [**getPageUrlContent**](docs/ContentsService.md#getpageurlcontent) | **GET** contents/cms/pages/url/{pageUrl} | Get content for a page type with the cms project
*ContentsService* | [**getPaymentMethods**](docs/ContentsService.md#getpaymentmethods) | **GET** contents/payment-methods | List payment methods
*ContentsService* | [**getReinsurance**](docs/ContentsService.md#getreinsurance) | **GET** contents/reinsurance | Get helps information on shipping cost and customer fees
*ContentsService* | [**getSingleEdito**](docs/ContentsService.md#getsingleedito) | **GET** contents/single-edito | Single edito
*ContentsService* | [**listCatalogPages**](docs/ContentsService.md#listcatalogpages) | **GET** contents/catalog-pages | List catalog pages
*ContentsService* | [**listPromotionalBanners**](docs/ContentsService.md#listpromotionalbanners) | **GET** contents/promotional-banners | Get promotional banners
*ContentsService* | [**listTypeSize**](docs/ContentsService.md#listtypesize) | **GET** contents/type-size | List type size
*NegotiationsService* | [**addNegotiationEvent**](docs/NegotiationsService.md#addnegotiationevent) | **POST** negotiations/{id}/events | Add an event to a negotiation
*NegotiationsService* | [**getNegotiation**](docs/NegotiationsService.md#getnegotiation) | **GET** negotiations/{id} | Returns a single negotiation
*NegotiationsService* | [**listNegotiations**](docs/NegotiationsService.md#listnegotiations) | **GET** negotiations | Get a list of negotiations
*NewsletterSubscribersService* | [**subscribeNewsletter**](docs/NewsletterSubscribersService.md#subscribenewsletter) | **POST** newsletter-subscribers | Register an email to the newsletter
*NotificationsService* | [**listNotifications**](docs/NotificationsService.md#listnotifications) | **GET** notifications | Returns a list of notifications
*NotificationsService* | [**updateNotification**](docs/NotificationsService.md#updatenotification) | **PATCH** notifications/{id} | Mark notification Id as viewed or read (default read)
*NotificationsService* | [**updateNotifications**](docs/NotificationsService.md#updatenotifications) | **PATCH** notifications | Notifications Ids to mark as viewed
*OrdersService* | [**addProductToCart**](docs/OrdersService.md#addproducttocart) | **POST** orders/current/order-lines | Add product to user's cart
*OrdersService* | [**getCart**](docs/OrdersService.md#getcart) | **GET** orders/current | Returns cart content
*OrdersService* | [**removeProductFromCart**](docs/OrdersService.md#removeproductfromcart) | **DELETE** orders/current/order-lines/{id} | Remove product from user's cart
*OrdersService* | [**updateProductDelivery**](docs/OrdersService.md#updateproductdelivery) | **POST** orders/current/order-lines/{id}/{shippingOption} | Update product delivery method from user's cart
*PaymentMethodsService* | [**getPaymentMethod**](docs/PaymentMethodsService.md#getpaymentmethod) | **GET** payment-methods/{id} | return a specific payment method
*PaymentMethodsService* | [**listPaymentMethods**](docs/PaymentMethodsService.md#listpaymentmethods) | **GET** payment-methods | List payment methods
*PricesService* | [**getPrice**](docs/PricesService.md#getprice) | **GET** prices | pvn estimated
*ProductsService* | [**addPhotoProduct**](docs/ProductsService.md#addphotoproduct) | **POST** products/{id}/photo | Add photo to a product
*ProductsService* | [**createNegotiation**](docs/ProductsService.md#createnegotiation) | **POST** products/{productId}/negotiations | Start a new negotiation
*ProductsService* | [**createProductComment**](docs/ProductsService.md#createproductcomment) | **POST** products/{productId}/comments | Add a comment on a product
*ProductsService* | [**deletePriceDrop**](docs/ProductsService.md#deletepricedrop) | **DELETE** products/{productId}/price-drop-alerts | Product Price drop unfollow
*ProductsService* | [**getActiveNegotiation**](docs/ProductsService.md#getactivenegotiation) | **GET** products/{productId}/active-negotiation | Returns the active negotiation for currently signed-in buyer.
*ProductsService* | [**getProduct**](docs/ProductsService.md#getproduct) | **GET** products/{id} | Returns a single product
*ProductsService* | [**getProductConditionDetails**](docs/ProductsService.md#getproductconditiondetails) | **GET** products/{id}/condition-details | Get product condition levels
*ProductsService* | [**getProductReservation**](docs/ProductsService.md#getproductreservation) | **GET** products/{id}/reservation | Check product reservation status
*ProductsService* | [**getProductShippingInformation**](docs/ProductsService.md#getproductshippinginformation) | **GET** products/{id}/shippings | Get product shipping information
*ProductsService* | [**getShippingVoucher**](docs/ProductsService.md#getshippingvoucher) | **GET** products/{id}/shipping-voucher | Return shipping voucher path of sold product
*ProductsService* | [**likeProduct**](docs/ProductsService.md#likeproduct) | **POST** products/{id}/likes | Like a product
*ProductsService* | [**listAssociatedProducts**](docs/ProductsService.md#listassociatedproducts) | **GET** products/{id}/associated-products | List associated products
*ProductsService* | [**listProductComents**](docs/ProductsService.md#listproductcoments) | **GET** products/{productId}/comments | List a product comments
*ProductsService* | [**listSimilarProducts**](docs/ProductsService.md#listsimilarproducts) | **GET** products/{id}/similar-products | List similar products
*ProductsService* | [**reportProduct**](docs/ProductsService.md#reportproduct) | **POST** products/{id}/reports | Report a product
*ProductsService* | [**translateProduct**](docs/ProductsService.md#translateproduct) | **GET** products/{productId}/translation | translate a description
*ProductsService* | [**translation**](docs/ProductsService.md#translation) | **GET** products/{productId}/comments/{commentId}/translation | translate a comment
*ProductsService* | [**unlikeProduct**](docs/ProductsService.md#unlikeproduct) | **DELETE** products/{id}/likes | Unlike a product
*ResetPasswordRequestsService* | [**requestPasswordReset**](docs/ResetPasswordRequestsService.md#requestpasswordreset) | **POST** reset-password-requests | Send an e-mail to the user if the email exist
*SessionsService* | [**createSession**](docs/SessionsService.md#createsession) | **POST** sessions | Log-in (create a new session)
*SessionsService* | [**deleteSession**](docs/SessionsService.md#deletesession) | **DELETE** sessions/{sessionId} | Delete an user session (log-out)
*ShippingMethodsService* | [**getShippingMethod**](docs/ShippingMethodsService.md#getshippingmethod) | **GET** shipping-methods/{id} | Retrieve a shipping method
*ShippingMethodsService* | [**listShippingMethods**](docs/ShippingMethodsService.md#listshippingmethods) | **GET** shipping-methods | List shipping methods
*ShippingPlanService* | [**getShippingEligibility**](docs/ShippingPlanService.md#getshippingeligibility) | **GET** shipping-plan/eligibility | Shipping Eligibility
*UsersService* | [**addProductToWishlist**](docs/UsersService.md#addproducttowishlist) | **POST** users/me/wishlist | Add product to wishlist
*UsersService* | [**follow**](docs/UsersService.md#follow) | **POST** users/{id}/followers | Follow a user
*UsersService* | [**getCounters**](docs/UsersService.md#getcounters) | **GET** users/me/counters | Get notification, wishlist ... count for header display
*UsersService* | [**getFollowers**](docs/UsersService.md#getfollowers) | **GET** users/{id}/followers | List followers of a user
*UsersService* | [**getLikes**](docs/UsersService.md#getlikes) | **GET** users/me/likes | Liked items
*UsersService* | [**getMemberFollows**](docs/UsersService.md#getmemberfollows) | **GET** users/{id}/member-follows | Members follow
*UsersService* | [**getOwnCounters**](docs/UsersService.md#getowncounters) | **GET** users/me/products/count | Get user's own counters
*UsersService* | [**getOwnProductsCurationInformation**](docs/UsersService.md#getownproductscurationinformation) | **GET** users/me/products/curation/information | Get users products waiting more information
*UsersService* | [**getOwnProductsCurationNegotiation**](docs/UsersService.md#getownproductscurationnegotiation) | **GET** users/me/products/curation/negotiation | Get users products with open mmao
*UsersService* | [**getOwnProductsCurationPicture**](docs/UsersService.md#getownproductscurationpicture) | **GET** users/me/products/curation/picture | Get users products waiting new photos
*UsersService* | [**getOwnProductsCurationRefused**](docs/UsersService.md#getownproductscurationrefused) | **GET** users/me/products/curation-refused | Get users products refused by vestiaire
*UsersService* | [**getOwnProductsCurationValidation**](docs/UsersService.md#getownproductscurationvalidation) | **GET** users/me/products/curation/validation | Get users products waiting validation from vestiaire
*UsersService* | [**getOwnProductsExpired**](docs/UsersService.md#getownproductsexpired) | **GET** users/me/products/expired | Get users products expired
*UsersService* | [**getOwnProductsOnSale**](docs/UsersService.md#getownproductsonsale) | **GET** users/me/products/on-sale | Get users products on sale
*UsersService* | [**getOwnProductsPictureCutoff**](docs/UsersService.md#getownproductspicturecutoff) | **GET** users/me/products/picture-cutoff | Get users products with picture in treatment
*UsersService* | [**getOwnProductsPriceDrop**](docs/UsersService.md#getownproductspricedrop) | **GET** users/me/products/price-drop | Get users products on price drop
*UsersService* | [**getOwnProductsPriceOfferReceived**](docs/UsersService.md#getownproductspriceofferreceived) | **GET** users/me/products/price-offer-received | Get users products with price offer received
*UsersService* | [**getOwnProductsSaleRemoved**](docs/UsersService.md#getownproductssaleremoved) | **GET** users/me/products/sale-removed | Get users products removed
*UsersService* | [**getOwnProductsSold**](docs/UsersService.md#getownproductssold) | **GET** users/me/products/sold | Get users products solded
*UsersService* | [**getOwnProductsUnreceived**](docs/UsersService.md#getownproductsunreceived) | **GET** users/me/products/unreceived | Get users products unreceived by vestiaire
*UsersService* | [**getPriceDrop**](docs/UsersService.md#getpricedrop) | **GET** users/me/price-drop-alerts | Price drop follow
*UsersService* | [**getUser**](docs/UsersService.md#getuser) | **GET** users/{id} | Retrieve a single user
*UsersService* | [**getUserSettings**](docs/UsersService.md#getusersettings) | **GET** users/me/settings | Returns settings
*UsersService* | [**getViewedProducts**](docs/UsersService.md#getviewedproducts) | **GET** users/{id}/viewed-products | List recently viewed products
*UsersService* | [**getWallet**](docs/UsersService.md#getwallet) | **GET** users/me/wallet | Retrieve current user's wallet
*UsersService* | [**getWelcomeVoucher**](docs/UsersService.md#getwelcomevoucher) | **GET** users/me/welcome-voucher | Retrieve the welcome voucher
*UsersService* | [**getWishesProduct**](docs/UsersService.md#getwishesproduct) | **GET** users/me/wishes | user wishes product
*UsersService* | [**getWishlist**](docs/UsersService.md#getwishlist) | **GET** users/{id}/wishlist | Returns user's wishlist
*UsersService* | [**listLikeProduct**](docs/UsersService.md#listlikeproduct) | **GET** users/{id}/liked-products | Returns user's liked product list
*UsersService* | [**registerUser**](docs/UsersService.md#registeruser) | **POST** users | Register a new user
*UsersService* | [**removeProductFromWishlist**](docs/UsersService.md#removeproductfromwishlist) | **DELETE** users/me/wishlist/{idProduct} | Remove product from wishlist
*UsersService* | [**unfollow**](docs/UsersService.md#unfollow) | **DELETE** users/{id}/followers/me | Unfollow a user
*UsersService* | [**updateUserSettings**](docs/UsersService.md#updateusersettings) | **PATCH** users/me/settings | Update settings


<a name="documentation-for-models"></a>
## Documentation for Models

 - [fr.vestiairecollective.network.redesign.model.Account](docs/Account.md)
 - [fr.vestiairecollective.network.redesign.model.AccountBadge](docs/AccountBadge.md)
 - [fr.vestiairecollective.network.redesign.model.AccountCivility](docs/AccountCivility.md)
 - [fr.vestiairecollective.network.redesign.model.AccountStatistics](docs/AccountStatistics.md)
 - [fr.vestiairecollective.network.redesign.model.Address](docs/Address.md)
 - [fr.vestiairecollective.network.redesign.model.Alert](docs/Alert.md)
 - [fr.vestiairecollective.network.redesign.model.AlertCategory](docs/AlertCategory.md)
 - [fr.vestiairecollective.network.redesign.model.AlertCriterion](docs/AlertCriterion.md)
 - [fr.vestiairecollective.network.redesign.model.AlertCriterionKey](docs/AlertCriterionKey.md)
 - [fr.vestiairecollective.network.redesign.model.AlertListResponse](docs/AlertListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.AlertResponse](docs/AlertResponse.md)
 - [fr.vestiairecollective.network.redesign.model.AlertSettings](docs/AlertSettings.md)
 - [fr.vestiairecollective.network.redesign.model.AmountInWholeNumber](docs/AmountInWholeNumber.md)
 - [fr.vestiairecollective.network.redesign.model.AverageProducts](docs/AverageProducts.md)
 - [fr.vestiairecollective.network.redesign.model.AverageProductsResponse](docs/AverageProductsResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Brand](docs/Brand.md)
 - [fr.vestiairecollective.network.redesign.model.BrandListResponse](docs/BrandListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Breadcrumb](docs/Breadcrumb.md)
 - [fr.vestiairecollective.network.redesign.model.BreadcrumbResponse](docs/BreadcrumbResponse.md)
 - [fr.vestiairecollective.network.redesign.model.BuyerFee](docs/BuyerFee.md)
 - [fr.vestiairecollective.network.redesign.model.Campaign](docs/Campaign.md)
 - [fr.vestiairecollective.network.redesign.model.CampaignResponse](docs/CampaignResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Carrier](docs/Carrier.md)
 - [fr.vestiairecollective.network.redesign.model.CatalogFacet](docs/CatalogFacet.md)
 - [fr.vestiairecollective.network.redesign.model.CatalogFacetLink](docs/CatalogFacetLink.md)
 - [fr.vestiairecollective.network.redesign.model.CatalogPage](docs/CatalogPage.md)
 - [fr.vestiairecollective.network.redesign.model.Category](docs/Category.md)
 - [fr.vestiairecollective.network.redesign.model.Color](docs/Color.md)
 - [fr.vestiairecollective.network.redesign.model.Comment](docs/Comment.md)
 - [fr.vestiairecollective.network.redesign.model.CommentForm](docs/CommentForm.md)
 - [fr.vestiairecollective.network.redesign.model.CommentListResponse](docs/CommentListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.CommentResponse](docs/CommentResponse.md)
 - [fr.vestiairecollective.network.redesign.model.CommentsTranslationResponse](docs/CommentsTranslationResponse.md)
 - [fr.vestiairecollective.network.redesign.model.CommentsTranslationResponseData](docs/CommentsTranslationResponseData.md)
 - [fr.vestiairecollective.network.redesign.model.Commission](docs/Commission.md)
 - [fr.vestiairecollective.network.redesign.model.Condition](docs/Condition.md)
 - [fr.vestiairecollective.network.redesign.model.ContentDeeplinkResponse](docs/ContentDeeplinkResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentEditorialListResponse](docs/ContentEditorialListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentPageTypeResponse](docs/ContentPageTypeResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsBlock](docs/ContentsBlock.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsBlockContent](docs/ContentsBlockContent.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsBlockContentDetail](docs/ContentsBlockContentDetail.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCarouselItem](docs/ContentsCarouselItem.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCatalogPageContent](docs/ContentsCatalogPageContent.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCatalogPageResponse](docs/ContentsCatalogPageResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCategories](docs/ContentsCategories.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCategoriesBlock](docs/ContentsCategoriesBlock.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCategoriesResponse](docs/ContentsCategoriesResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCustomerCare](docs/ContentsCustomerCare.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsCustomerCareResponse](docs/ContentsCustomerCareResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsDeeplink](docs/ContentsDeeplink.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsEditorialContent](docs/ContentsEditorialContent.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsEditorialCrush](docs/ContentsEditorialCrush.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsEditorialCrushResponse](docs/ContentsEditorialCrushResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsEditorialList](docs/ContentsEditorialList.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsLanguageBlock](docs/ContentsLanguageBlock.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsLocalizedPath](docs/ContentsLocalizedPath.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsMainMerchandizing](docs/ContentsMainMerchandizing.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsMainMerchandizingBaseline](docs/ContentsMainMerchandizingBaseline.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsMainMerchandizingResponse](docs/ContentsMainMerchandizingResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsPageIndexation](docs/ContentsPageIndexation.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsPageMetadata](docs/ContentsPageMetadata.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsPageTypeContent](docs/ContentsPageTypeContent.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsPromotionalBanner](docs/ContentsPromotionalBanner.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsReinsuranceItem](docs/ContentsReinsuranceItem.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsRoute](docs/ContentsRoute.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsRouteParameter](docs/ContentsRouteParameter.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsSingleEdito](docs/ContentsSingleEdito.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsSingleEditoResponse](docs/ContentsSingleEditoResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ContentsTypeSize](docs/ContentsTypeSize.md)
 - [fr.vestiairecollective.network.redesign.model.CounterResponse](docs/CounterResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Country](docs/Country.md)
 - [fr.vestiairecollective.network.redesign.model.Credentials](docs/Credentials.md)
 - [fr.vestiairecollective.network.redesign.model.Currency](docs/Currency.md)
 - [fr.vestiairecollective.network.redesign.model.DeliveryTime](docs/DeliveryTime.md)
 - [fr.vestiairecollective.network.redesign.model.Duty](docs/Duty.md)
 - [fr.vestiairecollective.network.redesign.model.EmptyResponse](docs/EmptyResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ErrorDetail](docs/ErrorDetail.md)
 - [fr.vestiairecollective.network.redesign.model.ErrorResponse](docs/ErrorResponse.md)
 - [fr.vestiairecollective.network.redesign.model.FacetLinksResponse](docs/FacetLinksResponse.md)
 - [fr.vestiairecollective.network.redesign.model.HeaderBadgeDetail](docs/HeaderBadgeDetail.md)
 - [fr.vestiairecollective.network.redesign.model.I18n](docs/I18n.md)
 - [fr.vestiairecollective.network.redesign.model.I18nResponse](docs/I18nResponse.md)
 - [fr.vestiairecollective.network.redesign.model.InlineResponse201](docs/InlineResponse201.md)
 - [fr.vestiairecollective.network.redesign.model.Language](docs/Language.md)
 - [fr.vestiairecollective.network.redesign.model.LikedItemsResponse](docs/LikedItemsResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Material](docs/Material.md)
 - [fr.vestiairecollective.network.redesign.model.Mechanism](docs/Mechanism.md)
 - [fr.vestiairecollective.network.redesign.model.MeshLink](docs/MeshLink.md)
 - [fr.vestiairecollective.network.redesign.model.MetasCount](docs/MetasCount.md)
 - [fr.vestiairecollective.network.redesign.model.MetasDisplayCount](docs/MetasDisplayCount.md)
 - [fr.vestiairecollective.network.redesign.model.MetasLimit](docs/MetasLimit.md)
 - [fr.vestiairecollective.network.redesign.model.MetasOffset](docs/MetasOffset.md)
 - [fr.vestiairecollective.network.redesign.model.Model](docs/Model.md)
 - [fr.vestiairecollective.network.redesign.model.Negotiation](docs/Negotiation.md)
 - [fr.vestiairecollective.network.redesign.model.NegotiationEvent](docs/NegotiationEvent.md)
 - [fr.vestiairecollective.network.redesign.model.NegotiationEventRequest](docs/NegotiationEventRequest.md)
 - [fr.vestiairecollective.network.redesign.model.NegotiationListResponse](docs/NegotiationListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.NegotiationRequest](docs/NegotiationRequest.md)
 - [fr.vestiairecollective.network.redesign.model.NegotiationResponse](docs/NegotiationResponse.md)
 - [fr.vestiairecollective.network.redesign.model.NewsletterRegistration](docs/NewsletterRegistration.md)
 - [fr.vestiairecollective.network.redesign.model.NewsletterRegistrationResponse](docs/NewsletterRegistrationResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Notification](docs/Notification.md)
 - [fr.vestiairecollective.network.redesign.model.NotificationChannel](docs/NotificationChannel.md)
 - [fr.vestiairecollective.network.redesign.model.NotificationFrequency](docs/NotificationFrequency.md)
 - [fr.vestiairecollective.network.redesign.model.NotificationListResponse](docs/NotificationListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.NotificationUpdateRequest](docs/NotificationUpdateRequest.md)
 - [fr.vestiairecollective.network.redesign.model.Order](docs/Order.md)
 - [fr.vestiairecollective.network.redesign.model.OrderAddProductRequest](docs/OrderAddProductRequest.md)
 - [fr.vestiairecollective.network.redesign.model.OrderLine](docs/OrderLine.md)
 - [fr.vestiairecollective.network.redesign.model.OrderLineIdResponse](docs/OrderLineIdResponse.md)
 - [fr.vestiairecollective.network.redesign.model.OrderPlanUpdate](docs/OrderPlanUpdate.md)
 - [fr.vestiairecollective.network.redesign.model.OrderPlanUpdateResponse](docs/OrderPlanUpdateResponse.md)
 - [fr.vestiairecollective.network.redesign.model.OrderResponse](docs/OrderResponse.md)
 - [fr.vestiairecollective.network.redesign.model.OwnCounterResponse](docs/OwnCounterResponse.md)
 - [fr.vestiairecollective.network.redesign.model.PaginationMetadata](docs/PaginationMetadata.md)
 - [fr.vestiairecollective.network.redesign.model.Pattern](docs/Pattern.md)
 - [fr.vestiairecollective.network.redesign.model.PaymentMethod](docs/PaymentMethod.md)
 - [fr.vestiairecollective.network.redesign.model.PaymentMethodListResponse](docs/PaymentMethodListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Picture](docs/Picture.md)
 - [fr.vestiairecollective.network.redesign.model.Plan](docs/Plan.md)
 - [fr.vestiairecollective.network.redesign.model.PlanOption](docs/PlanOption.md)
 - [fr.vestiairecollective.network.redesign.model.PlanService](docs/PlanService.md)
 - [fr.vestiairecollective.network.redesign.model.Price](docs/Price.md)
 - [fr.vestiairecollective.network.redesign.model.PriceDropResponse](docs/PriceDropResponse.md)
 - [fr.vestiairecollective.network.redesign.model.PriceResponse](docs/PriceResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Product](docs/Product.md)
 - [fr.vestiairecollective.network.redesign.model.ProductConditionDetailsResponse](docs/ProductConditionDetailsResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ProductConditionLevel](docs/ProductConditionLevel.md)
 - [fr.vestiairecollective.network.redesign.model.ProductInstallment](docs/ProductInstallment.md)
 - [fr.vestiairecollective.network.redesign.model.ProductListResponse](docs/ProductListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ProductListResponse1](docs/ProductListResponse1.md)
 - [fr.vestiairecollective.network.redesign.model.ProductMeasurement](docs/ProductMeasurement.md)
 - [fr.vestiairecollective.network.redesign.model.ProductMeshLinks](docs/ProductMeshLinks.md)
 - [fr.vestiairecollective.network.redesign.model.ProductPackaging](docs/ProductPackaging.md)
 - [fr.vestiairecollective.network.redesign.model.ProductReport](docs/ProductReport.md)
 - [fr.vestiairecollective.network.redesign.model.ProductReportResponse](docs/ProductReportResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ProductReservation](docs/ProductReservation.md)
 - [fr.vestiairecollective.network.redesign.model.ProductReservationResponse](docs/ProductReservationResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ProductResponse](docs/ProductResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ProductTag](docs/ProductTag.md)
 - [fr.vestiairecollective.network.redesign.model.ProductTranslationResponse](docs/ProductTranslationResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ProductTranslationResponseData](docs/ProductTranslationResponseData.md)
 - [fr.vestiairecollective.network.redesign.model.PromotionalBannerResponse](docs/PromotionalBannerResponse.md)
 - [fr.vestiairecollective.network.redesign.model.RateType](docs/RateType.md)
 - [fr.vestiairecollective.network.redesign.model.Reinsurance](docs/Reinsurance.md)
 - [fr.vestiairecollective.network.redesign.model.ReinsuranceMoreInformationResponse](docs/ReinsuranceMoreInformationResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ResetPasswordRequest](docs/ResetPasswordRequest.md)
 - [fr.vestiairecollective.network.redesign.model.ResetPasswordRequestResponse](docs/ResetPasswordRequestResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ResponsesEmptyResponse](docs/ResponsesEmptyResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Season](docs/Season.md)
 - [fr.vestiairecollective.network.redesign.model.Session](docs/Session.md)
 - [fr.vestiairecollective.network.redesign.model.SessionResponse](docs/SessionResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Shipping](docs/Shipping.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingCost](docs/ShippingCost.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingFees](docs/ShippingFees.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingMethod](docs/ShippingMethod.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingMethodListResponse](docs/ShippingMethodListResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingMethodResponse](docs/ShippingMethodResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingPlan](docs/ShippingPlan.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingPlanResponse](docs/ShippingPlanResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingResponse](docs/ShippingResponse.md)
 - [fr.vestiairecollective.network.redesign.model.ShippingVoucherResponse](docs/ShippingVoucherResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Size](docs/Size.md)
 - [fr.vestiairecollective.network.redesign.model.Subcategory](docs/Subcategory.md)
 - [fr.vestiairecollective.network.redesign.model.Unit](docs/Unit.md)
 - [fr.vestiairecollective.network.redesign.model.Universe](docs/Universe.md)
 - [fr.vestiairecollective.network.redesign.model.Url](docs/Url.md)
 - [fr.vestiairecollective.network.redesign.model.User](docs/User.md)
 - [fr.vestiairecollective.network.redesign.model.UserApp](docs/UserApp.md)
 - [fr.vestiairecollective.network.redesign.model.UserBadge](docs/UserBadge.md)
 - [fr.vestiairecollective.network.redesign.model.UserCivility](docs/UserCivility.md)
 - [fr.vestiairecollective.network.redesign.model.UserCreate](docs/UserCreate.md)
 - [fr.vestiairecollective.network.redesign.model.UserFollowResponse](docs/UserFollowResponse.md)
 - [fr.vestiairecollective.network.redesign.model.UserFollows](docs/UserFollows.md)
 - [fr.vestiairecollective.network.redesign.model.UserGoalThreshold](docs/UserGoalThreshold.md)
 - [fr.vestiairecollective.network.redesign.model.UserLikes](docs/UserLikes.md)
 - [fr.vestiairecollective.network.redesign.model.UserOwnCounters](docs/UserOwnCounters.md)
 - [fr.vestiairecollective.network.redesign.model.UserPricedrop](docs/UserPricedrop.md)
 - [fr.vestiairecollective.network.redesign.model.UserResponse](docs/UserResponse.md)
 - [fr.vestiairecollective.network.redesign.model.UserResponse1](docs/UserResponse1.md)
 - [fr.vestiairecollective.network.redesign.model.UserSellerRating](docs/UserSellerRating.md)
 - [fr.vestiairecollective.network.redesign.model.UserSellerRatingGoals](docs/UserSellerRatingGoals.md)
 - [fr.vestiairecollective.network.redesign.model.UserSellerRatingGoalsTags](docs/UserSellerRatingGoalsTags.md)
 - [fr.vestiairecollective.network.redesign.model.UserSocial](docs/UserSocial.md)
 - [fr.vestiairecollective.network.redesign.model.UserSocialResponse](docs/UserSocialResponse.md)
 - [fr.vestiairecollective.network.redesign.model.UserStatistics](docs/UserStatistics.md)
 - [fr.vestiairecollective.network.redesign.model.UserThreshold](docs/UserThreshold.md)
 - [fr.vestiairecollective.network.redesign.model.UserWishes](docs/UserWishes.md)
 - [fr.vestiairecollective.network.redesign.model.ViewedNotificationIds](docs/ViewedNotificationIds.md)
 - [fr.vestiairecollective.network.redesign.model.Wallet](docs/Wallet.md)
 - [fr.vestiairecollective.network.redesign.model.WalletResponse](docs/WalletResponse.md)
 - [fr.vestiairecollective.network.redesign.model.Warehouse](docs/Warehouse.md)
 - [fr.vestiairecollective.network.redesign.model.WelcomeVoucher](docs/WelcomeVoucher.md)
 - [fr.vestiairecollective.network.redesign.model.WelcomeVoucherResponse](docs/WelcomeVoucherResponse.md)
 - [fr.vestiairecollective.network.redesign.model.WishesResponse](docs/WishesResponse.md)
 - [fr.vestiairecollective.network.redesign.model.WishlistAddRequest](docs/WishlistAddRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: __session
- **Location**: HTTP header

