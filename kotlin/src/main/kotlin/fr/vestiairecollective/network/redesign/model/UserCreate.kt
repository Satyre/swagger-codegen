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
class UserCreate() {

    lateinit var firstname: String    /* Civility ID */
    var civility: Int = 0

    /* Country ID */
    lateinit var country: String
    lateinit var credentials: Credentials
    var picture: ByteArray? = null

    constructor(firstname: String, civility: Int, country: String, credentials: Credentials) : this() {
        this.firstname = firstname
        this.civility = civility
        this.country = country
        this.credentials = credentials
    }


}

