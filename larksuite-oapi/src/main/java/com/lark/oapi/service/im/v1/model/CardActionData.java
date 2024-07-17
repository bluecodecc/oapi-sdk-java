package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CardActionData {
    @SerializedName("operator")
    private Operator operator;
    private String token;
    private Action action;
    private String host;
    private Context context;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public static class Operator {
        @SerializedName("tenant_key")
        public String tenantKey;
        @SerializedName("user_id")
        public String userId;
        @SerializedName("open_id")
        public String openId;
        @SerializedName("union_id")
        public String unionId;

        public String getTenantKey() {
            return tenantKey;
        }

        public void setTenantKey(String tenantKey) {
            this.tenantKey = tenantKey;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getUnionId() {
            return unionId;
        }

        public void setUnionId(String unionId) {
            this.unionId = unionId;
        }
    }

    public static class Action {
        //        private Map<String, String> value;
        private String value;
        private String tag;
        private String timezone;
        @SerializedName("form_value")
        private Map<String, String> formValue;
        private String name;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Map<String, String> getFormValue() {
            return formValue;
        }

        public void setFormValue(Map<String, String> formValue) {
            this.formValue = formValue;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Context {
        @SerializedName("open_message_id")
        private String openMessageId;
        @SerializedName("open_chat_id")
        private String openChatId;

        public String getOpenMessageId() {
            return openMessageId;
        }

        public void setOpenMessageId(String openMessageId) {
            this.openMessageId = openMessageId;
        }

        public String getOpenChatId() {
            return openChatId;
        }

        public void setOpenChatId(String openChatId) {
            this.openChatId = openChatId;
        }
    }
}
