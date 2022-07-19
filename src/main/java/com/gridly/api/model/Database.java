/*
 * Gridly API
 * Gridly API documentation
 *
 * The version of the OpenAPI document: 3.31.0
 * Contact: 
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
import com.gridly.api.model.Grid;
import com.gridly.api.model.Group;
import com.gridly.api.model.Project;
import com.gridly.api.model.View;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gridly.api.client.JSON;

/**
 * Database
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Database {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public static final String SERIALIZED_NAME_GRIDS = "grids";
  @SerializedName(SERIALIZED_NAME_GRIDS)
  private List<Grid> grids = null;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private List<View> views = null;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Set<Group> groups = null;

  public Database() { 
  }

  public Database id(String id) {
    
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


  public Database name(String name) {
    
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


  public Database description(String description) {
    
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


  public Database projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public Database grids(List<Grid> grids) {
    
    this.grids = grids;
    return this;
  }

  public Database addGridsItem(Grid gridsItem) {
    if (this.grids == null) {
      this.grids = new ArrayList<>();
    }
    this.grids.add(gridsItem);
    return this;
  }

   /**
   * Get grids
   * @return grids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Grid> getGrids() {
    return grids;
  }


  public void setGrids(List<Grid> grids) {
    this.grids = grids;
  }


  public Database views(List<View> views) {
    
    this.views = views;
    return this;
  }

  public Database addViewsItem(View viewsItem) {
    if (this.views == null) {
      this.views = new ArrayList<>();
    }
    this.views.add(viewsItem);
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<View> getViews() {
    return views;
  }


  public void setViews(List<View> views) {
    this.views = views;
  }


  public Database project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Project getProject() {
    return project;
  }


  public void setProject(Project project) {
    this.project = project;
  }


  public Database groups(Set<Group> groups) {
    
    this.groups = groups;
    return this;
  }

  public Database addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Group> getGroups() {
    return groups;
  }


  public void setGroups(Set<Group> groups) {
    this.groups = groups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Database database = (Database) o;
    return Objects.equals(this.id, database.id) &&
        Objects.equals(this.name, database.name) &&
        Objects.equals(this.description, database.description) &&
        Objects.equals(this.projectId, database.projectId) &&
        Objects.equals(this.grids, database.grids) &&
        Objects.equals(this.views, database.views) &&
        Objects.equals(this.project, database.project) &&
        Objects.equals(this.groups, database.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, projectId, grids, views, project, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Database {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    grids: ").append(toIndentedString(grids)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("projectId");
    openapiFields.add("grids");
    openapiFields.add("views");
    openapiFields.add("project");
    openapiFields.add("groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Database
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Database.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Database is not found in the empty JSON string", Database.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Database.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Database` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      JsonArray jsonArraygrids = jsonObj.getAsJsonArray("grids");
      if (jsonArraygrids != null) {
        // ensure the json data is an array
        if (!jsonObj.get("grids").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `grids` to be an array in the JSON string but got `%s`", jsonObj.get("grids").toString()));
        }

        // validate the optional field `grids` (array)
        for (int i = 0; i < jsonArraygrids.size(); i++) {
          Grid.validateJsonObject(jsonArraygrids.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayviews = jsonObj.getAsJsonArray("views");
      if (jsonArrayviews != null) {
        // ensure the json data is an array
        if (!jsonObj.get("views").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `views` to be an array in the JSON string but got `%s`", jsonObj.get("views").toString()));
        }

        // validate the optional field `views` (array)
        for (int i = 0; i < jsonArrayviews.size(); i++) {
          View.validateJsonObject(jsonArrayviews.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `project`
      if (jsonObj.getAsJsonObject("project") != null) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
      if (jsonArraygroups != null) {
        // ensure the json data is an array
        if (!jsonObj.get("groups").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
        }

        // validate the optional field `groups` (array)
        for (int i = 0; i < jsonArraygroups.size(); i++) {
          Group.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Database.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Database' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Database> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Database.class));

       return (TypeAdapter<T>) new TypeAdapter<Database>() {
           @Override
           public void write(JsonWriter out, Database value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Database read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Database given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Database
  * @throws IOException if the JSON string is invalid with respect to Database
  */
  public static Database fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Database.class);
  }

 /**
  * Convert an instance of Database to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

