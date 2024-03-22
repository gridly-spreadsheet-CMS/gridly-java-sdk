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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gridly.api.client.JSON;

/**
 * MergeCellConflict
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MergeCellConflict implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLUMN_ID = "columnId";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  private String columnId;

  /**
   * Gets or Sets option
   */
  @JsonAdapter(OptionEnum.Adapter.class)
  public enum OptionEnum {
    CHILD("child"),
    
    PARENT("parent"),
    
    OVERRIDE("override"),
    
    OVERRIDEUPTODATE("overrideUpToDate"),
    
    OVERRIDEOUTOFDATE("overrideOutOfDate"),
    
    RESERVE("reserve"),
    
    IGNORE("ignore"),
    
    SOURCE("source"),
    
    DESTINATION("destination");

    private String value;

    OptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OptionEnum fromValue(String value) {
      for (OptionEnum b : OptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPTION = "option";
  @SerializedName(SERIALIZED_NAME_OPTION)
  private OptionEnum option;

  public MergeCellConflict() {
  }

  public MergeCellConflict columnId(String columnId) {
    
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getColumnId() {
    return columnId;
  }


  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }


  public MergeCellConflict option(OptionEnum option) {
    
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OptionEnum getOption() {
    return option;
  }


  public void setOption(OptionEnum option) {
    this.option = option;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeCellConflict mergeCellConflict = (MergeCellConflict) o;
    return Objects.equals(this.columnId, mergeCellConflict.columnId) &&
        Objects.equals(this.option, mergeCellConflict.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeCellConflict {\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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
    openapiFields.add("option");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("columnId");
    openapiRequiredFields.add("option");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MergeCellConflict
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MergeCellConflict.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MergeCellConflict is not found in the empty JSON string", MergeCellConflict.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MergeCellConflict.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MergeCellConflict` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MergeCellConflict.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("columnId") != null && !jsonObj.get("columnId").isJsonNull()) && !jsonObj.get("columnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnId").toString()));
      }
      if ((jsonObj.get("option") != null && !jsonObj.get("option").isJsonNull()) && !jsonObj.get("option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MergeCellConflict.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MergeCellConflict' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MergeCellConflict> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MergeCellConflict.class));

       return (TypeAdapter<T>) new TypeAdapter<MergeCellConflict>() {
           @Override
           public void write(JsonWriter out, MergeCellConflict value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MergeCellConflict read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MergeCellConflict given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MergeCellConflict
  * @throws IOException if the JSON string is invalid with respect to MergeCellConflict
  */
  public static MergeCellConflict fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MergeCellConflict.class);
  }

 /**
  * Convert an instance of MergeCellConflict to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
