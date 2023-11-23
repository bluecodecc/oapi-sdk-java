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

package com.lark.oapi.service.approval.v4.resource;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.approval.v4.model.CreateExternalApprovalReq;
import com.lark.oapi.service.approval.v4.model.CreateExternalApprovalResp;
import com.lark.oapi.service.approval.v4.model.GetExternalApprovalReq;
import com.lark.oapi.service.approval.v4.model.GetExternalApprovalResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class ExternalApproval {
    private static final Logger log = LoggerFactory.getLogger(ExternalApproval.class);
    private final Config config;

    public ExternalApproval(Config config) {
        this.config = config;
    }


    /**
     * 三方审批定义创建，审批定义是审批的描述，包括审批名称、图标、描述等基础信息。创建好审批定义，用户就可以在审批应用的发起页中看到审批，如果用户点击发起，则会跳转到配置的发起三方系统地址去发起审批。;;另外，审批定义还配置了审批操作时的回调地址：审批人在待审批列表中进行【同意】【拒绝】操作时，审批中心会调用回调地址通知三方系统。
     * <p> 注意，审批中心不负责审批流程的流转，只负责展示、操作、消息通知。因此审批定义创建时没有审批流程的信息。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/approval-v4/external_approval/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/approval-v4/external_approval/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/CreateExternalApprovalSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/CreateExternalApprovalSample.java</a> ;
     */
    public CreateExternalApprovalResp create(CreateExternalApprovalReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/approval/v4/external_approvals"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateExternalApprovalResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateExternalApprovalResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/approval/v4/external_approvals"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 三方审批定义创建，审批定义是审批的描述，包括审批名称、图标、描述等基础信息。创建好审批定义，用户就可以在审批应用的发起页中看到审批，如果用户点击发起，则会跳转到配置的发起三方系统地址去发起审批。;;另外，审批定义还配置了审批操作时的回调地址：审批人在待审批列表中进行【同意】【拒绝】操作时，审批中心会调用回调地址通知三方系统。
     * <p> 注意，审批中心不负责审批流程的流转，只负责展示、操作、消息通知。因此审批定义创建时没有审批流程的信息。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/approval-v4/external_approval/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/approval-v4/external_approval/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/CreateExternalApprovalSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/CreateExternalApprovalSample.java</a> ;
     */
    public CreateExternalApprovalResp create(CreateExternalApprovalReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/approval/v4/external_approvals"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateExternalApprovalResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateExternalApprovalResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/approval/v4/external_approvals"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=approval&resource=external_approval&version=v4">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=approval&resource=external_approval&version=v4</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/GetExternalApprovalSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/GetExternalApprovalSample.java</a> ;
     */
    public GetExternalApprovalResp get(GetExternalApprovalReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/approval/v4/external_approvals/:approval_code"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetExternalApprovalResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetExternalApprovalResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/approval/v4/external_approvals/:approval_code"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=approval&resource=external_approval&version=v4">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=approval&resource=external_approval&version=v4</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/GetExternalApprovalSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/approvalv4/GetExternalApprovalSample.java</a> ;
     */
    public GetExternalApprovalResp get(GetExternalApprovalReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/approval/v4/external_approvals/:approval_code"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetExternalApprovalResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetExternalApprovalResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/approval/v4/external_approvals/:approval_code"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
