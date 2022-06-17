/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.29.0
 * Contact: 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gridly.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ViewType
 */
@JsonAdapter(ViewType.Adapter.class)
public enum ViewType {
  
  DEFAULTVIEW("defaultView"),
  
  ACCESSVIEW("accessView"),
  
  USERVIEW("userView");

  private String value;

  ViewType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ViewType fromValue(String value) {
    for (ViewType b : ViewType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ViewType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ViewType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ViewType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ViewType.fromValue(value);
    }
  }
}
