/**
* Atlas API Reference
*
* OpenAPI spec version: dev
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package fr.vestiairecollective.network.redesign.api

import fr.vestiairecollective.network.redesign.model.*
import io.reactivex.Single
import retrofit2.http.*

interface CatalogService {

    /**
    * SEO facet links
    * Returns a list of facet links
    * @param path Page path 
    * @return Single<FacetLinksResponse>
    */
	@GET("catalog/facet-links")
    fun getFacetLinks(@Query("path") path: String): Single<FacetLinksResponse>
}
