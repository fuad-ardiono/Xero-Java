/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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
import com.xero.models.accounting.Contact;
import com.xero.models.accounting.CurrencyCode;
import com.xero.models.accounting.LineAmountTypes;
import com.xero.models.accounting.LineItem;
import com.xero.models.accounting.Schedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * RepeatingInvoice
 */

public class RepeatingInvoice {
  /**
   * See Invoice Types
   */
  public enum TypeEnum {
    ACCPAY("ACCPAY"),
    
    ACCREC("ACCREC");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Type")
  private TypeEnum type = null;

  
  @JsonProperty("Contact")
  private Contact contact = null;

  
  @JsonProperty("Schedule")
  private Schedule schedule = null;

  
  @JsonProperty("LineItems")
  private List<LineItem> lineItems = null;

  
  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes = null;

  
  @JsonProperty("Reference")
  private String reference = null;

  
  @JsonProperty("BrandingThemeID")
  private UUID brandingThemeID = null;

  
  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode = null;

  /**
   * One of the following - DRAFT or AUTHORISED – See Invoice Status Codes
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    AUTHORISED("AUTHORISED");

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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Status")
  private StatusEnum status = null;

  
  @JsonProperty("SubTotal")
  private Float subTotal = null;

  
  @JsonProperty("TotalTax")
  private Float totalTax = null;

  
  @JsonProperty("Total")
  private Float total = null;

  
  @JsonProperty("RepeatingInvoiceID")
  private UUID repeatingInvoiceID = null;

  
  @JsonProperty("ID")
  private UUID ID = null;

  
  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = null;

  public RepeatingInvoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * See Invoice Types
   * @return type
  **/
  @ApiModelProperty(value = "See Invoice Types")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RepeatingInvoice contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public RepeatingInvoice schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public RepeatingInvoice lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public RepeatingInvoice addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * See LineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "See LineItems")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public RepeatingInvoice lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

   /**
   * Get lineAmountTypes
   * @return lineAmountTypes
  **/
  @ApiModelProperty(value = "")
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public RepeatingInvoice reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * ACCREC only – additional reference number
   * @return reference
  **/
  @ApiModelProperty(value = "ACCREC only – additional reference number")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public RepeatingInvoice brandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
    return this;
  }

   /**
   * See BrandingThemes
   * @return brandingThemeID
  **/
  @ApiModelProperty(value = "See BrandingThemes")
  public UUID getBrandingThemeID() {
    return brandingThemeID;
  }

  public void setBrandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
  }

  public RepeatingInvoice currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RepeatingInvoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * One of the following - DRAFT or AUTHORISED – See Invoice Status Codes
   * @return status
  **/
  @ApiModelProperty(value = "One of the following - DRAFT or AUTHORISED – See Invoice Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RepeatingInvoice subTotal(Float subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Total of invoice excluding taxes
   * @return subTotal
  **/
  @ApiModelProperty(value = "Total of invoice excluding taxes")
  public Float getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Float subTotal) {
    this.subTotal = subTotal;
  }

  public RepeatingInvoice totalTax(Float totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Total tax on invoice
   * @return totalTax
  **/
  @ApiModelProperty(value = "Total tax on invoice")
  public Float getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Float totalTax) {
    this.totalTax = totalTax;
  }

  public RepeatingInvoice total(Float total) {
    this.total = total;
    return this;
  }

   /**
   * Total of Invoice tax inclusive (i.e. SubTotal + TotalTax)
   * @return total
  **/
  @ApiModelProperty(value = "Total of Invoice tax inclusive (i.e. SubTotal + TotalTax)")
  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  public RepeatingInvoice repeatingInvoiceID(UUID repeatingInvoiceID) {
    this.repeatingInvoiceID = repeatingInvoiceID;
    return this;
  }

   /**
   * Xero generated unique identifier for repeating invoice template
   * @return repeatingInvoiceID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for repeating invoice template")
  public UUID getRepeatingInvoiceID() {
    return repeatingInvoiceID;
  }

  public void setRepeatingInvoiceID(UUID repeatingInvoiceID) {
    this.repeatingInvoiceID = repeatingInvoiceID;
  }

  public RepeatingInvoice ID(UUID ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Xero generated unique identifier for repeating invoice template
   * @return ID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for repeating invoice template")
  public UUID getID() {
    return ID;
  }

  public void setID(UUID ID) {
    this.ID = ID;
  }

  public RepeatingInvoice hasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
    return this;
  }

   /**
   * boolean to indicate if an invoice has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(value = "boolean to indicate if an invoice has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  public void setHasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatingInvoice repeatingInvoice = (RepeatingInvoice) o;
    return Objects.equals(this.type, repeatingInvoice.type) &&
        Objects.equals(this.contact, repeatingInvoice.contact) &&
        Objects.equals(this.schedule, repeatingInvoice.schedule) &&
        Objects.equals(this.lineItems, repeatingInvoice.lineItems) &&
        Objects.equals(this.lineAmountTypes, repeatingInvoice.lineAmountTypes) &&
        Objects.equals(this.reference, repeatingInvoice.reference) &&
        Objects.equals(this.brandingThemeID, repeatingInvoice.brandingThemeID) &&
        Objects.equals(this.currencyCode, repeatingInvoice.currencyCode) &&
        Objects.equals(this.status, repeatingInvoice.status) &&
        Objects.equals(this.subTotal, repeatingInvoice.subTotal) &&
        Objects.equals(this.totalTax, repeatingInvoice.totalTax) &&
        Objects.equals(this.total, repeatingInvoice.total) &&
        Objects.equals(this.repeatingInvoiceID, repeatingInvoice.repeatingInvoiceID) &&
        Objects.equals(this.ID, repeatingInvoice.ID) &&
        Objects.equals(this.hasAttachments, repeatingInvoice.hasAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contact, schedule, lineItems, lineAmountTypes, reference, brandingThemeID, currencyCode, status, subTotal, totalTax, total, repeatingInvoiceID, ID, hasAttachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatingInvoice {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    brandingThemeID: ").append(toIndentedString(brandingThemeID)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    repeatingInvoiceID: ").append(toIndentedString(repeatingInvoiceID)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
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
