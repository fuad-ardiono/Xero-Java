/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.xero.api.StringUtil;

/** The leave type lines */
@ApiModel(description = "The leave type lines")
public class LeaveLines {
  StringUtil util = new StringUtil();

  @JsonProperty("Employee")
  private List<LeaveLine> employee = new ArrayList<LeaveLine>();

  public LeaveLines employee(List<LeaveLine> employee) {
    this.employee = employee;
    return this;
  }

  public LeaveLines addEmployeeItem(LeaveLine employeeItem) {
    if (this.employee == null) {
      this.employee = new ArrayList<LeaveLine>();
    }
    this.employee.add(employeeItem);
    return this;
  }

  /**
   * Get employee
   *
   * @return employee
   */
  @ApiModelProperty(value = "")
  public List<LeaveLine> getEmployee() {
    return employee;
  }

  public void setEmployee(List<LeaveLine> employee) {
    this.employee = employee;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveLines leaveLines = (LeaveLines) o;
    return Objects.equals(this.employee, leaveLines.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveLines {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
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
