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


package com.gridly.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * Grid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Grid implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRANCH_ID = "branchId";
  @SerializedName(SERIALIZED_NAME_BRANCH_ID)
  private String branchId;

  public static final String SERIALIZED_NAME_BRANCHES = "branches";
  @SerializedName(SERIALIZED_NAME_BRANCHES)
  private List<Grid> branches = null;

  public static final String SERIALIZED_NAME_CUSTOM_PROPERTIES = "customProperties";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PROPERTIES)
  private Map<String, Object> customProperties = null;

  public static final String SERIALIZED_NAME_DEFAULT_ACCESS_VIEW_ID = "defaultAccessViewId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACCESS_VIEW_ID)
  private String defaultAccessViewId;

  public static final String SERIALIZED_NAME_GROUP_TAG_DEFINITION = "groupTagDefinition";
  @SerializedName(SERIALIZED_NAME_GROUP_TAG_DEFINITION)
  private List<String> groupTagDefinition = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_GRID_ID = "parentGridId";
  @SerializedName(SERIALIZED_NAME_PARENT_GRID_ID)
  private String parentGridId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public Grid() { 
  }

  public Grid branchId(String branchId) {
    
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBranchId() {
    return branchId;
  }


  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }


  public Grid branches(List<Grid> branches) {
    
    this.branches = branches;
    return this;
  }

  public Grid addBranchesItem(Grid branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Grid> getBranches() {
    return branches;
  }


  public void setBranches(List<Grid> branches) {
    this.branches = branches;
  }


  public Grid customProperties(Map<String, Object> customProperties) {
    
    this.customProperties = customProperties;
    return this;
  }

  public Grid putCustomPropertiesItem(String key, Object customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Get customProperties
   * @return customProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCustomProperties() {
    return customProperties;
  }


  public void setCustomProperties(Map<String, Object> customProperties) {
    this.customProperties = customProperties;
  }


  public Grid defaultAccessViewId(String defaultAccessViewId) {
    
    this.defaultAccessViewId = defaultAccessViewId;
    return this;
  }

   /**
   * Get defaultAccessViewId
   * @return defaultAccessViewId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultAccessViewId() {
    return defaultAccessViewId;
  }


  public void setDefaultAccessViewId(String defaultAccessViewId) {
    this.defaultAccessViewId = defaultAccessViewId;
  }


  public Grid groupTagDefinition(List<String> groupTagDefinition) {
    
    this.groupTagDefinition = groupTagDefinition;
    return this;
  }

  public Grid addGroupTagDefinitionItem(String groupTagDefinitionItem) {
    if (this.groupTagDefinition == null) {
      this.groupTagDefinition = new ArrayList<>();
    }
    this.groupTagDefinition.add(groupTagDefinitionItem);
    return this;
  }

   /**
   * Get groupTagDefinition
   * @return groupTagDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGroupTagDefinition() {
    return groupTagDefinition;
  }


  public void setGroupTagDefinition(List<String> groupTagDefinition) {
    this.groupTagDefinition = groupTagDefinition;
  }


  public Grid id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Grid name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Grid parentGridId(String parentGridId) {
    
    this.parentGridId = parentGridId;
    return this;
  }

   /**
   * Get parentGridId
   * @return parentGridId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentGridId() {
    return parentGridId;
  }


  public void setParentGridId(String parentGridId) {
    this.parentGridId = parentGridId;
  }


  public Grid status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grid grid = (Grid) o;
    return Objects.equals(this.branchId, grid.branchId) &&
        Objects.equals(this.branches, grid.branches) &&
        Objects.equals(this.customProperties, grid.customProperties) &&
        Objects.equals(this.defaultAccessViewId, grid.defaultAccessViewId) &&
        Objects.equals(this.groupTagDefinition, grid.groupTagDefinition) &&
        Objects.equals(this.id, grid.id) &&
        Objects.equals(this.name, grid.name) &&
        Objects.equals(this.parentGridId, grid.parentGridId) &&
        Objects.equals(this.status, grid.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, branches, customProperties, defaultAccessViewId, groupTagDefinition, id, name, parentGridId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grid {\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    defaultAccessViewId: ").append(toIndentedString(defaultAccessViewId)).append("\n");
    sb.append("    groupTagDefinition: ").append(toIndentedString(groupTagDefinition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGridId: ").append(toIndentedString(parentGridId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

