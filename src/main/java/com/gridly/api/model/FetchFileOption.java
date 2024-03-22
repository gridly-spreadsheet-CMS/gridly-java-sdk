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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FetchFileOption
 */
@JsonAdapter(FetchFileOption.Adapter.class)
public enum FetchFileOption {
  
  all("all"),
  
  id("id"),
  
  name("name");

  private String value;

  FetchFileOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FetchFileOption fromValue(String value) {
    for (FetchFileOption b : FetchFileOption.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FetchFileOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final FetchFileOption enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FetchFileOption read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FetchFileOption.fromValue(value);
    }
  }
}

