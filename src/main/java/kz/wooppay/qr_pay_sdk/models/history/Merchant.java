package kz.wooppay.qr_pay_sdk.models.history;

import com.google.gson.annotations.SerializedName;

/**
 * Created by akaliolla on 29.11.2017.
 */

public class Merchant {

    /** payment service brand name*/
    @SerializedName("brand_name")
    private String brandName;

    /** getter for service brand name*/
    public String getBrandName() {
        return brandName;
    }
    /** setter for service brand name*/
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
