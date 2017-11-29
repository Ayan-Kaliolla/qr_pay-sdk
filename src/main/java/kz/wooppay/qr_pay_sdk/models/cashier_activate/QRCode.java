package kz.wooppay.qr_pay_sdk.models.cashier_activate;

import com.google.gson.annotations.SerializedName;

public class QRCode {

    /** gr cash desk code for activations */
    @SerializedName("qr_code")
    private String QRCode;

    /** getter for gr cash desk code */
    public String getQRCode() {
        return QRCode;
    }

    /** setter for gr cash desk code */
    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }
}
