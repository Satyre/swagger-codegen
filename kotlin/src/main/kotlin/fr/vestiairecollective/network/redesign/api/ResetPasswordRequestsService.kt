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

interface ResetPasswordRequestsService {

    /**
    * Send an e-mail to the user if the email exist
    * 
    * @param payload User&#39;s email (optional)
    * @return Single<ResetPasswordRequestResponse>
    */
	@POST("reset-password-requests")
    fun requestPasswordReset(@Body payload: ResetPasswordRequest? = null): Single<ResetPasswordRequestResponse>
}
