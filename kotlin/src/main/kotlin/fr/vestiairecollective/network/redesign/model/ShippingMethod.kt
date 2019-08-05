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
class ShippingMethod() {

    /* Name of the carrier */
    lateinit var name: String
    /* List of available country */
    lateinit var availableCountry: Array<Country>
    lateinit var minAmount: Price
    lateinit var maxAmount: Price
    var carrier: Carrier? = null

    constructor(name: String, availableCountry: Array<Country>, minAmount: Price, maxAmount: Price) : this() {
        this.name = name
        this.availableCountry = availableCountry
        this.minAmount = minAmount
        this.maxAmount = maxAmount
    }


}

