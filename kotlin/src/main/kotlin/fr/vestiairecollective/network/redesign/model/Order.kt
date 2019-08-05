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
class Order() {

    lateinit var id: String
    lateinit var type: Order.Type
    /* Order creation date */
    lateinit var creationDate: java.util.Calendar    /* Order items count */
    var itemsNumber: Int = 0

    lateinit var totalAmount: Price
    var itemsAmount: Price? = null
    var dutiesAmount: Price? = null
    var buyerFeesAmount: Price? = null
    var shippingAmount: Price? = null
    var shipping: Shipping? = null
    var subTotalCostBeforeShipping: Price? = null
    /* [Relationship] Order client */
    var buyer: User? = null
    /* [Relationship] Order items list */
    var orderLines: Array<OrderLine>? = null

    constructor(id: String, type: Type, creationDate: java.util.Calendar, itemsNumber: Int, totalAmount: Price) : this() {
        this.id = id
        this.type = type
        this.creationDate = creationDate
        this.itemsNumber = itemsNumber
        this.totalAmount = totalAmount
    }


    enum class Type(val value: String) {
    
        order("order");
    
    }

}

