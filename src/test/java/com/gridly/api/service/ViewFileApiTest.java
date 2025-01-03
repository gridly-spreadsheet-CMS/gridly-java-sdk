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
import com.gridly.api.model.DeleteFile;
import java.io.File;
import com.gridly.api.model.Record;
import com.gridly.api.model.UploadedFile;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ViewFileApi
 */
@Disabled
public class ViewFileApiTest {

    private final ViewFileApi api = new ViewFileApi();

    /**
     * delete
     *
     * delete
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String columnId = null;
        String recordId = null;
        String viewId = null;
        DeleteFile deleteFile = null;
        api.delete(columnId, recordId, viewId, deleteFile);
        // TODO: test validations
    }

    /**
     * download
     *
     * download
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadTest() throws ApiException {
        String fileId = null;
        String viewId = null;
        File response = api.download(fileId, viewId);
        // TODO: test validations
    }

    /**
     * upload
     *
     * upload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadTest() throws ApiException {
        String viewId = null;
        String columnId = null;
        String recordId = null;
        File _file = null;
        UploadedFile response = api.upload(viewId, columnId, recordId, _file);
        // TODO: test validations
    }

    /**
     * uploadZip
     *
     * uploadZip
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadZipTest() throws ApiException {
        String viewId = null;
        String columnId = null;
        String fileMappings = null;
        File _file = null;
        List<Record> response = api.uploadZip(viewId, columnId, fileMappings, _file);
        // TODO: test validations
    }

}
