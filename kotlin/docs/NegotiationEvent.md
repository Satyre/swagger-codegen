
# NegotiationEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**action** | [**inline**](#Action) | Type of event. Can be one of the following:   - offer: offer or counter-offer   - accept: acceptation of an offer   - reject: rejection of an offer, without making a counter-offer   - order: action of buying the product (after payment and anti-fraud controls)   - external: external actions that directly impact the negotiation (for example: ! product bought by someone else)  | 
**creationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Date when event was created | 
**createdBy** | [**inline**](#CreatedBy) | Role of the user who created the event | 
**userMessage** | [**String**](String.md) | Displayable translated message that describes the status of the negotiation | 
**price** | [**Price**](Price.md) | Current offer price | 
**sellerPvnPrice** | [**Price**](Price.md) | PVN (Seller share). Only if the caller if the seller |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | negotiationEvent


<a name="Action"></a>
## Enum: action
Name | Value
---- | -----
action | offer, accept, reject, order, external


<a name="CreatedBy"></a>
## Enum: createdBy
Name | Value
---- | -----
createdBy | seller, buyer, vc



