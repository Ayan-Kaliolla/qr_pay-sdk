package kz.wooppay.qr_pay_sdk.models.error;

import com.google.gson.annotations.SerializedName;

public class Error {

    /** error code by HTTP specification*/
    private short code;
    /** error class name from server*/
    @SerializedName("class")
    private String errorClass;
    /** error message*/
    private String message;
    /** error data*/
    private String data;

    /** getter for error code*/
    public short getCode() {
        return code;
    }

    /** setter for error code*/
    public void setCode(short code) {
        this.code = code;
    }

    /** getter for error class*/
    public String getErrorClass() {
        return errorClass;
    }

    /** setter for error class*/
    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    /** getter for error message*/
    public String getMessage() {
        return message;
    }

    /** setter for error message*/
    public void setMessage(String message) {
        this.message = message;
    }

    /** String value of Error object*/
    @Override
    public String toString() {
        return "Error{" +
                "code=" + code +
                ", errorClass='" + errorClass + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
