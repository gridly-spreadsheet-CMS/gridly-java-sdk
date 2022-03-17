/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.23.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.service;

import com.gridly.api.client.ApiException;
import com.gridly.api.model.DeleteRecord;
import com.gridly.api.model.Record;
import com.gridly.api.model.SetRecord;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecordApi
 */
@Ignore
public class RecordApiTest {

    private final RecordApi api = new RecordApi();

    
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
        List<SetRecord> createRecords = null;
                List<Record> response = api.create(viewId, createRecords);
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
        String viewId = null;
        DeleteRecord deleteRecord = null;
                api.delete(viewId, deleteRecord);
        // TODO: test validations
    }
    
    /**
     * fetch
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchTest() throws ApiException {
        String viewId = null;
        List<String> columnIds = null;
        String page = null;
        String query = null;
        String sort = null;
                List<Record> response = api.fetch(viewId, columnIds, page, query, sort);
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
        String viewId = null;
        List<SetRecord> updateRecords = null;
                List<Record> response = api.update(viewId, updateRecords);
        // TODO: test validations
    }
    
    /**
     * updateRecord
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRecordTest() throws ApiException {
        String id = null;
        String viewId = null;
        SetRecord updateRecord = null;
        String path = null;
                Record response = api.updateRecord(id, viewId, updateRecord, path);
        // TODO: test validations
    }
    
}
