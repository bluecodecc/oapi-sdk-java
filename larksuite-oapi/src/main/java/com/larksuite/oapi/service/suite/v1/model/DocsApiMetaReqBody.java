// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.suite.v1.model;
import com.google.gson.annotations.SerializedName;

public class DocsApiMetaReqBody {
    @SerializedName("request_docs")
    private RequestDoc[] requestDocs;

    public RequestDoc[] getRequestDocs() {
        return this.requestDocs;
    }

    public void setRequestDocs(RequestDoc[] requestDocs) {
        this.requestDocs = requestDocs;
    }

}
