
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**creationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Order creation date | 
**itemsNumber** | **Int** | Order items count | 
**itemsAmount** | [**Price**](Price.md) |  |  [optional]
**dutiesAmount** | [**Price**](Price.md) |  |  [optional]
**buyerFeesAmount** | [**Price**](Price.md) |  |  [optional]
**shippingAmount** | [**Price**](Price.md) |  |  [optional]
**totalAmount** | [**Price**](Price.md) |  | 
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**subTotalCostBeforeShipping** | [**Price**](Price.md) |  |  [optional]
**buyer** | [**User**](User.md) | [Relationship] Order client |  [optional]
**orderLines** | [**Array&lt;OrderLine&gt;**](OrderLine.md) | [Relationship] Order items list |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | order



