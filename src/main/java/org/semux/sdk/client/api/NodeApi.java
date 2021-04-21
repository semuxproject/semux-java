package org.semux.sdk.client.api;

import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiResponse;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.Pair;

import javax.ws.rs.core.GenericType;

import org.semux.sdk.client.model.AddNodeResponse;
import org.semux.sdk.client.model.ApiHandlerResponse;
import org.semux.sdk.client.model.GetInfoResponse;
import org.semux.sdk.client.model.GetPeersResponse;
import org.semux.sdk.client.model.GetPendingTransactionsResponse;
import org.semux.sdk.client.model.GetSyncingStatusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class NodeApi {
  private ApiClient apiClient;

  public NodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a node to connect
   * Adds a node to node manager.
   * @param node Address of the node in host:port format (required)
   * @return AddNodeResponse
   * @throws ApiException if fails to make API call
   */
  public AddNodeResponse addNode(String node) throws ApiException {
    return addNodeWithHttpInfo(node).getData();
      }

  /**
   * Add a node to connect
   * Adds a node to node manager.
   * @param node Address of the node in host:port format (required)
   * @return ApiResponse&lt;AddNodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AddNodeResponse> addNodeWithHttpInfo(String node) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling addNode");
    }
    
    // create path and map variables
    String localVarPath = "/node";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "node", node));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AddNodeResponse> localVarReturnType = new GenericType<AddNodeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add an IP to blacklist
   * Adds an IP address to blacklist.
   * @param ip IP address (required)
   * @return ApiHandlerResponse
   * @throws ApiException if fails to make API call
   */
  public ApiHandlerResponse addToBlacklist(String ip) throws ApiException {
    return addToBlacklistWithHttpInfo(ip).getData();
      }

  /**
   * Add an IP to blacklist
   * Adds an IP address to blacklist.
   * @param ip IP address (required)
   * @return ApiResponse&lt;ApiHandlerResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiHandlerResponse> addToBlacklistWithHttpInfo(String ip) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ip' is set
    if (ip == null) {
      throw new ApiException(400, "Missing the required parameter 'ip' when calling addToBlacklist");
    }
    
    // create path and map variables
    String localVarPath = "/blacklist";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ip", ip));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiHandlerResponse> localVarReturnType = new GenericType<ApiHandlerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add an IP to whitelist
   * Adds an IP address to whitelist.
   * @param ip IP address (required)
   * @return ApiHandlerResponse
   * @throws ApiException if fails to make API call
   */
  public ApiHandlerResponse addToWhitelist(String ip) throws ApiException {
    return addToWhitelistWithHttpInfo(ip).getData();
      }

  /**
   * Add an IP to whitelist
   * Adds an IP address to whitelist.
   * @param ip IP address (required)
   * @return ApiResponse&lt;ApiHandlerResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiHandlerResponse> addToWhitelistWithHttpInfo(String ip) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ip' is set
    if (ip == null) {
      throw new ApiException(400, "Missing the required parameter 'ip' when calling addToWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/whitelist";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ip", ip));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiHandlerResponse> localVarReturnType = new GenericType<ApiHandlerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get node info
   * Returns kernel info.
   * @return GetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public GetInfoResponse getInfo() throws ApiException {
    return getInfoWithHttpInfo().getData();
      }

  /**
   * Get node info
   * Returns kernel info.
   * @return ApiResponse&lt;GetInfoResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInfoResponse> getInfoWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/info";

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

    GenericType<GetInfoResponse> localVarReturnType = new GenericType<GetInfoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all peers
   * Returns all connected peers.
   * @return GetPeersResponse
   * @throws ApiException if fails to make API call
   */
  public GetPeersResponse getPeers() throws ApiException {
    return getPeersWithHttpInfo().getData();
      }

  /**
   * Get all peers
   * Returns all connected peers.
   * @return ApiResponse&lt;GetPeersResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPeersResponse> getPeersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/peers";

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

    GenericType<GetPeersResponse> localVarReturnType = new GenericType<GetPeersResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get pending transactions
   * Returns all the pending transactions.
   * @return GetPendingTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public GetPendingTransactionsResponse getPendingTransactions() throws ApiException {
    return getPendingTransactionsWithHttpInfo().getData();
      }

  /**
   * Get pending transactions
   * Returns all the pending transactions.
   * @return ApiResponse&lt;GetPendingTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPendingTransactionsResponse> getPendingTransactionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/pending-transactions";

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

    GenericType<GetPendingTransactionsResponse> localVarReturnType = new GenericType<GetPendingTransactionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get syncing status
   * Returns an object with data about the sync status
   * @return GetSyncingStatusResponse
   * @throws ApiException if fails to make API call
   */
  public GetSyncingStatusResponse getSyncingStatus() throws ApiException {
    return getSyncingStatusWithHttpInfo().getData();
      }

  /**
   * Get syncing status
   * Returns an object with data about the sync status
   * @return ApiResponse&lt;GetSyncingStatusResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSyncingStatusResponse> getSyncingStatusWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/syncing";

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

    GenericType<GetSyncingStatusResponse> localVarReturnType = new GenericType<GetSyncingStatusResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
