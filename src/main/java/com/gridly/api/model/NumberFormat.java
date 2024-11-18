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
 * NumberFormat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberFormat implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DECIMAL("decimal"),
    
    INTEGER("integer");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimalPlaces";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_CURRENCY_SYMBOL = "currencySymbol";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SYMBOL)
  private String currencySymbol;

  public static final String SERIALIZED_NAME_USE1000_SEPARATOR = "use1000Separator";
  @SerializedName(SERIALIZED_NAME_USE1000_SEPARATOR)
  private Boolean use1000Separator;

  public NumberFormat() {
  }

  public NumberFormat type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public NumberFormat decimalPlaces(Integer decimalPlaces) {
    
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * Get decimalPlaces
   * @return decimalPlaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }


  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }


  public NumberFormat currencySymbol(String currencySymbol) {
    
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencySymbol() {
    return currencySymbol;
  }


  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }


  public NumberFormat use1000Separator(Boolean use1000Separator) {
    
    this.use1000Separator = use1000Separator;
    return this;
  }

   /**
   * Get use1000Separator
   * @return use1000Separator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isUse1000Separator() {
    return use1000Separator;
  }


  public void setUse1000Separator(Boolean use1000Separator) {
    this.use1000Separator = use1000Separator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberFormat numberFormat = (NumberFormat) o;
    return Objects.equals(this.type, numberFormat.type) &&
        Objects.equals(this.decimalPlaces, numberFormat.decimalPlaces) &&
        Objects.equals(this.currencySymbol, numberFormat.currencySymbol) &&
        Objects.equals(this.use1000Separator, numberFormat.use1000Separator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, decimalPlaces, currencySymbol, use1000Separator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberFormat {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    use1000Separator: ").append(toIndentedString(use1000Separator)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("decimalPlaces");
    openapiFields.add("currencySymbol");
    openapiFields.add("use1000Separator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NumberFormat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NumberFormat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumberFormat is not found in the empty JSON string", NumberFormat.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NumberFormat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NumberFormat` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("currencySymbol") != null && !jsonObj.get("currencySymbol").isJsonNull()) && !jsonObj.get("currencySymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencySymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencySymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumberFormat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumberFormat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumberFormat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumberFormat.class));

       return (TypeAdapter<T>) new TypeAdapter<NumberFormat>() {
           @Override
           public void write(JsonWriter out, NumberFormat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NumberFormat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NumberFormat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NumberFormat
  * @throws IOException if the JSON string is invalid with respect to NumberFormat
  */
  public static NumberFormat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumberFormat.class);
  }

 /**
  * Convert an instance of NumberFormat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

