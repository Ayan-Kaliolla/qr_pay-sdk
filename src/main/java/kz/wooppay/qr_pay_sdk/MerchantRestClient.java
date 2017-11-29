package kz.wooppay.qr_pay_sdk;

import java.util.List;

import kz.wooppay.qr_pay_sdk.models.auth.CashierAccount;
import kz.wooppay.qr_pay_sdk.models.cashier_activate.ActivationInfo;
import kz.wooppay.qr_pay_sdk.models.cashier_activate.QRCode;
import kz.wooppay.qr_pay_sdk.models.history.CashierHistory;
import kz.wooppay.qr_pay_sdk.models.history.Point;
import kz.wooppay.qr_pay_sdk.models.notification.NotificationToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import static kz.wooppay.qr_pay_sdk.core.Constants.API;

/**
 * MerchantRestClient - this interface for interacting with server
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/
public interface MerchantRestClient {

    /**
     * Method for call remote authentication and authorization service from server
     *
     * @param account   model account
     * @return ResponseBody
     * @see CashierAccount
     * @see ResponseBody
     * */
    @POST(API + "/user/cashier-login")
    Call<ResponseBody> auth(@Body CashierAccount account);

    /**
     * Method for call remote point list service from server
     *
     * @return point model list
     * @see Point
     * */
    @GET(API + "/point/get-point-list")
    Call<List<Point>> getPoints();

    /**
     * Method for call remote cashier activate service from server
     *
     * @return qrCode model qrCode
     * @see QRCode
     * */
    @POST(API + "/cashier/cashier-activate")
    Call<ActivationInfo> cashierActivate(@Body QRCode qrCode);

    /**
     * Method for call remote history service from server by PointId with pagination
     *
     * @param pointId   Id PTS
     * @param perPage   history count on one page
     * @param page      page number
     * @return cashier history model list
     * @see CashierHistory
     * */
    @GET(API + "/history/cashier-history")
    Call<List<CashierHistory>> getHistoryByPointId(@Query("pointId") long pointId, @Query("perPage") int perPage, @Query("page") int page);

    /**
     * Method for call remote history service from server by PointId and CashDeskId
     *
     * @param pointId      Id PTS
     * @param cashDeskId    Cash Desk Id
     * @param perPage   history count on one page
     * @param page      page number
     * @return cashier history model list
     * @see CashierHistory
     * */
    @GET(API + "/history/cashier-history")
    Call<List<CashierHistory>> getHistoryByPointIdAndCashDeskId(@Query("pointId") long pointId, @Query("cashDeskId") long cashDeskId, @Query("perPage") int perPage, @Query("page") int page);

    /**
     * Method for call remote registration token service from server
     *
     * @param  token  model NotificationToken
     * @see NotificationToken
     * */
    @POST(API + "/user/set-device-token")
    Call<ResponseBody> registrationFireBaseToken(@Body NotificationToken token);
}
