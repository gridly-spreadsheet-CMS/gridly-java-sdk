

# CellHistory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dependencyStatus** | [**DependencyStatusEnum**](#DependencyStatusEnum) |  |  [optional] |
|**sourceStatus** | [**SourceStatusEnum**](#SourceStatusEnum) |  |  [optional] |
|**columnId** | **String** |  |  [optional] |
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
| LOCKALLLANGUAGES | &quot;lockAllLanguages&quot; |


## Implemented Interfaces

* Serializable


