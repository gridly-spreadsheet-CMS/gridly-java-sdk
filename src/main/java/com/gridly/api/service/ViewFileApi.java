/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.15.1
 * Contact: support@gridly.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.service;

import com.gridly.api.client.ApiCallback;
import com.gridly.api.client.ApiClient;
import com.gridly.api.client.ApiException;
import com.gridly.api.client.ApiResponse;
import com.gridly.api.client.Configuration;
import com.gridly.api.client.Pair;
import com.gridly.api.client.ProgressRequestBody;
import com.gridly.api.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.gridly.api.model.DeleteFile;
import java.io.File;
import com.gridly.api.model.Record;
import com.gridly.api.model.UploadedFile;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ViewFileApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ViewFileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ViewFileApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for delete
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param viewId viewId (required)
     * @param deleteFile  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCall(String columnId, String recordId, String viewId, DeleteFile deleteFile, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteFile;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/files"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (columnId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("columnId", columnId));
        }

        if (recordId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recordId", recordId));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(String columnId, String recordId, String viewId, DeleteFile deleteFile, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'columnId' is set
        if (columnId == null) {
            throw new ApiException("Missing the required parameter 'columnId' when calling delete(Async)");
        }
        
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new ApiException("Missing the required parameter 'recordId' when calling delete(Async)");
        }
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling delete(Async)");
        }
        
        // verify the required parameter 'deleteFile' is set
        if (deleteFile == null) {
            throw new ApiException("Missing the required parameter 'deleteFile' when calling delete(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCall(columnId, recordId, viewId, deleteFile, _callback);
        return localVarCall;

    }

    /**
     * delete
     * delete
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param viewId viewId (required)
     * @param deleteFile  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void delete(String columnId, String recordId, String viewId, DeleteFile deleteFile) throws ApiException {
        deleteWithHttpInfo(columnId, recordId, viewId, deleteFile);
    }

    /**
     * delete
     * delete
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param viewId viewId (required)
     * @param deleteFile  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteWithHttpInfo(String columnId, String recordId, String viewId, DeleteFile deleteFile) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(columnId, recordId, viewId, deleteFile, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * delete (asynchronously)
     * delete
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param viewId viewId (required)
     * @param deleteFile  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAsync(String columnId, String recordId, String viewId, DeleteFile deleteFile, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(columnId, recordId, viewId, deleteFile, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for download
     * @param fileId fileId (required)
     * @param viewId viewId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadCall(String fileId, String viewId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/files/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadValidateBeforeCall(String fileId, String viewId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling download(Async)");
        }
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling download(Async)");
        }
        

        okhttp3.Call localVarCall = downloadCall(fileId, viewId, _callback);
        return localVarCall;

    }

    /**
     * download
     * download
     * @param fileId fileId (required)
     * @param viewId viewId (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public File download(String fileId, String viewId) throws ApiException {
        ApiResponse<File> localVarResp = downloadWithHttpInfo(fileId, viewId);
        return localVarResp.getData();
    }

    /**
     * download
     * download
     * @param fileId fileId (required)
     * @param viewId viewId (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> downloadWithHttpInfo(String fileId, String viewId) throws ApiException {
        okhttp3.Call localVarCall = downloadValidateBeforeCall(fileId, viewId, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * download (asynchronously)
     * download
     * @param fileId fileId (required)
     * @param viewId viewId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadAsync(String fileId, String viewId, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadValidateBeforeCall(fileId, viewId, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upload
     * @param viewId viewId (required)
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param _file  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadCall(String viewId, String columnId, String recordId, File _file, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/files"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (columnId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("columnId", columnId));
        }

        if (recordId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recordId", recordId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadValidateBeforeCall(String viewId, String columnId, String recordId, File _file, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling upload(Async)");
        }
        
        // verify the required parameter 'columnId' is set
        if (columnId == null) {
            throw new ApiException("Missing the required parameter 'columnId' when calling upload(Async)");
        }
        
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new ApiException("Missing the required parameter 'recordId' when calling upload(Async)");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling upload(Async)");
        }
        

        okhttp3.Call localVarCall = uploadCall(viewId, columnId, recordId, _file, _callback);
        return localVarCall;

    }

    /**
     * upload
     * upload
     * @param viewId viewId (required)
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param _file  (required)
     * @return UploadedFile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public UploadedFile upload(String viewId, String columnId, String recordId, File _file) throws ApiException {
        ApiResponse<UploadedFile> localVarResp = uploadWithHttpInfo(viewId, columnId, recordId, _file);
        return localVarResp.getData();
    }

    /**
     * upload
     * upload
     * @param viewId viewId (required)
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param _file  (required)
     * @return ApiResponse&lt;UploadedFile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UploadedFile> uploadWithHttpInfo(String viewId, String columnId, String recordId, File _file) throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(viewId, columnId, recordId, _file, null);
        Type localVarReturnType = new TypeToken<UploadedFile>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * upload (asynchronously)
     * upload
     * @param viewId viewId (required)
     * @param columnId columnId (required)
     * @param recordId recordId (required)
     * @param _file  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadAsync(String viewId, String columnId, String recordId, File _file, final ApiCallback<UploadedFile> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(viewId, columnId, recordId, _file, _callback);
        Type localVarReturnType = new TypeToken<UploadedFile>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadZip
     * @param viewId viewId (required)
     * @param columnId  (required)
     * @param fileMappings  (required)
     * @param _file  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadZipCall(String viewId, String columnId, String fileMappings, File _file, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/files/zip"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (columnId != null) {
            localVarFormParams.put("columnId", columnId);
        }

        if (fileMappings != null) {
            localVarFormParams.put("fileMappings", fileMappings);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadZipValidateBeforeCall(String viewId, String columnId, String fileMappings, File _file, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling uploadZip(Async)");
        }
        
        // verify the required parameter 'columnId' is set
        if (columnId == null) {
            throw new ApiException("Missing the required parameter 'columnId' when calling uploadZip(Async)");
        }
        
        // verify the required parameter 'fileMappings' is set
        if (fileMappings == null) {
            throw new ApiException("Missing the required parameter 'fileMappings' when calling uploadZip(Async)");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling uploadZip(Async)");
        }
        

        okhttp3.Call localVarCall = uploadZipCall(viewId, columnId, fileMappings, _file, _callback);
        return localVarCall;

    }

    /**
     * uploadZip
     * uploadZip
     * @param viewId viewId (required)
     * @param columnId  (required)
     * @param fileMappings  (required)
     * @param _file  (required)
     * @return List&lt;Record&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public List<Record> uploadZip(String viewId, String columnId, String fileMappings, File _file) throws ApiException {
        ApiResponse<List<Record>> localVarResp = uploadZipWithHttpInfo(viewId, columnId, fileMappings, _file);
        return localVarResp.getData();
    }

    /**
     * uploadZip
     * uploadZip
     * @param viewId viewId (required)
     * @param columnId  (required)
     * @param fileMappings  (required)
     * @param _file  (required)
     * @return ApiResponse&lt;List&lt;Record&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Record>> uploadZipWithHttpInfo(String viewId, String columnId, String fileMappings, File _file) throws ApiException {
        okhttp3.Call localVarCall = uploadZipValidateBeforeCall(viewId, columnId, fileMappings, _file, null);
        Type localVarReturnType = new TypeToken<List<Record>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * uploadZip (asynchronously)
     * uploadZip
     * @param viewId viewId (required)
     * @param columnId  (required)
     * @param fileMappings  (required)
     * @param _file  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadZipAsync(String viewId, String columnId, String fileMappings, File _file, final ApiCallback<List<Record>> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadZipValidateBeforeCall(viewId, columnId, fileMappings, _file, _callback);
        Type localVarReturnType = new TypeToken<List<Record>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
