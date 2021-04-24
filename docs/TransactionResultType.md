# TransactionResultType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockNumber** | **String** | The number of block that included the transaction |  [optional]
**code** | **String** | The status of the transaction |  [optional]
**logs** | [**List&lt;LogInfoType&gt;**](LogInfoType.md) | Logs produced when executing this transaction |  [optional]
**returnData** | **String** | Return data encoded in hexadecimal string |  [optional]
**contractAddress** | **String** | Contract address if this is a CREATE transaction, or NULL |  [optional]
**gas** | **String** | The gas limit set by the sender |  [optional]
**gasPrice** | **String** | The gas Price set by the sender |  [optional]
**gasUsed** | **String** | The gas consumed. For non-VM transactions, this field is zero |  [optional]
**fee** | **String** | The transaction fee in nano SEM. For VM transactions, this field is zero |  [optional]
**internalTransactions** | [**List&lt;InternalTransactionType&gt;**](InternalTransactionType.md) | Internal transactions generated when executing this transaction |  [optional]
