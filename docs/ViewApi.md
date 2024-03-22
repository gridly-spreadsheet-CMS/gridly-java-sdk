# ViewApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](ViewApi.md#callList) | **GET** /v1/views | list |
| [**create**](ViewApi.md#create) | **POST** /v1/views | create |
| [**export**](ViewApi.md#export) | **GET** /v1/views/{viewId}/export | export |
| [**get**](ViewApi.md#get) | **GET** /v1/views/{viewId} | get |
| [**getStatistic**](ViewApi.md#getStatistic) | **GET** /v1/views/{viewId}/statistic | getStatistic |
| [**importView**](ViewApi.md#importView) | **POST** /v1/views/{viewId}/import | importView |
| [**merge**](ViewApi.md#merge) | **POST** /v1/views/{viewId}/merge | merge |


<a name="callList"></a>
# **callList**
> List&lt;View&gt; callList(branchId, gridId, type)

list

list

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    String branchId = "branchId_example"; // String | branchId
    String gridId = "gridId_example"; // String | gridId
    String type = "defaultView"; // String | type
    try {
      List<View> result = apiInstance.callList(branchId, gridId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#callList");
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
| **branchId** | **String**| branchId | [optional] |
| **gridId** | **String**| gridId | [optional] |
| **type** | **String**| type | [optional] [enum: defaultView, accessView, userView, workflowView] |

### Return type

[**List&lt;View&gt;**](View.md)

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
> View create(createView)

create

create

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    CreateView createView = new CreateView(); // CreateView | 
    try {
      View result = apiInstance.create(createView);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#create");
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
| **createView** | [**CreateView**](CreateView.md)|  | |

### Return type

[**View**](View.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="export"></a>
# **export**
> File export(viewId, columnIds, fileHeader, query, sort, type)

export

export

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    List<String> columnIds = Arrays.asList(); // List<String> | columnIds
    ExportFileHeader fileHeader = ExportFileHeader.fromValue("none"); // ExportFileHeader | fileHeader
    String query = "{}"; // String | query
    String sort = "{}"; // String | sort
    String type = "csv"; // String | type
    try {
      File result = apiInstance.export(viewId, columnIds, fileHeader, query, sort, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#export");
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
| **viewId** | **String**| viewId | |
| **columnIds** | [**List&lt;String&gt;**](String.md)| columnIds | [optional] |
| **fileHeader** | [**ExportFileHeader**](.md)| fileHeader | [optional] [enum: none, columnName, columnId] |
| **query** | **String**| query | [optional] [default to {}] |
| **sort** | **String**| sort | [optional] [default to {}] |
| **type** | **String**| type | [optional] [default to csv] [enum: csv, tsv, xls, xlsx, json, po, html] |

### Return type

[**File**](File.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a name="get"></a>
# **get**
> View get(viewId, columnIds, include, page, query, sort)

get

get

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    List<String> columnIds = Arrays.asList(); // List<String> | columnIds
    List<String> include = Arrays.asList(); // List<String> | include
    String page = "{}"; // String | page
    String query = "{}"; // String | query
    String sort = "{}"; // String | sort
    try {
      View result = apiInstance.get(viewId, columnIds, include, page, query, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#get");
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
| **viewId** | **String**| viewId | |
| **columnIds** | [**List&lt;String&gt;**](String.md)| columnIds | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| include | [optional] [enum: records] |
| **page** | **String**| page | [optional] [default to {}] |
| **query** | **String**| query | [optional] [default to {}] |
| **sort** | **String**| sort | [optional] [default to {}] |

### Return type

[**View**](View.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getStatistic"></a>
# **getStatistic**
> ViewStatistic getStatistic(viewId, columnIds)

getStatistic

getStatistic

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    List<String> columnIds = Arrays.asList(); // List<String> | columnIds
    try {
      ViewStatistic result = apiInstance.getStatistic(viewId, columnIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#getStatistic");
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
| **viewId** | **String**| viewId | |
| **columnIds** | [**List&lt;String&gt;**](String.md)| columnIds | [optional] |

### Return type

[**ViewStatistic**](ViewStatistic.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="importView"></a>
# **importView**
> importView(viewId, _file, importRequest, type)

importView

importView

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    File _file = new File("/path/to/file"); // File | The following file types are supported: csv, tsv, xls, xlsx and json
    String importRequest = "{}"; // String | importRequest
    String type = "csv"; // String | type
    try {
      apiInstance.importView(viewId, _file, importRequest, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#importView");
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
| **viewId** | **String**| viewId | |
| **_file** | **File**| The following file types are supported: csv, tsv, xls, xlsx and json | |
| **importRequest** | **String**| importRequest | [optional] [default to {}] |
| **type** | **String**| type | [optional] [default to csv] [enum: csv, tsv, xls, xlsx, json, po, html] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a name="merge"></a>
# **merge**
> Task merge(destinationViewId, viewId, mergeBranchRequest, mergeRecordOptions)

merge

merge

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewApi apiInstance = new ViewApi(defaultClient);
    String destinationViewId = "destinationViewId_example"; // String | destinationViewId
    String viewId = "viewId_example"; // String | viewId
    MergeBranchRequest mergeBranchRequest = new MergeBranchRequest(); // MergeBranchRequest | 
    List<String> mergeRecordOptions = Arrays.asList(); // List<String> | mergeRecordOptions
    try {
      Task result = apiInstance.merge(destinationViewId, viewId, mergeBranchRequest, mergeRecordOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#merge");
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
| **destinationViewId** | **String**| destinationViewId | |
| **viewId** | **String**| viewId | |
| **mergeBranchRequest** | [**MergeBranchRequest**](MergeBranchRequest.md)|  | |
| **mergeRecordOptions** | [**List&lt;String&gt;**](String.md)| mergeRecordOptions | [optional] [enum: add, update, delete, override] |

### Return type

[**Task**](Task.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

