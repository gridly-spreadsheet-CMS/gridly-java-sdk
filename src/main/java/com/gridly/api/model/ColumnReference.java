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
import com.gridly.api.model.ReferencedColumn;
import com.gridly.api.model.ReferencedGrid;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * ColumnReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ColumnReference implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLUMN = "column";
  @SerializedName(SERIALIZED_NAME_COLUMN)
  private ReferencedColumn column;

  public static final String SERIALIZED_NAME_GRID = "grid";
  @SerializedName(SERIALIZED_NAME_GRID)
  private ReferencedGrid grid;

  /**
   * Gets or Sets selectionType
   */
  @JsonAdapter(SelectionTypeEnum.Adapter.class)
  public enum SelectionTypeEnum {
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    SelectionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectionTypeEnum fromValue(String value) {
      for (SelectionTypeEnum b : SelectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SELECTION_TYPE = "selectionType";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE)
  private SelectionTypeEnum selectionType;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ROW("ROW"),
    
    CELL("CELL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public ColumnReference() { 
  }

  public ColumnReference column(ReferencedColumn column) {
    
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReferencedColumn getColumn() {
    return column;
  }


  public void setColumn(ReferencedColumn column) {
    this.column = column;
  }


  public ColumnReference grid(ReferencedGrid grid) {
    
    this.grid = grid;
    return this;
  }

   /**
   * Get grid
   * @return grid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReferencedGrid getGrid() {
    return grid;
  }


  public void setGrid(ReferencedGrid grid) {
    this.grid = grid;
  }


  public ColumnReference selectionType(SelectionTypeEnum selectionType) {
    
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Get selectionType
   * @return selectionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SelectionTypeEnum getSelectionType() {
    return selectionType;
  }


  public void setSelectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
  }


  public ColumnReference type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnReference columnReference = (ColumnReference) o;
    return Objects.equals(this.column, columnReference.column) &&
        Objects.equals(this.grid, columnReference.grid) &&
        Objects.equals(this.selectionType, columnReference.selectionType) &&
        Objects.equals(this.type, columnReference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, grid, selectionType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnReference {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

