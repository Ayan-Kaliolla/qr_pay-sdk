package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

/**
 * This class contains payment status
 * */
public class Status {
    /** constants for payment status*/
    public static final long NEW = 1L, CONFIRMED = 2L, PROCESSED = 3L, CANCELED = 4L, REFUND = 5L, DELETED = 6L;

    /** status id*/
    @SerializedName("status_id")
    private long statusId;

    /** getter for status id*/
    public long getStatusId() {
        return statusId;
    }

    /** setter for status id*/
    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }
}
