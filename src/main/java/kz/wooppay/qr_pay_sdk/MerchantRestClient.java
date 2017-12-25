package kz.wooppay.qr_pay_sdk;

import java.util.List;

import kz.wooppay.qr_pay_sdk.models.auth.CashierAccount;
import kz.wooppay.qr_pay_sdk.models.auth.Password;
import kz.wooppay.qr_pay_sdk.models.auth.RestorePassword;
import kz.wooppay.qr_pay_sdk.models.auth.User;
import kz.wooppay.qr_pay_sdk.models.cashier_activate.ActivationInfo;
import kz.wooppay.qr_pay_sdk.models.cashier_activate.QRCode;
import kz.wooppay.qr_pay_sdk.models.history.CashierHistory;
import kz.wooppay.qr_pay_sdk.models.history.Point;
import kz.wooppay.qr_pay_sdk.models.history.WrapperPoint;
import kz.wooppay.qr_pay_sdk.models.notification.NotificationToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Streaming;

import static kz.wooppay.qr_pay_sdk.core.Constants.VERSION;

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
    @POST(VERSION + "/auth")
    Call<User> auth(@Body CashierAccount account);


    /**
     * Method for restore password
     *
     * @param restoreData   model RestorePassword
     * @return ResponseBody
     * @see RestorePassword
     * @see ResponseBody
     * */
    @POST(VERSION + "/auth/restore-password/request")
    Call<ResponseBody> restoreRequest(@Body RestorePassword restoreData);


    /**
     * Method for restore password
     *
     * @param password   model Password
     * @return ResponseBody
     * @see Password
     * @see ResponseBody
     * */
    @POST(VERSION + "/auth/restore-password/confirm")
    Call<ResponseBody> setNewPassword(@Body Password password);

    /**
     * Method for call remote point list service from server
     *
     * @return point model list
     * @see Point
     * */
    @GET(VERSION + "/user-point?expand=point")
    Call<List<WrapperPoint>> getPoints(@Query("user_id") long userId);

    /**
     * Method for call remote cashier activate service from server
     *
     * @return qrCode model qrCode
     * @see QRCode
     * */
    @POST(VERSION + "/cash-desk/activate")
    Call<ActivationInfo> cashierActivate(@Body QRCode qrCode);


    /**
     * Method for call remote history service from server by PointId with pagination
     *
     * @param pointId   Id PTS
     * @return cashier history model list.Returns all items of history.
     * @see CashierHistory
     * */
    @GET(VERSION + "/history")
    Call<List<CashierHistory>> getHistoryByPointId(@Query("point_id") long pointId);

    /**
     * Method for call remote history service from server by PointId with pagination
     *
     * @param pointId   Id PTS
     * @param perPage   history count on one page.Min value 10.
     * @return cashier history model list
     * @see CashierHistory
     * */
    @GET(VERSION + "/history")
    Call<List<CashierHistory>> getHistoryByPointId(@Query("point_id") long pointId, @Query("per-page") int perPage);

    /**
     * Method for call remote history service from server by PointId with pagination
     *
     * @param pointId   Id PTS
     * @param perPage   history count on one page.Min value 10.
     * @param offset    offset position. This parameter must be greater than 0.
     * @return cashier history model list
     * @see CashierHistory
     * */
    @GET(VERSION + "/history")
    Call<List<CashierHistory>> getHistoryByPointId(@Query("point_id") long pointId, @Query("per-page") int perPage, @Query("offset") int offset);

    /**
     * Method for call remote history service from server by PointId and CashDeskId
     *
     * @param pointId      Id PTS
     * @param cashDeskId    Cash Desk Id
     * @return cashier history model list. Returns all items of history.
     * @see CashierHistory
     * */
    @GET(VERSION + "/history")
    Call<List<CashierHistory>> getHistoryByPointIdAndCashDeskId(@Query("point_id") long pointId, @Query("cash_desk_id") long cashDeskId);

    /**
     * Method for call remote history service from server by PointId and CashDeskId
     *
     * @param pointId      Id PTS
     * @param cashDeskId    Cash Desk Id
     * @param perPage   history count on one page.Min value 10.
     * @return cashier history model list
     * @see CashierHistory
     * */
    @GET(VERSION + "/history")
    Call<List<CashierHistory>> getHistoryByPointIdAndCashDeskId(@Query("point_id") long pointId, @Query("cash_desk_id") long cashDeskId, @Query("per-page") int perPage);


    /**
     * Method for call remote history service from server by PointId and CashDeskId
     *
     * @param pointId      Id PTS
     * @param cashDeskId    Cash Desk Id
     * @param perPage   history count on one page.Min value 10.
     * @param offset    offset position. This parameter must be greater than 0.
     * @return cashier history model list
     * @see CashierHistory
     * */
    @GET(VERSION + "/history")
    Call<List<CashierHistory>> getHistoryByPointIdAndCashDeskId(@Query("point_id") long pointId, @Query("cash_desk_id") long cashDeskId, @Query("per-page") int perPage, @Query("offset") int offset);

    /**
     * Method for call remote registration token service from server
     *
     * @param  token  model NotificationToken
     * @see NotificationToken
     */
    @Streaming
    @POST(VERSION + "/cashier/set-device-token")
    Call<ResponseBody> registrationFireBaseToken(@Body NotificationToken token);
}
