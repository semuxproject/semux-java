# ToolApi

All URIs are relative to */v2.5.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcastRawTransaction**](ToolApi.md#broadcastRawTransaction) | **POST** /broadcast-raw-transaction | Broadcast a raw transaction
[**composeRawTransaction**](ToolApi.md#composeRawTransaction) | **GET** /compose-raw-transaction | Compose an unsigned raw transaction
[**estimateGas**](ToolApi.md#estimateGas) | **GET** /estimate-gas | Estimate gas usage
[**localCall**](ToolApi.md#localCall) | **GET** /local-call | Make a local call
[**localCreate**](ToolApi.md#localCreate) | **GET** /local-create | Make a local create
[**verifyMessage**](ToolApi.md#verifyMessage) | **GET** /verify-message | Verify a message

<a name="broadcastRawTransaction"></a>
# **broadcastRawTransaction**
> DoTransactionResponse broadcastRawTransaction(raw)

Broadcast a raw transaction

Broadcasts a signed raw transaction to the network.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.ToolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ToolApi apiInstance = new ToolApi();
String raw = "raw_example"; // String | Raw transaction encoded in hexadecimal string.
try {
    DoTransactionResponse result = apiInstance.broadcastRawTransaction(raw);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolApi#broadcastRawTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **raw** | **String**| Raw transaction encoded in hexadecimal string. |

### Return type

[**DoTransactionResponse**](DoTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="composeRawTransaction"></a>
# **composeRawTransaction**
> ComposeRawTransactionResponse composeRawTransaction(network, type, to, value, fee, nonce, timestamp, data, gas, gasPrice)

Compose an unsigned raw transaction

Compose an unsigned raw transaction then return its hexadecimal encoded string. An unsigned raw transaction can be signed using /sign-raw-transaction API.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.ToolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ToolApi apiInstance = new ToolApi();
String network = "network_example"; // String | Network name
String type = "type_example"; // String | Transaction type
String to = "to_example"; // String | Recipient's address
String value = "value_example"; // String | Amount of value to transfer in nano SEM
String fee = "fee_example"; // String | Transaction fee in nano SEM, default to minimum fee if omitted
String nonce = "nonce_example"; // String | Transaction nonce, default to sender's nonce if omitted
String timestamp = "timestamp_example"; // String | Transaction timestamp in milliseconds. Default to current time.
String data = "data_example"; // String | Hexadecimal encoded transaction data.
String gas = "gas_example"; // String | The gas limit for the call
String gasPrice = "gasPrice_example"; // String | The gas price
try {
    ComposeRawTransactionResponse result = apiInstance.composeRawTransaction(network, type, to, value, fee, nonce, timestamp, data, gas, gasPrice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolApi#composeRawTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Network name | [enum: MAINNET, TESTNET, DEVNET]
 **type** | **String**| Transaction type | [enum: TRANSFER, DELEGATE, VOTE, UNVOTE, CREATE, CALL]
 **to** | **String**| Recipient&#x27;s address |
 **value** | **String**| Amount of value to transfer in nano SEM |
 **fee** | **String**| Transaction fee in nano SEM, default to minimum fee if omitted | [optional]
 **nonce** | **String**| Transaction nonce, default to sender&#x27;s nonce if omitted | [optional]
 **timestamp** | **String**| Transaction timestamp in milliseconds. Default to current time. | [optional]
 **data** | **String**| Hexadecimal encoded transaction data. | [optional]
 **gas** | **String**| The gas limit for the call | [optional]
 **gasPrice** | **String**| The gas price | [optional]

### Return type

[**ComposeRawTransactionResponse**](ComposeRawTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="estimateGas"></a>
# **estimateGas**
> EstimateGasResponse estimateGas(to, value, data, gas, gasPrice)

Estimate gas usage

Estimate the gas usage of a transaction.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.ToolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ToolApi apiInstance = new ToolApi();
String to = "to_example"; // String | Recipient's address (the contract address)
String value = "value_example"; // String | Amount of value to transfer in nano SEM
String data = "data_example"; // String | Transaction data encoded in hexadecimal string
String gas = "gas_example"; // String | The gas limit for the call
String gasPrice = "gasPrice_example"; // String | The gas price in nano SEM
try {
    EstimateGasResponse result = apiInstance.estimateGas(to, value, data, gas, gasPrice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolApi#estimateGas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| Recipient&#x27;s address (the contract address) |
 **value** | **String**| Amount of value to transfer in nano SEM | [optional]
 **data** | **String**| Transaction data encoded in hexadecimal string | [optional]
 **gas** | **String**| The gas limit for the call | [optional]
 **gasPrice** | **String**| The gas price in nano SEM | [optional]

### Return type

[**EstimateGasResponse**](EstimateGasResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="localCall"></a>
# **localCall**
> LocalCallResponse localCall(to, value, data, gas, gasPrice)

Make a local call

Executes a new message call immediately without creating a transaction on the block chain.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.ToolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ToolApi apiInstance = new ToolApi();
String to = "to_example"; // String | Recipient's address (the contract address)
String value = "value_example"; // String | Amount of value to transfer in nano SEM
String data = "data_example"; // String | Transaction data encoded in hexadecimal string
String gas = "gas_example"; // String | The gas limit for the call
String gasPrice = "gasPrice_example"; // String | The gas price in nano SEM
try {
    LocalCallResponse result = apiInstance.localCall(to, value, data, gas, gasPrice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolApi#localCall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| Recipient&#x27;s address (the contract address) |
 **value** | **String**| Amount of value to transfer in nano SEM | [optional]
 **data** | **String**| Transaction data encoded in hexadecimal string | [optional]
 **gas** | **String**| The gas limit for the call | [optional]
 **gasPrice** | **String**| The gas price in nano SEM | [optional]

### Return type

[**LocalCallResponse**](LocalCallResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="localCreate"></a>
# **localCreate**
> LocalCreateResponse localCreate(value, data, gas, gasPrice)

Make a local create

Executes a contract deployment immediately without creating a transaction on the block chain.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.ToolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ToolApi apiInstance = new ToolApi();
String value = "value_example"; // String | Amount of value to transfer in nano SEM
String data = "data_example"; // String | Transaction data encoded in hexadecimal string
String gas = "gas_example"; // String | The gas limit for the call
String gasPrice = "gasPrice_example"; // String | The gas price in nano SEM
try {
    LocalCreateResponse result = apiInstance.localCreate(value, data, gas, gasPrice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolApi#localCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Amount of value to transfer in nano SEM | [optional]
 **data** | **String**| Transaction data encoded in hexadecimal string | [optional]
 **gas** | **String**| The gas limit for the call | [optional]
 **gasPrice** | **String**| The gas price in nano SEM | [optional]

### Return type

[**LocalCreateResponse**](LocalCreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyMessage"></a>
# **verifyMessage**
> VerifyMessageResponse verifyMessage(address, message, signature)

Verify a message

Verify a signed message.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.ToolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ToolApi apiInstance = new ToolApi();
String address = "address_example"; // String | Address of the message signer
String message = "message_example"; // String | Message in UTF-8 string
String signature = "signature_example"; // String | Signature to verify
try {
    VerifyMessageResponse result = apiInstance.verifyMessage(address, message, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolApi#verifyMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address of the message signer |
 **message** | **String**| Message in UTF-8 string |
 **signature** | **String**| Signature to verify |

### Return type

[**VerifyMessageResponse**](VerifyMessageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

