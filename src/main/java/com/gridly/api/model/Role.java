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
import com.gridly.api.model.Privilege;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Role implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IS_SYSTEM_ROLE = "isSystemRole";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_ROLE)
  private Boolean isSystemRole;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIVILEGE_IDS = "privilegeIds";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE_IDS)
  private List<Long> privilegeIds = null;

  public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES)
  private List<Privilege> privileges = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

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


  public Role privilegeIds(List<Long> privilegeIds) {
    
    this.privilegeIds = privilegeIds;
    return this;
  }

  public Role addPrivilegeIdsItem(Long privilegeIdsItem) {
    if (this.privilegeIds == null) {
      this.privilegeIds = new ArrayList<>();
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

  public List<Long> getPrivilegeIds() {
    return privilegeIds;
  }


  public void setPrivilegeIds(List<Long> privilegeIds) {
    this.privilegeIds = privilegeIds;
  }


  public Role privileges(List<Privilege> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public Role addPrivilegesItem(Privilege privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
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

  public List<Privilege> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(List<Privilege> privileges) {
    this.privileges = privileges;
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
        Objects.equals(this.isSystemRole, role.isSystemRole) &&
        Objects.equals(this.level, role.level) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.privilegeIds, role.privilegeIds) &&
        Objects.equals(this.privileges, role.privileges) &&
        Objects.equals(this.title, role.title) &&
        Objects.equals(this.type, role.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isSystemRole, level, name, privilegeIds, privileges, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSystemRole: ").append(toIndentedString(isSystemRole)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privilegeIds: ").append(toIndentedString(privilegeIds)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
