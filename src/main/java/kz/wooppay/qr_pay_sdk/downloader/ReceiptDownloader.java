package kz.wooppay.qr_pay_sdk.downloader;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;

import kz.wooppay.qr_pay_sdk.R;
import kz.wooppay.qr_pay_sdk.core.auth_token.TokenManager;

import static android.content.Context.DOWNLOAD_SERVICE;
import static kz.wooppay.qr_pay_sdk.core.Constants.BASE_URL;
import static kz.wooppay.qr_pay_sdk.core.Constants.KEY_AUTHTOKEN;

/**
 * ReceiptDownloader - this class for download receipt in pdf file from server by path with param operationId
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class ReceiptDownloader {
    /** path for download receipt*/
    public static final String PATH_RECEIPT = "v4/history/receipt";
    /** constant key operationId*/
    public static String PARAM_OPERATION_ID = "id";

    /**
     * Method for download receipt. If session active download receipt else show notification about close session
     *
     * @param context           application context used for get system download service
     * @param operationId       http request parameter for get receipt
     * @see Toast
     * @see Context
     * */
    public static void download(Context context, int operationId, String description, String title) {
        if (description == null) description= "receipt";
        if (title == null) title = "receipt";
        String token = TokenManager.getToken();
        if (token != null && !token.isEmpty()) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(BASE_URL + PATH_RECEIPT + "?" + PARAM_OPERATION_ID + "=" + operationId));
            request.addRequestHeader(KEY_AUTHTOKEN, token);
            request.setDescription(description);
            request.setTitle(title);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            ((DownloadManager) context.getSystemService(DOWNLOAD_SERVICE)).enqueue(request);
        }else {
            Toast.makeText(context, context.getString(R.string.token_not_found), Toast.LENGTH_LONG).show();
        }
    }
}
