package kz.wooppay.qr_pay_sdk.models.auth;

import com.google.gson.annotations.SerializedName;

/**
 * Created by akaliolla on 28.11.2017.
 */

public class User {
    @SerializedName("id")
    private long userId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
