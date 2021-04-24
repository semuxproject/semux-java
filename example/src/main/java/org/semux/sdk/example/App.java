package org.semux.sdk.example;

import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.api.AccountApi;
import org.semux.sdk.client.model.GetAccountResponse;
import org.semux.sdk.crypto.Key;

public class App {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();

        // Set API endpoint and authentication
        client.setBasePath("https://api.semux.info/v2.4.0");
        client.setUsername("test");
        client.setPassword("test");

        // Create a key and address
        Key key = new Key();
        String address = key.toAddressString();

        // Invoke an API
        try {
            AccountApi apiInstance = new AccountApi();
            GetAccountResponse result = apiInstance.getAccount(address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            e.printStackTrace();
        }
    }
}
