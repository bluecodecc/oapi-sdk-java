package com.lark.oapi.sample.apiall.ailyv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.aily.v1.model.*;

import java.util.HashMap;

// POST /open-apis/aily/v1/sessions/:aily_session_id/messages
public class CreateAilySessionAilyMessageSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateAilySessionAilyMessageReq req = CreateAilySessionAilyMessageReq.newBuilder()
                .ailySessionId("session_4dfunz7sp1g8m")
                .createAilySessionAilyMessageReqBody(CreateAilySessionAilyMessageReqBody.newBuilder()
                        .idempotentId("idempotent_id_1")
                        .contentType("MDX")
                        .content("你好")
                        .fileIds(new String[]{})
                        .quoteMessageId("message_4de9bpg70qskh")
                        .mentions(new AilyMention[]{})
                        .build())
                .build();

        // 发起请求
        CreateAilySessionAilyMessageResp resp = client.aily().v1().ailySessionAilyMessage().create(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}