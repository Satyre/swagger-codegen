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
class Notification() {

    lateinit var id: String
    lateinit var type: Notification.Type
    /* Item id */
    lateinit var idItem: String
    /* Picture's Path */
    lateinit var picture: String
    /* Picture item notification */
    lateinit var pictureItemNotification: String
    /* Item name */
    lateinit var itemName: String
    /* Email */
    lateinit var email: String
    /* Text author */
    lateinit var textAuthor: String
    /* Text complement */
    lateinit var textComplement: String
    /* Picto Path */
    lateinit var picto: String
    /* Date */
    lateinit var date: java.util.Calendar
    /* URL scheme */
    lateinit var urlScheme: String    /* Viewed */
    var viewed: Boolean = false
    /* Clicked */
    var clicked: Boolean = false
    /* Clickable */
    var clickable: Boolean = false

    /* Notification's state */
    lateinit var setting: String
    /* Account's path */
    lateinit var link: String
    /* Status code */
    lateinit var supportedDevices: Empty
    /* item's url */
    lateinit var itemUrl: String
    /* Picture name */
    lateinit var pictureName: String
    /* [Relationship] negotiation */
    var negotiation: Negotiation? = null
    /* [Relationship] User transmitter notification */
    var transmitter: User? = null
    /* [Relationship] User received the notification */
    var receiver: User? = null

    constructor(id: String, type: Type, idItem: String, picture: String, pictureItemNotification: String, itemName: String, email: String, textAuthor: String, textComplement: String, picto: String, date: java.util.Calendar, urlScheme: String, viewed: Boolean, clicked: Boolean, clickable: Boolean, setting: String, link: String, supportedDevices: Empty, itemUrl: String, pictureName: String) : this() {
        this.id = id
        this.type = type
        this.idItem = idItem
        this.picture = picture
        this.pictureItemNotification = pictureItemNotification
        this.itemName = itemName
        this.email = email
        this.textAuthor = textAuthor
        this.textComplement = textComplement
        this.picto = picto
        this.date = date
        this.urlScheme = urlScheme
        this.viewed = viewed
        this.clicked = clicked
        this.clickable = clickable
        this.setting = setting
        this.link = link
        this.supportedDevices = supportedDevices
        this.itemUrl = itemUrl
        this.pictureName = pictureName
    }


    enum class Type(val value: String) {
    
        notification("notification");
    
    }

}

