package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.*;

import java.util.HashMap;

// POST /open-apis/drive/v1/permissions/:token/members/batch_create
public class BatchCreatePermissionMemberSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        BatchCreatePermissionMemberReq req = BatchCreatePermissionMemberReq.newBuilder()
                .token("doccnBKgoMyY5OMbUG6FioTXuBe")
                .type("doc")
                .needNotification(false)
                .batchCreatePermissionMemberReqBody(BatchCreatePermissionMemberReqBody.newBuilder()
                        .members(new BaseMember[]{})
                        .build())
                .build();

        // 发起请求
        BatchCreatePermissionMemberResp resp = client.drive().v1().permissionMember().batchCreate(req);

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
