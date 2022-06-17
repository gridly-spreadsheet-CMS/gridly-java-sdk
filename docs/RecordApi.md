# RecordApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](RecordApi.md#create) | **POST** /v1/views/{viewId}/records | create |
| [**delete**](RecordApi.md#delete) | **DELETE** /v1/views/{viewId}/records | delete |
| [**fetch**](RecordApi.md#fetch) | **GET** /v1/views/{viewId}/records | fetch |
| [**update**](RecordApi.md#update) | **PATCH** /v1/views/{viewId}/records | update |
| [**updateRecord**](RecordApi.md#updateRecord) | **PATCH** /v1/views/{viewId}/records/{id} | updateRecord |


<a name="create"></a>
# **create**
> List&lt;Record&gt; create(viewId, setRecord)

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
    List<SetRecord> setRecord = Arrays.asList(); // List<SetRecord> | 
    try {
      List<Record> result = apiInstance.create(viewId, setRecord);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| viewId | |
| **setRecord** | [**List&lt;SetRecord&gt;**](SetRecord.md)|  | |

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
| **200** | OK |  -  |

<a name="delete"></a>
# **delete**
> delete(viewId, deleteRecord)

delete

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
    DeleteRecord deleteRecord = new DeleteRecord(); // DeleteRecord | 
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| viewId | |
| **deleteRecord** | [**DeleteRecord**](DeleteRecord.md)|  | |

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
| **204** | No Content |  -  |

<a name="fetch"></a>
# **fetch**
> List&lt;Record&gt; fetch(viewId, columnIds, page, query, sort, fetchFileOption)

fetch

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
    FetchFileOption fetchFileOption = FetchFileOption.fromValue("all"); // FetchFileOption | fetchFileOption
    try {
      List<Record> result = apiInstance.fetch(viewId, columnIds, page, query, sort, fetchFileOption);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| viewId | |
| **columnIds** | [**List&lt;String&gt;**](String.md)| columnIds | [optional] |
| **page** | **String**| page | [optional] [default to {}] |
| **query** | **String**| query | [optional] [default to {}] |
| **sort** | **String**| sort | [optional] [default to {}] |
| **fetchFileOption** | [**FetchFileOption**](.md)| fetchFileOption | [optional] [default to id] [enum: all, id, name] |

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
| **200** | OK |  -  |

<a name="update"></a>
# **update**
> List&lt;Record&gt; update(viewId, setRecord)

update

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
    List<SetRecord> setRecord = Arrays.asList(); // List<SetRecord> | 
    try {
      List<Record> result = apiInstance.update(viewId, setRecord);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| viewId | |
| **setRecord** | [**List&lt;SetRecord&gt;**](SetRecord.md)|  | |

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
| **200** | OK |  -  |

<a name="updateRecord"></a>
# **updateRecord**
> Record updateRecord(id, viewId, setRecord, path)

updateRecord

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
    SetRecord setRecord = new SetRecord(); // SetRecord | 
    String path = "path_example"; // String | path
    try {
      Record result = apiInstance.updateRecord(id, viewId, setRecord, path);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| id | |
| **viewId** | **String**| viewId | |
| **setRecord** | [**SetRecord**](SetRecord.md)|  | |
| **path** | **String**| path | [optional] |

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
| **200** | OK |  -  |

