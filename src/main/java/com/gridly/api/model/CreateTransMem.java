/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.21.5
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
import com.gridly.api.model.TranslationStatus;
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
 * CreateTransMem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransMem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public static final String SERIALIZED_NAME_FUZZY_MATCH = "fuzzyMatch";
  @SerializedName(SERIALIZED_NAME_FUZZY_MATCH)
  private Boolean fuzzyMatch;

  public static final String SERIALIZED_NAME_IS_DISABLED = "isDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_IS_PAUSED_CONSUMING = "isPausedConsuming";
  @SerializedName(SERIALIZED_NAME_IS_PAUSED_CONSUMING)
  private Boolean isPausedConsuming;

  public static final String SERIALIZED_NAME_CONTEXT_LOOKUP = "contextLookup";
  @SerializedName(SERIALIZED_NAME_CONTEXT_LOOKUP)
  private Boolean contextLookup;

  public static final String SERIALIZED_NAME_POPULATE_TRANSLATION_STATUS = "populateTranslationStatus";
  @SerializedName(SERIALIZED_NAME_POPULATE_TRANSLATION_STATUS)
  private TranslationStatus populateTranslationStatus;

  public CreateTransMem() {
  }

  public CreateTransMem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateTransMem description(String description) {
    
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


  public CreateTransMem projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public CreateTransMem addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * Get projectIds
   * @return projectIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }


  public CreateTransMem fuzzyMatch(Boolean fuzzyMatch) {
    
    this.fuzzyMatch = fuzzyMatch;
    return this;
  }

   /**
   * Get fuzzyMatch
   * @return fuzzyMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isFuzzyMatch() {
    return fuzzyMatch;
  }


  public void setFuzzyMatch(Boolean fuzzyMatch) {
    this.fuzzyMatch = fuzzyMatch;
  }


  public CreateTransMem isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isIsDisabled() {
    return isDisabled;
  }


  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public CreateTransMem isPausedConsuming(Boolean isPausedConsuming) {
    
    this.isPausedConsuming = isPausedConsuming;
    return this;
  }

   /**
   * Get isPausedConsuming
   * @return isPausedConsuming
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isIsPausedConsuming() {
    return isPausedConsuming;
  }


  public void setIsPausedConsuming(Boolean isPausedConsuming) {
    this.isPausedConsuming = isPausedConsuming;
  }


  public CreateTransMem contextLookup(Boolean contextLookup) {
    
    this.contextLookup = contextLookup;
    return this;
  }

   /**
   * Get contextLookup
   * @return contextLookup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isContextLookup() {
    return contextLookup;
  }


  public void setContextLookup(Boolean contextLookup) {
    this.contextLookup = contextLookup;
  }


  public CreateTransMem populateTranslationStatus(TranslationStatus populateTranslationStatus) {
    
    this.populateTranslationStatus = populateTranslationStatus;
    return this;
  }

   /**
   * Get populateTranslationStatus
   * @return populateTranslationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TranslationStatus getPopulateTranslationStatus() {
    return populateTranslationStatus;
  }


  public void setPopulateTranslationStatus(TranslationStatus populateTranslationStatus) {
    this.populateTranslationStatus = populateTranslationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransMem createTransMem = (CreateTransMem) o;
    return Objects.equals(this.name, createTransMem.name) &&
        Objects.equals(this.description, createTransMem.description) &&
        Objects.equals(this.projectIds, createTransMem.projectIds) &&
        Objects.equals(this.fuzzyMatch, createTransMem.fuzzyMatch) &&
        Objects.equals(this.isDisabled, createTransMem.isDisabled) &&
        Objects.equals(this.isPausedConsuming, createTransMem.isPausedConsuming) &&
        Objects.equals(this.contextLookup, createTransMem.contextLookup) &&
        Objects.equals(this.populateTranslationStatus, createTransMem.populateTranslationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, projectIds, fuzzyMatch, isDisabled, isPausedConsuming, contextLookup, populateTranslationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransMem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    fuzzyMatch: ").append(toIndentedString(fuzzyMatch)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    isPausedConsuming: ").append(toIndentedString(isPausedConsuming)).append("\n");
    sb.append("    contextLookup: ").append(toIndentedString(contextLookup)).append("\n");
    sb.append("    populateTranslationStatus: ").append(toIndentedString(populateTranslationStatus)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("projectIds");
    openapiFields.add("fuzzyMatch");
    openapiFields.add("isDisabled");
    openapiFields.add("isPausedConsuming");
    openapiFields.add("contextLookup");
    openapiFields.add("populateTranslationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTransMem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateTransMem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTransMem is not found in the empty JSON string", CreateTransMem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateTransMem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTransMem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTransMem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull()) && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTransMem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransMem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransMem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransMem.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransMem>() {
           @Override
           public void write(JsonWriter out, CreateTransMem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransMem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransMem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransMem
  * @throws IOException if the JSON string is invalid with respect to CreateTransMem
  */
  public static CreateTransMem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransMem.class);
  }

 /**
  * Convert an instance of CreateTransMem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

