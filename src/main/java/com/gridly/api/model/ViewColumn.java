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
import com.gridly.api.model.ColumnReference;
import com.gridly.api.model.NumberFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * ViewColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViewColumn implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "dependsOn";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  private String dependsOn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_SOURCE = "isSource";
  @SerializedName(SERIALIZED_NAME_IS_SOURCE)
  private Boolean isSource;

  public static final String SERIALIZED_NAME_IS_TARGET = "isTarget";
  @SerializedName(SERIALIZED_NAME_IS_TARGET)
  private Boolean isTarget;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER_FORMAT = "numberFormat";
  @SerializedName(SERIALIZED_NAME_NUMBER_FORMAT)
  private NumberFormat numberFormat;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private ColumnReference reference;

  public static final String SERIALIZED_NAME_SELECTION_OPTIONS = "selectionOptions";
  @SerializedName(SERIALIZED_NAME_SELECTION_OPTIONS)
  private List<String> selectionOptions = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SINGLELINE("singleLine"),
    
    MULTIPLELINES("multipleLines"),
    
    RICHTEXT("richText"),
    
    MARKDOWN("markdown"),
    
    SINGLESELECTION("singleSelection"),
    
    MULTIPLESELECTIONS("multipleSelections"),
    
    BOOLEAN("boolean"),
    
    NUMBER("number"),
    
    DATETIME("datetime"),
    
    FILES("files"),
    
    REFERENCE("reference"),
    
    LOOKUP("lookup"),
    
    LANGUAGE("language"),
    
    JSON("json"),
    
    YAML("yaml"),
    
    HTML("html"),
    
    FORMULA("formula");

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

  public ViewColumn() { 
  }

  public ViewColumn dependsOn(String dependsOn) {
    
    this.dependsOn = dependsOn;
    return this;
  }

   /**
   * Get dependsOn
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDependsOn() {
    return dependsOn;
  }


  public void setDependsOn(String dependsOn) {
    this.dependsOn = dependsOn;
  }


  public ViewColumn description(String description) {
    
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


  public ViewColumn id(String id) {
    
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


  public ViewColumn isSource(Boolean isSource) {
    
    this.isSource = isSource;
    return this;
  }

   /**
   * Get isSource
   * @return isSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isIsSource() {
    return isSource;
  }


  public void setIsSource(Boolean isSource) {
    this.isSource = isSource;
  }


  public ViewColumn isTarget(Boolean isTarget) {
    
    this.isTarget = isTarget;
    return this;
  }

   /**
   * Get isTarget
   * @return isTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isIsTarget() {
    return isTarget;
  }


  public void setIsTarget(Boolean isTarget) {
    this.isTarget = isTarget;
  }


  public ViewColumn languageCode(String languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public ViewColumn name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ViewColumn numberFormat(NumberFormat numberFormat) {
    
    this.numberFormat = numberFormat;
    return this;
  }

   /**
   * Get numberFormat
   * @return numberFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumberFormat getNumberFormat() {
    return numberFormat;
  }


  public void setNumberFormat(NumberFormat numberFormat) {
    this.numberFormat = numberFormat;
  }


  public ViewColumn reference(ColumnReference reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ColumnReference getReference() {
    return reference;
  }


  public void setReference(ColumnReference reference) {
    this.reference = reference;
  }


  public ViewColumn selectionOptions(List<String> selectionOptions) {
    
    this.selectionOptions = selectionOptions;
    return this;
  }

  public ViewColumn addSelectionOptionsItem(String selectionOptionsItem) {
    if (this.selectionOptions == null) {
      this.selectionOptions = new ArrayList<>();
    }
    this.selectionOptions.add(selectionOptionsItem);
    return this;
  }

   /**
   * Get selectionOptions
   * @return selectionOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSelectionOptions() {
    return selectionOptions;
  }


  public void setSelectionOptions(List<String> selectionOptions) {
    this.selectionOptions = selectionOptions;
  }


  public ViewColumn type(TypeEnum type) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewColumn viewColumn = (ViewColumn) o;
    return Objects.equals(this.dependsOn, viewColumn.dependsOn) &&
        Objects.equals(this.description, viewColumn.description) &&
        Objects.equals(this.id, viewColumn.id) &&
        Objects.equals(this.isSource, viewColumn.isSource) &&
        Objects.equals(this.isTarget, viewColumn.isTarget) &&
        Objects.equals(this.languageCode, viewColumn.languageCode) &&
        Objects.equals(this.name, viewColumn.name) &&
        Objects.equals(this.numberFormat, viewColumn.numberFormat) &&
        Objects.equals(this.reference, viewColumn.reference) &&
        Objects.equals(this.selectionOptions, viewColumn.selectionOptions) &&
        Objects.equals(this.type, viewColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependsOn, description, id, isSource, isTarget, languageCode, name, numberFormat, reference, selectionOptions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewColumn {\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSource: ").append(toIndentedString(isSource)).append("\n");
    sb.append("    isTarget: ").append(toIndentedString(isTarget)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectionOptions: ").append(toIndentedString(selectionOptions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
