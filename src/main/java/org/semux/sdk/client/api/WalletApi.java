package org.semux.sdk.client.api;

import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiResponse;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.Pair;

import javax.ws.rs.core.GenericType;

import org.semux.sdk.client.model.ApiHandlerResponse;
import org.semux.sdk.client.model.CreateAccountResponse;
import org.semux.sdk.client.model.DeleteAccountResponse;
import org.semux.sdk.client.model.DoTransactionResponse;
import org.semux.sdk.client.model.GetAccountsResponse;
import org.semux.sdk.client.model.SignMessageResponse;
import org.semux.sdk.client.model.SignRawTransactionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WalletApi {
  private ApiClient apiClient;

  public WalletApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WalletApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Call a contract
   * Call a VM contract.
   * @param from Sender&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param to Recipient&#39;s address (the contract address) (required)
   * @param gas The gas limit for the call (required)
   * @param gasPrice The gas price in nano SEM (required)
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse call(String from, String to, String gas, String gasPrice, String value, String nonce, String data) throws ApiException {
    return callWithHttpInfo(from, to, gas, gasPrice, value, nonce, data).getData();
      }

  /**
   * Call a contract
   * Call a VM contract.
   * @param from Sender&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param to Recipient&#39;s address (the contract address) (required)
   * @param gas The gas limit for the call (required)
   * @param gasPrice The gas price in nano SEM (required)
   * @param value Amount of value to transfer in nano SEM (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> callWithHttpInfo(String from, String to, String gas, String gasPrice, String value, String nonce, String data) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling call");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling call");
    }
    
    // verify the required parameter 'gas' is set
    if (gas == null) {
      throw new ApiException(400, "Missing the required parameter 'gas' when calling call");
    }
    
    // verify the required parameter 'gasPrice' is set
    if (gasPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'gasPrice' when calling call");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/call";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));
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

    GenericType<DoTransactionResponse> localVarReturnType = new GenericType<DoTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deploy a contract
   * Create a VM contract.
   * @param from Sender&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param data The contract data encoded in hexadecimal string (required)
   * @param gas The gas limit for the call (required)
   * @param gasPrice The gas price (required)
   * @param value Amount of SEM to transfer in nano SEM (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse create(String from, String data, String gas, String gasPrice, String value, String nonce) throws ApiException {
    return createWithHttpInfo(from, data, gas, gasPrice, value, nonce).getData();
      }

  /**
   * Deploy a contract
   * Create a VM contract.
   * @param from Sender&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param data The contract data encoded in hexadecimal string (required)
   * @param gas The gas limit for the call (required)
   * @param gasPrice The gas price (required)
   * @param value Amount of SEM to transfer in nano SEM (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> createWithHttpInfo(String from, String data, String gas, String gasPrice, String value, String nonce) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling create");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling create");
    }
    
    // verify the required parameter 'gas' is set
    if (gas == null) {
      throw new ApiException(400, "Missing the required parameter 'gas' when calling create");
    }
    
    // verify the required parameter 'gasPrice' is set
    if (gasPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'gasPrice' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/create";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));
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

    GenericType<DoTransactionResponse> localVarReturnType = new GenericType<DoTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create or import an account to wallet
   * Creates a new account by generating a new private key or importing an existing private key when parameter &#39;privateKey&#39; is provided.
   * @param name Assigned alias to the created account. (optional)
   * @param privateKey The private key to be imported, create a new key if omitted (optional)
   * @return CreateAccountResponse
   * @throws ApiException if fails to make API call
   */
  public CreateAccountResponse createAccount(String name, String privateKey) throws ApiException {
    return createAccountWithHttpInfo(name, privateKey).getData();
      }

  /**
   * Create or import an account to wallet
   * Creates a new account by generating a new private key or importing an existing private key when parameter &#39;privateKey&#39; is provided.
   * @param name Assigned alias to the created account. (optional)
   * @param privateKey The private key to be imported, create a new key if omitted (optional)
   * @return ApiResponse&lt;CreateAccountResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAccountResponse> createAccountWithHttpInfo(String name, String privateKey) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/create-account";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "privateKey", privateKey));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<CreateAccountResponse> localVarReturnType = new GenericType<CreateAccountResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Register as delegate
   * Registers as a delegate
   * @param from Registering address (required)
   * @param data Delegate name in hexadecimal encoded UTF-8 string, 16 bytes of data at maximum (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse delegate(String from, String data, String fee, String nonce) throws ApiException {
    return delegateWithHttpInfo(from, data, fee, nonce).getData();
      }

  /**
   * Register as delegate
   * Registers as a delegate
   * @param from Registering address (required)
   * @param data Delegate name in hexadecimal encoded UTF-8 string, 16 bytes of data at maximum (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> delegateWithHttpInfo(String from, String data, String fee, String nonce) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling delegate");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling delegate");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/delegate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fee", fee));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data", data));

    
    
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
   * Delete an account from wallet
   * Deletes an account from this wallet.
   * @param address Address of the account (required)
   * @return DeleteAccountResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteAccountResponse deleteAccount(String address) throws ApiException {
    return deleteAccountWithHttpInfo(address).getData();
      }

  /**
   * Delete an account from wallet
   * Deletes an account from this wallet.
   * @param address Address of the account (required)
   * @return ApiResponse&lt;DeleteAccountResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DeleteAccountResponse> deleteAccountWithHttpInfo(String address) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling deleteAccount");
    }
    
    // create path and map variables
    String localVarPath = "/delete-account";

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

    GenericType<DeleteAccountResponse> localVarReturnType = new GenericType<DeleteAccountResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List all accounts in wallet
   * Returns accounts in the wallet.
   * @return GetAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public GetAccountsResponse getAccounts() throws ApiException {
    return getAccountsWithHttpInfo().getData();
      }

  /**
   * List all accounts in wallet
   * Returns accounts in the wallet.
   * @return ApiResponse&lt;GetAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAccountsResponse> getAccountsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/accounts";

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

    GenericType<GetAccountsResponse> localVarReturnType = new GenericType<GetAccountsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sign a message
   * Sign a message.
   * @param address Signing address. The address must exist in the wallet.data of this Semux node. (required)
   * @param message Message to sign in UTF-8 string (required)
   * @return SignMessageResponse
   * @throws ApiException if fails to make API call
   */
  public SignMessageResponse signMessage(String address, String message) throws ApiException {
    return signMessageWithHttpInfo(address, message).getData();
      }

  /**
   * Sign a message
   * Sign a message.
   * @param address Signing address. The address must exist in the wallet.data of this Semux node. (required)
   * @param message Message to sign in UTF-8 string (required)
   * @return ApiResponse&lt;SignMessageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SignMessageResponse> signMessageWithHttpInfo(String address, String message) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling signMessage");
    }
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling signMessage");
    }
    
    // create path and map variables
    String localVarPath = "/sign-message";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message", message));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<SignMessageResponse> localVarReturnType = new GenericType<SignMessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sign an unsigned raw transaction
   * Sign an unsigned raw transaction then return its hexadecimal encoded string. An unsigned raw transaction can be created using /compose-raw-transaction API.
   * @param raw Unsigned raw transaction encoded in hexadecimal string. (required)
   * @param address Signer&#39;s address. This address must exist in the wallet. (required)
   * @return SignRawTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public SignRawTransactionResponse signRawTransaction(String raw, String address) throws ApiException {
    return signRawTransactionWithHttpInfo(raw, address).getData();
      }

  /**
   * Sign an unsigned raw transaction
   * Sign an unsigned raw transaction then return its hexadecimal encoded string. An unsigned raw transaction can be created using /compose-raw-transaction API.
   * @param raw Unsigned raw transaction encoded in hexadecimal string. (required)
   * @param address Signer&#39;s address. This address must exist in the wallet. (required)
   * @return ApiResponse&lt;SignRawTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SignRawTransactionResponse> signRawTransactionWithHttpInfo(String raw, String address) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'raw' is set
    if (raw == null) {
      throw new ApiException(400, "Missing the required parameter 'raw' when calling signRawTransaction");
    }
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling signRawTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/sign-raw-transaction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));
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

    GenericType<SignRawTransactionResponse> localVarReturnType = new GenericType<SignRawTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Transfer coins
   * Transfers coins to another address.
   * @param from Sender&#39;s address. The account must exist in the wallet of this node. (required)
   * @param to Recipient&#39;s address (required)
   * @param value Amount of value to transfer in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse transfer(String from, String to, String value, String fee, String nonce, String data) throws ApiException {
    return transferWithHttpInfo(from, to, value, fee, nonce, data).getData();
      }

  /**
   * Transfer coins
   * Transfers coins to another address.
   * @param from Sender&#39;s address. The account must exist in the wallet of this node. (required)
   * @param to Recipient&#39;s address (required)
   * @param value Amount of value to transfer in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @param data Transaction data encoded in hexadecimal string (optional)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> transferWithHttpInfo(String from, String to, String value, String fee, String nonce, String data) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling transfer");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling transfer");
    }
    
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling transfer");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/transfer";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fee", fee));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data", data));

    
    
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
   * Unvote for a delegate
   * Unvotes for a delegate.
   * @param from Voter&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param to Delegate address (required)
   * @param value Number of votes in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse unvote(String from, String to, String value, String fee, String nonce) throws ApiException {
    return unvoteWithHttpInfo(from, to, value, fee, nonce).getData();
      }

  /**
   * Unvote for a delegate
   * Unvotes for a delegate.
   * @param from Voter&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param to Delegate address (required)
   * @param value Number of votes in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> unvoteWithHttpInfo(String from, String to, String value, String fee, String nonce) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling unvote");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling unvote");
    }
    
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling unvote");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/unvote";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fee", fee));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));

    
    
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
   * Vote for a delegate
   * Votes for a delegate.
   * @param from Voter&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param to Delegate address (required)
   * @param value Number of votes in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return DoTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public DoTransactionResponse vote(String from, String to, String value, String fee, String nonce) throws ApiException {
    return voteWithHttpInfo(from, to, value, fee, nonce).getData();
      }

  /**
   * Vote for a delegate
   * Votes for a delegate.
   * @param from Voter&#39;s address. The address must exist in the wallet.data of this Semux node. (required)
   * @param to Delegate address (required)
   * @param value Number of votes in nano SEM (required)
   * @param fee Transaction fee in nano SEM, default to minimum fee if omitted (optional)
   * @param nonce Transaction nonce, default to sender&#39;s nonce if omitted (optional)
   * @return ApiResponse&lt;DoTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DoTransactionResponse> voteWithHttpInfo(String from, String to, String value, String fee, String nonce) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling vote");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling vote");
    }
    
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling vote");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/vote";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fee", fee));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nonce", nonce));

    
    
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
}
