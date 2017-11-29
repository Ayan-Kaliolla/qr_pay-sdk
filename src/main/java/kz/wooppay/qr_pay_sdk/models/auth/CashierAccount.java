package kz.wooppay.qr_pay_sdk.models.auth;

import com.google.gson.annotations.SerializedName;

public class CashierAccount {
    /** Phone number of the cashier*/
    @SerializedName("cashier_login")
    private String login;

    /** Password of the cashier*/
    @SerializedName("cashier_password")
    private String password;

    /** getter for phone number of the cashier*/
    public String getLogin() {
        return login;
    }

    /** setter for phone number of the cashier*/
    public void setLogin(String login) {
        this.login = login;
    }

    /** getter for password of the cashier*/
    public String getPassword() {
        return password;
    }

    /** setter for password of the cashier*/
    public void setPassword(String password) {
        this.password = password;
    }
}
