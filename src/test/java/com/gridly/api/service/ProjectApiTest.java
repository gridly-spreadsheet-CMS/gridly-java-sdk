/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.21.5
 * Contact: support@gridly.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.service;

import com.gridly.api.client.ApiException;
import com.gridly.api.model.CreateProject;
import com.gridly.api.model.Project;
import com.gridly.api.model.ProjectDetail;
import com.gridly.api.model.UpdateProject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Disabled
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    /**
     * list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callListTest() throws ApiException {
        List<Project> response = api.callList();
        // TODO: test validations
    }

    /**
     * create
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        CreateProject createProject = null;
        Project response = api.create(createProject);
        // TODO: test validations
    }

    /**
     * delete
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long projectId = null;
        api.delete(projectId);
        // TODO: test validations
    }

    /**
     * findOne
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findOneTest() throws ApiException {
        Long projectId = null;
        ProjectDetail response = api.findOne(projectId);
        // TODO: test validations
    }

    /**
     * update
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long projectId = null;
        UpdateProject updateProject = null;
        Project response = api.update(projectId, updateProject);
        // TODO: test validations
    }

}
