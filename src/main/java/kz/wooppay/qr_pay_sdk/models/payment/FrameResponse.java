package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

/**
 * FrameResponse - this class contains frame url
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class FrameResponse {

    /** frame url*/
    @SerializedName("iframe")
    private String url;

    /** getter for frame url*/
    public String getUrl() {
        return url;
    }

    /** setter for frame url*/
    public void setUrl(String url) {
        this.url = url;
    }
}
