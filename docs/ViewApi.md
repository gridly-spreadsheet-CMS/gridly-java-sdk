# ViewApi

All URIs are relative to *https://api.gridly.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**export**](ViewApi.md#export) | **GET** /v1/views/{viewId}/export | export
[**get**](ViewApi.md#get) | **GET** /v1/views/{viewId} | get
[**importView**](ViewApi.md#importView) | **POST** /v1/views/{viewId}/import | importView
[**list**](ViewApi.md#list) | **GET** /v1/views | list
[**merge**](ViewApi.md#merge) | **POST** /v1/views/{viewId}/merge | merge


<a name="export"></a>
# **export**
> File export(viewId, columnIds, fileHeader, query, sort, type)

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
    String fileHeader = "none"; // String | fileHeader
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**| viewId |
 **columnIds** | [**List&lt;String&gt;**](String.md)| columnIds | [optional]
 **fileHeader** | **String**| fileHeader | [optional] [default to columnName] [enum: none, columnName]
 **query** | **String**| query | [optional] [default to {}]
 **sort** | **String**| sort | [optional] [default to {}]
 **type** | **String**| type | [optional] [default to csv] [enum: csv, tsv, xls, xlsx, json, po]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="get"></a>
# **get**
> View get(viewId, columnIds, include, page, query, sort)

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**| viewId |
 **columnIds** | [**List&lt;String&gt;**](String.md)| columnIds | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| include | [optional] [enum: records]
 **page** | **String**| page | [optional] [default to {}]
 **query** | **String**| query | [optional] [default to {}]
 **sort** | **String**| sort | [optional] [default to {}]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="importView"></a>
# **importView**
> importView(viewId, file, importRequest, type)

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
    File file = new File("/path/to/file"); // File | The following file types are supported: csv, tsv, xls, xlsx and JSON
    Object importRequest = null; // Object | importRequest
    Object type = null; // Object | type
    try {
      apiInstance.importView(viewId, file, importRequest, type);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**| viewId |
 **file** | **File**| The following file types are supported: csv, tsv, xls, xlsx and JSON |
 **importRequest** | [**Object**](Object.md)| importRequest | [optional] [default to null]
 **type** | [**Object**](Object.md)| type | [optional] [default to null]

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
**201** | Created |  -  |
**202** | Accepted |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="list"></a>
# **list**
> List&lt;View&gt; list(branchId, gridId, type)

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
      List<View> result = apiInstance.list(branchId, gridId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **String**| branchId | [optional]
 **gridId** | **String**| gridId | [optional]
 **type** | **String**| type | [optional] [enum: defaultView, accessView, userView]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="merge"></a>
# **merge**
> merge(destinationViewId, viewId, mergeRecordOptions)

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
    List<String> mergeRecordOptions = Arrays.asList(); // List<String> | mergeRecordOptions
    try {
      apiInstance.merge(destinationViewId, viewId, mergeRecordOptions);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinationViewId** | **String**| destinationViewId |
 **viewId** | **String**| viewId |
 **mergeRecordOptions** | [**List&lt;String&gt;**](String.md)| mergeRecordOptions | [optional] [enum: add, update, delete, override]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**202** | Accepted |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

