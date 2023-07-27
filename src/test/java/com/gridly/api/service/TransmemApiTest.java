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
import com.gridly.api.model.CreateTransMem;
import com.gridly.api.model.ExportFormat;
import java.io.File;
import com.gridly.api.model.TransMem;
import com.gridly.api.model.UpdateTransMem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransmemApi
 */
@Disabled
public class TransmemApiTest {

    private final TransmemApi api = new TransmemApi();

    /**
     * Erases all the translation data of the provided tmId
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cleanupTest() throws ApiException {
        String tmId = null;
        api.cleanup(tmId);
        // TODO: test validations
    }

    /**
     * Create a new translation memory
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        CreateTransMem createTransMem = null;
        TransMem response = api.create(createTransMem);
        // TODO: test validations
    }

    /**
     * Create a new translation memory by uploading tmx file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWithFileTest() throws ApiException {
        File _file = null;
        TransMem response = api.createWithFile(_file);
        // TODO: test validations
    }

    /**
     * Delete a translation memory by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String tmId = null;
        TransMem response = api.delete(tmId);
        // TODO: test validations
    }

    /**
     * Export translation memory tmx file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportTest() throws ApiException {
        String tmId = null;
        ExportFormat format = null;
        String sourceLang = null;
        List<String> targetLangs = null;
        File response = api.export(tmId, format, sourceLang, targetLangs);
        // TODO: test validations
    }

    /**
     * Get translation memory info by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String tmId = null;
        TransMem response = api.get(tmId);
        // TODO: test validations
    }

    /**
     * Import a translation memory from tmx file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importTmxTest() throws ApiException {
        String tmId = null;
        File _file = null;
        api.importTmx(tmId, _file);
        // TODO: test validations
    }

    /**
     * List all available translation memories or create default one if there is no translation memory
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTMTest() throws ApiException {
        Long projectId = null;
        List<TransMem> response = api.listTM(projectId);
        // TODO: test validations
    }

    /**
     * Update a translation memory
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String tmId = null;
        UpdateTransMem updateTransMem = null;
        TransMem response = api.update(tmId, updateTransMem);
        // TODO: test validations
    }

}