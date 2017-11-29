package kz.wooppay.qr_pay_sdk.models.history;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import kz.wooppay.qr_pay_sdk.models.payment.Status;

/**
 * This class is used as a model of pojo or DAO to display the history of the client . extended Status class that contains payment status
 * @see Status
 * */
public class History extends Status {
    /** client history id*/
    private long id;

    /** service merchant*/
    private Merchant merchant;

    /** date of operation*/
    @SerializedName("done_date")
    private String doneDate;

    /** date of the operation creation*/
    @SerializedName("create_date")
    private String createDate;

    /** operation sum*/
    private BigDecimal amount;

    /** getter for client history id*/
    public long getId() {
        return id;
    }

    /** setter for client history id*/
    public void setId(long id) {
        this.id = id;
    }

    /** getter for service merchant*/
    public Merchant getMerchant() {
        return merchant;
    }

    /** setter for service merchant*/
    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    /** getter for date of operation*/
    public String getDoneDate() {
        return doneDate;
    }

    /** setter for date of operation*/
    public void setDoneDate(String doneDate) {
        this.doneDate = doneDate;
    }

    /** getter for date of the operation creation*/
    public String getCreateDate() {
        return createDate;
    }

    /** setter for date of the operation creation*/
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /** getter for operation sum*/
    public BigDecimal getAmount() {
        return amount;
    }

    /** setter for operation sum*/
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** String value of History object*/
    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", Merchant='" + merchant + '\'' +
                ", doneDate='" + doneDate + '\'' +
                ", createDate='" + createDate + '\'' +
                ", amount=" + amount +
                '}';
    }

}
