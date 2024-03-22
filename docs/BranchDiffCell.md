

# BranchDiffCell


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceDependencyStatus** | [**SourceDependencyStatusEnum**](#SourceDependencyStatusEnum) |  |  [optional] |
|**destinationDependencyStatus** | [**DestinationDependencyStatusEnum**](#DestinationDependencyStatusEnum) |  |  [optional] |
|**sourceSourceStatus** | [**SourceSourceStatusEnum**](#SourceSourceStatusEnum) |  |  [optional] |
|**destinationSourceStatus** | [**DestinationSourceStatusEnum**](#DestinationSourceStatusEnum) |  |  [optional] |
|**sourceLengthSetting** | **Integer** |  |  [optional] |
|**destinationLengthSetting** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**columnId** | **String** |  |  [optional] |
|**sourceValue** | **Object** |  |  [optional] |
|**destinationValue** | **Object** |  |  [optional] |



## Enum: SourceDependencyStatusEnum

| Name | Value |
|---- | -----|
| UPTODATE | &quot;upToDate&quot; |
| OUTOFDATE | &quot;outOfDate&quot; |
| UNSET | &quot;unset&quot; |



## Enum: DestinationDependencyStatusEnum

| Name | Value |
|---- | -----|
| UPTODATE | &quot;upToDate&quot; |
| OUTOFDATE | &quot;outOfDate&quot; |
| UNSET | &quot;unset&quot; |



## Enum: SourceSourceStatusEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;unset&quot; |
| DONOTTRANSLATE | &quot;doNotTranslate&quot; |
| NOTREADYFORTRANSLATION | &quot;notReadyForTranslation&quot; |
| READYFORTRANSLATION | &quot;readyForTranslation&quot; |
| LOCKED | &quot;locked&quot; |
| LOCKALLLANGUAGES | &quot;lockAllLanguages&quot; |



## Enum: DestinationSourceStatusEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;unset&quot; |
| DONOTTRANSLATE | &quot;doNotTranslate&quot; |
| NOTREADYFORTRANSLATION | &quot;notReadyForTranslation&quot; |
| READYFORTRANSLATION | &quot;readyForTranslation&quot; |
| LOCKED | &quot;locked&quot; |
| LOCKALLLANGUAGES | &quot;lockAllLanguages&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| BEHIND | &quot;behind&quot; |
| AHEAD | &quot;ahead&quot; |
| CONFLICTED | &quot;conflicted&quot; |
| UNCHANGED | &quot;unchanged&quot; |
| INVALIDDATA | &quot;invalidData&quot; |
| NA | &quot;na&quot; |
| EMPTY | &quot;empty&quot; |
| TARGETTRANSLATIONEMPTY | &quot;targetTranslationEmpty&quot; |
| TRANSLATIONNOTREADY | &quot;translationNotReady&quot; |
| TRANSLATIONNOTFOUND | &quot;translationNotFound&quot; |
| SOURCETARGETMISMATCHED | &quot;sourceTargetMismatched&quot; |
| TARGETCHANGEDTMNOTAPPROVED | &quot;targetChangedTMNotApproved&quot; |
| TARGETNOTCHANGED | &quot;targetNotChanged&quot; |
| SOURCEDCHANGED | &quot;sourcedChanged&quot; |
| TARGETCHANGED | &quot;targetChanged&quot; |
| TEXTOVERLENGTH | &quot;textOverLength&quot; |
| TRANSLATIONNOTCHANGED | &quot;translationNotChanged&quot; |
| NOTCHANGED | &quot;notChanged&quot; |
| WARNINGOFF | &quot;warningOff&quot; |


## Implemented Interfaces

* Serializable


