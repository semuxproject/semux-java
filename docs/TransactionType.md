# TransactionType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **String** | The transaction hash |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The transaction type |  [optional]
**from** | **String** | Sender&#x27;s address |  [optional]
**to** | **String** | Recipient&#x27;s address |  [optional]
**value** | **String** | Transaction value in nano SEM |  [optional]
**fee** | **String** | Transaction fee in nano SEM. For CREATE/CALL, this field is zero; use gas instead |  [optional]
**nonce** | **String** | The nonce of the sender |  [optional]
**timestamp** | **String** | Transaction timestamp in milliseconds specified by the sender. There can be a time drift up to 2 hours. |  [optional]
**data** | **String** | Transaction data encoded in hexadecimal string |  [optional]
**gas** | **String** | The gas limit set by the sender |  [optional]
**gasPrice** | **String** | The gas Price set by the sender |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COINBASE | &quot;COINBASE&quot;
TRANSFER | &quot;TRANSFER&quot;
DELEGATE | &quot;DELEGATE&quot;
VOTE | &quot;VOTE&quot;
UNVOTE | &quot;UNVOTE&quot;
CREATE | &quot;CREATE&quot;
CALL | &quot;CALL&quot;
