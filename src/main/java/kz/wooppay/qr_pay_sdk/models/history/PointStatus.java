package kz.wooppay.qr_pay_sdk.models.history;

public class PointStatus {
    /** statuses PTS (point of trade and service). 0 - BLOCKED, 1 - ACTIVE */
    private static final long ACTIVE = 1L, BLOCKED = 0L;

    /** Status id for PTS (point of trade and service)*/
    private long status;

    /** getter for status id*/
    public long getStatus() {
        return status;
    }
    /** setter for status id*/
    public void setStatus(long status) {
        this.status = status;
    }
}
