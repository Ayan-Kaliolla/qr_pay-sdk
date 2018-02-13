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

    /** payment operation*/
    private Operation operation;

    /** frame url*/
    @SerializedName("iframe")
    private String url;

    /** url for invoke, if payment is success*/
    @SerializedName("success_url")
    private String successUrl;

    /** getter for frame url*/
    public String getUrl() {
        return url;
    }

    /** setter for frame url*/
    public void setUrl(String url) {
        this.url = url;
    }

    /** getter for operation*/
    public Operation getOperation() {
        return operation;
    }

    /** setter for operation*/
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /** getter for successUrl*/
    public String getSuccessUrl() {
        return successUrl;
    }

    /** setter for successUrl*/
    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }
}
