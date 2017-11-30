package kz.wooppay.qr_pay_sdk.handler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import kz.wooppay.qr_pay_sdk.core.ResponseCallback;
import kz.wooppay.qr_pay_sdk.core.auth_token.TokenManager;
import kz.wooppay.qr_pay_sdk.handler.util.JsonUtil;
import kz.wooppay.qr_pay_sdk.models.error.Error;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static kz.wooppay.qr_pay_sdk.core.Constants.KEY_AUTHTOKEN;

/**
 * HttpHandler - this class handle http response implementation Callback interface
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/
public class HttpHandler implements Callback{

    /** callback for handle response data*/
    private ResponseCallback callback;

    /**
     * Constructor HttpHandler with param
     *
     *@param callback   callback for handle response data
     * */
    public HttpHandler(ResponseCallback callback) {
        this.callback = callback;
    }

    /**
     * Handle  method for response if request is success
     * */
    @Override
    public void onResponse(Call call, Response response) {
        String errorJson = JsonUtil.getErrorJsonFromResponse(response);
        if (response.isSuccessful()){
            String token = response.headers().get(KEY_AUTHTOKEN);
            if (token != null && !token.isEmpty()){
                TokenManager.setToken(token);
            }
            callback.onSuccess(response.headers(), response.body());
        }else {
            try {
                Type listType = new TypeToken<List<Error>>() {
                }.getType();
                List<Error> errors = new Gson().fromJson(errorJson, listType);
                callback.onFailure(errors, response.code());
            }catch (Exception ex){
                callback.onException(ex);
            }
        }
    }

    /**
     * Handle  method for response if request is failure
     * */
    @Override
    public void onFailure(Call call, Throwable t) {
        callback.onException(new Exception(t));
    }
}