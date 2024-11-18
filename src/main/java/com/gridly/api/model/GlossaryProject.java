/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 5.9.0
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
import java.util.LinkedHashSet;
import java.util.Set;
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
 * GlossaryProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GlossaryProject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public static final String SERIALIZED_NAME_DATABASE_IDS = "databaseIds";
  @SerializedName(SERIALIZED_NAME_DATABASE_IDS)
  private Set<String> databaseIds = null;

  public GlossaryProject() {
  }

  public GlossaryProject projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public GlossaryProject databaseIds(Set<String> databaseIds) {
    
    this.databaseIds = databaseIds;
    return this;
  }

  public GlossaryProject addDatabaseIdsItem(String databaseIdsItem) {
    if (this.databaseIds == null) {
      this.databaseIds = new LinkedHashSet<>();
    }
    this.databaseIds.add(databaseIdsItem);
    return this;
  }

   /**
   * Get databaseIds
   * @return databaseIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getDatabaseIds() {
    return databaseIds;
  }


  public void setDatabaseIds(Set<String> databaseIds) {
    this.databaseIds = databaseIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryProject glossaryProject = (GlossaryProject) o;
    return Objects.equals(this.projectId, glossaryProject.projectId) &&
        Objects.equals(this.databaseIds, glossaryProject.databaseIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, databaseIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryProject {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    databaseIds: ").append(toIndentedString(databaseIds)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("databaseIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GlossaryProject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GlossaryProject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlossaryProject is not found in the empty JSON string", GlossaryProject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GlossaryProject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlossaryProject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("databaseIds") != null && !jsonObj.get("databaseIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `databaseIds` to be an array in the JSON string but got `%s`", jsonObj.get("databaseIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlossaryProject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlossaryProject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlossaryProject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlossaryProject.class));

       return (TypeAdapter<T>) new TypeAdapter<GlossaryProject>() {
           @Override
           public void write(JsonWriter out, GlossaryProject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlossaryProject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GlossaryProject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GlossaryProject
  * @throws IOException if the JSON string is invalid with respect to GlossaryProject
  */
  public static GlossaryProject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlossaryProject.class);
  }

 /**
  * Convert an instance of GlossaryProject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

