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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.gridly.api.model.Privilege;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Role implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES)
  private Set<Privilege> privileges = null;

  public static final String SERIALIZED_NAME_PRIVILEGE_IDS = "privilegeIds";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE_IDS)
  private Set<Long> privilegeIds = null;

  public static final String SERIALIZED_NAME_IS_SYSTEM_ROLE = "isSystemRole";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_ROLE)
  private Boolean isSystemRole;

  public Role() {
  }

  public Role id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Role name(String name) {
    
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


  public Role title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Role type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Role level(String level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }


  public Role privileges(Set<Privilege> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public Role addPrivilegesItem(Privilege privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new LinkedHashSet<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Get privileges
   * @return privileges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Privilege> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(Set<Privilege> privileges) {
    this.privileges = privileges;
  }


  public Role privilegeIds(Set<Long> privilegeIds) {
    
    this.privilegeIds = privilegeIds;
    return this;
  }

  public Role addPrivilegeIdsItem(Long privilegeIdsItem) {
    if (this.privilegeIds == null) {
      this.privilegeIds = new LinkedHashSet<>();
    }
    this.privilegeIds.add(privilegeIdsItem);
    return this;
  }

   /**
   * Get privilegeIds
   * @return privilegeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Long> getPrivilegeIds() {
    return privilegeIds;
  }


  public void setPrivilegeIds(Set<Long> privilegeIds) {
    this.privilegeIds = privilegeIds;
  }


  public Role isSystemRole(Boolean isSystemRole) {
    
    this.isSystemRole = isSystemRole;
    return this;
  }

   /**
   * Get isSystemRole
   * @return isSystemRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean isIsSystemRole() {
    return isSystemRole;
  }


  public void setIsSystemRole(Boolean isSystemRole) {
    this.isSystemRole = isSystemRole;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.title, role.title) &&
        Objects.equals(this.type, role.type) &&
        Objects.equals(this.level, role.level) &&
        Objects.equals(this.privileges, role.privileges) &&
        Objects.equals(this.privilegeIds, role.privilegeIds) &&
        Objects.equals(this.isSystemRole, role.isSystemRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, type, level, privileges, privilegeIds, isSystemRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    privilegeIds: ").append(toIndentedString(privilegeIds)).append("\n");
    sb.append("    isSystemRole: ").append(toIndentedString(isSystemRole)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("level");
    openapiFields.add("privileges");
    openapiFields.add("privilegeIds");
    openapiFields.add("isSystemRole");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Role
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Role.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Role is not found in the empty JSON string", Role.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Role.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Role` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      if (jsonObj.get("privileges") != null && !jsonObj.get("privileges").isJsonNull()) {
        JsonArray jsonArrayprivileges = jsonObj.getAsJsonArray("privileges");
        if (jsonArrayprivileges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("privileges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
          }

          // validate the optional field `privileges` (array)
          for (int i = 0; i < jsonArrayprivileges.size(); i++) {
            Privilege.validateJsonObject(jsonArrayprivileges.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("privilegeIds") != null && !jsonObj.get("privilegeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privilegeIds` to be an array in the JSON string but got `%s`", jsonObj.get("privilegeIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Role.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Role' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Role> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Role.class));

       return (TypeAdapter<T>) new TypeAdapter<Role>() {
           @Override
           public void write(JsonWriter out, Role value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Role read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Role given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Role
  * @throws IOException if the JSON string is invalid with respect to Role
  */
  public static Role fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Role.class);
  }

 /**
  * Convert an instance of Role to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

