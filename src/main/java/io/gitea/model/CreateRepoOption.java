/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateRepoOption options when creating repository
 */
@ApiModel(description = "CreateRepoOption options when creating repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-03T21:33:54.578+01:00")
public class CreateRepoOption {
  @SerializedName("auto_init")
  private Boolean autoInit = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("gitignores")
  private String gitignores = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("readme")
  private String readme = null;

  public CreateRepoOption autoInit(Boolean autoInit) {
    this.autoInit = autoInit;
    return this;
  }

   /**
   * Whether the repository should be auto-intialized?
   * @return autoInit
  **/
  @ApiModelProperty(value = "Whether the repository should be auto-intialized?")
  public Boolean isAutoInit() {
    return autoInit;
  }

  public void setAutoInit(Boolean autoInit) {
    this.autoInit = autoInit;
  }

  public CreateRepoOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the repository to create
   * @return description
  **/
  @ApiModelProperty(value = "Description of the repository to create")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateRepoOption gitignores(String gitignores) {
    this.gitignores = gitignores;
    return this;
  }

   /**
   * Gitignores to use
   * @return gitignores
  **/
  @ApiModelProperty(value = "Gitignores to use")
  public String getGitignores() {
    return gitignores;
  }

  public void setGitignores(String gitignores) {
    this.gitignores = gitignores;
  }

  public CreateRepoOption license(String license) {
    this.license = license;
    return this;
  }

   /**
   * License to use
   * @return license
  **/
  @ApiModelProperty(value = "License to use")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public CreateRepoOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the repository to create
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the repository to create")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateRepoOption _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether the repository is private
   * @return _private
  **/
  @ApiModelProperty(value = "Whether the repository is private")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public CreateRepoOption readme(String readme) {
    this.readme = readme;
    return this;
  }

   /**
   * Readme of the repository to create
   * @return readme
  **/
  @ApiModelProperty(value = "Readme of the repository to create")
  public String getReadme() {
    return readme;
  }

  public void setReadme(String readme) {
    this.readme = readme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRepoOption createRepoOption = (CreateRepoOption) o;
    return Objects.equals(this.autoInit, createRepoOption.autoInit) &&
        Objects.equals(this.description, createRepoOption.description) &&
        Objects.equals(this.gitignores, createRepoOption.gitignores) &&
        Objects.equals(this.license, createRepoOption.license) &&
        Objects.equals(this.name, createRepoOption.name) &&
        Objects.equals(this._private, createRepoOption._private) &&
        Objects.equals(this.readme, createRepoOption.readme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoInit, description, gitignores, license, name, _private, readme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRepoOption {\n");
    
    sb.append("    autoInit: ").append(toIndentedString(autoInit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gitignores: ").append(toIndentedString(gitignores)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

