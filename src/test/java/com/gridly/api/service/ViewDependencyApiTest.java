/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 5.9.0
 * Contact: support@gridly.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.service;

import com.gridly.api.client.ApiException;
import com.gridly.api.model.CreateDependency;
import com.gridly.api.model.DeleteDependency;
import com.gridly.api.model.Dependency;
import com.gridly.api.model.UpdateDependency;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ViewDependencyApi
 */
@Disabled
public class ViewDependencyApiTest {

    private final ViewDependencyApi api = new ViewDependencyApi();

    /**
     * list
     *
     * list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callListTest() throws ApiException {
        String viewId = null;
        List<Dependency> response = api.callList(viewId);
        // TODO: test validations
    }

    /**
     * create
     *
     * create
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String viewId = null;
        CreateDependency createDependency = null;
        Dependency response = api.create(viewId, createDependency);
        // TODO: test validations
    }

    /**
     * delete
     *
     * delete
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String viewId = null;
        DeleteDependency deleteDependency = null;
        api.delete(viewId, deleteDependency);
        // TODO: test validations
    }

    /**
     * deleteById
     *
     * deleteById
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        String viewId = null;
        String dependencyId = null;
        api.deleteById(viewId, dependencyId);
        // TODO: test validations
    }

    /**
     * get
     *
     * get
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String dependencyId = null;
        String viewId = null;
        Dependency response = api.get(dependencyId, viewId);
        // TODO: test validations
    }

    /**
     * update
     *
     * update
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String dependencyId = null;
        String viewId = null;
        UpdateDependency updateDependency = null;
        Dependency response = api.update(dependencyId, viewId, updateDependency);
        // TODO: test validations
    }

}
