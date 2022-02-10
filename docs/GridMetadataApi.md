# GridMetadataApi

All URIs are relative to *https://api.gridly.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](GridMetadataApi.md#create) | **POST** /v1/grids/{gridId}/metadata | create
[**delete**](GridMetadataApi.md#delete) | **DELETE** /v1/grids/{gridId}/metadata/{metadataId} | delete
[**get**](GridMetadataApi.md#get) | **GET** /v1/grids/{gridId}/metadata/{metadataId} | get
[**list**](GridMetadataApi.md#list) | **GET** /v1/grids/{gridId}/metadata | list
[**update**](GridMetadataApi.md#update) | **PATCH** /v1/grids/{gridId}/metadata/{metadataId} | update


<a name="create"></a>
# **create**
> Metadata create(gridId, createMetadataDTO)

create

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridMetadataApi apiInstance = new GridMetadataApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    CreateMetadata createMetadataDTO = new CreateMetadata(); // CreateMetadata | createMetadataDTO
    try {
      Metadata result = apiInstance.create(gridId, createMetadataDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridMetadataApi#create");
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
 **gridId** | **String**| gridId |
 **createMetadataDTO** | [**CreateMetadata**](CreateMetadata.md)| createMetadataDTO |

### Return type

[**Metadata**](Metadata.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="delete"></a>
# **delete**
> delete(gridId, metadataId)

delete

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridMetadataApi apiInstance = new GridMetadataApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String metadataId = "metadataId_example"; // String | metadataId
    try {
      apiInstance.delete(gridId, metadataId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridMetadataApi#delete");
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
 **gridId** | **String**| gridId |
 **metadataId** | **String**| metadataId |

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="get"></a>
# **get**
> Metadata get(gridId, metadataId)

get

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridMetadataApi apiInstance = new GridMetadataApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String metadataId = "metadataId_example"; // String | metadataId
    try {
      Metadata result = apiInstance.get(gridId, metadataId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridMetadataApi#get");
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
 **gridId** | **String**| gridId |
 **metadataId** | **String**| metadataId |

### Return type

[**Metadata**](Metadata.md)

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

<a name="list"></a>
# **list**
> List&lt;Metadata&gt; list(gridId)

list

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridMetadataApi apiInstance = new GridMetadataApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    try {
      List<Metadata> result = apiInstance.list(gridId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridMetadataApi#list");
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
 **gridId** | **String**| gridId |

### Return type

[**List&lt;Metadata&gt;**](Metadata.md)

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
> Metadata update(gridId, metadataId, updateMetadataDTO)

update

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.GridMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    GridMetadataApi apiInstance = new GridMetadataApi(defaultClient);
    String gridId = "gridId_example"; // String | gridId
    String metadataId = "metadataId_example"; // String | metadataId
    UpdateMetadata updateMetadataDTO = new UpdateMetadata(); // UpdateMetadata | updateMetadataDTO
    try {
      Metadata result = apiInstance.update(gridId, metadataId, updateMetadataDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GridMetadataApi#update");
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
 **gridId** | **String**| gridId |
 **metadataId** | **String**| metadataId |
 **updateMetadataDTO** | [**UpdateMetadata**](UpdateMetadata.md)| updateMetadataDTO |

### Return type

[**Metadata**](Metadata.md)

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
