# NodeApi

All URIs are relative to */v2.5.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNode**](NodeApi.md#addNode) | **POST** /node | Add a node to connect
[**addToBlacklist**](NodeApi.md#addToBlacklist) | **POST** /blacklist | Add an IP to blacklist
[**addToWhitelist**](NodeApi.md#addToWhitelist) | **POST** /whitelist | Add an IP to whitelist
[**getInfo**](NodeApi.md#getInfo) | **GET** /info | Get node info
[**getPeers**](NodeApi.md#getPeers) | **GET** /peers | Get all peers
[**getPendingTransactions**](NodeApi.md#getPendingTransactions) | **GET** /pending-transactions | Get pending transactions
[**getSyncingStatus**](NodeApi.md#getSyncingStatus) | **GET** /syncing | Get syncing status

<a name="addNode"></a>
# **addNode**
> AddNodeResponse addNode(node)

Add a node to connect

Adds a node to node manager.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
String node = "node_example"; // String | Address of the node in host:port format
try {
    AddNodeResponse result = apiInstance.addNode(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#addNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| Address of the node in host:port format |

### Return type

[**AddNodeResponse**](AddNodeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addToBlacklist"></a>
# **addToBlacklist**
> AddToBlacklistResponse addToBlacklist(ip)

Add an IP to blacklist

Adds an IP address to blacklist.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
String ip = "ip_example"; // String | IP address
try {
    AddToBlacklistResponse result = apiInstance.addToBlacklist(ip);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#addToBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| IP address |

### Return type

[**AddToBlacklistResponse**](AddToBlacklistResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addToWhitelist"></a>
# **addToWhitelist**
> AddToWhitelistResponse addToWhitelist(ip)

Add an IP to whitelist

Adds an IP address to whitelist.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
String ip = "ip_example"; // String | IP address
try {
    AddToWhitelistResponse result = apiInstance.addToWhitelist(ip);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#addToWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| IP address |

### Return type

[**AddToWhitelistResponse**](AddToWhitelistResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInfo"></a>
# **getInfo**
> GetInfoResponse getInfo()

Get node info

Returns kernel info.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
try {
    GetInfoResponse result = apiInstance.getInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInfoResponse**](GetInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeers"></a>
# **getPeers**
> GetPeersResponse getPeers()

Get all peers

Returns all connected peers.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
try {
    GetPeersResponse result = apiInstance.getPeers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getPeers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPeersResponse**](GetPeersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPendingTransactions"></a>
# **getPendingTransactions**
> GetPendingTransactionsResponse getPendingTransactions()

Get pending transactions

Returns all the pending transactions.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
try {
    GetPendingTransactionsResponse result = apiInstance.getPendingTransactions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getPendingTransactions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPendingTransactionsResponse**](GetPendingTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSyncingStatus"></a>
# **getSyncingStatus**
> GetSyncingStatusResponse getSyncingStatus()

Get syncing status

Returns an object with data about the sync status

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NodeApi apiInstance = new NodeApi();
try {
    GetSyncingStatusResponse result = apiInstance.getSyncingStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getSyncingStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSyncingStatusResponse**](GetSyncingStatusResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

