# ViewFileApi

All URIs are relative to *https://api.gridly.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download**](ViewFileApi.md#download) | **GET** /v1/views/{viewId}/files/{fileId} | download
[**upload**](ViewFileApi.md#upload) | **POST** /v1/views/{viewId}/files | upload
[**uploadZip**](ViewFileApi.md#uploadZip) | **POST** /v1/views/{viewId}/files/zip | uploadZip


<a name="download"></a>
# **download**
> File download(fileId, viewId)

download

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewFileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewFileApi apiInstance = new ViewFileApi(defaultClient);
    String fileId = "fileId_example"; // String | fileId
    String viewId = "viewId_example"; // String | viewId
    try {
      File result = apiInstance.download(fileId, viewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewFileApi#download");
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
 **fileId** | **String**| fileId |
 **viewId** | **String**| viewId |

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

<a name="upload"></a>
# **upload**
> UploadedFile upload(viewId, columnId, file, recordId)

upload

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewFileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewFileApi apiInstance = new ViewFileApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    Object columnId = null; // Object | columnId
    File file = new File("/path/to/file"); // File | file
    Object recordId = null; // Object | recordId
    try {
      UploadedFile result = apiInstance.upload(viewId, columnId, file, recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewFileApi#upload");
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
 **columnId** | [**Object**](Object.md)| columnId | [default to null]
 **file** | **File**| file |
 **recordId** | [**Object**](Object.md)| recordId | [default to null]

### Return type

[**UploadedFile**](UploadedFile.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="uploadZip"></a>
# **uploadZip**
> List&lt;Record&gt; uploadZip(viewId, columnId, file, fileMappings)

uploadZip

### Example
```java
// Import classes:
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.auth.*;
import com.gridly.api.client.models.*;
import com.gridly.api.service.ViewFileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gridly.com");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ViewFileApi apiInstance = new ViewFileApi(defaultClient);
    String viewId = "viewId_example"; // String | viewId
    Object columnId = null; // Object | columnId
    File file = new File("/path/to/file"); // File | file
    Object fileMappings = null; // Object | fileMappings
    try {
      List<Record> result = apiInstance.uploadZip(viewId, columnId, file, fileMappings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewFileApi#uploadZip");
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
 **columnId** | [**Object**](Object.md)| columnId | [default to null]
 **file** | **File**| file |
 **fileMappings** | [**Object**](Object.md)| fileMappings | [default to null]

### Return type

[**List&lt;Record&gt;**](Record.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

