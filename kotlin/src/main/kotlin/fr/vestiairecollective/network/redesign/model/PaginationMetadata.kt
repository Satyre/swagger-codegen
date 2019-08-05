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
class PaginationMetadata {
    /* total number of items in the list */
    var count: Int? = null
    /* limit (number of hits per page) */
    var limit: Int? = null
    /* offset of the first hit to return */
    var offset: Int? = null
    /* displayCount to display (notifications) */
    var displayCount: Int? = null



}

