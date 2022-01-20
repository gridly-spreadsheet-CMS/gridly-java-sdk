# BranchApi

All URIs are relative to *https://api.gridly.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](BranchApi.md#create) | **POST** /v1/branches | create
[**delete**](BranchApi.md#delete) | **DELETE** /v1/branches/{branchId} | delete
[**get**](BranchApi.md#get) | **GET** /v1/branches/{branchId} | get
[**list**](BranchApi.md#list) | **GET** /v1/branches | list
[**merge**](BranchApi.md#merge) | **POST** /v1/branches/{branchId}/merge | merge


<a name="create"></a>
# **create**
> Branch create(createBranch, branchId, gridId)

create

### Example
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
    CreateBranch createBranch = new CreateBranch(); // CreateBranch | createBranch
    String branchId = "branchId_example"; // String | branchId
    String gridId = "gridId_example"; // String | gridId
    try {
      Branch result = apiInstance.create(createBranch, branchId, gridId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#create");
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
 **createBranch** | [**CreateBranch**](CreateBranch.md)| createBranch |
 **branchId** | **String**| branchId | [optional]
 **gridId** | **String**| gridId | [optional]

### Return type

[**Branch**](Branch.md)

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
> delete(branchId)

delete

### Example
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
    String branchId = "branchId_example"; // String | branchId
    try {
      apiInstance.delete(branchId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#delete");
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
 **branchId** | **String**| branchId |

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
> Branch get(branchId)

get

### Example
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
    String branchId = "branchId_example"; // String | branchId
    try {
      Branch result = apiInstance.get(branchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#get");
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
 **branchId** | **String**| branchId |

### Return type

[**Branch**](Branch.md)

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
> List&lt;Branch&gt; list(gridId)

list

### Example
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
      List<Branch> result = apiInstance.list(gridId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#list");
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

[**List&lt;Branch&gt;**](Branch.md)

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
> merge(branchId, destinationBranchId, mergeRecordOptions)

merge

### Example
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
    String branchId = "branchId_example"; // String | branchId
    String destinationBranchId = "destinationBranchId_example"; // String | destinationBranchId
    List<String> mergeRecordOptions = Arrays.asList(); // List<String> | mergeRecordOptions
    try {
      apiInstance.merge(branchId, destinationBranchId, mergeRecordOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#merge");
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
 **branchId** | **String**| branchId |
 **destinationBranchId** | **String**| destinationBranchId |
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

