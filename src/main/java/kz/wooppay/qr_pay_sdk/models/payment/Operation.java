package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

/**
 *This class extended Status class, that contains payment status
 * @see Status
 * */
public class Operation extends Status{
    /** operation id*/
    @SerializedName("operation_id")
    private long operationId;
    /** getter for operation id*/
    public long getOperationId() {
        return operationId;
    }

    /** setter for operation id*/
    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }


}
