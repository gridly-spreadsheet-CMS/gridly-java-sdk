

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
| SPELLCHECK | &quot;spellCheck&quot; |
| QACHECK | &quot;qaCheck&quot; |
| ISMT | &quot;isMt&quot; |



## Enum: SubFieldEnum

| Name | Value |
|---- | -----|
| DEPENDENCYSTATUS | &quot;_dependencyStatus&quot; |
| SOURCESTATUS | &quot;_sourceStatus&quot; |
| TARGETSTATUS | &quot;_targetStatus&quot; |
| FLOWSTATUS | &quot;_flowStatus&quot; |
| TM | &quot;_tm&quot; |
| MT | &quot;_mt&quot; |
| TICKET | &quot;_ticket&quot; |
| COLOR | &quot;_color&quot; |
| METADATA | &quot;_metadata&quot; |
| CELL_METADATA | &quot;_cell_metadata&quot; |
| WORD_COUNT | &quot;_word_count&quot; |
| PREVIEWSOURCEDATA | &quot;_previewSourceData&quot; |
| PREVIEWSOURCEDEPENDENCYSTATUS | &quot;_previewSourceDependencyStatus&quot; |
| PREVIEWSTATUS | &quot;_previewStatus&quot; |
| PREVIEWMERGEOPTION | &quot;_previewMergeOption&quot; |
| RELATIVETIME | &quot;_relativeTime&quot; |
| LENGTH_VIOLATED | &quot;_length_violated&quot; |
| LENGTHSETTING | &quot;_lengthSetting&quot; |
| WORKFLOW | &quot;_workflow&quot; |
| WORKFLOWSTEPTRANSITIONED | &quot;_workflowStepTransitioned&quot; |
| REPETITION | &quot;_repetition&quot; |
| QACHECKSTATUS | &quot;_qaCheckStatus&quot; |
| SPELLCHECKSTATUS | &quot;_spellCheckStatus&quot; |
| HASTAG | &quot;_hasTag&quot; |


## Implemented Interfaces

* Serializable


