// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ext.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.service.ext.enums.GrantTypeEnum;

public class AuthenAccessTokenReqBody {

  @SerializedName("grant_type")
  private String grantType;
  @SerializedName("code")
  private String code;

  private AuthenAccessTokenReqBody(Builder builder) {
    setGrantType(builder.grantType);
    setCode(builder.code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getGrantType() {
    return this.grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public static final class Builder {

    private String grantType;
    private String code;

    private Builder() {
    }

    public Builder grantType(GrantTypeEnum grantType) {
      this.grantType = grantType.getValue();
      return this;
    }

    public Builder code(String code) {
      this.code = code;
      return this;
    }

    public AuthenAccessTokenReqBody build() {
      return new AuthenAccessTokenReqBody(this);
    }
  }
}
