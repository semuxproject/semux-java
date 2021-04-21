# DelegateApi

All URIs are relative to *http://localhost/v2.5.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDelegate**](DelegateApi.md#getDelegate) | **GET** /delegate | Get delegate info
[**getDelegates**](DelegateApi.md#getDelegates) | **GET** /delegates | Get all delegates
[**getValidators**](DelegateApi.md#getValidators) | **GET** /validators | Get all validators
[**getVote**](DelegateApi.md#getVote) | **GET** /vote | Get the vote between a delegate and a voter
[**getVotes**](DelegateApi.md#getVotes) | **GET** /votes | Get all votes of a delegate


<a name="getDelegate"></a>
# **getDelegate**
> GetDelegateResponse getDelegate(address)

Get delegate info

Returns the information about delegate.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.DelegateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DelegateApi apiInstance = new DelegateApi();
String address = "address_example"; // String | Delegate address
try {
    GetDelegateResponse result = apiInstance.getDelegate(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegateApi#getDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Delegate address |

### Return type

[**GetDelegateResponse**](GetDelegateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getDelegates"></a>
# **getDelegates**
> GetDelegatesResponse getDelegates()

Get all delegates

Returns a list of delegates.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.DelegateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DelegateApi apiInstance = new DelegateApi();
try {
    GetDelegatesResponse result = apiInstance.getDelegates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegateApi#getDelegates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDelegatesResponse**](GetDelegatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getValidators"></a>
# **getValidators**
> GetValidatorsResponse getValidators()

Get all validators

Returns a list of validators in Semux addresses.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.DelegateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DelegateApi apiInstance = new DelegateApi();
try {
    GetValidatorsResponse result = apiInstance.getValidators();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegateApi#getValidators");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetValidatorsResponse**](GetValidatorsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getVote"></a>
# **getVote**
> GetVoteResponse getVote(delegate, voter)

Get the vote between a delegate and a voter

Returns the vote from a voter to a delegate.

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.DelegateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DelegateApi apiInstance = new DelegateApi();
String delegate = "delegate_example"; // String | Delegate address
String voter = "voter_example"; // String | Voter address
try {
    GetVoteResponse result = apiInstance.getVote(delegate, voter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegateApi#getVote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegate** | **String**| Delegate address |
 **voter** | **String**| Voter address |

### Return type

[**GetVoteResponse**](GetVoteResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getVotes"></a>
# **getVotes**
> GetVotesResponse getVotes(delegate)

Get all votes of a delegate

Returns all the votes to a delegate as a map of [voter address] &#x3D;&gt; [votes]

### Example
```java
// Import classes:
//import org.semux.sdk.client.ApiClient;
//import org.semux.sdk.client.ApiException;
//import org.semux.sdk.client.Configuration;
//import org.semux.sdk.client.auth.*;
//import org.semux.sdk.client.api.DelegateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DelegateApi apiInstance = new DelegateApi();
String delegate = "delegate_example"; // String | Delegate address
try {
    GetVotesResponse result = apiInstance.getVotes(delegate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegateApi#getVotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegate** | **String**| Delegate address |

### Return type

[**GetVotesResponse**](GetVotesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

