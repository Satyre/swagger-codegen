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
class Category() {

    lateinit var id: String
    lateinit var type: Category.Type
    /* Category name */
    lateinit var name: String
    /* Category name (localized) */
    lateinit var localizedName: String
    var parent: Category? = null

    constructor(id: String, type: Type, name: String, localizedName: String) : this() {
        this.id = id
        this.type = type
        this.name = name
        this.localizedName = localizedName
    }


    enum class Type(val value: String) {
    
        category("category");
    
    }

}

