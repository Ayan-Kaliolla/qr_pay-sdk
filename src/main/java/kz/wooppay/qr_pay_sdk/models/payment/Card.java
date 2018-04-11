package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by akaliolla on 14.03.2018.
 */

public class Card {
    /**card id**/
    private long id;
    /**card mask**/
    private String mask;

    /**name of the bank that issued the card**/
    @SerializedName("bank_name")
    private String bankName;

    /**getter for card id**/
    public long getId() {
        return id;
    }

    /**setter for card id**/
    public void setId(long id) {
        this.id = id;
    }

    /**getter for card mask**/
    public String getMask() {
        return mask;
    }

    /**setter for card mask**/
    public void setMask(String mask) {
        this.mask = mask;
    }

    /**getter for bank name**/
    public String getBankName() {
        return bankName;
    }

    /**setter for bank name**/
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
