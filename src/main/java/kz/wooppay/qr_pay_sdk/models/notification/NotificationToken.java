package kz.wooppay.qr_pay_sdk.models.notification;

public class NotificationToken {
    /** FireBase device token*/
    private String token;

    /** Default constructor*/
    public NotificationToken() {}

    /** Constructor with param
     * @param token     FireBase device token
     * */
    public NotificationToken(String token) {
        this.token = token;
    }

    /** getter for token
     * @return  token     FireBase device token
     * */
    public String getToken() {
        return token;
    }

    /** setter for token
     * @param token     FireBase device token
     * */
    public void setToken(String token) {
        this.token = token;
    }
}
