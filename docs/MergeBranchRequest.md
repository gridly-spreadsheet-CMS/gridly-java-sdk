

# MergeBranchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mergeRecordOptions** | [**List&lt;MergeRecordOptionsEnum&gt;**](#List&lt;MergeRecordOptionsEnum&gt;) |  |  [optional] |
|**mergeRecordConflicts** | [**List&lt;MergeRecordConflict&gt;**](MergeRecordConflict.md) |  |  [optional] |
|**useLastMergeResolve** | **Boolean** |  |  [optional] |
|**checkMismatchedColumnType** | **Boolean** |  |  [optional] |
|**query** | [**List&lt;FilterField&gt;**](FilterField.md) |  |  [optional] |



## Enum: List&lt;MergeRecordOptionsEnum&gt;

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| UPDATE | &quot;update&quot; |
| DELETE | &quot;delete&quot; |
| OVERRIDE | &quot;override&quot; |


## Implemented Interfaces

* Serializable


