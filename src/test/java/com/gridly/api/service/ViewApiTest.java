/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.21.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.service;

import com.gridly.api.client.ApiException;
import java.io.File;
import com.gridly.api.model.Task;
import com.gridly.api.model.View;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ViewApi
 */
@Ignore
public class ViewApiTest {

    private final ViewApi api = new ViewApi();

    
    /**
     * export
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportTest() throws ApiException {
        String viewId = null;
        List<String> columnIds = null;
        String query = null;
        String sort = null;
        String type = null;
        File response = api.export(viewId, columnIds, query, sort, type);

        // TODO: test validations
    }
    
    /**
     * get
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String viewId = null;
        List<String> columnIds = null;
        List<String> include = null;
        String page = null;
        String query = null;
        String sort = null;
        View response = api.get(viewId, columnIds, include, page, query, sort);

        // TODO: test validations
    }
    
    /**
     * importView
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importViewTest() throws ApiException {
        String viewId = null;
        File file = null;
        Object importRequest = null;
        Object type = null;
        api.importView(viewId, file, importRequest, type);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String branchId = null;
        String gridId = null;
        String type = null;
        List<View> response = api.list(branchId, gridId, type);

        // TODO: test validations
    }
    
    /**
     * merge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeTest() throws ApiException {
        String destinationViewId = null;
        String viewId = null;
        List<String> mergeRecordOptions = null;
        api.merge(destinationViewId, viewId, mergeRecordOptions);

        // TODO: test validations
    }
    
}