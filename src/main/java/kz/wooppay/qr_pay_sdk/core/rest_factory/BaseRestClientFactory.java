package kz.wooppay.qr_pay_sdk.core.rest_factory;

import android.os.Build;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;

import kz.wooppay.qr_pay_sdk.core.auth_token.TokenManager;
import kz.wooppay.qr_pay_sdk.ssl.Tls12SocketFactory;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;

import static kz.wooppay.qr_pay_sdk.core.Constants.KEY_AUTHTOKEN;

/**
 * BaseRestClientFactory - this abstract class for create HttpClient
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public abstract class BaseRestClientFactory {

    /**
     * Method create HttpClient
     * @param tokenInterceptor          Interceptor for add token to header in request
     * @param httpLoggingInterceptor    Interceptor for logging http request
     * @see Interceptor
     * */

    protected static OkHttpClient createHttpClient(Interceptor tokenInterceptor, HttpLoggingInterceptor httpLoggingInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(75, TimeUnit.SECONDS)
                .writeTimeout(75, TimeUnit.SECONDS)
                .readTimeout(90, TimeUnit.SECONDS)
                .addInterceptor(tokenInterceptor)
                .addInterceptor(httpLoggingInterceptor);
        setSSL(builder);
        return builder.build();
    }

    /**
     * Method create interceptor
     *
     * @return  tokenInterceptor          Interceptor for add token to header in request
     * @see Interceptor
     * */
    protected static Interceptor createHeaderInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                String token = TokenManager.getToken();
                Request request = null;
                if (token != null && !token.isEmpty()) {
                    request = chain.request().newBuilder().addHeader(KEY_AUTHTOKEN, token).build();
                } else {
                    request = chain.request().newBuilder().addHeader(KEY_AUTHTOKEN, "").build();
                }
/*

                try {
                    final Request copy = request.newBuilder().build();
                    final Buffer buffer = new Buffer();
                    copy.body().writeTo(buffer);
                    System.out.println(buffer.readUtf8());
                } catch (final IOException e) {
                    System.out.println("did not work");
                }
*/
                return chain.proceed(request);
            }
        };
    }

    /**
     * Method create interceptor
     *
     * @return  httpLoggingInterceptor    Interceptor for logging http request
     * @see Interceptor
     * */
    protected static HttpLoggingInterceptor createHttpLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }


    /**
     * Method active SSL/TLSv1.2 protocol
     *@param builder    http client builder for activate ssl
     * */
    private static void setSSL(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext sc = SSLContext.getInstance("TLSv1.2");
                sc.init(null, null, null);
                builder.sslSocketFactory(new Tls12SocketFactory(sc.getSocketFactory()));

                ConnectionSpec cs = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                        .tlsVersions(TlsVersion.TLS_1_2)
                        .build();

                List<ConnectionSpec> specs = new ArrayList<>();
                specs.add(cs);
                specs.add(ConnectionSpec.COMPATIBLE_TLS);
                specs.add(ConnectionSpec.CLEARTEXT);

                builder.connectionSpecs(specs);
            } catch (Exception exc) {
                Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc);
            }
        }
    }
}
