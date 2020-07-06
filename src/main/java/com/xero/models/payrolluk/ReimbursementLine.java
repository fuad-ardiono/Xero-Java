/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * ReimbursementLine
 */

public class ReimbursementLine {
  StringUtil util = new StringUtil();

  @JsonProperty("reimbursementTypeID")
  private UUID reimbursementTypeID;

  @JsonProperty("description")
  private String description;

  @JsonProperty("amount")
  private Double amount;
  public ReimbursementLine reimbursementTypeID(UUID reimbursementTypeID) {
    this.reimbursementTypeID = reimbursementTypeID;
    return this;
  }

   /**
   * Xero identifier for payroll reimbursement
   * @return reimbursementTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll reimbursement")
  public UUID getReimbursementTypeID() {
    return reimbursementTypeID;
  }

  public void setReimbursementTypeID(UUID reimbursementTypeID) {
    this.reimbursementTypeID = reimbursementTypeID;
  }

  public ReimbursementLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Reimbursement line description
   * @return description
  **/
  @ApiModelProperty(value = "Reimbursement line description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReimbursementLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Reimbursement amount
   * @return amount
  **/
  @ApiModelProperty(value = "Reimbursement amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReimbursementLine reimbursementLine = (ReimbursementLine) o;
    return Objects.equals(this.reimbursementTypeID, reimbursementLine.reimbursementTypeID) &&
        Objects.equals(this.description, reimbursementLine.description) &&
        Objects.equals(this.amount, reimbursementLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementTypeID, description, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReimbursementLine {\n");
    sb.append("    reimbursementTypeID: ").append(toIndentedString(reimbursementTypeID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

