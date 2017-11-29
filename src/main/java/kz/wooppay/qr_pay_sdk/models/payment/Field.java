package kz.wooppay.qr_pay_sdk.models.payment;


import com.google.gson.annotations.SerializedName;


/**
 * Field - this class description fields for payment
 *
 * @author Ayan Kaliolla
 * @version 1.0
 **/

public class Field {
    /**
     * Field name
     */
    private String name;
    /**
     * Field title
     */
    private String title;
    /**
     * Field type
     */
    private String type;
    /**
     * Field is hidden
     */
    private boolean hidden;
    /**
     * Field is readonly
     */
    private boolean readonly;
    /**
     * Field value
     */
    private String value;

    /**
     * Optional Boolean value to indicate the sending field
     */
    @SerializedName("is_need_send")
    private boolean isNeedSend;

    /**
     * getter for field name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for field name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for field title
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter for field title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getter for field type
     */
    public String getType() {
        return type;
    }

    /**
     * setter for field type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * check field hidden
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * setter for field hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * check field readonly
     */
    public boolean isReadonly() {
        return readonly;
    }

    /**
     * setter for field readonly
     */
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    /**
     * getter for field value
     */
    public String getValue() {
        return value;
    }

    /**
     * setter for field value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * getter for indicate the sending field
     */
    public boolean isNeedSend() {
        return isNeedSend;
    }

    /**
     * setter for indicate the sending field
     */
    public void setNeedSend(boolean needSend) {
        isNeedSend = needSend;
    }
}
