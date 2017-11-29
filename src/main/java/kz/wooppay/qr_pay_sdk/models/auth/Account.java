package kz.wooppay.qr_pay_sdk.models.auth;

import com.google.gson.annotations.SerializedName;

public class Account extends BaseAccount {

    /** Phone number of the user*/
    private String login;

    /** getter for phone number of the user*/
    public String getLogin() {
        return login;
    }

    /** setter for phone number of the user*/
    public void setLogin(String login) {
        this.login = login;
    }

    /** String value of Account object*/
    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ",partner='" + super.getPartner() + '\'' +
                '}';
    }
}