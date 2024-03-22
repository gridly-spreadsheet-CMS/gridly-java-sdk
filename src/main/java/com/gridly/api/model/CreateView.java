/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.29.1
 * Contact: support@gridly.com
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gridly.api.client.JSON;

/**
 * CreateView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateView implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GRID_ID = "gridId";
  @SerializedName(SERIALIZED_NAME_GRID_ID)
  private String gridId;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<AddViewColumn> columns = null;

  public CreateView() {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateView createView = (CreateView) o;
    return Objects.equals(this.name, createView.name) &&
        Objects.equals(this.gridId, createView.gridId) &&
        Objects.equals(this.columns, createView.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, gridId, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateView {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gridId: ").append(toIndentedString(gridId)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("gridId");
    openapiFields.add("columns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateView.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateView is not found in the empty JSON string", CreateView.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateView` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("gridId") != null && !jsonObj.get("gridId").isJsonNull()) && !jsonObj.get("gridId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gridId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gridId").toString()));
      }
      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      if (jsonArraycolumns != null) {
        // ensure the json data is an array
        if (!jsonObj.get("columns").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
        }

        // validate the optional field `columns` (array)
        for (int i = 0; i < jsonArraycolumns.size(); i++) {
          AddViewColumn.validateJsonObject(jsonArraycolumns.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateView.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateView>() {
           @Override
           public void write(JsonWriter out, CreateView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateView
  * @throws IOException if the JSON string is invalid with respect to CreateView
  */
  public static CreateView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateView.class);
  }

 /**
  * Convert an instance of CreateView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

