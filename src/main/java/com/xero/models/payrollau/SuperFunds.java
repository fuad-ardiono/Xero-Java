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
import com.xero.models.payrollau.SuperFund;
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
 * SuperFunds
 */

public class SuperFunds {
  StringUtil util = new StringUtil();

  @JsonProperty("SuperFunds")
  private List<SuperFund> superFunds = new ArrayList<SuperFund>();
  public SuperFunds superFunds(List<SuperFund> superFunds) {
    this.superFunds = superFunds;
    return this;
  }

  public SuperFunds addSuperFundsItem(SuperFund superFundsItem) {
    if (this.superFunds == null) {
      this.superFunds = new ArrayList<SuperFund>();
    }
    this.superFunds.add(superFundsItem);
    return this;
  }

   /**
   * Get superFunds
   * @return superFunds
  **/
  @ApiModelProperty(value = "")
  public List<SuperFund> getSuperFunds() {
    return superFunds;
  }

  public void setSuperFunds(List<SuperFund> superFunds) {
    this.superFunds = superFunds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperFunds superFunds = (SuperFunds) o;
    return Objects.equals(this.superFunds, superFunds.superFunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superFunds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperFunds {\n");
    sb.append("    superFunds: ").append(toIndentedString(superFunds)).append("\n");
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

