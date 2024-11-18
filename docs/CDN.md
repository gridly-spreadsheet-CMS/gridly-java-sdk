

# CDN


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**gridId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**lastGeneratedTime** | **OffsetDateTime** |  |  [optional] |
|**lastPublishedTime** | **OffsetDateTime** |  |  [optional] |
|**permission** | [**PermissionEnum**](#PermissionEnum) |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**createdTime** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedTime** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**whiteListIP** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READYTOPUBLISH | &quot;readyToPublish&quot; |
| PROCESSING | &quot;processing&quot; |
| PUBLISHED | &quot;published&quot; |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |


## Implemented Interfaces

* Serializable


