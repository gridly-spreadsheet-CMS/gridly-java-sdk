/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.29.0
 * Contact: 
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
 * SetCell
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetCell {
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

  public SetCell() { 
  }

  public SetCell columnId(String columnId) {
    
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


  public SetCell dependencyStatus(DependencyStatusEnum dependencyStatus) {
    
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


  public SetCell referencedIds(List<String> referencedIds) {
    
    this.referencedIds = referencedIds;
    return this;
  }

  public SetCell addReferencedIdsItem(String referencedIdsItem) {
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


  public SetCell value(Object value) {
    
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
    SetCell setCell = (SetCell) o;
    return Objects.equals(this.columnId, setCell.columnId) &&
        Objects.equals(this.dependencyStatus, setCell.dependencyStatus) &&
        Objects.equals(this.referencedIds, setCell.referencedIds) &&
        Objects.equals(this.value, setCell.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, dependencyStatus, referencedIds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCell {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("columnId");
    openapiFields.add("dependencyStatus");
    openapiFields.add("referencedIds");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetCell
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetCell.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetCell is not found in the empty JSON string", SetCell.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetCell.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetCell` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("columnId") != null && !jsonObj.get("columnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnId").toString()));
      }
      if (jsonObj.get("dependencyStatus") != null && !jsonObj.get("dependencyStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependencyStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dependencyStatus").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("referencedIds") != null && !jsonObj.get("referencedIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencedIds` to be an array in the JSON string but got `%s`", jsonObj.get("referencedIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetCell.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetCell' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetCell> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetCell.class));

       return (TypeAdapter<T>) new TypeAdapter<SetCell>() {
           @Override
           public void write(JsonWriter out, SetCell value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetCell read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetCell given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetCell
  * @throws IOException if the JSON string is invalid with respect to SetCell
  */
  public static SetCell fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetCell.class);
  }

 /**
  * Convert an instance of SetCell to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

