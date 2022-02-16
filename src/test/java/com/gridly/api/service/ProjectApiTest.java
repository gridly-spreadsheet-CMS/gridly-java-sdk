/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.21.4
 * 
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    
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
        CreateProject createProject = null;
                Project response = api.create(createProject);
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
        Long projectId = null;
                api.delete(projectId);
        // TODO: test validations
    }
    
    /**
     * findOne
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOneTest() throws ApiException {
        Long projectId = null;
                ProjectDetail response = api.findOne(projectId);
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
                List<Project> response = api.list();
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
        Long projectId = null;
        UpdateProject updateProject = null;
                Project response = api.update(projectId, updateProject);
        // TODO: test validations
    }
    
}
