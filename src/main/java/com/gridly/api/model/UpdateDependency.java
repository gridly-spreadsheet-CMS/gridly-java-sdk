/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.33.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gridly.api.client.JSON;

/**
 * UpdateDependency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDependency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NEW_ID = "newId";
  @SerializedName(SERIALIZED_NAME_NEW_ID)
  private String newId;

  public static final String SERIALIZED_NAME_TARGET_COLUMN_ID = "targetColumnId";
  @SerializedName(SERIALIZED_NAME_TARGET_COLUMN_ID)
  private String targetColumnId;

  public static final String SERIALIZED_NAME_SOURCE_COLUMN_ID = "sourceColumnId";
  @SerializedName(SERIALIZED_NAME_SOURCE_COLUMN_ID)
  private String sourceColumnId;

  public UpdateDependency() {
  }

  public UpdateDependency newId(String newId) {
    
    this.newId = newId;
    return this;
  }

   /**
   * Get newId
   * @return newId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewId() {
    return newId;
  }


  public void setNewId(String newId) {
    this.newId = newId;
  }


  public UpdateDependency targetColumnId(String targetColumnId) {
    
    this.targetColumnId = targetColumnId;
    return this;
  }

   /**
   * Get targetColumnId
   * @return targetColumnId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTargetColumnId() {
    return targetColumnId;
  }


  public void setTargetColumnId(String targetColumnId) {
    this.targetColumnId = targetColumnId;
  }


  public UpdateDependency sourceColumnId(String sourceColumnId) {
    
    this.sourceColumnId = sourceColumnId;
    return this;
  }

   /**
   * Get sourceColumnId
   * @return sourceColumnId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSourceColumnId() {
    return sourceColumnId;
  }


  public void setSourceColumnId(String sourceColumnId) {
    this.sourceColumnId = sourceColumnId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDependency updateDependency = (UpdateDependency) o;
    return Objects.equals(this.newId, updateDependency.newId) &&
        Objects.equals(this.targetColumnId, updateDependency.targetColumnId) &&
        Objects.equals(this.sourceColumnId, updateDependency.sourceColumnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newId, targetColumnId, sourceColumnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDependency {\n");
    sb.append("    newId: ").append(toIndentedString(newId)).append("\n");
    sb.append("    targetColumnId: ").append(toIndentedString(targetColumnId)).append("\n");
    sb.append("    sourceColumnId: ").append(toIndentedString(sourceColumnId)).append("\n");
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
    openapiFields.add("newId");
    openapiFields.add("targetColumnId");
    openapiFields.add("sourceColumnId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("targetColumnId");
    openapiRequiredFields.add("sourceColumnId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateDependency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateDependency.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDependency is not found in the empty JSON string", UpdateDependency.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateDependency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDependency` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateDependency.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("newId") != null && !jsonObj.get("newId").isJsonNull()) && !jsonObj.get("newId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newId").toString()));
      }
      if (!jsonObj.get("targetColumnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetColumnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetColumnId").toString()));
      }
      if (!jsonObj.get("sourceColumnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceColumnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceColumnId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDependency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDependency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDependency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDependency.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDependency>() {
           @Override
           public void write(JsonWriter out, UpdateDependency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDependency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDependency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDependency
  * @throws IOException if the JSON string is invalid with respect to UpdateDependency
  */
  public static UpdateDependency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDependency.class);
  }

 /**
  * Convert an instance of UpdateDependency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

