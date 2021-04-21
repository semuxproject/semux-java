
# InfoType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network** | [**NetworkEnum**](#NetworkEnum) | The connected network |  [optional]
**capabilities** | **List&lt;String&gt;** | The features supported |  [optional]
**clientId** | **String** | The client identifier string |  [optional]
**coinbase** | **String** | The address used for establishing connections to the network |  [optional]
**latestBlockNumber** | **String** | The number of the last block |  [optional]
**latestBlockHash** | **String** | The hash of the last block |  [optional]
**activePeers** | **Integer** | The number of actively connected peers |  [optional]
**pendingTransactions** | **Integer** | The number of transactions in pending pool |  [optional]


<a name="NetworkEnum"></a>
## Enum: NetworkEnum
Name | Value
---- | -----
MAINNET | &quot;MAINNET&quot;
TESTNET | &quot;TESTNET&quot;
DEVNET | &quot;DEVNET&quot;



