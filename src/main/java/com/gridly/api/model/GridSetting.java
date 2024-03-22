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
import com.gridly.api.model.FileCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * GridSetting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GridSetting implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets defaultSourceLanguageStatus
   */
  @JsonAdapter(DefaultSourceLanguageStatusEnum.Adapter.class)
  public enum DefaultSourceLanguageStatusEnum {
    UNSET("unset"),
    
    DONOTTRANSLATE("doNotTranslate"),
    
    NOTREADYFORTRANSLATION("notReadyForTranslation"),
    
    READYFORTRANSLATION("readyForTranslation"),
    
    LOCKED("locked"),
    
    LOCKALLLANGUAGES("lockAllLanguages");

    private String value;

    DefaultSourceLanguageStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultSourceLanguageStatusEnum fromValue(String value) {
      for (DefaultSourceLanguageStatusEnum b : DefaultSourceLanguageStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultSourceLanguageStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultSourceLanguageStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultSourceLanguageStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultSourceLanguageStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_SOURCE_LANGUAGE_STATUS = "defaultSourceLanguageStatus";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SOURCE_LANGUAGE_STATUS)
  private DefaultSourceLanguageStatusEnum defaultSourceLanguageStatus;

  public static final String SERIALIZED_NAME_TRANSLATOR_CAN_VIEW_AUTOMATIONS = "translatorCanViewAutomations";
  @SerializedName(SERIALIZED_NAME_TRANSLATOR_CAN_VIEW_AUTOMATIONS)
  private Boolean translatorCanViewAutomations;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<FileCategory> categories = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "lastModifiedTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private OffsetDateTime lastModifiedTime;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public GridSetting() {
  }

  public GridSetting defaultSourceLanguageStatus(DefaultSourceLanguageStatusEnum defaultSourceLanguageStatus) {
    
    this.defaultSourceLanguageStatus = defaultSourceLanguageStatus;
    return this;
  }

   /**
   * Get defaultSourceLanguageStatus
   * @return defaultSourceLanguageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DefaultSourceLanguageStatusEnum getDefaultSourceLanguageStatus() {
    return defaultSourceLanguageStatus;
  }


  public void setDefaultSourceLanguageStatus(DefaultSourceLanguageStatusEnum defaultSourceLanguageStatus) {
    this.defaultSourceLanguageStatus = defaultSourceLanguageStatus;
  }


  public GridSetting translatorCanViewAutomations(Boolean translatorCanViewAutomations) {
    
    this.translatorCanViewAutomations = translatorCanViewAutomations;
    return this;
  }

   /**
   * Get translatorCanViewAutomations
   * @return translatorCanViewAutomations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isTranslatorCanViewAutomations() {
    return translatorCanViewAutomations;
  }


  public void setTranslatorCanViewAutomations(Boolean translatorCanViewAutomations) {
    this.translatorCanViewAutomations = translatorCanViewAutomations;
  }


  public GridSetting categories(List<FileCategory> categories) {
    
    this.categories = categories;
    return this;
  }

  public GridSetting addCategoriesItem(FileCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FileCategory> getCategories() {
    return categories;
  }


  public void setCategories(List<FileCategory> categories) {
    this.categories = categories;
  }


  public GridSetting metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public GridSetting putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public GridSetting createdTime(OffsetDateTime createdTime) {
    
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }


  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public GridSetting lastModifiedTime(OffsetDateTime lastModifiedTime) {
    
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Get lastModifiedTime
   * @return lastModifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }


  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  public GridSetting createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GridSetting lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GridSetting gridSetting = (GridSetting) o;
    return Objects.equals(this.defaultSourceLanguageStatus, gridSetting.defaultSourceLanguageStatus) &&
        Objects.equals(this.translatorCanViewAutomations, gridSetting.translatorCanViewAutomations) &&
        Objects.equals(this.categories, gridSetting.categories) &&
        Objects.equals(this.metadata, gridSetting.metadata) &&
        Objects.equals(this.createdTime, gridSetting.createdTime) &&
        Objects.equals(this.lastModifiedTime, gridSetting.lastModifiedTime) &&
        Objects.equals(this.createdBy, gridSetting.createdBy) &&
        Objects.equals(this.lastModifiedBy, gridSetting.lastModifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSourceLanguageStatus, translatorCanViewAutomations, categories, metadata, createdTime, lastModifiedTime, createdBy, lastModifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GridSetting {\n");
    sb.append("    defaultSourceLanguageStatus: ").append(toIndentedString(defaultSourceLanguageStatus)).append("\n");
    sb.append("    translatorCanViewAutomations: ").append(toIndentedString(translatorCanViewAutomations)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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
    openapiFields.add("defaultSourceLanguageStatus");
    openapiFields.add("translatorCanViewAutomations");
    openapiFields.add("categories");
    openapiFields.add("metadata");
    openapiFields.add("createdTime");
    openapiFields.add("lastModifiedTime");
    openapiFields.add("createdBy");
    openapiFields.add("lastModifiedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GridSetting
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GridSetting.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GridSetting is not found in the empty JSON string", GridSetting.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GridSetting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GridSetting` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("defaultSourceLanguageStatus") != null && !jsonObj.get("defaultSourceLanguageStatus").isJsonNull()) && !jsonObj.get("defaultSourceLanguageStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultSourceLanguageStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultSourceLanguageStatus").toString()));
      }
      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
      if (jsonArraycategories != null) {
        // ensure the json data is an array
        if (!jsonObj.get("categories").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
        }

        // validate the optional field `categories` (array)
        for (int i = 0; i < jsonArraycategories.size(); i++) {
          FileCategory.validateJsonObject(jsonArraycategories.get(i).getAsJsonObject());
        };
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("lastModifiedBy") != null && !jsonObj.get("lastModifiedBy").isJsonNull()) && !jsonObj.get("lastModifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GridSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GridSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GridSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GridSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<GridSetting>() {
           @Override
           public void write(JsonWriter out, GridSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GridSetting read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GridSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GridSetting
  * @throws IOException if the JSON string is invalid with respect to GridSetting
  */
  public static GridSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GridSetting.class);
  }

 /**
  * Convert an instance of GridSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

