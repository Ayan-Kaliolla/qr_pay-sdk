package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * FieldsArray - this class contains field array
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class FieldsArray {

    /** Field array*/
    private Field[] fields;
    /** service name*/
    @SerializedName("merchant_name")
    private String serviceName;

    /** buttons*/
    @SerializedName("pay_btns")
    private List<PaymentButtons> payButtons;

    /** getter for field array*/
    public Field[] getFields() {
        return fields;
    }

    /** setter for field array*/
    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    /** getter for service name*/
    public String getServiceName() {
        return serviceName;
    }

    /** setter for service name*/
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /** getter for buttons*/
    public List<PaymentButtons> getPayButtons() {
        return payButtons;
    }

    /** setter for buttons*/
    public void setPayButtons(List<PaymentButtons> payButtons) {
        this.payButtons = payButtons;
    }

}
