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

package com.lark.oapi.service.docx.v1.resource;

import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.request.RequestOptions;

import java.io.ByteArrayOutputStream;

import com.lark.oapi.service.docx.v1.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DocumentBlockChildren {
    private static final Logger log = LoggerFactory.getLogger(DocumentBlockChildren.class);
    private final Config config;

    public DocumentBlockChildren(Config config) {
        this.config = config;
    }


    /**
     * 删除块，指定需要操作的块，删除其指定范围的子块。如果操作成功，接口将返回应用删除操作后的文档版本号。
     * <p> 在调用此接口前，请仔细阅读[新版文档 OpenAPI 接口校验规则](https://bytedance.feishu.cn/docx/doxcnby5Y0yoACL3PdfZqrJEm6f#doxcngCsscGk0WacO258mYDgM6b)，了解相关规则及约束。 ;
     * <p> 频率限制：单个应用调用频率上限为每秒 3 次。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/batch_delete">https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/batch_delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/BatchDeleteDocumentBlockChildrenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/BatchDeleteDocumentBlockChildrenSample.java</a> ;
     */
    public BatchDeleteDocumentBlockChildrenResp batchDelete(BatchDeleteDocumentBlockChildrenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children/batch_delete"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        BatchDeleteDocumentBlockChildrenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteDocumentBlockChildrenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children/batch_delete"
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
     * 删除块，指定需要操作的块，删除其指定范围的子块。如果操作成功，接口将返回应用删除操作后的文档版本号。
     * <p> 在调用此接口前，请仔细阅读[新版文档 OpenAPI 接口校验规则](https://bytedance.feishu.cn/docx/doxcnby5Y0yoACL3PdfZqrJEm6f#doxcngCsscGk0WacO258mYDgM6b)，了解相关规则及约束。 ;
     * <p> 频率限制：单个应用调用频率上限为每秒 3 次。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/batch_delete">https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/batch_delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/BatchDeleteDocumentBlockChildrenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/BatchDeleteDocumentBlockChildrenSample.java</a> ;
     */
    public BatchDeleteDocumentBlockChildrenResp batchDelete(BatchDeleteDocumentBlockChildrenReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children/batch_delete"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        BatchDeleteDocumentBlockChildrenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteDocumentBlockChildrenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children/batch_delete"
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
     * 创建块，指定需要操作的块，为其创建一批子块，并插入到指定位置。如果操作成功，接口将返回新创建子块的富文本内容。
     * <p> 在调用此接口前，请仔细阅读[新版文档 OpenAPI 接口校验规则](https://bytedance.feishu.cn/docx/doxcnby5Y0yoACL3PdfZqrJEm6f#doxcnm0ooUe0s20GwwVB3a05rtb)，了解相关规则及约束。 ;
     * <p> 频率限制：单个应用调用频率上限为每秒 3 次。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/create">https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/CreateDocumentBlockChildrenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/CreateDocumentBlockChildrenSample.java</a> ;
     */
    public CreateDocumentBlockChildrenResp create(CreateDocumentBlockChildrenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateDocumentBlockChildrenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateDocumentBlockChildrenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
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
     * 创建块，指定需要操作的块，为其创建一批子块，并插入到指定位置。如果操作成功，接口将返回新创建子块的富文本内容。
     * <p> 在调用此接口前，请仔细阅读[新版文档 OpenAPI 接口校验规则](https://bytedance.feishu.cn/docx/doxcnby5Y0yoACL3PdfZqrJEm6f#doxcnm0ooUe0s20GwwVB3a05rtb)，了解相关规则及约束。 ;
     * <p> 频率限制：单个应用调用频率上限为每秒 3 次。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/create">https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/CreateDocumentBlockChildrenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/CreateDocumentBlockChildrenSample.java</a> ;
     */
    public CreateDocumentBlockChildrenResp create(CreateDocumentBlockChildrenReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateDocumentBlockChildrenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateDocumentBlockChildrenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
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
     * 获取所有子块，给定一个指定版本的文档，并指定需要操作的块，分页遍历其所有子块富文本内容 。如果不指定版本，则会默认查询最新版本。
     * <p> 在调用此接口前，请仔细阅读[新版文档 OpenAPI 接口校验规则](https://bytedance.feishu.cn/docx/doxcnby5Y0yoACL3PdfZqrJEm6f#doxcnE2UK2yY0gEGK8nBMPtB0vd)，了解相关规则及约束。 ;
     * <p> 频率限制：单个应用调用频率上限为每秒 5 次。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/get">https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/GetDocumentBlockChildrenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/GetDocumentBlockChildrenSample.java</a> ;
     */
    public GetDocumentBlockChildrenResp get(GetDocumentBlockChildrenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        GetDocumentBlockChildrenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetDocumentBlockChildrenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
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
     * 获取所有子块，给定一个指定版本的文档，并指定需要操作的块，分页遍历其所有子块富文本内容 。如果不指定版本，则会默认查询最新版本。
     * <p> 在调用此接口前，请仔细阅读[新版文档 OpenAPI 接口校验规则](https://bytedance.feishu.cn/docx/doxcnby5Y0yoACL3PdfZqrJEm6f#doxcnE2UK2yY0gEGK8nBMPtB0vd)，了解相关规则及约束。 ;
     * <p> 频率限制：单个应用调用频率上限为每秒 5 次。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/get">https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/document-docx/docx-v1/document-block-children/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/GetDocumentBlockChildrenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/docxv1/GetDocumentBlockChildrenSample.java</a> ;
     */
    public GetDocumentBlockChildrenResp get(GetDocumentBlockChildrenReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        GetDocumentBlockChildrenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetDocumentBlockChildrenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children"
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
