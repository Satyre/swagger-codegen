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
class ShippingPlan() {

    lateinit var id: String
    lateinit var type: ShippingPlan.Type
    /* Is a plan eligible or not */
    lateinit var shippingPlan: Array<Plan>

    constructor(id: String, type: Type, shippingPlan: Array<Plan>) : this() {
        this.id = id
        this.type = type
        this.shippingPlan = shippingPlan
    }


    enum class Type(val value: String) {
    
        shippingPlan("shippingPlan");
    
    }

}

