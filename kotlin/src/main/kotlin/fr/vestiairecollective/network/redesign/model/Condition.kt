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
class Condition() {

    lateinit var id: String
    lateinit var type: Condition.Type
    /* Condition description (localized) */
    lateinit var description: String

    constructor(id: String, type: Type, description: String) : this() {
        this.id = id
        this.type = type
        this.description = description
    }


    enum class Type(val value: String) {
    
        condition("condition");
    
    }

}

