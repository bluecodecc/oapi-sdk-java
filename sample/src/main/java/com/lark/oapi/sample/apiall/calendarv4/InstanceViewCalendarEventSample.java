package com.lark.oapi.sample.apiall.calendarv4;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.calendar.v4.model.InstanceViewCalendarEventReq;
import com.lark.oapi.service.calendar.v4.model.InstanceViewCalendarEventResp;

// GET /open-apis/calendar/v4/calendars/:calendar_id/events/instance_view
public class InstanceViewCalendarEventSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        InstanceViewCalendarEventReq req = InstanceViewCalendarEventReq.newBuilder()
                .calendarId("feishu.cn_HF9U2MbibE8PPpjro6xjqa@group.calendar.feishu.cn")
                .startTime("1631777271")
                .endTime("1631777271")
                .userIdType("user_id")
                .build();

        // 发起请求
        InstanceViewCalendarEventResp resp = client.calendar().v4().calendarEvent().instanceView(req);

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