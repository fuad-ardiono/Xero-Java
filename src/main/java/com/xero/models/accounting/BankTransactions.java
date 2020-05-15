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
import com.xero.models.accounting.BankTransaction;
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
 * BankTransactions
 */

public class BankTransactions {
  StringUtil util = new StringUtil();

  @JsonProperty("BankTransactions")
  private List<BankTransaction> bankTransactions = new ArrayList<BankTransaction>();
  public BankTransactions bankTransactions(List<BankTransaction> bankTransactions) {
    this.bankTransactions = bankTransactions;
    return this;
  }

  public BankTransactions addBankTransactionsItem(BankTransaction bankTransactionsItem) {
    if (this.bankTransactions == null) {
      this.bankTransactions = new ArrayList<BankTransaction>();
    }
    this.bankTransactions.add(bankTransactionsItem);
    return this;
  }

   /**
   * Get bankTransactions
   * @return bankTransactions
  **/
  @ApiModelProperty(value = "")
  public List<BankTransaction> getBankTransactions() {
    return bankTransactions;
  }

  public void setBankTransactions(List<BankTransaction> bankTransactions) {
    this.bankTransactions = bankTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransactions bankTransactions = (BankTransactions) o;
    return Objects.equals(this.bankTransactions, bankTransactions.bankTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransactions {\n");
    sb.append("    bankTransactions: ").append(toIndentedString(bankTransactions)).append("\n");
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

