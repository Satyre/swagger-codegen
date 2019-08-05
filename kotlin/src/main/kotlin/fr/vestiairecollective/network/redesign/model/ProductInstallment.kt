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
class ProductInstallment {
    /* icon path */
    var icon: String? = null
    /* splitIt */
    var name: String? = null
    /* mnemonic to find the good svg */
    var mnemonic: String? = null
    /* icon Place holder */
    var iconPlaceholder: String? = null
    /* disclaimer details */
    var disclaimer: String? = null
    /* description details */
    var description: String? = null
    /* link to splitIt */
    var link: String? = null



}

