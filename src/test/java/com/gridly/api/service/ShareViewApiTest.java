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
import com.gridly.api.model.CreateShareView;
import com.gridly.api.model.ShareView;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShareViewApi
 */
@Disabled
public class ShareViewApiTest {

    private final ShareViewApi api = new ShareViewApi();

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
        CreateShareView createShareView = null;
        ShareView response = api.create(viewId, createShareView);
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
        api.delete(viewId);
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
        String viewId = null;
        ShareView response = api.get(viewId);
        // TODO: test validations
    }

}