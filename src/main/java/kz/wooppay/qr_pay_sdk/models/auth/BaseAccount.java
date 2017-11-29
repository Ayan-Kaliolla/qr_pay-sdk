package kz.wooppay.qr_pay_sdk.models.auth;

import com.google.gson.annotations.SerializedName;

public abstract class BaseAccount {

    /** Partner login  */
    @SerializedName("partner_login")
    private String partner;

    /** setter for partner login  */
    public String getPartner() {
        return partner;
    }

    /** getter for partner login  */
    public void setPartner(String partner) {
        this.partner = partner;
    }

}
