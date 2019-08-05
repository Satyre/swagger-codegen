/**
* Atlas API Reference
*
* OpenAPI spec version: dev
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package fr.vestiairecollective.network.redesign.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class ShippingMethodListResponse() {

    lateinit var data: Array<ShippingMethod>
    lateinit var meta: PaginationMetadata

    constructor(data: Array<ShippingMethod>, meta: PaginationMetadata) : this() {
        this.data = data
        this.meta = meta
    }


}

