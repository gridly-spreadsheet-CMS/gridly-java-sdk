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
 * View
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class View implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CUSTOM_PROPERTIES = "customProperties";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PROPERTIES)
  private Map<String, Object> customProperties = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GRID_ID = "gridId";
  @SerializedName(SERIALIZED_NAME_GRID_ID)
  private String gridId;

  public static final String SERIALIZED_NAME_GROUP_TAG_DEFINITION = "groupTagDefinition";
  @SerializedName(SERIALIZED_NAME_GROUP_TAG_DEFINITION)
  private List<String> groupTagDefinition = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public View() { 
  }

  public View customProperties(Map<String, Object> customProperties) {
    
    this.customProperties = customProperties;
    return this;
  }

  public View putCustomPropertiesItem(String key, Object customPropertiesItem) {
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


  public View description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public View gridId(String gridId) {
    
    this.gridId = gridId;
    return this;
  }

   /**
   * Get gridId
   * @return gridId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGridId() {
    return gridId;
  }


  public void setGridId(String gridId) {
    this.gridId = gridId;
  }


  public View groupTagDefinition(List<String> groupTagDefinition) {
    
    this.groupTagDefinition = groupTagDefinition;
    return this;
  }

  public View addGroupTagDefinitionItem(String groupTagDefinitionItem) {
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


  public View id(String id) {
    
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


  public View name(String name) {
    
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


  public View status(String status) {
    
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
    View view = (View) o;
    return Objects.equals(this.customProperties, view.customProperties) &&
        Objects.equals(this.description, view.description) &&
        Objects.equals(this.gridId, view.gridId) &&
        Objects.equals(this.groupTagDefinition, view.groupTagDefinition) &&
        Objects.equals(this.id, view.id) &&
        Objects.equals(this.name, view.name) &&
        Objects.equals(this.status, view.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, description, gridId, groupTagDefinition, id, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gridId: ").append(toIndentedString(gridId)).append("\n");
    sb.append("    groupTagDefinition: ").append(toIndentedString(groupTagDefinition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
