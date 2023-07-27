/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.15.1
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
 * CreateShareView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateShareView implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INCLUDE_GRID_HISTORY = "includeGridHistory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GRID_HISTORY)
  private Boolean includeGridHistory;

  public CreateShareView() {
  }

  public CreateShareView includeGridHistory(Boolean includeGridHistory) {
    
    this.includeGridHistory = includeGridHistory;
    return this;
  }

   /**
   * Get includeGridHistory
   * @return includeGridHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isIncludeGridHistory() {
    return includeGridHistory;
  }


  public void setIncludeGridHistory(Boolean includeGridHistory) {
    this.includeGridHistory = includeGridHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareView createShareView = (CreateShareView) o;
    return Objects.equals(this.includeGridHistory, createShareView.includeGridHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeGridHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareView {\n");
    sb.append("    includeGridHistory: ").append(toIndentedString(includeGridHistory)).append("\n");
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
    openapiFields.add("includeGridHistory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateShareView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateShareView.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShareView is not found in the empty JSON string", CreateShareView.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateShareView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShareView` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShareView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShareView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShareView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShareView.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShareView>() {
           @Override
           public void write(JsonWriter out, CreateShareView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShareView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateShareView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateShareView
  * @throws IOException if the JSON string is invalid with respect to CreateShareView
  */
  public static CreateShareView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShareView.class);
  }

 /**
  * Convert an instance of CreateShareView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

