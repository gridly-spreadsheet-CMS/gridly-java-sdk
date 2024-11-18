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
 * DateTimeFormat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DateTimeFormat implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_TIME_FORMAT = "timeFormat";
  @SerializedName(SERIALIZED_NAME_TIME_FORMAT)
  private String timeFormat;

  public static final String SERIALIZED_NAME_ZONE_OFFSET = "zoneOffset";
  @SerializedName(SERIALIZED_NAME_ZONE_OFFSET)
  private String zoneOffset;

  public static final String SERIALIZED_NAME_SHOW_TIME_ZONE = "showTimeZone";
  @SerializedName(SERIALIZED_NAME_SHOW_TIME_ZONE)
  private Boolean showTimeZone;

  public DateTimeFormat() {
  }

  public DateTimeFormat dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public DateTimeFormat timeFormat(String timeFormat) {
    
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * Get timeFormat
   * @return timeFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeFormat() {
    return timeFormat;
  }


  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }


  public DateTimeFormat zoneOffset(String zoneOffset) {
    
    this.zoneOffset = zoneOffset;
    return this;
  }

   /**
   * Get zoneOffset
   * @return zoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZoneOffset() {
    return zoneOffset;
  }


  public void setZoneOffset(String zoneOffset) {
    this.zoneOffset = zoneOffset;
  }


  public DateTimeFormat showTimeZone(Boolean showTimeZone) {
    
    this.showTimeZone = showTimeZone;
    return this;
  }

   /**
   * Get showTimeZone
   * @return showTimeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isShowTimeZone() {
    return showTimeZone;
  }


  public void setShowTimeZone(Boolean showTimeZone) {
    this.showTimeZone = showTimeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeFormat dateTimeFormat = (DateTimeFormat) o;
    return Objects.equals(this.dateFormat, dateTimeFormat.dateFormat) &&
        Objects.equals(this.timeFormat, dateTimeFormat.timeFormat) &&
        Objects.equals(this.zoneOffset, dateTimeFormat.zoneOffset) &&
        Objects.equals(this.showTimeZone, dateTimeFormat.showTimeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat, timeFormat, zoneOffset, showTimeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeFormat {\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    zoneOffset: ").append(toIndentedString(zoneOffset)).append("\n");
    sb.append("    showTimeZone: ").append(toIndentedString(showTimeZone)).append("\n");
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
    openapiFields.add("dateFormat");
    openapiFields.add("timeFormat");
    openapiFields.add("zoneOffset");
    openapiFields.add("showTimeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DateTimeFormat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DateTimeFormat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DateTimeFormat is not found in the empty JSON string", DateTimeFormat.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DateTimeFormat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DateTimeFormat` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("dateFormat") != null && !jsonObj.get("dateFormat").isJsonNull()) && !jsonObj.get("dateFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateFormat").toString()));
      }
      if ((jsonObj.get("timeFormat") != null && !jsonObj.get("timeFormat").isJsonNull()) && !jsonObj.get("timeFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeFormat").toString()));
      }
      if ((jsonObj.get("zoneOffset") != null && !jsonObj.get("zoneOffset").isJsonNull()) && !jsonObj.get("zoneOffset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zoneOffset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zoneOffset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DateTimeFormat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DateTimeFormat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DateTimeFormat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DateTimeFormat.class));

       return (TypeAdapter<T>) new TypeAdapter<DateTimeFormat>() {
           @Override
           public void write(JsonWriter out, DateTimeFormat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DateTimeFormat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DateTimeFormat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DateTimeFormat
  * @throws IOException if the JSON string is invalid with respect to DateTimeFormat
  */
  public static DateTimeFormat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DateTimeFormat.class);
  }

 /**
  * Convert an instance of DateTimeFormat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

