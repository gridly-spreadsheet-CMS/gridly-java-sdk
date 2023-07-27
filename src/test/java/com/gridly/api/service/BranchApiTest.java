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

import com.gridly.api.client.ApiException;
import com.gridly.api.model.Branch;
import com.gridly.api.model.CreateBranch;
import com.gridly.api.model.Task;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BranchApi
 */
@Disabled
public class BranchApiTest {

    private final BranchApi api = new BranchApi();

    /**
     * list
     *
     * list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callListTest() throws ApiException {
        String gridId = null;
        List<Branch> response = api.callList(gridId);
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
        CreateBranch createBranch = null;
        String gridId = null;
        String branchId = null;
        Branch response = api.create(createBranch, gridId, branchId);
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
        String branchId = null;
        api.delete(branchId);
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
        String branchId = null;
        Branch response = api.get(branchId);
        // TODO: test validations
    }

    /**
     * merge
     *
     * merge
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mergeTest() throws ApiException {
        String branchId = null;
        String destinationBranchId = null;
        List<String> mergeRecordOptions = null;
        Task response = api.merge(branchId, destinationBranchId, mergeRecordOptions);
        // TODO: test validations
    }

}
