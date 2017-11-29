package kz.wooppay.qr_pay_sdk.models.payment;

public class PayResponse {
    /** operation object*/
    private Operation operation;

    /** getter for operation object*/
    public Operation getOperation() {
        return operation;
    }

    /** setter for operation object*/
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /** String value of PayResponse object*/
    @Override
    public String toString() {
        return "PayResponse{" +
                ", operation=" + operation +
                '}';
    }
}
