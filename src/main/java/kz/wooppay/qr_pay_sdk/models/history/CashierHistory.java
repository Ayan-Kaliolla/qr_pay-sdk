package kz.wooppay.qr_pay_sdk.models.history;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import kz.wooppay.qr_pay_sdk.models.payment.Status;

/**
 * This class is used as a model of pojo or DAO to display the history of the cashier. extended Status class that contains payment status
 * @see Status
 * */
public class CashierHistory extends Status{
    /** cashier history id*/
    private long id;
    /** id of payment system*/
    @SerializedName("payment_system_id")
    private long paymentSystemId;
    /** id cash desks*/
    @SerializedName("cash_desk_id")
    private long cashDeskId;
    /** cashier id*/
    @SerializedName("cashier_id")
    private long cashierId;
    /** operation sum*/
    private BigDecimal amount;
    /** audience dealer*/
    @SerializedName("partner_a")
    private long audienceDealer;
    /** merchant dealer*/
    @SerializedName("partner_m")
    private long merchantDealer;
    /** id of the operation in the sender's system*/
    @SerializedName("ext_id_ps")
    private String senderSystemOperationId;
    /** id of the operation in the receiver system*/
    @SerializedName("ext_id_m")
    private String recipientSystemOperationId;
    /** date of the operation creation*/
    @SerializedName("create_date")
    private String createDate;
    /** date of operation*/
    @SerializedName("done_date")
    private String doneDate;
    /** merchant's commission*/
    @SerializedName("merchant_commission")
    private String merchantCommission;
    /** merchant dealer commission*/
    @SerializedName("partner_merchant_commission")
    private String partnerMerchantCommission;
    /** commission of an audience dealer*/
    @SerializedName("partner_audience_commission")
    private String partnerAudienceCommission;
    /** commission of payment system*/
    @SerializedName("payment_system_commission")
    private String paymentSystemCommission;
    /** number of the customer who made the payment*/
    @SerializedName("subject_number")
    private String subject_number;

    /** getter for cashier history id*/
    public long getId() {
        return id;
    }

    /** setter for cashier history id*/
    public void setId(long id) {
        this.id = id;
    }

    /** getter for id of payment system*/
    public long getPaymentSystemId() {
        return paymentSystemId;
    }

    /** setter for id of payment system*/
    public void setPaymentSystemId(long paymentSystemId) {
        this.paymentSystemId = paymentSystemId;
    }

    /** getter for id cash desks*/
    public long getCashDeskId() {
        return cashDeskId;
    }

    /** setter for id cash desks*/
    public void setCashDeskId(long cashDeskId) {
        this.cashDeskId = cashDeskId;
    }

    /** getter for cashier id*/
    public long getCashierId() {
        return cashierId;
    }

    /** setter for cashier id*/
    public void setCashierId(long cashierId) {
        this.cashierId = cashierId;
    }

    /** getter for operation sum*/
    public BigDecimal getAmount() {
        return amount;
    }

    /** setter for operation sum*/
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** getter for audience dealer*/
    public long getAudienceDealer() {
        return audienceDealer;
    }

    /** setter for audience dealer*/
    public void setAudienceDealer(long audienceDealer) {
        this.audienceDealer = audienceDealer;
    }

    /** getter for merchant dealer*/
    public long getMerchantDealer() {
        return merchantDealer;
    }

    /** setter for merchant dealer*/
    public void setMerchantDealer(long merchantDealer) {
        this.merchantDealer = merchantDealer;
    }

    /** getter for id of the operation in the sender's system*/
    public String getSenderSystemOperationId() {
        return senderSystemOperationId;
    }

    /** setter for id of the operation in the sender's system*/
    public void setSenderSystemOperationId(String senderSystemOperationId) {
        this.senderSystemOperationId = senderSystemOperationId;
    }

    /** getter for id of the operation in the receiver system*/
    public String getRecipientSystemOperationId() {
        return recipientSystemOperationId;
    }

    /** setter for id of the operation in the receiver system*/
    public void setRecipientSystemOperationId(String recipientSystemOperationId) {
        this.recipientSystemOperationId = recipientSystemOperationId;
    }

    /** getter for date of the operation creation*/
    public String getCreateDate() {
        return createDate;
    }

    /** setter for date of the operation creation*/
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /** getter for date of operation*/
    public String getDoneDate() {
        return doneDate;
    }

    /** setter for date of operation*/
    public void setDoneDate(String doneDate) {
        this.doneDate = doneDate;
    }

    /** getter for merchant's commission*/
    public String getMerchantCommission() {
        return merchantCommission;
    }

    /** setter for merchant's commission*/
    public void setMerchantCommission(String merchantCommission) {
        this.merchantCommission = merchantCommission;
    }

    /** getter for commission of an audience dealer*/
    public String getPartnerAudienceCommission() {
        return partnerAudienceCommission;
    }

    /** setter for commission of an audience dealer*/
    public void setPartnerAudienceCommission(String partnerAudienceCommission) {
        this.partnerAudienceCommission = partnerAudienceCommission;
    }

    /** getter for merchant dealer commission*/
    public String getPartnerMerchantCommission() {
        return partnerMerchantCommission;
    }

    /** setter for merchant dealer commission*/
    public void setPartnerMerchantCommission(String partnerMerchantCommission) {
        this.partnerMerchantCommission = partnerMerchantCommission;
    }

    /** getter for commission of payment system*/
    public String getPaymentSystemCommission() {
        return paymentSystemCommission;
    }

    /** setter for commission of payment system*/
    public void setPaymentSystemCommission(String paymentSystemCommission) {
        this.paymentSystemCommission = paymentSystemCommission;
    }

    /** getter for number of the customer who made the payment*/
    public String getSubject_number() {
        return subject_number;
    }

    /** setter for number of the customer who made the payment*/
    public void setSubject_number(String subject_number) {
        this.subject_number = subject_number;
    }

    /** String value of CashierHistory object*/
    @Override
    public String toString() {
        return "CashierHistory{" +
                "id=" + id +
                ", paymentSystemId=" + paymentSystemId +
                ", cashDeskId=" + cashDeskId +
                ", cashierId=" + cashierId +
                ", amount=" + amount +
                ", audienceDealer=" + audienceDealer +
                ", merchantDealer=" + merchantDealer +
                ", senderSystemOperationId=" + senderSystemOperationId +
                ", recipientSystemOperationId=" + recipientSystemOperationId +
                ", createDate='" + createDate + '\'' +
                ", doneDate='" + doneDate + '\'' +
                ", merchantCommission=" + merchantCommission +
                ", partnerAudienceCommission=" + partnerAudienceCommission +
                ", partnerMerchantCommission=" + partnerMerchantCommission +
                ", paymentSystemCommission=" + paymentSystemCommission +
                ", subject_number='" + subject_number + '\'' +
                ", statusId='" + getStatusId() + '\'' +
                '}';
    }
}
