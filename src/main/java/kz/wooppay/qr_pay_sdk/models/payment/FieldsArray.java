package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

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

    /** getter for field array*/
    public Field[] getFields() {
        return fields;
    }

    /** setter for field array*/
    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
