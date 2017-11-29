package kz.wooppay.qr_pay_sdk.models.auth;

import com.google.gson.annotations.SerializedName;

public class CheckSms extends Account {

    /** One time password*/
    @SerializedName("code")
    private String sms;

    /** constructor with parameter
     * @param account   user data
     * @param sms       one time password
     * @see Account
     * */
    public CheckSms(Account account, String sms){
        this.setLogin(account.getLogin());
        this.setPartner(account.getPartner());
        this.sms = sms;
    }

    /** getter for one time password*/
    public String getSms() {
        return sms;
    }

    /** setter for one time password*/
    public void setSms(String sms) {
        this.sms = sms;
    }

    /** String value of CheckSms object*/
    @Override
    public String toString() {
        return "CheckSms{" +
                "sms=" + sms +
                '}';
    }
}
