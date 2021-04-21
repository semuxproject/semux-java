/*
 * Semux API
 * Semux is an experimental high-performance blockchain platform that powers decentralized application.
 *
 * OpenAPI spec version: 2.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.semux.sdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.semux.sdk.client.model.InternalTransactionType;
import org.semux.sdk.client.model.LogInfoType;

/**
 * TransactionResultType
 */

public class TransactionResultType {
  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("logs")
  private List<LogInfoType> logs = null;

  @JsonProperty("returnData")
  private String returnData = null;

  @JsonProperty("contractAddress")
  private String contractAddress = null;

  @JsonProperty("gas")
  private String gas = null;

  @JsonProperty("gasPrice")
  private String gasPrice = null;

  @JsonProperty("gasUsed")
  private String gasUsed = null;

  @JsonProperty("fee")
  private String fee = null;

  @JsonProperty("internalTransactions")
  private List<InternalTransactionType> internalTransactions = null;

  public TransactionResultType blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * The number of block that included the transaction
   * @return blockNumber
  **/
  @ApiModelProperty(value = "The number of block that included the transaction")
  public String getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }

  public TransactionResultType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The status of the transaction
   * @return code
  **/
  @ApiModelProperty(value = "The status of the transaction")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TransactionResultType logs(List<LogInfoType> logs) {
    this.logs = logs;
    return this;
  }

  public TransactionResultType addLogsItem(LogInfoType logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<LogInfoType>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Logs produced when executing this transaction
   * @return logs
  **/
  @ApiModelProperty(value = "Logs produced when executing this transaction")
  public List<LogInfoType> getLogs() {
    return logs;
  }

  public void setLogs(List<LogInfoType> logs) {
    this.logs = logs;
  }

  public TransactionResultType returnData(String returnData) {
    this.returnData = returnData;
    return this;
  }

   /**
   * Return data encoded in hexadecimal string
   * @return returnData
  **/
  @ApiModelProperty(value = "Return data encoded in hexadecimal string")
  public String getReturnData() {
    return returnData;
  }

  public void setReturnData(String returnData) {
    this.returnData = returnData;
  }

  public TransactionResultType contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Contract address if this is a CREATE transaction, or NULL
   * @return contractAddress
  **/
  @ApiModelProperty(value = "Contract address if this is a CREATE transaction, or NULL")
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public TransactionResultType gas(String gas) {
    this.gas = gas;
    return this;
  }

   /**
   * The gas limit set by the sender
   * @return gas
  **/
  @ApiModelProperty(value = "The gas limit set by the sender")
  public String getGas() {
    return gas;
  }

  public void setGas(String gas) {
    this.gas = gas;
  }

  public TransactionResultType gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * The gas Price set by the sender
   * @return gasPrice
  **/
  @ApiModelProperty(value = "The gas Price set by the sender")
  public String getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }

  public TransactionResultType gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * The gas consumed. For non-VM transactions, this field is zero
   * @return gasUsed
  **/
  @ApiModelProperty(value = "The gas consumed. For non-VM transactions, this field is zero")
  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public TransactionResultType fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * The transaction fee in nano SEM. For VM transactions, this field is zero
   * @return fee
  **/
  @ApiModelProperty(value = "The transaction fee in nano SEM. For VM transactions, this field is zero")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public TransactionResultType internalTransactions(List<InternalTransactionType> internalTransactions) {
    this.internalTransactions = internalTransactions;
    return this;
  }

  public TransactionResultType addInternalTransactionsItem(InternalTransactionType internalTransactionsItem) {
    if (this.internalTransactions == null) {
      this.internalTransactions = new ArrayList<InternalTransactionType>();
    }
    this.internalTransactions.add(internalTransactionsItem);
    return this;
  }

   /**
   * Internal transactions generated when executing this transaction
   * @return internalTransactions
  **/
  @ApiModelProperty(value = "Internal transactions generated when executing this transaction")
  public List<InternalTransactionType> getInternalTransactions() {
    return internalTransactions;
  }

  public void setInternalTransactions(List<InternalTransactionType> internalTransactions) {
    this.internalTransactions = internalTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResultType transactionResultType = (TransactionResultType) o;
    return Objects.equals(this.blockNumber, transactionResultType.blockNumber) &&
        Objects.equals(this.code, transactionResultType.code) &&
        Objects.equals(this.logs, transactionResultType.logs) &&
        Objects.equals(this.returnData, transactionResultType.returnData) &&
        Objects.equals(this.contractAddress, transactionResultType.contractAddress) &&
        Objects.equals(this.gas, transactionResultType.gas) &&
        Objects.equals(this.gasPrice, transactionResultType.gasPrice) &&
        Objects.equals(this.gasUsed, transactionResultType.gasUsed) &&
        Objects.equals(this.fee, transactionResultType.fee) &&
        Objects.equals(this.internalTransactions, transactionResultType.internalTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, code, logs, returnData, contractAddress, gas, gasPrice, gasUsed, fee, internalTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResultType {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    returnData: ").append(toIndentedString(returnData)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    internalTransactions: ").append(toIndentedString(internalTransactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
