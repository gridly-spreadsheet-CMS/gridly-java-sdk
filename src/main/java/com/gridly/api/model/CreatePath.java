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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gridly.api.client.JSON;

/**
 * CreatePath
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePath implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PARENT_PATH = "parentPath";
  @SerializedName(SERIALIZED_NAME_PARENT_PATH)
  private String parentPath;

  public static final String SERIALIZED_NAME_PATHS = "paths";
  @SerializedName(SERIALIZED_NAME_PATHS)
  private List<String> paths = null;

  public CreatePath() {
  }

  public CreatePath parentPath(String parentPath) {
    
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Get parentPath
   * @return parentPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentPath() {
    return parentPath;
  }


  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }


  public CreatePath paths(List<String> paths) {
    
    this.paths = paths;
    return this;
  }

  public CreatePath addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Get paths
   * @return paths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPaths() {
    return paths;
  }


  public void setPaths(List<String> paths) {
    this.paths = paths;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePath createPath = (CreatePath) o;
    return Objects.equals(this.parentPath, createPath.parentPath) &&
        Objects.equals(this.paths, createPath.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentPath, paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePath {\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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
    openapiFields.add("parentPath");
    openapiFields.add("paths");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePath
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreatePath.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePath is not found in the empty JSON string", CreatePath.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatePath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePath` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("parentPath") != null && !jsonObj.get("parentPath").isJsonNull()) && !jsonObj.get("parentPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentPath").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("paths") != null && !jsonObj.get("paths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paths` to be an array in the JSON string but got `%s`", jsonObj.get("paths").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePath.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePath>() {
           @Override
           public void write(JsonWriter out, CreatePath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePath read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePath
  * @throws IOException if the JSON string is invalid with respect to CreatePath
  */
  public static CreatePath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePath.class);
  }

 /**
  * Convert an instance of CreatePath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

