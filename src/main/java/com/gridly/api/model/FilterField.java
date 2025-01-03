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
import java.util.ArrayList;
import java.util.List;
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
 * FilterField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilterField implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "caseSensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_COLUMN_ID = "columnId";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  private String columnId;

  public static final String SERIALIZED_NAME_DYNAMIC_COLUMN = "dynamicColumn";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_COLUMN)
  private String dynamicColumn;

  /**
   * Gets or Sets operator
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    ISNULL("isNull"),
    
    ISNOTNULL("isNotNull"),
    
    ISEMPTY("isEmpty"),
    
    ISNOTEMPTY("isNotEmpty"),
    
    CONTAINS("contains"),
    
    NOTCONTAINS("notContains"),
    
    STARTSWITH("startsWith"),
    
    NOTSTARTSWITH("notStartsWith"),
    
    ENDSWITH("endsWith"),
    
    NOTENDSWITH("notEndsWith"),
    
    REGEXP("regexp"),
    
    NOTREGEXP("notRegexp"),
    
    EQUAL("="),
    
    NOT_EQUAL("!="),
    
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN(">"),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    IN("in"),
    
    NOTIN("notIn"),
    
    MODIFIEDBY("modifiedBy"),
    
    NOTMODIFIEDBY("notModifiedBy"),
    
    BETWEEN("between"),
    
    NOTBETWEEN("notBetween"),
    
    HASQAERROR("hasQaError"),
    
    ISLENGTHVIOLATED("isLengthViolated"),
    
    HASTAG("hasTag"),
    
    SPELLCHECK("spellCheck"),
    
    QACHECK("qaCheck"),
    
    ISMT("isMt");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_QUERY_PATH_TAG_VIA_ID = "queryPathTagViaId";
  @SerializedName(SERIALIZED_NAME_QUERY_PATH_TAG_VIA_ID)
  private Boolean queryPathTagViaId;

  /**
   * Gets or Sets subField
   */
  @JsonAdapter(SubFieldEnum.Adapter.class)
  public enum SubFieldEnum {
    DEPENDENCYSTATUS("_dependencyStatus"),
    
    SOURCESTATUS("_sourceStatus"),
    
    TARGETSTATUS("_targetStatus"),
    
    FLOWSTATUS("_flowStatus"),
    
    TM("_tm"),
    
    MT("_mt"),
    
    TICKET("_ticket"),
    
    COLOR("_color"),
    
    METADATA("_metadata"),
    
    CELL_METADATA("_cell_metadata"),
    
    WORD_COUNT("_word_count"),
    
    PREVIEWSOURCEDATA("_previewSourceData"),
    
    PREVIEWSOURCEDEPENDENCYSTATUS("_previewSourceDependencyStatus"),
    
    PREVIEWSTATUS("_previewStatus"),
    
    PREVIEWMERGEOPTION("_previewMergeOption"),
    
    RELATIVETIME("_relativeTime"),
    
    LENGTH_VIOLATED("_length_violated"),
    
    LENGTHSETTING("_lengthSetting"),
    
    WORKFLOW("_workflow"),
    
    WORKFLOWSTEPTRANSITIONED("_workflowStepTransitioned"),
    
    REPETITION("_repetition"),
    
    QACHECKSTATUS("_qaCheckStatus"),
    
    SPELLCHECKSTATUS("_spellCheckStatus"),
    
    HASTAG("_hasTag");

    private String value;

    SubFieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubFieldEnum fromValue(String value) {
      for (SubFieldEnum b : SubFieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubFieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubFieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubFieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubFieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUB_FIELD = "subField";
  @SerializedName(SERIALIZED_NAME_SUB_FIELD)
  private SubFieldEnum subField;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Object> values = null;

  public FilterField() {
  }

  
  public FilterField(
     String dynamicColumn
  ) {
    this();
    this.dynamicColumn = dynamicColumn;
  }

  public FilterField caseSensitive(Boolean caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public FilterField columnId(String columnId) {
    
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnId() {
    return columnId;
  }


  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }


   /**
   * Get dynamicColumn
   * @return dynamicColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDynamicColumn() {
    return dynamicColumn;
  }




  public FilterField operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public FilterField queryPathTagViaId(Boolean queryPathTagViaId) {
    
    this.queryPathTagViaId = queryPathTagViaId;
    return this;
  }

   /**
   * Get queryPathTagViaId
   * @return queryPathTagViaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isQueryPathTagViaId() {
    return queryPathTagViaId;
  }


  public void setQueryPathTagViaId(Boolean queryPathTagViaId) {
    this.queryPathTagViaId = queryPathTagViaId;
  }


  public FilterField subField(SubFieldEnum subField) {
    
    this.subField = subField;
    return this;
  }

   /**
   * Get subField
   * @return subField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubFieldEnum getSubField() {
    return subField;
  }


  public void setSubField(SubFieldEnum subField) {
    this.subField = subField;
  }


  public FilterField values(List<Object> values) {
    
    this.values = values;
    return this;
  }

  public FilterField addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getValues() {
    return values;
  }


  public void setValues(List<Object> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterField filterField = (FilterField) o;
    return Objects.equals(this.caseSensitive, filterField.caseSensitive) &&
        Objects.equals(this.columnId, filterField.columnId) &&
        Objects.equals(this.dynamicColumn, filterField.dynamicColumn) &&
        Objects.equals(this.operator, filterField.operator) &&
        Objects.equals(this.queryPathTagViaId, filterField.queryPathTagViaId) &&
        Objects.equals(this.subField, filterField.subField) &&
        Objects.equals(this.values, filterField.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, columnId, dynamicColumn, operator, queryPathTagViaId, subField, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterField {\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    dynamicColumn: ").append(toIndentedString(dynamicColumn)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    queryPathTagViaId: ").append(toIndentedString(queryPathTagViaId)).append("\n");
    sb.append("    subField: ").append(toIndentedString(subField)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("caseSensitive");
    openapiFields.add("columnId");
    openapiFields.add("dynamicColumn");
    openapiFields.add("operator");
    openapiFields.add("queryPathTagViaId");
    openapiFields.add("subField");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operator");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilterField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilterField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterField is not found in the empty JSON string", FilterField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FilterField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilterField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("columnId") != null && !jsonObj.get("columnId").isJsonNull()) && !jsonObj.get("columnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnId").toString()));
      }
      if ((jsonObj.get("dynamicColumn") != null && !jsonObj.get("dynamicColumn").isJsonNull()) && !jsonObj.get("dynamicColumn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamicColumn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dynamicColumn").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if ((jsonObj.get("subField") != null && !jsonObj.get("subField").isJsonNull()) && !jsonObj.get("subField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subField").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterField.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterField>() {
           @Override
           public void write(JsonWriter out, FilterField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilterField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilterField
  * @throws IOException if the JSON string is invalid with respect to FilterField
  */
  public static FilterField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterField.class);
  }

 /**
  * Convert an instance of FilterField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

