# ViewColumnApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](ViewColumnApi.md#add) | **POST** /v1/views/{viewId}/columns/{columnId}/add | add |
| [**create**](ViewColumnApi.md#create) | **POST** /v1/views/{viewId}/columns | create |
| [**delete**](ViewColumnApi.md#delete) | **DELETE** /v1/views/{viewId}/columns/{columnId} | delete |
| [**get**](ViewColumnApi.md#get) | **GET** /v1/views/{viewId}/columns/{columnId} | get |
| [**remove**](ViewColumnApi.md#remove) | **POST** /v1/views/{viewId}/columns/{columnId}/remove | remove |
| [**update**](ViewColumnApi.md#update) | **PATCH** /v1/views/{viewId}/columns/{columnId} | update |


<a name="add"></a>
# **add**
> ViewColumn add(columnId, viewId)

add

add

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewColumnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewColumnApi apiInstance = new ViewColumnApi(defaultClient);
    String columnId = "columnId_example"; // String | columnId
    String viewId = "viewId_example"; // String | viewId
    try {
      ViewColumn result = apiInstance.add(columnId, viewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewColumnApi#add");
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
| **columnId** | **String**| columnId | |
| **viewId** | **String**| viewId | |

### Return type

[**ViewColumn**](ViewColumn.md)

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
> ViewColumn create(viewId, createColumn)

create

Create a Column

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewColumnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewColumnApi apiInstance = new ViewColumnApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    CreateColumn createColumn = new CreateColumn(); // CreateColumn | 
    try {
      ViewColumn result = apiInstance.create(viewId, createColumn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewColumnApi#create");
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
| **createColumn** | [**CreateColumn**](CreateColumn.md)|  | |

### Return type

[**ViewColumn**](ViewColumn.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="delete"></a>
# **delete**
> delete(columnId, viewId)

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
import com.gridly.api.service.ViewColumnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewColumnApi apiInstance = new ViewColumnApi(defaultClient);
    String columnId = "columnId_example"; // String | columnId
    String viewId = "viewId_example"; // String | viewId
    try {
      apiInstance.delete(columnId, viewId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewColumnApi#delete");
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
| **columnId** | **String**| columnId | |
| **viewId** | **String**| viewId | |

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
> ViewColumn get(columnId, viewId)

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
import com.gridly.api.service.ViewColumnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewColumnApi apiInstance = new ViewColumnApi(defaultClient);
    String columnId = "columnId_example"; // String | columnId
    String viewId = "viewId_example"; // String | viewId
    try {
      ViewColumn result = apiInstance.get(columnId, viewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewColumnApi#get");
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
| **columnId** | **String**| columnId | |
| **viewId** | **String**| viewId | |

### Return type

[**ViewColumn**](ViewColumn.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="remove"></a>
# **remove**
> remove(columnId, viewId)

remove

remove

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewColumnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewColumnApi apiInstance = new ViewColumnApi(defaultClient);
    String columnId = "columnId_example"; // String | columnId
    String viewId = "viewId_example"; // String | viewId
    try {
      apiInstance.remove(columnId, viewId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewColumnApi#remove");
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
| **columnId** | **String**| columnId | |
| **viewId** | **String**| viewId | |

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
| **200** | OK |  -  |

<a name="update"></a>
# **update**
> ViewColumn update(columnId, viewId, updateColumn)

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
import com.gridly.api.service.ViewColumnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewColumnApi apiInstance = new ViewColumnApi(defaultClient);
    String columnId = "columnId_example"; // String | columnId
    String viewId = "viewId_example"; // String | viewId
    UpdateColumn updateColumn = new UpdateColumn(); // UpdateColumn | 
    try {
      ViewColumn result = apiInstance.update(columnId, viewId, updateColumn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewColumnApi#update");
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
| **columnId** | **String**| columnId | |
| **viewId** | **String**| viewId | |
| **updateColumn** | [**UpdateColumn**](UpdateColumn.md)|  | |

### Return type

[**ViewColumn**](ViewColumn.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

