package kz.wooppay.qr_pay_sdk.core.auth_token;

/**
 * TokenManager - this class used for manage tokens
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public final class TokenManager {
    /** Свойство - хронимый токен */
    private static String token;

    /**
     * Set token to Token Manager
     * @param token     token for save
     */
    public static void setToken(String token) {
        TokenManager.token = token;
    }

    /**
     * Get token from Token Manager?
     * @return  token   token from Token Manager
     */
    public static String getToken() {
        return token;
    }
}