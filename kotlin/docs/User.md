
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**firstname** | [**String**](String.md) | user firstname | 
**username** | [**String**](String.md) | User name |  [optional]
**email** | [**String**](String.md) | user email |  [optional]
**hasWallet** | **Boolean** | a flag which shows if a client has a has a wallet |  [optional]
**picture** | [**Picture**](Picture.md) |  |  [optional]
**cover** | [**Picture**](Picture.md) |  |  [optional]
**url** | [**Url**](Url.md) |  |  [optional]
**birthDate** | [**java.util.Calendar**](java.util.Calendar.md) | Birth date (AAAA-MM-DDT00:00:00Z) |  [optional]
**country** | [**String**](String.md) | Seller country |  [optional]
**inscriptionDate** | [**java.util.Calendar**](java.util.Calendar.md) | Inscription date (AAAA-MM-DDT00:00:00Z) |  [optional]
**civility** | [**UserCivility**](UserCivility.md) |  | 
**social** | [**UserSocial**](UserSocial.md) |  |  [optional]
**statistics** | [**UserStatistics**](UserStatistics.md) |  |  [optional]
**sellerRating** | [**UserSellerRating**](UserSellerRating.md) |  |  [optional]
**language** | [**Language**](Language.md) |  | 
**productReporter** | **Boolean** | User right to report a product |  [optional]
**badges** | [**Array&lt;UserBadge&gt;**](UserBadge.md) |  |  [optional]
**apps** | [**Array&lt;UserApp&gt;**](UserApp.md) |  |  [optional]
**internalAccount** | **Boolean** | VC&#39;s Internal Account |  [optional]
**address** | [**Address**](Address.md) | [Relationship] User&#39;s address |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | user



