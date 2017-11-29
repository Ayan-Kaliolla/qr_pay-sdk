package kz.wooppay.qr_pay_sdk.models.error;

public class ErrorObject {
    /** Error object
     * @see Error
     * */
    private Error error;

    /** getter error object*/
    public Error getError() {
        return error;
    }

    /** setter error object*/
    public void setError(Error error) {
        this.error = error;
    }

    /** String value of ErrorObject object*/
    @Override
    public String toString() {
        return "ErrorObject{" +
                "error=" + error +
                '}';
    }
}
