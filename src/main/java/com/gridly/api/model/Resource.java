/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.21.0
 * 
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
import com.gridly.api.model.URL;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.io.Serializable;

/**
 * Resource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Resource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private java.io.File file;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_INPUT_STREAM = "inputStream";
  @SerializedName(SERIALIZED_NAME_INPUT_STREAM)
  private Object inputStream;

  public static final String SERIALIZED_NAME_OPEN = "open";
  @SerializedName(SERIALIZED_NAME_OPEN)
  private Boolean open;

  public static final String SERIALIZED_NAME_READABLE = "readable";
  @SerializedName(SERIALIZED_NAME_READABLE)
  private Boolean readable;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private URI uri;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URL url;

  public Resource() { 
  }

  public Resource description(String description) {
    
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


  public Resource file(java.io.File file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.io.File getFile() {
    return file;
  }


  public void setFile(java.io.File file) {
    this.file = file;
  }


  public Resource filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public Resource inputStream(Object inputStream) {
    
    this.inputStream = inputStream;
    return this;
  }

   /**
   * Get inputStream
   * @return inputStream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getInputStream() {
    return inputStream;
  }


  public void setInputStream(Object inputStream) {
    this.inputStream = inputStream;
  }


  public Resource open(Boolean open) {
    
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isOpen() {
    return open;
  }


  public void setOpen(Boolean open) {
    this.open = open;
  }


  public Resource readable(Boolean readable) {
    
    this.readable = readable;
    return this;
  }

   /**
   * Get readable
   * @return readable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isReadable() {
    return readable;
  }


  public void setReadable(Boolean readable) {
    this.readable = readable;
  }


  public Resource uri(URI uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUri() {
    return uri;
  }


  public void setUri(URI uri) {
    this.uri = uri;
  }


  public Resource url(URL url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URL getUrl() {
    return url;
  }


  public void setUrl(URL url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.description, resource.description) &&
        Objects.equals(this.file, resource.file) &&
        Objects.equals(this.filename, resource.filename) &&
        Objects.equals(this.inputStream, resource.inputStream) &&
        Objects.equals(this.open, resource.open) &&
        Objects.equals(this.readable, resource.readable) &&
        Objects.equals(this.uri, resource.uri) &&
        Objects.equals(this.url, resource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, filename, inputStream, open, readable, uri, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

}

