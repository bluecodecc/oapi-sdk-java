package com.lark.oapi.sample.apiall.taskv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.task.v2.model.Member;
import com.lark.oapi.service.task.v2.model.RemoveMembersTaskReq;
import com.lark.oapi.service.task.v2.model.RemoveMembersTaskReqBody;
import com.lark.oapi.service.task.v2.model.RemoveMembersTaskResp;

// POST /open-apis/task/v2/tasks/:task_guid/remove_members
public class RemoveMembersTaskSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        RemoveMembersTaskReq req = RemoveMembersTaskReq.newBuilder()
                .taskGuid("d300a75f-c56a-4be9-80d1-e47653028ceb")
                .userIdType("open_id")
                .removeMembersTaskReqBody(RemoveMembersTaskReqBody.newBuilder()
                        .members(new Member[]{})
                        .build())
                .build();

        // 发起请求
        RemoveMembersTaskResp resp = client.task().v2().task().removeMembers(req);

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