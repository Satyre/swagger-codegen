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

interface OrdersService {

    /**
    * Add product to user&#39;s cart
    * 
    * @param payload Product ID (optional)
    * @return Single<OrderLineIdResponse>
    */
	@POST("orders/current/order-lines")
    fun addProductToCart(@Body payload: OrderAddProductRequest? = null): Single<OrderLineIdResponse>
    /**
    * Returns cart content
    * 
    * @return Single<OrderResponse>
    */
	@GET("orders/current")
    fun getCart(): Single<OrderResponse>
    /**
    * Remove product from user&#39;s cart
    * 
    * @param id Order line ID 
    * @return void
    */
	@DELETE("orders/current/order-lines/{id}")
    fun removeProductFromCart(@Path("id") id: String): Single<EmptyResponse>
    /**
    * Update product delivery method from user&#39;s cart
    * 
    * @param id Order line ID 
    * @param shippingOption Choosen shipping option for product 
    * @return Single<OrderPlanUpdateResponse>
    */
	@POST("orders/current/order-lines/{id}/{shippingOption}")
    fun updateProductDelivery(@Path("id") id: String, @Path("shippingOption") shippingOption: String): Single<OrderPlanUpdateResponse>
}
