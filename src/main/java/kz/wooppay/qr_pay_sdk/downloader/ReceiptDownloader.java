package kz.wooppay.qr_pay_sdk.downloader;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import kz.wooppay.qr_pay_sdk.BuildConfig;
import kz.wooppay.qr_pay_sdk.R;
import kz.wooppay.qr_pay_sdk.core.auth_token.TokenManager;
import okhttp3.ResponseBody;

import static android.content.Context.DOWNLOAD_SERVICE;
import static android.os.Environment.DIRECTORY_DOWNLOADS;
import static kz.wooppay.qr_pay_sdk.core.Constants.BASE_URL;
import static kz.wooppay.qr_pay_sdk.core.Constants.IS_DEBUG;
import static kz.wooppay.qr_pay_sdk.core.Constants.KEY_AUTHTOKEN;

/**
 * ReceiptDownloader - this class for download receipt in pdf file from server by path with param operationId
 *
 * @author Ayan Kaliolla
 * @version 1.0
 **/

public class ReceiptDownloader {
    /**
     * path for download receipt
     */
    public static final String PATH_RECEIPT = "v4/history/receipt";
    /**
     * constant key operationId
     */
    public static String PARAM_OPERATION_ID = "id";

    private static String TAG = ReceiptDownloader.class.getName();

    /**
     * Method for download receipt. If session active download receipt else show notification about close session
     *
     * @param context     application context used for get system download service
     * @param operationId http request parameter for get receipt
     * @see Toast
     * @see Context
     */
    @Deprecated
    public static void download(Context context, long operationId, String description, String title) {
        if (description == null) description = "receipt";
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
        } else {
            Toast.makeText(context, context.getString(R.string.token_not_found), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This method saves a check to the file.
     *
     * @param context application context used for get system download service
     * @return returns a boolean value. Returns true if the file is written otherwise returns false.
     * @see Context
     */
    @Deprecated
    public static boolean writeToDisk(Context context, ResponseBody body, String fileName) {
        try {
            // todo change the file location/name according to your needs
            File futureStudioIconFile = new File(context.getExternalFilesDir(DIRECTORY_DOWNLOADS) + File.separator + fileName + ".pdf");
            InputStream inputStream = null;
            OutputStream outputStream = null;

            try {
                byte[] fileReader = new byte[4096];

                long fileSize = body.contentLength();
                long fileSizeDownloaded = 0;

                inputStream = body.byteStream();
                outputStream = new FileOutputStream(futureStudioIconFile);

                while (true) {
                    int read = inputStream.read(fileReader);

                    if (read == -1) {
                        break;
                    }

                    outputStream.write(fileReader, 0, read);

                    fileSizeDownloaded += read;

                    Log.d(TAG, "file download: " + fileSizeDownloaded + " of " + fileSize);
                }

                outputStream.flush();

                return true;
            } catch (IOException e) {
                return false;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            return false;
        }
    }


    /**
     * This method saves a check to the file.
     *
     * @param body  check content
     * @param file  file where the check will be saved
     * @return returns a boolean value. Returns true if the file is written otherwise returns false.
     * @see ResponseBody
     * @see File
     */
    public static File writeToFile(ResponseBody body, File file) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File fData = new File(file.getAbsolutePath() + ".pdf");
            byte[] fileReader = new byte[4096];

            long fileSize = body.contentLength();
            long fileSizeDownloaded = 0;

            inputStream = body.byteStream();
            outputStream = new FileOutputStream(fData);

            while (true) {
                int read = inputStream.read(fileReader);
                if (read == -1) {
                    break;
                }
                outputStream.write(fileReader, 0, read);
                fileSizeDownloaded += read;
                if (IS_DEBUG) {
                    Log.d(TAG, "file download: " + fileSizeDownloaded + " of " + fileSize);
                }
            }

            outputStream.flush();
            return fData;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    if (IS_DEBUG) {
                        e.printStackTrace();
                    }
                }
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    if (IS_DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
