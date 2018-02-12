package kz.wooppay.qr_pay_sdk.models.error;

/**
 * Created by akaliolla on 12.02.2018.
 */

public class ErrorResult {
    private String name;
    private String message;
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
