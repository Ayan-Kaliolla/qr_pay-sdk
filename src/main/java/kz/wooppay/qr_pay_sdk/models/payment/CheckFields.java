package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

/**
 * CheckFields- this class contains map fields and qr code. Extended FieldsMap
 *
 * @author Ayan Kaliolla
 * @version 1.0
 * @see FieldsMap
 **/

public class CheckFields extends FieldsMap {

    /** qr code*/
    @SerializedName("qr_code")
    private String qrCode;

    /** getter for qr code*/
    public String getQrCode() {
        return qrCode;
    }

    /** setter for qr code*/
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
