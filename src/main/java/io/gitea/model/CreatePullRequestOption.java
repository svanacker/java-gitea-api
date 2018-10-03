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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * CreatePullRequestOption options when creating a pull request
 */
@ApiModel(description = "CreatePullRequestOption options when creating a pull request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-03T21:33:54.578+01:00")
public class CreatePullRequestOption {
  @SerializedName("assignee")
  private String assignee = null;

  @SerializedName("assignees")
  private List<String> assignees = null;

  @SerializedName("base")
  private String base = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("head")
  private String head = null;

  @SerializedName("labels")
  private List<Long> labels = null;

  @SerializedName("milestone")
  private Long milestone = null;

  @SerializedName("title")
  private String title = null;

  public CreatePullRequestOption assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public CreatePullRequestOption assignees(List<String> assignees) {
    this.assignees = assignees;
    return this;
  }

  public CreatePullRequestOption addAssigneesItem(String assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<String>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @ApiModelProperty(value = "")
  public List<String> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<String> assignees) {
    this.assignees = assignees;
  }

  public CreatePullRequestOption base(String base) {
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @ApiModelProperty(value = "")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public CreatePullRequestOption body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CreatePullRequestOption dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CreatePullRequestOption head(String head) {
    this.head = head;
    return this;
  }

   /**
   * Get head
   * @return head
  **/
  @ApiModelProperty(value = "")
  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }

  public CreatePullRequestOption labels(List<Long> labels) {
    this.labels = labels;
    return this;
  }

  public CreatePullRequestOption addLabelsItem(Long labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Long>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Long> getLabels() {
    return labels;
  }

  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }

  public CreatePullRequestOption milestone(Long milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @ApiModelProperty(value = "")
  public Long getMilestone() {
    return milestone;
  }

  public void setMilestone(Long milestone) {
    this.milestone = milestone;
  }

  public CreatePullRequestOption title(String title) {
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
    CreatePullRequestOption createPullRequestOption = (CreatePullRequestOption) o;
    return Objects.equals(this.assignee, createPullRequestOption.assignee) &&
        Objects.equals(this.assignees, createPullRequestOption.assignees) &&
        Objects.equals(this.base, createPullRequestOption.base) &&
        Objects.equals(this.body, createPullRequestOption.body) &&
        Objects.equals(this.dueDate, createPullRequestOption.dueDate) &&
        Objects.equals(this.head, createPullRequestOption.head) &&
        Objects.equals(this.labels, createPullRequestOption.labels) &&
        Objects.equals(this.milestone, createPullRequestOption.milestone) &&
        Objects.equals(this.title, createPullRequestOption.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assignees, base, body, dueDate, head, labels, milestone, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePullRequestOption {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
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

