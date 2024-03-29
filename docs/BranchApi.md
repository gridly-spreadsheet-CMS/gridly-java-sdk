# BranchApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](BranchApi.md#callList) | **GET** /v1/branches | list |
| [**create**](BranchApi.md#create) | **POST** /v1/branches | create |
| [**createDiffCheck**](BranchApi.md#createDiffCheck) | **POST** /v1/branches/diffcheck | createDiffCheck |
| [**delete**](BranchApi.md#delete) | **DELETE** /v1/branches/{branchId} | delete |
| [**get**](BranchApi.md#get) | **GET** /v1/branches/{branchId} | get |
| [**getDiffCheck**](BranchApi.md#getDiffCheck) | **GET** /v1/branches/diffcheck/{taskId} | getDiffCheck |
| [**merge**](BranchApi.md#merge) | **POST** /v1/branches/{branchId}/merge | merge |


<a name="callList"></a>
# **callList**
> List&lt;Branch&gt; callList(gridId)

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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **gridId** | **String**| gridId | |

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
| **200** | OK |  -  |

<a name="create"></a>
# **create**
> Branch create(createBranch, gridId, branchId)

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
    CreateBranch createBranch = new CreateBranch(); // CreateBranch | 
    String gridId = "gridId_example"; // String | gridId
    String branchId = "branchId_example"; // String | branchId
    try {
      Branch result = apiInstance.create(createBranch, gridId, branchId);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBranch** | [**CreateBranch**](CreateBranch.md)|  | |
| **gridId** | **String**| gridId | [optional] |
| **branchId** | **String**| branchId | [optional] |

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
| **201** | Created |  -  |

<a name="createDiffCheck"></a>
# **createDiffCheck**
> Task createDiffCheck(sourceViewId, destinationViewId)

createDiffCheck

createDiffCheck

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
    String sourceViewId = "sourceViewId_example"; // String | sourceViewId
    String destinationViewId = "destinationViewId_example"; // String | destinationViewId
    try {
      Task result = apiInstance.createDiffCheck(sourceViewId, destinationViewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#createDiffCheck");
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
| **sourceViewId** | **String**| sourceViewId | |
| **destinationViewId** | **String**| destinationViewId | |

### Return type

[**Task**](Task.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a name="delete"></a>
# **delete**
> delete(branchId)

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **branchId** | **String**| branchId | |

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
> Branch get(branchId)

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **branchId** | **String**| branchId | |

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
| **200** | OK |  -  |

<a name="getDiffCheck"></a>
# **getDiffCheck**
> List&lt;BranchDiffRecord&gt; getDiffCheck(taskId, mergeRecordOptions, query, page)

getDiffCheck

getDiffCheck

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
    String taskId = "taskId_example"; // String | taskId
    List<String> mergeRecordOptions = Arrays.asList(); // List<String> | mergeRecordOptions
    String query = "{}"; // String | query
    String page = "{}"; // String | page
    try {
      List<BranchDiffRecord> result = apiInstance.getDiffCheck(taskId, mergeRecordOptions, query, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#getDiffCheck");
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
| **taskId** | **String**| taskId | |
| **mergeRecordOptions** | [**List&lt;String&gt;**](String.md)| mergeRecordOptions | [optional] [enum: add, update, delete, override] |
| **query** | **String**| query | [optional] [default to {}] |
| **page** | **String**| page | [optional] [default to {}] |

### Return type

[**List&lt;BranchDiffRecord&gt;**](BranchDiffRecord.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="merge"></a>
# **merge**
> Task merge(branchId, destinationBranchId, mergeBranchRequest, mergeRecordOptions)

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
    MergeBranchRequest mergeBranchRequest = new MergeBranchRequest(); // MergeBranchRequest | 
    List<String> mergeRecordOptions = Arrays.asList(); // List<String> | mergeRecordOptions
    try {
      Task result = apiInstance.merge(branchId, destinationBranchId, mergeBranchRequest, mergeRecordOptions);
      System.out.println(result);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **branchId** | **String**| branchId | |
| **destinationBranchId** | **String**| destinationBranchId | |
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

