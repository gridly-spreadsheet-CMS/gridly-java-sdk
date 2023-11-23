

# GridSetting


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultSourceLanguageStatus** | [**DefaultSourceLanguageStatusEnum**](#DefaultSourceLanguageStatusEnum) |  |  [optional] |
|**translatorCanViewAutomations** | **Boolean** |  |  [optional] |
|**categories** | [**List&lt;FileCategory&gt;**](FileCategory.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |
|**createdTime** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedTime** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |



## Enum: DefaultSourceLanguageStatusEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;unset&quot; |
| DONOTTRANSLATE | &quot;doNotTranslate&quot; |
| NOTREADYFORTRANSLATION | &quot;notReadyForTranslation&quot; |
| READYFORTRANSLATION | &quot;readyForTranslation&quot; |
| LOCKED | &quot;locked&quot; |


## Implemented Interfaces

* Serializable


