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
class Carrier() {

    /* Name of the carrier */
    lateinit var name: String
    /* Available country list */
    lateinit var availableCountry: Array<Country>

    constructor(name: String, availableCountry: Array<Country>) : this() {
        this.name = name
        this.availableCountry = availableCountry
    }


}

