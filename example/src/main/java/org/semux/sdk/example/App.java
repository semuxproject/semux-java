package org.semux.sdk.example;

import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.api.AccountApi;
import org.semux.sdk.client.model.GetAccountResponse;

public class App {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();

        // Set API endpoint and authentication
        client.setBasePath("https://api.semux.info/v2.4.0");
        client.setUsername("test");
        client.setPassword("test");
        // client.setDebugging(true);

        // Invoke an API
        try {
            AccountApi apiInstance = new AccountApi();
            GetAccountResponse result = apiInstance.getAccount("0x93f158fd14ff520babdbba189693bd85d97e06ed");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            e.printStackTrace();
        }
    }
}
