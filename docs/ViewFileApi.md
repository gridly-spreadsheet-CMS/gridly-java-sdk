# ViewFileApi

All URIs are relative to *https://api.gridly.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](ViewFileApi.md#delete) | **DELETE** /v1/views/{viewId}/files | delete |
| [**download**](ViewFileApi.md#download) | **GET** /v1/views/{viewId}/files/{fileId} | download |
| [**upload**](ViewFileApi.md#upload) | **POST** /v1/views/{viewId}/files | upload |
| [**uploadZip**](ViewFileApi.md#uploadZip) | **POST** /v1/views/{viewId}/files/zip | uploadZip |


<a name="delete"></a>
# **delete**
> delete(columnId, recordId, viewId, deleteFile)

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
    String columnId = "columnId_example"; // String | columnId
    String recordId = "recordId_example"; // String | recordId
    String viewId = "viewId_example"; // String | viewId
    DeleteFile deleteFile = new DeleteFile(); // DeleteFile | 
    try {
      apiInstance.delete(columnId, recordId, viewId, deleteFile);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewFileApi#delete");
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
| **recordId** | **String**| recordId | |
| **viewId** | **String**| viewId | |
| **deleteFile** | [**DeleteFile**](DeleteFile.md)|  | |

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

<a name="download"></a>
# **download**
> File download(fileId, viewId)

download

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | **String**| fileId | |
| **viewId** | **String**| viewId | |

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
| **0** | default response |  -  |

<a name="upload"></a>
# **upload**
> UploadedFile upload(viewId, columnId, recordId, _file)

upload

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
    String columnId = "columnId_example"; // String | columnId
    String recordId = "recordId_example"; // String | recordId
    File _file = new File("/path/to/file"); // File | 
    try {
      UploadedFile result = apiInstance.upload(viewId, columnId, recordId, _file);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| viewId | |
| **columnId** | **String**| columnId | |
| **recordId** | **String**| recordId | |
| **_file** | **File**|  | |

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
| **201** | Created |  -  |

<a name="uploadZip"></a>
# **uploadZip**
> List&lt;Record&gt; uploadZip(viewId, columnId, fileMappings, _file)

uploadZip

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
    String columnId = "columnId_example"; // String | 
    String fileMappings = "fileMappings_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      List<Record> result = apiInstance.uploadZip(viewId, columnId, fileMappings, _file);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **viewId** | **String**| viewId | |
| **columnId** | **String**|  | |
| **fileMappings** | **String**|  | |
| **_file** | **File**|  | |

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
| **0** | default response |  -  |

