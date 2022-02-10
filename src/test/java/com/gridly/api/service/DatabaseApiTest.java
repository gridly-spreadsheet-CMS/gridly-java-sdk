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
import com.gridly.api.model.CreateDatabase;
import com.gridly.api.model.Database;
import com.gridly.api.model.UpdateDatabase;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatabaseApi
 */
@Ignore
public class DatabaseApiTest {

    private final DatabaseApi api = new DatabaseApi();

    
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
        Long projectId = null;
        CreateDatabase body = null;
        Database response = api.create(projectId, body);

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
        String dbId = null;
        api.delete(dbId);

        // TODO: test validations
    }
    
    /**
     * duplicate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void duplicateTest() throws ApiException {
        String dbId = null;
        Long projectId = null;
        CreateDatabase body = null;
        Database response = api.duplicate(dbId, projectId, body);

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
        String dbId = null;
        Database response = api.get(dbId);

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
        List<String> expand = null;
        String page = null;
        Long projectId = null;
        String search = null;
        String sort = null;
        List<Database> response = api.list(expand, page, projectId, search, sort);

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
        String dbId = null;
        UpdateDatabase body = null;
        Database response = api.update(dbId, body);

        // TODO: test validations
    }
    
}