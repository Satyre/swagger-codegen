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
class ProductReservation() {
    /* Indicates whether reservation is active */
    var active: Boolean = false
    /* Product is reserved by a premium member */
    var premium: Boolean = false
    /* Reservation was requested by myself (the currently signed-in user) and the product is therefore reserved to me  */
    var reservedToMe: Boolean = false

    /* Date when reservation expires */
    var expirationDate: java.util.Calendar? = null

    constructor(active: Boolean, premium: Boolean, reservedToMe: Boolean) : this() {
        this.active = active
        this.premium = premium
        this.reservedToMe = reservedToMe
    }


}

