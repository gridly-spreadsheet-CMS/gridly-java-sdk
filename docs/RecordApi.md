# RecordApi

All URIs are relative to *https://api.gridly.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](RecordApi.md#create) | **POST** /v1/views/{viewId}/records | create
[**delete**](RecordApi.md#delete) | **DELETE** /v1/views/{viewId}/records | delete
[**fetch**](RecordApi.md#fetch) | **GET** /v1/views/{viewId}/records | fetch
[**update**](RecordApi.md#update) | **PATCH** /v1/views/{viewId}/records | update
[**updateRecord**](RecordApi.md#updateRecord) | **PATCH** /v1/views/{viewId}/records/{id} | updateRecord


<a name="create"></a>
# **create**
> List&lt;Record&gt; create(viewId, createRecords)

create

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.RecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    RecordApi apiInstance = new RecordApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    List<SetRecord> createRecords = Arrays.asList(); // List<SetRecord> | createRecords
    try {
      List<Record> result = apiInstance.create(viewId, createRecords);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordApi#create");
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
 **createRecords** | [**List&lt;SetRecord&gt;**](SetRecord.md)| createRecords |

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="delete"></a>
# **delete**
> delete(viewId, deleteRecord)

delete

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.RecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    RecordApi apiInstance = new RecordApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    DeleteRecord deleteRecord = new DeleteRecord(); // DeleteRecord | deleteRecord
    try {
      apiInstance.delete(viewId, deleteRecord);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordApi#delete");
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
 **deleteRecord** | [**DeleteRecord**](DeleteRecord.md)| deleteRecord |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="fetch"></a>
# **fetch**
> List&lt;Record&gt; fetch(viewId, columnIds, page, query, sort)

fetch

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.RecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    RecordApi apiInstance = new RecordApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    List<String> columnIds = Arrays.asList(); // List<String> | columnIds
    String page = "{}"; // String | page
    String query = "{}"; // String | query
    String sort = "{}"; // String | sort
    try {
      List<Record> result = apiInstance.fetch(viewId, columnIds, page, query, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordApi#fetch");
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
 **page** | **String**| page | [optional] [default to {}]
 **query** | **String**| query | [optional] [default to {}]
 **sort** | **String**| sort | [optional] [default to {}]

### Return type

[**List&lt;Record&gt;**](Record.md)

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

<a name="update"></a>
# **update**
> List&lt;Record&gt; update(viewId, updateRecords)

update

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.RecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    RecordApi apiInstance = new RecordApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    List<SetRecord> updateRecords = Arrays.asList(); // List<SetRecord> | updateRecords
    try {
      List<Record> result = apiInstance.update(viewId, updateRecords);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordApi#update");
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
 **updateRecords** | [**List&lt;SetRecord&gt;**](SetRecord.md)| updateRecords |

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="updateRecord"></a>
# **updateRecord**
> Record updateRecord(id, viewId, updateRecord, path)

updateRecord

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.RecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    RecordApi apiInstance = new RecordApi(defaultClient);
    String id = "id_example"; // String | id
    String viewId = "viewId_example"; // String | viewId
    SetRecord updateRecord = new SetRecord(); // SetRecord | updateRecord
    String path = "path_example"; // String | path
    try {
      Record result = apiInstance.updateRecord(id, viewId, updateRecord, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordApi#updateRecord");
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
 **id** | **String**| id |
 **viewId** | **String**| viewId |
 **updateRecord** | [**SetRecord**](SetRecord.md)| updateRecord |
 **path** | **String**| path | [optional]

### Return type

[**Record**](Record.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

