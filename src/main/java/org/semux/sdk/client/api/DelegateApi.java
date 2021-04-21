package org.semux.sdk.client.api;

import org.semux.sdk.client.ApiException;
import org.semux.sdk.client.ApiClient;
import org.semux.sdk.client.ApiResponse;
import org.semux.sdk.client.Configuration;
import org.semux.sdk.client.Pair;

import javax.ws.rs.core.GenericType;

import org.semux.sdk.client.model.ApiHandlerResponse;
import org.semux.sdk.client.model.GetDelegateResponse;
import org.semux.sdk.client.model.GetDelegatesResponse;
import org.semux.sdk.client.model.GetValidatorsResponse;
import org.semux.sdk.client.model.GetVoteResponse;
import org.semux.sdk.client.model.GetVotesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DelegateApi {
  private ApiClient apiClient;

  public DelegateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DelegateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get delegate info
   * Returns the information about delegate.
   * @param address Delegate address (required)
   * @return GetDelegateResponse
   * @throws ApiException if fails to make API call
   */
  public GetDelegateResponse getDelegate(String address) throws ApiException {
    return getDelegateWithHttpInfo(address).getData();
      }

  /**
   * Get delegate info
   * Returns the information about delegate.
   * @param address Delegate address (required)
   * @return ApiResponse&lt;GetDelegateResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDelegateResponse> getDelegateWithHttpInfo(String address) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling getDelegate");
    }
    
    // create path and map variables
    String localVarPath = "/delegate";

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

    GenericType<GetDelegateResponse> localVarReturnType = new GenericType<GetDelegateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all delegates
   * Returns a list of delegates.
   * @return GetDelegatesResponse
   * @throws ApiException if fails to make API call
   */
  public GetDelegatesResponse getDelegates() throws ApiException {
    return getDelegatesWithHttpInfo().getData();
      }

  /**
   * Get all delegates
   * Returns a list of delegates.
   * @return ApiResponse&lt;GetDelegatesResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDelegatesResponse> getDelegatesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/delegates";

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

    GenericType<GetDelegatesResponse> localVarReturnType = new GenericType<GetDelegatesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all validators
   * Returns a list of validators in Semux addresses.
   * @return GetValidatorsResponse
   * @throws ApiException if fails to make API call
   */
  public GetValidatorsResponse getValidators() throws ApiException {
    return getValidatorsWithHttpInfo().getData();
      }

  /**
   * Get all validators
   * Returns a list of validators in Semux addresses.
   * @return ApiResponse&lt;GetValidatorsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetValidatorsResponse> getValidatorsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/validators";

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

    GenericType<GetValidatorsResponse> localVarReturnType = new GenericType<GetValidatorsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the vote between a delegate and a voter
   * Returns the vote from a voter to a delegate.
   * @param delegate Delegate address (required)
   * @param voter Voter address (required)
   * @return GetVoteResponse
   * @throws ApiException if fails to make API call
   */
  public GetVoteResponse getVote(String delegate, String voter) throws ApiException {
    return getVoteWithHttpInfo(delegate, voter).getData();
      }

  /**
   * Get the vote between a delegate and a voter
   * Returns the vote from a voter to a delegate.
   * @param delegate Delegate address (required)
   * @param voter Voter address (required)
   * @return ApiResponse&lt;GetVoteResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetVoteResponse> getVoteWithHttpInfo(String delegate, String voter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'delegate' is set
    if (delegate == null) {
      throw new ApiException(400, "Missing the required parameter 'delegate' when calling getVote");
    }
    
    // verify the required parameter 'voter' is set
    if (voter == null) {
      throw new ApiException(400, "Missing the required parameter 'voter' when calling getVote");
    }
    
    // create path and map variables
    String localVarPath = "/vote";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delegate", delegate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "voter", voter));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetVoteResponse> localVarReturnType = new GenericType<GetVoteResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all votes of a delegate
   * Returns all the votes to a delegate as a map of [voter address] &#x3D;&gt; [votes]
   * @param delegate Delegate address (required)
   * @return GetVotesResponse
   * @throws ApiException if fails to make API call
   */
  public GetVotesResponse getVotes(String delegate) throws ApiException {
    return getVotesWithHttpInfo(delegate).getData();
      }

  /**
   * Get all votes of a delegate
   * Returns all the votes to a delegate as a map of [voter address] &#x3D;&gt; [votes]
   * @param delegate Delegate address (required)
   * @return ApiResponse&lt;GetVotesResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetVotesResponse> getVotesWithHttpInfo(String delegate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'delegate' is set
    if (delegate == null) {
      throw new ApiException(400, "Missing the required parameter 'delegate' when calling getVotes");
    }
    
    // create path and map variables
    String localVarPath = "/votes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delegate", delegate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GetVotesResponse> localVarReturnType = new GenericType<GetVotesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
