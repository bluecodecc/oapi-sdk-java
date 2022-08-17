// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.acs.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.acs.v1.model.GetAccessRecordAccessPhotoReq;
import com.lark.oapi.service.acs.v1.model.GetAccessRecordAccessPhotoResp;
import com.lark.oapi.service.acs.v1.model.GetUserFaceReq;
import com.lark.oapi.service.acs.v1.model.GetUserFaceResp;
import com.lark.oapi.service.acs.v1.model.GetUserReq;
import com.lark.oapi.service.acs.v1.model.GetUserResp;
import com.lark.oapi.service.acs.v1.model.ListAccessRecordReq;
import com.lark.oapi.service.acs.v1.model.ListAccessRecordResp;
import com.lark.oapi.service.acs.v1.model.ListDeviceResp;
import com.lark.oapi.service.acs.v1.model.ListUserReq;
import com.lark.oapi.service.acs.v1.model.ListUserResp;
import com.lark.oapi.service.acs.v1.model.P2AccessRecordCreatedV1;
import com.lark.oapi.service.acs.v1.model.P2UserUpdatedV1;
import com.lark.oapi.service.acs.v1.model.PatchUserReq;
import com.lark.oapi.service.acs.v1.model.PatchUserResp;
import com.lark.oapi.service.acs.v1.model.UpdateUserFaceReq;
import com.lark.oapi.service.acs.v1.model.UpdateUserFaceResp;
import java.io.ByteArrayOutputStream;

public class AcsService {

  private final AccessRecord accessRecord;
  private final AccessRecordAccessPhoto accessRecordAccessPhoto;
  private final Device device;
  private final User user;
  private final UserFace userFace;

  public AcsService(Config config) {
    this.accessRecord = new AccessRecord(config);
    this.accessRecordAccessPhoto = new AccessRecordAccessPhoto(config);
    this.device = new Device(config);
    this.user = new User(config);
    this.userFace = new UserFace(config);
  }

  public AccessRecord accessRecord() {
    return accessRecord;
  }

  public AccessRecordAccessPhoto accessRecordAccessPhoto() {
    return accessRecordAccessPhoto;
  }

  public Device device() {
    return device;
  }

  public User user() {
    return user;
  }

  public UserFace userFace() {
    return userFace;
  }

  public static class AccessRecord {

    private final Config config;

    public AccessRecord(Config config) {
      this.config = config;
    }

    public ListAccessRecordResp list(ListAccessRecordReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/access_records"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListAccessRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListAccessRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public ListAccessRecordResp list(ListAccessRecordReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/access_records"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListAccessRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListAccessRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class AccessRecordAccessPhoto {

    private final Config config;

    public AccessRecordAccessPhoto(Config config) {
      this.config = config;
    }

    public GetAccessRecordAccessPhotoResp get(GetAccessRecordAccessPhotoReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }
      reqOptions.setSupportDownLoad(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/access_records/:access_record_id/access_photo"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      if (httpResponse.getStatusCode() == 200) {
        GetAccessRecordAccessPhotoResp resp = new GetAccessRecordAccessPhotoResp();
        resp.setRawResponse(httpResponse);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(httpResponse.getBody());
        resp.setData(outputStream);
        resp.setFileName(httpResponse.getFileName());
        return resp;
      }
      // 反序列化
      GetAccessRecordAccessPhotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetAccessRecordAccessPhotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetAccessRecordAccessPhotoResp get(GetAccessRecordAccessPhotoReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();
      reqOptions.setSupportDownLoad(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/access_records/:access_record_id/access_photo"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 下载请求，返回流
      if (httpResponse.getStatusCode() == 200) {
        GetAccessRecordAccessPhotoResp resp = new GetAccessRecordAccessPhotoResp();
        resp.setRawResponse(httpResponse);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(httpResponse.getBody());
        resp.setData(outputStream);
        resp.setFileName(httpResponse.getFileName());
        return resp;
      }
      // 反序列化
      GetAccessRecordAccessPhotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetAccessRecordAccessPhotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class Device {

    private final Config config;

    public Device(Config config) {
      this.config = config;
    }

    public ListDeviceResp list(RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/devices"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , null);

      // 反序列化
      ListDeviceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListDeviceResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }

    public ListDeviceResp list() throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/devices"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , null);

      // 反序列化
      ListDeviceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListDeviceResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }
  }

  public static class User {

    private final Config config;

    public User(Config config) {
      this.config = config;
    }

    public GetUserResp get(GetUserReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/users/:user_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetUserResp get(GetUserReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/users/:user_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public ListUserResp list(ListUserReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/users"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListUserResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public ListUserResp list(ListUserReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/users"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListUserResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public PatchUserResp patch(PatchUserReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/acs/v1/users/:user_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchUserResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public PatchUserResp patch(PatchUserReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/acs/v1/users/:user_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      PatchUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchUserResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class UserFace {

    private final Config config;

    public UserFace(Config config) {
      this.config = config;
    }

    public GetUserFaceResp get(GetUserFaceReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }
      reqOptions.setSupportDownLoad(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/users/:user_id/face"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      if (httpResponse.getStatusCode() == 200) {
        GetUserFaceResp resp = new GetUserFaceResp();
        resp.setRawResponse(httpResponse);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(httpResponse.getBody());
        resp.setData(outputStream);
        resp.setFileName(httpResponse.getFileName());
        return resp;
      }
      // 反序列化
      GetUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserFaceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetUserFaceResp get(GetUserFaceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();
      reqOptions.setSupportDownLoad(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/acs/v1/users/:user_id/face"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 下载请求，返回流
      if (httpResponse.getStatusCode() == 200) {
        GetUserFaceResp resp = new GetUserFaceResp();
        resp.setRawResponse(httpResponse);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(httpResponse.getBody());
        resp.setData(outputStream);
        resp.setFileName(httpResponse.getFileName());
        return resp;
      }
      // 反序列化
      GetUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserFaceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public UpdateUserFaceResp update(UpdateUserFaceReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }
      reqOptions.setSupportUpload(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/acs/v1/users/:user_id/face"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      UpdateUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UpdateUserFaceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public UpdateUserFaceResp update(UpdateUserFaceReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();
      reqOptions.setSupportUpload(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/acs/v1/users/:user_id/face"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      UpdateUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UpdateUserFaceResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public abstract static class P2AccessRecordCreatedV1Handler implements
      IEventHandler<P2AccessRecordCreatedV1> {

    @Override
    public P2AccessRecordCreatedV1 getEvent() {
      return new P2AccessRecordCreatedV1();
    }
  }

  public abstract static class P2UserUpdatedV1Handler implements IEventHandler<P2UserUpdatedV1> {

    @Override
    public P2UserUpdatedV1 getEvent() {
      return new P2UserUpdatedV1();
    }
  }
}