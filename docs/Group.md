

# Group


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**groupId** | **Long** |  |  [optional] |
|**companyId** | **Long** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**logoUrl** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**shareType** | [**ShareTypeEnum**](#ShareTypeEnum) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** |  |  [optional] |
|**isSystemGroup** | **Boolean** |  |  [optional] |
|**systemGroup** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| ADMIN | &quot;ADMIN&quot; |



## Enum: ShareTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| FULL | &quot;full&quot; |
| PROJECT | &quot;project&quot; |
| DATABASE | &quot;database&quot; |
| GRID | &quot;grid&quot; |
| VIEW | &quot;view&quot; |


## Implemented Interfaces

* Serializable


