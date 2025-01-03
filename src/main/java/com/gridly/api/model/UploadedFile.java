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
 * UploadedFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadedFile implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "originalName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_THUMBNAIL_ID = "thumbnailId";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_ID)
  private String thumbnailId;

  public UploadedFile() {
  }

  public UploadedFile id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UploadedFile originalName(String originalName) {
    
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalName() {
    return originalName;
  }


  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public UploadedFile contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public UploadedFile size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public UploadedFile thumbnailId(String thumbnailId) {
    
    this.thumbnailId = thumbnailId;
    return this;
  }

   /**
   * Get thumbnailId
   * @return thumbnailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbnailId() {
    return thumbnailId;
  }


  public void setThumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedFile uploadedFile = (UploadedFile) o;
    return Objects.equals(this.id, uploadedFile.id) &&
        Objects.equals(this.originalName, uploadedFile.originalName) &&
        Objects.equals(this.contentType, uploadedFile.contentType) &&
        Objects.equals(this.size, uploadedFile.size) &&
        Objects.equals(this.thumbnailId, uploadedFile.thumbnailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, originalName, contentType, size, thumbnailId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    thumbnailId: ").append(toIndentedString(thumbnailId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("originalName");
    openapiFields.add("contentType");
    openapiFields.add("size");
    openapiFields.add("thumbnailId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadedFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadedFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadedFile is not found in the empty JSON string", UploadedFile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UploadedFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadedFile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("originalName") != null && !jsonObj.get("originalName").isJsonNull()) && !jsonObj.get("originalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalName").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if ((jsonObj.get("thumbnailId") != null && !jsonObj.get("thumbnailId").isJsonNull()) && !jsonObj.get("thumbnailId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadedFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadedFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadedFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadedFile.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadedFile>() {
           @Override
           public void write(JsonWriter out, UploadedFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadedFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadedFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadedFile
  * @throws IOException if the JSON string is invalid with respect to UploadedFile
  */
  public static UploadedFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadedFile.class);
  }

 /**
  * Convert an instance of UploadedFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

