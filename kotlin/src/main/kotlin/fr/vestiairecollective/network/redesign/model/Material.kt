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
class Material() {

    lateinit var id: String
    lateinit var type: Material.Type
    /* Material name */
    lateinit var name: String
    /* Material name (localized) */
    lateinit var localizedName: String
    /* [Relationship] upper-level material (for example 'leather' for 'exotic leather') */
    var parent: Material? = null

    constructor(id: String, type: Type, name: String, localizedName: String) : this() {
        this.id = id
        this.type = type
        this.name = name
        this.localizedName = localizedName
    }


    enum class Type(val value: String) {
    
        material("material");
    
    }

}

