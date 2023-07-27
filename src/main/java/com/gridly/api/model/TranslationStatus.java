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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TranslationStatus
 */
@JsonAdapter(TranslationStatus.Adapter.class)
public enum TranslationStatus {
  
  UPTODATE("upToDate"),
  
  OUTOFDATE("outOfDate"),
  
  UNSET("unset");

  private String value;

  TranslationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TranslationStatus fromValue(String value) {
    for (TranslationStatus b : TranslationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TranslationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TranslationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TranslationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TranslationStatus.fromValue(value);
    }
  }
}
