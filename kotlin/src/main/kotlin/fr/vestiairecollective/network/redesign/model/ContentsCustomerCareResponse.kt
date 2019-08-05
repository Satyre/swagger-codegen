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
class ContentsCustomerCareResponse() {

    lateinit var data: ContentsCustomerCare
    lateinit var meta: Empty

    constructor(data: ContentsCustomerCare, meta: Empty) : this() {
        this.data = data
        this.meta = meta
    }


}

