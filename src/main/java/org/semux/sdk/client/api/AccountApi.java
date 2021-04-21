package org.semux.sdk.client.api;

import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiResponse;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.Pair;

import javax.ws.rs.core.GenericType;

import org.semux.sdk.client.model.ApiHandlerResponse;
import org.semux.sdk.client.model.GetAccountCodeResponse;
import org.semux.sdk.client.model.GetAccountInternalTransactionsResponse;
import org.semux.sdk.client.model.GetAccountPendingTransactionsResponse;
import org.semux.sdk.client.model.GetAccountResponse;
import org.semux.sdk.client.model.GetAccountStorageResponse;
import org.semux.sdk.client.model.GetAccountTransactionsResponse;
import org.semux.sdk.client.model.GetAccountVotesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AccountApi {
  private ApiClient apiClient;

  public AccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get account info
   * Returns the basic information about an account.
   * @param address Address of account (required)
   * @return GetAccountResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountResponse getAccount(String address) throws ApiException {
    return getAccountWithHttpInfo(address).getData();
      }

  /**
   * Get account info
   * Returns the basic information about an account.
   * @param address Address of account (required)
   * @return ApiResponse&lt;GetAccountResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountResponse> getAccountWithHttpInfo(String address) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccount");
    }
    
    // create path and map variables
    String localVarPath = "/account";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountResponse> localVarReturnType = new GenericType<GetAccountResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account code
   * Returns the code of an account.
   * @param address Address of account (required)
   * @return GetAccountCodeResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountCodeResponse getAccountCode(String address) throws ApiException {
    return getAccountCodeWithHttpInfo(address).getData();
      }

  /**
   * Get account code
   * Returns the code of an account.
   * @param address Address of account (required)
   * @return ApiResponse&lt;GetAccountCodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountCodeResponse> getAccountCodeWithHttpInfo(String address) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccountCode");
    }
    
    // create path and map variables
    String localVarPath = "/account/code";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountCodeResponse> localVarReturnType = new GenericType<GetAccountCodeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account internal transactions
   * Returns internal transactions from/to an account.
   * @param address Address of account (required)
   * @param from Starting range of transactions (required)
   * @param to Ending range of transactions (required)
   * @return GetAccountInternalTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountInternalTransactionsResponse getAccountInternalTransactions(String address, String from, String to) throws ApiException {
    return getAccountInternalTransactionsWithHttpInfo(address, from, to).getData();
      }

  /**
   * Get account internal transactions
   * Returns internal transactions from/to an account.
   * @param address Address of account (required)
   * @param from Starting range of transactions (required)
   * @param to Ending range of transactions (required)
   * @return ApiResponse&lt;GetAccountInternalTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountInternalTransactionsResponse> getAccountInternalTransactionsWithHttpInfo(String address, String from, String to) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccountInternalTransactions");
    }
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling getAccountInternalTransactions");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling getAccountInternalTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/account/internal-transactions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountInternalTransactionsResponse> localVarReturnType = new GenericType<GetAccountInternalTransactionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get pending transactions of the account
   * Returns pending transactions from/to an account.
   * @param address Address of account (required)
   * @param from Starting range of transactions (required)
   * @param to Ending range of transactions (required)
   * @return GetAccountPendingTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountPendingTransactionsResponse getAccountPendingTransactions(String address, String from, String to) throws ApiException {
    return getAccountPendingTransactionsWithHttpInfo(address, from, to).getData();
      }

  /**
   * Get pending transactions of the account
   * Returns pending transactions from/to an account.
   * @param address Address of account (required)
   * @param from Starting range of transactions (required)
   * @param to Ending range of transactions (required)
   * @return ApiResponse&lt;GetAccountPendingTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountPendingTransactionsResponse> getAccountPendingTransactionsWithHttpInfo(String address, String from, String to) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccountPendingTransactions");
    }
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling getAccountPendingTransactions");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling getAccountPendingTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/account/pending-transactions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountPendingTransactionsResponse> localVarReturnType = new GenericType<GetAccountPendingTransactionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account storage
   * Returns the storage value mapped to the given key of an account.
   * @param address Address of account (required)
   * @param key The storage key (required)
   * @return GetAccountStorageResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountStorageResponse getAccountStorage(String address, String key) throws ApiException {
    return getAccountStorageWithHttpInfo(address, key).getData();
      }

  /**
   * Get account storage
   * Returns the storage value mapped to the given key of an account.
   * @param address Address of account (required)
   * @param key The storage key (required)
   * @return ApiResponse&lt;GetAccountStorageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountStorageResponse> getAccountStorageWithHttpInfo(String address, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccountStorage");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getAccountStorage");
    }
    
    // create path and map variables
    String localVarPath = "/account/storage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountStorageResponse> localVarReturnType = new GenericType<GetAccountStorageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account transactions
   * Returns transactions from/to an account.
   * @param address Address of account (required)
   * @param from Starting range of transactions (required)
   * @param to Ending range of transactions (required)
   * @return GetAccountTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountTransactionsResponse getAccountTransactions(String address, String from, String to) throws ApiException {
    return getAccountTransactionsWithHttpInfo(address, from, to).getData();
      }

  /**
   * Get account transactions
   * Returns transactions from/to an account.
   * @param address Address of account (required)
   * @param from Starting range of transactions (required)
   * @param to Ending range of transactions (required)
   * @return ApiResponse&lt;GetAccountTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountTransactionsResponse> getAccountTransactionsWithHttpInfo(String address, String from, String to) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccountTransactions");
    }
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling getAccountTransactions");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling getAccountTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/account/transactions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountTransactionsResponse> localVarReturnType = new GenericType<GetAccountTransactionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account votes
   * Returns votes from the account.
   * @param address Address of account (required)
   * @return GetAccountVotesResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountVotesResponse getAccountVotes(String address) throws ApiException {
    return getAccountVotesWithHttpInfo(address).getData();
      }

  /**
   * Get account votes
   * Returns votes from the account.
   * @param address Address of account (required)
   * @return ApiResponse&lt;GetAccountVotesResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountVotesResponse> getAccountVotesWithHttpInfo(String address) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getAccountVotes");
    }
    
    // create path and map variables
    String localVarPath = "/account/votes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetAccountVotesResponse> localVarReturnType = new GenericType<GetAccountVotesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
