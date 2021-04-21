package org.semux.sdk.client.api;

import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiResponse;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.Pair;

import javax.ws.rs.core.GenericType;

import org.semux.sdk.client.model.ApiHandlerResponse;
import org.semux.sdk.client.model.GetBlockResponse;
import org.semux.sdk.client.model.GetLatestBlockNumberResponse;
import org.semux.sdk.client.model.GetLatestBlockResponse;
import org.semux.sdk.client.model.GetTransactionLimitsResponse;
import org.semux.sdk.client.model.GetTransactionResponse;
import org.semux.sdk.client.model.GetTransactionResultResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BlockchainApi {
  private ApiClient apiClient;

  public BlockchainApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BlockchainApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get block by hash
   * Returns a block by block hash.
   * @param hash Hash of block (required)
   * @return GetBlockResponse
   * @throws ApiException if fails to make API call
   */
  public GetBlockResponse getBlockByHash(String hash) throws ApiException {
    return getBlockByHashWithHttpInfo(hash).getData();
      }

  /**
   * Get block by hash
   * Returns a block by block hash.
   * @param hash Hash of block (required)
   * @return ApiResponse&lt;GetBlockResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBlockResponse> getBlockByHashWithHttpInfo(String hash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hash' is set
    if (hash == null) {
      throw new ApiException(400, "Missing the required parameter 'hash' when calling getBlockByHash");
    }
    
    // create path and map variables
    String localVarPath = "/block-by-hash";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hash", hash));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetBlockResponse> localVarReturnType = new GenericType<GetBlockResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get block by number
   * Returns a block by block number.
   * @param number Number of block (required)
   * @return GetBlockResponse
   * @throws ApiException if fails to make API call
   */
  public GetBlockResponse getBlockByNumber(String number) throws ApiException {
    return getBlockByNumberWithHttpInfo(number).getData();
      }

  /**
   * Get block by number
   * Returns a block by block number.
   * @param number Number of block (required)
   * @return ApiResponse&lt;GetBlockResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBlockResponse> getBlockByNumberWithHttpInfo(String number) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'number' is set
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling getBlockByNumber");
    }
    
    // create path and map variables
    String localVarPath = "/block-by-number";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number", number));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetBlockResponse> localVarReturnType = new GenericType<GetBlockResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the latest block
   * Returns the latest block.
   * @return GetLatestBlockResponse
   * @throws ApiException if fails to make API call
   */
  public GetLatestBlockResponse getLatestBlock() throws ApiException {
    return getLatestBlockWithHttpInfo().getData();
      }

  /**
   * Get the latest block
   * Returns the latest block.
   * @return ApiResponse&lt;GetLatestBlockResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLatestBlockResponse> getLatestBlockWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/latest-block";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetLatestBlockResponse> localVarReturnType = new GenericType<GetLatestBlockResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the number of the latest block
   * Returns the number of the latest block.
   * @return GetLatestBlockNumberResponse
   * @throws ApiException if fails to make API call
   */
  public GetLatestBlockNumberResponse getLatestBlockNumber() throws ApiException {
    return getLatestBlockNumberWithHttpInfo().getData();
      }

  /**
   * Get the number of the latest block
   * Returns the number of the latest block.
   * @return ApiResponse&lt;GetLatestBlockNumberResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLatestBlockNumberResponse> getLatestBlockNumberWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/latest-block-number";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetLatestBlockNumberResponse> localVarReturnType = new GenericType<GetLatestBlockNumberResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get transaction
   * Returns a transactions if exists.
   * @param hash Transaction hash (required)
   * @return GetTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public GetTransactionResponse getTransaction(String hash) throws ApiException {
    return getTransactionWithHttpInfo(hash).getData();
      }

  /**
   * Get transaction
   * Returns a transactions if exists.
   * @param hash Transaction hash (required)
   * @return ApiResponse&lt;GetTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTransactionResponse> getTransactionWithHttpInfo(String hash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hash' is set
    if (hash == null) {
      throw new ApiException(400, "Missing the required parameter 'hash' when calling getTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/transaction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hash", hash));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetTransactionResponse> localVarReturnType = new GenericType<GetTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get transaction limits
   * Returns transaction limitations including minimum transaction fee and maximum transaction size.
   * @param type Type of transaction (required)
   * @return GetTransactionLimitsResponse
   * @throws ApiException if fails to make API call
   */
  public GetTransactionLimitsResponse getTransactionLimits(String type) throws ApiException {
    return getTransactionLimitsWithHttpInfo(type).getData();
      }

  /**
   * Get transaction limits
   * Returns transaction limitations including minimum transaction fee and maximum transaction size.
   * @param type Type of transaction (required)
   * @return ApiResponse&lt;GetTransactionLimitsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTransactionLimitsResponse> getTransactionLimitsWithHttpInfo(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getTransactionLimits");
    }
    
    // create path and map variables
    String localVarPath = "/transaction-limits";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetTransactionLimitsResponse> localVarReturnType = new GenericType<GetTransactionLimitsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get transaction result
   * Returns the result of the requested transaction.
   * @param hash Transaction hash (required)
   * @return GetTransactionResultResponse
   * @throws ApiException if fails to make API call
   */
  public GetTransactionResultResponse getTransactionResult(String hash) throws ApiException {
    return getTransactionResultWithHttpInfo(hash).getData();
      }

  /**
   * Get transaction result
   * Returns the result of the requested transaction.
   * @param hash Transaction hash (required)
   * @return ApiResponse&lt;GetTransactionResultResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTransactionResultResponse> getTransactionResultWithHttpInfo(String hash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hash' is set
    if (hash == null) {
      throw new ApiException(400, "Missing the required parameter 'hash' when calling getTransactionResult");
    }
    
    // create path and map variables
    String localVarPath = "/transaction-result";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hash", hash));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetTransactionResultResponse> localVarReturnType = new GenericType<GetTransactionResultResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
