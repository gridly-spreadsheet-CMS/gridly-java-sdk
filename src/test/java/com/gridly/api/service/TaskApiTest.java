/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.27.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.service;

import com.gridly.api.client.ApiException;
import com.gridly.api.model.Task;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskApi
 */
@Ignore
public class TaskApiTest {

    private final TaskApi api = new TaskApi();

    
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
        String taskId = null;
                Task response = api.get(taskId);
        // TODO: test validations
    }
    
}
