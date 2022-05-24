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


package com.gridly.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.gridly.api.model.AddViewColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CreateView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateView implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<AddViewColumn> columns = null;

  public static final String SERIALIZED_NAME_GRID_ID = "gridId";
  @SerializedName(SERIALIZED_NAME_GRID_ID)
  private String gridId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CreateView() { 
  }

  public CreateView columns(List<AddViewColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public CreateView addColumnsItem(AddViewColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AddViewColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<AddViewColumn> columns) {
    this.columns = columns;
  }


  public CreateView gridId(String gridId) {
    
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


  public CreateView name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateView createView = (CreateView) o;
    return Objects.equals(this.columns, createView.columns) &&
        Objects.equals(this.gridId, createView.gridId) &&
        Objects.equals(this.name, createView.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, gridId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateView {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    gridId: ").append(toIndentedString(gridId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

