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
import java.util.List;
import java.io.Serializable;

/**
 * Cell
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Cell implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLUMN_ID = "columnId";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  private String columnId;

  /**
   * Gets or Sets dependencyStatus
   */
  @JsonAdapter(DependencyStatusEnum.Adapter.class)
  public enum DependencyStatusEnum {
    UPTODATE("upToDate"),
    
    OUTOFDATE("outOfDate"),
    
    UNSET("unset");

    private String value;

    DependencyStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DependencyStatusEnum fromValue(String value) {
      for (DependencyStatusEnum b : DependencyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DependencyStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DependencyStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DependencyStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DependencyStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEPENDENCY_STATUS = "dependencyStatus";
  @SerializedName(SERIALIZED_NAME_DEPENDENCY_STATUS)
  private DependencyStatusEnum dependencyStatus;

  public static final String SERIALIZED_NAME_REFERENCED_IDS = "referencedIds";
  @SerializedName(SERIALIZED_NAME_REFERENCED_IDS)
  private List<String> referencedIds = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;


  public Cell columnId(String columnId) {
    
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnId() {
    return columnId;
  }


  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }


  public Cell dependencyStatus(DependencyStatusEnum dependencyStatus) {
    
    this.dependencyStatus = dependencyStatus;
    return this;
  }

   /**
   * Get dependencyStatus
   * @return dependencyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DependencyStatusEnum getDependencyStatus() {
    return dependencyStatus;
  }


  public void setDependencyStatus(DependencyStatusEnum dependencyStatus) {
    this.dependencyStatus = dependencyStatus;
  }


  public Cell referencedIds(List<String> referencedIds) {
    
    this.referencedIds = referencedIds;
    return this;
  }

  public Cell addReferencedIdsItem(String referencedIdsItem) {
    if (this.referencedIds == null) {
      this.referencedIds = new ArrayList<>();
    }
    this.referencedIds.add(referencedIdsItem);
    return this;
  }

   /**
   * Get referencedIds
   * @return referencedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getReferencedIds() {
    return referencedIds;
  }


  public void setReferencedIds(List<String> referencedIds) {
    this.referencedIds = referencedIds;
  }


  public Cell value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cell cell = (Cell) o;
    return Objects.equals(this.columnId, cell.columnId) &&
        Objects.equals(this.dependencyStatus, cell.dependencyStatus) &&
        Objects.equals(this.referencedIds, cell.referencedIds) &&
        Objects.equals(this.value, cell.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, dependencyStatus, referencedIds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cell {\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    dependencyStatus: ").append(toIndentedString(dependencyStatus)).append("\n");
    sb.append("    referencedIds: ").append(toIndentedString(referencedIds)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

