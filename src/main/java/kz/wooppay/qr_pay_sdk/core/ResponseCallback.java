package kz.wooppay.qr_pay_sdk.core;

import kz.wooppay.qr_pay_sdk.models.error.ErrorObject;
import okhttp3.Headers;

/**
 * ResponseCallback - callback interface for handle response
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public interface ResponseCallback {
    /**
     * Handle  method for response if request is success
     * */
    void onSuccess(Headers headers, Object data);
    /**
     * Handle  method for response if request is failure
     * */
    void onFailure(ErrorObject message);
}