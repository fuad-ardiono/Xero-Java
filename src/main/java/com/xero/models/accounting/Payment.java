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
import com.xero.models.accounting.Account;
import com.xero.models.accounting.CreditNote;
import com.xero.models.accounting.Invoice;
import com.xero.models.accounting.Overpayment;
import com.xero.models.accounting.Prepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Payment
 */

public class Payment {
  
  @JsonProperty("Invoice")
  private Invoice invoice = null;

  
  @JsonProperty("CreditNote")
  private CreditNote creditNote = null;

  
  @JsonProperty("Prepayment")
  private Prepayment prepayment = null;

  
  @JsonProperty("Overpayment")
  private Overpayment overpayment = null;

  
  @JsonProperty("InvoiceNumber")
  private String invoiceNumber = null;

  
  @JsonProperty("CreditNoteNumber")
  private String creditNoteNumber = null;

  
  @JsonProperty("Account")
  private Account account = null;

  
  @JsonProperty("Code")
  private String code = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("Date")
  private LocalDate date = null;

  
  @JsonProperty("CurrencyRate")
  private Float currencyRate = null;

  
  @JsonProperty("Amount")
  private Float amount = null;

  
  @JsonProperty("Reference")
  private String reference = null;

  
  @JsonProperty("IsReconciled")
  private String isReconciled = null;

  /**
   * The status of the payment.
   */
  public enum StatusEnum {
    AUTHORISED("AUTHORISED"),
    
    DELETED("DELETED");

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

  /**
   * See Payment Types.
   */
  public enum PaymentTypeEnum {
    ACCRECPAYMENT("ACCRECPAYMENT"),
    
    ACCPAYPAYMENT("ACCPAYPAYMENT"),
    
    ARCREDITPAYMENT("ARCREDITPAYMENT"),
    
    APCREDITPAYMENT("APCREDITPAYMENT"),
    
    AROVERPAYMENTPAYMENT("AROVERPAYMENTPAYMENT"),
    
    ARPREPAYMENTPAYMENT("ARPREPAYMENTPAYMENT"),
    
    APPREPAYMENTPAYMENT("APPREPAYMENTPAYMENT"),
    
    APOVERPAYMENTPAYMENT("APOVERPAYMENTPAYMENT");

    private String value;

    PaymentTypeEnum(String value) {
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
    public static PaymentTypeEnum fromValue(String text) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("PaymentType")
  private PaymentTypeEnum paymentType = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC = null;

  
  @JsonProperty("PaymentID")
  private UUID paymentID = null;

  
  @JsonProperty("BankAccountNumber")
  private String bankAccountNumber = null;

  
  @JsonProperty("Particulars")
  private String particulars = null;

  
  @JsonProperty("Details")
  private String details = null;

  public Payment invoice(Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public Payment creditNote(CreditNote creditNote) {
    this.creditNote = creditNote;
    return this;
  }

   /**
   * Get creditNote
   * @return creditNote
  **/
  @ApiModelProperty(value = "")
  public CreditNote getCreditNote() {
    return creditNote;
  }

  public void setCreditNote(CreditNote creditNote) {
    this.creditNote = creditNote;
  }

  public Payment prepayment(Prepayment prepayment) {
    this.prepayment = prepayment;
    return this;
  }

   /**
   * Get prepayment
   * @return prepayment
  **/
  @ApiModelProperty(value = "")
  public Prepayment getPrepayment() {
    return prepayment;
  }

  public void setPrepayment(Prepayment prepayment) {
    this.prepayment = prepayment;
  }

  public Payment overpayment(Overpayment overpayment) {
    this.overpayment = overpayment;
    return this;
  }

   /**
   * Get overpayment
   * @return overpayment
  **/
  @ApiModelProperty(value = "")
  public Overpayment getOverpayment() {
    return overpayment;
  }

  public void setOverpayment(Overpayment overpayment) {
    this.overpayment = overpayment;
  }

  public Payment invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Number of invoice or credit note you are applying payment to e.g.INV-4003
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Number of invoice or credit note you are applying payment to e.g.INV-4003")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Payment creditNoteNumber(String creditNoteNumber) {
    this.creditNoteNumber = creditNoteNumber;
    return this;
  }

   /**
   * Number of invoice or credit note you are applying payment to e.g. INV-4003
   * @return creditNoteNumber
  **/
  @ApiModelProperty(value = "Number of invoice or credit note you are applying payment to e.g. INV-4003")
  public String getCreditNoteNumber() {
    return creditNoteNumber;
  }

  public void setCreditNoteNumber(String creditNoteNumber) {
    this.creditNoteNumber = creditNoteNumber;
  }

  public Payment account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Payment code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of account you are using to make the payment e.g. 001 (note- not all accounts have a code value)
   * @return code
  **/
  @ApiModelProperty(value = "Code of account you are using to make the payment e.g. 001 (note- not all accounts have a code value)")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Payment date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   * @return date
  **/
  @ApiModelProperty(value = "Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Payment currencyRate(Float currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * Exchange rate when payment is received. Only used for non base currency invoices and credit notes e.g. 0.7500
   * @return currencyRate
  **/
  @ApiModelProperty(value = "Exchange rate when payment is received. Only used for non base currency invoices and credit notes e.g. 0.7500")
  public Float getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Float currencyRate) {
    this.currencyRate = currencyRate;
  }

  public Payment amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the payment. Must be less than or equal to the outstanding amount owing on the invoice e.g. 200.00
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the payment. Must be less than or equal to the outstanding amount owing on the invoice e.g. 200.00")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Payment reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * An optional description for the payment e.g. Direct Debit
   * @return reference
  **/
  @ApiModelProperty(value = "An optional description for the payment e.g. Direct Debit")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Payment isReconciled(String isReconciled) {
    this.isReconciled = isReconciled;
    return this;
  }

   /**
   * An optional parameter for the payment. A boolean indicating whether you would like the payment to be created as reconciled when using PUT, or whether a payment has been reconciled when using GET
   * @return isReconciled
  **/
  @ApiModelProperty(value = "An optional parameter for the payment. A boolean indicating whether you would like the payment to be created as reconciled when using PUT, or whether a payment has been reconciled when using GET")
  public String getIsReconciled() {
    return isReconciled;
  }

  public void setIsReconciled(String isReconciled) {
    this.isReconciled = isReconciled;
  }

  public Payment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the payment.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the payment.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * See Payment Types.
   * @return paymentType
  **/
  @ApiModelProperty(value = "See Payment Types.")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

   /**
   * UTC timestamp of last update to the payment
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the payment")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public Payment paymentID(UUID paymentID) {
    this.paymentID = paymentID;
    return this;
  }

   /**
   * The Xero identifier for an Payment e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return paymentID
  **/
  @ApiModelProperty(value = "The Xero identifier for an Payment e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getPaymentID() {
    return paymentID;
  }

  public void setPaymentID(UUID paymentID) {
    this.paymentID = paymentID;
  }

  public Payment bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * The suppliers bank account number the payment is being made to
   * @return bankAccountNumber
  **/
  @ApiModelProperty(value = "The suppliers bank account number the payment is being made to")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public Payment particulars(String particulars) {
    this.particulars = particulars;
    return this;
  }

   /**
   * The suppliers bank account number the payment is being made to
   * @return particulars
  **/
  @ApiModelProperty(value = "The suppliers bank account number the payment is being made to")
  public String getParticulars() {
    return particulars;
  }

  public void setParticulars(String particulars) {
    this.particulars = particulars;
  }

  public Payment details(String details) {
    this.details = details;
    return this;
  }

   /**
   * The information to appear on the supplier&#39;s bank account
   * @return details
  **/
  @ApiModelProperty(value = "The information to appear on the supplier's bank account")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.invoice, payment.invoice) &&
        Objects.equals(this.creditNote, payment.creditNote) &&
        Objects.equals(this.prepayment, payment.prepayment) &&
        Objects.equals(this.overpayment, payment.overpayment) &&
        Objects.equals(this.invoiceNumber, payment.invoiceNumber) &&
        Objects.equals(this.creditNoteNumber, payment.creditNoteNumber) &&
        Objects.equals(this.account, payment.account) &&
        Objects.equals(this.code, payment.code) &&
        Objects.equals(this.date, payment.date) &&
        Objects.equals(this.currencyRate, payment.currencyRate) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.reference, payment.reference) &&
        Objects.equals(this.isReconciled, payment.isReconciled) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.paymentType, payment.paymentType) &&
        Objects.equals(this.updatedDateUTC, payment.updatedDateUTC) &&
        Objects.equals(this.paymentID, payment.paymentID) &&
        Objects.equals(this.bankAccountNumber, payment.bankAccountNumber) &&
        Objects.equals(this.particulars, payment.particulars) &&
        Objects.equals(this.details, payment.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, creditNote, prepayment, overpayment, invoiceNumber, creditNoteNumber, account, code, date, currencyRate, amount, reference, isReconciled, status, paymentType, updatedDateUTC, paymentID, bankAccountNumber, particulars, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    creditNote: ").append(toIndentedString(creditNote)).append("\n");
    sb.append("    prepayment: ").append(toIndentedString(prepayment)).append("\n");
    sb.append("    overpayment: ").append(toIndentedString(overpayment)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    creditNoteNumber: ").append(toIndentedString(creditNoteNumber)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    paymentID: ").append(toIndentedString(paymentID)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    particulars: ").append(toIndentedString(particulars)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
