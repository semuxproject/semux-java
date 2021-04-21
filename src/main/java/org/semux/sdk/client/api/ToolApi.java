package org.semux.sdk.client.api;

import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiResponse;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.Pair;

import javax.ws.rs.core.GenericType;

import org.semux.sdk.client.model.ApiHandlerResponse;
import org.semux.sdk.client.model.ComposeRawTransactionResponse;
import org.semux.sdk.client.model.DoTransactionResponse;
import org.semux.sdk.client.model.EstimateGasResponse;
import org.semux.sdk.client.model.LocalCallResponse;
import org.semux.sdk.client.model.LocalCreateResponse;
import org.semux.sdk.client.model.VerifyMessageResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ToolApi {
  private ApiClient apiClient;

  public ToolApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ToolApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Broadcast a raw transaction
   * Broadcasts a signed raw transaction to the network.
   * @param raw Raw transaction encoded in hexadecimal string. (required)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse broadcastRawTransaction(String raw) throws ApiException {
    return broadcastRawTransactionWithHttpInfo(raw).getData();
      }

  /**
   * Broadcast a raw transaction
   * Broadcasts a signed raw transaction to the network.
   * @param raw Raw transaction encoded in hexadecimal string. (required)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> broadcastRawTransactionWithHttpInfo(String raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'raw' is set
    if (raw == null) {
      throw new ApiException(400, "Missing the required parameter 'raw' when calling broadcastRawTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/broadcast-raw-transaction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<DoTransactionResponse> localVarReturnType = new GenericType<DoTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Compose an unsigned raw transaction
   * Compose an unsigned raw transaction then return its hexadecimal encoded string. An unsigned raw transaction can be signed using /sign-raw-transaction API.
   * @param network Network name (required)
   * @param type Transaction type (required)
   * @param to Recipient&#39;s address (required)
   * @param value Amount of value to transfer in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @param timestamp Transaction timestamp in milliseconds. Default to current time. (optional)
   * @param data Hexadecimal encoded transaction data. (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price (optional)
   * @return ComposeRawTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public ComposeRawTransactionResponse composeRawTransaction(String network, String type, String to, String value, String fee, String nonce, String timestamp, String data, String gas, String gasPrice) throws ApiException {
    return composeRawTransactionWithHttpInfo(network, type, to, value, fee, nonce, timestamp, data, gas, gasPrice).getData();
      }

  /**
   * Compose an unsigned raw transaction
   * Compose an unsigned raw transaction then return its hexadecimal encoded string. An unsigned raw transaction can be signed using /sign-raw-transaction API.
   * @param network Network name (required)
   * @param type Transaction type (required)
   * @param to Recipient&#39;s address (required)
   * @param value Amount of value to transfer in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @param timestamp Transaction timestamp in milliseconds. Default to current time. (optional)
   * @param data Hexadecimal encoded transaction data. (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price (optional)
   * @return ApiResponse&lt;ComposeRawTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ComposeRawTransactionResponse> composeRawTransactionWithHttpInfo(String network, String type, String to, String value, String fee, String nonce, String timestamp, String data, String gas, String gasPrice) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'network' is set
    if (network == null) {
      throw new ApiException(400, "Missing the required parameter 'network' when calling composeRawTransaction");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling composeRawTransaction");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling composeRawTransaction");
    }
    
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling composeRawTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/compose-raw-transaction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "network", network));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fee", fee));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data", data));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gas", gas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gasPrice", gasPrice));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ComposeRawTransactionResponse> localVarReturnType = new GenericType<ComposeRawTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Estimate gas usage
   * Estimate the gas usage of a transaction.
   * @param to Recipient&#39;s address (the contract address) (required)
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price in nano SEM (optional)
   * @return EstimateGasResponse
   * @throws ApiException if fails to make API call
   */
  public EstimateGasResponse estimateGas(String to, String value, String data, String gas, String gasPrice) throws ApiException {
    return estimateGasWithHttpInfo(to, value, data, gas, gasPrice).getData();
      }

  /**
   * Estimate gas usage
   * Estimate the gas usage of a transaction.
   * @param to Recipient&#39;s address (the contract address) (required)
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price in nano SEM (optional)
   * @return ApiResponse&lt;EstimateGasResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EstimateGasResponse> estimateGasWithHttpInfo(String to, String value, String data, String gas, String gasPrice) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling estimateGas");
    }
    
    // create path and map variables
    String localVarPath = "/estimate-gas";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data", data));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gas", gas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gasPrice", gasPrice));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<EstimateGasResponse> localVarReturnType = new GenericType<EstimateGasResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Make a local call
   * Executes a new message call immediately without creating a transaction on the block chain.
   * @param to Recipient&#39;s address (the contract address) (required)
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price in nano SEM (optional)
   * @return LocalCallResponse
   * @throws ApiException if fails to make API call
   */
  public LocalCallResponse localCall(String to, String value, String data, String gas, String gasPrice) throws ApiException {
    return localCallWithHttpInfo(to, value, data, gas, gasPrice).getData();
      }

  /**
   * Make a local call
   * Executes a new message call immediately without creating a transaction on the block chain.
   * @param to Recipient&#39;s address (the contract address) (required)
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price in nano SEM (optional)
   * @return ApiResponse&lt;LocalCallResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalCallResponse> localCallWithHttpInfo(String to, String value, String data, String gas, String gasPrice) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling localCall");
    }
    
    // create path and map variables
    String localVarPath = "/local-call";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data", data));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gas", gas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gasPrice", gasPrice));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LocalCallResponse> localVarReturnType = new GenericType<LocalCallResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Make a local create
   * Executes a contract deployment immediately without creating a transaction on the block chain.
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price in nano SEM (optional)
   * @return LocalCreateResponse
   * @throws ApiException if fails to make API call
   */
  public LocalCreateResponse localCreate(String value, String data, String gas, String gasPrice) throws ApiException {
    return localCreateWithHttpInfo(value, data, gas, gasPrice).getData();
      }

  /**
   * Make a local create
   * Executes a contract deployment immediately without creating a transaction on the block chain.
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @param gas The gas limit for the call (optional)
   * @param gasPrice The gas price in nano SEM (optional)
   * @return ApiResponse&lt;LocalCreateResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalCreateResponse> localCreateWithHttpInfo(String value, String data, String gas, String gasPrice) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/local-create";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data", data));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gas", gas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gasPrice", gasPrice));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LocalCreateResponse> localVarReturnType = new GenericType<LocalCreateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify a message
   * Verify a signed message.
   * @param address Address of the message signer (required)
   * @param message Message in UTF-8 string (required)
   * @param signature Signature to verify (required)
   * @return VerifyMessageResponse
   * @throws ApiException if fails to make API call
   */
  public VerifyMessageResponse verifyMessage(String address, String message, String signature) throws ApiException {
    return verifyMessageWithHttpInfo(address, message, signature).getData();
      }

  /**
   * Verify a message
   * Verify a signed message.
   * @param address Address of the message signer (required)
   * @param message Message in UTF-8 string (required)
   * @param signature Signature to verify (required)
   * @return ApiResponse&lt;VerifyMessageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VerifyMessageResponse> verifyMessageWithHttpInfo(String address, String message, String signature) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling verifyMessage");
    }
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling verifyMessage");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling verifyMessage");
    }
    
    // create path and map variables
    String localVarPath = "/verify-message";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message", message));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "signature", signature));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<VerifyMessageResponse> localVarReturnType = new GenericType<VerifyMessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
