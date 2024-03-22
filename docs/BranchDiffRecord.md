

# BranchDiffRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**cells** | [**List&lt;BranchDiffCell&gt;**](BranchDiffCell.md) |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**lastModifiedTime** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ADDED | &quot;added&quot; |
| UPDATED | &quot;updated&quot; |
| DELETED | &quot;deleted&quot; |
| DUPLICATED | &quot;duplicated&quot; |
| EXCEEDEDLENGTHID | &quot;exceededLengthId&quot; |
| MERGED | &quot;merged&quot; |
| IDENTIFIERUPDATED | &quot;identifierUpdated&quot; |


## Implemented Interfaces

* Serializable


