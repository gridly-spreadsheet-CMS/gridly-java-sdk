

# SetCell


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnId** | **String** |  |  [optional] |
|**dependencyStatus** | [**DependencyStatusEnum**](#DependencyStatusEnum) |  |  [optional] |
|**lengthLimit** | **Integer** |  |  [optional] |
|**referencedIds** | **List&lt;String&gt;** |  |  [optional] |
|**sourceStatus** | [**SourceStatusEnum**](#SourceStatusEnum) |  |  [optional] |
|**value** | **Object** |  |  [optional] |



## Enum: DependencyStatusEnum

| Name | Value |
|---- | -----|
| UPTODATE | &quot;upToDate&quot; |
| OUTOFDATE | &quot;outOfDate&quot; |
| UNSET | &quot;unset&quot; |



## Enum: SourceStatusEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;unset&quot; |
| DONOTTRANSLATE | &quot;doNotTranslate&quot; |
| NOTREADYFORTRANSLATION | &quot;notReadyForTranslation&quot; |
| READYFORTRANSLATION | &quot;readyForTranslation&quot; |
| LOCKED | &quot;locked&quot; |


## Implemented Interfaces

* Serializable


