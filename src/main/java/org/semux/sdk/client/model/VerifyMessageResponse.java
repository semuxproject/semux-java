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
import org.semux.sdk.client.model.ApiHandlerResponse;

/**
 * VerifyMessageResponse
 */

public class VerifyMessageResponse extends ApiHandlerResponse {
  @JsonProperty("valid")
  private Boolean valid = null;

  public VerifyMessageResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Whether the signature is valid
   * @return valid
  **/
  @ApiModelProperty(value = "Whether the signature is valid")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyMessageResponse verifyMessageResponse = (VerifyMessageResponse) o;
    return Objects.equals(this.valid, verifyMessageResponse.valid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyMessageResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
