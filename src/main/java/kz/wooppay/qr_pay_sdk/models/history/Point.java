package kz.wooppay.qr_pay_sdk.models.history;

import com.google.gson.annotations.SerializedName;

/**
 *This class description PTS ( point of trade and service ) extended PointStatus
 * @see PointStatus
 */

public class Point extends PointStatus{
    /** point of trade and service id*/
    private long id;
    /** PTS owner id*/
    @SerializedName("merchant_id")
    private long merchantId;
    /** PTS name*/
    private String name;
    /** PTS address*/
    private String address;
    /** date of creation PTS*/
    @SerializedName("create_time")
    private String createTime;
    /** Payment destination code (код назначения платежа)*/
    @SerializedName("knp_id")
    private Integer knpId;

    /** getter for point of trade and service id*/
    public long getId() {
        return id;
    }

    /** setter for point of trade and service id*/
    public void setId(long id) {
        this.id = id;
    }

    /** getter for PTS owner id*/
    public long getMerchantId() {
        return merchantId;
    }

    /** setter for PTS owner id*/
    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    /** getter for PTS name*/
    public String getName() {
        return name;
    }

    /** setter for PTS name*/
    public void setName(String name) {
        this.name = name;
    }

    /** getter for PTS address*/
    public String getAddress() {
        return address;
    }

    /** setter for PTS address*/
    public void setAddress(String address) {
        this.address = address;
    }

    /** getter for date of creation PTS*/
    public String getCreateTime() {
        return createTime;
    }

    /** setter for date of creation PTS*/
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /** getter for knp id (Payment destination code (код назначения платежа))*/
    public Integer getKnpId() {
        return knpId;
    }

    /** setter for knp id (Payment destination code (код назначения платежа))*/
    public void setKnpId(Integer knpId) {
        this.knpId = knpId;
    }

    /** String value of Point object*/
    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", merchantId=" + merchantId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status='" + getStatus() + '\'' +
                ", knpId=" + knpId +
                '}';
    }
}
