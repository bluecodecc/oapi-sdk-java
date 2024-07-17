package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class InteractiveContent {
    private String type;
    private Data data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        @SerializedName("template_id")
        private String templateId;
        @SerializedName("template_variable")
        private TemplateVariable templateVariable;

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public TemplateVariable getTemplateVariable() {
            return templateVariable;
        }

        public void setTemplateVariable(TemplateVariable templateVariable) {
            this.templateVariable = templateVariable;
        }
    }
}
