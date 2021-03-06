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

/** EmployeeOpeningBalances */
public class EmployeeOpeningBalances {
  StringUtil util = new StringUtil();

  @JsonProperty("statutoryAdoptionPay")
  private Double statutoryAdoptionPay;

  @JsonProperty("statutoryMaternityPay")
  private Double statutoryMaternityPay;

  @JsonProperty("statutoryPaternityPay")
  private Double statutoryPaternityPay;

  @JsonProperty("statutorySharedParentalPay")
  private Double statutorySharedParentalPay;

  @JsonProperty("statutorySickPay")
  private Double statutorySickPay;

  @JsonProperty("priorEmployeeNumber")
  private Double priorEmployeeNumber;

  public EmployeeOpeningBalances statutoryAdoptionPay(Double statutoryAdoptionPay) {
    this.statutoryAdoptionPay = statutoryAdoptionPay;
    return this;
  }

  /**
   * The total accumulated statutory adoption pay amount received by the employee for current fiscal
   * year to date
   *
   * @return statutoryAdoptionPay
   */
  @ApiModelProperty(
      value =
          "The total accumulated statutory adoption pay amount received by the employee for"
              + " current fiscal year to date")
  public Double getStatutoryAdoptionPay() {
    return statutoryAdoptionPay;
  }

  public void setStatutoryAdoptionPay(Double statutoryAdoptionPay) {
    this.statutoryAdoptionPay = statutoryAdoptionPay;
  }

  public EmployeeOpeningBalances statutoryMaternityPay(Double statutoryMaternityPay) {
    this.statutoryMaternityPay = statutoryMaternityPay;
    return this;
  }

  /**
   * The total accumulated statutory maternity pay amount received by the employee for current
   * fiscal year to date
   *
   * @return statutoryMaternityPay
   */
  @ApiModelProperty(
      value =
          "The total accumulated statutory maternity pay amount received by the employee for"
              + " current fiscal year to date")
  public Double getStatutoryMaternityPay() {
    return statutoryMaternityPay;
  }

  public void setStatutoryMaternityPay(Double statutoryMaternityPay) {
    this.statutoryMaternityPay = statutoryMaternityPay;
  }

  public EmployeeOpeningBalances statutoryPaternityPay(Double statutoryPaternityPay) {
    this.statutoryPaternityPay = statutoryPaternityPay;
    return this;
  }

  /**
   * The total accumulated statutory paternity pay amount received by the employee for current
   * fiscal year to date
   *
   * @return statutoryPaternityPay
   */
  @ApiModelProperty(
      value =
          "The total accumulated statutory paternity pay amount received by the employee for"
              + " current fiscal year to date")
  public Double getStatutoryPaternityPay() {
    return statutoryPaternityPay;
  }

  public void setStatutoryPaternityPay(Double statutoryPaternityPay) {
    this.statutoryPaternityPay = statutoryPaternityPay;
  }

  public EmployeeOpeningBalances statutorySharedParentalPay(Double statutorySharedParentalPay) {
    this.statutorySharedParentalPay = statutorySharedParentalPay;
    return this;
  }

  /**
   * The total accumulated statutory shared parental pay amount received by the employee for current
   * fiscal year to date
   *
   * @return statutorySharedParentalPay
   */
  @ApiModelProperty(
      value =
          "The total accumulated statutory shared parental pay amount received by the employee for"
              + " current fiscal year to date")
  public Double getStatutorySharedParentalPay() {
    return statutorySharedParentalPay;
  }

  public void setStatutorySharedParentalPay(Double statutorySharedParentalPay) {
    this.statutorySharedParentalPay = statutorySharedParentalPay;
  }

  public EmployeeOpeningBalances statutorySickPay(Double statutorySickPay) {
    this.statutorySickPay = statutorySickPay;
    return this;
  }

  /**
   * The total accumulated statutory sick pay amount received by the employee for current fiscal
   * year to date
   *
   * @return statutorySickPay
   */
  @ApiModelProperty(
      value =
          "The total accumulated statutory sick pay amount received by the employee for current"
              + " fiscal year to date")
  public Double getStatutorySickPay() {
    return statutorySickPay;
  }

  public void setStatutorySickPay(Double statutorySickPay) {
    this.statutorySickPay = statutorySickPay;
  }

  public EmployeeOpeningBalances priorEmployeeNumber(Double priorEmployeeNumber) {
    this.priorEmployeeNumber = priorEmployeeNumber;
    return this;
  }

  /**
   * The unique employee number issued by the employee&#39;s former employer
   *
   * @return priorEmployeeNumber
   */
  @ApiModelProperty(value = "The unique employee number issued by the employee's former employer")
  public Double getPriorEmployeeNumber() {
    return priorEmployeeNumber;
  }

  public void setPriorEmployeeNumber(Double priorEmployeeNumber) {
    this.priorEmployeeNumber = priorEmployeeNumber;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeOpeningBalances employeeOpeningBalances = (EmployeeOpeningBalances) o;
    return Objects.equals(this.statutoryAdoptionPay, employeeOpeningBalances.statutoryAdoptionPay)
        && Objects.equals(this.statutoryMaternityPay, employeeOpeningBalances.statutoryMaternityPay)
        && Objects.equals(this.statutoryPaternityPay, employeeOpeningBalances.statutoryPaternityPay)
        && Objects.equals(
            this.statutorySharedParentalPay, employeeOpeningBalances.statutorySharedParentalPay)
        && Objects.equals(this.statutorySickPay, employeeOpeningBalances.statutorySickPay)
        && Objects.equals(this.priorEmployeeNumber, employeeOpeningBalances.priorEmployeeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        statutoryAdoptionPay,
        statutoryMaternityPay,
        statutoryPaternityPay,
        statutorySharedParentalPay,
        statutorySickPay,
        priorEmployeeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeOpeningBalances {\n");
    sb.append("    statutoryAdoptionPay: ")
        .append(toIndentedString(statutoryAdoptionPay))
        .append("\n");
    sb.append("    statutoryMaternityPay: ")
        .append(toIndentedString(statutoryMaternityPay))
        .append("\n");
    sb.append("    statutoryPaternityPay: ")
        .append(toIndentedString(statutoryPaternityPay))
        .append("\n");
    sb.append("    statutorySharedParentalPay: ")
        .append(toIndentedString(statutorySharedParentalPay))
        .append("\n");
    sb.append("    statutorySickPay: ").append(toIndentedString(statutorySickPay)).append("\n");
    sb.append("    priorEmployeeNumber: ")
        .append(toIndentedString(priorEmployeeNumber))
        .append("\n");
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
