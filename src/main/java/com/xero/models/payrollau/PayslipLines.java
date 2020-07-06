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
import com.xero.models.payrollau.DeductionLine;
import com.xero.models.payrollau.EarningsLine;
import com.xero.models.payrollau.LeaveAccrualLine;
import com.xero.models.payrollau.LeaveEarningsLine;
import com.xero.models.payrollau.ReimbursementLine;
import com.xero.models.payrollau.SuperannuationLine;
import com.xero.models.payrollau.TaxLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PayslipLines
 */

public class PayslipLines {
  StringUtil util = new StringUtil();

  @JsonProperty("EarningsLines")
  private List<EarningsLine> earningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("LeaveEarningsLines")
  private List<LeaveEarningsLine> leaveEarningsLines = new ArrayList<LeaveEarningsLine>();

  @JsonProperty("TimesheetEarningsLines")
  private List<EarningsLine> timesheetEarningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("DeductionLines")
  private List<DeductionLine> deductionLines = new ArrayList<DeductionLine>();

  @JsonProperty("LeaveAccrualLines")
  private List<LeaveAccrualLine> leaveAccrualLines = new ArrayList<LeaveAccrualLine>();

  @JsonProperty("ReimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  @JsonProperty("SuperannuationLines")
  private List<SuperannuationLine> superannuationLines = new ArrayList<SuperannuationLine>();

  @JsonProperty("TaxLines")
  private List<TaxLine> taxLines = new ArrayList<TaxLine>();
  public PayslipLines earningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
    return this;
  }

  public PayslipLines addEarningsLinesItem(EarningsLine earningsLinesItem) {
    if (this.earningsLines == null) {
      this.earningsLines = new ArrayList<EarningsLine>();
    }
    this.earningsLines.add(earningsLinesItem);
    return this;
  }

   /**
   * Get earningsLines
   * @return earningsLines
  **/
  @ApiModelProperty(value = "")
  public List<EarningsLine> getEarningsLines() {
    return earningsLines;
  }

  public void setEarningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
  }

  public PayslipLines leaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
    return this;
  }

  public PayslipLines addLeaveEarningsLinesItem(LeaveEarningsLine leaveEarningsLinesItem) {
    if (this.leaveEarningsLines == null) {
      this.leaveEarningsLines = new ArrayList<LeaveEarningsLine>();
    }
    this.leaveEarningsLines.add(leaveEarningsLinesItem);
    return this;
  }

   /**
   * Get leaveEarningsLines
   * @return leaveEarningsLines
  **/
  @ApiModelProperty(value = "")
  public List<LeaveEarningsLine> getLeaveEarningsLines() {
    return leaveEarningsLines;
  }

  public void setLeaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
  }

  public PayslipLines timesheetEarningsLines(List<EarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
    return this;
  }

  public PayslipLines addTimesheetEarningsLinesItem(EarningsLine timesheetEarningsLinesItem) {
    if (this.timesheetEarningsLines == null) {
      this.timesheetEarningsLines = new ArrayList<EarningsLine>();
    }
    this.timesheetEarningsLines.add(timesheetEarningsLinesItem);
    return this;
  }

   /**
   * Get timesheetEarningsLines
   * @return timesheetEarningsLines
  **/
  @ApiModelProperty(value = "")
  public List<EarningsLine> getTimesheetEarningsLines() {
    return timesheetEarningsLines;
  }

  public void setTimesheetEarningsLines(List<EarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
  }

  public PayslipLines deductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
    return this;
  }

  public PayslipLines addDeductionLinesItem(DeductionLine deductionLinesItem) {
    if (this.deductionLines == null) {
      this.deductionLines = new ArrayList<DeductionLine>();
    }
    this.deductionLines.add(deductionLinesItem);
    return this;
  }

   /**
   * Get deductionLines
   * @return deductionLines
  **/
  @ApiModelProperty(value = "")
  public List<DeductionLine> getDeductionLines() {
    return deductionLines;
  }

  public void setDeductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
  }

  public PayslipLines leaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
    return this;
  }

  public PayslipLines addLeaveAccrualLinesItem(LeaveAccrualLine leaveAccrualLinesItem) {
    if (this.leaveAccrualLines == null) {
      this.leaveAccrualLines = new ArrayList<LeaveAccrualLine>();
    }
    this.leaveAccrualLines.add(leaveAccrualLinesItem);
    return this;
  }

   /**
   * Get leaveAccrualLines
   * @return leaveAccrualLines
  **/
  @ApiModelProperty(value = "")
  public List<LeaveAccrualLine> getLeaveAccrualLines() {
    return leaveAccrualLines;
  }

  public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
  }

  public PayslipLines reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  public PayslipLines addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
    if (this.reimbursementLines == null) {
      this.reimbursementLines = new ArrayList<ReimbursementLine>();
    }
    this.reimbursementLines.add(reimbursementLinesItem);
    return this;
  }

   /**
   * Get reimbursementLines
   * @return reimbursementLines
  **/
  @ApiModelProperty(value = "")
  public List<ReimbursementLine> getReimbursementLines() {
    return reimbursementLines;
  }

  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
  }

  public PayslipLines superannuationLines(List<SuperannuationLine> superannuationLines) {
    this.superannuationLines = superannuationLines;
    return this;
  }

  public PayslipLines addSuperannuationLinesItem(SuperannuationLine superannuationLinesItem) {
    if (this.superannuationLines == null) {
      this.superannuationLines = new ArrayList<SuperannuationLine>();
    }
    this.superannuationLines.add(superannuationLinesItem);
    return this;
  }

   /**
   * Get superannuationLines
   * @return superannuationLines
  **/
  @ApiModelProperty(value = "")
  public List<SuperannuationLine> getSuperannuationLines() {
    return superannuationLines;
  }

  public void setSuperannuationLines(List<SuperannuationLine> superannuationLines) {
    this.superannuationLines = superannuationLines;
  }

  public PayslipLines taxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
    return this;
  }

  public PayslipLines addTaxLinesItem(TaxLine taxLinesItem) {
    if (this.taxLines == null) {
      this.taxLines = new ArrayList<TaxLine>();
    }
    this.taxLines.add(taxLinesItem);
    return this;
  }

   /**
   * Get taxLines
   * @return taxLines
  **/
  @ApiModelProperty(value = "")
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayslipLines payslipLines = (PayslipLines) o;
    return Objects.equals(this.earningsLines, payslipLines.earningsLines) &&
        Objects.equals(this.leaveEarningsLines, payslipLines.leaveEarningsLines) &&
        Objects.equals(this.timesheetEarningsLines, payslipLines.timesheetEarningsLines) &&
        Objects.equals(this.deductionLines, payslipLines.deductionLines) &&
        Objects.equals(this.leaveAccrualLines, payslipLines.leaveAccrualLines) &&
        Objects.equals(this.reimbursementLines, payslipLines.reimbursementLines) &&
        Objects.equals(this.superannuationLines, payslipLines.superannuationLines) &&
        Objects.equals(this.taxLines, payslipLines.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsLines, leaveEarningsLines, timesheetEarningsLines, deductionLines, leaveAccrualLines, reimbursementLines, superannuationLines, taxLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayslipLines {\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    leaveEarningsLines: ").append(toIndentedString(leaveEarningsLines)).append("\n");
    sb.append("    timesheetEarningsLines: ").append(toIndentedString(timesheetEarningsLines)).append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    leaveAccrualLines: ").append(toIndentedString(leaveAccrualLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    superannuationLines: ").append(toIndentedString(superannuationLines)).append("\n");
    sb.append("    taxLines: ").append(toIndentedString(taxLines)).append("\n");
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

