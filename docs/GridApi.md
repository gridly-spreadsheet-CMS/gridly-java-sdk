# GridApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](GridApi.md#callList) | **GET** /v1/grids | list |
| [**create**](GridApi.md#create) | **POST** /v1/grids | create |
| [**createCategory**](GridApi.md#createCategory) | **POST** /v1/grids/{gridId}/settings/categories | createCategory |
| [**delete**](GridApi.md#delete) | **DELETE** /v1/grids/{gridId} | delete |
| [**deleteCategory**](GridApi.md#deleteCategory) | **DELETE** /v1/grids/{gridId}/settings/categories/{categoryId} | deleteCategory |
| [**deleteFile**](GridApi.md#deleteFile) | **DELETE** /v1/grids/{gridId}/settings/categories/{categoryId}/files/{fileId} | deleteFile |
| [**get**](GridApi.md#get) | **GET** /v1/grids/{gridId} | get |
| [**getSetting**](GridApi.md#getSetting) | **GET** /v1/grids/{gridId}/settings | getSetting |
| [**listFiles**](GridApi.md#listFiles) | **GET** /v1/grids/{gridId}/settings/files | listFiles |
| [**listTemplateGrids**](GridApi.md#listTemplateGrids) | **GET** /v1/template-grids | listTemplateGrids |
| [**update**](GridApi.md#update) | **PATCH** /v1/grids/{gridId} | update |
| [**updateCategory**](GridApi.md#updateCategory) | **PUT** /v1/grids/{gridId}/settings/categories/{categoryId} | updateCategory |
| [**updateSetting**](GridApi.md#updateSetting) | **PATCH** /v1/grids/{gridId}/settings | updateSetting |
| [**uploadSettingFile**](GridApi.md#uploadSettingFile) | **POST** /v1/grids/{gridId}/settings/categories/{categoryId}/files | uploadSettingFile |


<a name="callList"></a>
# **callList**
> List&lt;Grid&gt; callList(dbId)

list

Get a Grid

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String dbId = "dbId_example"; // String | dbId
    try {
      List<Grid> result = apiInstance.callList(dbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#callList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dbId** | **String**| dbId | |

### Return type

[**List&lt;Grid&gt;**](Grid.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="create"></a>
# **create**
> Grid create(dbId, createGrid)

create

Create a Grid

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String dbId = "dbId_example"; // String | dbId
    CreateGrid createGrid = new CreateGrid(); // CreateGrid | 
    try {
      Grid result = apiInstance.create(dbId, createGrid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dbId** | **String**| dbId | |
| **createGrid** | [**CreateGrid**](CreateGrid.md)|  | |

### Return type

[**Grid**](Grid.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="createCategory"></a>
# **createCategory**
> FileCategory createCategory(gridId, createFileCategory)

createCategory

createCategory

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    CreateFileCategory createFileCategory = new CreateFileCategory(); // CreateFileCategory | 
    try {
      FileCategory result = apiInstance.createCategory(gridId, createFileCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#createCategory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **createFileCategory** | [**CreateFileCategory**](CreateFileCategory.md)|  | |

### Return type

[**FileCategory**](FileCategory.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="delete"></a>
# **delete**
> delete(gridId)

delete

Delete a Grid

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    try {
      apiInstance.delete(gridId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(gridId, categoryId)

deleteCategory

deleteCategory

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String categoryId = "categoryId_example"; // String | categoryId
    try {
      apiInstance.deleteCategory(gridId, categoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#deleteCategory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **categoryId** | **String**| categoryId | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(gridId, categoryId, fileId)

deleteFile

deleteFile

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String categoryId = "categoryId_example"; // String | categoryId
    String fileId = "fileId_example"; // String | fileId
    try {
      apiInstance.deleteFile(gridId, categoryId, fileId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#deleteFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **categoryId** | **String**| categoryId | |
| **fileId** | **String**| fileId | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="get"></a>
# **get**
> Grid get(gridId)

get

Get a Grid

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    try {
      Grid result = apiInstance.get(gridId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#get");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |

### Return type

[**Grid**](Grid.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSetting"></a>
# **getSetting**
> GridSetting getSetting(gridId)

getSetting

getSetting

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    try {
      GridSetting result = apiInstance.getSetting(gridId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#getSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |

### Return type

[**GridSetting**](GridSetting.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listFiles"></a>
# **listFiles**
> List&lt;SettingFile&gt; listFiles(gridId, categoryId)

listFiles

listFiles

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    List<String> categoryId = Arrays.asList(); // List<String> | categoryId
    try {
      List<SettingFile> result = apiInstance.listFiles(gridId, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#listFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **categoryId** | [**List&lt;String&gt;**](String.md)| categoryId | [optional] |

### Return type

[**List&lt;SettingFile&gt;**](SettingFile.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listTemplateGrids"></a>
# **listTemplateGrids**
> List&lt;Grid&gt; listTemplateGrids()

listTemplateGrids

listTemplateGrids

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    try {
      List<Grid> result = apiInstance.listTemplateGrids();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#listTemplateGrids");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Grid&gt;**](Grid.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="update"></a>
# **update**
> Grid update(gridId, updateGrid)

update

Update a Grid

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    UpdateGrid updateGrid = new UpdateGrid(); // UpdateGrid | 
    try {
      Grid result = apiInstance.update(gridId, updateGrid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#update");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **updateGrid** | [**UpdateGrid**](UpdateGrid.md)|  | |

### Return type

[**Grid**](Grid.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCategory"></a>
# **updateCategory**
> FileCategory updateCategory(gridId, categoryId, updateCategory)

updateCategory

updateCategory

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String categoryId = "categoryId_example"; // String | categoryId
    UpdateCategory updateCategory = new UpdateCategory(); // UpdateCategory | 
    try {
      FileCategory result = apiInstance.updateCategory(gridId, categoryId, updateCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#updateCategory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **categoryId** | **String**| categoryId | |
| **updateCategory** | [**UpdateCategory**](UpdateCategory.md)|  | |

### Return type

[**FileCategory**](FileCategory.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSetting"></a>
# **updateSetting**
> GridSetting updateSetting(gridId, updateGridSetting)

updateSetting

updateSetting

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    UpdateGridSetting updateGridSetting = new UpdateGridSetting(); // UpdateGridSetting | 
    try {
      GridSetting result = apiInstance.updateSetting(gridId, updateGridSetting);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#updateSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **updateGridSetting** | [**UpdateGridSetting**](UpdateGridSetting.md)|  | |

### Return type

[**GridSetting**](GridSetting.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="uploadSettingFile"></a>
# **uploadSettingFile**
> UploadedFile uploadSettingFile(gridId, categoryId, uploadSettingFileRequest)

uploadSettingFile

uploadSettingFile

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridApi apiInstance = new GridApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String categoryId = "categoryId_example"; // String | categoryId
    UploadSettingFileRequest uploadSettingFileRequest = new UploadSettingFileRequest(); // UploadSettingFileRequest | 
    try {
      UploadedFile result = apiInstance.uploadSettingFile(gridId, categoryId, uploadSettingFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridApi#uploadSettingFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |
| **categoryId** | **String**| categoryId | |
| **uploadSettingFileRequest** | [**UploadSettingFileRequest**](UploadSettingFileRequest.md)|  | |

### Return type

[**UploadedFile**](UploadedFile.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

