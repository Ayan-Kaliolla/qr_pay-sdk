package kz.wooppay.qr_pay_sdk;

import java.util.List;

import kz.wooppay.qr_pay_sdk.models.auth.Account;
import kz.wooppay.qr_pay_sdk.models.auth.CheckSms;
import kz.wooppay.qr_pay_sdk.models.history.History;
import kz.wooppay.qr_pay_sdk.models.payment.CheckFields;
import kz.wooppay.qr_pay_sdk.models.payment.FieldsArray;
import kz.wooppay.qr_pay_sdk.models.payment.FieldsMap;
import kz.wooppay.qr_pay_sdk.models.payment.PayByBalance;
import kz.wooppay.qr_pay_sdk.models.payment.PayResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import static kz.wooppay.qr_pay_sdk.core.Constants.API;

/**
 * ClientRestClient - this interface for interacting with server
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/
public interface ClientRestClient {

    /**
     * Method for call remote authentication service from server
     *
     * @param account   model account
     * @return ResponseBody
     * @see Account
     * @see ResponseBody
     * */
    @POST(API + "/user/client-login")
    Call<ResponseBody> auth(@Body Account account);

    /**
     * Method for call remote check sms code service from server
     *
     * @param  checkSms  model checkSms
     * @return ResponseBody
     * @see CheckSms
     * @see ResponseBody
     * */
    @POST(API + "/user/check-s-m-s")
    Call<ResponseBody> checkSms(@Body CheckSms checkSms);

    /**
     * Method for call remote get fields for payment service from server
     *
     * @param  qr   QR Code
     * @return FieldsArray
     * @see FieldsArray
     * */
    @GET(API + "/payment/get-fields")
    Call<FieldsArray> getFieldsForPayment(@Query("qr_code") String qr);

    /**
     * Method for call remote check fields for payment service from server
     *
     * @param  checkFields  fields for check and qr code
     * @return FieldsMap
     * @see CheckFields
     * @see FieldsMap
     * */
    @POST(API + "/payment/check-fields")
    Call<FieldsMap> checkFieldsForPayment(@Body CheckFields checkFields);

    /**
     * Method for call remote payment service from server
     *
     * @param  payByBalance  model payByBalance
     * @return PayResponse  payment info
     * @see PayByBalance
     * @see PayResponse
     * */
    @POST(API + "/payment/pay-by-balance")
    Call<PayResponse> payByBalance(@Body PayByBalance payByBalance);

    /**
     * Method for call remote history service from server
     *
     * @param perPage   history count on one page
     * @param page      page number
     * @return history model list
     * @see History
     * */
    @GET(API + "/history/client-history")
    Call<List<History>> getClientHistory(@Query("perPage") int perPage, @Query("page") int page);

}
