package kz.wooppay.qr_pay_sdk.models.cashier_activate;


import com.google.gson.annotations.SerializedName;

public class ActivationInfo {
    /** Cash desk id */
    @SerializedName("cash_desk_id")
    private long cashDeskId;

    /** PTS - point of trade and service */
    @SerializedName("point_id")
    private long pointId;

    /** getter for cash desk id*/
    public long getCashDeskId() {
        return cashDeskId;
    }

    /** setter for cash desk id*/
    public void setCashDeskId(long cashDeskId) {
        this.cashDeskId = cashDeskId;
    }

    /** getter for PTS*/
    public long getPointId() {
        return pointId;
    }

    /** setter for PTS*/
    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    /** String value of ActivationInfo object*/
    @Override
    public String toString() {
        return "ActivationInfo{" +
                "cashDeskId=" + cashDeskId +
                ", pointId=" + pointId +
                '}';
    }
}
