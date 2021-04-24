# AccountApi

All URIs are relative to */v2.5.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountApi.md#getAccount) | **GET** /account | Get account info
[**getAccountCode**](AccountApi.md#getAccountCode) | **GET** /account/code | Get account code
[**getAccountInternalTransactions**](AccountApi.md#getAccountInternalTransactions) | **GET** /account/internal-transactions | Get account internal transactions
[**getAccountPendingTransactions**](AccountApi.md#getAccountPendingTransactions) | **GET** /account/pending-transactions | Get pending transactions of the account
[**getAccountStorage**](AccountApi.md#getAccountStorage) | **GET** /account/storage | Get account storage
[**getAccountTransactions**](AccountApi.md#getAccountTransactions) | **GET** /account/transactions | Get account transactions
[**getAccountVotes**](AccountApi.md#getAccountVotes) | **GET** /account/votes | Get account votes

<a name="getAccount"></a>
# **getAccount**
> GetAccountResponse getAccount(address)

Get account info

Returns the basic information about an account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
try {
    GetAccountResponse result = apiInstance.getAccount(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountCode"></a>
# **getAccountCode**
> GetAccountCodeResponse getAccountCode(address)

Get account code

Returns the code of an account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
try {
    GetAccountCodeResponse result = apiInstance.getAccountCode(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |

### Return type

[**GetAccountCodeResponse**](GetAccountCodeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountInternalTransactions"></a>
# **getAccountInternalTransactions**
> GetAccountInternalTransactionsResponse getAccountInternalTransactions(address, from, to)

Get account internal transactions

Returns internal transactions from/to an account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
String from = "from_example"; // String | Starting range of transactions
String to = "to_example"; // String | Ending range of transactions
try {
    GetAccountInternalTransactionsResponse result = apiInstance.getAccountInternalTransactions(address, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountInternalTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |
 **from** | **String**| Starting range of transactions |
 **to** | **String**| Ending range of transactions |

### Return type

[**GetAccountInternalTransactionsResponse**](GetAccountInternalTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountPendingTransactions"></a>
# **getAccountPendingTransactions**
> GetAccountPendingTransactionsResponse getAccountPendingTransactions(address, from, to)

Get pending transactions of the account

Returns pending transactions from/to an account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
String from = "from_example"; // String | Starting range of transactions
String to = "to_example"; // String | Ending range of transactions
try {
    GetAccountPendingTransactionsResponse result = apiInstance.getAccountPendingTransactions(address, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountPendingTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |
 **from** | **String**| Starting range of transactions |
 **to** | **String**| Ending range of transactions |

### Return type

[**GetAccountPendingTransactionsResponse**](GetAccountPendingTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountStorage"></a>
# **getAccountStorage**
> GetAccountStorageResponse getAccountStorage(address, key)

Get account storage

Returns the storage value mapped to the given key of an account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
String key = "key_example"; // String | The storage key
try {
    GetAccountStorageResponse result = apiInstance.getAccountStorage(address, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |
 **key** | **String**| The storage key |

### Return type

[**GetAccountStorageResponse**](GetAccountStorageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountTransactions"></a>
# **getAccountTransactions**
> GetAccountTransactionsResponse getAccountTransactions(address, from, to)

Get account transactions

Returns transactions from/to an account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
String from = "from_example"; // String | Starting range of transactions
String to = "to_example"; // String | Ending range of transactions
try {
    GetAccountTransactionsResponse result = apiInstance.getAccountTransactions(address, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |
 **from** | **String**| Starting range of transactions |
 **to** | **String**| Ending range of transactions |

### Return type

[**GetAccountTransactionsResponse**](GetAccountTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountVotes"></a>
# **getAccountVotes**
> GetAccountVotesResponse getAccountVotes(address)

Get account votes

Returns votes from the account.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
String address = "address_example"; // String | Address of account
try {
    GetAccountVotesResponse result = apiInstance.getAccountVotes(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountVotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of account |

### Return type

[**GetAccountVotesResponse**](GetAccountVotesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

