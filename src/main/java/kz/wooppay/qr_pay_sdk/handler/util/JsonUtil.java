package kz.wooppay.qr_pay_sdk.handler.util;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * JsonUtil - this class for parse error body to string json
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class JsonUtil {

    /**
     * Method for get string json from error body
     *
     * @param response           response object from server
     * @see Response
     * */
    public static String getErrorJsonFromResponse(Response response) {
        String errorJson;
        ResponseBody responseBody = response.errorBody();
        if (responseBody != null) {
            try {
                errorJson = responseBody.string();
            } catch (IOException e) {
                errorJson = "[]";
                e.printStackTrace();
            }
        }else {
            errorJson = null;
        }
        return errorJson;
    }
}
