package kz.wooppay.qr_pay_sdk.models.payment;


import java.util.Map;

public class FieldsMap {
    /** map fields by key and value*/
    private Map<String, Object> fields;

    /** getter for map fields*/
    public Map<String, Object> getFields() {
        return fields;
    }

    /** setter for map fields*/
    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }
}
