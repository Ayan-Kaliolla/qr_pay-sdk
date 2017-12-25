package kz.wooppay.qr_pay_sdk.models.auth;

import com.google.gson.annotations.SerializedName;

/**
 * Created by akaliolla on 25.12.2017.
 */

public class RestorePassword {
    @SerializedName("phone")
    private String clientLogin;
    @SerializedName("merchant_phone")
    private String merchantLogin;

    public String getClientLogin() {
        return clientLogin;
    }

    public void setClientLogin(String clientLogin) {
        this.clientLogin = clientLogin;
    }

    public String getMerchantLogin() {
        return merchantLogin;
    }

    public void setMerchantLogin(String merchantLogin) {
        this.merchantLogin = merchantLogin;
    }
}
