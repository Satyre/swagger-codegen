
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**name** | [**String**](String.md) | Product name | 
**price** | [**Price**](Price.md) | Current price | 
**regularPrice** | [**Price**](Price.md) | Regular price (before discount) |  [optional]
**description** | [**String**](String.md) | Seller&#39;s description |  [optional]
**localizedDescription** | [**String**](String.md) | Translated seller&#39;s description in local language |  [optional]
**editorDescription** | [**String**](String.md) | Editor&#39;s pick |  [optional]
**likeCount** | **Int** | Number of likes |  [optional]
**path** | [**String**](String.md) | Path of product page |  [optional]
**sold** | **Boolean** | Status of the product sold or not |  [optional]
**negotiable** | **Boolean** | Possibility to negotiable |  [optional]
**inStock** | **Boolean** | Product is in stock and ready to ship |  [optional]
**warehouse** | [**Warehouse**](Warehouse.md) |  |  [optional]
**tags** | [**Array&lt;ProductTag&gt;**](ProductTag.md) |  |  [optional]
**creationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Creation date of the product |  [optional]
**soldDate** | [**java.util.Calendar**](java.util.Calendar.md) | Sold date of the product |  [optional]
**pictures** | [**Array&lt;Picture&gt;**](Picture.md) |  |  [optional]
**size** | [**Size**](Size.md) |  |  [optional]
**measurements** | [**Array&lt;ProductMeasurement&gt;**](ProductMeasurement.md) |  |  [optional]
**unit** | [**Unit**](Unit.md) |  |  [optional]
**brand** | [**Brand**](Brand.md) |  |  [optional]
**material** | [**Material**](Material.md) |  |  [optional]
**pattern** | [**Pattern**](Pattern.md) |  |  [optional]
**color** | [**Color**](Color.md) |  |  [optional]
**condition** | [**Condition**](Condition.md) |  |  [optional]
**universe** | [**Universe**](Universe.md) |  |  [optional]
**category** | [**Category**](Category.md) |  |  [optional]
**subcategory** | [**Subcategory**](Subcategory.md) |  |  [optional]
**season** | [**Season**](Season.md) |  |  [optional]
**model** | [**Model**](Model.md) |  |  [optional]
**installment** | [**ProductInstallment**](ProductInstallment.md) |  |  [optional]
**packagings** | [**Array&lt;ProductPackaging&gt;**](ProductPackaging.md) |  |  [optional]
**meshLinks** | [**ProductMeshLinks**](ProductMeshLinks.md) |  |  [optional]
**prohibitedCountries** | [**Array&lt;String&gt;**](String.md) | ISO code list of countries where product shipping is prohibited due to country restrictions |  [optional]
**buyersWhoHaveActiveNegotiation** | [**Array&lt;String&gt;**](String.md) | Buyers who have a negotiation in progress |  [optional]
**buyersWhoAreOnNegotiationHold** | [**Array&lt;String&gt;**](String.md) | buyers who are on negotiation hold |  [optional]
**receipt** | **Boolean** | Product is received by VC |  [optional]
**available** | **Boolean** | Product Availability |  [optional]
**alternateVersions** | [**Array&lt;ContentsLocalizedPath&gt;**](ContentsLocalizedPath.md) | Regional variations of the page. |  [optional]
**metadata** | [**ContentsPageMetadata**](ContentsPageMetadata.md) |  |  [optional]
**shouldBeGone** | **Boolean** | Product&#39;s sold having whitelist flag (true if must have http_gone) |  [optional]
**indexation** | [**ContentsPageIndexation**](ContentsPageIndexation.md) |  |  [optional]
**consignment** | **Boolean** | Product is from consigment |  [optional]
**buyerFees** | [**Array&lt;BuyerFee&gt;**](BuyerFee.md) |  |  [optional]
**isoCountry** | [**String**](String.md) | Product location before sell |  [optional]
**flags** | [**Array&lt;String&gt;**](String.md) | Product flags |  [optional]
**services** | [**Array&lt;Plan&gt;**](Plan.md) | Service activated or not in the context of a shipping option |  [optional]
**seller** | [**User**](User.md) | [Relationship] Client who sells product |  [optional]
**watchStrapMaterial** | [**Material**](Material.md) | [Relationship] Watch strap material |  [optional]
**watchMechanism** | [**Mechanism**](Mechanism.md) | [Relationship] Watch mechanism |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | product



