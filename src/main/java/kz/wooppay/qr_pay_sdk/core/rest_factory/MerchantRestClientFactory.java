package kz.wooppay.qr_pay_sdk.core.rest_factory;

import java.util.Locale;

import kz.wooppay.qr_pay_sdk.MerchantRestClient;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static kz.wooppay.qr_pay_sdk.core.Constants.BASE_URL;

/**
 * MerchantRestClientFactory - this class for create MerchantRestClient RestApi interface
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/

public class MerchantRestClientFactory extends BaseRestClientFactory {

    /**
     * Method initial ResClient
     *
     * @param httpClient          HttpClient for RestClient
     * @return  MerchantRestClient    RestClient - rest api for interacting with server
     * @see OkHttpClient
     * @see MerchantRestClient
     * */
    private static MerchantRestClient initResClient(OkHttpClient httpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) //Базовая часть адреса
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        return retrofit.create(MerchantRestClient.class); //Создаем объект, при помощи которого будем выполнять запросы
    }

    /**
     * Method return RestClient for interacting with server
     *
     * @return  MerchantRestClient    RestClient - rest api for interacting with server
     * @see MerchantRestClient
     * */
    public static MerchantRestClient getRestClient() {
        return getRestClient(new Locale("RU"));
    }

    /**
     * Method return RestClient for interacting with server
     * @param   locale  response locale
     * @return  MerchantRestClient    RestClient - rest api for interacting with server
     * @see MerchantRestClient
     * */
    public static MerchantRestClient getRestClient(Locale locale) {
        if (locale == null){
            locale = new Locale("RU");
        }
        Interceptor tokenInterceptor = createHeaderInterceptor(locale);
        HttpLoggingInterceptor httpLoggingInterceptor = createHttpLoggingInterceptor();
        OkHttpClient httpClient = createHttpClient(tokenInterceptor, httpLoggingInterceptor);
        return initResClient(httpClient);
    }
}
