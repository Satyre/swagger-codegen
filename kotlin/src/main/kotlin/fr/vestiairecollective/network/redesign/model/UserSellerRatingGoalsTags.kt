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
class UserSellerRatingGoalsTags {
    /* if the seller has the tag for her/his sold product acceptance rate (quality and authentication) */
    var conformity: Boolean? = null
    /* if the seller has the tag for her/his cancellation rate */
    var shipping: Boolean? = null
    /* if the seller has the tag for her/his number of products sold in the last three months */
    var volume: Boolean? = null



}

