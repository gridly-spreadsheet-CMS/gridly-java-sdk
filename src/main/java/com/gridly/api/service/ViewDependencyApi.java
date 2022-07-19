/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.31.0
 * Contact: 
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


import com.gridly.api.model.CreateDependency;
import com.gridly.api.model.DeleteDependency;
import com.gridly.api.model.Dependency;
import com.gridly.api.model.UpdateDependency;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ViewDependencyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ViewDependencyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ViewDependencyApi(ApiClient apiClient) {
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
     * Build call for callList
     * @param viewId viewId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call callListCall(String viewId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/views/{viewId}/dependencies"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call callListValidateBeforeCall(String viewId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling callList(Async)");
        }
        

        okhttp3.Call localVarCall = callListCall(viewId, _callback);
        return localVarCall;

    }

    /**
     * list
     * list
     * @param viewId viewId (required)
     * @return List&lt;Dependency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Dependency> callList(String viewId) throws ApiException {
        ApiResponse<List<Dependency>> localVarResp = callListWithHttpInfo(viewId);
        return localVarResp.getData();
    }

    /**
     * list
     * list
     * @param viewId viewId (required)
     * @return ApiResponse&lt;List&lt;Dependency&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Dependency>> callListWithHttpInfo(String viewId) throws ApiException {
        okhttp3.Call localVarCall = callListValidateBeforeCall(viewId, null);
        Type localVarReturnType = new TypeToken<List<Dependency>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * list
     * @param viewId viewId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call callListAsync(String viewId, final ApiCallback<List<Dependency>> _callback) throws ApiException {

        okhttp3.Call localVarCall = callListValidateBeforeCall(viewId, _callback);
        Type localVarReturnType = new TypeToken<List<Dependency>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param viewId viewId (required)
     * @param createDependency  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCall(String viewId, CreateDependency createDependency, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createDependency;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/dependencies"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(String viewId, CreateDependency createDependency, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling create(Async)");
        }
        
        // verify the required parameter 'createDependency' is set
        if (createDependency == null) {
            throw new ApiException("Missing the required parameter 'createDependency' when calling create(Async)");
        }
        

        okhttp3.Call localVarCall = createCall(viewId, createDependency, _callback);
        return localVarCall;

    }

    /**
     * create
     * create
     * @param viewId viewId (required)
     * @param createDependency  (required)
     * @return Dependency
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public Dependency create(String viewId, CreateDependency createDependency) throws ApiException {
        ApiResponse<Dependency> localVarResp = createWithHttpInfo(viewId, createDependency);
        return localVarResp.getData();
    }

    /**
     * create
     * create
     * @param viewId viewId (required)
     * @param createDependency  (required)
     * @return ApiResponse&lt;Dependency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Dependency> createWithHttpInfo(String viewId, CreateDependency createDependency) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(viewId, createDependency, null);
        Type localVarReturnType = new TypeToken<Dependency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * create
     * @param viewId viewId (required)
     * @param createDependency  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAsync(String viewId, CreateDependency createDependency, final ApiCallback<Dependency> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(viewId, createDependency, _callback);
        Type localVarReturnType = new TypeToken<Dependency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param viewId viewId (required)
     * @param deleteDependency  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCall(String viewId, DeleteDependency deleteDependency, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deleteDependency;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/dependencies"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call deleteValidateBeforeCall(String viewId, DeleteDependency deleteDependency, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling delete(Async)");
        }
        
        // verify the required parameter 'deleteDependency' is set
        if (deleteDependency == null) {
            throw new ApiException("Missing the required parameter 'deleteDependency' when calling delete(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCall(viewId, deleteDependency, _callback);
        return localVarCall;

    }

    /**
     * delete
     * delete
     * @param viewId viewId (required)
     * @param deleteDependency  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void delete(String viewId, DeleteDependency deleteDependency) throws ApiException {
        deleteWithHttpInfo(viewId, deleteDependency);
    }

    /**
     * delete
     * delete
     * @param viewId viewId (required)
     * @param deleteDependency  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteWithHttpInfo(String viewId, DeleteDependency deleteDependency) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(viewId, deleteDependency, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * delete (asynchronously)
     * delete
     * @param viewId viewId (required)
     * @param deleteDependency  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAsync(String viewId, DeleteDependency deleteDependency, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(viewId, deleteDependency, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteById
     * @param viewId viewId (required)
     * @param dependencyId dependencyId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteByIdCall(String viewId, String dependencyId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/views/{viewId}/dependencies/{dependencyId}"
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()))
            .replaceAll("\\{" + "dependencyId" + "\\}", localVarApiClient.escapeString(dependencyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteByIdValidateBeforeCall(String viewId, String dependencyId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling deleteById(Async)");
        }
        
        // verify the required parameter 'dependencyId' is set
        if (dependencyId == null) {
            throw new ApiException("Missing the required parameter 'dependencyId' when calling deleteById(Async)");
        }
        

        okhttp3.Call localVarCall = deleteByIdCall(viewId, dependencyId, _callback);
        return localVarCall;

    }

    /**
     * deleteById
     * deleteById
     * @param viewId viewId (required)
     * @param dependencyId dependencyId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void deleteById(String viewId, String dependencyId) throws ApiException {
        deleteByIdWithHttpInfo(viewId, dependencyId);
    }

    /**
     * deleteById
     * deleteById
     * @param viewId viewId (required)
     * @param dependencyId dependencyId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteByIdWithHttpInfo(String viewId, String dependencyId) throws ApiException {
        okhttp3.Call localVarCall = deleteByIdValidateBeforeCall(viewId, dependencyId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * deleteById (asynchronously)
     * deleteById
     * @param viewId viewId (required)
     * @param dependencyId dependencyId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteByIdAsync(String viewId, String dependencyId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteByIdValidateBeforeCall(viewId, dependencyId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for get
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCall(String dependencyId, String viewId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/views/{viewId}/dependencies/{dependencyId}"
            .replaceAll("\\{" + "dependencyId" + "\\}", localVarApiClient.escapeString(dependencyId.toString()))
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getValidateBeforeCall(String dependencyId, String viewId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dependencyId' is set
        if (dependencyId == null) {
            throw new ApiException("Missing the required parameter 'dependencyId' when calling get(Async)");
        }
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling get(Async)");
        }
        

        okhttp3.Call localVarCall = getCall(dependencyId, viewId, _callback);
        return localVarCall;

    }

    /**
     * get
     * get
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @return Dependency
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Dependency get(String dependencyId, String viewId) throws ApiException {
        ApiResponse<Dependency> localVarResp = getWithHttpInfo(dependencyId, viewId);
        return localVarResp.getData();
    }

    /**
     * get
     * get
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @return ApiResponse&lt;Dependency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Dependency> getWithHttpInfo(String dependencyId, String viewId) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(dependencyId, viewId, null);
        Type localVarReturnType = new TypeToken<Dependency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * get (asynchronously)
     * get
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsync(String dependencyId, String viewId, final ApiCallback<Dependency> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(dependencyId, viewId, _callback);
        Type localVarReturnType = new TypeToken<Dependency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @param updateDependency  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCall(String dependencyId, String viewId, UpdateDependency updateDependency, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateDependency;

        // create path and map variables
        String localVarPath = "/v1/views/{viewId}/dependencies/{dependencyId}"
            .replaceAll("\\{" + "dependencyId" + "\\}", localVarApiClient.escapeString(dependencyId.toString()))
            .replaceAll("\\{" + "viewId" + "\\}", localVarApiClient.escapeString(viewId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateValidateBeforeCall(String dependencyId, String viewId, UpdateDependency updateDependency, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dependencyId' is set
        if (dependencyId == null) {
            throw new ApiException("Missing the required parameter 'dependencyId' when calling update(Async)");
        }
        
        // verify the required parameter 'viewId' is set
        if (viewId == null) {
            throw new ApiException("Missing the required parameter 'viewId' when calling update(Async)");
        }
        
        // verify the required parameter 'updateDependency' is set
        if (updateDependency == null) {
            throw new ApiException("Missing the required parameter 'updateDependency' when calling update(Async)");
        }
        

        okhttp3.Call localVarCall = updateCall(dependencyId, viewId, updateDependency, _callback);
        return localVarCall;

    }

    /**
     * update
     * update
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @param updateDependency  (required)
     * @return Dependency
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Dependency update(String dependencyId, String viewId, UpdateDependency updateDependency) throws ApiException {
        ApiResponse<Dependency> localVarResp = updateWithHttpInfo(dependencyId, viewId, updateDependency);
        return localVarResp.getData();
    }

    /**
     * update
     * update
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @param updateDependency  (required)
     * @return ApiResponse&lt;Dependency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Dependency> updateWithHttpInfo(String dependencyId, String viewId, UpdateDependency updateDependency) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(dependencyId, viewId, updateDependency, null);
        Type localVarReturnType = new TypeToken<Dependency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * update
     * @param dependencyId dependencyId (required)
     * @param viewId viewId (required)
     * @param updateDependency  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAsync(String dependencyId, String viewId, UpdateDependency updateDependency, final ApiCallback<Dependency> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(dependencyId, viewId, updateDependency, _callback);
        Type localVarReturnType = new TypeToken<Dependency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
