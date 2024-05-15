/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 4.33.0
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
 * Gets or Sets ExportFormat
 */
@JsonAdapter(ExportFormat.Adapter.class)
public enum ExportFormat {
  
  TMX("tmx"),
  
  CSV("csv"),
  
  XLSX("xlsx");

  private String value;

  ExportFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportFormat fromValue(String value) {
    for (ExportFormat b : ExportFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExportFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportFormat.fromValue(value);
    }
  }
}

