# gridly-api

Gridly API
- API version: 4.15.1

Gridly API documentation

  For more information, please visit [https://www.gridly.com](https://www.gridly.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.gridly</groupId>
  <artifactId>gridly-api</artifactId>
  <version>1.2.10</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'gridly-api' jar has been published to maven central.
    mavenLocal()       // Needed if the 'gridly-api' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.gridly:gridly-api:1.2.10"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gridly-api-1.2.10.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.BranchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    BranchApi apiInstance = new BranchApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    try {
      List<Branch> result = apiInstance.callList(gridId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#callList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.gridly.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchApi* | [**callList**](docs/BranchApi.md#callList) | **GET** /v1/branches | list
*BranchApi* | [**create**](docs/BranchApi.md#create) | **POST** /v1/branches | create
*BranchApi* | [**delete**](docs/BranchApi.md#delete) | **DELETE** /v1/branches/{branchId} | delete
*BranchApi* | [**get**](docs/BranchApi.md#get) | **GET** /v1/branches/{branchId} | get
*BranchApi* | [**merge**](docs/BranchApi.md#merge) | **POST** /v1/branches/{branchId}/merge | merge
*DatabaseApi* | [**callList**](docs/DatabaseApi.md#callList) | **GET** /v1/databases | list
*DatabaseApi* | [**create**](docs/DatabaseApi.md#create) | **POST** /v1/databases | create
*DatabaseApi* | [**delete**](docs/DatabaseApi.md#delete) | **DELETE** /v1/databases/{dbId} | delete
*DatabaseApi* | [**duplicate**](docs/DatabaseApi.md#duplicate) | **POST** /v1/databases/{dbId}/duplicate | duplicate
*DatabaseApi* | [**get**](docs/DatabaseApi.md#get) | **GET** /v1/databases/{dbId} | get
*DatabaseApi* | [**update**](docs/DatabaseApi.md#update) | **PUT** /v1/databases/{dbId} | update
*GridApi* | [**callList**](docs/GridApi.md#callList) | **GET** /v1/grids | list
*GridApi* | [**create**](docs/GridApi.md#create) | **POST** /v1/grids | create
*GridApi* | [**delete**](docs/GridApi.md#delete) | **DELETE** /v1/grids/{gridId} | delete
*GridApi* | [**get**](docs/GridApi.md#get) | **GET** /v1/grids/{gridId} | get
*GridApi* | [**listTemplateGrids**](docs/GridApi.md#listTemplateGrids) | **GET** /v1/template-grids | listTemplateGrids
*GridApi* | [**update**](docs/GridApi.md#update) | **PATCH** /v1/grids/{gridId} | update
*PathApi* | [**callList**](docs/PathApi.md#callList) | **GET** /v1/views/{viewId}/paths/tree | list
*PathApi* | [**create**](docs/PathApi.md#create) | **POST** /v1/views/{viewId}/paths | create
*PathApi* | [**delete**](docs/PathApi.md#delete) | **DELETE** /v1/views/{viewId}/paths | delete
*PathApi* | [**move**](docs/PathApi.md#move) | **POST** /v1/views/{viewId}/paths/move | move
*PathApi* | [**update**](docs/PathApi.md#update) | **PUT** /v1/views/{viewId}/paths/{path} | update
*ProjectApi* | [**callList**](docs/ProjectApi.md#callList) | **GET** /v1/projects | list
*ProjectApi* | [**create**](docs/ProjectApi.md#create) | **POST** /v1/projects | create
*ProjectApi* | [**delete**](docs/ProjectApi.md#delete) | **DELETE** /v1/projects/{projectId} | delete
*ProjectApi* | [**findOne**](docs/ProjectApi.md#findOne) | **GET** /v1/projects/{projectId} | findOne
*ProjectApi* | [**update**](docs/ProjectApi.md#update) | **PUT** /v1/projects/{projectId} | update
*RecordApi* | [**create**](docs/RecordApi.md#create) | **POST** /v1/views/{viewId}/records | create
*RecordApi* | [**delete**](docs/RecordApi.md#delete) | **DELETE** /v1/views/{viewId}/records | delete
*RecordApi* | [**fetch**](docs/RecordApi.md#fetch) | **GET** /v1/views/{viewId}/records | fetch
*RecordApi* | [**fetchHistories**](docs/RecordApi.md#fetchHistories) | **GET** /v1/views/{viewId}/records/{recordId}/histories | fetchHistories
*RecordApi* | [**update**](docs/RecordApi.md#update) | **PATCH** /v1/views/{viewId}/records | update
*RecordApi* | [**updateRecord**](docs/RecordApi.md#updateRecord) | **PATCH** /v1/views/{viewId}/records/{id} | updateRecord
*ShareViewApi* | [**create**](docs/ShareViewApi.md#create) | **PUT** /v1/views/{viewId}/shares | create
*ShareViewApi* | [**delete**](docs/ShareViewApi.md#delete) | **DELETE** /v1/views/{viewId}/shares | delete
*ShareViewApi* | [**get**](docs/ShareViewApi.md#get) | **GET** /v1/views/{viewId}/shares | get
*TaskApi* | [**get**](docs/TaskApi.md#get) | **GET** /v1/tasks/{taskId} | get
*TransmemApi* | [**cleanup**](docs/TransmemApi.md#cleanup) | **PUT** /v1/transmems/{tmId}/cleanup | Erases all the translation data of the provided tmId
*TransmemApi* | [**create**](docs/TransmemApi.md#create) | **POST** /v1/transmems | Create a new translation memory
*TransmemApi* | [**createWithFile**](docs/TransmemApi.md#createWithFile) | **POST** /v1/transmems/upload | Create a new translation memory by uploading tmx file
*TransmemApi* | [**delete**](docs/TransmemApi.md#delete) | **DELETE** /v1/transmems/{tmId} | Delete a translation memory by id
*TransmemApi* | [**export**](docs/TransmemApi.md#export) | **GET** /v1/transmems/{tmId}/export | Export translation memory tmx file
*TransmemApi* | [**get**](docs/TransmemApi.md#get) | **GET** /v1/transmems/{tmId} | Get translation memory info by id
*TransmemApi* | [**importTmx**](docs/TransmemApi.md#importTmx) | **POST** /v1/transmems/{tmId}/import | Import a translation memory from tmx file
*TransmemApi* | [**listTM**](docs/TransmemApi.md#listTM) | **GET** /v1/transmems | List all available translation memories or create default one if there is no translation memory
*TransmemApi* | [**update**](docs/TransmemApi.md#update) | **PUT** /v1/transmems/{tmId} | Update a translation memory
*ViewApi* | [**callList**](docs/ViewApi.md#callList) | **GET** /v1/views | list
*ViewApi* | [**create**](docs/ViewApi.md#create) | **POST** /v1/views | create
*ViewApi* | [**export**](docs/ViewApi.md#export) | **GET** /v1/views/{viewId}/export | export
*ViewApi* | [**get**](docs/ViewApi.md#get) | **GET** /v1/views/{viewId} | get
*ViewApi* | [**importView**](docs/ViewApi.md#importView) | **POST** /v1/views/{viewId}/import | importView
*ViewApi* | [**merge**](docs/ViewApi.md#merge) | **POST** /v1/views/{viewId}/merge | merge
*ViewColumnApi* | [**add**](docs/ViewColumnApi.md#add) | **POST** /v1/views/{viewId}/columns/{columnId}/add | add
*ViewColumnApi* | [**create**](docs/ViewColumnApi.md#create) | **POST** /v1/views/{viewId}/columns | create
*ViewColumnApi* | [**delete**](docs/ViewColumnApi.md#delete) | **DELETE** /v1/views/{viewId}/columns/{columnId} | delete
*ViewColumnApi* | [**get**](docs/ViewColumnApi.md#get) | **GET** /v1/views/{viewId}/columns/{columnId} | get
*ViewColumnApi* | [**remove**](docs/ViewColumnApi.md#remove) | **POST** /v1/views/{viewId}/columns/{columnId}/remove | remove
*ViewColumnApi* | [**update**](docs/ViewColumnApi.md#update) | **PATCH** /v1/views/{viewId}/columns/{columnId} | update
*ViewDependencyApi* | [**callList**](docs/ViewDependencyApi.md#callList) | **GET** /v1/views/{viewId}/dependencies | list
*ViewDependencyApi* | [**create**](docs/ViewDependencyApi.md#create) | **POST** /v1/views/{viewId}/dependencies | create
*ViewDependencyApi* | [**delete**](docs/ViewDependencyApi.md#delete) | **DELETE** /v1/views/{viewId}/dependencies | delete
*ViewDependencyApi* | [**deleteById**](docs/ViewDependencyApi.md#deleteById) | **DELETE** /v1/views/{viewId}/dependencies/{dependencyId} | deleteById
*ViewDependencyApi* | [**get**](docs/ViewDependencyApi.md#get) | **GET** /v1/views/{viewId}/dependencies/{dependencyId} | get
*ViewDependencyApi* | [**update**](docs/ViewDependencyApi.md#update) | **PUT** /v1/views/{viewId}/dependencies/{dependencyId} | update
*ViewFileApi* | [**delete**](docs/ViewFileApi.md#delete) | **DELETE** /v1/views/{viewId}/files | delete
*ViewFileApi* | [**download**](docs/ViewFileApi.md#download) | **GET** /v1/views/{viewId}/files/{fileId} | download
*ViewFileApi* | [**upload**](docs/ViewFileApi.md#upload) | **POST** /v1/views/{viewId}/files | upload
*ViewFileApi* | [**uploadZip**](docs/ViewFileApi.md#uploadZip) | **POST** /v1/views/{viewId}/files/zip | uploadZip


## Documentation for Models

 - [AddViewColumn](docs/AddViewColumn.md)
 - [Branch](docs/Branch.md)
 - [Cell](docs/Cell.md)
 - [CellHistory](docs/CellHistory.md)
 - [ColumnReference](docs/ColumnReference.md)
 - [CreateBranch](docs/CreateBranch.md)
 - [CreateColumn](docs/CreateColumn.md)
 - [CreateDatabase](docs/CreateDatabase.md)
 - [CreateDependency](docs/CreateDependency.md)
 - [CreateGrid](docs/CreateGrid.md)
 - [CreatePath](docs/CreatePath.md)
 - [CreateProject](docs/CreateProject.md)
 - [CreateShareView](docs/CreateShareView.md)
 - [CreateTransMem](docs/CreateTransMem.md)
 - [CreateView](docs/CreateView.md)
 - [Database](docs/Database.md)
 - [DateFormat](docs/DateFormat.md)
 - [DateTimeFormat](docs/DateTimeFormat.md)
 - [DeleteDependency](docs/DeleteDependency.md)
 - [DeleteFile](docs/DeleteFile.md)
 - [DeletePath](docs/DeletePath.md)
 - [DeleteRecord](docs/DeleteRecord.md)
 - [Dependency](docs/Dependency.md)
 - [ExportFileHeader](docs/ExportFileHeader.md)
 - [ExportFormat](docs/ExportFormat.md)
 - [FetchFileOption](docs/FetchFileOption.md)
 - [Formula](docs/Formula.md)
 - [Grid](docs/Grid.md)
 - [Group](docs/Group.md)
 - [MovePath](docs/MovePath.md)
 - [NumberFormat](docs/NumberFormat.md)
 - [PathList](docs/PathList.md)
 - [PathNode](docs/PathNode.md)
 - [PathSingle](docs/PathSingle.md)
 - [Privilege](docs/Privilege.md)
 - [Project](docs/Project.md)
 - [ProjectDetail](docs/ProjectDetail.md)
 - [Record](docs/Record.md)
 - [RecordHistory](docs/RecordHistory.md)
 - [RecordIdentifierWrapper](docs/RecordIdentifierWrapper.md)
 - [Reference](docs/Reference.md)
 - [ReferencedColumn](docs/ReferencedColumn.md)
 - [ReferencedGrid](docs/ReferencedGrid.md)
 - [Role](docs/Role.md)
 - [SetCell](docs/SetCell.md)
 - [SetRecord](docs/SetRecord.md)
 - [ShareView](docs/ShareView.md)
 - [Task](docs/Task.md)
 - [TransMem](docs/TransMem.md)
 - [TranslationStatus](docs/TranslationStatus.md)
 - [UpdateColumn](docs/UpdateColumn.md)
 - [UpdateDatabase](docs/UpdateDatabase.md)
 - [UpdateDependency](docs/UpdateDependency.md)
 - [UpdateGrid](docs/UpdateGrid.md)
 - [UpdatePath](docs/UpdatePath.md)
 - [UpdateProject](docs/UpdateProject.md)
 - [UpdateTransMem](docs/UpdateTransMem.md)
 - [UploadZipRequest](docs/UploadZipRequest.md)
 - [UploadedFile](docs/UploadedFile.md)
 - [View](docs/View.md)
 - [ViewColumn](docs/ViewColumn.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@gridly.com

