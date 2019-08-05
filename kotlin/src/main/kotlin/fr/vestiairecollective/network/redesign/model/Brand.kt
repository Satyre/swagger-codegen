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
class Brand() {

    lateinit var id: String
    lateinit var type: Brand.Type
    /* original brand name */
    lateinit var name: String
    /* Brand name (localized) */
    var localizedName: String? = null
    var logo: Picture? = null
    var url: Url? = null
    /* Indicate if the brand is active or banned / deleted for deposit form */
    var active: Boolean? = null
    /* Number of likes */
    var likeCount: Int? = null

    constructor(id: String, type: Type, name: String) : this() {
        this.id = id
        this.type = type
        this.name = name
    }


    enum class Type(val value: String) {
    
        brand("brand");
    
    }

}

