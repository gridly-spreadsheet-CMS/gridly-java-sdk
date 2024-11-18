

# View


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**columns** | [**List&lt;ViewColumn&gt;**](ViewColumn.md) |  |  [optional] |
|**gridId** | **String** |  |  [optional] |
|**gridStatus** | [**GridStatusEnum**](#GridStatusEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**records** | [**List&lt;Record&gt;**](Record.md) |  |  [optional] |



## Enum: GridStatusEnum

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
| COPYING | &quot;copying&quot; |
| UPDATINGWORKFLOW | &quot;updatingWorkflow&quot; |


## Implemented Interfaces

* Serializable


