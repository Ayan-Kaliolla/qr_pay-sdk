package kz.wooppay.qr_pay_sdk.models.error;


public class Error {
    /** Error field*/
    private String field;
    /** Error field*/
    private String message;

    /** getter for error field*/
    public String getField() {
        return field;
    }

    /** setter for error field*/
    public void setField(String field) {
        this.field = field;
    }

    /** getter for error message*/
    public String getMessage() {
        return message;
    }

    /** setter for error message*/
    public void setMessage(String message) {
        this.message = message;
    }
}
