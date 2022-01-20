# DatabaseApi

All URIs are relative to *https://api.gridly.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](DatabaseApi.md#create) | **POST** /v1/databases | create
[**delete**](DatabaseApi.md#delete) | **DELETE** /v1/databases/{dbId} | delete
[**duplicate**](DatabaseApi.md#duplicate) | **POST** /v1/databases/{dbId}/duplicate | duplicate
[**get**](DatabaseApi.md#get) | **GET** /v1/databases/{dbId} | get
[**list**](DatabaseApi.md#list) | **GET** /v1/databases | list
[**update**](DatabaseApi.md#update) | **PUT** /v1/databases/{dbId} | update


<a name="create"></a>
# **create**
> Database create(projectId, body)

create

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.DatabaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatabaseApi apiInstance = new DatabaseApi(defaultClient);
    Long projectId = 56L; // Long | projectId
    CreateDatabase body = new CreateDatabase(); // CreateDatabase | body
    try {
      Database result = apiInstance.create(projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#create");
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
 **projectId** | **Long**| projectId |
 **body** | [**CreateDatabase**](CreateDatabase.md)| body |

### Return type

[**Database**](Database.md)

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
> delete(dbId)

delete

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.DatabaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatabaseApi apiInstance = new DatabaseApi(defaultClient);
    String dbId = "dbId_example"; // String | dbId
    try {
      apiInstance.delete(dbId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#delete");
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
 **dbId** | **String**| dbId |

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

<a name="duplicate"></a>
# **duplicate**
> Database duplicate(dbId, projectId, body)

duplicate

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.DatabaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatabaseApi apiInstance = new DatabaseApi(defaultClient);
    String dbId = "dbId_example"; // String | dbId
    Long projectId = 56L; // Long | projectId
    CreateDatabase body = new CreateDatabase(); // CreateDatabase | body
    try {
      Database result = apiInstance.duplicate(dbId, projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#duplicate");
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
 **dbId** | **String**| dbId |
 **projectId** | **Long**| projectId |
 **body** | [**CreateDatabase**](CreateDatabase.md)| body |

### Return type

[**Database**](Database.md)

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

<a name="get"></a>
# **get**
> Database get(dbId)

get

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.DatabaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatabaseApi apiInstance = new DatabaseApi(defaultClient);
    String dbId = "dbId_example"; // String | dbId
    try {
      Database result = apiInstance.get(dbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#get");
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
 **dbId** | **String**| dbId |

### Return type

[**Database**](Database.md)

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
> List&lt;Database&gt; list(expand, page, projectId, search, sort)

list

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.DatabaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatabaseApi apiInstance = new DatabaseApi(defaultClient);
    List<String> expand = Arrays.asList(); // List<String> | expand
    String page = "page_example"; // String | page
    Long projectId = 56L; // Long | projectId
    String search = "search_example"; // String | search
    String sort = "sort_example"; // String | sort
    try {
      List<Database> result = apiInstance.list(expand, page, projectId, search, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#list");
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
 **expand** | [**List&lt;String&gt;**](String.md)| expand | [optional] [enum: grid, view]
 **page** | **String**| page | [optional]
 **projectId** | **Long**| projectId | [optional]
 **search** | **String**| search | [optional]
 **sort** | **String**| sort | [optional]

### Return type

[**List&lt;Database&gt;**](Database.md)

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
> Database update(dbId, body)

update

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.DatabaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatabaseApi apiInstance = new DatabaseApi(defaultClient);
    String dbId = "dbId_example"; // String | dbId
    UpdateDatabase body = new UpdateDatabase(); // UpdateDatabase | body
    try {
      Database result = apiInstance.update(dbId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#update");
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
 **dbId** | **String**| dbId |
 **body** | [**UpdateDatabase**](UpdateDatabase.md)| body |

### Return type

[**Database**](Database.md)

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

