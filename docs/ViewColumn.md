

# ViewColumn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**dateTimeFormat** | [**DateTimeFormat**](DateTimeFormat.md) |  |  [optional] |
|**dependsOn** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**editable** | **Boolean** |  |  [optional] |
|**formula** | [**Formula**](Formula.md) |  |  [optional] |
|**isSource** | **Boolean** |  |  [optional] |
|**isTarget** | **Boolean** |  |  [optional] |
|**languageCode** | **String** |  |  [optional] |
|**localizationType** | [**LocalizationTypeEnum**](#LocalizationTypeEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**numberFormat** | [**NumberFormat**](NumberFormat.md) |  |  [optional] |
|**reference** | [**ColumnReference**](ColumnReference.md) |  |  [optional] |
|**selectionOptions** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: LocalizationTypeEnum

| Name | Value |
|---- | -----|
| SOURCELANGUAGE | &quot;sourceLanguage&quot; |
| TARGETLANGUAGE | &quot;targetLanguage&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLELINE | &quot;singleLine&quot; |
| MULTIPLELINES | &quot;multipleLines&quot; |
| RICHTEXT | &quot;richText&quot; |
| MARKDOWN | &quot;markdown&quot; |
| SINGLESELECTION | &quot;singleSelection&quot; |
| MULTIPLESELECTIONS | &quot;multipleSelections&quot; |
| BOOLEAN | &quot;boolean&quot; |
| NUMBER | &quot;number&quot; |
| DATETIME | &quot;datetime&quot; |
| FILES | &quot;files&quot; |
| REFERENCE | &quot;reference&quot; |
| LOOKUP | &quot;lookup&quot; |
| LANGUAGE | &quot;language&quot; |
| JSON | &quot;json&quot; |
| YAML | &quot;yaml&quot; |
| HTML | &quot;html&quot; |
| FORMULA | &quot;formula&quot; |


## Implemented Interfaces

* Serializable


