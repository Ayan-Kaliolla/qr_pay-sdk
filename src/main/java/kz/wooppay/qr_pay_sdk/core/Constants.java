package kz.wooppay.qr_pay_sdk.core;

/**
 * Constants - this class contain constants
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class Constants {
    public static final boolean IS_DEBUG = true;
    public static final String BASE_URL = IS_DEBUG ? "http://api.test.qrpay.kz/" : "https://api.qrpay.kz/";

    public static final String KEY_AUTHTOKEN = "authorization";
    public static final String KEY_POINT_ID = "pointId";
    public static final String KEY_CASH_DESK_ID = "cashDeskId";
    public static final String KEY_QR = "qr";

    public static final int NO_SCAN_ERROR = 1;
    public static final int DEFAULT_ERROR = 0;
    public static final String SCAN_ERROR_TYPE = "type";

    public static final String VERSION = "/v4";

}
