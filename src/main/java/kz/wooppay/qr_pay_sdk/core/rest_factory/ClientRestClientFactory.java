package kz.wooppay.qr_pay_sdk.core.rest_factory;


import java.util.Locale;

import kz.wooppay.qr_pay_sdk.ClientRestClient;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static kz.wooppay.qr_pay_sdk.core.Constants.BASE_URL;

/**
 * ClientRestClientFactory - this class for create ClientRestClient RestApi interface
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class ClientRestClientFactory extends BaseRestClientFactory {


    /**
     * Method initial ResClient
     *
     * @param httpClient          HttpClient for RestClient
     * @return  ClientRestClient    RestClient - rest api for interacting with server QrPay
     * @see OkHttpClient
     * @see ClientRestClient
     * */
    private static ClientRestClient initResClient(OkHttpClient httpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) //Базовая часть адреса
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        return retrofit.create(ClientRestClient.class); //Создаем объект, при помощи которого будем выполнять запросы
    }


    /**
     * Method return RestClient for interacting with server
     *
     * @return  ClientRestClient    RestClient - rest api for interacting with server QrPay
     * @see ClientRestClient
     * */
    public static ClientRestClient getRestClient() {
        return getRestClient(new Locale("RU"));
    }

    /**
     * Method return RestClient for interacting with server
     *
     * @param   locale  response locale
     * @return  ClientRestClient    RestClient - rest api for interacting with server QrPay
     * @see ClientRestClient
     * */
    public static ClientRestClient getRestClient(Locale locale) {
        if (locale == null){
            locale = new Locale("RU");
        }
        Interceptor tokenInterceptor = createHeaderInterceptor(locale);
        HttpLoggingInterceptor httpLoggingInterceptor = createHttpLoggingInterceptor();
        OkHttpClient httpClient = createHttpClient(tokenInterceptor, httpLoggingInterceptor);
        return initResClient(httpClient);
    }
}
