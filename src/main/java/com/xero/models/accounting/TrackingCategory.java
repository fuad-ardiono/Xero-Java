/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.TrackingOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TrackingCategory
 */

public class TrackingCategory {
  StringUtil util = new StringUtil();

  @JsonProperty("TrackingCategoryID")
  private UUID trackingCategoryID;

  @JsonProperty("TrackingOptionID")
  private UUID trackingOptionID;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Option")
  private String option;
  /**
   * The status of a tracking category
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED"),
    
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("Options")
  private List<TrackingOption> options = new ArrayList<TrackingOption>();
  public TrackingCategory trackingCategoryID(UUID trackingCategoryID) {
    this.trackingCategoryID = trackingCategoryID;
    return this;
  }

   /**
   * The Xero identifier for a tracking category e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return trackingCategoryID
  **/
  @ApiModelProperty(value = "The Xero identifier for a tracking category e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getTrackingCategoryID() {
    return trackingCategoryID;
  }

  public void setTrackingCategoryID(UUID trackingCategoryID) {
    this.trackingCategoryID = trackingCategoryID;
  }

  public TrackingCategory trackingOptionID(UUID trackingOptionID) {
    this.trackingOptionID = trackingOptionID;
    return this;
  }

   /**
   * The Xero identifier for a tracking option e.g. dc54c220-0140-495a-b925-3246adc0075f
   * @return trackingOptionID
  **/
  @ApiModelProperty(value = "The Xero identifier for a tracking option e.g. dc54c220-0140-495a-b925-3246adc0075f")
  public UUID getTrackingOptionID() {
    return trackingOptionID;
  }

  public void setTrackingOptionID(UUID trackingOptionID) {
    this.trackingOptionID = trackingOptionID;
  }

  public TrackingCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tracking category e.g. Department, Region (max length &#x3D; 100)
   * @return name
  **/
  @ApiModelProperty(value = "The name of the tracking category e.g. Department, Region (max length = 100)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrackingCategory option(String option) {
    this.option = option;
    return this;
  }

   /**
   * The option name of the tracking option e.g. East, West (max length &#x3D; 100)
   * @return option
  **/
  @ApiModelProperty(value = "The option name of the tracking option e.g. East, West (max length = 100)")
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public TrackingCategory status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of a tracking category
   * @return status
  **/
  @ApiModelProperty(value = "The status of a tracking category")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TrackingCategory options(List<TrackingOption> options) {
    this.options = options;
    return this;
  }

  public TrackingCategory addOptionsItem(TrackingOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<TrackingOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * See Tracking Options
   * @return options
  **/
  @ApiModelProperty(value = "See Tracking Options")
  public List<TrackingOption> getOptions() {
    return options;
  }

  public void setOptions(List<TrackingOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingCategory trackingCategory = (TrackingCategory) o;
    return Objects.equals(this.trackingCategoryID, trackingCategory.trackingCategoryID) &&
        Objects.equals(this.trackingOptionID, trackingCategory.trackingOptionID) &&
        Objects.equals(this.name, trackingCategory.name) &&
        Objects.equals(this.option, trackingCategory.option) &&
        Objects.equals(this.status, trackingCategory.status) &&
        Objects.equals(this.options, trackingCategory.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingCategoryID, trackingOptionID, name, option, status, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingCategory {\n");
    sb.append("    trackingCategoryID: ").append(toIndentedString(trackingCategoryID)).append("\n");
    sb.append("    trackingOptionID: ").append(toIndentedString(trackingOptionID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

