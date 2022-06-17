# ViewDependencyApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](ViewDependencyApi.md#callList) | **GET** /v1/views/{viewId}/dependencies | list |
| [**create**](ViewDependencyApi.md#create) | **POST** /v1/views/{viewId}/dependencies | create |
| [**delete**](ViewDependencyApi.md#delete) | **DELETE** /v1/views/{viewId}/dependencies | delete |
| [**deleteById**](ViewDependencyApi.md#deleteById) | **DELETE** /v1/views/{viewId}/dependencies/{dependencyId} | deleteById |
| [**get**](ViewDependencyApi.md#get) | **GET** /v1/views/{viewId}/dependencies/{dependencyId} | get |
| [**update**](ViewDependencyApi.md#update) | **PUT** /v1/views/{viewId}/dependencies/{dependencyId} | update |


<a name="callList"></a>
# **callList**
> List&lt;Dependency&gt; callList(viewId)

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
import com.gridly.api.service.ViewDependencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewDependencyApi apiInstance = new ViewDependencyApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    try {
      List<Dependency> result = apiInstance.callList(viewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewDependencyApi#callList");
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

### Return type

[**List&lt;Dependency&gt;**](Dependency.md)

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
> Dependency create(viewId, createDependency)

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
import com.gridly.api.service.ViewDependencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewDependencyApi apiInstance = new ViewDependencyApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    CreateDependency createDependency = new CreateDependency(); // CreateDependency | 
    try {
      Dependency result = apiInstance.create(viewId, createDependency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewDependencyApi#create");
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
| **createDependency** | [**CreateDependency**](CreateDependency.md)|  | |

### Return type

[**Dependency**](Dependency.md)

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
> delete(viewId, deleteDependency)

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
import com.gridly.api.service.ViewDependencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewDependencyApi apiInstance = new ViewDependencyApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    DeleteDependency deleteDependency = new DeleteDependency(); // DeleteDependency | 
    try {
      apiInstance.delete(viewId, deleteDependency);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewDependencyApi#delete");
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
| **deleteDependency** | [**DeleteDependency**](DeleteDependency.md)|  | |

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

<a name="deleteById"></a>
# **deleteById**
> deleteById(viewId, dependencyId)

deleteById

deleteById

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewDependencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewDependencyApi apiInstance = new ViewDependencyApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    String dependencyId = "dependencyId_example"; // String | dependencyId
    try {
      apiInstance.deleteById(viewId, dependencyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewDependencyApi#deleteById");
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
| **dependencyId** | **String**| dependencyId | |

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
> Dependency get(dependencyId, viewId)

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
import com.gridly.api.service.ViewDependencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewDependencyApi apiInstance = new ViewDependencyApi(defaultClient);
    String dependencyId = "dependencyId_example"; // String | dependencyId
    String viewId = "viewId_example"; // String | viewId
    try {
      Dependency result = apiInstance.get(dependencyId, viewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewDependencyApi#get");
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
| **dependencyId** | **String**| dependencyId | |
| **viewId** | **String**| viewId | |

### Return type

[**Dependency**](Dependency.md)

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
> Dependency update(dependencyId, viewId, updateDependency)

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
import com.gridly.api.service.ViewDependencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewDependencyApi apiInstance = new ViewDependencyApi(defaultClient);
    String dependencyId = "dependencyId_example"; // String | dependencyId
    String viewId = "viewId_example"; // String | viewId
    UpdateDependency updateDependency = new UpdateDependency(); // UpdateDependency | 
    try {
      Dependency result = apiInstance.update(dependencyId, viewId, updateDependency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewDependencyApi#update");
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
| **dependencyId** | **String**| dependencyId | |
| **viewId** | **String**| viewId | |
| **updateDependency** | [**UpdateDependency**](UpdateDependency.md)|  | |

### Return type

[**Dependency**](Dependency.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

