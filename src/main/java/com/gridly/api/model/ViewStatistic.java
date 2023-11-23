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
import com.gridly.api.model.ColumnStatistic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
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
 * ViewStatistic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViewStatistic implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RECORD_COUNT = "recordCount";
  @SerializedName(SERIALIZED_NAME_RECORD_COUNT)
  private Long recordCount;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private Map<String, ColumnStatistic> translations = null;

  public ViewStatistic() {
  }

  public ViewStatistic recordCount(Long recordCount) {
    
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Get recordCount
   * @return recordCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRecordCount() {
    return recordCount;
  }


  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }


  public ViewStatistic translations(Map<String, ColumnStatistic> translations) {
    
    this.translations = translations;
    return this;
  }

  public ViewStatistic putTranslationsItem(String key, ColumnStatistic translationsItem) {
    if (this.translations == null) {
      this.translations = new HashMap<>();
    }
    this.translations.put(key, translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, ColumnStatistic> getTranslations() {
    return translations;
  }


  public void setTranslations(Map<String, ColumnStatistic> translations) {
    this.translations = translations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewStatistic viewStatistic = (ViewStatistic) o;
    return Objects.equals(this.recordCount, viewStatistic.recordCount) &&
        Objects.equals(this.translations, viewStatistic.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordCount, translations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewStatistic {\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
    openapiFields.add("recordCount");
    openapiFields.add("translations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewStatistic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewStatistic.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewStatistic is not found in the empty JSON string", ViewStatistic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewStatistic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewStatistic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewStatistic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewStatistic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewStatistic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewStatistic.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewStatistic>() {
           @Override
           public void write(JsonWriter out, ViewStatistic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewStatistic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewStatistic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewStatistic
  * @throws IOException if the JSON string is invalid with respect to ViewStatistic
  */
  public static ViewStatistic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewStatistic.class);
  }

 /**
  * Convert an instance of ViewStatistic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

