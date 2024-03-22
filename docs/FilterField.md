

# FilterField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseSensitive** | **Boolean** |  |  [optional] |
|**columnId** | **String** |  |  [optional] |
|**dynamicColumn** | **String** |  |  [optional] [readonly] |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**queryPathTagViaId** | **Boolean** |  |  [optional] |
|**subField** | [**SubFieldEnum**](#SubFieldEnum) |  |  [optional] |
|**values** | **List&lt;Object&gt;** |  |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| ISNULL | &quot;isNull&quot; |
| ISNOTNULL | &quot;isNotNull&quot; |
| ISEMPTY | &quot;isEmpty&quot; |
| ISNOTEMPTY | &quot;isNotEmpty&quot; |
| CONTAINS | &quot;contains&quot; |
| NOTCONTAINS | &quot;notContains&quot; |
| STARTSWITH | &quot;startsWith&quot; |
| NOTSTARTSWITH | &quot;notStartsWith&quot; |
| ENDSWITH | &quot;endsWith&quot; |
| NOTENDSWITH | &quot;notEndsWith&quot; |
| REGEXP | &quot;regexp&quot; |
| NOTREGEXP | &quot;notRegexp&quot; |
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| IN | &quot;in&quot; |
| NOTIN | &quot;notIn&quot; |
| MODIFIEDBY | &quot;modifiedBy&quot; |
| NOTMODIFIEDBY | &quot;notModifiedBy&quot; |
| BETWEEN | &quot;between&quot; |
| NOTBETWEEN | &quot;notBetween&quot; |
| HASQAERROR | &quot;hasQaError&quot; |
| ISLENGTHVIOLATED | &quot;isLengthViolated&quot; |
| HASTAG | &quot;hasTag&quot; |
| ISMT | &quot;isMt&quot; |



## Enum: SubFieldEnum

| Name | Value |
|---- | -----|
| DEPENDENCY_STATUS | &quot;DEPENDENCY_STATUS&quot; |
| SOURCE_STATUS | &quot;SOURCE_STATUS&quot; |
| TARGET_STATUS | &quot;TARGET_STATUS&quot; |
| FLOW_STATUS | &quot;FLOW_STATUS&quot; |
| TM | &quot;TM&quot; |
| MT | &quot;MT&quot; |
| TICKET | &quot;TICKET&quot; |
| COLOR | &quot;COLOR&quot; |
| METADATA | &quot;METADATA&quot; |
| CELL_METADATA | &quot;CELL_METADATA&quot; |
| WORD_COUNT | &quot;WORD_COUNT&quot; |
| PREVIEW_SOURCE_DATA | &quot;PREVIEW_SOURCE_DATA&quot; |
| PREVIEW_SOURCE_DEPENDENCY_STATUS | &quot;PREVIEW_SOURCE_DEPENDENCY_STATUS&quot; |
| PREVIEW_STATUS | &quot;PREVIEW_STATUS&quot; |
| PREVIEW_MERGE_OPTION | &quot;PREVIEW_MERGE_OPTION&quot; |
| RELATIVE_TIME | &quot;RELATIVE_TIME&quot; |
| LENGTH_VIOLATED | &quot;LENGTH_VIOLATED&quot; |
| LENGTH_SETTING | &quot;LENGTH_SETTING&quot; |
| WORKFLOW_STATUS | &quot;WORKFLOW_STATUS&quot; |


## Implemented Interfaces

* Serializable


