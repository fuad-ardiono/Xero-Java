/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LeaveBalance
 */

public class LeaveBalance {
  StringUtil util = new StringUtil();

  @JsonProperty("LeaveName")
  private String leaveName;

  @JsonProperty("LeaveTypeID")
  private String leaveTypeID;

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("TypeOfUnits")
  private String typeOfUnits;
  public LeaveBalance leaveName(String leaveName) {
    this.leaveName = leaveName;
    return this;
  }

   /**
   * The name of the leave type
   * @return leaveName
  **/
  @ApiModelProperty(example = "Annual Leave", value = "The name of the leave type")
  public String getLeaveName() {
    return leaveName;
  }

  public void setLeaveName(String leaveName) {
    this.leaveName = leaveName;
  }

  public LeaveBalance leaveTypeID(String leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

   /**
   * Identifier of the leave type (see PayItems)
   * @return leaveTypeID
  **/
  @ApiModelProperty(example = "544d9292-4329-4512-bfff-a9f15236d776", value = "Identifier of the leave type (see PayItems)")
  public String getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(String leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveBalance numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * The balance of the leave available
   * @return numberOfUnits
  **/
  @ApiModelProperty(example = "81.2602", value = "The balance of the leave available")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public LeaveBalance typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }

   /**
   * The type of units as specified by the LeaveType (see PayItems)
   * @return typeOfUnits
  **/
  @ApiModelProperty(example = "Hours", value = "The type of units as specified by the LeaveType (see PayItems)")
  public String getTypeOfUnits() {
    return typeOfUnits;
  }

  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveBalance leaveBalance = (LeaveBalance) o;
    return Objects.equals(this.leaveName, leaveBalance.leaveName) &&
        Objects.equals(this.leaveTypeID, leaveBalance.leaveTypeID) &&
        Objects.equals(this.numberOfUnits, leaveBalance.numberOfUnits) &&
        Objects.equals(this.typeOfUnits, leaveBalance.typeOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveName, leaveTypeID, numberOfUnits, typeOfUnits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveBalance {\n");
    sb.append("    leaveName: ").append(toIndentedString(leaveName)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
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

