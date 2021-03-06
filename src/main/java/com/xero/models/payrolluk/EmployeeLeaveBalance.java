/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** EmployeeLeaveBalance */
public class EmployeeLeaveBalance {
  StringUtil util = new StringUtil();

  @JsonProperty("name")
  private String name;

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("balance")
  private Double balance;

  @JsonProperty("typeOfUnits")
  private String typeOfUnits;

  public EmployeeLeaveBalance name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the leave type.
   *
   * @return name
   */
  @ApiModelProperty(example = "Holiday", value = "Name of the leave type.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployeeLeaveBalance leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * The Xero identifier for leave type
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(value = "The Xero identifier for leave type")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public EmployeeLeaveBalance balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The employees current balance for the corresponding leave type.
   *
   * @return balance
   */
  @ApiModelProperty(value = "The employees current balance for the corresponding leave type.")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public EmployeeLeaveBalance typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }

  /**
   * The type of the units of the leave.
   *
   * @return typeOfUnits
   */
  @ApiModelProperty(example = "hours", value = "The type of the units of the leave.")
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
    EmployeeLeaveBalance employeeLeaveBalance = (EmployeeLeaveBalance) o;
    return Objects.equals(this.name, employeeLeaveBalance.name)
        && Objects.equals(this.leaveTypeID, employeeLeaveBalance.leaveTypeID)
        && Objects.equals(this.balance, employeeLeaveBalance.balance)
        && Objects.equals(this.typeOfUnits, employeeLeaveBalance.typeOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, leaveTypeID, balance, typeOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaveBalance {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
