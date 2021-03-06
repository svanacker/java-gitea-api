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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * CreateMilestoneOption options for creating a milestone
 */
@ApiModel(description = "CreateMilestoneOption options for creating a milestone")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T10:08:30.717+03:00")
public class CreateMilestoneOption {
  @SerializedName("description")
  private String description = null;

  @SerializedName("due_on")
  private OffsetDateTime dueOn = null;

  @SerializedName("title")
  private String title = null;

  public CreateMilestoneOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateMilestoneOption dueOn(OffsetDateTime dueOn) {
    this.dueOn = dueOn;
    return this;
  }

   /**
   * Get dueOn
   * @return dueOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueOn() {
    return dueOn;
  }

  public void setDueOn(OffsetDateTime dueOn) {
    this.dueOn = dueOn;
  }

  public CreateMilestoneOption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMilestoneOption createMilestoneOption = (CreateMilestoneOption) o;
    return Objects.equals(this.description, createMilestoneOption.description) &&
        Objects.equals(this.dueOn, createMilestoneOption.dueOn) &&
        Objects.equals(this.title, createMilestoneOption.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dueOn, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMilestoneOption {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

