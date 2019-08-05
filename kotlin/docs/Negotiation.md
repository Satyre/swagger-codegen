
# Negotiation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**creationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Date when negotiation was created | 
**price** | [**Price**](Price.md) | Current price of the negotiation (amount can depends between seller or buyer due to currency rates variations)  | 
**initialPrice** | [**Price**](Price.md) | Initial offer price | 
**minOffer** | [**Price**](Price.md) | Min allowed offer price. New offers should be strictly greater | 
**maxOffer** | [**Price**](Price.md) | Max allowed offer price. New offers should be lower of equals | 
**sellerRemainingOffers** | **Int** | Remaining offer count allowed for seller | 
**buyerRemainingOffers** | **Int** | Remaining offer count allowed for buyer | 
**userMessage** | [**String**](String.md) | Displayable translated message that describes the status of the negotiation | 
**isAccepted** | **Boolean** | A negotiation is accepted if someone has accepted an offer | 
**isClosed** | **Boolean** | A negotiation is closed if no actions are available for anyone | 
**userSubMessage** | [**String**](String.md) | Displayable translated message that gives detail of the negotiation |  [optional]
**expirationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Date when negotiation expires |  [optional]
**sellerPvnPrice** | [**Price**](Price.md) | PVN (Seller share). Only if the caller if the seller |  [optional]
**nextActions** | [**inline**](#Array&lt;NextActions&gt;) | A list of next allowed actions for the caller |  [optional]
**seller** | [**User**](User.md) | [Relationship] Product&#39;s seller |  [optional]
**buyer** | [**User**](User.md) | [Relationship] Product&#39;s buyer |  [optional]
**product** | [**Product**](Product.md) | [Relationship] Negotiated product |  [optional]
**lastEvent** | [**NegotiationEvent**](NegotiationEvent.md) | [Relationship] Last negotiation event |  [optional]
**events** | [**Array&lt;NegotiationEvent&gt;**](NegotiationEvent.md) | [Relationship] Negotiation-related events history |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | negotiation


<a name="Array<NextActions>"></a>
## Enum: nextActions
Name | Value
---- | -----
nextActions | offer, accept, reject, order



