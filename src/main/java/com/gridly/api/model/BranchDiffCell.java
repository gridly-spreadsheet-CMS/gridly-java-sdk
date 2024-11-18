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
 * BranchDiffCell
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BranchDiffCell implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets sourceDependencyStatus
   */
  @JsonAdapter(SourceDependencyStatusEnum.Adapter.class)
  public enum SourceDependencyStatusEnum {
    UPTODATE("upToDate"),
    
    OUTOFDATE("outOfDate"),
    
    UNSET("unset");

    private String value;

    SourceDependencyStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceDependencyStatusEnum fromValue(String value) {
      for (SourceDependencyStatusEnum b : SourceDependencyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceDependencyStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceDependencyStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceDependencyStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceDependencyStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_DEPENDENCY_STATUS = "sourceDependencyStatus";
  @SerializedName(SERIALIZED_NAME_SOURCE_DEPENDENCY_STATUS)
  private SourceDependencyStatusEnum sourceDependencyStatus;

  /**
   * Gets or Sets destinationDependencyStatus
   */
  @JsonAdapter(DestinationDependencyStatusEnum.Adapter.class)
  public enum DestinationDependencyStatusEnum {
    UPTODATE("upToDate"),
    
    OUTOFDATE("outOfDate"),
    
    UNSET("unset");

    private String value;

    DestinationDependencyStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationDependencyStatusEnum fromValue(String value) {
      for (DestinationDependencyStatusEnum b : DestinationDependencyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationDependencyStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationDependencyStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationDependencyStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationDependencyStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_DEPENDENCY_STATUS = "destinationDependencyStatus";
  @SerializedName(SERIALIZED_NAME_DESTINATION_DEPENDENCY_STATUS)
  private DestinationDependencyStatusEnum destinationDependencyStatus;

  /**
   * Gets or Sets sourceSourceStatus
   */
  @JsonAdapter(SourceSourceStatusEnum.Adapter.class)
  public enum SourceSourceStatusEnum {
    UNSET("unset"),
    
    DONOTTRANSLATE("doNotTranslate"),
    
    NOTREADYFORTRANSLATION("notReadyForTranslation"),
    
    READYFORTRANSLATION("readyForTranslation"),
    
    LOCKED("locked"),
    
    LOCKALLLANGUAGES("lockAllLanguages");

    private String value;

    SourceSourceStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceSourceStatusEnum fromValue(String value) {
      for (SourceSourceStatusEnum b : SourceSourceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceSourceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceSourceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceSourceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceSourceStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_SOURCE_STATUS = "sourceSourceStatus";
  @SerializedName(SERIALIZED_NAME_SOURCE_SOURCE_STATUS)
  private SourceSourceStatusEnum sourceSourceStatus;

  /**
   * Gets or Sets destinationSourceStatus
   */
  @JsonAdapter(DestinationSourceStatusEnum.Adapter.class)
  public enum DestinationSourceStatusEnum {
    UNSET("unset"),
    
    DONOTTRANSLATE("doNotTranslate"),
    
    NOTREADYFORTRANSLATION("notReadyForTranslation"),
    
    READYFORTRANSLATION("readyForTranslation"),
    
    LOCKED("locked"),
    
    LOCKALLLANGUAGES("lockAllLanguages");

    private String value;

    DestinationSourceStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationSourceStatusEnum fromValue(String value) {
      for (DestinationSourceStatusEnum b : DestinationSourceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationSourceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationSourceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationSourceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationSourceStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_SOURCE_STATUS = "destinationSourceStatus";
  @SerializedName(SERIALIZED_NAME_DESTINATION_SOURCE_STATUS)
  private DestinationSourceStatusEnum destinationSourceStatus;

  public static final String SERIALIZED_NAME_SOURCE_LENGTH_SETTING = "sourceLengthSetting";
  @SerializedName(SERIALIZED_NAME_SOURCE_LENGTH_SETTING)
  private Integer sourceLengthSetting;

  public static final String SERIALIZED_NAME_DESTINATION_LENGTH_SETTING = "destinationLengthSetting";
  @SerializedName(SERIALIZED_NAME_DESTINATION_LENGTH_SETTING)
  private Integer destinationLengthSetting;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    BEHIND("behind"),
    
    AHEAD("ahead"),
    
    CONFLICTED("conflicted"),
    
    UNCHANGED("unchanged"),
    
    INVALIDDATA("invalidData"),
    
    NA("na"),
    
    EMPTY("empty"),
    
    TARGETTRANSLATIONEMPTY("targetTranslationEmpty"),
    
    TRANSLATIONNOTREADY("translationNotReady"),
    
    TRANSLATIONNOTFOUND("translationNotFound"),
    
    SOURCETARGETMISMATCHED("sourceTargetMismatched"),
    
    TARGETCHANGEDTMNOTAPPROVED("targetChangedTMNotApproved"),
    
    TARGETNOTCHANGED("targetNotChanged"),
    
    SOURCEDCHANGED("sourcedChanged"),
    
    TARGETCHANGED("targetChanged"),
    
    TEXTOVERLENGTH("textOverLength"),
    
    TRANSLATIONNOTCHANGED("translationNotChanged"),
    
    NOTCHANGED("notChanged"),
    
    WARNINGOFF("warningOff");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_COLUMN_ID = "columnId";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  private String columnId;

  public static final String SERIALIZED_NAME_SOURCE_VALUE = "sourceValue";
  @SerializedName(SERIALIZED_NAME_SOURCE_VALUE)
  private Object sourceValue;

  public static final String SERIALIZED_NAME_DESTINATION_VALUE = "destinationValue";
  @SerializedName(SERIALIZED_NAME_DESTINATION_VALUE)
  private Object destinationValue;

  public BranchDiffCell() {
  }

  public BranchDiffCell sourceDependencyStatus(SourceDependencyStatusEnum sourceDependencyStatus) {
    
    this.sourceDependencyStatus = sourceDependencyStatus;
    return this;
  }

   /**
   * Get sourceDependencyStatus
   * @return sourceDependencyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceDependencyStatusEnum getSourceDependencyStatus() {
    return sourceDependencyStatus;
  }


  public void setSourceDependencyStatus(SourceDependencyStatusEnum sourceDependencyStatus) {
    this.sourceDependencyStatus = sourceDependencyStatus;
  }


  public BranchDiffCell destinationDependencyStatus(DestinationDependencyStatusEnum destinationDependencyStatus) {
    
    this.destinationDependencyStatus = destinationDependencyStatus;
    return this;
  }

   /**
   * Get destinationDependencyStatus
   * @return destinationDependencyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DestinationDependencyStatusEnum getDestinationDependencyStatus() {
    return destinationDependencyStatus;
  }


  public void setDestinationDependencyStatus(DestinationDependencyStatusEnum destinationDependencyStatus) {
    this.destinationDependencyStatus = destinationDependencyStatus;
  }


  public BranchDiffCell sourceSourceStatus(SourceSourceStatusEnum sourceSourceStatus) {
    
    this.sourceSourceStatus = sourceSourceStatus;
    return this;
  }

   /**
   * Get sourceSourceStatus
   * @return sourceSourceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceSourceStatusEnum getSourceSourceStatus() {
    return sourceSourceStatus;
  }


  public void setSourceSourceStatus(SourceSourceStatusEnum sourceSourceStatus) {
    this.sourceSourceStatus = sourceSourceStatus;
  }


  public BranchDiffCell destinationSourceStatus(DestinationSourceStatusEnum destinationSourceStatus) {
    
    this.destinationSourceStatus = destinationSourceStatus;
    return this;
  }

   /**
   * Get destinationSourceStatus
   * @return destinationSourceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DestinationSourceStatusEnum getDestinationSourceStatus() {
    return destinationSourceStatus;
  }


  public void setDestinationSourceStatus(DestinationSourceStatusEnum destinationSourceStatus) {
    this.destinationSourceStatus = destinationSourceStatus;
  }


  public BranchDiffCell sourceLengthSetting(Integer sourceLengthSetting) {
    
    this.sourceLengthSetting = sourceLengthSetting;
    return this;
  }

   /**
   * Get sourceLengthSetting
   * @return sourceLengthSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSourceLengthSetting() {
    return sourceLengthSetting;
  }


  public void setSourceLengthSetting(Integer sourceLengthSetting) {
    this.sourceLengthSetting = sourceLengthSetting;
  }


  public BranchDiffCell destinationLengthSetting(Integer destinationLengthSetting) {
    
    this.destinationLengthSetting = destinationLengthSetting;
    return this;
  }

   /**
   * Get destinationLengthSetting
   * @return destinationLengthSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDestinationLengthSetting() {
    return destinationLengthSetting;
  }


  public void setDestinationLengthSetting(Integer destinationLengthSetting) {
    this.destinationLengthSetting = destinationLengthSetting;
  }


  public BranchDiffCell status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BranchDiffCell columnId(String columnId) {
    
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


  public BranchDiffCell sourceValue(Object sourceValue) {
    
    this.sourceValue = sourceValue;
    return this;
  }

   /**
   * Get sourceValue
   * @return sourceValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSourceValue() {
    return sourceValue;
  }


  public void setSourceValue(Object sourceValue) {
    this.sourceValue = sourceValue;
  }


  public BranchDiffCell destinationValue(Object destinationValue) {
    
    this.destinationValue = destinationValue;
    return this;
  }

   /**
   * Get destinationValue
   * @return destinationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDestinationValue() {
    return destinationValue;
  }


  public void setDestinationValue(Object destinationValue) {
    this.destinationValue = destinationValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchDiffCell branchDiffCell = (BranchDiffCell) o;
    return Objects.equals(this.sourceDependencyStatus, branchDiffCell.sourceDependencyStatus) &&
        Objects.equals(this.destinationDependencyStatus, branchDiffCell.destinationDependencyStatus) &&
        Objects.equals(this.sourceSourceStatus, branchDiffCell.sourceSourceStatus) &&
        Objects.equals(this.destinationSourceStatus, branchDiffCell.destinationSourceStatus) &&
        Objects.equals(this.sourceLengthSetting, branchDiffCell.sourceLengthSetting) &&
        Objects.equals(this.destinationLengthSetting, branchDiffCell.destinationLengthSetting) &&
        Objects.equals(this.status, branchDiffCell.status) &&
        Objects.equals(this.columnId, branchDiffCell.columnId) &&
        Objects.equals(this.sourceValue, branchDiffCell.sourceValue) &&
        Objects.equals(this.destinationValue, branchDiffCell.destinationValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDependencyStatus, destinationDependencyStatus, sourceSourceStatus, destinationSourceStatus, sourceLengthSetting, destinationLengthSetting, status, columnId, sourceValue, destinationValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchDiffCell {\n");
    sb.append("    sourceDependencyStatus: ").append(toIndentedString(sourceDependencyStatus)).append("\n");
    sb.append("    destinationDependencyStatus: ").append(toIndentedString(destinationDependencyStatus)).append("\n");
    sb.append("    sourceSourceStatus: ").append(toIndentedString(sourceSourceStatus)).append("\n");
    sb.append("    destinationSourceStatus: ").append(toIndentedString(destinationSourceStatus)).append("\n");
    sb.append("    sourceLengthSetting: ").append(toIndentedString(sourceLengthSetting)).append("\n");
    sb.append("    destinationLengthSetting: ").append(toIndentedString(destinationLengthSetting)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    sourceValue: ").append(toIndentedString(sourceValue)).append("\n");
    sb.append("    destinationValue: ").append(toIndentedString(destinationValue)).append("\n");
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
    openapiFields.add("sourceDependencyStatus");
    openapiFields.add("destinationDependencyStatus");
    openapiFields.add("sourceSourceStatus");
    openapiFields.add("destinationSourceStatus");
    openapiFields.add("sourceLengthSetting");
    openapiFields.add("destinationLengthSetting");
    openapiFields.add("status");
    openapiFields.add("columnId");
    openapiFields.add("sourceValue");
    openapiFields.add("destinationValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BranchDiffCell
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BranchDiffCell.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BranchDiffCell is not found in the empty JSON string", BranchDiffCell.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BranchDiffCell.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BranchDiffCell` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sourceDependencyStatus") != null && !jsonObj.get("sourceDependencyStatus").isJsonNull()) && !jsonObj.get("sourceDependencyStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceDependencyStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceDependencyStatus").toString()));
      }
      if ((jsonObj.get("destinationDependencyStatus") != null && !jsonObj.get("destinationDependencyStatus").isJsonNull()) && !jsonObj.get("destinationDependencyStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationDependencyStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationDependencyStatus").toString()));
      }
      if ((jsonObj.get("sourceSourceStatus") != null && !jsonObj.get("sourceSourceStatus").isJsonNull()) && !jsonObj.get("sourceSourceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceSourceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceSourceStatus").toString()));
      }
      if ((jsonObj.get("destinationSourceStatus") != null && !jsonObj.get("destinationSourceStatus").isJsonNull()) && !jsonObj.get("destinationSourceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationSourceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationSourceStatus").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("columnId") != null && !jsonObj.get("columnId").isJsonNull()) && !jsonObj.get("columnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BranchDiffCell.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BranchDiffCell' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BranchDiffCell> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BranchDiffCell.class));

       return (TypeAdapter<T>) new TypeAdapter<BranchDiffCell>() {
           @Override
           public void write(JsonWriter out, BranchDiffCell value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BranchDiffCell read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BranchDiffCell given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BranchDiffCell
  * @throws IOException if the JSON string is invalid with respect to BranchDiffCell
  */
  public static BranchDiffCell fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BranchDiffCell.class);
  }

 /**
  * Convert an instance of BranchDiffCell to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

