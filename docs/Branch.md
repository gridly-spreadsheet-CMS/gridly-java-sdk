

# Branch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**columns** | [**List&lt;ViewColumn&gt;**](ViewColumn.md) |  |  [optional] |
|**defaultAccessViewId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**isMaster** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELETED | &quot;deleted&quot; |
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| RESTORING | &quot;restoring&quot; |
| BACKINGUP | &quot;backingUp&quot; |
| UPLOADING | &quot;uploading&quot; |
| IMPORTING | &quot;importing&quot; |
| BRANCHING | &quot;branching&quot; |
| MERGING | &quot;merging&quot; |
| DUPLICATING | &quot;duplicating&quot; |
| CLEARINGRECORDS | &quot;clearingRecords&quot; |



