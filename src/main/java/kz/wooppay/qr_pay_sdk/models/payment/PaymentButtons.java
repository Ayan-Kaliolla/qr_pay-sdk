package kz.wooppay.qr_pay_sdk.models.payment;

/**
 * FrameResponse - this class contains property for describe button text with key
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/


public class PaymentButtons {

    /** button id*/
    private int key;

    /** button title*/
    private String value;

    /** getter for button id*/
    public int getKey() {
        return key;
    }

    /** setter for button id*/
    public void setKey(int key) {
        this.key = key;
    }

    /** getter for button title*/
    public String getValue() {
        return value;
    }

    /** setter for button title*/
    public void setValue(String value) {
        this.value = value;
    }
}
