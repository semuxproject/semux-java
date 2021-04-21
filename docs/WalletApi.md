# WalletApi

All URIs are relative to *http://localhost/v2.5.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call**](WalletApi.md#call) | **POST** /transaction/call | Call a contract
[**create**](WalletApi.md#create) | **POST** /transaction/create | Deploy a contract
[**createAccount**](WalletApi.md#createAccount) | **POST** /create-account | Create or import an account to wallet
[**delegate**](WalletApi.md#delegate) | **POST** /transaction/delegate | Register as delegate
[**deleteAccount**](WalletApi.md#deleteAccount) | **POST** /delete-account | Delete an account from wallet
[**getAccounts**](WalletApi.md#getAccounts) | **GET** /accounts | List all accounts in wallet
[**signMessage**](WalletApi.md#signMessage) | **POST** /sign-message | Sign a message
[**signRawTransaction**](WalletApi.md#signRawTransaction) | **POST** /sign-raw-transaction | Sign an unsigned raw transaction
[**transfer**](WalletApi.md#transfer) | **POST** /transaction/transfer | Transfer coins
[**unvote**](WalletApi.md#unvote) | **POST** /transaction/unvote | Unvote for a delegate
[**vote**](WalletApi.md#vote) | **POST** /transaction/vote | Vote for a delegate


<a name="call"></a>
# **call**
> DoTransactionResponse call(from, to, gas, gasPrice, value, nonce, data)

Call a contract

Call a VM contract.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String from = "from_example"; // String | Sender's address. The address must exist in the wallet.data of this Semux node.
String to = "to_example"; // String | Recipient's address (the contract address)
String gas = "gas_example"; // String | The gas limit for the call
String gasPrice = "gasPrice_example"; // String | The gas price in nano SEM
String value = "value_example"; // String | Amount of value to transfer in nano SEM
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
String data = "data_example"; // String | Transaction data encoded in hexadecimal string
try {
    DoTransactionResponse result = apiInstance.call(from, to, gas, gasPrice, value, nonce, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#call");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Sender&#39;s address. The address must exist in the wallet.data of this Semux node. |
 **to** | **String**| Recipient&#39;s address (the contract address) |
 **gas** | **String**| The gas limit for the call |
 **gasPrice** | **String**| The gas price in nano SEM |
 **value** | **String**| Amount of value to transfer in nano SEM | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#39;s nonce if omitted | [optional]
 **data** | **String**| Transaction data encoded in hexadecimal string | [optional]

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="create"></a>
# **create**
> DoTransactionResponse create(from, data, gas, gasPrice, value, nonce)

Deploy a contract

Create a VM contract.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String from = "from_example"; // String | Sender's address. The address must exist in the wallet.data of this Semux node.
String data = "data_example"; // String | The contract data encoded in hexadecimal string
String gas = "gas_example"; // String | The gas limit for the call
String gasPrice = "gasPrice_example"; // String | The gas price
String value = "value_example"; // String | Amount of SEM to transfer in nano SEM
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
try {
    DoTransactionResponse result = apiInstance.create(from, data, gas, gasPrice, value, nonce);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Sender&#39;s address. The address must exist in the wallet.data of this Semux node. |
 **data** | **String**| The contract data encoded in hexadecimal string |
 **gas** | **String**| The gas limit for the call |
 **gasPrice** | **String**| The gas price |
 **value** | **String**| Amount of SEM to transfer in nano SEM | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#39;s nonce if omitted | [optional]

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createAccount"></a>
# **createAccount**
> CreateAccountResponse createAccount(name, privateKey)

Create or import an account to wallet

Creates a new account by generating a new private key or importing an existing private key when parameter &#39;privateKey&#39; is provided.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String name = "name_example"; // String | Assigned alias to the created account.
String privateKey = "privateKey_example"; // String | The private key to be imported, create a new key if omitted
try {
    CreateAccountResponse result = apiInstance.createAccount(name, privateKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Assigned alias to the created account. | [optional]
 **privateKey** | **String**| The private key to be imported, create a new key if omitted | [optional]

### Return type

[**CreateAccountResponse**](CreateAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="delegate"></a>
# **delegate**
> DoTransactionResponse delegate(from, data, fee, nonce)

Register as delegate

Registers as a delegate

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String from = "from_example"; // String | Registering address
String data = "data_example"; // String | Delegate name in hexadecimal encoded UTF-8 string, 16 bytes of data at maximum
String fee = "fee_example"; // String | Transaction fee in nano SEM, default to minimum fee if omitted
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
try {
    DoTransactionResponse result = apiInstance.delegate(from, data, fee, nonce);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#delegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Registering address |
 **data** | **String**| Delegate name in hexadecimal encoded UTF-8 string, 16 bytes of data at maximum |
 **fee** | **String**| Transaction fee in nano SEM, default to minimum fee if omitted | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#39;s nonce if omitted | [optional]

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteAccount"></a>
# **deleteAccount**
> DeleteAccountResponse deleteAccount(address)

Delete an account from wallet

Deletes an account from this wallet.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String address = "address_example"; // String | Address of the account
try {
    DeleteAccountResponse result = apiInstance.deleteAccount(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#deleteAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of the account |

### Return type

[**DeleteAccountResponse**](DeleteAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> GetAccountsResponse getAccounts()

List all accounts in wallet

Returns accounts in the wallet.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
try {
    GetAccountsResponse result = apiInstance.getAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountsResponse**](GetAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="signMessage"></a>
# **signMessage**
> SignMessageResponse signMessage(address, message)

Sign a message

Sign a message.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String address = "address_example"; // String | Signing address. The address must exist in the wallet.data of this Semux node.
String message = "message_example"; // String | Message to sign in UTF-8 string
try {
    SignMessageResponse result = apiInstance.signMessage(address, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#signMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Signing address. The address must exist in the wallet.data of this Semux node. |
 **message** | **String**| Message to sign in UTF-8 string |

### Return type

[**SignMessageResponse**](SignMessageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="signRawTransaction"></a>
# **signRawTransaction**
> SignRawTransactionResponse signRawTransaction(raw, address)

Sign an unsigned raw transaction

Sign an unsigned raw transaction then return its hexadecimal encoded string. An unsigned raw transaction can be created using /compose-raw-transaction API.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String raw = "raw_example"; // String | Unsigned raw transaction encoded in hexadecimal string.
String address = "address_example"; // String | Signer's address. This address must exist in the wallet.
try {
    SignRawTransactionResponse result = apiInstance.signRawTransaction(raw, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#signRawTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **raw** | **String**| Unsigned raw transaction encoded in hexadecimal string. |
 **address** | **String**| Signer&#39;s address. This address must exist in the wallet. |

### Return type

[**SignRawTransactionResponse**](SignRawTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transfer"></a>
# **transfer**
> DoTransactionResponse transfer(from, to, value, fee, nonce, data)

Transfer coins

Transfers coins to another address.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String from = "from_example"; // String | Sender's address. The account must exist in the wallet of this node.
String to = "to_example"; // String | Recipient's address
String value = "value_example"; // String | Amount of value to transfer in nano SEM
String fee = "fee_example"; // String | Transaction fee in nano SEM, default to minimum fee if omitted
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
String data = "data_example"; // String | Transaction data encoded in hexadecimal string
try {
    DoTransactionResponse result = apiInstance.transfer(from, to, value, fee, nonce, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#transfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Sender&#39;s address. The account must exist in the wallet of this node. |
 **to** | **String**| Recipient&#39;s address |
 **value** | **String**| Amount of value to transfer in nano SEM |
 **fee** | **String**| Transaction fee in nano SEM, default to minimum fee if omitted | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#39;s nonce if omitted | [optional]
 **data** | **String**| Transaction data encoded in hexadecimal string | [optional]

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unvote"></a>
# **unvote**
> DoTransactionResponse unvote(from, to, value, fee, nonce)

Unvote for a delegate

Unvotes for a delegate.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String from = "from_example"; // String | Voter's address. The address must exist in the wallet.data of this Semux node.
String to = "to_example"; // String | Delegate address
String value = "value_example"; // String | Number of votes in nano SEM
String fee = "fee_example"; // String | Transaction fee in nano SEM, default to minimum fee if omitted
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
try {
    DoTransactionResponse result = apiInstance.unvote(from, to, value, fee, nonce);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#unvote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Voter&#39;s address. The address must exist in the wallet.data of this Semux node. |
 **to** | **String**| Delegate address |
 **value** | **String**| Number of votes in nano SEM |
 **fee** | **String**| Transaction fee in nano SEM, default to minimum fee if omitted | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#39;s nonce if omitted | [optional]

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="vote"></a>
# **vote**
> DoTransactionResponse vote(from, to, value, fee, nonce)

Vote for a delegate

Votes for a delegate.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WalletApi apiInstance = new WalletApi();
String from = "from_example"; // String | Voter's address. The address must exist in the wallet.data of this Semux node.
String to = "to_example"; // String | Delegate address
String value = "value_example"; // String | Number of votes in nano SEM
String fee = "fee_example"; // String | Transaction fee in nano SEM, default to minimum fee if omitted
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
try {
    DoTransactionResponse result = apiInstance.vote(from, to, value, fee, nonce);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#vote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Voter&#39;s address. The address must exist in the wallet.data of this Semux node. |
 **to** | **String**| Delegate address |
 **value** | **String**| Number of votes in nano SEM |
 **fee** | **String**| Transaction fee in nano SEM, default to minimum fee if omitted | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#39;s nonce if omitted | [optional]

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

