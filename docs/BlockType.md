
# BlockType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **String** | The block hash |  [optional]
**number** | **String** | The block number |  [optional]
**view** | **Integer** | The view number. # of additional BFT rounds to generated this block |  [optional]
**coinbase** | **String** | The block producer&#39;s address |  [optional]
**parentHash** | **String** | The hash of the parent block |  [optional]
**timestamp** | **String** | Block timestamp in milliseconds specified by the block producer. |  [optional]
**transactionsRoot** | **String** | The Merkle root hash of the transactions |  [optional]
**resultsRoot** | **String** | The Merkle root hash of the results |  [optional]
**stateRoot** | **String** | The state root hash. Not enabled yet! |  [optional]
**data** | **String** | The extra data of this block |  [optional]
**transactions** | [**List&lt;TransactionType&gt;**](TransactionType.md) | A list of transaction in the block |  [optional]



