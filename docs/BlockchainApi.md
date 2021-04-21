# BlockchainApi

All URIs are relative to *http://localhost/v2.5.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockByHash**](BlockchainApi.md#getBlockByHash) | **GET** /block-by-hash | Get block by hash
[**getBlockByNumber**](BlockchainApi.md#getBlockByNumber) | **GET** /block-by-number | Get block by number
[**getLatestBlock**](BlockchainApi.md#getLatestBlock) | **GET** /latest-block | Get the latest block
[**getLatestBlockNumber**](BlockchainApi.md#getLatestBlockNumber) | **GET** /latest-block-number | Get the number of the latest block
[**getTransaction**](BlockchainApi.md#getTransaction) | **GET** /transaction | Get transaction
[**getTransactionLimits**](BlockchainApi.md#getTransactionLimits) | **GET** /transaction-limits | Get transaction limits
[**getTransactionResult**](BlockchainApi.md#getTransactionResult) | **GET** /transaction-result | Get transaction result


<a name="getBlockByHash"></a>
# **getBlockByHash**
> GetBlockResponse getBlockByHash(hash)

Get block by hash

Returns a block by block hash.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
String hash = "hash_example"; // String | Hash of block
try {
    GetBlockResponse result = apiInstance.getBlockByHash(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getBlockByHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Hash of block |

### Return type

[**GetBlockResponse**](GetBlockResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getBlockByNumber"></a>
# **getBlockByNumber**
> GetBlockResponse getBlockByNumber(number)

Get block by number

Returns a block by block number.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
String number = "number_example"; // String | Number of block
try {
    GetBlockResponse result = apiInstance.getBlockByNumber(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getBlockByNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| Number of block |

### Return type

[**GetBlockResponse**](GetBlockResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getLatestBlock"></a>
# **getLatestBlock**
> GetLatestBlockResponse getLatestBlock()

Get the latest block

Returns the latest block.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
try {
    GetLatestBlockResponse result = apiInstance.getLatestBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getLatestBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetLatestBlockResponse**](GetLatestBlockResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getLatestBlockNumber"></a>
# **getLatestBlockNumber**
> GetLatestBlockNumberResponse getLatestBlockNumber()

Get the number of the latest block

Returns the number of the latest block.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
try {
    GetLatestBlockNumberResponse result = apiInstance.getLatestBlockNumber();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getLatestBlockNumber");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetLatestBlockNumberResponse**](GetLatestBlockNumberResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getTransaction"></a>
# **getTransaction**
> GetTransactionResponse getTransaction(hash)

Get transaction

Returns a transactions if exists.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
String hash = "hash_example"; // String | Transaction hash
try {
    GetTransactionResponse result = apiInstance.getTransaction(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Transaction hash |

### Return type

[**GetTransactionResponse**](GetTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getTransactionLimits"></a>
# **getTransactionLimits**
> GetTransactionLimitsResponse getTransactionLimits(type)

Get transaction limits

Returns transaction limitations including minimum transaction fee and maximum transaction size.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
String type = "type_example"; // String | Type of transaction
try {
    GetTransactionLimitsResponse result = apiInstance.getTransactionLimits(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getTransactionLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Type of transaction | [enum: COINBASE, TRANSFER, DELEGATE, VOTE, UNVOTE, CREATE, CALL]

### Return type

[**GetTransactionLimitsResponse**](GetTransactionLimitsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getTransactionResult"></a>
# **getTransactionResult**
> GetTransactionResultResponse getTransactionResult(hash)

Get transaction result

Returns the result of the requested transaction.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.BlockchainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlockchainApi apiInstance = new BlockchainApi();
String hash = "hash_example"; // String | Transaction hash
try {
    GetTransactionResultResponse result = apiInstance.getTransactionResult(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainApi#getTransactionResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Transaction hash |

### Return type

[**GetTransactionResultResponse**](GetTransactionResultResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

