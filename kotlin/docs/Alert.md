
# Alert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**String**](String.md) |  | 
**type** | [**inline**](#Type) |  | 
**category** | [**AlertCategory**](AlertCategory.md) | Alert category | 
**name** | [**String**](String.md) | A human-readable name |  [optional]
**localizedName** | [**String**](String.md) | A human-readable name (localized) |  [optional]
**creationDate** | [**java.util.Calendar**](java.util.Calendar.md) | Date when alert was created |  [optional]
**channels** | [**Array&lt;NotificationChannel&gt;**](NotificationChannel.md) | Notification channels | 
**frequency** | [**NotificationFrequency**](NotificationFrequency.md) | Notification frequency | 
**criteria** | [**Array&lt;AlertCriterion&gt;**](AlertCriterion.md) | List of criteria triggering the alert | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | alert



