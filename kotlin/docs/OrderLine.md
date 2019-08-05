
# OrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**creationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Date of creation of the order line |  [optional]
**duties** | [**Duty**](Duty.md) |  |  [optional]
**buyerFees** | [**Array&lt;BuyerFee&gt;**](BuyerFee.md) |  |  [optional]
**plans** | [**Array&lt;PlanOption&gt;**](PlanOption.md) |  |  [optional]
**product** | [**Product**](Product.md) | [Relationship] Order line&#39;s product | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | orderLine



