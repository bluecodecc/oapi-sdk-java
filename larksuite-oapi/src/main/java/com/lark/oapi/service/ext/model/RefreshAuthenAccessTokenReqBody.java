// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ext.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.service.ext.enums.GrantTypeEnum;

public class RefreshAuthenAccessTokenReqBody {

  @SerializedName("grant_type")
  private String grantType;
  @SerializedName("refresh_token")
  private String refreshToken;

  private RefreshAuthenAccessTokenReqBody(Builder builder) {
    setGrantType(builder.grantType);
    setRefreshToken(builder.refreshToken);
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

  public String getRefreshToken() {
    return this.refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public static final class Builder {

    private String grantType;
    private String refreshToken;

    private Builder() {
    }

    public Builder grantType(GrantTypeEnum grantType) {
      this.grantType = grantType.getValue();
      return this;
    }

    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    public RefreshAuthenAccessTokenReqBody build() {
      return new RefreshAuthenAccessTokenReqBody(this);
    }
  }
}
