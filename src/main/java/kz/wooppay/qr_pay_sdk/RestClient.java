package kz.wooppay.qr_pay_sdk;

/**
 * RestClient - this class for getting RestClient (ClientRestClient/MerchantRestClient)
 *
 * @author Ayan Kaliolla
 * @version 1.0
 *
 **/
import kz.wooppay.qr_pay_sdk.core.rest_factory.ClientRestClientFactory;
import kz.wooppay.qr_pay_sdk.core.rest_factory.MerchantRestClientFactory;

public abstract class RestClient {
    private static ClientRestClient clientRestClient;
    private static MerchantRestClient merchantRestClient;

    synchronized public final static ClientRestClient getClientRestClient(){
        if (clientRestClient == null){
            clientRestClient = ClientRestClientFactory.getRestClient();
        }
        return clientRestClient;
    }

    synchronized public final static MerchantRestClient getMerchantRestClient(){
        if (merchantRestClient == null){
            merchantRestClient = MerchantRestClientFactory.getRestClient();
        }
        return merchantRestClient;
    }
}
