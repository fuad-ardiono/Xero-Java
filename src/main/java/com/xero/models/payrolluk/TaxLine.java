/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;

import java.util.Objects;
import java.util.Arrays;
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
 * TaxLine
 */

public class TaxLine {
  StringUtil util = new StringUtil();

  @JsonProperty("taxLineID")
  private UUID taxLineID;

  @JsonProperty("description")
  private String description;

  @JsonProperty("isEmployerTax")
  private Boolean isEmployerTax;

  @JsonProperty("amount")
  private Float amount;
  public TaxLine taxLineID(UUID taxLineID) {
    this.taxLineID = taxLineID;
    return this;
  }

   /**
   * Xero identifier for payroll tax line
   * @return taxLineID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll tax line")
  public UUID getTaxLineID() {
    return taxLineID;
  }

  public void setTaxLineID(UUID taxLineID) {
    this.taxLineID = taxLineID;
  }

  public TaxLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Tax line description
   * @return description
  **/
  @ApiModelProperty(value = "Tax line description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaxLine isEmployerTax(Boolean isEmployerTax) {
    this.isEmployerTax = isEmployerTax;
    return this;
  }

   /**
   * Identifies if the amount is paid for by the employee or employer. True if employer pays the tax
   * @return isEmployerTax
  **/
  @ApiModelProperty(value = "Identifies if the amount is paid for by the employee or employer. True if employer pays the tax")
  public Boolean getIsEmployerTax() {
    return isEmployerTax;
  }

  public void setIsEmployerTax(Boolean isEmployerTax) {
    this.isEmployerTax = isEmployerTax;
  }

  public TaxLine amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the tax line
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the tax line")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
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
    TaxLine taxLine = (TaxLine) o;
    return Objects.equals(this.taxLineID, taxLine.taxLineID) &&
        Objects.equals(this.description, taxLine.description) &&
        Objects.equals(this.isEmployerTax, taxLine.isEmployerTax) &&
        Objects.equals(this.amount, taxLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxLineID, description, isEmployerTax, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxLine {\n");
    sb.append("    taxLineID: ").append(toIndentedString(taxLineID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEmployerTax: ").append(toIndentedString(isEmployerTax)).append("\n");
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

