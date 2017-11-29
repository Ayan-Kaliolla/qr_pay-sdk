package kz.wooppay.qr_pay_sdk.core;

import java.util.List;

import okhttp3.Headers;
import kz.wooppay.qr_pay_sdk.models.error.Error;
/**
 * ResponseCallback - callback interface for handle response
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public interface ResponseCallback {
    /**
     * Handle method for response if request is success
     * */
    void onSuccess(Headers headers, Object data);
    /**
     * Handle method for response if request is failure
     * */
    void onFailure(List<Error> message, int responseCode);

    /**
     * Handle method for response if thrown Exception
     * */
    void onException(Exception ex);
}