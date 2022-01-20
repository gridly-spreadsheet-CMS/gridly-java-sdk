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
import com.gridly.api.model.CreateColumn;
import com.gridly.api.model.UpdateColumn;
import com.gridly.api.model.ViewColumn;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ViewColumnApi
 */
@Ignore
public class ViewColumnApiTest {

    private final ViewColumnApi api = new ViewColumnApi();

    
    /**
     * add
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTest() throws ApiException {
        String columnId = null;
        String viewId = null;
        ViewColumn response = api.add(columnId, viewId);

        // TODO: test validations
    }
    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String viewId = null;
        CreateColumn createColumn = null;
        ViewColumn response = api.create(viewId, createColumn);

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String columnId = null;
        String viewId = null;
        api.delete(columnId, viewId);

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
        String columnId = null;
        String viewId = null;
        ViewColumn response = api.get(columnId, viewId);

        // TODO: test validations
    }
    
    /**
     * remove
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        String columnId = null;
        String viewId = null;
        api.remove(columnId, viewId);

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String columnId = null;
        String viewId = null;
        UpdateColumn updateColumn = null;
        ViewColumn response = api.update(columnId, viewId, updateColumn);

        // TODO: test validations
    }
    
}
